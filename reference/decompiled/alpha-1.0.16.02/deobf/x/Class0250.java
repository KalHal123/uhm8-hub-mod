package x;

import java.util.Random;

public abstract class Class0250 extends Class0312 {
   protected int d = 1;

   protected Class0250(int var1, Class0155 var2) {
      super(var1, (var2 == Class0155.g ? 14 : 12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      if (var2 == Class0155.g) {
         this.d = 2;
      }

      this.a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.b(true);
   }

   public static float b(int var0) {
      if (var0 >= 8) {
         var0 = 0;
      }

      return (var0 + 1) / 9.0F;
   }

   @Override
   public int a(int var1) {
      return var1 != 0 && var1 != 1 ? this.aZ + 1 : this.aZ;
   }

   protected int h(Class0065 var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4) != this.bl ? -1 : var1.e(var2, var3, var4);
   }

   protected int b(Class0351 var1, int var2, int var3, int var4) {
      if (var1.f(var2, var3, var4) != this.bl) {
         return -1;
      }

      int var5 = var1.e(var2, var3, var4);
      if (var5 >= 8) {
         var5 = 0;
      }

      return var5;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public boolean a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   @Override
   public boolean c(Class0351 var1, int var2, int var3, int var4, int var5) {
      Class0155 var6 = var1.f(var2, var3, var4);
      if (var6 == this.bl) {
         return false;
      } else if (var6 == Class0155.r) {
         return false;
      } else {
         return var5 == 1 ? true : super.c(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public Class0057 d(Class0065 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int f() {
      return 4;
   }

   @Override
   public int a(int var1, Random var2) {
      return 0;
   }

   @Override
   public int a(Random var1) {
      return 0;
   }

   private Class0009 e(Class0351 var1, int var2, int var3, int var4) {
      Class0009 var5 = Class0009.b(0.0, 0.0, 0.0);
      int var6 = this.b(var1, var2, var3, var4);

      for (int var7 = 0; var7 < 4; var7++) {
         int var8 = var2;
         int var9 = var3;
         int var10 = var4;
         if (var7 == 0) {
            var8--;
         }

         if (var7 == 1) {
            var10--;
         }

         if (var7 == 2) {
            var8++;
         }

         if (var7 == 3) {
            var10++;
         }

         int var11 = this.b(var1, var8, var9, var10);
         if (var11 < 0) {
            if (!var1.f(var8, var9, var10).c()) {
               var11 = this.b(var1, var8, var9 - 1, var10);
               if (var11 >= 0) {
                  int var12 = var11 - (var6 - 8);
                  var5 = var5.c((var8 - var2) * var12, (var9 - var3) * var12, (var10 - var4) * var12);
               }
            }
         } else if (var11 >= 0) {
            int var15 = var11 - var6;
            var5 = var5.c((var8 - var2) * var15, (var9 - var3) * var15, (var10 - var4) * var15);
         }
      }

      if (var1.e(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if (var13 || this.c(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if (var13 || this.c(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if (var13 || this.c(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if (var13 || this.c(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if (var13 || this.c(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if (var13 || this.c(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if (var13 || this.c(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if (var13 || this.c(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if (var13) {
            var5 = var5.b().c(0.0, -6.0, 0.0);
         }
      }

      return var5.b();
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Class0268 var5, Class0009 var6) {
      Class0009 var7 = this.e((Class0351)var1, var2, var3, var4);
      var6.a = var6.a + var7.a;
      var6.b = var6.b + var7.b;
      var6.c = var6.c + var7.c;
   }

   @Override
   public int a() {
      if (this.bl == Class0155.f) {
         return 5;
      } else {
         return this.bl == Class0155.g ? 30 : 0;
      }
   }

   @Override
   public float c(Class0351 var1, int var2, int var3, int var4) {
      float var5 = var1.c(var2, var3, var4);
      float var6 = var1.c(var2, var3 + 1, var4);
      return var5 > var6 ? var5 : var6;
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   @Override
   public int g() {
      return this.bl == Class0155.f ? 1 : 0;
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (this.bl == Class0155.f && var5.nextInt(64) == 0) {
         int var6 = var1.e(var2, var3, var4);
         if (var6 > 0 && var6 < 8) {
            var1.a(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F);
         }
      }

      if (this.bl == Class0155.g && var1.f(var2, var3 + 1, var4) == Class0155.a && !var1.g(var2, var3 + 1, var4) && var5.nextInt(100) == 0) {
         double var12 = var2 + var5.nextFloat();
         double var8 = var3 + this.bh;
         double var10 = var4 + var5.nextFloat();
         var1.a("lava", var12, var8, var10, 0.0, 0.0, 0.0);
      }
   }

   public static double a(Class0351 var0, int var1, int var2, int var3, Class0155 var4) {
      Class0009 var5 = null;
      if (var4 == Class0155.f) {
         var5 = ((Class0250)Class0312.A).e(var0, var1, var2, var3);
      }

      if (var4 == Class0155.g) {
         var5 = ((Class0250)Class0312.C).e(var0, var1, var2, var3);
      }

      return var5.a == 0.0 && var5.c == 0.0 ? -1000.0 : Math.atan2(var5.c, var5.a) - (Math.PI / 2);
   }

   @Override
   public void e(Class0065 var1, int var2, int var3, int var4) {
      this.j(var1, var2, var3, var4);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      this.j(var1, var2, var3, var4);
   }

   private void j(Class0065 var1, int var2, int var3, int var4) {
      if (var1.a(var2, var3, var4) == this.ba) {
         if (this.bl == Class0155.g) {
            boolean var5 = false;
            if (var5 || var1.f(var2, var3, var4 - 1) == Class0155.f) {
               var5 = true;
            }

            if (var5 || var1.f(var2, var3, var4 + 1) == Class0155.f) {
               var5 = true;
            }

            if (var5 || var1.f(var2 - 1, var3, var4) == Class0155.f) {
               var5 = true;
            }

            if (var5 || var1.f(var2 + 1, var3, var4) == Class0155.f) {
               var5 = true;
            }

            if (var5 || var1.f(var2, var3 + 1, var4) == Class0155.f) {
               var5 = true;
            }

            if (var5) {
               int var6 = var1.e(var2, var3, var4);
               if (var6 == 0) {
                  var1.d(var2, var3, var4, Class0312.ap.ba);
               } else if (var6 <= 4) {
                  var1.d(var2, var3, var4, Class0312.w.ba);
               }

               this.i(var1, var2, var3, var4);
            }
         }
      }
   }

   protected void i(Class0065 var1, int var2, int var3, int var4) {
      var1.a(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "random.fizz", 0.5F, 2.6F + (var1.m.nextFloat() - var1.m.nextFloat()) * 0.8F);

      for (int var5 = 0; var5 < 8; var5++) {
         var1.a("largesmoke", var2 + Math.random(), var3 + 1.2, var4 + Math.random(), 0.0, 0.0, 0.0);
      }
   }
}
