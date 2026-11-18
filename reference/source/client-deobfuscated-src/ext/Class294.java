package ext;

import java.util.Random;

public class Class294 extends Class641 {
   private int field_2043;
   private int field_2612;
   private int field_2454;

   public Class294(int var1, int var2, int var3) {
      this(var1, var3);
      this.field_2612 = var2;
   }

   public Class294(int var1, int var2) {
      this.field_2043 = var1;
      this.field_2454 = var2;
   }

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      float var6 = var2.nextFloat() * (float) Math.PI;
      double var7 = var3 + 8 + Class469.method_1667(var6) * this.field_2454 / 8.0F;
      double var9 = var3 + 8 - Class469.method_1667(var6) * this.field_2454 / 8.0F;
      double var11 = var5 + 8 + Class469.method_255(var6) * this.field_2454 / 8.0F;
      double var13 = var5 + 8 - Class469.method_255(var6) * this.field_2454 / 8.0F;
      double var15 = var4 + var2.nextInt(3) + 2;
      double var17 = var4 + var2.nextInt(3) + 2;

      for (int var19 = 0; var19 <= this.field_2454; var19++) {
         double var20 = var7 + (var9 - var7) * var19 / this.field_2454;
         double var22 = var15 + (var17 - var15) * var19 / this.field_2454;
         double var24 = var11 + (var13 - var11) * var19 / this.field_2454;
         double var26 = var2.nextDouble() * this.field_2454 / 16.0;
         double var28 = (Class469.method_1667(var19 * (float) Math.PI / this.field_2454) + 1.0F) * var26 + 1.0;
         double var30 = (Class469.method_1667(var19 * (float) Math.PI / this.field_2454) + 1.0F) * var26 + 1.0;

         for (int var32 = (int)(var20 - var28 / 2.0); var32 <= (int)(var20 + var28 / 2.0); var32++) {
            for (int var33 = (int)(var22 - var30 / 2.0); var33 <= (int)(var22 + var30 / 2.0); var33++) {
               for (int var34 = (int)(var24 - var28 / 2.0); var34 <= (int)(var24 + var28 / 2.0); var34++) {
                  double var35 = (var32 + 0.5 - var20) / (var28 / 2.0);
                  double var37 = (var33 + 0.5 - var22) / (var30 / 2.0);
                  double var39 = (var34 + 0.5 - var24) / (var28 / 2.0);
                  if (var35 * var35 + var37 * var37 + var39 * var39 < 1.0
                     && (
                        var1.method_197(var32, var33, var34) == Class108.field_720.field_2151
                           || var1.method_197(var32, var33, var34) == Class390.field_1889.field_2151
                     )) {
                     var1.method_470(var32, var33, var34, var33 <= 10 ? this.field_2612 : this.field_2043);
                     if (var33 <= 10) {
                        for (byte var41 = -1; var41 <= 1; var41 += 2) {
                           for (byte var42 = -1; var42 <= 1; var42 += 2) {
                              for (byte var43 = -1; var43 <= 1; var43 += 2) {
                                 if (var1.method_197(var32 + var41, var33 + var42, var34 + var43) == Class108.field_720.field_2151) {
                                    var1.method_470(var32 + var41, var33 + var42, var34 + var43, Class390.field_1889.field_2151);
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
