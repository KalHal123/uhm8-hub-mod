package x;

import java.util.List;

public class Class0158 extends Class0268 {
   public int j = 20;
   public float k;
   public float l;
   public float m;
   public float n = 0.0F;
   public float o = 0.0F;
   protected float p;
   protected float q;
   protected float r;
   protected float s;
   protected boolean t = true;
   protected String u = "/char.png";
   protected boolean v = true;
   protected float w = 0.0F;
   protected String x = null;
   protected float y = 1.0F;
   protected int z = 0;
   protected float A = 0.0F;
   public float B;
   public float C;
   public int D;
   public int E;
   private int a;
   public int F;
   public int G;
   public float H = 0.0F;
   public int I = 0;
   public int J = 0;
   public float K;
   public float L;
   protected boolean M = false;
   public int N = -1;
   public float O = (float)(Math.random() * 0.9F + 0.1F);
   public float P;
   public float Q;
   public float R;
   protected int S = 0;
   protected float T;
   protected float U;
   protected float V;
   protected boolean W = false;
   protected float X = 0.0F;
   protected float Y = 0.7F;
   private Class0268 b;
   private int c = 0;

   public Class0158(Class0065 var1) {
      super(var1);
      this.D = 10;
      this.aa = true;
      this.m = (float)(Math.random() + 1.0) * 0.01F;
      this.a(this.ah, this.ai, this.aj);
      this.k = (float)Math.random() * 12398.0F;
      this.an = (float)(Math.random() * (float) Math.PI * 2.0);
      this.l = 1.0F;
      this.aJ = 0.5F;
   }

   protected boolean c(Class0268 var1) {
      return this.ad.a(Class0009.b(this.ah, this.ai + this.q(), this.aj), Class0009.b(var1.ah, var1.ai + var1.q(), var1.aj)) == null;
   }

   @Override
   public String v() {
      return this.u;
   }

   @Override
   public boolean c_() {
      return !this.ax;
   }

   @Override
   public boolean d_() {
      return !this.ax;
   }

   @Override
   protected float q() {
      return this.aA * 0.85F;
   }

   public int b() {
      return 80;
   }

