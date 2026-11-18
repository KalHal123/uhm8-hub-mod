package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class197 extends Class318 {
   public String field_1539;

   public Class197() {
   }

   public Class197(String var1) {
      this.field_1539 = var1;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1539 = var1.readUTF();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_1539);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_544(this);
   }

   @Override
   public int method_116() {
      return this.field_1539.length();
   }
}
