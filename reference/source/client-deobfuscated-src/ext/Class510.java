package ext;

import java.util.Random;

public class Class510 extends Class722 {
   int field_2800 = 0;
   boolean[] field_3021 = new boolean[4];
   int[] field_2546 = new int[4];

   protected Class510(int var1, Class160 var2) {
      super(var1, var2);
   }

   private void method_751(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      var1.method_307(var2, var3, var4, this.field_2151 + 1, var5);
      var1.method_1678(var2, var3, var4, var2, var3, var4);
      var1.method_892(var2, var3, var4);
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.method_551(var1, var2, var3, var4);
      boolean var7 = true;
      if (var6 > 0) {
         byte var9 = -100;
         this.field_2800 = 0;
         int var10 = this.method_1345(var1, var2 - 1, var3, var4, var9);
         var10 = this.method_1345(var1, var2 + 1, var3, var4, var10);
         var10 = this.method_1345(var1, var2, var3, var4 - 1, var10);
         var10 = this.method_1345(var1, var2, var3, var4 + 1, var10);
         int var8 = var10 + this.field_2217;
         if (var8 >= 8 || var10 < 0) {
            var8 = -1;
         }

         if (this.method_551(var1, var2, var3 + 1, var4) >= 0) {
            int var11 = this.method_551(var1, var2, var3 + 1, var4);
            if (var11 >= 8) {
               var8 = var11;
            } else {
               var8 = var11 + 8;
            }
         }

         if (this.field_2800 >= 2 && this.field_1854 == Class160.field_1413) {
            if (var1.method_768(var2, var3 - 1, var4)) {
               var8 = 0;
            } else if (var1.method_1286(var2, var3 - 1, var4) == this.field_1854 && var1.method_1110(var2, var3, var4) == 0) {
               var8 = 0;
            }
         }

         if (this.field_1854 == Class160.field_3120 && var6 < 8 && var8 < 8 && var8 > var6 && var5.nextInt(4) != 0) {
            var8 = var6;
            var7 = false;
         }

         if (var8 != var6) {
            var6 = var8;
            if (var8 < 0) {
               var1.method_1481(var2, var3, var4, 0);
            } else {
               var1.method_518(var2, var3, var4, var8);
               var1.method_600(var2, var3, var4, this.field_2151);
               var1.method_558(var2, var3, var4, this.field_2151);
            }
         } else if (var7) {
            this.method_751(var1, var2, var3, var4);
         }
      } else {
         this.method_751(var1, var2, var3, var4);
      }

      if (this.method_394(var1, var2, var3 - 1, var4)) {
         if (var6 >= 8) {
            var1.method_1193(var2, var3 - 1, var4, this.field_2151, var6);
         } else {
            var1.method_1193(var2, var3 - 1, var4, this.field_2151, var6 + 8);
         }
      } else if (var6 >= 0 && (var6 == 0 || this.method_447(var1, var2, var3 - 1, var4))) {
         boolean[] var13 = this.method_1244(var1, var2, var3, var4);
         int var12 = var6 + this.field_2217;
         if (var6 >= 8) {
            var12 = 1;
         }

         if (var12 >= 8) {
            return;
         }

         if (var13[0]) {
            this.method_1793(var1, var2 - 1, var3, var4, var12);
         }

         if (var13[1]) {
            this.method_1793(var1, var2 + 1, var3, var4, var12);
         }

         if (var13[2]) {
            this.method_1793(var1, var2, var3, var4 - 1, var12);
         }

         if (var13[3]) {
            this.method_1793(var1, var2, var3, var4 + 1, var12);
         }
      }
   }

   private void method_1793(Class454 var1, int var2, int var3, int var4, int var5) {
      if (this.method_394(var1, var2, var3, var4)) {
         int var6 = var1.method_197(var2, var3, var4);
         if (var6 > 0) {
            if (this.field_1854 == Class160.field_3120) {
               this.method_289(var1, var2, var3, var4);
            } else {
               Class108.field_1221[var6].method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
            }
         }

         var1.method_1193(var2, var3, var4, this.field_2151, var5);
      }
   }

   private int method_1265(Class454 var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for (int var8 = 0; var8 < 4; var8++) {
         if ((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
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

            if (!this.method_447(var1, var9, var3, var10)
               && (var1.method_1286(var9, var3, var10) != this.field_1854 || var1.method_1110(var9, var3, var10) != 0)) {
               if (!this.method_447(var1, var9, var3 - 1, var10)) {
                  return var5;
               }

               if (var5 < 4) {
                  int var11 = this.method_1265(var1, var9, var3, var10, var5 + 1, var8);
                  if (var11 < var7) {
                     var7 = var11;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] method_1244(Class454 var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < 4; var5++) {
         this.field_2546[var5] = 1000;
         int var6 = var2;
         int var7 = var4;
         if (var5 == 0) {
            var6 = var2 - 1;
         }

         if (var5 == 1) {
            var6++;
         }

         if (var5 == 2) {
            var7 = var4 - 1;
         }

         if (var5 == 3) {
            var7++;
         }

         if (!this.method_447(var1, var6, var3, var7) && (var1.method_1286(var6, var3, var7) != this.field_1854 || var1.method_1110(var6, var3, var7) != 0)) {
            if (!this.method_447(var1, var6, var3 - 1, var7)) {
               this.field_2546[var5] = 0;
            } else {
               this.field_2546[var5] = this.method_1265(var1, var6, var3, var7, 1, var5);
            }
         }
      }

      int var8 = this.field_2546[0];

      for (int var9 = 1; var9 < 4; var9++) {
         if (this.field_2546[var9] < var8) {
            var8 = this.field_2546[var9];
         }
      }

      for (int var10 = 0; var10 < 4; var10++) {
         this.field_3021[var10] = this.field_2546[var10] == var8;
      }

      return this.field_3021;
   }

   private boolean method_447(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4);
      if (var5 == Class108.field_1403.field_2151
         || var5 == Class108.field_1979.field_2151
         || var5 == Class108.field_1115.field_2151
         || var5 == Class108.field_2568.field_2151
         || var5 == Class108.field_764.field_2151) {
         return true;
      }

      if (var5 == 0) {
         return false;
      }

      Class160 var6 = Class108.field_1221[var5].field_1854;
      return var6.method_1888();
   }

   protected int method_1345(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.method_551(var1, var2, var3, var4);
      if (var6 < 0) {
         return var5;
      }

      if (var6 == 0) {
         this.field_2800++;
      }

      if (var6 >= 8) {
         var6 = 0;
      }

      return var5 >= 0 && var6 >= var5 ? var5 : var6;
   }

   private boolean method_394(Class454 var1, int var2, int var3, int var4) {
      Class160 var5 = var1.method_1286(var2, var3, var4);
      return var5 == this.field_1854 ? false : (var5 == Class160.field_3120 ? false : !this.method_447(var1, var2, var3, var4));
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      super.method_1937(var1, var2, var3, var4);
      if (var1.method_197(var2, var3, var4) == this.field_2151) {
         var1.method_600(var2, var3, var4, this.field_2151);
      }
   }
}
