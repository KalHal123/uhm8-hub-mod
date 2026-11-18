package ext;

import java.util.Random;

public class Class176 extends Class108 {
   private boolean field_373 = true;

   public Class176(int var1, int var2) {
      super(var1, var2, Class160.field_1787);
      this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   @Override
   public int method_774(int var1, int var2) {
      return this.field_2972 + (var2 > 0 ? 16 : 0);
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public int method_1900() {
      return 5;
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2, var3 - 1, var4);
   }

   private void method_204(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      int var6 = 0;
      this.field_373 = false;
      boolean var7 = var1.method_266(var2, var3, var4);
      this.field_373 = true;
      if (var7) {
         var6 = 15;
      } else {
         for (int var8 = 0; var8 < 4; var8++) {
            int var9 = var2;
            int var10 = var4;
            if (var8 == 0) {
               var9 = var2 - 1;
            }

            if (var8 == 1) {
               var9++;
            }

            if (var8 == 2) {
               var10 = var4 - 1;
            }

            if (var8 == 3) {
               var10++;
            }

            var6 = this.method_317(var1, var9, var3, var10, var6);
            if (var1.method_768(var9, var3, var10) && !var1.method_768(var2, var3 + 1, var4)) {
               var6 = this.method_317(var1, var9, var3 + 1, var10, var6);
            } else if (!var1.method_768(var9, var3, var10)) {
               var6 = this.method_317(var1, var9, var3 - 1, var10, var6);
            }
         }

         if (var6 > 0) {
            var6--;
         } else {
            var6 = 0;
         }
      }

      if (var5 != var6) {
         var1.method_518(var2, var3, var4, var6);
         var1.method_1678(var2, var3, var4, var2, var3, var4);
         if (var6 > 0) {
            var6--;
         }

         for (int var14 = 0; var14 < 4; var14++) {
            int var15 = var2;
            int var16 = var4;
            int var11 = var3 - 1;
            if (var14 == 0) {
               var15 = var2 - 1;
            }

            if (var14 == 1) {
               var15++;
            }

            if (var14 == 2) {
               var16 = var4 - 1;
            }

            if (var14 == 3) {
               var16++;
            }

            if (var1.method_768(var15, var3, var16)) {
               var11 += 2;
            }

            int var12 = this.method_317(var1, var15, var3, var16, -1);
            if (var12 >= 0 && var12 != var6) {
               this.method_204(var1, var15, var3, var16);
            }

            var12 = this.method_317(var1, var15, var11, var16, -1);
            if (var12 >= 0 && var12 != var6) {
               this.method_204(var1, var15, var11, var16);
            }
         }

         if (var5 == 0 || var6 == 0) {
            var1.method_558(var2, var3, var4, this.field_2151);
            var1.method_558(var2 - 1, var3, var4, this.field_2151);
            var1.method_558(var2 + 1, var3, var4, this.field_2151);
            var1.method_558(var2, var3, var4 - 1, this.field_2151);
            var1.method_558(var2, var3, var4 + 1, this.field_2151);
            var1.method_558(var2, var3 - 1, var4, this.field_2151);
            var1.method_558(var2, var3 + 1, var4, this.field_2151);
         }
      }
   }

   private void method_757(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_197(var2, var3, var4) == this.field_2151) {
         var1.method_558(var2, var3, var4, this.field_2151);
         var1.method_558(var2 - 1, var3, var4, this.field_2151);
         var1.method_558(var2 + 1, var3, var4, this.field_2151);
         var1.method_558(var2, var3, var4 - 1, this.field_2151);
         var1.method_558(var2, var3, var4 + 1, this.field_2151);
         var1.method_558(var2, var3 - 1, var4, this.field_2151);
         var1.method_558(var2, var3 + 1, var4, this.field_2151);
      }
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      super.method_1937(var1, var2, var3, var4);
      this.method_204(var1, var2, var3, var4);
      var1.method_558(var2, var3 + 1, var4, this.field_2151);
      var1.method_558(var2, var3 - 1, var4, this.field_2151);
      this.method_757(var1, var2 - 1, var3, var4);
      this.method_757(var1, var2 + 1, var3, var4);
      this.method_757(var1, var2, var3, var4 - 1);
      this.method_757(var1, var2, var3, var4 + 1);
      if (var1.method_768(var2 - 1, var3, var4)) {
         this.method_757(var1, var2 - 1, var3 + 1, var4);
      } else {
         this.method_757(var1, var2 - 1, var3 - 1, var4);
      }

      if (var1.method_768(var2 + 1, var3, var4)) {
         this.method_757(var1, var2 + 1, var3 + 1, var4);
      } else {
         this.method_757(var1, var2 + 1, var3 - 1, var4);
      }

      if (var1.method_768(var2, var3, var4 - 1)) {
         this.method_757(var1, var2, var3 + 1, var4 - 1);
      } else {
         this.method_757(var1, var2, var3 - 1, var4 - 1);
      }

      if (var1.method_768(var2, var3, var4 + 1)) {
         this.method_757(var1, var2, var3 + 1, var4 + 1);
      } else {
         this.method_757(var1, var2, var3 - 1, var4 + 1);
      }
   }

