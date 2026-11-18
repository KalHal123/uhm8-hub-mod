package ext;

public class Class179 extends Class45 {
   float field_1994;

   public Class179(Class454 var1, double var2, double var4, double var6) {
      this(var1, var2, var4, var6, 1.0F);
   }

   public Class179(Class454 var1, double var2, double var4, double var6, float var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_2549 *= 0.1F;
      this.field_2501 *= 0.1F;
      this.field_489 *= 0.1F;
      this.field_2519 = this.field_3000 = this.field_1918 = (float)(Math.random() * 0.3F);
      this.field_2367 *= 0.75F;
      this.field_2367 *= var8;
      this.field_1994 = this.field_2367;
      this.field_584 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.field_584 = (int)(this.field_584 * var8);
      this.field_236 = false;
   }

   @Override
   public void method_813(Class368 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.field_2380 + var2) / this.field_584 * 32.0F;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.field_2367 = this.field_1994 * var8;
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
      if (this.field_2654 == this.field_2068) {
         this.field_2549 *= 1.1;
         this.field_489 *= 1.1;
      }

      this.field_2549 *= 0.96F;
      this.field_2501 *= 0.96F;
      this.field_489 *= 0.96F;
      if (this.field_2669) {
         this.field_2549 *= 0.7F;
         this.field_489 *= 0.7F;
      }
   }
}
