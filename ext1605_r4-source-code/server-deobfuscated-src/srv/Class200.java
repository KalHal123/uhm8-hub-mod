package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class200 extends Class318 {
   public int field_1246;
   public int field_1180;

   public Class200() {
   }

   public Class200(int var1, int var2) {
      this.field_1246 = var1;
      this.field_1180 = var2;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1246 = var1.readInt();
      this.field_1180 = var1.readInt();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1246);
      var1.writeInt(this.field_1180);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_646(this);
   }

   @Override
   public int method_116() {
      return 8;
   }
}
