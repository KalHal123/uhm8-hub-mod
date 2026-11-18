package x;

public class Class0236 extends Class0356 {
   private float a;

   public Class0236(Class0065 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.ak = this.ak * 0.01F + var8;
      this.al = this.al * 0.01F + var10;
      this.am = this.am * 0.01F + var12;
      var2 += (this.aN.nextFloat() - this.aN.nextFloat()) * 0.05F;
      var4 += (this.aN.nextFloat() - this.aN.nextFloat()) * 0.05F;
      var6 += (this.aN.nextFloat() - this.aN.nextFloat()) * 0.05F;
      this.a = this.g;
      this.i = this.j = this.k = 1.0F;
      this.f = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
      this.aK = true;
      this.b = 48;
   }

   @Override
   public void a(Class0195 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.e + var2) / this.f;
      this.g = this.a * (1.0F - var8 * var8 * 0.5F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public float a(float var1) {
      float var2 = (this.e + var1) / this.f;
      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      float var3 = super.a(var1);
      return var3 * var2 + (1.0F - var2);
   }

   @Override
   public void e_() {
      this.ae = this.ah;
      this.af = this.ai;
      this.ag = this.aj;
      if (this.e++ >= this.f) {
         this.D();
      }

      this.c(this.ak, this.al, this.am);
      this.ak *= 0.96F;
      this.al *= 0.96F;
      this.am *= 0.96F;
      if (this.as) {
         this.ak *= 0.7F;
         this.am *= 0.7F;
      }
   }
}
