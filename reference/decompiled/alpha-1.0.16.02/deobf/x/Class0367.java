package x;

import java.util.List;

public class Class0367 extends Class0268 implements Class0161 {
   private Class0124[] h = new Class0124[36];
   public int a = 0;
   public int b = 0;
   public int c = 1;
   private boolean i = false;
   public int d;
   public int e;
   public double f;
   public double g;
   private static final int[][][] j = new int[][][]{
      {{0, 0, -1}, {0, 0, 1}},
      {{-1, 0, 0}, {1, 0, 0}},
      {{-1, -1, 0}, {1, 0, 0}},
      {{-1, 0, 0}, {1, -1, 0}},
      {{0, 0, -1}, {0, -1, 1}},
      {{0, -1, -1}, {0, 0, 1}},
      {{0, 0, 1}, {1, 0, 0}},
      {{0, 0, 1}, {-1, 0, 0}},
      {{0, 0, -1}, {-1, 0, 0}},
      {{0, 0, -1}, {1, 0, 0}}
   };
   private int k;
   private double l;
   private double m;
   private double n;
   private double o;
   private double p;

   public Class0367(Class0065 var1) {
      super(var1);
      this.aa = true;
      this.a(0.98F, 0.7F);
      this.ay = this.aA / 2.0F;
      this.aD = false;
   }

   @Override
   public Class0057 b_(Class0268 var1) {
      return var1.ar;
   }

   @Override
   public Class0057 f_() {
      return this.ar;
   }

   @Override
   public boolean d_() {
      return true;
   }

   public Class0367(Class0065 var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.a(var2, var4 + this.ay, var6);
      this.ak = 0.0;
      this.al = 0.0;
      this.am = 0.0;
      this.ae = var2;
      this.af = var4;
      this.ag = var6;
      this.d = var8;
   }

   @Override
   public double j_() {
      return this.aA * 0.0 - 0.3F;
   }

