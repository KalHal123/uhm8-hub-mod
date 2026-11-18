import java.util.Random;

public class jv extends ln {
   private boolean a = true;

   public jv(int var1, int var2) {
      super(var1, var2, fs.n);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   @Override
   public int a(int var1, int var2) {
      return this.aZ + (var2 > 0 ? 16 : 0);
   }

   @Override
   public cb d(cj var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public int f() {
      return 5;
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4);
   }

   private void h(cj var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = 0;
      this.a = false;
      boolean var7 = var1.p(var2, var3, var4);
      this.a = true;
      if (var7) {
         var6 = 15;
      } else {
         for (int var8 = 0; var8 < 4; var8++) {
            int var9 = var2;
            int var10 = var4;
            if (var8 == 0) {
               var9--;
            }

            if (var8 == 1) {
               var9++;
            }

            if (var8 == 2) {
               var10--;
            }

            if (var8 == 3) {
               var10++;
            }

            var6 = this.g(var1, var9, var3, var10, var6);
            if (var1.g(var9, var3, var10) && !var1.g(var2, var3 + 1, var4)) {
               var6 = this.g(var1, var9, var3 + 1, var10, var6);
            } else if (!var1.g(var9, var3, var10)) {
               var6 = this.g(var1, var9, var3 - 1, var10, var6);
            }
         }

         if (var6 > 0) {
            var6--;
         } else {
            var6 = 0;
         }
      }

      if (var5 != var6) {
         var1.b(var2, var3, var4, var6);
         var1.b(var2, var3, var4, var2, var3, var4);
         if (var6 > 0) {
            var6--;
         }

         for (int var14 = 0; var14 < 4; var14++) {
            int var15 = var2;
            int var16 = var4;
            int var11 = var3 - 1;
            if (var14 == 0) {
               var15--;
            }

            if (var14 == 1) {
               var15++;
            }

            if (var14 == 2) {
               var16--;
            }

            if (var14 == 3) {
               var16++;
            }

            if (var1.g(var15, var3, var16)) {
               var11 += 2;
            }

            int var12 = this.g(var1, var15, var3, var16, -1);
            if (var12 >= 0 && var12 != var6) {
               this.h(var1, var15, var3, var16);
            }

            var12 = this.g(var1, var15, var11, var16, -1);
            if (var12 >= 0 && var12 != var6) {
               this.h(var1, var15, var11, var16);
            }
         }

         if (var5 == 0 || var6 == 0) {
            var1.g(var2, var3, var4, this.ba);
            var1.g(var2 - 1, var3, var4, this.ba);
            var1.g(var2 + 1, var3, var4, this.ba);
            var1.g(var2, var3, var4 - 1, this.ba);
            var1.g(var2, var3, var4 + 1, this.ba);
            var1.g(var2, var3 - 1, var4, this.ba);
            var1.g(var2, var3 + 1, var4, this.ba);
         }
      }
   }

   private void i(cj var1, int var2, int var3, int var4) {
      if (var1.a(var2, var3, var4) == this.ba) {
         var1.g(var2, var3, var4, this.ba);
         var1.g(var2 - 1, var3, var4, this.ba);
         var1.g(var2 + 1, var3, var4, this.ba);
         var1.g(var2, var3, var4 - 1, this.ba);
         var1.g(var2, var3, var4 + 1, this.ba);
         var1.g(var2, var3 - 1, var4, this.ba);
         var1.g(var2, var3 + 1, var4, this.ba);
      }
   }

   @Override
   public void e(cj var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      this.h(var1, var2, var3, var4);
      var1.g(var2, var3 + 1, var4, this.ba);
      var1.g(var2, var3 - 1, var4, this.ba);
      this.i(var1, var2 - 1, var3, var4);
      this.i(var1, var2 + 1, var3, var4);
      this.i(var1, var2, var3, var4 - 1);
      this.i(var1, var2, var3, var4 + 1);
      if (var1.g(var2 - 1, var3, var4)) {
         this.i(var1, var2 - 1, var3 + 1, var4);
      } else {
         this.i(var1, var2 - 1, var3 - 1, var4);
      }

      if (var1.g(var2 + 1, var3, var4)) {
         this.i(var1, var2 + 1, var3 + 1, var4);
      } else {
         this.i(var1, var2 + 1, var3 - 1, var4);
      }

      if (var1.g(var2, var3, var4 - 1)) {
         this.i(var1, var2, var3 + 1, var4 - 1);
      } else {
         this.i(var1, var2, var3 - 1, var4 - 1);
      }

      if (var1.g(var2, var3, var4 + 1)) {
         this.i(var1, var2, var3 + 1, var4 + 1);
      } else {
         this.i(var1, var2, var3 - 1, var4 + 1);
      }
   }

   @Override
   public void b(cj var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      var1.g(var2, var3 + 1, var4, this.ba);
      var1.g(var2, var3 - 1, var4, this.ba);
      this.h(var1, var2, var3, var4);
      this.i(var1, var2 - 1, var3, var4);
      this.i(var1, var2 + 1, var3, var4);
      this.i(var1, var2, var3, var4 - 1);
      this.i(var1, var2, var3, var4 + 1);
      if (var1.g(var2 - 1, var3, var4)) {
         this.i(var1, var2 - 1, var3 + 1, var4);
      } else {
         this.i(var1, var2 - 1, var3 - 1, var4);
      }

      if (var1.g(var2 + 1, var3, var4)) {
         this.i(var1, var2 + 1, var3 + 1, var4);
      } else {
         this.i(var1, var2 + 1, var3 - 1, var4);
      }

      if (var1.g(var2, var3, var4 - 1)) {
         this.i(var1, var2, var3 + 1, var4 - 1);
      } else {
         this.i(var1, var2, var3 - 1, var4 - 1);
      }

      if (var1.g(var2, var3, var4 + 1)) {
         this.i(var1, var2, var3 + 1, var4 + 1);
      } else {
         this.i(var1, var2, var3 - 1, var4 + 1);
      }
   }

   private int g(cj var1, int var2, int var3, int var4, int var5) {
      if (var1.a(var2, var3, var4) != this.ba) {
         return var5;
      }

      int var6 = var1.e(var2, var3, var4);
      return var6 > var5 ? var6 : var5;
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = this.a(var1, var2, var3, var4);
      if (!var7) {
         this.b_(var1, var2, var3, var4, var6);
         var1.d(var2, var3, var4, 0);
      } else {
         this.h(var1, var2, var3, var4);
      }

      super.a(var1, var2, var3, var4, var5);
   }

   @Override
   public int a(int var1, Random var2) {
      return dd.aA.aQ;
   }

   @Override
   public boolean c(cj var1, int var2, int var3, int var4, int var5) {
      return !this.a ? false : this.b(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean b(mz var1, int var2, int var3, int var4, int var5) {
      if (!this.a) {
         return false;
      }

      if (var1.e(var2, var3, var4) == 0) {
         return false;
      }

      if (var5 == 1) {
         return true;
      }

      boolean var6 = b(var1, var2 - 1, var3, var4) || !var1.g(var2 - 1, var3, var4) && b(var1, var2 - 1, var3 - 1, var4);
      boolean var7 = b(var1, var2 + 1, var3, var4) || !var1.g(var2 + 1, var3, var4) && b(var1, var2 + 1, var3 - 1, var4);
      boolean var8 = b(var1, var2, var3, var4 - 1) || !var1.g(var2, var3, var4 - 1) && b(var1, var2, var3 - 1, var4 - 1);
      boolean var9 = b(var1, var2, var3, var4 + 1) || !var1.g(var2, var3, var4 + 1) && b(var1, var2, var3 - 1, var4 + 1);
      if (!var1.g(var2, var3 + 1, var4)) {
         if (var1.g(var2 - 1, var3, var4) && b(var1, var2 - 1, var3 + 1, var4)) {
            var6 = true;
         }

         if (var1.g(var2 + 1, var3, var4) && b(var1, var2 + 1, var3 + 1, var4)) {
            var7 = true;
         }

         if (var1.g(var2, var3, var4 - 1) && b(var1, var2, var3 + 1, var4 - 1)) {
            var8 = true;
         }

         if (var1.g(var2, var3, var4 + 1) && b(var1, var2, var3 + 1, var4 + 1)) {
            var9 = true;
         }
      }

      if (!var8 && !var7 && !var6 && !var9 && var5 >= 2 && var5 <= 5) {
         return true;
      } else if (var5 == 2 && var8 && !var6 && !var7) {
         return true;
      } else if (var5 == 3 && var9 && !var6 && !var7) {
         return true;
      } else {
         return var5 == 4 && var6 && !var8 && !var9 ? true : var5 == 5 && var7 && !var8 && !var9;
      }
   }

   @Override
   public boolean d() {
      return this.a;
   }

   @Override
   public void b(cj var1, int var2, int var3, int var4, Random var5) {
      if (var1.e(var2, var3, var4) > 0) {
         double var6 = var2 + 0.5 + (var5.nextFloat() - 0.5) * 0.2;
         double var8 = var3 + 0.0625F;
         double var10 = var4 + 0.5 + (var5.nextFloat() - 0.5) * 0.2;
         var1.a("reddust", var6, var8, var10, 0.0, 0.0, 0.0);
      }
   }

   public static boolean b(mz var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if (var4 == ln.av.ba) {
         return true;
      } else {
         return var4 == 0 ? false : ln.n[var4].d();
      }
   }
}
