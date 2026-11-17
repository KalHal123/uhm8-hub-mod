package ext;

public class Class699 extends Class45 {
   private float field_227;

   public Class699(Class454 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_2549 *= 0.8F;
      this.field_2501 *= 0.8F;
      this.field_489 *= 0.8F;
      this.field_2501 = this.field_2850.nextFloat() * 0.4F + 0.05F;
      this.field_2519 = this.field_3000 = this.field_1918 = 1.0F;
      this.field_2367 = this.field_2367 * (this.field_2850.nextFloat() * 2.0F + 0.2F);
      this.field_227 = this.field_2367;
      this.field_584 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.field_236 = false;
      this.field_1306 = 49;
   }

   @Override
   public float method_50(float var1) {
      return 1.0F;
   }

   @Override
   public void method_813(Class368 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.field_2380 + var2) / this.field_584;
      this.field_2367 = this.field_227 * (1.0F - var8 * var8);
      super.method_813(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void method_46() {
      this.field_2553 = this.field_1417;
      this.field_2068 = this.field_2654;
      this.field_1780 = this.field_2013;
      if (this.field_2380++ >= this.field_584) {
         this.method_1594();
      }

      float var1 = (float)this.field_2380 / this.field_584;
      if (this.field_2850.nextFloat() > var1) {
         this.field_1468.method_1347("smoke", this.field_1417, this.field_2654, this.field_2013, this.field_2549, this.field_2501, this.field_489);
      }

      this.field_2501 -= 0.03;
      this.method_981(this.field_2549, this.field_2501, this.field_489);
      this.field_2549 *= 0.999F;
      this.field_2501 *= 0.999F;
      this.field_489 *= 0.999F;
      if (this.field_2669) {
         this.field_2549 *= 0.7F;
         this.field_489 *= 0.7F;
      }
   }
}
