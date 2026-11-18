package x;

public class Class0350 extends Class0356 {
   float a;

   public Class0350(Class0065 var1, double var2, double var4, double var6) {
      this(var1, var2, var4, var6, 1.0F);
   }

   public Class0350(Class0065 var1, double var2, double var4, double var6, float var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.ak *= 0.1F;
      this.al *= 0.1F;
      this.am *= 0.1F;
      this.i = this.j = this.k = (float)(Math.random() * 0.3F);
      this.g *= 0.75F;
      this.g *= var8;
      this.a = this.g;
      this.f = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.f = (int)(this.f * var8);
      this.aK = false;
   }

   @Override
   public void a(Class0195 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.e + var2) / this.f * 32.0F;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.g = this.a * var8;
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
      if (this.ai == this.af) {
         this.ak *= 1.1;
         this.am *= 1.1;
      }

      this.ak *= 0.96F;
      this.al *= 0.96F;
      this.am *= 0.96F;
      if (this.as) {
         this.ak *= 0.7F;
         this.am *= 0.7F;
      }
   }
}
