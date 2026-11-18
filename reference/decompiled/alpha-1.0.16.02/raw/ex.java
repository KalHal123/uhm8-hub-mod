public class ex extends jx {
   public int a;
   public int b = 0;

   public ex(cj var1) {
      super(var1);
   }

   public ex(cj var1, float var2, float var3, float var4, int var5) {
      super(var1);
      this.a = var5;
      this.aa = true;
      this.a(0.98F, 0.98F);
      this.ay = this.aA / 2.0F;
      this.a((double)var2, (double)var3, (double)var4);
      this.ak = 0.0;
      this.al = 0.0;
      this.am = 0.0;
      this.aD = false;
      this.ae = var2;
      this.af = var3;
      this.ag = var4;
   }

   @Override
   public boolean c_() {
      return !this.ax;
   }

   @Override
   public void e_() {
      if (this.a == 0) {
         this.D();
      } else {
         this.ae = this.ah;
         this.af = this.ai;
         this.ag = this.aj;
         this.b++;
         this.al -= 0.04F;
         this.c(this.ak, this.al, this.am);
         this.ak *= 0.98F;
         this.al *= 0.98F;
         this.am *= 0.98F;
         int var1 = ei.b(this.ah);
         int var2 = ei.b(this.ai);
         int var3 = ei.b(this.aj);
         if (this.ad.a(var1, var2, var3) == this.a) {
            this.ad.d(var1, var2, var3, 0);
         }

         if (this.as) {
            this.ak *= 0.7F;
            this.am *= 0.7F;
            this.al *= -0.5;
            this.D();
            if (!this.ad.a(this.a, var1, var2, var3, true) || !this.ad.d(var1, var2, var3, this.a)) {
               this.b(this.a, 1);
            }
         } else if (this.b > 100) {
            this.b(this.a, 1);
            this.D();
         }
      }
   }

   @Override
   protected void a(hc var1) {
      var1.a("Tile", (byte)this.a);
   }

   @Override
   protected void b(hc var1) {
      this.a = var1.c("Tile") & 255;
   }

   @Override
   public float h_() {
      return 0.0F;
   }

   public cj i() {
      return this.ad;
   }
}
