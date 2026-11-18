package ext;

public class Class718 extends Class45 {
   public Class718(Class454 var1, double var2, double var4, double var6, double var8, double var10, double var12, Class108 var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_1306 = var14.field_2972;
      this.field_810 = var14.field_1031;
      this.field_2519 = this.field_3000 = this.field_1918 = 0.6F;
      this.field_2367 /= 2.0F;
   }

   @Override
   public int method_1506() {
      return 1;
   }

   @Override
   public void method_813(Class368 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.field_1306 % 16 + this.field_148 / 4.0F) / 16.0F;
      float var9 = var8 + 0.015609375F;
      float var10 = (this.field_1306 / 16 + this.field_2377 / 4.0F) / 32.0F;
      float var11 = var10 + 0.0078125F;
      float var12 = 0.1F * this.field_2367;
      float var13 = (float)(this.field_2553 + (this.field_1417 - this.field_2553) * var2 - field_2725);
      float var14 = (float)(this.field_2068 + (this.field_2654 - this.field_2068) * var2 - field_1939);
      float var15 = (float)(this.field_1780 + (this.field_2013 - this.field_1780) * var2 - field_1993);
      float var16 = this.method_50(var2);
      var1.method_1101(var16 * this.field_2519, var16 * this.field_3000, var16 * this.field_1918);
      var1.method_318(var13 - var3 * var12 - var6 * var12, var14 - var4 * var12, var15 - var5 * var12 - var7 * var12, var8, var11);
      var1.method_318(var13 - var3 * var12 + var6 * var12, var14 + var4 * var12, var15 - var5 * var12 + var7 * var12, var8, var10);
      var1.method_318(var13 + var3 * var12 + var6 * var12, var14 + var4 * var12, var15 + var5 * var12 + var7 * var12, var9, var10);
      var1.method_318(var13 + var3 * var12 - var6 * var12, var14 - var4 * var12, var15 + var5 * var12 - var7 * var12, var9, var11);
   }
}
