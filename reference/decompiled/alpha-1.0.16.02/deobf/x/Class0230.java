package x;

public class Class0230 extends Class0356 {
   public Class0230(Class0065 var1, double var2, double var4, double var6, double var8, double var10, double var12, Class0312 var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.b = var14.aZ;
      this.h = var14.bk;
      this.i = this.j = this.k = 0.6F;
      this.g /= 2.0F;
   }

   @Override
   public int c() {
      return 1;
   }

   @Override
   public void a(Class0195 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.b % 16 + this.c / 4.0F) / 16.0F;
      float var9 = var8 + 0.015609375F;
      float var10 = (this.b / 16 + this.d / 4.0F) / 16.0F;
      float var11 = var10 + 0.015609375F;
      float var12 = 0.1F * this.g;
      float var13 = (float)(this.ae + (this.ah - this.ae) * var2 - l);
      float var14 = (float)(this.af + (this.ai - this.af) * var2 - m);
      float var15 = (float)(this.ag + (this.aj - this.ag) * var2 - n);
      float var16 = this.a(var2);
      var1.a(var16 * this.i, var16 * this.j, var16 * this.k);
      var1.a(var13 - var3 * var12 - var6 * var12, var14 - var4 * var12, var15 - var5 * var12 - var7 * var12, var8, var11);
      var1.a(var13 - var3 * var12 + var6 * var12, var14 + var4 * var12, var15 - var5 * var12 + var7 * var12, var8, var10);
      var1.a(var13 + var3 * var12 + var6 * var12, var14 + var4 * var12, var15 + var5 * var12 + var7 * var12, var9, var10);
      var1.a(var13 + var3 * var12 - var6 * var12, var14 - var4 * var12, var15 + var5 * var12 - var7 * var12, var9, var11);
   }
}
