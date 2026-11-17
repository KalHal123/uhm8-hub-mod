package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class145 extends Class318 {
   public String field_1315;

   public Class145() {
   }

   public Class145(String var1) {
      this.field_1315 = var1;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1315 = var1.readUTF();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_1315);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_292(this);
   }

   @Override
   public int method_116() {
      return 4 + this.field_1315.length() + 4;
   }
}
