package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Class0239 {
   public void a(Class0065 var1, Class0268 var2, double var3, double var5, double var7, float var9) {
      var1.a(var3, var5, var7, "random.explode", 4.0F, (1.0F + (var1.m.nextFloat() - var1.m.nextFloat()) * 0.2F) * 0.7F);
      HashSet var10 = new HashSet();
      float var11 = var9;
      byte var12 = 16;

      for (int var13 = 0; var13 < var12; var13++) {
         for (int var14 = 0; var14 < var12; var14++) {
            for (int var15 = 0; var15 < var12; var15++) {
               if (var13 == 0 || var13 == var12 - 1 || var14 == 0 || var14 == var12 - 1 || var15 == 0 || var15 == var12 - 1) {
                  double var16 = var13 / (var12 - 1.0F) * 2.0F - 1.0F;
                  double var18 = var14 / (var12 - 1.0F) * 2.0F - 1.0F;
                  double var20 = var15 / (var12 - 1.0F) * 2.0F - 1.0F;
                  double var22 = Math.sqrt(var16 * var16 + var18 * var18 + var20 * var20);
                  var16 /= var22;
                  var18 /= var22;
                  var20 /= var22;
                  float var24 = var9 * (0.7F + var1.m.nextFloat() * 0.6F);
                  double var25 = var3;
                  double var27 = var5;
                  double var29 = var7;

                  for (float var31 = 0.3F; var24 > 0.0F; var24 -= var31 * 0.75F) {
                     int var32 = Class0118.b(var25);
                     int var33 = Class0118.b(var27);
                     int var34 = Class0118.b(var29);
                     int var35 = var1.a(var32, var33, var34);
                     if (var35 > 0) {
                        var24 -= (Class0312.n[var35].a(var2) + 0.3F) * var31;
                     }

                     if (var24 > 0.0F) {
                        var10.add(new Class0333(var32, var33, var34));
                     }

                     var25 += var16 * var31;
                     var27 += var18 * var31;
                     var29 += var20 * var31;
                  }
               }
            }
         }
      }

      var9 *= 2.0F;
      int var47 = Class0118.b(var3 - var9 - 1.0);
      int var48 = Class0118.b(var3 + var9 + 1.0);
      int var49 = Class0118.b(var5 - var9 - 1.0);
      int var51 = Class0118.b(var5 + var9 + 1.0);
      int var17 = Class0118.b(var7 - var9 - 1.0);
      int var53 = Class0118.b(var7 + var9 + 1.0);
      List var19 = var1.b(var2, Class0057.b(var47, var49, var17, var48, var51, var53));
      Class0009 var55 = Class0009.b(var3, var5, var7);

      for (int var21 = 0; var21 < var19.size(); var21++) {
         Class0268 var57 = (Class0268)var19.get(var21);
         double var23 = var57.e(var3, var5, var7) / var9;
         if (var23 <= 1.0) {
            double var61 = var57.ah - var3;
            double var64 = var57.ai - var5;
            double var67 = var57.aj - var7;
            double var70 = Class0118.a(var61 * var61 + var64 * var64 + var67 * var67);
            var61 /= var70;
            var64 /= var70;
            var67 /= var70;
            double var72 = var1.a(var55, var57.ar);
            double var74 = (1.0 - var23) * var72;
            var57.a(var2, (int)((var74 * var74 + var74) / 2.0 * 8.0 * var9 + 1.0));
            double var37 = var74;
            var57.ak += var61 * var37;
            var57.al += var64 * var37;
            var57.am += var67 * var37;
         }
      }

      var9 = var11;
      ArrayList var56 = new ArrayList();
      var56.addAll(var10);

      for (int var58 = var56.size() - 1; var58 >= 0; var58--) {
         Class0333 var59 = (Class0333)var56.get(var58);
         int var60 = var59.a;
         int var63 = var59.b;
         int var26 = var59.c;
         int var66 = var1.a(var60, var63, var26);

         for (int var28 = 0; var28 < 1; var28++) {
            double var69 = var60 + var1.m.nextFloat();
            double var71 = var63 + var1.m.nextFloat();
            double var73 = var26 + var1.m.nextFloat();
            double var75 = var69 - var3;
            double var78 = var71 - var5;
            double var39 = var73 - var7;
            double var41 = Class0118.a(var75 * var75 + var78 * var78 + var39 * var39);
            var75 /= var41;
            var78 /= var41;
            var39 /= var41;
            double var43 = 0.5 / (var41 / var9 + 0.1);
            var43 *= var1.m.nextFloat() * var1.m.nextFloat() + 0.3F;
            var75 *= var43;
            var78 *= var43;
            var39 *= var43;
            var1.a("explode", (var69 + var3 * 1.0) / 2.0, (var71 + var5 * 1.0) / 2.0, (var73 + var7 * 1.0) / 2.0, var75, var78, var39);
            var1.a("smoke", var69, var71, var73, var75, var78, var39);
         }

         if (var66 > 0) {
            Class0312.n[var66].a(var1, var60, var63, var26, var1.e(var60, var63, var26), 0.3F);
            var1.d(var60, var63, var26, 0);
            Class0312.n[var66].c(var1, var60, var63, var26);
         }
      }
   }
}
