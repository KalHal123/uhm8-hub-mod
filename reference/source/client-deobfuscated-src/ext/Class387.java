package ext;

import java.util.Random;

public class Class387 extends Class5 {
   private Class107[] field_2184;
   private final int field_1325;

   public Class387(Random var1, int var2) {
      this.field_1325 = var2;
      this.field_2184 = new Class107[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.field_2184[var3] = new Class107(var1);
      }
   }

   public double method_385(double var1, double var3) {
      double var5 = 0.0;
      double var7 = 1.0;

      for (int var9 = 0; var9 < this.field_1325; var9++) {
         var5 += this.field_2184[var9].method_398(var1 * var7, var3 * var7) / var7;
         var7 /= 2.0;
      }

      return var5;
   }

   public double[] method_552(double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15) {
      if (var1 == null) {
         var1 = new double[var8 * var9 * var10];
      } else {
         for (int var17 = 0; var17 < var1.length; var17++) {
            var1[var17] = 0.0;
         }
      }

      double var20 = 1.0;

      for (int var19 = 0; var19 < this.field_1325; var19++) {
         this.field_2184[var19].method_1772(var1, var2, var4, var6, var8, var9, var10, var11 * var20, var13 * var20, var15 * var20, var20);
         var20 /= 2.0;
      }

      return var1;
   }
}
