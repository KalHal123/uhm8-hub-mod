package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class397 extends Class519 {
   public int field_1093;
   public String field_1087;
   public String field_1336;
   public String field_1212 = "";
   public int field_1948 = 0;
   public boolean field_1709 = false;

   public Class397() {
   }

   public Class397(String var1, String var2, int var3, int var4) {
      this.field_1087 = var1;
      this.field_1336 = var2;
      this.field_1093 = var3;
      this.field_1948 = var4;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      long var2 = var1.readLong();
      this.field_1087 = var1.readUTF();
      this.field_1336 = var1.readUTF();
      this.field_1093 = var1.readInt();
      this.field_1948 = var1.readInt();

      try {
         this.field_1709 = Class278.method_1741(
            var1.readUTF(), var2 + "" + this.field_1087 + "" + this.field_1336 + "" + this.field_1093 + "" + this.field_1948
         );
      } catch (Exception var5) {
      }
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      long var2 = System.currentTimeMillis();
      var1.writeLong(var2);
      var1.writeUTF(this.field_1087);
      var1.writeUTF(this.field_1336);
      var1.writeInt(this.field_1093);
      var1.writeInt(this.field_1948);

      try {
         var1.writeUTF(
            Class278.method_1644(var2 + "" + this.field_1087 + "" + this.field_1336 + "" + this.field_1093 + "" + this.field_1948, Class278.field_1860)
         );
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1112(this);
   }

   @Override
   public int method_1597() {
      return 8 + this.field_1087.length() + this.field_1336.length() + 4 + 4;
   }
}
