package x;

public class Class0068 extends Class0356 {
   private float a;

   public Class0068(Class0065 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.ak *= 0.8F;
      this.al *= 0.8F;
      this.am *= 0.8F;
      this.al = this.aN.nextFloat() * 0.4F + 0.05F;
      this.i = this.j = this.k = 1.0F;
      this.g = this.g * (this.aN.nextFloat() * 2.0F + 0.2F);
      this.a = this.g;
      this.f = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.aK = false;
      this.b = 49;
   }

   @Override
   public float a(float var1) {
      return 1.0F;
   }

   @Override
   public void a(Class0195 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.e + var2) / this.f;
      this.g = this.a * (1.0F - var8 * var8);
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

      float var1 = (float)this.e / this.f;
      if (this.aN.nextFloat() > var1) {
         this.ad.a("smoke", this.ah, this.ai, this.aj, this.ak, this.al, this.am);
      }

      this.al -= 0.03;
      this.c(this.ak, this.al, this.am);
      this.ak *= 0.999F;
      this.al *= 0.999F;
      this.am *= 0.999F;
      if (this.as) {
         this.ak *= 0.7F;
         this.am *= 0.7F;
      }
   }
}
