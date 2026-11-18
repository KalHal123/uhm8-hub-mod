package srv;

import java.util.Random;

public class Class337 extends Class19 {
   private int field_1591;
   private int field_1461;
   private int field_1494;

   public Class337(int var1, int var2, int var3) {
      this(var1, var3);
      this.field_1461 = var2;
   }

   public Class337(int var1, int var2) {
      this.field_1591 = var1;
      this.field_1494 = var2;
   }

   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      float var6 = var2.nextFloat() * (float) Math.PI;
      double var7 = var3 + 8 + Class380.method_241(var6) * this.field_1494 / 8.0F;
      double var9 = var3 + 8 - Class380.method_241(var6) * this.field_1494 / 8.0F;
      double var11 = var5 + 8 + Class380.method_520(var6) * this.field_1494 / 8.0F;
      double var13 = var5 + 8 - Class380.method_520(var6) * this.field_1494 / 8.0F;
      double var15 = var4 + var2.nextInt(3) + 2;
      double var17 = var4 + var2.nextInt(3) + 2;

      for (int var19 = 0; var19 <= this.field_1494; var19++) {
         double var20 = var7 + (var9 - var7) * var19 / this.field_1494;
         double var22 = var15 + (var17 - var15) * var19 / this.field_1494;
         double var24 = var11 + (var13 - var11) * var19 / this.field_1494;
         double var26 = var2.nextDouble() * this.field_1494 / 16.0;
         double var28 = (Class380.method_241(var19 * (float) Math.PI / this.field_1494) + 1.0F) * var26 + 1.0;
         double var30 = (Class380.method_241(var19 * (float) Math.PI / this.field_1494) + 1.0F) * var26 + 1.0;

         for (int var32 = (int)(var20 - var28 / 2.0); var32 <= (int)(var20 + var28 / 2.0); var32++) {
            for (int var33 = (int)(var22 - var30 / 2.0); var33 <= (int)(var22 + var30 / 2.0); var33++) {
               for (int var34 = (int)(var24 - var28 / 2.0); var34 <= (int)(var24 + var28 / 2.0); var34++) {
                  double var35 = (var32 + 0.5 - var20) / (var28 / 2.0);
                  double var37 = (var33 + 0.5 - var22) / (var30 / 2.0);
                  double var39 = (var34 + 0.5 - var24) / (var28 / 2.0);
                  if (var35 * var35 + var37 * var37 + var39 * var39 < 1.0
                     && (
                        var1.method_813(var32, var33, var34) == Class371.field_1294.field_1379
                           || var1.method_813(var32, var33, var34) == Class323.field_138.field_1379
                     )) {
                     var1.method_260(var32, var33, var34, var33 <= 10 ? this.field_1461 : this.field_1591);
                     if (var33 <= 10) {
                        for (byte var41 = -1; var41 <= 1; var41 += 2) {
                           for (byte var42 = -1; var42 <= 1; var42 += 2) {
                              for (byte var43 = -1; var43 <= 1; var43 += 2) {
                                 if (var1.method_813(var32 + var41, var33 + var42, var34 + var43) == Class371.field_1294.field_1379) {
                                    var1.method_260(var32 + var41, var33 + var42, var34 + var43, Class323.field_138.field_1379);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
