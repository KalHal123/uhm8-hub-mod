package srv;

import java.util.Random;

public class Class314 extends Class371 {
   private boolean field_1409 = true;

   public Class314(int var1, int var2) {
      super(var1, var2, Class111.field_621);
      this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public int method_225() {
      return 5;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return var1.method_604(var2, var3 - 1, var4);
   }

   private void method_352(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      int var6 = 0;
      this.field_1409 = false;
      boolean var7 = var1.method_249(var2, var3, var4);
      this.field_1409 = true;
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

            var6 = this.method_733(var1, var9, var3, var10, var6);
            if (var1.method_604(var9, var3, var10) && !var1.method_604(var2, var3 + 1, var4)) {
               var6 = this.method_733(var1, var9, var3 + 1, var10, var6);
            } else if (!var1.method_604(var9, var3, var10)) {
               var6 = this.method_733(var1, var9, var3 - 1, var10, var6);
            }
         }

         if (var6 > 0) {
            var6--;
         } else {
            var6 = 0;
         }
      }

      if (var5 != var6) {
         var1.method_489(var2, var3, var4, var6);
         var1.method_674(var2, var3, var4, var2, var3, var4);
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

            if (var1.method_604(var15, var3, var16)) {
               var11 += 2;
            }

            int var12 = this.method_733(var1, var15, var3, var16, -1);
            if (var12 >= 0 && var12 != var6) {
               this.method_352(var1, var15, var3, var16);
            }

            var12 = this.method_733(var1, var15, var11, var16, -1);
            if (var12 >= 0 && var12 != var6) {
               this.method_352(var1, var15, var11, var16);
            }
         }

