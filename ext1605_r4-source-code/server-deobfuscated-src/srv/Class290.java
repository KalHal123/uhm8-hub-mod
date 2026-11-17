package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class290 extends Class318 {
   public String field_237;

   public Class290() {
   }

   public Class290(String var1) {
      this.field_237 = var1;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_237 = var1.readUTF();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_237);
   }

   @Override
   public void method_1020(Class191 var1) {
      byte[] var2 = null;

      try {
         var2 = Class115.field_1584.method_492(this.field_237);
      } catch (Exception var4) {
         Class273.method_302("Error reading file: " + var4.getMessage());
         var4.printStackTrace();
      }

      if (var2 == null) {
         if (var1 instanceof Class124) {
            ((Class124)var1).method_571(new Class377(this.field_237, 0));
         }
      } else {
         for (int var3 = 0; var3 * 1024 < var2.length; var3++) {
            ((Class124)var1).method_571(new Class377(this.field_237, var3));
         }
      }
   }

   @Override
   public int method_116() {
      return 2 + this.field_237.length();
   }
}
