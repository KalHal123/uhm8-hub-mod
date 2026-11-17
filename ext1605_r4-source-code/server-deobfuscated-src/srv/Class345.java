package srv;

import java.util.Random;

public class Class345 extends Class217 {
   private int[] field_713 = new int[512];
   public double field_878;
   public double field_76;
   public double field_838;

   public Class345() {
      this(new Random());
   }

   public Class345(Random var1) {
      this.field_878 = var1.nextDouble() * 256.0;
      this.field_76 = var1.nextDouble() * 256.0;
      this.field_838 = var1.nextDouble() * 256.0;
      int var2 = 0;

      while (var2 < 256) {
         this.field_713[var2] = var2++;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         int var3 = var1.nextInt(256 - var5) + var5;
         int var4 = this.field_713[var5];
         this.field_713[var5] = this.field_713[var3];
         this.field_713[var3] = var4;
         this.field_713[var5 + 256] = this.field_713[var5];
      }
   }

   public double method_48(double var1, double var3, double var5) {
      double var7 = var1 + this.field_878;
      double var9 = var3 + this.field_76;
      double var11 = var5 + this.field_838;
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
      int var25 = this.field_713[var16] + var17;
      int var26 = this.field_713[var25] + var18;
      int var27 = this.field_713[var25 + 1] + var18;
      int var28 = this.field_713[var16 + 1] + var17;
      int var29 = this.field_713[var28] + var18;
      int var30 = this.field_713[var28 + 1] + var18;
      return this.method_551(
         var23,
         this.method_551(
            var21,
            this.method_551(var19, this.method_916(this.field_713[var26], var7, var9, var11), this.method_916(this.field_713[var29], var7 - 1.0, var9, var11)),
            this.method_551(
               var19, this.method_916(this.field_713[var27], var7, var9 - 1.0, var11), this.method_916(this.field_713[var30], var7 - 1.0, var9 - 1.0, var11)
            )
         ),
         this.method_551(
            var21,
            this.method_551(
               var19,
               this.method_916(this.field_713[var26 + 1], var7, var9, var11 - 1.0),
               this.method_916(this.field_713[var29 + 1], var7 - 1.0, var9, var11 - 1.0)
            ),
            this.method_551(
               var19,
               this.method_916(this.field_713[var27 + 1], var7, var9 - 1.0, var11 - 1.0),
               this.method_916(this.field_713[var30 + 1], var7 - 1.0, var9 - 1.0, var11 - 1.0)
            )
         )
      );
   }

   public double method_551(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   public double method_916(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      double var9 = var8 < 8 ? var2 : var4;
      double var11 = var8 < 4 ? var4 : (var8 != 12 && var8 != 14 ? var6 : var2);
      return ((var8 & 1) == 0 ? var9 : -var9) + ((var8 & 2) == 0 ? var11 : -var11);
   }

   public double method_78(double var1, double var3) {
      return this.method_48(var1, var3, 0.0);
   }

   public void method_154(
      double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15, double var17
   ) {
      int var19 = 0;
      double var20 = 1.0 / var17;
      int var22 = -1;
      boolean var23 = false;
      boolean var24 = false;
      boolean var25 = false;
      boolean var26 = false;
      boolean var27 = false;
      boolean var28 = false;
      double var29 = 0.0;
      double var31 = 0.0;
      double var33 = 0.0;
      double var35 = 0.0;

      for (int var37 = 0; var37 < var8; var37++) {
         double var38 = (var2 + var37) * var11 + this.field_878;
         int var40 = (int)var38;
         if (var38 < var40) {
            var40--;
         }

         int var41 = var40 & 0xFF;
         var38 -= var40;
         double var42 = var38 * var38 * var38 * (var38 * (var38 * 6.0 - 15.0) + 10.0);

         for (int var44 = 0; var44 < var10; var44++) {
            double var45 = (var6 + var44) * var15 + this.field_838;
            int var47 = (int)var45;
            if (var45 < var47) {
               var47--;
            }

            int var48 = var47 & 0xFF;
            var45 -= var47;
            double var49 = var45 * var45 * var45 * (var45 * (var45 * 6.0 - 15.0) + 10.0);

            for (int var51 = 0; var51 < var9; var51++) {
               double var52 = (var4 + var51) * var13 + this.field_76;
               int var54 = (int)var52;
               if (var52 < var54) {
                  var54--;
               }

               int var55 = var54 & 0xFF;
               var52 -= var54;
               double var56 = var52 * var52 * var52 * (var52 * (var52 * 6.0 - 15.0) + 10.0);
               if (var51 == 0 || var55 != var22) {
                  var22 = var55;
                  int var58 = this.field_713[var41] + var55;
                  int var59 = this.field_713[var58] + var48;
                  int var60 = this.field_713[var58 + 1] + var48;
                  int var61 = this.field_713[var41 + 1] + var55;
                  int var62 = this.field_713[var61] + var48;
                  int var63 = this.field_713[var61 + 1] + var48;
                  var29 = this.method_551(
                     var42, this.method_916(this.field_713[var59], var38, var52, var45), this.method_916(this.field_713[var62], var38 - 1.0, var52, var45)
                  );
                  var31 = this.method_551(
                     var42,
                     this.method_916(this.field_713[var60], var38, var52 - 1.0, var45),
                     this.method_916(this.field_713[var63], var38 - 1.0, var52 - 1.0, var45)
                  );
                  var33 = this.method_551(
                     var42,
                     this.method_916(this.field_713[var59 + 1], var38, var52, var45 - 1.0),
                     this.method_916(this.field_713[var62 + 1], var38 - 1.0, var52, var45 - 1.0)
                  );
                  var35 = this.method_551(
                     var42,
                     this.method_916(this.field_713[var60 + 1], var38, var52 - 1.0, var45 - 1.0),
                     this.method_916(this.field_713[var63 + 1], var38 - 1.0, var52 - 1.0, var45 - 1.0)
                  );
               }

               double var68 = this.method_551(var56, var29, var31);
               double var69 = this.method_551(var56, var33, var35);
               double var70 = this.method_551(var49, var68, var69);
               int var64 = var19++;
               var1[var64] += var70 * var20;
            }
         }
      }
   }
}
