package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class8 extends Class197 {
   public boolean field_1293 = false;
   public int field_1327 = -1;
   public int field_1068 = 0;
   String field_3 = "";

   public Class8() {
   }

   public Class8(String var1, int var2, int var3, String var4) {
      this.field_1327 = var2;
      this.field_1539 = var1;
      this.field_1068 = var3;
      this.field_3 = var4;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1327 = var1.readInt();
      this.field_1068 = var1.readInt();
      this.field_1539 = var1.readUTF();
      this.field_3 = var1.readUTF();

      try {
         this.field_1293 = Class119.method_666(this.field_1327 + "" + this.field_1539.substring(this.field_1068), this.field_3);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1327);
      var1.writeInt(this.field_1068);
      var1.writeUTF(this.field_1539);
      var1.writeUTF(this.field_3);
   }

   @Override
   public void method_1020(Class191 var1) {
      if (this.field_1293) {
         var1.method_544(this);
      } else {
         Class273.method_579("[SecureChatEcho] RESPONSE");
         ((Class124)var1).method_28("seclogin::chat_verify FAIL");
      }
   }

   @Override
   public int method_116() {
      return this.field_1539.length() + this.field_3.length() + 4 + 4;
   }
}
