package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class499 extends Class238 {
   public boolean field_881 = false;
   public int field_1652 = -1;
   public String field_45 = "";

   public Class499() {
   }

   public Class499(String var1, int var2) {
      this.field_1652 = var2;
      this.field_2363 = var1;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1652 = var1.readInt();
      this.field_2363 = var1.readUTF();
      this.field_45 = var1.readUTF();

      try {
         this.field_881 = Class278.method_1741(this.field_1652 + "" + this.field_2363, this.field_45);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1652);
      var1.writeUTF(this.field_2363);

      try {
         this.field_45 = Class278.method_1644(this.field_1652 + "" + this.field_2363, Class278.field_1860);
         var1.writeUTF(this.field_45);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   @Override
   public void method_1876(Class8 var1) {
      if (this.field_881) {
         Class597.method_883("[SecureChat] valid");
         var1.method_643(this);
      } else {
         Class597.method_883("[SecureChat] RESPONSE");
      }
   }

   @Override
   public int method_1597() {
      return this.field_2363.length() + this.field_45.length() + 4;
   }
}
