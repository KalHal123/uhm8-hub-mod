import java.util.Random;

public class u extends bg {
   private int[] d = new int[512];
   public double a;
   public double b;
   public double c;

   public u() {
      this(new Random());
   }

   public u(Random var1) {
      this.a = var1.nextDouble() * 256.0;
      this.b = var1.nextDouble() * 256.0;
      this.c = var1.nextDouble() * 256.0;
      int var2 = 0;

      while (var2 < 256) {
         this.d[var2] = var2++;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         int var3 = var1.nextInt(256 - var5) + var5;
         int var4 = this.d[var5];
         this.d[var5] = this.d[var3];
         this.d[var3] = var4;
         this.d[var5 + 256] = this.d[var5];
      }
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 + this.a;
      double var9 = var3 + this.b;
      double var11 = var5 + this.c;
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
      int var25 = this.d[var16] + var17;
      int var26 = this.d[var25] + var18;
      int var27 = this.d[var25 + 1] + var18;
      int var28 = this.d[var16 + 1] + var17;
      int var29 = this.d[var28] + var18;
      int var30 = this.d[var28 + 1] + var18;
      return this.b(
         var23,
         this.b(
            var21,
            this.b(var19, this.a(this.d[var26], var7, var9, var11), this.a(this.d[var29], var7 - 1.0, var9, var11)),
            this.b(var19, this.a(this.d[var27], var7, var9 - 1.0, var11), this.a(this.d[var30], var7 - 1.0, var9 - 1.0, var11))
         ),
         this.b(
            var21,
            this.b(var19, this.a(this.d[var26 + 1], var7, var9, var11 - 1.0), this.a(this.d[var29 + 1], var7 - 1.0, var9, var11 - 1.0)),
            this.b(var19, this.a(this.d[var27 + 1], var7, var9 - 1.0, var11 - 1.0), this.a(this.d[var30 + 1], var7 - 1.0, var9 - 1.0, var11 - 1.0))
         )
      );
   }

   public double b(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   public double a(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      double var9 = var8 < 8 ? var2 : var4;
      double var11 = var8 < 4 ? var4 : (var8 != 12 && var8 != 14 ? var6 : var2);
      return ((var8 & 1) == 0 ? var9 : -var9) + ((var8 & 2) == 0 ? var11 : -var11);
   }

   public double a(double var1, double var3) {
      return this.a(var1, var3, 0.0);
   }

   public void a(double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15, double var17) {
      int var19 = 0;
      double var20 = 1.0 / var17;
      int var22 = -1;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;
      double var29 = 0.0;
      double var31 = 0.0;
      double var33 = 0.0;
      double var35 = 0.0;

      for (int var37 = 0; var37 < var8; var37++) {
         double var38 = (var2 + var37) * var11 + this.a;
         int var40 = (int)var38;
         if (var38 < var40) {
            var40--;
         }

         int var41 = var40 & 0xFF;
         var38 -= var40;
         double var42 = var38 * var38 * var38 * (var38 * (var38 * 6.0 - 15.0) + 10.0);

         for (int var44 = 0; var44 < var10; var44++) {
            double var45 = (var6 + var44) * var15 + this.c;
            int var47 = (int)var45;
            if (var45 < var47) {
               var47--;
            }

            int var48 = var47 & 0xFF;
            var45 -= var47;
            double var49 = var45 * var45 * var45 * (var45 * (var45 * 6.0 - 15.0) + 10.0);

            for (int var51 = 0; var51 < var9; var51++) {
               double var52 = (var4 + var51) * var13 + this.b;
               int var54 = (int)var52;
               if (var52 < var54) {
                  var54--;
               }

               int var55 = var54 & 0xFF;
               var52 -= var54;
               double var56 = var52 * var52 * var52 * (var52 * (var52 * 6.0 - 15.0) + 10.0);
               if (var51 == 0 || var55 != var22) {
                  var22 = var55;
                  var23 = this.d[var41] + var55;
                  var24 = this.d[var23] + var48;
                  var25 = this.d[var23 + 1] + var48;
                  var26 = this.d[var41 + 1] + var55;
                  var27 = this.d[var26] + var48;
                  var28 = this.d[var26 + 1] + var48;
                  var29 = this.b(var42, this.a(this.d[var24], var38, var52, var45), this.a(this.d[var27], var38 - 1.0, var52, var45));
                  var31 = this.b(var42, this.a(this.d[var25], var38, var52 - 1.0, var45), this.a(this.d[var28], var38 - 1.0, var52 - 1.0, var45));
                  var33 = this.b(var42, this.a(this.d[var24 + 1], var38, var52, var45 - 1.0), this.a(this.d[var27 + 1], var38 - 1.0, var52, var45 - 1.0));
                  var35 = this.b(
                     var42, this.a(this.d[var25 + 1], var38, var52 - 1.0, var45 - 1.0), this.a(this.d[var28 + 1], var38 - 1.0, var52 - 1.0, var45 - 1.0)
                  );
               }

               double var58 = this.b(var56, var29, var31);
               double var60 = this.b(var56, var33, var35);
               double var62 = this.b(var49, var58, var60);
               var1[var19++] += var62 * var20;
            }
         }
      }
   }
}