         if (var5 == 0 || var6 == 0) {
            var1.method_922(var2, var3, var4, this.field_1379);
            var1.method_922(var2 - 1, var3, var4, this.field_1379);
            var1.method_922(var2 + 1, var3, var4, this.field_1379);
            var1.method_922(var2, var3, var4 - 1, this.field_1379);
            var1.method_922(var2, var3, var4 + 1, this.field_1379);
            var1.method_922(var2, var3 - 1, var4, this.field_1379);
            var1.method_922(var2, var3 + 1, var4, this.field_1379);
         }
      }
   }

   private void method_421(Class317 var1, int var2, int var3, int var4) {
      if (var1.method_813(var2, var3, var4) == this.field_1379) {
         var1.method_922(var2, var3, var4, this.field_1379);
         var1.method_922(var2 - 1, var3, var4, this.field_1379);
         var1.method_922(var2 + 1, var3, var4, this.field_1379);
         var1.method_922(var2, var3, var4 - 1, this.field_1379);
         var1.method_922(var2, var3, var4 + 1, this.field_1379);
         var1.method_922(var2, var3 - 1, var4, this.field_1379);
         var1.method_922(var2, var3 + 1, var4, this.field_1379);
      }
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      super.method_1013(var1, var2, var3, var4);
      this.method_352(var1, var2, var3, var4);
      var1.method_922(var2, var3 + 1, var4, this.field_1379);
      var1.method_922(var2, var3 - 1, var4, this.field_1379);
      this.method_421(var1, var2 - 1, var3, var4);
      this.method_421(var1, var2 + 1, var3, var4);
      this.method_421(var1, var2, var3, var4 - 1);
      this.method_421(var1, var2, var3, var4 + 1);
      if (var1.method_604(var2 - 1, var3, var4)) {
         this.method_421(var1, var2 - 1, var3 + 1, var4);
      } else {
         this.method_421(var1, var2 - 1, var3 - 1, var4);
      }

      if (var1.method_604(var2 + 1, var3, var4)) {
         this.method_421(var1, var2 + 1, var3 + 1, var4);
      } else {
         this.method_421(var1, var2 + 1, var3 - 1, var4);
      }

      if (var1.method_604(var2, var3, var4 - 1)) {
         this.method_421(var1, var2, var3 + 1, var4 - 1);
      } else {
         this.method_421(var1, var2, var3 - 1, var4 - 1);
      }

      if (var1.method_604(var2, var3, var4 + 1)) {
         this.method_421(var1, var2, var3 + 1, var4 + 1);
      } else {
         this.method_421(var1, var2, var3 - 1, var4 + 1);
      }
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      super.method_650(var1, var2, var3, var4);
      var1.method_922(var2, var3 + 1, var4, this.field_1379);
      var1.method_922(var2, var3 - 1, var4, this.field_1379);
      this.method_352(var1, var2, var3, var4);
      this.method_421(var1, var2 - 1, var3, var4);
      this.method_421(var1, var2 + 1, var3, var4);
      this.method_421(var1, var2, var3, var4 - 1);
      this.method_421(var1, var2, var3, var4 + 1);
      if (var1.method_604(var2 - 1, var3, var4)) {
         this.method_421(var1, var2 - 1, var3 + 1, var4);
      } else {
         this.method_421(var1, var2 - 1, var3 - 1, var4);
      }

      if (var1.method_604(var2 + 1, var3, var4)) {
         this.method_421(var1, var2 + 1, var3 + 1, var4);
      } else {
         this.method_421(var1, var2 + 1, var3 - 1, var4);
      }

      if (var1.method_604(var2, var3, var4 - 1)) {
         this.method_421(var1, var2, var3 + 1, var4 - 1);
      } else {
         this.method_421(var1, var2, var3 - 1, var4 - 1);
      }

      if (var1.method_604(var2, var3, var4 + 1)) {
         this.method_421(var1, var2, var3 + 1, var4 + 1);
      } else {
         this.method_421(var1, var2, var3 - 1, var4 + 1);
      }
   }

   private int method_733(Class317 var1, int var2, int var3, int var4, int var5) {
      if (var1.method_813(var2, var3, var4) != this.field_1379) {
         return var5;
      }

      int var6 = var1.method_929(var2, var3, var4);
      return var6 > var5 ? var6 : var5;
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_929(var2, var3, var4);
      boolean var7 = this.method_769(var1, var2, var3, var4);
      if (!var7) {
         this.method_363(var1, var2, var3, var4, var6);
         var1.method_226(var2, var3, var4, 0);
      } else {
         this.method_352(var1, var2, var3, var4);
      }

      super.method_721(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class350.field_1392.field_473;
   }

   @Override
   public boolean method_391(Class317 var1, int var2, int var3, int var4, int var5) {
      return !this.field_1409 ? false : this.method_743(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_743(Interface351 var1, int var2, int var3, int var4, int var5) {
      if (!this.field_1409) {
         return false;
      }

      if (var1.method_929(var2, var3, var4) == 0) {
         return false;
      }

      if (var5 == 1) {
         return true;
      }

      boolean var6 = method_976(var1, var2 - 1, var3, var4) || !var1.method_604(var2 - 1, var3, var4) && method_976(var1, var2 - 1, var3 - 1, var4);
      boolean var7 = method_976(var1, var2 + 1, var3, var4) || !var1.method_604(var2 + 1, var3, var4) && method_976(var1, var2 + 1, var3 - 1, var4);
      boolean var8 = method_976(var1, var2, var3, var4 - 1) || !var1.method_604(var2, var3, var4 - 1) && method_976(var1, var2, var3 - 1, var4 - 1);
      boolean var9 = method_976(var1, var2, var3, var4 + 1) || !var1.method_604(var2, var3, var4 + 1) && method_976(var1, var2, var3 - 1, var4 + 1);
      if (!var1.method_604(var2, var3 + 1, var4)) {
         if (var1.method_604(var2 - 1, var3, var4) && method_976(var1, var2 - 1, var3 + 1, var4)) {
            var6 = true;
         }

         if (var1.method_604(var2 + 1, var3, var4) && method_976(var1, var2 + 1, var3 + 1, var4)) {
            var7 = true;
         }

         if (var1.method_604(var2, var3, var4 - 1) && method_976(var1, var2, var3 + 1, var4 - 1)) {
            var8 = true;
         }

         if (var1.method_604(var2, var3, var4 + 1) && method_976(var1, var2, var3 + 1, var4 + 1)) {
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
   public boolean method_507() {
      return this.field_1409;
   }

   public static boolean method_976(Interface351 var0, int var1, int var2, int var3) {
      int var4 = var0.method_813(var1, var2, var3);
      return var4 == Class371.field_521.field_1379 ? true : (var4 == 0 ? false : Class371.field_57[var4].method_507());
   }
}