   @Override
   public void method_1736(Class454 var1, int var2, int var3, int var4) {
      super.method_1736(var1, var2, var3, var4);
      var1.method_558(var2, var3 + 1, var4, this.field_2151);
      var1.method_558(var2, var3 - 1, var4, this.field_2151);
      this.method_204(var1, var2, var3, var4);
      this.method_757(var1, var2 - 1, var3, var4);
      this.method_757(var1, var2 + 1, var3, var4);
      this.method_757(var1, var2, var3, var4 - 1);
      this.method_757(var1, var2, var3, var4 + 1);
      if (var1.method_768(var2 - 1, var3, var4)) {
         this.method_757(var1, var2 - 1, var3 + 1, var4);
      } else {
         this.method_757(var1, var2 - 1, var3 - 1, var4);
      }

      if (var1.method_768(var2 + 1, var3, var4)) {
         this.method_757(var1, var2 + 1, var3 + 1, var4);
      } else {
         this.method_757(var1, var2 + 1, var3 - 1, var4);
      }

      if (var1.method_768(var2, var3, var4 - 1)) {
         this.method_757(var1, var2, var3 + 1, var4 - 1);
      } else {
         this.method_757(var1, var2, var3 - 1, var4 - 1);
      }

      if (var1.method_768(var2, var3, var4 + 1)) {
         this.method_757(var1, var2, var3 + 1, var4 + 1);
      } else {
         this.method_757(var1, var2, var3 - 1, var4 + 1);
      }
   }

   private int method_317(Class454 var1, int var2, int var3, int var4, int var5) {
      if (var1.method_197(var2, var3, var4) != this.field_2151) {
         return var5;
      }

      int var6 = var1.method_1110(var2, var3, var4);
      return var6 > var5 ? var6 : var5;
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      boolean var7 = this.method_432(var1, var2, var3, var4);
      if (!var7) {
         this.method_625(var1, var2, var3, var4, var6);
         var1.method_1481(var2, var3, var4, 0);
      } else {
         this.method_204(var1, var2, var3, var4);
      }

      super.method_1464(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class755.field_1672.field_10;
   }

   @Override
   public boolean method_926(Class454 var1, int var2, int var3, int var4, int var5) {
      return !this.field_373 ? false : this.method_16(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_16(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (!this.field_373) {
         return false;
      }

      if (var1.method_1110(var2, var3, var4) == 0) {
         return false;
      }

      if (var5 == 1) {
         return true;
      }

      boolean var6 = method_556(var1, var2 - 1, var3, var4) || !var1.method_768(var2 - 1, var3, var4) && method_556(var1, var2 - 1, var3 - 1, var4);
      boolean var7 = method_556(var1, var2 + 1, var3, var4) || !var1.method_768(var2 + 1, var3, var4) && method_556(var1, var2 + 1, var3 - 1, var4);
      boolean var8 = method_556(var1, var2, var3, var4 - 1) || !var1.method_768(var2, var3, var4 - 1) && method_556(var1, var2, var3 - 1, var4 - 1);
      boolean var9 = method_556(var1, var2, var3, var4 + 1) || !var1.method_768(var2, var3, var4 + 1) && method_556(var1, var2, var3 - 1, var4 + 1);
      if (!var1.method_768(var2, var3 + 1, var4)) {
         if (var1.method_768(var2 - 1, var3, var4) && method_556(var1, var2 - 1, var3 + 1, var4)) {
            var6 = true;
         }

         if (var1.method_768(var2 + 1, var3, var4) && method_556(var1, var2 + 1, var3 + 1, var4)) {
            var7 = true;
         }

         if (var1.method_768(var2, var3, var4 - 1) && method_556(var1, var2, var3 + 1, var4 - 1)) {
            var8 = true;
         }

         if (var1.method_768(var2, var3, var4 + 1) && method_556(var1, var2, var3 + 1, var4 + 1)) {
            var9 = true;
         }
      }

      return !var8 && !var7 && !var6 && !var9 && var5 >= 2 && var5 <= 5
         ? true
         : (
            var5 == 2 && var8 && !var6 && !var7
               ? true
               : (var5 == 3 && var9 && !var6 && !var7 ? true : (var5 == 4 && var6 && !var8 && !var9 ? true : var5 == 5 && var7 && !var8 && !var9))
         );
   }

   @Override
   public boolean method_40() {
      return this.field_373;
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1110(var2, var3, var4) > 0) {
         double var6 = var2 + 0.5 + (var5.nextFloat() - 0.5) * 0.2;
         double var8 = var3 + 0.0625F;
         double var10 = var4 + 0.5 + (var5.nextFloat() - 0.5) * 0.2;
         var1.method_1347("reddust", var6, var8, var10, 0.0, 0.0, 0.0);
      }
   }

   public static boolean method_556(Interface698 var0, int var1, int var2, int var3) {
      int var4 = var0.method_197(var1, var2, var3);
      return var4 == Class108.field_2512.field_2151 ? true : (var4 == 0 ? false : Class108.field_1221[var4].method_40());
   }
}
