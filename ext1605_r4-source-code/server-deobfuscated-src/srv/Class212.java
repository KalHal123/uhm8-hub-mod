package srv;

import java.util.Random;

public class Class212 implements Interface14 {
   private final Class345 field_1072;

   public Class212(Random var1) {
      this.field_1072 = new Class345(var1);
   }

   @Override
   public float method_449() {
      return 1.1F;
   }

   private boolean method_846(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3, var4);
      return var5 == Class371.field_1206.field_1379 || var5 == Class371.field_378.field_1379;
   }

   private void method_1019(Class317 var1, Class371 var2, int var3, int var4) {
      for (int var5 = 128; var5 > 40; var5--) {
         if (this.method_846(var1, var3, var5, var4)) {
            var1.method_260(var3, var5, var4, var2.field_1379);
            if (var1.method_813(var3, var5 + 1, var4) == Class323.field_117.field_1379) {
               var1.method_260(var3, var5 + 1, var4, 0);
            }

            return;
         }
      }
   }

   @Override
   public void method_1024(Class317 var1, int var2, int var3, Class81 var4) {
      if (!var1.field_871) {
         int[] var5 = new int[]{
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
         };
         if (var4.method_722(Class212.class, var2 + 1, var3)) {
            for (int var6 = 9; var6 <= 15; var6++) {
               for (int var7 = 4; var7 <= 11; var7++) {
                  var5[var6 + var7 * 16] = 1;
               }
            }
         }

         if (var4.method_722(Class212.class, var2 - 1, var3)) {
            for (int var10 = 0; var10 <= 6; var10++) {
               for (int var22 = 4; var22 <= 11; var22++) {
                  var5[var10 + var22 * 16] = 1;
               }
            }
         }

         if (var4.method_722(Class212.class, var2, var3 + 1)) {
            for (int var11 = 4; var11 <= 11; var11++) {
               for (int var23 = 9; var23 <= 15; var23++) {
                  var5[var11 + var23 * 16] = 1;
               }
            }
         }

         if (var4.method_722(Class212.class, var2, var3 - 1)) {
            for (int var12 = 4; var12 <= 11; var12++) {
               for (int var24 = 0; var24 <= 6; var24++) {
                  var5[var12 + var24 * 16] = 1;
               }
            }
         }

         if (var4.method_722(Class212.class, var2 + 1, var3)
            && var4.method_722(Class212.class, var2 + 1, var3 + 1)
            && var4.method_722(Class212.class, var2, var3 + 1)) {
            for (int var14 = 12; var14 <= 15; var14++) {
               for (int var25 = 12; var25 <= 15; var25++) {
                  var5[var14 + var25 * 16] = 1;
               }
            }
         } else if (var4.method_722(Class212.class, var2 + 1, var3) && var4.method_722(Class212.class, var2, var3 + 1)) {
            var5[204] = 1;

            for (int var13 = 1; var13 <= 2; var13++) {
               var5[12 + var13 + 192] = 1;
               var5[12 + (12 + var13) * 16] = 1;
            }
         }

         if (var4.method_722(Class212.class, var2 - 1, var3)
            && var4.method_722(Class212.class, var2 - 1, var3 - 1)
            && var4.method_722(Class212.class, var2, var3 - 1)) {
            for (int var16 = 0; var16 <= 3; var16++) {
               for (int var26 = 0; var26 <= 3; var26++) {
                  var5[var16 + var26 * 16] = 1;
               }
            }
         } else if (var4.method_722(Class212.class, var2 - 1, var3) && var4.method_722(Class212.class, var2, var3 - 1)) {
            var5[51] = 1;

            for (int var15 = 1; var15 <= 2; var15++) {
               var5[3 - var15 + 48] = 1;
               var5[3 + (3 - var15) * 16] = 1;
            }
         }

         if (var4.method_722(Class212.class, var2 - 1, var3)
            && var4.method_722(Class212.class, var2 - 1, var3 + 1)
            && var4.method_722(Class212.class, var2, var3 + 1)) {
            for (int var18 = 0; var18 <= 3; var18++) {
               for (int var27 = 12; var27 <= 15; var27++) {
                  var5[var18 + var27 * 16] = 1;
               }
            }
         } else if (var4.method_722(Class212.class, var2 - 1, var3) && var4.method_722(Class212.class, var2, var3 + 1)) {
            var5[195] = 1;

            for (int var17 = 1; var17 <= 2; var17++) {
               var5[3 - var17 + 192] = 1;
               var5[3 + (12 + var17) * 16] = 1;
            }
         }

         if (var4.method_722(Class212.class, var2 + 1, var3)
            && var4.method_722(Class212.class, var2 + 1, var3 - 1)
            && var4.method_722(Class212.class, var2, var3 - 1)) {
            for (int var20 = 12; var20 <= 15; var20++) {
               for (int var28 = 0; var28 <= 3; var28++) {
                  var5[var20 + var28 * 16] = 1;
               }
            }
         } else if (var4.method_722(Class212.class, var2 + 1, var3) && var4.method_722(Class212.class, var2, var3 - 1)) {
            var5[60] = 1;

            for (int var19 = 1; var19 <= 2; var19++) {
               var5[12 + var19 + 48] = 1;
               var5[12 + (3 - var19) * 16] = 1;
            }
         }

         for (int var21 = 0; var21 < 16; var21++) {
            for (int var29 = 0; var29 < 16; var29++) {
               if (var5[var21 + var29 * 16] == 1) {
                  int var8 = var2 * 16 + var21;
                  int var9 = var3 * 16 + var29;
                  this.method_1019(var1, Class323.field_815, var8, var9);
               }
            }
         }
      }
   }
}
