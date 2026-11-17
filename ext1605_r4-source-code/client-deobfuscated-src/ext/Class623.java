package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class623 extends Class471 {
   public String field_738 = "";
   public double field_395;
   public double field_2968;
   public double field_1239;
   public float field_351;
   public float field_1338;

   public Class623() {
   }

   public Class623(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_738 = var1;
      this.field_395 = var2;
      this.field_2968 = var4;
      this.field_1239 = var6;
      this.field_351 = var8;
      this.field_1338 = var9;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_738 = var1.readUTF();
      this.field_395 = var1.readDouble();
      this.field_2968 = var1.readDouble();
      this.field_1239 = var1.readDouble();
      this.field_351 = var1.readFloat();
      this.field_1338 = var1.readFloat();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_738);
      var1.writeDouble(this.field_395);
      var1.writeDouble(this.field_2968);
      var1.writeDouble(this.field_1239);
      var1.writeFloat(this.field_351);
      var1.writeFloat(this.field_1338);
   }

   @Override
   public void method_1876(Class8 var1) {
      if (var1 instanceof Class348) {
         ((Class348)var1).method_1686(new Class623(this.field_738, this.field_395, this.field_2968, this.field_1239, this.field_351, this.field_1338));
      }
   }

   @Override
   public int method_1597() {
      return this.field_738.getBytes().length + 24 + 8;
   }
}
