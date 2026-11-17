package ext;

import java.util.Random;

public class Class685 extends Class641 {
   private int field_423 = Class108.field_2132.field_2151;
   private int field_2262;

   public Class685(int var1) {
      this.field_2262 = var1;
   }

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      if (var1.method_1286(var3, var4, var5) != Class160.field_1413) {
         return false;
      }

      float var6 = var2.nextFloat() * (float) Math.PI;
      double var7 = var3 + 8 + Class469.method_1667(var6) * this.field_2262 / 8.0F;
      double var9 = var3 + 8 - Class469.method_1667(var6) * this.field_2262 / 8.0F;
      double var11 = var5 + 8 + Class469.method_255(var6) * this.field_2262 / 8.0F;
      double var13 = var5 + 8 - Class469.method_255(var6) * this.field_2262 / 8.0F;
      double var15 = var4 + var2.nextInt(3) + 2;
      double var17 = var4 + var2.nextInt(3) + 2;

      for (int var19 = 0; var19 <= this.field_2262; var19++) {
         double var20 = var7 + (var9 - var7) * var19 / this.field_2262;
         double var22 = var15 + (var17 - var15) * var19 / this.field_2262;
         double var24 = var11 + (var13 - var11) * var19 / this.field_2262;
         double var26 = var2.nextDouble() * this.field_2262 / 16.0;
         double var28 = (Class469.method_1667(var19 * (float) Math.PI / this.field_2262) + 1.0F) * var26 + 1.0;
         double var30 = (Class469.method_1667(var19 * (float) Math.PI / this.field_2262) + 1.0F) * var26 + 1.0;

         for (int var32 = (int)(var20 - var28 / 2.0); var32 <= (int)(var20 + var28 / 2.0); var32++) {
            for (int var33 = (int)(var22 - var30 / 2.0); var33 <= (int)(var22 + var30 / 2.0); var33++) {
               for (int var34 = (int)(var24 - var28 / 2.0); var34 <= (int)(var24 + var28 / 2.0); var34++) {
                  double var35 = (var32 + 0.5 - var20) / (var28 / 2.0);
                  double var37 = (var33 + 0.5 - var22) / (var30 / 2.0);
                  double var39 = (var34 + 0.5 - var24) / (var28 / 2.0);
                  if (var35 * var35 + var37 * var37 + var39 * var39 < 1.0) {
                     int var41 = var1.method_197(var32, var33, var34);
                     if (var41 == Class108.field_2692.field_2151) {
                        var1.method_470(var32, var33, var34, this.field_423);
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
