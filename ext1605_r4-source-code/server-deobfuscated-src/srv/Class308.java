package srv;

import java.util.Random;

public class Class308 extends Class147 {
   protected void method_67(int var1, int var2, byte[] var3, double var4, double var6, double var8) {
      this.method_63(var1, var2, var3, var4, var6, var8, 1.0F + this.field_589.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5);
   }

   protected void method_63(
      int var1, int var2, byte[] var3, double var4, double var6, double var8, float var10, float var11, float var12, int var13, int var14, double var15
   ) {
      double var17 = var1 * 16 + 8;
      double var19 = var2 * 16 + 8;
      float var21 = 0.0F;
      float var22 = 0.0F;
      Random var23 = new Random(this.field_589.nextLong());
      if (var14 <= 0) {
         int var24 = this.field_1337 * 16 - 16;
         var14 = var24 - var23.nextInt(var24 / 4);
      }

      boolean var63 = false;
      if (var13 == -1) {
         var13 = var14 / 2;
         var63 = true;
      }

      int var25 = var23.nextInt(var14 / 2) + var14 / 4;
      boolean var26 = var23.nextInt(6) == 0;

      while (var13 < var14) {
         double var27 = 1.5 + Class380.method_241(var13 * (float) Math.PI / var14) * var10 * 1.0F;
         double var29 = var27 * var15;
         float var31 = Class380.method_520(var12);
         float var32 = Class380.method_241(var12);
         var4 += Class380.method_520(var11) * var31;
         var6 += var32;
         var8 += Class380.method_241(var11) * var31;
         if (var26) {
            var12 *= 0.92F;
         } else {
            var12 *= 0.7F;
         }

         var12 += var22 * 0.1F;
         var11 += var21 * 0.1F;
         var22 *= 0.9F;
         var21 *= 0.75F;
         var22 += (var23.nextFloat() - var23.nextFloat()) * var23.nextFloat() * 2.0F;
         var21 += (var23.nextFloat() - var23.nextFloat()) * var23.nextFloat() * 4.0F;
         if (!var63 && var13 == var25 && var10 > 1.0F) {
            this.method_63(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 - (float) (Math.PI / 2), var12 / 3.0F, var13, var14, 1.0);
            this.method_63(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 + (float) (Math.PI / 2), var12 / 3.0F, var13, var14, 1.0);
            return;
         }

         if (var63 || var23.nextInt(4) != 0) {
            double var33 = var4 - var17;
            double var35 = var8 - var19;
            double var37 = var14 - var13;
            double var39 = var10 + 2.0F + 16.0F;
            if (var33 * var33 + var35 * var35 - var37 * var37 > var39 * var39) {
               return;
            }

            if (var4 >= var17 - 16.0 - var27 * 2.0
               && var8 >= var19 - 16.0 - var27 * 2.0
               && var4 <= var17 + 16.0 + var27 * 2.0
               && var8 <= var19 + 16.0 + var27 * 2.0) {
               int var41 = Class380.method_502(var4 - var27) - var1 * 16 - 1;
               int var42 = Class380.method_502(var4 + var27) - var1 * 16 + 1;
               int var43 = Class380.method_502(var6 - var29) - 1;
               int var44 = Class380.method_502(var6 + var29) + 1;
               int var45 = Class380.method_502(var8 - var27) - var2 * 16 - 1;
               int var46 = Class380.method_502(var8 + var27) - var2 * 16 + 1;
               if (var41 < 0) {
                  var41 = 0;
               }

               if (var42 > 16) {
                  var42 = 16;
               }

               if (var43 < 1) {
                  var43 = 1;
               }

               if (var44 > 120) {
                  var44 = 120;
               }

               if (var45 < 0) {
                  var45 = 0;
               }

               if (var46 > 16) {
                  var46 = 16;
               }

               boolean var47 = false;

               for (int var48 = var41; !var47 && var48 < var42; var48++) {
                  for (int var50 = var45; !var47 && var50 < var46; var50++) {
                     for (int var51 = var44 + 1; !var47 && var51 >= var43 - 1; var51--) {
                        int var49 = (var48 * 16 + var50) * 128 + var51;
                        if (var51 >= 0 && var51 < 128) {
                           if (var3[var49] == Class371.field_1051.field_1379 || var3[var49] == Class371.field_535.field_1379) {
                              var47 = true;
                           }

                           if (var51 != var43 - 1 && var48 != var41 && var48 != var42 - 1 && var50 != var45 && var50 != var46 - 1) {
                              var51 = var43;
                           }
                        }
                     }
                  }
               }

               if (!var47) {
                  for (int var64 = var41; var64 < var42; var64++) {
                     double var66 = (var64 + var1 * 16 + 0.5 - var4) / var27;

                     for (int var65 = var45; var65 < var46; var65++) {
                        double var52 = (var65 + var2 * 16 + 0.5 - var8) / var27;
                        int var54 = (var64 * 16 + var65) * 128 + var44;
                        boolean var55 = false;

                        for (int var56 = var44 - 1; var56 >= var43; var56--) {
                           double var57 = (var56 + 0.5 - var6) / var29;
                           if (var57 > -0.7 && var66 * var66 + var57 * var57 + var52 * var52 < 1.0) {
                              byte var59 = var3[var54];
                              if (var59 == Class371.field_1206.field_1379) {
                                 var55 = true;
                              }

                              if (var59 == Class371.field_1294.field_1379 || var59 == Class371.field_1082.field_1379 || var59 == Class371.field_1206.field_1379
                                 )
                               {
                                 if (var56 < 10) {
                                    var3[var54] = (byte)Class371.field_1103.field_1379;
                                 } else {
                                    var3[var54] = 0;
                                    if (var55 && var3[var54 - 1] == Class371.field_1082.field_1379) {
                                       var3[var54 - 1] = (byte)Class371.field_1206.field_1379;
                                    }
                                 }
                              }
                           }

                           var54--;
                        }
                     }
                  }

                  if (var63) {
                     break;
                  }
               }
            }
         }

         var13++;
      }
   }

   @Override
   protected void method_486(Class317 var1, int var2, int var3, int var4, int var5, byte[] var6) {
      int var7 = this.field_589.nextInt(this.field_589.nextInt(this.field_589.nextInt(40) + 1) + 1);
      if (this.field_589.nextInt(15) != 0) {
         var7 = 0;
      }

      for (int var8 = 0; var8 < var7; var8++) {
         double var9 = var2 * 16 + this.field_589.nextInt(16);
         double var11 = this.field_589.nextInt(this.field_589.nextInt(120) + 8);
         double var13 = var3 * 16 + this.field_589.nextInt(16);
         int var15 = 1;
         if (this.field_589.nextInt(4) == 0) {
            this.method_67(var4, var5, var6, var9, var11, var13);
            var15 += this.field_589.nextInt(4);
         }

         for (int var16 = 0; var16 < var15; var16++) {
            float var17 = this.field_589.nextFloat() * (float) Math.PI * 2.0F;
            float var18 = (this.field_589.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.field_589.nextFloat() * 2.0F + this.field_589.nextFloat();
            this.method_63(var4, var5, var6, var9, var11, var13, var19, var17, var18, 0, 0, 1.0);
         }
      }
   }
}
