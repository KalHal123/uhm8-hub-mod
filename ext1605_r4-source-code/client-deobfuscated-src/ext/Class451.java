package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class Class451 extends Class471 {
   public int field_1266;
   public int field_493;
   public int field_978;
   public int field_367;
   public int field_3051;
   public int field_961;
   public byte[] field_2608;
   private int field_1631;

   public Class451() {
      this.field_2211 = true;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1266 = var1.readInt();
      this.field_493 = var1.readShort();
      this.field_978 = var1.readInt();
      this.field_367 = var1.read() + 1;
      this.field_3051 = var1.read() + 1;
      this.field_961 = var1.read() + 1;
      int var2 = var1.readInt();
      byte[] var3 = new byte[var2];
      var1.readFully(var3);
      this.field_2608 = new byte[this.field_367 * this.field_3051 * this.field_961 * 5 / 2];
      Inflater var4 = new Inflater();
      var4.setInput(var3);

      try {
         var4.inflate(this.field_2608);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1266);
      var1.writeShort(this.field_493);
      var1.writeInt(this.field_978);
      var1.write(this.field_367 - 1);
      var1.write(this.field_3051 - 1);
      var1.write(this.field_961 - 1);
      var1.writeInt(this.field_1631);
      var1.write(this.field_2608, 0, this.field_1631);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_748(this);
   }

   @Override
   public int method_1597() {
      return 17 + this.field_1631;
   }
}
