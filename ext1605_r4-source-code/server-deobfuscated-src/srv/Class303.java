package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class303 extends Class197 {
   public boolean field_686 = false;
   public int field_475 = -1;
   public String field_1581 = "";

   public Class303() {
   }

   public Class303(String var1, int var2) {
      this.field_475 = var2;
      this.field_1539 = var1;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_475 = var1.readInt();
      this.field_1539 = var1.readUTF();
      this.field_1581 = var1.readUTF();

      try {
         this.field_686 = Class119.method_666(this.field_475 + "" + this.field_1539, this.field_1581);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_475);
      var1.writeUTF(this.field_1539);

      try {
         this.field_1581 = Class119.method_548(this.field_475 + "" + this.field_1539, Class119.field_754);
         var1.writeUTF(this.field_1581);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   @Override
   public void method_1020(Class191 var1) {
      if (this.field_686) {
         var1.method_544(this);
      } else {
         Class273.method_579("[SecureChat] RESPONSE");
         ((Class124)var1).method_28("seclogin::chat_verify FAIL");
      }
   }

   @Override
   public int method_116() {
      return this.field_1539.length() + this.field_1581.length() + 4;
   }
}
