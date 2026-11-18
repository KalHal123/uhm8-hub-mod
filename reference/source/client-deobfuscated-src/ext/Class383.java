package ext;

public class Class383 extends Class45 {
   public Class383(Class454 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_2549 = var8 + (float)(Math.random() * 2.0 - 1.0) * 0.05F;
      this.field_2501 = var10 + (float)(Math.random() * 2.0 - 1.0) * 0.05F;
      this.field_489 = var12 + (float)(Math.random() * 2.0 - 1.0) * 0.05F;
      this.field_2519 = this.field_3000 = this.field_1918 = this.field_2850.nextFloat() * 0.3F + 0.7F;
      this.field_2367 = this.field_2850.nextFloat() * this.field_2850.nextFloat() * 6.0F + 1.0F;
      this.field_584 = (int)(16.0 / (this.field_2850.nextFloat() * 0.8 + 0.2)) + 2;
   }

   @Override
   public void method_813(Class368 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
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

      this.field_1306 = 7 - this.field_2380 * 8 / this.field_584;
      this.field_2501 += 0.004;
      this.method_981(this.field_2549, this.field_2501, this.field_489);
      this.field_2549 *= 0.9F;
      this.field_2501 *= 0.9F;
      this.field_489 *= 0.9F;
      if (this.field_2669) {
         this.field_2549 *= 0.7F;
         this.field_489 *= 0.7F;
      }
   }
}
