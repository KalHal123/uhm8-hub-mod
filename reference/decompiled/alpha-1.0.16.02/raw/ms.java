public class ms extends nd {
   public ms(cj var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.ak *= 0.3F;
      this.al = (float)Math.random() * 0.2F + 0.1F;
      this.am *= 0.3F;
      this.i = 1.0F;
      this.j = 1.0F;
      this.k = 1.0F;
      this.b = 19 + this.aN.nextInt(4);
      this.a(0.01F, 0.01F);
      this.h = 0.06F;
      this.f = (int)(8.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void a(he var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void e_() {
      this.ae = this.ah;
      this.af = this.ai;
      this.ag = this.aj;
      this.al = this.al - this.h;
      this.c(this.ak, this.al, this.am);
      this.ak *= 0.98F;
      this.al *= 0.98F;
      this.am *= 0.98F;
      if (this.f-- <= 0) {
         this.D();
      }

      if (this.as) {
         if (Math.random() < 0.5) {
            this.D();
         }

         this.ak *= 0.7F;
         this.am *= 0.7F;
      }

      fs var1 = this.ad.f(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj));
      if (var1.d() || var1.a()) {
         double var2 = ei.b(this.ai) + 1 - jf.b(this.ad.e(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj)));
         if (this.ai < var2) {
            this.D();
         }
      }
   }
}
