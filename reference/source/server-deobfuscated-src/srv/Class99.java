package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class99 extends Class318 {
   public long field_1220;

   public Class99() {
   }

   public Class99(long var1) {
      this.field_1220 = var1;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1220 = var1.readLong();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeLong(this.field_1220);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_497(this);
   }

   @Override
   public int method_116() {
      return 8;
   }
}
