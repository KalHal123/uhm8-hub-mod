package ext;

public class Class45 extends Class359 {
   protected int field_1306;
   protected float field_148;
   protected float field_2377;
   protected int field_2380 = 0;
   protected int field_584 = 0;
   protected float field_2367;
   protected float field_810;
   protected float field_2519;
   protected float field_3000;
   protected float field_1918;
   public static double field_2725;
   public static double field_1939;
   public static double field_1993;

   public Class45(Class454 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.method_244(0.2F, 0.2F);
      this.field_838 = this.field_1443 / 2.0F;
      this.method_172(var2, var4, var6);
      this.field_2519 = this.field_3000 = this.field_1918 = 1.0F;
      this.field_2549 = var8 + (float)(Math.random() * 2.0 - 1.0) * 0.4F;
      this.field_2501 = var10 + (float)(Math.random() * 2.0 - 1.0) * 0.4F;
      this.field_489 = var12 + (float)(Math.random() * 2.0 - 1.0) * 0.4F;
      float var14 = (float)(Math.random() + Math.random() + 1.0) * 0.15F;
      float var15 = Class469.method_822(this.field_2549 * this.field_2549 + this.field_2501 * this.field_2501 + this.field_489 * this.field_489);
      this.field_2549 = this.field_2549 / var15 * var14 * 0.4F;
      this.field_2501 = this.field_2501 / var15 * var14 * 0.4F + 0.1F;
      this.field_489 = this.field_489 / var15 * var14 * 0.4F;
      this.field_148 = this.field_2850.nextFloat() * 3.0F;
      this.field_2377 = this.field_2850.nextFloat() * 3.0F;
      this.field_2367 = (this.field_2850.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.field_584 = (int)(4.0F / (this.field_2850.nextFloat() * 0.9F + 0.1F));
      this.field_2380 = 0;
      this.field_1522 = false;
   }

   public Class45 method_1580(float var1) {
      this.field_2549 *= var1;
      this.field_2501 = (this.field_2501 - 0.1F) * var1 + 0.1F;
      this.field_489 *= var1;
      return this;
   }

   public Class45 method_1297(float var1) {
      this.method_244(0.2F * var1, 0.2F * var1);
      this.field_2367 *= var1;
      return this;
   }

   @Override
   public void method_46() {
      this.field_2553 = this.field_1417;
      this.field_2068 = this.field_2654;
      this.field_1780 = this.field_2013;
      if (this.field_2380++ >= this.field_584) {
         this.method_1594();
      }

      this.field_2501 = this.field_2501 - 0.04 * this.field_810;
      this.method_981(this.field_2549, this.field_2501, this.field_489);
      this.field_2549 *= 0.98F;
      this.field_2501 *= 0.98F;
      this.field_489 *= 0.98F;
      if (this.field_2669) {
         this.field_2549 *= 0.7F;
         this.field_489 *= 0.7F;
      }
   }

   public void method_813(Class368 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = this.field_1306 % 16 / 16.0F;
      float var9 = var8 + 0.0624375F;
      float var10 = this.field_1306 / 16 / 16.0F;
      float var11 = var10 + 0.0624375F;
      float var12 = 0.1F * this.field_2367;
      float var13 = (float)(this.field_2553 + (this.field_1417 - this.field_2553) * var2 - field_2725);
      float var14 = (float)(this.field_2068 + (this.field_2654 - this.field_2068) * var2 - field_1939);
      float var15 = (float)(this.field_1780 + (this.field_2013 - this.field_1780) * var2 - field_1993);
      float var16 = this.method_50(var2);
      var1.method_1101(this.field_2519 * var16, this.field_3000 * var16, this.field_1918 * var16);
      var1.method_318(var13 - var3 * var12 - var6 * var12, var14 - var4 * var12, var15 - var5 * var12 - var7 * var12, var8, var11);
      var1.method_318(var13 - var3 * var12 + var6 * var12, var14 + var4 * var12, var15 - var5 * var12 + var7 * var12, var8, var10);
      var1.method_318(var13 + var3 * var12 + var6 * var12, var14 + var4 * var12, var15 + var5 * var12 + var7 * var12, var9, var10);
      var1.method_318(var13 + var3 * var12 - var6 * var12, var14 - var4 * var12, var15 + var5 * var12 - var7 * var12, var9, var11);
   }

   public int method_1506() {
      return 0;
   }

   @Override
   public void method_863(Class686 var1) {
   }

   @Override
   public void method_1054(Class686 var1) {
   }
}