   @Override
   public boolean a(Class0268 var1, int var2) {
      this.c = -this.c;
      this.b = 10;
      this.a += var2 * 10;
      if (this.a > 40) {
         this.a(Class0086.ax.aQ, 1, 0.0F);
         if (this.d == 1) {
            this.a(Class0312.au.ba, 1, 0.0F);
         } else if (this.d == 2) {
            this.a(Class0312.aB.ba, 1, 0.0F);
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
   public void D() {
      for (int var1 = 0; var1 < this.a(); var1++) {
         Class0124 var2 = this.a_(var1);
         if (var2 != null) {
            float var3 = this.aN.nextFloat() * 0.8F + 0.1F;
            float var4 = this.aN.nextFloat() * 0.8F + 0.1F;
            float var5 = this.aN.nextFloat() * 0.8F + 0.1F;

            while (var2.a > 0) {
               int var6 = this.aN.nextInt(21) + 10;
               if (var6 > var2.a) {
                  var6 = var2.a;
               }

               var2.a -= var6;
               Class0100 var7 = new Class0100(this.ad, this.ah + var3, this.ai + var4, this.aj + var5, new Class0124(var2.c, var6, var2.d));
               float var8 = 0.05F;
               var7.ak = (float)this.aN.nextGaussian() * var8;
               var7.al = (float)this.aN.nextGaussian() * var8 + 0.2F;
               var7.am = (float)this.aN.nextGaussian() * var8;
               this.ad.a(var7);
            }
         }
      }

      super.D();
   }

   @Override
   public void e_() {
      if (this.ad.v) {
         if (this.k > 0) {
            double var41 = this.ah + (this.l - this.ah) / this.k;
            double var42 = this.ai + (this.m - this.ai) / this.k;
            double var5 = this.aj + (this.n - this.aj) / this.k;
            double var43 = this.o - this.an;

            while (var43 < -180.0) {
               var43 += 360.0;
            }

            while (var43 >= 180.0) {
               var43 -= 360.0;
            }

            this.an = (float)(this.an + var43 / this.k);
            this.ao = (float)(this.ao + (this.p - this.ao) / this.k);
            this.k--;
            this.a(var41, var42, var5);
            this.c(this.an, this.ao);
         } else {
            this.a(this.ah, this.ai, this.aj);
            this.c(this.an, this.ao);
         }
      } else {
         if (this.b > 0) {
            this.b--;
         }

         if (this.a > 0) {
            this.a--;
         }

         this.ae = this.ah;
         this.af = this.ai;
         this.ag = this.aj;
         this.al -= 0.04F;
         int var1 = Class0118.b(this.ah);
         int var2 = Class0118.b(this.ai);
         int var3 = Class0118.b(this.aj);
         if (this.ad.a(var1, var2 - 1, var3) == Class0312.aG.ba) {
            var2--;
         }

         double var4 = 0.4;
         boolean var6 = false;
         double var7 = 0.0078125;
         if (this.ad.a(var1, var2, var3) == Class0312.aG.ba) {
            Class0009 var9 = this.g(this.ah, this.ai, this.aj);
            int var10 = this.ad.e(var1, var2, var3);
            this.ai = var2;
            if (var10 >= 2 && var10 <= 5) {
               this.ai = var2 + 1;
            }

            if (var10 == 2) {
               this.ak -= var7;
            }

            if (var10 == 3) {
               this.ak += var7;
            }

            if (var10 == 4) {
               this.am += var7;
            }

            if (var10 == 5) {
               this.am -= var7;
            }

            int[][] var11 = j[var10];
            double var12 = var11[1][0] - var11[0][0];
            double var14 = var11[1][2] - var11[0][2];
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            double var18 = this.ak * var12 + this.am * var14;
            if (var18 < 0.0) {
               var12 = -var12;
               var14 = -var14;
            }

            double var20 = Math.sqrt(this.ak * this.ak + this.am * this.am);
            this.ak = var20 * var12 / var16;
            this.am = var20 * var14 / var16;
            double var22 = 0.0;
            double var24 = var1 + 0.5 + var11[0][0] * 0.5;
            double var26 = var3 + 0.5 + var11[0][2] * 0.5;
            double var28 = var1 + 0.5 + var11[1][0] * 0.5;
            double var30 = var3 + 0.5 + var11[1][2] * 0.5;
            var12 = var28 - var24;
            var14 = var30 - var26;
            if (var12 == 0.0) {
               this.ah = var1 + 0.5;
               var22 = this.aj - var3;
            } else if (var14 == 0.0) {
               this.aj = var3 + 0.5;
               var22 = this.ah - var1;
            } else {
               double var32 = this.ah - var24;
               double var34 = this.aj - var26;
               double var36 = (var32 * var12 + var34 * var14) * 2.0;
               var22 = var36;
            }

            this.ah = var24 + var12 * var22;
            this.aj = var26 + var14 * var22;
            this.a(this.ah, this.ai + this.ay, this.aj);
            double var52 = this.ak;
            double var53 = this.am;
            if (this.ab != null) {
               var52 *= 0.75;
               var53 *= 0.75;
            }

            if (var52 < -var4) {
               var52 = -var4;
            }

            if (var52 > var4) {
               var52 = var4;
            }

            if (var53 < -var4) {
               var53 = -var4;
            }

            if (var53 > var4) {
               var53 = var4;
            }

            this.c(var52, 0.0, var53);
            if (var11[0][1] != 0 && Class0118.b(this.ah) - var1 == var11[0][0] && Class0118.b(this.aj) - var3 == var11[0][2]) {
               this.a(this.ah, this.ai + var11[0][1], this.aj);
            } else if (var11[1][1] != 0 && Class0118.b(this.ah) - var1 == var11[1][0] && Class0118.b(this.aj) - var3 == var11[1][2]) {
               this.a(this.ah, this.ai + var11[1][1], this.aj);
            }

            if (this.ab != null) {
               this.ak *= 0.997F;
               this.al *= 0.0;
               this.am *= 0.997F;
            } else {
               if (this.d == 2) {
                  double var54 = Class0118.a(this.f * this.f + this.g * this.g);
                  if (var54 > 0.01) {
                     var6 = true;
                     this.f /= var54;
                     this.g /= var54;
                     double var38 = 0.04;
                     this.ak *= 0.8F;
                     this.al *= 0.0;
                     this.am *= 0.8F;
                     this.ak = this.ak + this.f * var38;
                     this.am = this.am + this.g * var38;
                  } else {
                     this.ak *= 0.9F;
                     this.al *= 0.0;
                     this.am *= 0.9F;
                  }
               }

               this.ak *= 0.96F;
               this.al *= 0.0;
               this.am *= 0.96F;
            }

            Class0009 var55 = this.g(this.ah, this.ai, this.aj);
            if (var55 != null && var9 != null) {
               double var37 = (var9.b - var55.b) * 0.05;
               var20 = Math.sqrt(this.ak * this.ak + this.am * this.am);
               if (var20 > 0.0) {
                  this.ak = this.ak / var20 * (var20 + var37);
                  this.am = this.am / var20 * (var20 + var37);
               }

               this.a(this.ah, var55.b, this.aj);
            }

            int var56 = Class0118.b(this.ah);
            int var57 = Class0118.b(this.aj);
            if (var56 != var1 || var57 != var3) {
               var20 = Math.sqrt(this.ak * this.ak + this.am * this.am);
               this.ak = var20 * (var56 - var1);
               this.am = var20 * (var57 - var3);
            }

            if (this.d == 2) {
               double var39 = Class0118.a(this.f * this.f + this.g * this.g);
               if (var39 > 0.01 && this.ak * this.ak + this.am * this.am > 0.001) {
                  this.f /= var39;
                  this.g /= var39;
                  if (this.f * this.ak + this.g * this.am < 0.0) {
                     this.f = 0.0;
                     this.g = 0.0;
                  } else {
                     this.f = this.ak;
                     this.g = this.am;
                  }
               }
            }
         } else {
            if (this.ak < -var4) {
               this.ak = -var4;
            }

            if (this.ak > var4) {
               this.ak = var4;
            }

            if (this.am < -var4) {
               this.am = -var4;
            }

            if (this.am > var4) {
               this.am = var4;
            }

            if (this.as) {
               this.ak *= 0.5;
               this.al *= 0.5;
               this.am *= 0.5;
            }

            this.c(this.ak, this.al, this.am);
            if (!this.as) {
               this.ak *= 0.95F;
               this.al *= 0.95F;
               this.am *= 0.95F;
            }
         }

         this.ao = 0.0F;
         double var44 = this.ae - this.ah;
         double var45 = this.ag - this.aj;
         if (var44 * var44 + var45 * var45 > 0.001) {
            this.an = (float)(Math.atan2(var45, var44) * 180.0 / Math.PI);
            if (this.i) {
               this.an += 180.0F;
            }
         }

         double var13 = this.an - this.ap;

         while (var13 >= 180.0) {
            var13 -= 360.0;
         }

         while (var13 < -180.0) {
            var13 += 360.0;
         }

         if (var13 < -170.0 || var13 >= 170.0) {
            this.an += 180.0F;
            this.i = !this.i;
         }

         this.c(this.an, this.ao);
         List var15 = this.ad.b(this, this.ar.b(0.2F, 0.0, 0.2F));
         if (var15 != null && var15.size() > 0) {
            for (int var48 = 0; var48 < var15.size(); var48++) {
               Class0268 var17 = (Class0268)var15.get(var48);
               if (var17 != this.ab && var17.d_() && var17 instanceof Class0367) {
                  var17.f(this);
               }
            }
         }

         if (this.ab != null && this.ab.ax) {
            this.ab = null;
         }

         if (var6 && this.aN.nextInt(4) == 0) {
            this.e--;
            if (this.e < 0) {
               this.f = this.g = 0.0;
            }

            this.ad.a("largesmoke", this.ah, this.ai + 0.8, this.aj, 0.0, 0.0, 0.0);
         }
      }
   }

   public Class0009 a(double var1, double var3, double var5, double var7) {
      int var9 = Class0118.b(var1);
      int var10 = Class0118.b(var3);
      int var11 = Class0118.b(var5);
      if (this.ad.a(var9, var10 - 1, var11) == Class0312.aG.ba) {
         var10--;
      }

      if (this.ad.a(var9, var10, var11) == Class0312.aG.ba) {
         int var12 = this.ad.e(var9, var10, var11);
         var3 = var10;
         if (var12 >= 2 && var12 <= 5) {
            var3 = var10 + 1;
         }

         int[][] var13 = j[var12];
         double var14 = var13[1][0] - var13[0][0];
         double var16 = var13[1][2] - var13[0][2];
         double var18 = Math.sqrt(var14 * var14 + var16 * var16);
         var14 /= var18;
         var16 /= var18;
         var1 += var14 * var7;
         var5 += var16 * var7;
         if (var13[0][1] != 0 && Class0118.b(var1) - var9 == var13[0][0] && Class0118.b(var5) - var11 == var13[0][2]) {
            var3 += var13[0][1];
         } else if (var13[1][1] != 0 && Class0118.b(var1) - var9 == var13[1][0] && Class0118.b(var5) - var11 == var13[1][2]) {
            var3 += var13[1][1];
         }

         return this.g(var1, var3, var5);
      } else {
         return null;
      }
   }

   public Class0009 g(double var1, double var3, double var5) {
      int var7 = Class0118.b(var1);
      int var8 = Class0118.b(var3);
      int var9 = Class0118.b(var5);
      if (this.ad.a(var7, var8 - 1, var9) == Class0312.aG.ba) {
         var8--;
      }

      if (this.ad.a(var7, var8, var9) == Class0312.aG.ba) {
         int var10 = this.ad.e(var7, var8, var9);
         var3 = var8;
         if (var10 >= 2 && var10 <= 5) {
            var3 = var8 + 1;
         }

         int[][] var11 = j[var10];
         double var12 = 0.0;
         double var14 = var7 + 0.5 + var11[0][0] * 0.5;
         double var16 = var8 + 0.5 + var11[0][1] * 0.5;
         double var18 = var9 + 0.5 + var11[0][2] * 0.5;
         double var20 = var7 + 0.5 + var11[1][0] * 0.5;
         double var22 = var8 + 0.5 + var11[1][1] * 0.5;
         double var24 = var9 + 0.5 + var11[1][2] * 0.5;
         double var26 = var20 - var14;
         double var28 = (var22 - var16) * 2.0;
         double var30 = var24 - var18;
         if (var26 == 0.0) {
            var1 = var7 + 0.5;
            var12 = var5 - var9;
         } else if (var30 == 0.0) {
            var5 = var9 + 0.5;
            var12 = var1 - var7;
         } else {
            double var32 = var1 - var14;
            double var34 = var5 - var18;
            double var36 = (var32 * var26 + var34 * var30) * 2.0;
            var12 = var36;
         }

         var1 = var14 + var26 * var12;
         var3 = var16 + var28 * var12;
         var5 = var18 + var30 * var12;
         if (var28 < 0.0) {
            var3++;
         }

         if (var28 > 0.0) {
            var3 += 0.5;
         }

         return Class0009.b(var1, var3, var5);
      } else {
         return null;
      }
   }

   @Override
   protected void a(Class0193 var1) {
      var1.a("Type", this.d);
      if (this.d == 2) {
         var1.a("PushX", this.f);
         var1.a("PushZ", this.g);
         var1.a("Fuel", (short)this.e);
      } else if (this.d == 1) {
         Class0269 var2 = new Class0269();

         for (int var3 = 0; var3 < this.h.length; var3++) {
            if (this.h[var3] != null) {
               Class0193 var4 = new Class0193();
               var4.a("Slot", (byte)var3);
               this.h[var3].a(var4);
               var2.a(var4);
            }
         }

         var1.a("Items", var2);
      }
   }

   @Override
   protected void b(Class0193 var1) {
      this.d = var1.e("Type");
      if (this.d == 2) {
         this.f = var1.h("PushX");
         this.g = var1.h("PushZ");
         this.e = var1.d("Fuel");
      } else if (this.d == 1) {
         Class0269 var2 = var1.l("Items");
         this.h = new Class0124[this.a()];

         for (int var3 = 0; var3 < var2.c(); var3++) {
            Class0193 var4 = (Class0193)var2.a(var3);
            int var5 = var4.c("Slot") & 255;
            if (var5 >= 0 && var5 < this.h.length) {
               this.h[var5] = new Class0124(var4);
            }
         }
      }
   }

   @Override
   public float h_() {
      return 0.0F;
   }

   @Override
   public void f(Class0268 var1) {
      if (var1 != this.ab) {
         if (var1 instanceof Class0158
            && !(var1 instanceof Class0089)
            && this.d == 0
            && this.ak * this.ak + this.am * this.am > 0.01
            && this.ab == null
            && var1.ac == null) {
            var1.g(this);
         }

         double var2 = var1.ah - this.ah;
         double var4 = var1.aj - this.aj;
         double var6 = var2 * var2 + var4 * var4;
         if (var6 >= 1.0E-4F) {
            var6 = Class0118.a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0 / var6;
            if (var8 > 1.0) {
               var8 = 1.0;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.1F;
            var4 *= 0.1F;
            var2 *= 1.0F - this.aL;
            var4 *= 1.0F - this.aL;
            var2 *= 0.5;
            var4 *= 0.5;
            if (var1 instanceof Class0367) {
               double var10 = var1.ak + this.ak;
               double var12 = var1.am + this.am;
               if (((Class0367)var1).d == 2 && this.d != 2) {
                  this.ak *= 0.2F;
                  this.am *= 0.2F;
                  this.f(var1.ak - var2, 0.0, var1.am - var4);
                  var1.ak *= 0.7F;
                  var1.am *= 0.7F;
               } else if (((Class0367)var1).d != 2 && this.d == 2) {
                  var1.ak *= 0.2F;
                  var1.am *= 0.2F;
                  var1.f(this.ak + var2, 0.0, this.am + var4);
                  this.ak *= 0.7F;
                  this.am *= 0.7F;
               } else {
                  var10 /= 2.0;
                  var12 /= 2.0;
                  this.ak *= 0.2F;
                  this.am *= 0.2F;
                  this.f(var10 - var2, 0.0, var12 - var4);
                  var1.ak *= 0.2F;
                  var1.am *= 0.2F;
                  var1.f(var10 + var2, 0.0, var12 + var4);
               }
            } else {
               this.f(-var2, 0.0, -var4);
               var1.f(var2 / 4.0, 0.0, var4 / 4.0);
            }
         }
      }
   }

   @Override
   public int a() {
      return 27;
   }

   @Override
   public Class0124 a_(int var1) {
      return this.h[var1];
   }

   @Override
   public Class0124 a(int var1, int var2) {
      if (this.h[var1] != null) {
         if (this.h[var1].a <= var2) {
            Class0124 var4 = this.h[var1];
            this.h[var1] = null;
            return var4;
         }

         Class0124 var3 = this.h[var1].a(var2);
         if (this.h[var1].a == 0) {
            this.h[var1] = null;
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void a(int var1, Class0124 var2) {
      this.h[var1] = var2;
      if (var2 != null && var2.a > this.c()) {
         var2.a = this.c();
      }
   }

   @Override
   public String b() {
      return "Minecart";
   }

   @Override
   public int c() {
      return 64;
   }

   @Override
   public void d() {
   }

   @Override
   public boolean a(Class0089 var1) {
      if (this.d == 0) {
         var1.g(this);
      } else if (this.d == 1) {
         var1.a(this);
      } else if (this.d == 2) {
         Class0124 var2 = var1.b.e();
         if (var2 != null && var2.c == Class0086.k.aQ) {
            if (--var2.a == 0) {
               var1.b.a(var1.b.d, null);
            }

            this.e += 1200;
         }

         this.f = this.ah - var1.ah;
         this.g = this.aj - var1.aj;
      }

      return true;
   }

   @Override
   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.l = var1;
      this.m = var3;
      this.n = var5;
      this.o = var7;
      this.p = var8;
      this.k = var9;
   }
}
