import java.util.Random;

public class b extends jk {
   private Random a = new Random();

   protected b(int var1) {
      super(var1, fs.c);
      this.aZ = 26;
   }

   @Override
   public int a(mz var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return this.aZ - 1;
      }

      if (var5 == 0) {
         return this.aZ - 1;
      }

      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      if (var6 != this.ba && var7 != this.ba) {
         if (var8 != this.ba && var9 != this.ba) {
            byte var15 = 3;
            if (ln.p[var6] && !ln.p[var7]) {
               var15 = 3;
            }

            if (ln.p[var7] && !ln.p[var6]) {
               var15 = 2;
            }

            if (ln.p[var8] && !ln.p[var9]) {
               var15 = 5;
            }

            if (ln.p[var9] && !ln.p[var8]) {
               var15 = 4;
            }

            return var5 == var15 ? this.aZ + 1 : this.aZ;
         } else if (var5 != 4 && var5 != 5) {
            int var14 = 0;
            if (var8 == this.ba) {
               var14 = -1;
            }

            int var16 = var1.a(var8 == this.ba ? var2 - 1 : var2 + 1, var3, var4 - 1);
            int var17 = var1.a(var8 == this.ba ? var2 - 1 : var2 + 1, var3, var4 + 1);
            if (var5 == 3) {
               var14 = -1 - var14;
            }

            byte var18 = 3;
            if ((ln.p[var6] || ln.p[var16]) && !ln.p[var7] && !ln.p[var17]) {
               var18 = 3;
            }

            if ((ln.p[var7] || ln.p[var17]) && !ln.p[var6] && !ln.p[var16]) {
               var18 = 2;
            }

            return (var5 == var18 ? this.aZ + 16 : this.aZ + 32) + var14;
         } else {
            return this.aZ;
         }
      } else if (var5 != 2 && var5 != 3) {
         int var10 = 0;
         if (var6 == this.ba) {
            var10 = -1;
         }

         int var11 = var1.a(var2 - 1, var3, var6 == this.ba ? var4 - 1 : var4 + 1);
         int var12 = var1.a(var2 + 1, var3, var6 == this.ba ? var4 - 1 : var4 + 1);
         if (var5 == 4) {
            var10 = -1 - var10;
         }

         byte var13 = 5;
         if ((ln.p[var8] || ln.p[var11]) && !ln.p[var9] && !ln.p[var12]) {
            var13 = 5;
         }

         if ((ln.p[var9] || ln.p[var12]) && !ln.p[var8] && !ln.p[var11]) {
            var13 = 4;
         }

         return (var5 == var13 ? this.aZ + 16 : this.aZ + 32) + var10;
      } else {
         return this.aZ;
      }
   }

   @Override
   public int a(int var1) {
      if (var1 == 1) {
         return this.aZ - 1;
      } else if (var1 == 0) {
         return this.aZ - 1;
      } else {
         return var1 == 3 ? this.aZ + 1 : this.aZ;
      }
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.a(var2 - 1, var3, var4) == this.ba) {
         var5++;
      }

      if (var1.a(var2 + 1, var3, var4) == this.ba) {
         var5++;
      }

      if (var1.a(var2, var3, var4 - 1) == this.ba) {
         var5++;
      }

      if (var1.a(var2, var3, var4 + 1) == this.ba) {
         var5++;
      }

      if (var5 > 1) {
         return false;
      } else if (this.h(var1, var2 - 1, var3, var4)) {
         return false;
      } else if (this.h(var1, var2 + 1, var3, var4)) {
         return false;
      } else {
         return this.h(var1, var2, var3, var4 - 1) ? false : !this.h(var1, var2, var3, var4 + 1);
      }
   }

   private boolean h(cj var1, int var2, int var3, int var4) {
      if (var1.a(var2, var3, var4) != this.ba) {
         return false;
      } else if (var1.a(var2 - 1, var3, var4) == this.ba) {
         return true;
      } else if (var1.a(var2 + 1, var3, var4) == this.ba) {
         return true;
      } else {
         return var1.a(var2, var3, var4 - 1) == this.ba ? true : var1.a(var2, var3, var4 + 1) == this.ba;
      }
   }

   @Override
   public void b(cj var1, int var2, int var3, int var4) {
      ew var5 = (ew)var1.b(var2, var3, var4);

      for (int var6 = 0; var6 < var5.a(); var6++) {
         eo var7 = var5.a_(var6);
         if (var7 != null) {
            float var8 = this.a.nextFloat() * 0.8F + 0.1F;
            float var9 = this.a.nextFloat() * 0.8F + 0.1F;
            float var10 = this.a.nextFloat() * 0.8F + 0.1F;

            while (var7.a > 0) {
               int var11 = this.a.nextInt(21) + 10;
               if (var11 > var7.a) {
                  var11 = var7.a;
               }

               var7.a -= var11;
               dr var12 = new dr(var1, var2 + var8, var3 + var9, var4 + var10, new eo(var7.c, var11, var7.d));
               float var13 = 0.05F;
               var12.ak = (float)this.a.nextGaussian() * var13;
               var12.al = (float)this.a.nextGaussian() * var13 + 0.2F;
               var12.am = (float)this.a.nextGaussian() * var13;
               var1.a(var12);
            }
         }
      }

      super.b(var1, var2, var3, var4);
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4, dg var5) {
      fy var6 = (ew)var1.b(var2, var3, var4);
      if (var1.g(var2, var3 + 1, var4)) {
         return true;
      }

      if (var1.a(var2 - 1, var3, var4) == this.ba && var1.g(var2 - 1, var3 + 1, var4)) {
         return true;
      }

      if (var1.a(var2 + 1, var3, var4) == this.ba && var1.g(var2 + 1, var3 + 1, var4)) {
         return true;
      }

      if (var1.a(var2, var3, var4 - 1) == this.ba && var1.g(var2, var3 + 1, var4 - 1)) {
         return true;
      }

      if (var1.a(var2, var3, var4 + 1) == this.ba && var1.g(var2, var3 + 1, var4 + 1)) {
         return true;
      }

      if (var1.a(var2 - 1, var3, var4) == this.ba) {
         var6 = new hi("Large chest", (ew)var1.b(var2 - 1, var3, var4), var6);
      }

      if (var1.a(var2 + 1, var3, var4) == this.ba) {
         var6 = new hi("Large chest", var6, (ew)var1.b(var2 + 1, var3, var4));
      }

      if (var1.a(var2, var3, var4 - 1) == this.ba) {
         var6 = new hi("Large chest", (ew)var1.b(var2, var3, var4 - 1), var6);
      }

      if (var1.a(var2, var3, var4 + 1) == this.ba) {
         var6 = new hi("Large chest", var6, (ew)var1.b(var2, var3, var4 + 1));
      }

      var5.a(var6);
      return true;
   }

   @Override
   protected ht a_() {
      return new ew();
   }
}
