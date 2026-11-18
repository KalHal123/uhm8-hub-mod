package x;

public class Class0092 extends Class0356 {
   public Class0092(Class0065 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.ak = var8 + (float)(Math.random() * 2.0 - 1.0) * 0.05F;
      this.al = var10 + (float)(Math.random() * 2.0 - 1.0) * 0.05F;
      this.am = var12 + (float)(Math.random() * 2.0 - 1.0) * 0.05F;
      this.i = this.j = this.k = this.aN.nextFloat() * 0.3F + 0.7F;
      this.g = this.aN.nextFloat() * this.aN.nextFloat() * 6.0F + 1.0F;
      this.f = (int)(16.0 / (this.aN.nextFloat() * 0.8 + 0.2)) + 2;
   }

   @Override
   public void a(Class0195 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void e_() {
      this.ae = this.ah;
      this.af = this.ai;
      this.ag = this.aj;
      if (this.e++ >= this.f) {
         this.D();
      }

      this.b = 7 - this.e * 8 / this.f;
      this.al += 0.004;
      this.c(this.ak, this.al, this.am);
      this.ak *= 0.9F;
      this.al *= 0.9F;
      this.am *= 0.9F;
      if (this.as) {
         this.ak *= 0.7F;
         this.am *= 0.7F;
      }
   }
}
