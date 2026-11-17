package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class288 extends Class320 {
   public Class288() {
      this.field_953 = true;
      this.field_126 = true;
   }

   public Class288(double var1, double var3, double var5, double var7, float var9, float var10, boolean var11) {
      this.field_1336 = var1;
      this.field_587 = var3;
      this.field_1383 = var5;
      this.field_847 = var7;
      this.field_787 = var9;
      this.field_362 = var10;
      this.field_341 = var11;
      this.field_953 = true;
      this.field_126 = true;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1336 = var1.readDouble();
      this.field_587 = var1.readDouble();
      this.field_1383 = var1.readDouble();
      this.field_847 = var1.readDouble();
      this.field_787 = var1.readFloat();
      this.field_362 = var1.readFloat();
      super.method_912(var1);
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeDouble(this.field_1336);
      var1.writeDouble(this.field_587);
      var1.writeDouble(this.field_1383);
      var1.writeDouble(this.field_847);
      var1.writeFloat(this.field_787);
      var1.writeFloat(this.field_362);
      super.method_405(var1);
   }

   @Override
   public int method_116() {
      return 41;
   }
}
