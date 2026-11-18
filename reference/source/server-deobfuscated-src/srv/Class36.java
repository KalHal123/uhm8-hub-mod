package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class36 extends Class318 {
   public String field_289 = "";
   public int field_991;

   public Class36(String var1, int var2) {
      this.field_289 = var1;
      this.field_991 = var2;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_289 = var1.readUTF();
      this.field_991 = var1.readInt();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_289);
      var1.writeInt(this.field_991);
   }

   @Override
   public void method_1020(Class191 var1) {
      if (var1 instanceof Class124) {
         ((Class124)var1).field_163.field_1096.method_676(this);
      }
   }

   @Override
   public int method_116() {
      return this.field_289.getBytes().length;
   }
}
