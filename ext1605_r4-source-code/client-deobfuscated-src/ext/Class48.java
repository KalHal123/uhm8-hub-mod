package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class48 extends Class288 {
   public Class48() {
      this.field_757 = true;
   }

   public Class48(double var1, double var3, double var5, double var7, boolean var9) {
      this.field_2779 = var1;
      this.field_2898 = var3;
      this.field_370 = var5;
      this.field_257 = var7;
      this.field_861 = var9;
      this.field_757 = true;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_2779 = var1.readDouble();
      this.field_2898 = var1.readDouble();
      this.field_370 = var1.readDouble();
      this.field_257 = var1.readDouble();
      super.method_1135(var1);
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeDouble(this.field_2779);
      var1.writeDouble(this.field_2898);
      var1.writeDouble(this.field_370);
      var1.writeDouble(this.field_257);
      super.method_805(var1);
   }

   @Override
   public int method_1597() {
      return 33;
   }
}
