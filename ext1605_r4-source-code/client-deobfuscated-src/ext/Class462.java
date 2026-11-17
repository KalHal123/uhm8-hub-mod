package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class462 extends Class288 {
   public Class462() {
      this.field_60 = true;
      this.field_757 = true;
   }

   public Class462(double var1, double var3, double var5, double var7, float var9, float var10, boolean var11) {
      this.field_2779 = var1;
      this.field_2898 = var3;
      this.field_370 = var5;
      this.field_257 = var7;
      this.field_1768 = var9;
      this.field_33 = var10;
      this.field_861 = var11;
      this.field_60 = true;
      this.field_757 = true;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_2779 = var1.readDouble();
      this.field_2898 = var1.readDouble();
      this.field_370 = var1.readDouble();
      this.field_257 = var1.readDouble();
      this.field_1768 = var1.readFloat();
      this.field_33 = var1.readFloat();
      super.method_1135(var1);
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeDouble(this.field_2779);
      var1.writeDouble(this.field_2898);
      var1.writeDouble(this.field_370);
      var1.writeDouble(this.field_257);
      var1.writeFloat(this.field_1768);
      var1.writeFloat(this.field_33);
      super.method_805(var1);
   }

   @Override
   public int method_1597() {
      return 41;
   }
}
