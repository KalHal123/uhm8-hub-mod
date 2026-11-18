import struct
import sys
import zipfile

def modify_class_constant_pool(class_bytes, old_str, new_str):
    old_utf8 = old_str.encode('utf-8')
    new_utf8 = new_str.encode('utf-8')
    
    if class_bytes[:4] != b'\xca\xfe\xba\xbe':
        return class_bytes, False

    cp_count = struct.unpack('>H', class_bytes[8:10])[0]
    pos = 10
    out = bytearray(class_bytes[:10])
    modified = False
    idx = 1

    while idx < cp_count:
        tag = class_bytes[pos]
        out.append(tag)
        pos += 1

        if tag == 1:  # CONSTANT_Utf8
            length = struct.unpack('>H', class_bytes[pos:pos+2])[0]
            pos += 2
            raw_bytes = class_bytes[pos:pos+length]
            pos += length

            if old_utf8 in raw_bytes:
                raw_bytes = raw_bytes.replace(old_utf8, new_utf8)
                modified = True

            out.extend(struct.pack('>H', len(raw_bytes)))
            out.extend(raw_bytes)
        elif tag in (7, 8, 16, 19, 20):
            out.extend(class_bytes[pos:pos+2])
            pos += 2
        elif tag in (3, 4, 9, 10, 11, 12, 17, 18):
            out.extend(class_bytes[pos:pos+4])
            pos += 4
        elif tag in (5, 6):
            out.extend(class_bytes[pos:pos+8])
            pos += 8
            idx += 1
        elif tag == 15:
            out.extend(class_bytes[pos:pos+3])
            pos += 3
        else:
            return class_bytes, False
        idx += 1

    out.extend(class_bytes[pos:])
    return bytes(out), modified

def patch_jar(input_jar, output_jar, old_str, new_str):
    count = 0
    with zipfile.ZipFile(input_jar, 'r') as zin, zipfile.ZipFile(output_jar, 'w') as zout:
        for item in zin.infolist():
            data = zin.read(item.filename)
            if item.filename.endswith('.class'):
                new_data, changed = modify_class_constant_pool(data, old_str, new_str)
                if changed:
                    print(f"[+] Patched constant pool in: {item.filename}")
                    count += 1
                zout.writestr(item, new_data)
            else:
                zout.writestr(item, data)
    print(f"Done. Successfully patched {count} class(es) -> {output_jar}")

if __name__ == "__main__":
    # Replace these with your actual old string and new string
    OLD = "Minecraft Alpha v1.0.16.05_20 Cypress"
    NEW = "Minecraft Alpha v1.0.16.05_20 Cypress + uhm8-hub-mod v20261118.1"
    patch_jar("ext1605_20_client_hubfix.jar", "ext1605_20_client_hubfix_patched.jar", OLD, NEW)
