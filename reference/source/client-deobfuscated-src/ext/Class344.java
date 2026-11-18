package ext;

import java.util.Random;

public class Class344 extends Class75 {
   int field_1701 = 0;
   boolean[] field_667 = new boolean[4];
   int[] field_1777 = new int[4];

   protected Class344(int var1, Class160 var2) {
      super(var1, var2);
   }

   private void j(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      var1.method_307(var2, var3, var4, this.field_19 + 1, var5);
      var1.method_1678(var2, var3, var4, var2, var3, var4);
      var1.method_892(var2, var3, var4);
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.method_1450(var1, var2, var3, var4);
      boolean var7 = true;
      if (var6 > 0) {
         int var8 = -100;
         this.field_1701 = 0;
         var8 = this.method_1893(var1, var2 - 1, var3, var4, var8);
         var8 = this.method_1893(var1, var2 + 1, var3, var4, var8);
         var8 = this.method_1893(var1, var2, var3, var4 - 1, var8);
         var8 = this.method_1893(var1, var2, var3, var4 + 1, var8);
         int var9 = var8 + this.field_633;
         if (var9 >= 8 || var8 < 0) {
            var9 = -1;
         }

         if (this.method_1450(var1, var2, var3 + 1, var4) >= 0) {
            int var10 = this.method_1450(var1, var2, var3 + 1, var4);
            if (var10 >= 8) {
               var9 = var10;
            } else {
               var9 = var10 + 8;
            }
         }

         if (this.field_1701 >= 2 && this.field_1201 == Class160.field_1413) {
            if (var1.method_768(var2, var3 - 1, var4)) {
               var9 = 0;
            } else if (var1.method_1286(var2, var3 - 1, var4) == this.field_1201 && var1.method_1110(var2, var3, var4) == 0) {
               var9 = 0;
            }
         }

         if (this.field_1201 == Class160.field_3120 && var6 < 8 && var9 < 8 && var9 > var6 && var5.nextInt(4) != 0) {
            var9 = var6;
            var7 = false;
         }

         if (var9 != var6) {
            var6 = var9;
            if (var6 < 0) {
               var1.method_1481(var2, var3, var4, 0);
            } else {
               var1.method_518(var2, var3, var4, var6);
               var1.method_600(var2, var3, var4, this.field_19);
               var1.method_558(var2, var3, var4, this.field_19);
            }
         } else if (var7) {
            this.j(var1, var2, var3, var4);
         }
      } else {
         this.j(var1, var2, var3, var4);
      }

      if (this.method_274(var1, var2, var3 - 1, var4)) {
         if (var6 >= 8) {
            var1.method_1193(var2, var3 - 1, var4, this.field_19, var6);
         } else {
            var1.method_1193(var2, var3 - 1, var4, this.field_19, var6 + 8);
         }
      } else if (var6 >= 0 && (var6 == 0 || this.method_1158(var1, var2, var3 - 1, var4))) {
         boolean[] var15 = this.method_775(var1, var2, var3, var4);
         int var16 = var6 + this.field_633;
         if (var6 >= 8) {
            var16 = 1;
         }

         if (var16 >= 8) {
            return;
         }

         if (var15[0]) {
            this.method_479(var1, var2 - 1, var3, var4, var16);
         }

         if (var15[1]) {
            this.method_479(var1, var2 + 1, var3, var4, var16);
         }

         if (var15[2]) {
            this.method_479(var1, var2, var3, var4 - 1, var16);
         }

         if (var15[3]) {
            this.method_479(var1, var2, var3, var4 + 1, var16);
         }
      }
   }

   private void method_479(Class454 var1, int var2, int var3, int var4, int var5) {
      if (this.method_274(var1, var2, var3, var4)) {
         int var6 = var1.method_197(var2, var3, var4);
         if (var6 > 0) {
            if (this.field_1201 == Class160.field_3120) {
               this.method_396(var1, var2, var3, var4);
            } else {
               Class407.field_495[var6].method_1227(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
            }
         }

         var1.method_1193(var2, var3, var4, this.field_19, var5);
      }
   }

   private int method_680(Class454 var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for (int var8 = 0; var8 < 4; var8++) {
         if ((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
            int var9 = var2;
            int var10 = var3;
            int var11 = var4;
            if (var8 == 0) {
               var9--;
            }

            if (var8 == 1) {
               var9++;
            }

            if (var8 == 2) {
               var11--;
            }

            if (var8 == 3) {
               var11++;
            }

            if (!this.method_1158(var1, var9, var10, var11)
               && (var1.method_1286(var9, var10, var11) != this.field_1201 || var1.method_1110(var9, var10, var11) != 0)) {
               if (!this.method_1158(var1, var9, var10 - 1, var11)) {
                  return var5;
               }

               if (var5 < 4) {
                  int var12 = this.method_680(var1, var9, var10, var11, var5 + 1, var8);
                  if (var12 < var7) {
                     var7 = var12;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] method_775(Class454 var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < 4; var5++) {
         this.field_1777[var5] = 1000;
         int var6 = var2;
         int var7 = var3;
         int var8 = var4;
         if (var5 == 0) {
            var6--;
         }

         if (var5 == 1) {
            var6++;
         }

         if (var5 == 2) {
            var8--;
         }

         if (var5 == 3) {
            var8++;
         }

         if (!this.method_1158(var1, var6, var7, var8) && (var1.method_1286(var6, var7, var8) != this.field_1201 || var1.method_1110(var6, var7, var8) != 0)) {
            if (!this.method_1158(var1, var6, var7 - 1, var8)) {
               this.field_1777[var5] = 0;
            } else {
               this.field_1777[var5] = this.method_680(var1, var6, var7, var8, 1, var5);
            }
         }
      }

      int var9 = this.field_1777[0];

      for (int var10 = 1; var10 < 4; var10++) {
         if (this.field_1777[var10] < var9) {
            var9 = this.field_1777[var10];
         }
      }

      for (int var11 = 0; var11 < 4; var11++) {
         this.field_667[var11] = this.field_1777[var11] == var9;
      }

      return this.field_667;
   }

   private boolean method_1158(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4);
      if (var5 == Class407.field_2343.field_19
         || var5 == Class407.field_319.field_19
         || var5 == Class407.field_752.field_19
         || var5 == Class407.field_828.field_19
         || var5 == Class407.field_138.field_19) {
         return true;
      }

      if (var5 == 0) {
         return false;
      }

      Class160 var6 = Class407.field_495[var5].field_1201;
      return var6.method_1888();
   }

   protected int method_1893(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.method_1450(var1, var2, var3, var4);
      if (var6 < 0) {
         return var5;
      }

      if (var6 == 0) {
         this.field_1701++;
      }

      if (var6 >= 8) {
         var6 = 0;
      }

      return var5 >= 0 && var6 >= var5 ? var5 : var6;
   }

   private boolean method_274(Class454 var1, int var2, int var3, int var4) {
      Class160 var5 = var1.method_1286(var2, var3, var4);
      if (var5 == this.field_1201) {
         return false;
      } else {
         return var5 == Class160.field_3120 ? false : !this.method_1158(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      super.method_1592(var1, var2, var3, var4);
      if (var1.method_197(var2, var3, var4) == this.field_19) {
         var1.method_600(var2, var3, var4, this.field_19);
      }
   }
}
