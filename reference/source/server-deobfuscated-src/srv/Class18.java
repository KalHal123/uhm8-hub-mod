package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class18 extends Class318 {
   public int field_1107;
   public int field_1277;

   public Class18() {
   }

   public Class18(int var1, int var2) {
      this.field_1107 = var1;
      this.field_1277 = var2;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1107 = var1.readInt();
      this.field_1277 = var1.readShort() & '\uffff';
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1107);
      var1.writeShort(this.field_1277);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_375(this);
   }

   @Override
   public int method_116() {
      return 6;
   }
}
