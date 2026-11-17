package ext;

import java.util.Random;

public class Class561 extends Class407 {
   private boolean field_1186 = true;

   public Class561(int var1, int var2) {
      super(var1, var2, Class160.field_1787);
      this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   @Override
   public int method_1411(int var1, int var2) {
      return this.field_2119 + (var2 > 0 ? 16 : 0);
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public int method_178() {
      return 5;
   }

   @Override
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2, var3 - 1, var4);
   }

   private void method_634(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      int var6 = 0;
      this.field_1186 = false;
      boolean var7 = var1.method_266(var2, var3, var4);
      this.field_1186 = true;
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

            var6 = this.method_1298(var1, var9, var3, var10, var6);
            if (var1.method_768(var9, var3, var10) && !var1.method_768(var2, var3 + 1, var4)) {
               var6 = this.method_1298(var1, var9, var3 + 1, var10, var6);
            } else if (!var1.method_768(var9, var3, var10)) {
               var6 = this.method_1298(var1, var9, var3 - 1, var10, var6);
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

            if (var1.method_768(var15, var3, var16)) {
               var11 += 2;
            }

            int var12 = this.method_1298(var1, var15, var3, var16, -1);
            if (var12 >= 0 && var12 != var6) {
               this.method_634(var1, var15, var3, var16);
            }

            var12 = this.method_1298(var1, var15, var11, var16, -1);
            if (var12 >= 0 && var12 != var6) {
               this.method_634(var1, var15, var11, var16);
            }
         }

         if (var5 == 0 || var6 == 0) {
            var1.method_558(var2, var3, var4, this.field_19);
            var1.method_558(var2 - 1, var3, var4, this.field_19);
            var1.method_558(var2 + 1, var3, var4, this.field_19);
            var1.method_558(var2, var3, var4 - 1, this.field_19);
            var1.method_558(var2, var3, var4 + 1, this.field_19);
            var1.method_558(var2, var3 - 1, var4, this.field_19);
            var1.method_558(var2, var3 + 1, var4, this.field_19);
         }
      }
   }

   private void method_545(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_197(var2, var3, var4) == this.field_19) {
         var1.method_558(var2, var3, var4, this.field_19);
         var1.method_558(var2 - 1, var3, var4, this.field_19);
         var1.method_558(var2 + 1, var3, var4, this.field_19);
         var1.method_558(var2, var3, var4 - 1, this.field_19);
         var1.method_558(var2, var3, var4 + 1, this.field_19);
         var1.method_558(var2, var3 - 1, var4, this.field_19);
         var1.method_558(var2, var3 + 1, var4, this.field_19);
      }
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      super.method_1592(var1, var2, var3, var4);
      this.method_634(var1, var2, var3, var4);
      var1.method_558(var2, var3 + 1, var4, this.field_19);
      var1.method_558(var2, var3 - 1, var4, this.field_19);
      this.method_545(var1, var2 - 1, var3, var4);
      this.method_545(var1, var2 + 1, var3, var4);
      this.method_545(var1, var2, var3, var4 - 1);
      this.method_545(var1, var2, var3, var4 + 1);
      if (var1.method_768(var2 - 1, var3, var4)) {
         this.method_545(var1, var2 - 1, var3 + 1, var4);
      } else {
         this.method_545(var1, var2 - 1, var3 - 1, var4);
      }

      if (var1.method_768(var2 + 1, var3, var4)) {
         this.method_545(var1, var2 + 1, var3 + 1, var4);
      } else {
         this.method_545(var1, var2 + 1, var3 - 1, var4);
      }

      if (var1.method_768(var2, var3, var4 - 1)) {
         this.method_545(var1, var2, var3 + 1, var4 - 1);
      } else {
         this.method_545(var1, var2, var3 - 1, var4 - 1);
      }

      if (var1.method_768(var2, var3, var4 + 1)) {
         this.method_545(var1, var2, var3 + 1, var4 + 1);
      } else {
         this.method_545(var1, var2, var3 - 1, var4 + 1);
      }
   }

   @Override
   public void method_1617(Class454 var1, int var2, int var3, int var4) {
      super.method_1617(var1, var2, var3, var4);
      var1.method_558(var2, var3 + 1, var4, this.field_19);
      var1.method_558(var2, var3 - 1, var4, this.field_19);
      this.method_634(var1, var2, var3, var4);
      this.method_545(var1, var2 - 1, var3, var4);
      this.method_545(var1, var2 + 1, var3, var4);
      this.method_545(var1, var2, var3, var4 - 1);
      this.method_545(var1, var2, var3, var4 + 1);
      if (var1.method_768(var2 - 1, var3, var4)) {
         this.method_545(var1, var2 - 1, var3 + 1, var4);
      } else {
         this.method_545(var1, var2 - 1, var3 - 1, var4);
      }

      if (var1.method_768(var2 + 1, var3, var4)) {
         this.method_545(var1, var2 + 1, var3 + 1, var4);
      } else {
         this.method_545(var1, var2 + 1, var3 - 1, var4);
      }

      if (var1.method_768(var2, var3, var4 - 1)) {
         this.method_545(var1, var2, var3 + 1, var4 - 1);
      } else {
         this.method_545(var1, var2, var3 - 1, var4 - 1);
      }

      if (var1.method_768(var2, var3, var4 + 1)) {
         this.method_545(var1, var2, var3 + 1, var4 + 1);
      } else {
         this.method_545(var1, var2, var3 - 1, var4 + 1);
      }
   }

   private int method_1298(Class454 var1, int var2, int var3, int var4, int var5) {
      if (var1.method_197(var2, var3, var4) != this.field_19) {
         return var5;
      }

      int var6 = var1.method_1110(var2, var3, var4);
      return var6 > var5 ? var6 : var5;
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      boolean var7 = this.method_1531(var1, var2, var3, var4);
      if (!var7) {
         this.method_1227(var1, var2, var3, var4, var6);
         var1.method_1481(var2, var3, var4, 0);
      } else {
         this.method_634(var1, var2, var3, var4);
      }

      super.method_1300(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class755.field_1672.field_10;
   }

   @Override
   public boolean method_1031(Class454 var1, int var2, int var3, int var4, int var5) {
      return !this.field_1186 ? false : this.method_866(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_866(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (!this.field_1186) {
         return false;
      }

      if (var1.method_1110(var2, var3, var4) == 0) {
         return false;
      }

      if (var5 == 1) {
         return true;
      }

      boolean var6 = method_929(var1, var2 - 1, var3, var4) || !var1.method_768(var2 - 1, var3, var4) && method_929(var1, var2 - 1, var3 - 1, var4);
      boolean var7 = method_929(var1, var2 + 1, var3, var4) || !var1.method_768(var2 + 1, var3, var4) && method_929(var1, var2 + 1, var3 - 1, var4);
      boolean var8 = method_929(var1, var2, var3, var4 - 1) || !var1.method_768(var2, var3, var4 - 1) && method_929(var1, var2, var3 - 1, var4 - 1);
      boolean var9 = method_929(var1, var2, var3, var4 + 1) || !var1.method_768(var2, var3, var4 + 1) && method_929(var1, var2, var3 - 1, var4 + 1);
      if (!var1.method_768(var2, var3 + 1, var4)) {
         if (var1.method_768(var2 - 1, var3, var4) && method_929(var1, var2 - 1, var3 + 1, var4)) {
            var6 = true;
         }

         if (var1.method_768(var2 + 1, var3, var4) && method_929(var1, var2 + 1, var3 + 1, var4)) {
            var7 = true;
         }

         if (var1.method_768(var2, var3, var4 - 1) && method_929(var1, var2, var3 + 1, var4 - 1)) {
            var8 = true;
         }

         if (var1.method_768(var2, var3, var4 + 1) && method_929(var1, var2, var3 + 1, var4 + 1)) {
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
   public boolean method_3() {
      return this.field_1186;
   }

   @Override
   public void method_453(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1110(var2, var3, var4) > 0) {
         double var6 = var2 + 0.5 + (var5.nextFloat() - 0.5) * 0.2;
         double var8 = var3 + 0.0625F;
         double var10 = var4 + 0.5 + (var5.nextFloat() - 0.5) * 0.2;
         var1.method_1347("reddust", var6, var8, var10, 0.0, 0.0, 0.0);
      }
   }

   public static boolean method_929(Interface698 var0, int var1, int var2, int var3) {
      int var4 = var0.method_197(var1, var2, var3);
      if (var4 == Class407.field_2141.field_19) {
         return true;
      } else {
         return var4 == 0 ? false : Class407.field_495[var4].method_3();
      }
   }
}
