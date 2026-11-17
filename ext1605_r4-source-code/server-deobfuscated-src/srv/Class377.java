package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

public class Class377 extends Class318 {
   public String field_1087;
   public int field_1203;
   private byte[] field_162;

   public Class377() {
   }

   public Class377(String var1, int var2) {
      this.field_1087 = var1;
      this.field_1203 = var2;
      this.field_162 = Class115.field_1584.method_492(this.field_1087);
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      if (this.field_162 == null) {
         var1.writeInt(-1);
      } else {
         byte[] var2 = new byte[1024];
         int var3 = this.field_1203 * 1024;
         int var4 = 1024;
         if (var3 + 1024 > this.field_162.length) {
            var4 = this.field_162.length - var3;
         }

         System.arraycopy(this.field_162, this.field_1203 * 1024, var2, 0, var4);
         CRC32 var5 = new CRC32();
         var5.update(var2, 0, 1024);
         var1.writeInt(this.field_162.length);
         var1.writeUTF(this.field_1087);
         var1.writeInt(this.field_1203);
         var1.writeInt((int)var5.getValue());
         var1.write(var2);
      }
   }

   @Override
   public void method_1020(Class191 var1) {
   }

   @Override
   public int method_116() {
      return this.field_162 == null ? 4 : 8 + this.field_1087.length() + this.field_162.length;
   }
}
