package srv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Class175 {
   public void method_905(Class317 var1, Class252 var2, double var3, double var5, double var7, float var9) {
      var1.method_621(var3, var5, var7, "random.explode", 4.0F, (1.0F + (var1.field_413.nextFloat() - var1.field_413.nextFloat()) * 0.2F) * 0.7F);
      HashSet var10 = new HashSet();
      float var11 = var9;
      byte var12 = 16;

      for (int var13 = 0; var13 < var12; var13++) {
         for (int var14 = 0; var14 < var12; var14++) {
            for (int var15 = 0; var15 < var12; var15++) {
               if (var13 == 0 || var13 == var12 - 1 || var14 == 0 || var14 == var12 - 1 || var15 == 0 || var15 == var12 - 1) {
                  double var22 = var13 / (var12 - 1.0F) * 2.0F - 1.0F;
                  double var24 = var14 / (var12 - 1.0F) * 2.0F - 1.0F;
                  double var26 = var15 / (var12 - 1.0F) * 2.0F - 1.0F;
                  double var28 = Math.sqrt(var22 * var22 + var24 * var24 + var26 * var26);
                  var22 /= var28;
                  var24 /= var28;
                  var26 /= var28;
                  float var30 = var9 * (0.7F + var1.field_413.nextFloat() * 0.6F);
                  double var16 = var3;
                  double var18 = var5;
                  double var20 = var7;

                  for (float var31 = 0.3F; var30 > 0.0F; var30 -= var31 * 0.75F) {
                     int var32 = Class380.method_502(var16);
                     int var33 = Class380.method_502(var18);
                     int var34 = Class380.method_502(var20);
                     int var35 = var1.method_813(var32, var33, var34);
                     if (var35 > 0) {
                        var30 -= (Class371.field_57[var35].method_399(var2) + 0.3F) * var31;
                     }

                     if (var30 > 0.0F) {
                        var10.add(new Class89(var32, var33, var34));
                     }

                     var16 += var22 * var31;
                     var18 += var24 * var31;
                     var20 += var26 * var31;
                  }
               }
            }
         }
      }

      var9 *= 2.0F;
      int var51 = Class380.method_502(var3 - var9 - 1.0);
      int var52 = Class380.method_502(var3 + var9 + 1.0);
      int var53 = Class380.method_502(var5 - var9 - 1.0);
      int var62 = Class380.method_502(var5 + var9 + 1.0);
      int var23 = Class380.method_502(var7 - var9 - 1.0);
      int var64 = Class380.method_502(var7 + var9 + 1.0);
      List var25 = var1.method_362(var2, Class94.method_27(var51, var53, var23, var52, var62, var64));
      Class47 var66 = Class47.method_875(var3, var5, var7);

      for (int var73 = 0; var73 < var25.size(); var73++) {
         Class252 var75 = (Class252)var25.get(var73);
         double var77 = var75.method_452(var3, var5, var7) / var9;
         if (var77 <= 1.0) {
            double var54 = var75.field_1324 - var3;
            double var56 = var75.field_632 - var5;
            double var58 = var75.field_1321 - var7;
            double var27 = Class380.method_164(var54 * var54 + var56 * var56 + var58 * var58);
            var54 /= var27;
            var56 /= var27;
            var58 /= var27;
            double var29 = var1.method_772(var66, var75.field_106);
            double var69 = (1.0 - var77) * var29;
            var75.method_671(var2, (int)((var69 * var69 + var69) / 2.0 * 8.0 * var9 + 1.0));
            var75.field_607 += var54 * var69;
            var75.field_780 += var56 * var69;
            var75.field_921 += var58 * var69;
         }
      }

      var9 = var11;
      ArrayList var74 = new ArrayList();
      var74.addAll(var10);

      for (int var76 = var74.size() - 1; var76 >= 0; var76--) {
         Class89 var78 = (Class89)var74.get(var76);
         int var36 = var78.field_339;
         int var37 = var78.field_613;
         int var38 = var78.field_1218;
         int var39 = var1.method_813(var36, var37, var38);

         for (int var40 = 0; var40 < 1; var40++) {
            double var60 = var36 + var1.field_413.nextFloat();
            double var67 = var37 + var1.field_413.nextFloat();
            double var68 = var38 + var1.field_413.nextFloat();
            double var70 = var60 - var3;
            double var41 = var67 - var5;
            double var43 = var68 - var7;
            double var45 = Class380.method_164(var70 * var70 + var41 * var41 + var43 * var43);
            var70 /= var45;
            var41 /= var45;
            var43 /= var45;
            double var47 = 0.5 / (var45 / var9 + 0.1);
            var47 *= var1.field_413.nextFloat() * var1.field_413.nextFloat() + 0.3F;
            var70 *= var47;
            var41 *= var47;
            var43 *= var47;
            var1.method_140("explode", (var60 + var3 * 1.0) / 2.0, (var67 + var5 * 1.0) / 2.0, (var68 + var7 * 1.0) / 2.0, var70, var41, var43);
            var1.method_140("smoke", var60, var67, var68, var70, var41, var43);
         }

         if (var39 > 0) {
            Class371.field_57[var39].method_838(var1, var36, var37, var38, var1.method_929(var36, var37, var38), 0.3F);
            var1.method_226(var36, var37, var38, 0);
            Class371.field_57[var39].method_480(var1, var36, var37, var38);
         }
      }
   }
}
