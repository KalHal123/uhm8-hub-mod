import java.util.Random;

public class ns extends ln {
   private int[] a = new int[256];
   private int[] b = new int[256];

   protected ns(int var1, int var2) {
      super(var1, var2, fs.l);
      this.a(ln.x.ba, 5, 20);
      this.a(ln.J.ba, 5, 5);
      this.a(ln.K.ba, 30, 60);
      this.a(ln.an.ba, 30, 20);
      this.a(ln.am.ba, 15, 100);
      this.a(ln.ab.ba, 30, 60);
      this.b(true);
   }

   private void a(int var1, int var2, int var3) {
      this.a[var1] = var2;
      this.b[var1] = var3;
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
      return 3;
   }

   @Override
   public int a(Random var1) {
      return 0;
   }

   @Override
   public int a() {
      return 10;
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      if (var6 < 15) {
         var1.b(var2, var3, var4, var6 + 1);
         var1.h(var2, var3, var4, this.ba);
      }

      if (!this.h(var1, var2, var3, var4)) {
         if (!var1.g(var2, var3 - 1, var4) || var6 > 3) {
            var1.d(var2, var3, var4, 0);
         }
      } else if (!this.b(var1, var2, var3 - 1, var4) && var6 == 15 && var5.nextInt(4) == 0) {
         var1.d(var2, var3, var4, 0);
      } else {
         if (var6 % 2 == 0 && var6 > 2) {
            this.a(var1, var2 + 1, var3, var4, 300, var5);
            this.a(var1, var2 - 1, var3, var4, 300, var5);
            this.a(var1, var2, var3 - 1, var4, 200, var5);
            this.a(var1, var2, var3 + 1, var4, 250, var5);
            this.a(var1, var2, var3, var4 - 1, 300, var5);
            this.a(var1, var2, var3, var4 + 1, 300, var5);

            for (int var7 = var2 - 1; var7 <= var2 + 1; var7++) {
               for (int var8 = var4 - 1; var8 <= var4 + 1; var8++) {
                  for (int var9 = var3 - 1; var9 <= var3 + 4; var9++) {
                     if (var7 != var2 || var9 != var3 || var8 != var4) {
                        int var10 = 100;
                        if (var9 > var3 + 1) {
                           var10 += (var9 - (var3 + 1)) * 100;
                        }

                        int var11 = this.i(var1, var7, var9, var8);
                        if (var11 > 0 && var5.nextInt(var10) <= var11) {
                           var1.d(var7, var9, var8, this.ba);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cj var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = this.b[var1.a(var2, var3, var4)];
      if (var6.nextInt(var5) < var7) {
         boolean var8 = var1.a(var2, var3, var4) == ln.am.ba;
         if (var6.nextInt(2) == 0) {
            var1.d(var2, var3, var4, this.ba);
         } else {
            var1.d(var2, var3, var4, 0);
         }

         if (var8) {
            ln.am.b(var1, var2, var3, var4, 0);
         }
      }
   }

   private boolean h(cj var1, int var2, int var3, int var4) {
      if (this.b(var1, var2 + 1, var3, var4)) {
         return true;
      } else if (this.b(var1, var2 - 1, var3, var4)) {
         return true;
      } else if (this.b(var1, var2, var3 - 1, var4)) {
         return true;
      } else if (this.b(var1, var2, var3 + 1, var4)) {
         return true;
      } else {
         return this.b(var1, var2, var3, var4 - 1) ? true : this.b(var1, var2, var3, var4 + 1);
      }
   }

   private int i(cj var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.a(var2, var3, var4) != 0) {
         return 0;
      }

      var5 = this.g(var1, var2 + 1, var3, var4, var5);
      var5 = this.g(var1, var2 - 1, var3, var4, var5);
      var5 = this.g(var1, var2, var3 - 1, var4, var5);
      var5 = this.g(var1, var2, var3 + 1, var4, var5);
      var5 = this.g(var1, var2, var3, var4 - 1, var5);
      return this.g(var1, var2, var3, var4 + 1, var5);
   }

   @Override
   public boolean h() {
      return false;
   }

   public boolean b(mz var1, int var2, int var3, int var4) {
      return this.a[var1.a(var2, var3, var4)] > 0;
   }

   public int g(cj var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a[var1.a(var2, var3, var4)];
      return var6 > var5 ? var6 : var5;
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4) || this.h(var1, var2, var3, var4);
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, int var5) {
      if (!var1.g(var2, var3 - 1, var4) && !this.h(var1, var2, var3, var4)) {
         var1.d(var2, var3, var4, 0);
      }
   }

   @Override
   public void e(cj var1, int var2, int var3, int var4) {
      if (!var1.g(var2, var3 - 1, var4) && !this.h(var1, var2, var3, var4)) {
         var1.d(var2, var3, var4, 0);
      } else {
         var1.h(var2, var3, var4, this.ba);
      }
   }

   @Override
   public void b(cj var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(24) == 0) {
         var1.a(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F);
      }

      if (!var1.g(var2, var3 - 1, var4) && !ln.ar.b(var1, var2, var3 - 1, var4)) {
         if (ln.ar.b(var1, var2 - 1, var3, var4)) {
            for (int var10 = 0; var10 < 2; var10++) {
               float var15 = var2 + var5.nextFloat() * 0.1F;
               float var20 = var3 + var5.nextFloat();
               float var25 = var4 + var5.nextFloat();
               var1.a("largesmoke", var15, var20, var25, 0.0, 0.0, 0.0);
            }
         }

         if (ln.ar.b(var1, var2 + 1, var3, var4)) {
            for (int var11 = 0; var11 < 2; var11++) {
               float var16 = var2 + 1 - var5.nextFloat() * 0.1F;
               float var21 = var3 + var5.nextFloat();
               float var26 = var4 + var5.nextFloat();
               var1.a("largesmoke", var16, var21, var26, 0.0, 0.0, 0.0);
            }
         }

         if (ln.ar.b(var1, var2, var3, var4 - 1)) {
            for (int var12 = 0; var12 < 2; var12++) {
               float var17 = var2 + var5.nextFloat();
               float var22 = var3 + var5.nextFloat();
               float var27 = var4 + var5.nextFloat() * 0.1F;
               var1.a("largesmoke", var17, var22, var27, 0.0, 0.0, 0.0);
            }
         }

         if (ln.ar.b(var1, var2, var3, var4 + 1)) {
            for (int var13 = 0; var13 < 2; var13++) {
               float var18 = var2 + var5.nextFloat();
               float var23 = var3 + var5.nextFloat();
               float var28 = var4 + 1 - var5.nextFloat() * 0.1F;
               var1.a("largesmoke", var18, var23, var28, 0.0, 0.0, 0.0);
            }
         }

         if (ln.ar.b(var1, var2, var3 + 1, var4)) {
            for (int var14 = 0; var14 < 2; var14++) {
               float var19 = var2 + var5.nextFloat();
               float var24 = var3 + 1 - var5.nextFloat() * 0.1F;
               float var29 = var4 + var5.nextFloat();
               var1.a("largesmoke", var19, var24, var29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int var6 = 0; var6 < 3; var6++) {
            float var7 = var2 + var5.nextFloat();
            float var8 = var3 + var5.nextFloat() * 0.5F + 0.5F;
            float var9 = var4 + var5.nextFloat();
            var1.a("largesmoke", var7, var8, var9, 0.0, 0.0, 0.0);
         }
      }
   }
}
