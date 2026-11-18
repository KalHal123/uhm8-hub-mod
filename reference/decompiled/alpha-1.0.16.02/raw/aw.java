public class aw extends nd {
   public aw(cj var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.i = 1.0F;
      this.j = 1.0F;
      this.k = 1.0F;
      this.b = 32;
      this.a(0.02F, 0.02F);
      this.g = this.g * (this.aN.nextFloat() * 0.6F + 0.2F);
      this.ak = var8 * 0.2F + (float)(Math.random() * 2.0 - 1.0) * 0.02F;
      this.al = var10 * 0.2F + (float)(Math.random() * 2.0 - 1.0) * 0.02F;
      this.am = var12 * 0.2F + (float)(Math.random() * 2.0 - 1.0) * 0.02F;
      this.f = (int)(8.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void e_() {
      this.ae = this.ah;
      this.af = this.ai;
      this.ag = this.aj;
      this.al += 0.002;
      this.c(this.ak, this.al, this.am);
      this.ak *= 0.85F;
      this.al *= 0.85F;
      this.am *= 0.85F;
      if (this.ad.f(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj)) != fs.f) {
         this.D();
      }

      if (this.f-- <= 0) {
         this.D();
      }
   }
}
