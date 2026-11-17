package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class284 extends Class318 {
   public String field_629 = "";

   public Class284() {
   }

   public Class284(String var1) {
      this.field_629 = var1;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_629 = var1.readUTF();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_629);
   }

   @Override
   public void method_1020(Class191 var1) {
      if (var1 instanceof Class124) {
         ((Class124)var1).field_163.field_1096.method_676(new Class284(this.field_629));
      }
   }

   @Override
   public int method_116() {
      return this.field_629.length() + 2;
   }
}
