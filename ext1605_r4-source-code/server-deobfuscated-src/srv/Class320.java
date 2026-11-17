package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class320 extends Class318 {
   public double field_1336;
   public double field_587;
   public double field_847;
   public double field_1383;
   public float field_787;
   public float field_362;
   public boolean field_341;
   public boolean field_126;
   public boolean field_953;

   @Override
   public void method_1020(Class191 var1) {
      var1.method_127(this);
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_341 = var1.read() != 0;
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.write(this.field_341 ? 1 : 0);
   }

   @Override
   public int method_116() {
      return 1;
   }
}
