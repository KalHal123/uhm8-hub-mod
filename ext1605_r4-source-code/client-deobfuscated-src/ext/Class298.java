package ext;

import java.util.Random;

public class Class298 extends Class414 {
   protected void method_816(int var1, int var2, byte[] var3, double var4, double var6, double var8) {
      this.method_839(var1, var2, var3, var4, var6, var8, 1.0F + this.field_520.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5);
   }

   protected void method_839(
      int var1, int var2, byte[] var3, double var4, double var6, double var8, float var10, float var11, float var12, int var13, int var14, double var15
   ) {
      double var17 = var1 * 16 + 8;
      double var19 = var2 * 16 + 8;
      float var21 = 0.0F;
      float var22 = 0.0F;
      Random var23 = new Random(this.field_520.nextLong());
      if (var14 <= 0) {
         int var24 = this.field_1002 * 16 - 16;
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
         double var27 = 1.5 + Class469.method_1667(var13 * (float) Math.PI / var14) * var10 * 1.0F;
         double var29 = var27 * var15;
         float var31 = Class469.method_255(var12);
         float var32 = Class469.method_1667(var12);
         var4 += Class469.method_255(var11) * var31;
         var6 += var32;
         var8 += Class469.method_1667(var11) * var31;
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
            this.method_839(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 - (float) (Math.PI / 2), var12 / 3.0F, var13, var14, 1.0);
            this.method_839(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 + (float) (Math.PI / 2), var12 / 3.0F, var13, var14, 1.0);
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
               int var41 = Class469.method_468(var4 - var27) - var1 * 16 - 1;
               int var42 = Class469.method_468(var4 + var27) - var1 * 16 + 1;
               int var43 = Class469.method_468(var6 - var29) - 1;
               int var44 = Class469.method_468(var6 + var29) + 1;
               int var45 = Class469.method_468(var8 - var27) - var2 * 16 - 1;
               int var46 = Class469.method_468(var8 + var27) - var2 * 16 + 1;
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
                           if (var3[var49] == Class108.field_536.field_2151 || var3[var49] == Class108.field_2883.field_2151) {
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
                              if (var59 == Class108.field_1970.field_2151) {
                                 var55 = true;
                              }

                              if (var59 == Class108.field_720.field_2151 || var59 == Class108.field_1047.field_2151 || var59 == Class108.field_1970.field_2151) {
                                 if (var56 < 10) {
                                    var3[var54] = (byte)Class108.field_1423.field_2151;
                                 } else {
                                    var3[var54] = 0;
                                    if (var55 && var3[var54 - 1] == Class108.field_1047.field_2151) {
                                       var3[var54 - 1] = (byte)Class108.field_1970.field_2151;
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
   protected void method_1293(Class454 var1, int var2, int var3, int var4, int var5, byte[] var6) {
      int var7 = this.field_520.nextInt(this.field_520.nextInt(this.field_520.nextInt(40) + 1) + 1);
      if (this.field_520.nextInt(15) != 0) {
         var7 = 0;
      }

      for (int var8 = 0; var8 < var7; var8++) {
         double var9 = var2 * 16 + this.field_520.nextInt(16);
         double var11 = this.field_520.nextInt(this.field_520.nextInt(120) + 8);
         double var13 = var3 * 16 + this.field_520.nextInt(16);
         int var15 = 1;
         if (this.field_520.nextInt(4) == 0) {
            this.method_816(var4, var5, var6, var9, var11, var13);
            var15 += this.field_520.nextInt(4);
         }

         for (int var16 = 0; var16 < var15; var16++) {
            float var17 = this.field_520.nextFloat() * (float) Math.PI * 2.0F;
            float var18 = (this.field_520.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.field_520.nextFloat() * 2.0F + this.field_520.nextFloat();
            this.method_839(var4, var5, var6, var9, var11, var13, var19, var17, var18, 0, 0, 1.0);
         }
      }
   }
}
