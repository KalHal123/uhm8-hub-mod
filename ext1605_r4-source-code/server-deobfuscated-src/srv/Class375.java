package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class375 extends Class320 {
   public Class375() {
      this.field_126 = true;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1336 = var1.readDouble();
      this.field_587 = var1.readDouble();
      this.field_1383 = var1.readDouble();
      this.field_847 = var1.readDouble();
      super.method_912(var1);
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeDouble(this.field_1336);
      var1.writeDouble(this.field_587);
      var1.writeDouble(this.field_1383);
      var1.writeDouble(this.field_847);
      super.method_405(var1);
   }

   @Override
   public int method_116() {
      return 33;
   }
}
