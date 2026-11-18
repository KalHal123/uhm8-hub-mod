package ext;

import java.util.Random;

public class Class107 extends Class5 {
   private int[] field_1349 = new int[512];
   public double field_1323;
   public double field_666;
   public double field_22;

   public Class107() {
      this(new Random());
   }

   public Class107(Random var1) {
      this.field_1323 = var1.nextDouble() * 256.0;
      this.field_666 = var1.nextDouble() * 256.0;
      this.field_22 = var1.nextDouble() * 256.0;
      int var2 = 0;

      while (var2 < 256) {
         this.field_1349[var2] = var2++;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         int var3 = var1.nextInt(256 - var5) + var5;
         int var4 = this.field_1349[var5];
         this.field_1349[var5] = this.field_1349[var3];
         this.field_1349[var3] = var4;
         this.field_1349[var5 + 256] = this.field_1349[var5];
      }
   }

   public double method_953(double var1, double var3, double var5) {
      double var7 = var1 + this.field_1323;
      double var9 = var3 + this.field_666;
      double var11 = var5 + this.field_22;
      int var13 = (int)var7;
      int var14 = (int)var9;
      int var15 = (int)var11;
      if (var7 < var13) {
         var13--;
      }

      if (var9 < var14) {
         var14--;
      }

      if (var11 < var15) {
         var15--;
      }

      int var16 = var13 & 0xFF;
      int var17 = var14 & 0xFF;
      int var18 = var15 & 0xFF;
      var7 -= var13;
      var9 -= var14;
      var11 -= var15;
      double var19 = var7 * var7 * var7 * (var7 * (var7 * 6.0 - 15.0) + 10.0);
      double var21 = var9 * var9 * var9 * (var9 * (var9 * 6.0 - 15.0) + 10.0);
      double var23 = var11 * var11 * var11 * (var11 * (var11 * 6.0 - 15.0) + 10.0);
      int var25 = this.field_1349[var16] + var17;
      int var26 = this.field_1349[var25] + var18;
      int var27 = this.field_1349[var25 + 1] + var18;
      int var28 = this.field_1349[var16 + 1] + var17;
      int var29 = this.field_1349[var28] + var18;
      int var30 = this.field_1349[var28 + 1] + var18;
      return this.method_346(
         var23,
         this.method_346(
            var21,
            this.method_346(var19, this.method_845(this.field_1349[var26], var7, var9, var11), this.method_845(this.field_1349[var29], var7 - 1.0, var9, var11)),
            this.method_346(
               var19, this.method_845(this.field_1349[var27], var7, var9 - 1.0, var11), this.method_845(this.field_1349[var30], var7 - 1.0, var9 - 1.0, var11)
            )
         ),
         this.method_346(
            var21,
            this.method_346(
               var19,
               this.method_845(this.field_1349[var26 + 1], var7, var9, var11 - 1.0),
               this.method_845(this.field_1349[var29 + 1], var7 - 1.0, var9, var11 - 1.0)
            ),
            this.method_346(
               var19,
               this.method_845(this.field_1349[var27 + 1], var7, var9 - 1.0, var11 - 1.0),
               this.method_845(this.field_1349[var30 + 1], var7 - 1.0, var9 - 1.0, var11 - 1.0)
            )
         )
      );
   }

   public double method_346(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   public double method_845(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      double var9 = var8 < 8 ? var2 : var4;
      double var11 = var8 < 4 ? var4 : (var8 != 12 && var8 != 14 ? var6 : var2);
      return ((var8 & 1) == 0 ? var9 : -var9) + ((var8 & 2) == 0 ? var11 : -var11);
   }

   public double method_398(double var1, double var3) {
      return this.method_953(var1, var3, 0.0);
   }

   public void method_1772(
      double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15, double var17
   ) {
      int var19 = 0;
      double var20 = 1.0 / var17;
      int var22 = -1;
      double var23 = 0.0;
      double var25 = 0.0;
      double var27 = 0.0;
      double var29 = 0.0;

      for (int var31 = 0; var31 < var8; var31++) {
         double var32 = (var2 + var31) * var11 + this.field_1323;
         int var34 = (int)var32;
         if (var32 < var34) {
            var34--;
         }

         int var35 = var34 & 0xFF;
         var32 -= var34;
         double var36 = var32 * var32 * var32 * (var32 * (var32 * 6.0 - 15.0) + 10.0);

         for (int var38 = 0; var38 < var10; var38++) {
            double var39 = (var6 + var38) * var15 + this.field_22;
            int var41 = (int)var39;
            if (var39 < var41) {
               var41--;
            }

            int var42 = var41 & 0xFF;
            var39 -= var41;
            double var43 = var39 * var39 * var39 * (var39 * (var39 * 6.0 - 15.0) + 10.0);

            for (int var45 = 0; var45 < var9; var45++) {
               double var46 = (var4 + var45) * var13 + this.field_666;
               int var48 = (int)var46;
               if (var46 < var48) {
                  var48--;
               }

               int var49 = var48 & 0xFF;
               var46 -= var48;
               double var50 = var46 * var46 * var46 * (var46 * (var46 * 6.0 - 15.0) + 10.0);
               if (var45 == 0 || var49 != var22) {
                  var22 = var49;
                  int var52 = this.field_1349[var35] + var49;
                  int var53 = this.field_1349[var52] + var42;
                  int var54 = this.field_1349[var52 + 1] + var42;
                  int var55 = this.field_1349[var35 + 1] + var49;
                  int var56 = this.field_1349[var55] + var42;
                  int var57 = this.field_1349[var55 + 1] + var42;
                  var23 = this.method_346(
                     var36, this.method_845(this.field_1349[var53], var32, var46, var39), this.method_845(this.field_1349[var56], var32 - 1.0, var46, var39)
                  );
                  var25 = this.method_346(
                     var36,
                     this.method_845(this.field_1349[var54], var32, var46 - 1.0, var39),
                     this.method_845(this.field_1349[var57], var32 - 1.0, var46 - 1.0, var39)
                  );
                  var27 = this.method_346(
                     var36,
                     this.method_845(this.field_1349[var53 + 1], var32, var46, var39 - 1.0),
                     this.method_845(this.field_1349[var56 + 1], var32 - 1.0, var46, var39 - 1.0)
                  );
                  var29 = this.method_346(
                     var36,
                     this.method_845(this.field_1349[var54 + 1], var32, var46 - 1.0, var39 - 1.0),
                     this.method_845(this.field_1349[var57 + 1], var32 - 1.0, var46 - 1.0, var39 - 1.0)
                  );
               }

               double var62 = this.method_346(var50, var23, var25);
               double var63 = this.method_346(var50, var27, var29);
               double var64 = this.method_346(var43, var62, var63);
               int var58 = var19++;
               var1[var58] += var64 * var20;
            }
         }
      }
   }
}
