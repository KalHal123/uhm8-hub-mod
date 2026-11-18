package srv;

import java.util.Random;

public class Class65 implements Interface14 {
   private final Class345 field_367;
   private final Class345 field_40;
   private final Class345 field_81;

   public Class65(Random var1) {
      this.field_367 = new Class345(var1);
      this.field_40 = new Class345(var1);
      this.field_81 = new Class345(var1);
   }

   @Override
   public float method_449() {
      return 1.0F;
   }

   private Class65.Inner285 method_235(int var1, int var2, int var3, int var4) {
      int var5 = var1 * 5436345 + var2 * -12416265;
      int var6 = var3 * 4256285 + var4 * -82344232;
      double var7 = this.field_40.method_78(var5 / 634.0, var6 / 634.0);
      if (var7 < 0.0) {
         var7 = -var7;
      }

      if (var7 > 1.0) {
         var7 %= 1.0;
      }

      if (var7 < 0.3) {
         return Class65.Inner285.field_256;
      } else if (var7 < 0.4) {
         return Class65.Inner285.field_769;
      } else if (var7 < 0.5) {
         return Class65.Inner285.field_127;
      } else if (var7 < 0.6) {
         return Class65.Inner285.field_175;
      } else if (var7 < 0.7) {
         return Class65.Inner285.field_673;
      } else if (var7 < 0.8) {
         return Class65.Inner285.field_734;
      } else {
         return var7 < 0.9 ? Class65.Inner285.field_1049 : Class65.Inner285.field_256;
      }
   }

   private void method_682() {
   }

   private Class65.Inner285[] method_468(int var1, int var2, int var3) {
      return new Class65.Inner285[]{
         this.method_235(var1, var2, var3, 0), this.method_235(var1, var2, var3, 1), this.method_235(var1, var2, var3, 2), this.method_235(var1, var2, var3, 3)
      };
   }

