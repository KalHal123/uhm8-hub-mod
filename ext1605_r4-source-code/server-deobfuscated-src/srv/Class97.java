package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class97 extends Class318 {
   public int field_123;
   public int field_77;

   public Class97() {
   }

   public Class97(Class252 var1, int var2) {
      this.field_123 = var1.field_331;
      this.field_77 = var2;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_123 = var1.readInt();
      this.field_77 = var1.readByte();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_123);
      var1.writeByte(this.field_77);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_712(this);
   }

   @Override
   public int method_116() {
      return 5;
   }
}
