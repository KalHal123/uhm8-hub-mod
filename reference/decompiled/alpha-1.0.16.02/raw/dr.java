public class dr extends jx {
   public eo a;
   private int e;
   public int b = 0;
   public int c;
   private int f = 5;
   public float d = (float)(Math.random() * Math.PI * 2.0);

   public dr(cj var1, double var2, double var4, double var6, eo var8) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.ay = this.aA / 2.0F;
      this.a(var2, var4, var6);
      this.a = var8;
      this.an = (float)(Math.random() * 360.0);
      this.ak = (float)(Math.random() * 0.2F - 0.1F);
      this.al = 0.2F;
      this.am = (float)(Math.random() * 0.2F - 0.1F);
      this.aD = false;
   }

   public dr(cj var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.ay = this.aA / 2.0F;
   }

   @Override
   public void e_() {
      super.e_();
      if (this.c > 0) {
         this.c--;
      }

      this.ae = this.ah;
      this.af = this.ai;
      this.ag = this.aj;
      this.al -= 0.04F;
      if (this.ad.f(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj)) == fs.g) {
         this.al = 0.2F;
         this.ak = (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F;
         this.am = (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F;
         this.ad.a(this, "random.fizz", 0.4F, 2.0F + this.aN.nextFloat() * 0.4F);
      }

      this.g(this.ah, this.ai, this.aj);
      this.g_();
      this.c(this.ak, this.al, this.am);
      float var1 = 0.98F;
      if (this.as) {
         var1 = 0.58800006F;
         int var2 = this.ad.a(ei.b(this.ah), ei.b(this.ar.b) - 1, ei.b(this.aj));
         if (var2 > 0) {
            var1 = ln.n[var2].bm * 0.98F;
         }
      }

      this.ak *= var1;
      this.al *= 0.98F;
      this.am *= var1;
      if (this.as) {
         this.al *= -0.5;
      }

      this.e++;
      this.b++;
      if (this.b >= 6000) {
         this.D();
      }
   }

   @Override
   public boolean g_() {
      return this.ad.a(this.ar, fs.f, this);
   }

   private boolean g(double var1, double var3, double var5) {
      int var7 = ei.b(var1);
      int var8 = ei.b(var3);
      int var9 = ei.b(var5);
      double var10 = var1 - var7;
      double var12 = var3 - var8;
      double var14 = var5 - var9;
      if (ln.p[this.ad.a(var7, var8, var9)]) {
         boolean var16 = !ln.p[this.ad.a(var7 - 1, var8, var9)];
         boolean var17 = !ln.p[this.ad.a(var7 + 1, var8, var9)];
         boolean var18 = !ln.p[this.ad.a(var7, var8 - 1, var9)];
         boolean var19 = !ln.p[this.ad.a(var7, var8 + 1, var9)];
         boolean var20 = !ln.p[this.ad.a(var7, var8, var9 - 1)];
         boolean var21 = !ln.p[this.ad.a(var7, var8, var9 + 1)];
         byte var22 = -1;
         double var23 = 9999.0;
         if (var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if (var17 && 1.0 - var10 < var23) {
            var23 = 1.0 - var10;
            var22 = 1;
         }

         if (var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if (var19 && 1.0 - var12 < var23) {
            var23 = 1.0 - var12;
            var22 = 3;
         }

         if (var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if (var21 && 1.0 - var14 < var23) {
            var23 = 1.0 - var14;
            var22 = 5;
         }

         float var25 = this.aN.nextFloat() * 0.2F + 0.1F;
         if (var22 == 0) {
            this.ak = -var25;
         }

         if (var22 == 1) {
            this.ak = var25;
         }

         if (var22 == 2) {
            this.al = -var25;
         }

         if (var22 == 3) {
            this.al = var25;
         }

         if (var22 == 4) {
            this.am = -var25;
         }

         if (var22 == 5) {
            this.am = var25;
         }
      }

      return false;
   }

   @Override
   protected void a(int var1) {
      this.a(null, var1);
   }

   @Override
   public boolean a(jx var1, int var2) {
      this.f -= var2;
      if (this.f <= 0) {
         this.D();
      }

      return false;
   }

   @Override
   public void a(hc var1) {
      var1.a("Health", (short)((byte)this.f));
      var1.a("Age", (short)this.b);
      var1.a("Item", this.a.a(new hc()));
   }

   @Override
   public void b(hc var1) {
      this.f = var1.d("Health") & 255;
      this.b = var1.d("Age");
      hc var2 = var1.k("Item");
      this.a = new eo(var2);
   }

   @Override
   public void b(dg var1) {
      if (!this.ad.v) {
         int var2 = this.a.a;
         if (this.c == 0 && var1.b.a(this.a)) {
            this.ad.a(this, "random.pop", 0.2F, ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.a_(this, var2);
            this.D();
         }
      }
   }
}