   private boolean method_686(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3, var4);
      return var5 != 0 && Class371.field_57[var5].method_491() && Class371.field_57[var5].method_138() && Class371.field_57[var5].method_786();
   }

   private boolean method_369(Class317 var1, int var2, int var3, int var4) {
      int var5 = 256;

      for (int var6 = 0; var6 < 8; var6++) {
         for (int var7 = 0; var7 < 15; var7++) {
            for (int var8 = 0; var8 < 15; var8++) {
               if (this.method_686(var1, var2 * 16 + var7, var3 + var6, var4 * 16 + var8)) {
                  if (--var5 == 0) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }

   private void method_251(Class317 var1, int var2, int var3, int var4, int var5) {
      for (int var6 = var4; var6 >= 0; var6--) {
         if (this.method_686(var1, var3, var6, var5)) {
            return;
         }

         var1.method_260(var3, var6, var5, var2);
      }
   }

   private void method_482(Class317 var1, int var2, int var3, int var4, int var5, int var6, int var7, Class371 var8, int var9, int var10) {
      switch (var9) {
         case 0:
            var2 += 11;
            var3++;
            var4 += 7;
            var2 += var5;
            var3 += var6;
            var4 += var7;
            break;
         case 1:
            var2 += 8;
            var3++;
            var4 += 11;
            var2 -= var7;
            var3 += var6;
            var4 += var5;
            break;
         case 2:
            var2 += 7;
            var3++;
            var4 += 4;
            var2 += var7;
            var3 += var6;
            var4 -= var5;
            break;
         case 3:
            var2 += 4;
            var3++;
            var4 += 8;
            var2 -= var5;
            var3 += var6;
            var4 -= var7;
      }

      var1.method_662(var2, var3, var4, var8.field_1379, var9);
      var1.method_662(var2, var3 + 1, var4, var8.field_1379, var9 + 8 + var10);
   }

   private void method_869(Class317 var1, int var2, int var3, int var4, int var5, int var6, int var7, Class371 var8, int var9) {
      switch (var9) {
         case 0:
            var2 += 11;
            var3++;
            var4 += 7;
            var2 += var5;
            var3 += var6;
            var4 += var7;
            break;
         case 1:
            var2 += 8;
            var3++;
            var4 += 11;
            var2 -= var7;
            var3 += var6;
            var4 += var5;
            break;
         case 2:
            var2 += 7;
            var3++;
            var4 += 4;
            var2 += var7;
            var3 += var6;
            var4 -= var5;
            break;
         case 3:
            var2 += 4;
            var3++;
            var4 += 8;
            var2 -= var5;
            var3 += var6;
            var4 -= var7;
      }

      var1.method_260(var2, var3, var4, var8.field_1379);
   }

   private void method_62(Class317 var1, int var2, int var3, int var4, Class81 var5) {
      if (!var5.method_722(Class65.class, var2, var4)) {
      }

      int var6 = var2 * 16;
      int var7 = var4 * 16;

      for (int var8 = 7; var8 > 0; var8--) {
         var1.method_260(var6 + 2, var3 + var8, var7 + 2, Class323.field_250.field_1379);
         var1.method_260(var6 + 2, var3 + var8, var7 + 13, Class323.field_250.field_1379);
         var1.method_260(var6 + 13, var3 + var8, var7 + 2, Class323.field_250.field_1379);
         var1.method_260(var6 + 13, var3 + var8, var7 + 13, Class323.field_250.field_1379);
         if (var8 != 7) {
            for (int var9 = 3; var9 <= 12; var9++) {
               int var10 = var9 >= 6 && var9 <= 9 ? 1 : 0;
               if (var10 != 0 || var8 < 5) {
                  var1.method_260(var6 + var9, var3 + var8, var7 + 3 + var10, Class323.field_883.field_1379);
                  var1.method_260(var6 + var9, var3 + var8, var7 + 12 - var10, Class323.field_883.field_1379);
               }
            }

            for (int var20 = 4; var20 <= 11; var20++) {
               int var25 = var20 >= 6 && var20 <= 9 ? 1 : 0;
               if (var25 != 0 || var8 < 5) {
                  var1.method_260(var6 + 3 + var25, var3 + var8, var7 + var20, Class323.field_883.field_1379);
                  var1.method_260(var6 + 12 - var25, var3 + var8, var7 + var20, Class323.field_883.field_1379);
               }
            }
         }
      }

      for (int var13 = 2; var13 <= 13; var13++) {
         for (int var21 = 2; var21 <= 13; var21++) {
            var1.method_260(var6 + var13, var3, var7 + var21, Class323.field_1129.field_1379);
         }
      }

      for (int var14 = 1; var14 < 15; var14++) {
         for (int var22 = 7; var22 <= 8; var22++) {
            var1.method_260(var6 + var14, var3 + 7, var7 + var22, Class323.field_1085.field_1379);
            var1.method_260(var6 + var22, var3 + 7, var7 + var14, Class323.field_1085.field_1379);
         }
      }

      for (int var15 = 5; var15 <= 10; var15++) {
         for (int var23 = 5; var23 <= 10; var23++) {
            var1.method_260(var6 + var15, var3 + 7, var7 + var23, Class323.field_1085.field_1379);
         }
      }

      for (int var16 = 0; var16 < 4; var16++) {
         var1.method_260(var6 + 4 - var16, var3 + 6, var7 + 6, Class323.field_1085.field_1379);
         var1.method_260(var6 + 4 - var16, var3 + 6, var7 + 9, Class323.field_1085.field_1379);
         var1.method_260(var6 + 11 + var16, var3 + 6, var7 + 6, Class323.field_1085.field_1379);
         var1.method_260(var6 + 11 + var16, var3 + 6, var7 + 9, Class323.field_1085.field_1379);
         var1.method_260(var6 + 6, var3 + 6, var7 + 4 - var16, Class323.field_1085.field_1379);
         var1.method_260(var6 + 9, var3 + 6, var7 + 4 - var16, Class323.field_1085.field_1379);
         var1.method_260(var6 + 6, var3 + 6, var7 + 11 + var16, Class323.field_1085.field_1379);
         var1.method_260(var6 + 9, var3 + 6, var7 + 11 + var16, Class323.field_1085.field_1379);
      }

      var1.method_260(var6 + 4, var3 + 6, var7 + 4, Class323.field_1085.field_1379);
      var1.method_260(var6 + 4, var3 + 6, var7 + 5, Class323.field_1085.field_1379);
      var1.method_260(var6 + 5, var3 + 6, var7 + 4, Class323.field_1085.field_1379);
      var1.method_260(var6 + 11, var3 + 6, var7 + 11, Class323.field_1085.field_1379);
      var1.method_260(var6 + 10, var3 + 6, var7 + 11, Class323.field_1085.field_1379);
      var1.method_260(var6 + 11, var3 + 6, var7 + 10, Class323.field_1085.field_1379);
      var1.method_260(var6 + 11, var3 + 6, var7 + 4, Class323.field_1085.field_1379);
      var1.method_260(var6 + 10, var3 + 6, var7 + 4, Class323.field_1085.field_1379);
      var1.method_260(var6 + 11, var3 + 6, var7 + 5, Class323.field_1085.field_1379);
      var1.method_260(var6 + 4, var3 + 6, var7 + 11, Class323.field_1085.field_1379);
      var1.method_260(var6 + 5, var3 + 6, var7 + 11, Class323.field_1085.field_1379);
      var1.method_260(var6 + 4, var3 + 6, var7 + 10, Class323.field_1085.field_1379);

      for (int var17 = 0; var17 < 3; var17++) {
         var1.method_260(var6 + 3 - var17, var3 + 5, var7 + 5, Class323.field_1085.field_1379);
         var1.method_260(var6 + 3 - var17, var3 + 5, var7 + 10, Class323.field_1085.field_1379);
         var1.method_260(var6 + 12 + var17, var3 + 5, var7 + 5, Class323.field_1085.field_1379);
         var1.method_260(var6 + 12 + var17, var3 + 5, var7 + 10, Class323.field_1085.field_1379);
         var1.method_260(var6 + 5, var3 + 5, var7 + 3 - var17, Class323.field_1085.field_1379);
         var1.method_260(var6 + 10, var3 + 5, var7 + 3 - var17, Class323.field_1085.field_1379);
         var1.method_260(var6 + 5, var3 + 5, var7 + 12 + var17, Class323.field_1085.field_1379);
         var1.method_260(var6 + 10, var3 + 5, var7 + 12 + var17, Class323.field_1085.field_1379);
      }

      for (int var18 = 0; var18 < 2; var18++) {
         var1.method_260(var6 + 4, var3 + 5, var7 + 3 - var18, Class323.field_1085.field_1379);
         var1.method_260(var6 + 3, var3 + 5, var7 + 3 - var18, Class323.field_1085.field_1379);
         var1.method_260(var6 + 3 - var18, var3 + 5, var7 + 4, Class323.field_1085.field_1379);
         var1.method_260(var6 + 3 - var18, var3 + 5, var7 + 3, Class323.field_1085.field_1379);
         var1.method_260(var6 + 11, var3 + 5, var7 + 12 + var18, Class323.field_1085.field_1379);
         var1.method_260(var6 + 12, var3 + 5, var7 + 12 + var18, Class323.field_1085.field_1379);
         var1.method_260(var6 + 12 + var18, var3 + 5, var7 + 11, Class323.field_1085.field_1379);
         var1.method_260(var6 + 12 + var18, var3 + 5, var7 + 12, Class323.field_1085.field_1379);
         var1.method_260(var6 + 4, var3 + 5, var7 + 12 + var18, Class323.field_1085.field_1379);
         var1.method_260(var6 + 3, var3 + 5, var7 + 12 + var18, Class323.field_1085.field_1379);
         var1.method_260(var6 + 3 - var18, var3 + 5, var7 + 11, Class323.field_1085.field_1379);
         var1.method_260(var6 + 3 - var18, var3 + 5, var7 + 12, Class323.field_1085.field_1379);
         var1.method_260(var6 + 11, var3 + 5, var7 + 3 - var18, Class323.field_1085.field_1379);
         var1.method_260(var6 + 12, var3 + 5, var7 + 3 - var18, Class323.field_1085.field_1379);
         var1.method_260(var6 + 12 + var18, var3 + 5, var7 + 4, Class323.field_1085.field_1379);
         var1.method_260(var6 + 12 + var18, var3 + 5, var7 + 3, Class323.field_1085.field_1379);
      }

      int var19 = var3 / 8;
      Class65.Inner285[] var24 = this.method_468(var2, var19, var4);

      for (int var26 = 0; var26 < 4; var26++) {
         switch (var24[var26]) {
            case field_127:
               this.method_869(var1, var6, var3, var7, 0, 1, 0, Class371.field_605, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 0, Class371.field_605, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 0, Class371.field_605, var26);
               this.method_869(var1, var6, var3, var7, 0, 1, 1, Class371.field_605, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 1, Class371.field_605, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 1, Class371.field_605, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, -1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 0, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 2, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 0, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 3, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, -2, Class323.field_1085, var26);
               break;
            case field_175:
               this.method_869(var1, var6, var3, var7, 0, 1, 0, Class323.field_564, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 0, Class323.field_564, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 0, Class323.field_564, var26);
               this.method_869(var1, var6, var3, var7, 0, 1, 1, Class323.field_564, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 1, Class323.field_564, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 1, Class323.field_564, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, -1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 0, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 2, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 0, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 3, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, -2, Class323.field_1085, var26);
               break;
            case field_1309:
               this.method_869(var1, var6, var3, var7, 0, 1, 0, Class323.field_1187, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 0, Class323.field_1187, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 0, Class323.field_1187, var26);
               this.method_869(var1, var6, var3, var7, 0, 1, 1, Class323.field_1187, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 1, Class323.field_1187, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 1, Class323.field_1187, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, -1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 0, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 2, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 0, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 3, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, -2, Class323.field_1085, var26);
               break;
            case field_734:
               this.method_869(var1, var6, var3, var7, 0, 1, 0, Class323.field_1129, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 0, Class323.field_1129, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 0, Class323.field_1129, var26);
               this.method_869(var1, var6, var3, var7, 0, 1, 1, Class323.field_1129, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 1, Class323.field_1129, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 1, Class323.field_1129, var26);
               this.method_869(var1, var6, var3, var7, 1, 1, 0, Class323.field_1453, var26);
               this.method_869(var1, var6, var3, var7, 1, 2, 0, Class323.field_755, var26);
               this.method_869(var1, var6, var3, var7, 1, 3, 0, Class323.field_1469, var26);
               this.method_869(var1, var6, var3, var7, 1, 1, 1, Class323.field_593, var26);
               this.method_869(var1, var6, var3, var7, 1, 2, 1, Class323.field_580, var26);
               this.method_869(var1, var6, var3, var7, 1, 3, 1, Class323.field_1464, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, -1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 0, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 2, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 0, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 3, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, -2, Class323.field_1085, var26);
               break;
            case field_673:
               this.method_869(var1, var6, var3, var7, 0, 1, 0, Class323.field_1117, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 0, Class323.field_1117, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 0, Class323.field_1117, var26);
               this.method_869(var1, var6, var3, var7, 0, 1, 1, Class323.field_1117, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 1, Class323.field_1117, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 1, Class323.field_1117, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, -1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 0, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 2, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 0, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 3, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, -2, Class323.field_1085, var26);
               break;
            case field_769:
               this.method_869(var1, var6, var3, var7, 0, 1, 0, Class323.field_503, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 0, Class323.field_503, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 0, Class323.field_503, var26);
               this.method_869(var1, var6, var3, var7, 0, 1, 1, Class323.field_503, var26);
               this.method_869(var1, var6, var3, var7, 0, 2, 1, Class323.field_503, var26);
               this.method_869(var1, var6, var3, var7, 0, 3, 1, Class323.field_503, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, -1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 0, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 1, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 1, 0, 2, Class371.field_1206, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, -1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 0, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 1, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 2, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 0, 3, Class323.field_250, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, 3, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 1, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 2, -2, Class323.field_1085, var26);
               this.method_869(var1, var6, var3, var7, 2, 3, -2, Class323.field_1085, var26);
               break;
            case field_256:
               int var11 = var26 == 0 ? 1 : (var26 == 2 ? -1 : 0);
               int var12 = var26 == 1 ? 1 : (var26 == 3 ? -1 : 0);
               var11 += var2;
               var12 += var4;
               if (this.method_235(var11, var19, var12, (var26 + 2) % 4) == Class65.Inner285.field_256 && var5.method_156(var11, var12) instanceof Class65) {
                  this.method_869(var1, var6, var3, var7, 0, 0, 0, Class323.field_930, var26);
                  this.method_869(var1, var6, var3, var7, 0, 0, 1, Class323.field_930, var26);
                  this.method_869(var1, var6, var3, var7, 0, 1, 0, Class323.field_930, var26);
                  this.method_869(var1, var6, var3, var7, 0, 1, 1, Class323.field_930, var26);
                  this.method_869(var1, var6, var3, var7, 3, -1, 0, Class323.field_1129, var26);
                  this.method_869(var1, var6, var3, var7, 3, -1, 1, Class323.field_1129, var26);
                  this.method_869(var1, var6, var3, var7, 4, -1, 0, Class323.field_1129, var26);
                  this.method_869(var1, var6, var3, var7, 4, -1, 1, Class323.field_1129, var26);
               }
            case field_1049:
               int var28 = var26 == 0 ? 1 : (var26 == 2 ? -1 : 0);
               int var31 = var26 == 1 ? 1 : (var26 == 3 ? -1 : 0);
               var28 += var2;
               var31 += var4;
               if (this.method_235(var28, var19, var31, (var26 + 2) % 4) == Class65.Inner285.field_256 && var5.method_156(var28, var31) instanceof Class65) {
                  this.method_869(var1, var6, var3, var7, 3, -1, 0, Class323.field_1129, var26);
                  this.method_869(var1, var6, var3, var7, 3, -1, 1, Class323.field_1129, var26);
                  this.method_869(var1, var6, var3, var7, 4, -1, 0, Class323.field_1129, var26);
                  this.method_869(var1, var6, var3, var7, 4, -1, 1, Class323.field_1129, var26);
               }
         }
      }

      this.method_201(var1, var6 + 4, var3 + 1, var7 + 4);
      this.method_201(var1, var6 + 11, var3 + 1, var7 + 4);
      this.method_201(var1, var6 + 4, var3 + 1, var7 + 11);
      this.method_201(var1, var6 + 11, var3 + 1, var7 + 11);
   }

   private void method_201(Class317 var1, int var2, int var3, int var4) {
      Random var5 = new Random(var2 * 456856235L - var3 * 184761862L + var4 * 4618624L + 18162412L);
      if (var5.nextInt(127) == 0) {
         var1.method_260(var2, var3, var4, Class371.field_649.field_1379);
         Class171 var6 = new Class171();
         var1.method_563(var2, var3, var4, var6);

         for (int var7 = 0; var7 < var6.method_214(); var7++) {
            int var8 = var5.nextInt(30);
            if (var8 < 1) {
               var6.method_351(var7, new Class150(Class350.field_922));
            } else if (var8 < 6) {
               var6.method_351(var7, new Class150(Class323.field_1453.field_1379 + var8 - 1, var5.nextInt(15) + 1));
            } else if (var8 < 11) {
               var6.method_351(var7, new Class150(Class323.field_1023.field_1379 + var8 - 6, var5.nextInt(15) + 1));
            } else if (var8 < 12) {
               var6.method_351(var7, new Class150(Class350.field_1526));
            } else if (var8 < 13) {
               var6.method_351(var7, new Class150(Class350.field_1583));
            } else if (var8 < 14) {
               var6.method_351(var7, new Class150(Class13.field_971));
            } else if (var8 < 15) {
               var6.method_351(var7, new Class150(Class13.field_626));
            } else if (var8 < 16) {
               var6.method_351(var7, new Class150(Class13.field_1084));
            }
         }
      }
   }

   private void method_517(Class317 var1, int var2, int var3, int var4) {
      for (int var5 = 2; var5 <= 13; var5++) {
         for (int var6 = 2; var6 <= 13; var6++) {
            for (int var7 = 5; var7 < 8; var7++) {
               if (!this.method_686(var1, var2 * 16 + var5, var3 + var7, var4 * 16 + var6)) {
                  var1.method_260(var2 * 16 + var5, var3 + var7, var4 * 16 + var6, Class323.field_1129.field_1379);
               }
            }
         }
      }

      for (int var8 = 3; var8 <= 12; var8++) {
         for (int var9 = 3; var9 <= 12; var9++) {
            this.method_251(var1, Class323.field_472.field_1379, var2 * 16 + var8, var3 + 4, var4 * 16 + var9);
         }
      }
   }

   @Override
   public void method_1024(Class317 var1, int var2, int var3, Class81 var4) {
      int var5 = (int)((this.field_367.method_78(var2, var3) / 2.0 + 1.0) * 8.0);

      for (int var6 = var5; var6 >= 0; var6--) {
         int var7 = 30 + var6 * 8;
         if (!this.method_369(var1, var2, var7, var3)) {
            if (var5 != var6) {
               this.method_517(var1, var2, var7, var3);
            }
            break;
         }

         this.method_62(var1, var2, var7, var3, var4);
      }
   }

   private enum Inner285 {
      field_1335,
      field_256,
      field_1309,
      field_175,
      field_673,
      field_769,
      field_127,
      field_1049,
      field_734;

      public static Class65.Inner285[] method_112() {
         return (Class65.Inner285[])field_235.clone();
      }

      public static Class65.Inner285 method_924(String var0) {
         return Enum.valueOf(Class65.Inner285.class, var0);
      }
   }
}
