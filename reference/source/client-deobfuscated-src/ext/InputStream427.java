package ext;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class InputStream427 extends InputStream {
   private int field_344;
   private InputStream field_773;
   byte[] field_833;
   final CodecJOrbis587 field_1139;

   public InputStream427(CodecJOrbis587 var1, URL var2, InputStream var3) {
      this.field_1139 = var1;
      this.field_833 = new byte[1];
      this.field_773 = var3;
      String var4 = var2.getPath();
      var4 = var4.substring(var4.lastIndexOf("/") + 1);
      this.field_344 = var4.hashCode();
   }

   @Override
   public int read() throws IOException {
      int var1 = this.read(this.field_833, 0, 1);
      return var1 < 0 ? var1 : this.field_833[0];
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      var3 = this.field_773.read(var1, var2, var3);

      for (int var4 = 0; var4 < var3; var4++) {
         byte var5 = var1[var2 + var4] = (byte)(var1[var2 + var4] ^ this.field_344 >> 8);
         this.field_344 = this.field_344 * 498729871 + 85731 * var5;
      }

      return var3;
   }
}