   @Override
   public void w() {
      this.B = this.C;
      super.w();
      if (this.aN.nextInt(1000) < this.a++) {
         this.a = -this.b();
         String var1 = this.c();
         if (var1 != null) {
            this.ad.a(this, var1, this.f(), (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F);
         }
      }

      if (this.z() && this.G()) {
         this.a(null, 1);
      }

      if (this.z() && this.a(Class0155.f)) {
         this.aU--;
         if (this.aU == -20) {
            this.aU = 0;

            for (int var8 = 0; var8 < 8; var8++) {
               float var2 = this.aN.nextFloat() - this.aN.nextFloat();
               float var3 = this.aN.nextFloat() - this.aN.nextFloat();
               float var4 = this.aN.nextFloat() - this.aN.nextFloat();
               this.ad.a("bubble", this.ah + var2, this.ai + var3, this.aj + var4, this.ak, this.al, this.am);
            }

            this.a(null, 2);
         }

         this.aQ = 0;
      } else {
         this.aU = this.aR;
      }

      this.K = this.L;
      if (this.J > 0) {
         this.J--;
      }

      if (this.F > 0) {
         this.F--;
      }

      if (this.aT > 0) {
         this.aT--;
      }

      if (this.D <= 0) {
         this.I++;
         if (this.I > 20) {
            this.B();
            this.D();

            for (int var9 = 0; var9 < 20; var9++) {
               double var10 = this.aN.nextGaussian() * 0.02;
               double var11 = this.aN.nextGaussian() * 0.02;
               double var6 = this.aN.nextGaussian() * 0.02;
               this.ad
                  .a(
                     "explode",
                     this.ah + this.aN.nextFloat() * this.az * 2.0F - this.az,
                     this.ai + this.aN.nextFloat() * this.aA,
                     this.aj + this.aN.nextFloat() * this.az * 2.0F - this.az,
                     var10,
                     var11,
                     var6
                  );
            }
         }
      }

      this.s = this.r;
      this.o = this.n;
      this.ap = this.an;
      this.aq = this.ao;
   }

   public void x() {
      for (int var1 = 0; var1 < 20; var1++) {
         double var2 = this.aN.nextGaussian() * 0.02;
         double var4 = this.aN.nextGaussian() * 0.02;
         double var6 = this.aN.nextGaussian() * 0.02;
         double var8 = 10.0;
         this.ad
            .a(
               "explode",
               this.ah + this.aN.nextFloat() * this.az * 2.0F - this.az - var2 * var8,
               this.ai + this.aN.nextFloat() * this.aA - var4 * var8,
               this.aj + this.aN.nextFloat() * this.az * 2.0F - this.az - var6 * var8,
               var2,
               var4,
               var6
            );
      }
   }

   @Override
   public void n() {
      super.n();
      this.p = this.q;
      this.q = 0.0F;
   }

   @Override
   public void e_() {
      super.e_();
      this.i();
      double var1 = this.ah - this.ae;
      double var3 = this.aj - this.ag;
      float var5 = Class0118.a(var1 * var1 + var3 * var3);
      float var6 = this.n;
      float var7 = 0.0F;
      this.p = this.q;
      float var8 = 0.0F;
      if (!(var5 <= 0.05F)) {
         var8 = 1.0F;
         var7 = var5 * 3.0F;
         var6 = (float)Math.atan2(var3, var1) * 180.0F / (float) Math.PI - 90.0F;
      }

      if (this.C > 0.0F) {
         var6 = this.an;
      }

      if (!this.as) {
         var8 = 0.0F;
      }

      this.q = this.q + (var8 - this.q) * 0.3F;
      float var9 = var6 - this.n;

      while (var9 < -180.0F) {
         var9 += 360.0F;
      }

      while (var9 >= 180.0F) {
         var9 -= 360.0F;
      }

      this.n += var9 * 0.3F;
      float var10 = this.an - this.n;

      while (var10 < -180.0F) {
         var10 += 360.0F;
      }

      while (var10 >= 180.0F) {
         var10 -= 360.0F;
      }

      boolean var11 = var10 < -90.0F || var10 >= 90.0F;
      if (var10 < -75.0F) {
         var10 = -75.0F;
      }

      if (var10 >= 75.0F) {
         var10 = 75.0F;
      }

      this.n = this.an - var10;
      if (var10 * var10 > 2500.0F) {
         this.n += var10 * 0.2F;
      }

      if (var11) {
         var7 *= -1.0F;
      }

      while (this.an - this.ap < -180.0F) {
         this.ap -= 360.0F;
      }

      while (this.an - this.ap >= 180.0F) {
         this.ap += 360.0F;
      }

      while (this.n - this.o < -180.0F) {
         this.o -= 360.0F;
      }

      while (this.n - this.o >= 180.0F) {
         this.o += 360.0F;
      }

      while (this.ao - this.aq < -180.0F) {
         this.aq -= 360.0F;
      }

      while (this.ao - this.aq >= 180.0F) {
         this.aq += 360.0F;
      }

      this.r += var7;
   }

   @Override
   protected void a(float var1, float var2) {
      super.a(var1, var2);
   }

   public void b(int var1) {
      if (this.D > 0) {
         this.D += var1;
         if (this.D > 20) {
            this.D = 20;
         }

         this.aT = this.j / 2;
      }
   }

   @Override
   public boolean a(Class0268 var1, int var2) {
      this.S = 0;
      if (this.D <= 0) {
         return false;
      }

      this.Q = 1.5F;
      if (this.aT > this.j / 2.0F) {
         if (this.E - var2 >= this.D) {
            return false;
         }

         this.D = this.E - var2;
      } else {
         this.E = this.D;
         this.aT = this.j;
         this.D -= var2;
         this.F = this.G = 10;
      }

      this.H = 0.0F;
      if (var1 != null) {
         double var3 = var1.ah - this.ah;

         double var5;
         for (var5 = var1.aj - this.aj; var3 * var3 + var5 * var5 < 1.0E-4; var5 = (Math.random() - Math.random()) * 0.01) {
            var3 = (Math.random() - Math.random()) * 0.01;
         }

         this.H = (float)(Math.atan2(var5, var3) * 180.0 / (float) Math.PI) - this.an;
         this.a(var1, var2, var3, var5);
      } else {
         this.H = (int)(Math.random() * 2.0) * 180;
      }

      if (this.D <= 0) {
         this.ad.a(this, this.e(), this.f(), (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F);
         this.b(var1);
      } else {
         this.ad.a(this, this.d(), this.f(), (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F);
      }

      return true;
   }

   protected float f() {
      return 1.0F;
   }

   protected String c() {
      return null;
   }

   protected String d() {
      return "random.hurt";
   }

   protected String e() {
      return "random.hurt";
   }

   public void a(Class0268 var1, int var2, double var3, double var5) {
      float var7 = Class0118.a(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.ak /= 2.0;
      this.al /= 2.0;
      this.am /= 2.0;
      this.ak -= var3 / var7 * var8;
      this.al += 0.4F;
      this.am -= var5 / var7 * var8;
      if (this.al > 0.4F) {
         this.al = 0.4F;
      }
   }

   public void b(Class0268 var1) {
      if (this.z > 0 && var1 != null) {
         var1.b(this, this.z);
      }

      this.M = true;
      int var2 = this.g();
      if (var2 > 0) {
         int var3 = this.aN.nextInt(3);

         for (int var4 = 0; var4 < var3; var4++) {
            this.b(var2, 1);
         }
      }
   }

   protected int g() {
      return 0;
   }

   @Override
   protected void c(float var1) {
      int var2 = (int)Math.ceil(var1 - 3.0F);
      if (var2 > 0) {
         this.a(null, var2);
         int var3 = this.ad.a(Class0118.b(this.ah), Class0118.b(this.ai - 0.2F - this.ay), Class0118.b(this.aj));
         if (var3 > 0) {
            Class0025 var4 = Class0312.n[var3].bj;
            this.ad.a(this, var4.d(), var4.b() * 0.5F, var4.c() * 0.75F);
         }
      }
   }

   public void b(float var1, float var2) {
      if (this.g_()) {
         double var3 = this.ai;
         this.a((float)var1, (float)var2, 0.02F);
         this.c(this.ak, this.al, this.am);
         this.ak *= 0.8F;
         this.al *= 0.8F;
         this.am *= 0.8F;
         this.al -= 0.02;
         if (this.at && this.b(this.ak, this.al + 0.6F - this.ai + var3, this.am)) {
            this.al = 0.3F;
         }
      } else if (this.E()) {
         double var8 = this.ai;
         this.a((float)var1, (float)var2, 0.02F);
         this.c(this.ak, this.al, this.am);
         this.ak *= 0.5;
         this.al *= 0.5;
         this.am *= 0.5;
         this.al -= 0.02;
         if (this.at && this.b(this.ak, this.al + 0.6F - this.ai + var8, this.am)) {
            this.al = 0.3F;
         }
      } else {
         float var9 = 0.91F;
         if (this.as) {
            var9 = 0.54600006F;
            int var4 = this.ad.a(Class0118.b(this.ah), Class0118.b(this.ar.b) - 1, Class0118.b(this.aj));
            if (var4 > 0) {
               var9 = Class0312.n[var4].bm * 0.91F;
            }
         }

         float var12 = 0.16277136F / (var9 * var9 * var9);
         this.a((float)var1, (float)var2, this.as ? 0.1F * var12 : 0.02F);
         var9 = 0.91F;
         if (this.as) {
            var9 = 0.54600006F;
            int var5 = this.ad.a(Class0118.b(this.ah), Class0118.b(this.ar.b) - 1, Class0118.b(this.aj));
            if (var5 > 0) {
               var9 = Class0312.n[var5].bm * 0.91F;
            }
         }

         if (this.y()) {
            this.aE = 0.0F;
            if (this.al < -0.15) {
               this.al = -0.15;
            }
         }

         this.c(this.ak, this.al, this.am);
         if (this.at && this.y()) {
            this.al = 0.2;
         }

         this.al -= 0.08;
         this.al *= 0.98F;
         this.ak *= var9;
         this.am *= var9;
      }

      this.P = this.Q;
      double var11 = this.ah - this.ae;
      double var13 = this.aj - this.ag;
      float var7 = Class0118.a(var11 * var11 + var13 * var13) * 4.0F;
      if (var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.Q = this.Q + (var7 - this.Q) * 0.4F;
      this.R = this.R + this.Q;
   }

   public boolean y() {
      int var1 = Class0118.b(this.ah);
      int var2 = Class0118.b(this.ar.b);
      int var3 = Class0118.b(this.aj);
      return this.ad.a(var1, var2, var3) == Class0312.aF.ba || this.ad.a(var1, var2 + 1, var3) == Class0312.aF.ba;
   }

   @Override
   public void a(Class0193 var1) {
      var1.a("Health", (short)this.D);
      var1.a("HurtTime", (short)this.F);
      var1.a("DeathTime", (short)this.I);
      var1.a("AttackTime", (short)this.J);
   }

   @Override
   public void b(Class0193 var1) {
      this.D = var1.d("Health");
      if (!var1.b("Health")) {
         this.D = 10;
      }

      this.F = var1.d("HurtTime");
      this.I = var1.d("DeathTime");
      this.J = var1.d("AttackTime");
   }

   @Override
   public boolean z() {
      return !this.ax && this.D > 0;
   }

   public void i() {
      if (this.D <= 0) {
         this.W = false;
         this.T = 0.0F;
         this.U = 0.0F;
         this.V = 0.0F;
      } else {
         this.b_();
      }

      boolean var1 = this.g_();
      boolean var2 = this.E();
      if (this.W) {
         if (var1) {
            this.al += 0.04F;
         } else if (var2) {
            this.al += 0.04F;
         } else if (this.as) {
            this.A();
         }
      }

      this.T *= 0.98F;
      this.U *= 0.98F;
      this.V *= 0.9F;
      this.b(this.T, this.U);
      List var3 = this.ad.b(this, this.ar.b(0.2F, 0.0, 0.2F));
      if (var3 != null && var3.size() > 0) {
         for (int var4 = 0; var4 < var3.size(); var4++) {
            Class0268 var5 = (Class0268)var3.get(var4);
            if (var5.d_()) {
               var5.f(this);
            }
         }
      }
   }

   protected void A() {
      this.al = 0.42F;
   }

   protected void b_() {
      this.S++;
      Class0089 var1 = this.ad.a(this, -1.0);
      if (var1 != null) {
         double var2 = var1.ah - this.ah;
         double var4 = var1.ai - this.ai;
         double var6 = var1.aj - this.aj;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if (var8 > 16384.0) {
            this.D();
         }

         if (this.S > 600 && this.aN.nextInt(800) == 0) {
            if (var8 < 1024.0) {
               this.S = 0;
            } else {
               this.D();
            }
         }
      }

      this.T = 0.0F;
      this.U = 0.0F;
      float var11 = 8.0F;
      if (this.aN.nextFloat() < 0.02F) {
         var1 = this.ad.a(this, var11);
         if (var1 != null) {
            this.b = var1;
            this.c = 10 + this.aN.nextInt(20);
         } else {
            this.V = (this.aN.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if (this.b != null) {
         this.b(this.b, 10.0F);
         if (this.c-- <= 0 || this.b.ax || this.b.e(this) > var11 * var11) {
            this.b = null;
         }
      } else {
         if (this.aN.nextFloat() < 0.05F) {
            this.V = (this.aN.nextFloat() - 0.5F) * 20.0F;
         }

         this.an = this.an + this.V;
         this.ao = this.X;
      }

      boolean var3 = this.g_();
      boolean var12 = this.E();
      if (var3 || var12) {
         this.W = this.aN.nextFloat() < 0.8F;
      }
   }

   public void b(Class0268 var1, float var2) {
      double var3 = var1.ah - this.ah;
      double var7 = var1.aj - this.aj;
      double var5;
      if (var1 instanceof Class0158) {
         Class0158 var9 = (Class0158)var1;
         var5 = var9.ai + var9.q() - (this.ai + this.q());
      } else {
         var5 = (var1.ar.b + var1.ar.e) / 2.0 - (this.ai + this.q());
      }

      double var13 = Class0118.a(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / (float) Math.PI) - 90.0F;
      float var12 = (float)(Math.atan2(var5, var13) * 180.0 / (float) Math.PI);
      this.ao = this.b(this.ao, var12, var2);
      this.an = this.b(this.an, var11, var2);
   }

   private float b(float var1, float var2, float var3) {
      float var4 = var2 - var1;

      while (var4 < -180.0F) {
         var4 += 360.0F;
      }

      while (var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public void B() {
   }

   public boolean a() {
      return this.ad.a(this.ar) && this.ad.a(this, this.ar).size() == 0 && !this.ad.b(this.ar);
   }

   @Override
   protected void C() {
      this.a(null, 4);
   }

   public float d(float var1) {
      float var2 = this.C - this.B;
      if (var2 < 0.0F) {
         var2++;
      }

      return this.B + var2 * var1;
   }

   public Class0009 e(float var1) {
      if (var1 == 1.0F) {
         return Class0009.b(this.ah, this.ai, this.aj);
      }

      double var2 = this.ae + (this.ah - this.ae) * var1;
      double var4 = this.af + (this.ai - this.af) * var1;
      double var6 = this.ag + (this.aj - this.ag) * var1;
      return Class0009.b(var2, var4, var6);
   }

   public Class0009 f(float var1) {
      if (var1 == 1.0F) {
         float var8 = Class0118.b(-this.an * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var9 = Class0118.a(-this.an * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var10 = -Class0118.b(-this.ao * (float) (Math.PI / 180.0));
         float var11 = Class0118.a(-this.ao * (float) (Math.PI / 180.0));
         return Class0009.b(var9 * var10, var11, var8 * var10);
      } else {
         float var2 = this.aq + (this.ao - this.aq) * var1;
         float var3 = this.ap + (this.an - this.ap) * var1;
         float var4 = Class0118.b(-var3 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var5 = Class0118.a(-var3 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var6 = -Class0118.b(-var2 * (float) (Math.PI / 180.0));
         float var7 = Class0118.a(-var2 * (float) (Math.PI / 180.0));
         return Class0009.b(var5 * var6, var7, var4 * var6);
      }
   }

   public Class0320 a(double var1, float var3) {
      Class0009 var4 = this.e(var3);
      Class0009 var5 = this.f(var3);
      Class0009 var6 = var4.c(var5.a * var1, var5.b * var1, var5.c * var1);
      return this.ad.a(var4, var6);
   }
}
