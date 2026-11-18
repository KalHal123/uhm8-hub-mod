import java.util.List;

public class cx extends jx {
   public int a = 0;
   public int b = 0;
   public int c = 1;

   public cx(cj var1) {
      super(var1);
      this.aa = true;
      this.a(1.5F, 0.6F);
      this.ay = this.aA / 2.0F;
      this.aD = false;
   }

   @Override
   public cb b_(jx var1) {
      return var1.ar;
   }

   @Override
   public cb f_() {
      return this.ar;
   }

   @Override
   public boolean d_() {
      return true;
   }

   public cx(cj var1, double var2, double var4, double var6) {
      this(var1);
      this.a(var2, var4 + this.ay, var6);
      this.ak = 0.0;
      this.al = 0.0;
      this.am = 0.0;
      this.ae = var2;
      this.af = var4;
      this.ag = var6;
   }

   @Override
   public double j_() {
      return this.aA * 0.0 - 0.3F;
   }

   @Override
   public boolean a(jx var1, int var2) {
      this.c = -this.c;
      this.b = 10;
      this.a += var2 * 10;
      if (this.a > 40) {
         for (int var3 = 0; var3 < 3; var3++) {
            this.a(ln.x.ba, 1, 0.0F);
         }

         for (int var4 = 0; var4 < 2; var4++) {
            this.a(dd.B.aQ, 1, 0.0F);
         }

         this.D();
      }

      return true;
   }

   @Override
   public boolean c_() {
      return !this.ax;
   }

   @Override
   public void e_() {
      super.e_();
      if (this.b > 0) {
         this.b--;
      }

      if (this.a > 0) {
         this.a--;
      }

      this.ae = this.ah;
      this.af = this.ai;
      this.ag = this.aj;
      byte var1 = 5;
      double var2 = 0.0;

      for (int var4 = 0; var4 < var1; var4++) {
         double var5 = this.ar.b + (this.ar.e - this.ar.b) * (var4 + 0) / var1 - 0.125;
         double var7 = this.ar.b + (this.ar.e - this.ar.b) * (var4 + 1) / var1 - 0.125;
         cb var9 = cb.b(this.ar.a, var5, this.ar.c, this.ar.d, var7, this.ar.f);
         if (this.ad.b(var9, fs.f)) {
            var2 += 1.0 / var1;
         }
      }

      double var23 = var2 * 2.0 - 1.0;
      this.al += 0.04F * var23;
      if (this.ab != null) {
         this.ak = this.ak + this.ab.ak * 0.2;
         this.am = this.am + this.ab.am * 0.2;
      }

      double var6 = 0.4;
      if (this.ak < -var6) {
         this.ak = -var6;
      }

      if (this.ak > var6) {
         this.ak = var6;
      }

      if (this.am < -var6) {
         this.am = -var6;
      }

      if (this.am > var6) {
         this.am = var6;
      }

      if (this.as) {
         this.ak *= 0.5;
         this.al *= 0.5;
         this.am *= 0.5;
      }

      this.c(this.ak, this.al, this.am);
      double var8 = Math.sqrt(this.ak * this.ak + this.am * this.am);
      if (var8 > 0.15) {
         double var10 = Math.cos(this.an * Math.PI / 180.0);
         double var12 = Math.sin(this.an * Math.PI / 180.0);

         for (int var14 = 0; var14 < 1.0 + var8 * 60.0; var14++) {
            double var15 = this.aN.nextFloat() * 2.0F - 1.0F;
            double var17 = (this.aN.nextInt(2) * 2 - 1) * 0.7;
            if (this.aN.nextBoolean()) {
               double var19 = this.ah - var10 * var15 * 0.8 + var12 * var17;
               double var21 = this.aj - var12 * var15 * 0.8 - var10 * var17;
               this.ad.a("splash", var19, this.ai - 0.125, var21, this.ak, this.al, this.am);
            } else {
               double var29 = this.ah + var10 + var12 * var15 * 0.7;
               double var31 = this.aj + var12 - var10 * var15 * 0.7;
               this.ad.a("splash", var29, this.ai - 0.125, var31, this.ak, this.al, this.am);
            }
         }
      }

      if (this.at && var8 > 0.15) {
         this.D();

         for (int var24 = 0; var24 < 3; var24++) {
            this.a(ln.x.ba, 1, 0.0F);
         }

         for (int var25 = 0; var25 < 2; var25++) {
            this.a(dd.B.aQ, 1, 0.0F);
         }
      } else {
         this.ak *= 0.99F;
         this.al *= 0.95F;
         this.am *= 0.99F;
      }

      this.ao = 0.0F;
      double var26 = this.an;
      double var27 = this.ae - this.ah;
      double var28 = this.ag - this.aj;
      if (var27 * var27 + var28 * var28 > 0.001) {
         var26 = (float)(Math.atan2(var28, var27) * 180.0 / Math.PI);
      }

      double var16 = var26 - this.an;

      while (var16 >= 180.0) {
         var16 -= 360.0;
      }

      while (var16 < -180.0) {
         var16 += 360.0;
      }

      if (var16 > 20.0) {
         var16 = 20.0;
      }

      if (var16 < -20.0) {
         var16 = -20.0;
      }

      this.an = (float)(this.an + var16);
      this.c(this.an, this.ao);
      List var18 = this.ad.b(this, this.ar.b(0.2F, 0.0, 0.2F));
      if (var18 != null && var18.size() > 0) {
         for (int var30 = 0; var30 < var18.size(); var30++) {
            jx var20 = (jx)var18.get(var30);
            if (var20 != this.ab && var20.d_() && var20 instanceof cx) {
               var20.f(this);
            }
         }
      }

      if (this.ab != null && this.ab.ax) {
         this.ab = null;
      }
   }

   @Override
   protected void i_() {
      double var1 = Math.cos(this.an * Math.PI / 180.0) * 0.4;
      double var3 = Math.sin(this.an * Math.PI / 180.0) * 0.4;
      this.ab.a(this.ah + var1, this.ai + this.j_() + this.ab.t(), this.aj + var3);
   }

   @Override
   protected void a(hc var1) {
   }

   @Override
   protected void b(hc var1) {
   }

   @Override
   public float h_() {
      return 0.0F;
   }

   @Override
   public boolean a(dg var1) {
      var1.g(this);
      return true;
   }
}
