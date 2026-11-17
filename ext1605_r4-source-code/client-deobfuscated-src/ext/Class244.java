package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class244 extends Class471 {
   public int field_2671;
   public Class334[] field_3145;

   public Class244() {
   }

   public Class244(int var1, Class334[] var2) {
      this.field_2671 = var1;
      this.field_3145 = new Class334[var2.length];

      for (int var3 = 0; var3 < this.field_3145.length; var3++) {
         this.field_3145[var3] = var2[var3] == null ? null : var2[var3].method_376();
      }
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_2671 = var1.readInt();
      short var2 = var1.readShort();
      this.field_3145 = new Class334[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.readInt();
         if (var4 >= 0) {
            byte var5 = var1.readByte();
            short var6 = var1.readShort();
            this.field_3145[var3] = new Class334(var4, var5, var6);
         }
      }
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_2671);
      var1.writeShort(this.field_3145.length);

      for (int var2 = 0; var2 < this.field_3145.length; var2++) {
         if (this.field_3145[var2] == null) {
            var1.writeInt(-1);
         } else {
            var1.writeInt(this.field_3145[var2].field_1782);
            var1.writeByte((byte)this.field_3145[var2].field_2326);
            var1.writeShort((short)this.field_3145[var2].field_1862);
         }
      }
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_270(this);
   }

   @Override
   public int method_1597() {
      return 6 + this.field_3145.length * 7;
   }
}
