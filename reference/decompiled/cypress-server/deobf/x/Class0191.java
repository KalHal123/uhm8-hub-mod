package x;

import java.io.IOException;
import java.io.InputStream;

class Class0191 extends InputStream {
   private final InputStream 48X0bLiz2A3gvJqy7zfc89S3stL8th95kV0AsocRh94G9x5zPkKH17tlevE1;
   private final boolean 200EMuS8354526y1HDR1b8P2t69n2jUomHP27CCzNeZS4Rb217uBIIf6AYL2;
   private final int[] 2f4qaASlM7133rULOIv9xj25pp9jg8AtF5qJ1f2YBhBju8vbLMeh1B5883n6;
   private int 9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 = 0;
   private int 6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d = 18;
   private int 5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l = -8;
   private boolean 2PO1MIhHayAVLs96EtBm42f80P2PhU3mX683HIa7566A18IBJ0n8z0e9Lih4 = false;
   private boolean 1g143X7w893Hj79ToPLJXZjhb44uLxQl3f9LUYg6crVd54bp1x8W4A335tBH = false;
   private byte[] 8zA7CqkcBKLIv7uR8wbMy28zHDCVg4OpdWU68BUx7ML29Z19C50WAJ26bjU1 = new byte[1];

   Class0191(InputStream var1, int[] var2, boolean var3) {
      this.48X0bLiz2A3gvJqy7zfc89S3stL8th95kV0AsocRh94G9x5zPkKH17tlevE1 = var1;
      this.2f4qaASlM7133rULOIv9xj25pp9jg8AtF5qJ1f2YBhBju8vbLMeh1B5883n6 = var2;
      this.200EMuS8354526y1HDR1b8P2t69n2jUomHP27CCzNeZS4Rb217uBIIf6AYL2 = var3;
   }

   @Override
   public int read() throws IOException {
      return this.read(this.8zA7CqkcBKLIv7uR8wbMy28zHDCVg4OpdWU68BUx7ML29Z19C50WAJ26bjU1, 0, 1) == -1
         ? -1
         : this.8zA7CqkcBKLIv7uR8wbMy28zHDCVg4OpdWU68BUx7ML29Z19C50WAJ26bjU1[0] & 0xFF;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      if (this.1g143X7w893Hj79ToPLJXZjhb44uLxQl3f9LUYg6crVd54bp1x8W4A335tBH) {
         throw new IOException("Stream is closed");
      }

      if (this.2PO1MIhHayAVLs96EtBm42f80P2PhU3mX683HIa7566A18IBJ0n8z0e9Lih4 && this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l < 0) {
         return -1;
      }

      if (var2 >= 0 && var3 >= 0 && var3 <= var1.length - var2) {
         int var4 = var2;
         if (this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l >= 0) {
            do {
               if (var3 == 0) {
                  return var2 - var4;
               }

               var1[var2++] = (byte)(
                  this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 >> this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l
               );
               var3--;
               this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l -= 8;
            } while (this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l >= 0);

            this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 = 0;
         }

         while (var3 > 0) {
            int var5 = this.48X0bLiz2A3gvJqy7zfc89S3stL8th95kV0AsocRh94G9x5zPkKH17tlevE1.read();
            if (var5 == -1) {
               this.2PO1MIhHayAVLs96EtBm42f80P2PhU3mX683HIa7566A18IBJ0n8z0e9Lih4 = true;
               if (this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d != 18) {
                  if (this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d == 12) {
                     throw new IOException("Base64 stream has one un-decoded dangling byte.");
                  }

                  var1[var2++] = (byte)(this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 >> 16);
                  var3--;
                  if (this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d == 0) {
                     if (var3 == 0) {
                        this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 >>= 8;
                        this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l = 0;
                     } else {
                        var1[var2++] = (byte)(this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 >> 8);
                     }
                  }
               }

               if (var2 == var4) {
                  return -1;
               }

               return var2 - var4;
            }

            if (var5 == 61) {
               if (this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d == 18
                  || this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d == 12
                  || this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d == 6
                     && this.48X0bLiz2A3gvJqy7zfc89S3stL8th95kV0AsocRh94G9x5zPkKH17tlevE1.read() != 61) {
                  throw new IOException("Illegal base64 ending sequence:" + this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d);
               }

               var1[var2++] = (byte)(this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 >> 16);
               var3--;
               if (this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d == 0) {
                  if (var3 == 0) {
                     this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 >>= 8;
                     this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l = 0;
                  } else {
                     var1[var2++] = (byte)(this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 >> 8);
                  }
               }

               this.2PO1MIhHayAVLs96EtBm42f80P2PhU3mX683HIa7566A18IBJ0n8z0e9Lih4 = true;
               break;
            }

            if ((var5 = this.2f4qaASlM7133rULOIv9xj25pp9jg8AtF5qJ1f2YBhBju8vbLMeh1B5883n6[var5]) == -1) {
               if (!this.200EMuS8354526y1HDR1b8P2t69n2jUomHP27CCzNeZS4Rb217uBIIf6AYL2) {
                  throw new IOException("Illegal base64 character " + Integer.toString(var5, 16));
               }
            } else {
               this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 = this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8
                  | var5 << this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d;
               if (this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d != 0) {
                  this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d -= 6;
               } else {
                  this.6zxhefJ3l1okEnsB50J8fWGni9ZWIK794awru2sct23D3HG5DV6b5pM95m3d = 18;
                  this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l = 16;

                  while (this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l >= 0) {
                     var1[var2++] = (byte)(
                        this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 >> this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l
                     );
                     var3--;
                     this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l -= 8;
                     if (var3 == 0 && this.5FL52a3vk1nz9vnG26zGRQVP787ykyiqr8KyfKKgkcTVG6au8oU5CV9bXb1l >= 0) {
                        return var2 - var4;
                     }
                  }

                  this.9h0LRd5H6C2LWLyreb90j8VQhI82lR6Jg5MDgyGt19S5hmSF4U0USD2Y4ql8 = 0;
               }
            }
         }

         return var2 - var4;
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   @Override
   public int available() throws IOException {
      if (this.1g143X7w893Hj79ToPLJXZjhb44uLxQl3f9LUYg6crVd54bp1x8W4A335tBH) {
         throw new IOException("Stream is closed");
      } else {
         return this.48X0bLiz2A3gvJqy7zfc89S3stL8th95kV0AsocRh94G9x5zPkKH17tlevE1.available();
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.1g143X7w893Hj79ToPLJXZjhb44uLxQl3f9LUYg6crVd54bp1x8W4A335tBH) {
         this.1g143X7w893Hj79ToPLJXZjhb44uLxQl3f9LUYg6crVd54bp1x8W4A335tBH = true;
         this.48X0bLiz2A3gvJqy7zfc89S3stL8th95kV0AsocRh94G9x5zPkKH17tlevE1.close();
      }
   }
}
