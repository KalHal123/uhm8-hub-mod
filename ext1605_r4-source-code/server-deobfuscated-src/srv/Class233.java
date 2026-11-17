package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class233 extends Class318 {
   public String field_1266 = "";
   public double field_1288;
   public double field_1576;
   public double field_954;
   public float field_866;
   public float field_1600;

   public Class233(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_1266 = var1;
      this.field_1288 = var2;
      this.field_1576 = var4;
      this.field_954 = var6;
      this.field_866 = var8;
      this.field_1600 = var9;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1266 = var1.readUTF();
      this.field_1288 = var1.readDouble();
      this.field_1576 = var1.readDouble();
      this.field_954 = var1.readDouble();
      this.field_866 = var1.readFloat();
      this.field_1600 = var1.readFloat();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_1266);
      var1.writeDouble(this.field_1288);
      var1.writeDouble(this.field_1576);
      var1.writeDouble(this.field_954);
      var1.writeFloat(this.field_866);
      var1.writeFloat(this.field_1600);
   }

   @Override
   public void method_1020(Class191 var1) {
      if (var1 instanceof Class124) {
         ((Class124)var1)
            .field_163
            .field_1096
            .method_639(
               new Class233(this.field_1266, this.field_1288, this.field_1576, this.field_954, this.field_866, this.field_1600),
               this.field_1288,
               this.field_1576,
               this.field_954,
               15
            );
      }
   }

   @Override
   public int method_116() {
      return this.field_1266.getBytes().length + 24 + 8;
   }
}
