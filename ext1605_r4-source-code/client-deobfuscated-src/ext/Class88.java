package ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Class88 {
   public void method_1707(Class454 var1, Class359 var2, double var3, double var5, double var7, float var9) {
      this.method_896(var1, var2, var3, var5, var7, var9, true, -1);
   }

   public void method_896(Class454 var1, Class359 var2, double var3, double var5, double var7, float var9, boolean var10, int var11) {
      var1.method_861(var3, var5, var7, "random.explode", 4.0F, (1.0F + (var1.field_2150.nextFloat() - var1.field_2150.nextFloat()) * 0.2F) * 0.7F);
      HashSet var12 = new HashSet();
      float var13 = var9;
      byte var14 = 16;
      if (var10) {
         for (int var15 = 0; var15 < var14; var15++) {
            for (int var16 = 0; var16 < var14; var16++) {
               for (int var17 = 0; var17 < var14; var17++) {
                  if (var15 == 0 || var15 == var14 - 1 || var16 == 0 || var16 == var14 - 1 || var17 == 0 || var17 == var14 - 1) {
                     double var24 = var15 / (var14 - 1.0F) * 2.0F - 1.0F;
                     double var26 = var16 / (var14 - 1.0F) * 2.0F - 1.0F;
                     double var28 = var17 / (var14 - 1.0F) * 2.0F - 1.0F;
                     double var30 = Math.sqrt(var24 * var24 + var26 * var26 + var28 * var28);
                     var24 /= var30;
                     var26 /= var30;
                     var28 /= var30;
                     float var32 = var9 * (0.7F + var1.field_2150.nextFloat() * 0.6F);
                     double var18 = var3;
                     double var20 = var5;
                     double var22 = var7;

                     for (float var33 = 0.3F; var32 > 0.0F; var32 -= var33 * 0.75F) {
                        int var34 = Class469.method_468(var18);
                        int var35 = Class469.method_468(var20);
                        int var36 = Class469.method_468(var22);
                        int var37 = var1.method_197(var34, var35, var36);
                        if (var37 > 0) {
                           var32 -= (Class108.field_1221[var37].method_1443(var2) + 0.3F) * var33;
                        }

                        if (var32 > 0.0F) {
                           var12.add(new Class450(var34, var35, var36));
                        }

                        var18 += var24 * var33;
                        var20 += var26 * var33;
                        var22 += var28 * var33;
                     }
                  }
               }
            }
         }
      } else {
         Random var64 = new Random();

         for (int var25 = 0; var25 != 20; var25++) {
            var1.method_1347(
               "explode", var3 + var64.nextDouble() * 8.0 - 4.0, var5 + var64.nextDouble() * 2.0, var7 + var64.nextDouble() * 8.0 - 4.0, 0.0, 0.1, 0.0
            );
            var1.method_1347(
               "smoke", var3 + var64.nextDouble() * 8.0 - 4.0, var5 + var64.nextDouble() * 2.0, var7 + var64.nextDouble() * 8.0 - 4.0, 0.0, 0.1, 0.0
            );
         }
      }

      var9 *= 2.0F;
      int var53 = Class469.method_468(var3 - var9 - 1.0);
      int var54 = Class469.method_468(var3 + var9 + 1.0);
      int var55 = Class469.method_468(var5 - var9 - 1.0);
      int var65 = Class469.method_468(var5 + var9 + 1.0);
      int var66 = Class469.method_468(var7 - var9 - 1.0);
      int var68 = Class469.method_468(var7 + var9 + 1.0);
      List var27 = var1.method_1349(var2, Class630.method_969(var53, var55, var66, var54, var65, var68));
      Class214 var70 = Class214.method_701(var3, var5, var7);

      for (int var77 = 0; var77 < var27.size(); var77++) {
         Class359 var79 = (Class359)var27.get(var77);
         double var81 = var79.method_889(var3, var5, var7) / var9;
         if (var81 <= 1.0) {
            double var56 = var79.field_1417 - var3;
            double var58 = var79.field_2654 - var5;
            double var60 = var79.field_2013 - var7;
            double var29 = Class469.method_822(var56 * var56 + var58 * var58 + var60 * var60);
            var56 /= var29;
            var58 /= var29;
            var60 /= var29;
            double var31 = var1.method_1124(var70, var79.field_235);
            double var73 = (1.0 - var81) * var31;
            if (var11 == -1) {
               var79.method_308(var2, (int)((var73 * var73 + var73) / 2.0 * 8.0 * var9 + 1.0));
            } else {
               var79.method_308(var2, var11);
            }

            var79.field_2549 += var56 * var73;
            var79.field_2501 += var58 * var73;
            var79.field_489 += var60 * var73;
         }
      }

      var9 = var13;
      ArrayList var78 = new ArrayList(var12);

      for (int var80 = var78.size() - 1; var80 >= 0; var80--) {
         Class450 var82 = (Class450)var78.get(var80);
         int var38 = var82.field_1865;
         int var39 = var82.field_322;
         int var40 = var82.field_2359;
         int var41 = var1.method_197(var38, var39, var40);

         for (int var42 = 0; var42 < 1; var42++) {
            double var62 = var38 + var1.field_2150.nextFloat();
            double var71 = var39 + var1.field_2150.nextFloat();
            double var72 = var40 + var1.field_2150.nextFloat();
            double var74 = var62 - var3;
            double var43 = var71 - var5;
            double var45 = var72 - var7;
            double var47 = Class469.method_822(var74 * var74 + var43 * var43 + var45 * var45);
            var74 /= var47;
            var43 /= var47;
            var45 /= var47;
            double var49 = 0.5 / (var47 / var9 + 0.1);
            var49 *= var1.field_2150.nextFloat() * var1.field_2150.nextFloat() + 0.3F;
            var74 *= var49;
            var43 *= var49;
            var45 *= var49;
            var1.method_1347("explode", (var62 + var3 * 1.0) / 2.0, (var71 + var5 * 1.0) / 2.0, (var72 + var7 * 1.0) / 2.0, var74, var43, var45);
            var1.method_1347("smoke", var62, var71, var72, var74, var43, var45);
         }

         if (var41 > 0) {
            Class108.field_1221[var41].method_944(var1, var38, var39, var40, var1.method_1110(var38, var39, var40), 0.3F);
            var1.method_1481(var38, var39, var40, 0);
            Class108.field_1221[var41].method_298(var1, var38, var39, var40);
         }
      }
   }
}
