package srv;

import java.util.Random;

public class Class366 extends Class195 {
   int field_189 = 0;
   boolean[] field_762 = new boolean[4];
   int[] field_556 = new int[4];

   protected Class366(int var1, Class111 var2) {
      super(var1, var2);
   }

   private void i(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      var1.method_662(var2, var3, var4, this.field_1379 + 1, var5);
      var1.method_674(var2, var3, var4, var2, var3, var4);
      var1.method_473(var2, var3, var4);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.method_144(var1, var2, var3, var4);
      boolean var7 = true;
      if (var6 > 0) {
         byte var9 = -100;
         this.field_189 = 0;
         int var10 = this.method_1015(var1, var2 - 1, var3, var4, var9);
         var10 = this.method_1015(var1, var2 + 1, var3, var4, var10);
         var10 = this.method_1015(var1, var2, var3, var4 - 1, var10);
         var10 = this.method_1015(var1, var2, var3, var4 + 1, var10);
         int var8 = var10 + this.field_482;
         if (var8 >= 8 || var10 < 0) {
            var8 = -1;
         }

         if (this.method_144(var1, var2, var3 + 1, var4) >= 0) {
            int var11 = this.method_144(var1, var2, var3 + 1, var4);
            if (var11 >= 8) {
               var8 = var11;
            } else {
               var8 = var11 + 8;
            }
         }

         if (this.field_189 >= 2 && this.field_658 == Class111.field_1394) {
            if (var1.method_604(var2, var3 - 1, var4)) {
               var8 = 0;
            } else if (var1.method_149(var2, var3 - 1, var4) == this.field_658 && var1.method_929(var2, var3, var4) == 0) {
               var8 = 0;
            }
         }

         if (this.field_658 == Class111.field_306 && var6 < 8 && var8 < 8 && var8 > var6 && var5.nextInt(4) != 0) {
            var8 = var6;
            var7 = false;
         }

         if (var8 != var6) {
            var6 = var8;
            if (var8 < 0) {
               var1.method_226(var2, var3, var4, 0);
            } else {
               var1.method_489(var2, var3, var4, var8);
               var1.method_809(var2, var3, var4, this.field_1379);
               var1.method_922(var2, var3, var4, this.field_1379);
            }
         } else if (var7) {
            this.i(var1, var2, var3, var4);
         }
      } else {
         this.i(var1, var2, var3, var4);
      }

      if (this.method_632(var1, var2, var3 - 1, var4)) {
         if (var6 >= 8) {
            var1.method_86(var2, var3 - 1, var4, this.field_1379, var6);
         } else {
            var1.method_86(var2, var3 - 1, var4, this.field_1379, var6 + 8);
         }
      } else if (var6 >= 0 && (var6 == 0 || this.method_524(var1, var2, var3 - 1, var4))) {
         boolean[] var13 = this.method_690(var1, var2, var3, var4);
         int var12 = var6 + this.field_482;
         if (var6 >= 8) {
            var12 = 1;
         }

         if (var12 >= 8) {
            return;
         }

         if (var13[0]) {
            this.method_663(var1, var2 - 1, var3, var4, var12);
         }

         if (var13[1]) {
            this.method_663(var1, var2 + 1, var3, var4, var12);
         }

         if (var13[2]) {
            this.method_663(var1, var2, var3, var4 - 1, var12);
         }

         if (var13[3]) {
            this.method_663(var1, var2, var3, var4 + 1, var12);
         }
      }
   }

   private void method_663(Class317 var1, int var2, int var3, int var4, int var5) {
      if (this.method_632(var1, var2, var3, var4)) {
         int var6 = var1.method_813(var2, var3, var4);
         if (var6 > 0) {
            if (this.field_658 == Class111.field_306) {
               this.method_627(var1, var2, var3, var4);
            } else {
               Class371.field_57[var6].method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
            }
         }

         var1.method_86(var2, var3, var4, this.field_1379, var5);
      }
   }

   private int method_900(Class317 var1, int var2, int var3, int var4, int var5, int var6) {
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

            if (!this.method_524(var1, var9, var3, var10) && (var1.method_149(var9, var3, var10) != this.field_658 || var1.method_929(var9, var3, var10) != 0)) {
               if (!this.method_524(var1, var9, var3 - 1, var10)) {
                  return var5;
               }

               if (var5 < 4) {
                  int var11 = this.method_900(var1, var9, var3, var10, var5 + 1, var8);
                  if (var11 < var7) {
                     var7 = var11;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] method_690(Class317 var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < 4; var5++) {
         this.field_556[var5] = 1000;
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

         if (!this.method_524(var1, var6, var3, var7) && (var1.method_149(var6, var3, var7) != this.field_658 || var1.method_929(var6, var3, var7) != 0)) {
            if (!this.method_524(var1, var6, var3 - 1, var7)) {
               this.field_556[var5] = 0;
            } else {
               this.field_556[var5] = this.method_900(var1, var6, var3, var7, 1, var5);
            }
         }
      }

      int var8 = this.field_556[0];

      for (int var9 = 1; var9 < 4; var9++) {
         if (this.field_556[var9] < var8) {
            var8 = this.field_556[var9];
         }
      }

      for (int var10 = 0; var10 < 4; var10++) {
         this.field_762[var10] = this.field_556[var10] == var8;
      }

      return this.field_762;
   }

   private boolean method_524(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3, var4);
      if (var5 == Class371.field_9.field_1379
         || var5 == Class371.field_654.field_1379
         || var5 == Class371.field_1456.field_1379
         || var5 == Class371.field_83.field_1379
         || var5 == Class371.field_963.field_1379) {
         return true;
      }

      if (var5 == 0) {
         return false;
      }

      Class111 var6 = Class371.field_57[var5].field_658;
      return var6.method_325();
   }

   protected int method_1015(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.method_144(var1, var2, var3, var4);
      if (var6 < 0) {
         return var5;
      }

      if (var6 == 0) {
         this.field_189++;
      }

      if (var6 >= 8) {
         var6 = 0;
      }

      return var5 >= 0 && var6 >= var5 ? var5 : var6;
   }

   private boolean method_632(Class317 var1, int var2, int var3, int var4) {
      Class111 var5 = var1.method_149(var2, var3, var4);
      return var5 == this.field_658 ? false : (var5 == Class111.field_306 ? false : !this.method_524(var1, var2, var3, var4));
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      super.method_1013(var1, var2, var3, var4);
      if (var1.method_813(var2, var3, var4) == this.field_1379) {
         var1.method_809(var2, var3, var4, this.field_1379);
      }
   }
}
