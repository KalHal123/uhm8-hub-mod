import java.util.Random;

public class 1ICVnGhfs4cDkq364iDD6irgW0QCEUrMwN4q9cEO5BW67u5q10M6lLi1L7Qmvh0zf2Ai3hcP0zit7M8eR0SWk9wgNQusHQ
   extends 00g5IUR8M9h1Qk3Q2l5IGnt1pcUAb9xnkg0bo08DPO8b47Yso45Rf3997dINCEJ9P33vSw6N230USoE9jC9xz494SAct {
   private int[] 449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X = new int[512];
   public double 41c2evUolD5ak87wb7oO6VdDO102e0SclCrecow41AN649zTjw3m3P32J84p;
   public double 210KLuW1JQ08S12o4mRGh5pU6A2nWF99G253cp7g3R89e4U6PYi9J0e8e7ez;
   public double 023vk7KHM00h03keia8F01E87GonRc3VHM5HL3R44941Yfb49a6625WFDKyW;

   public _ICVnGhfs4cDkq364iDD6irgW0QCEUrMwN4q9cEO5BW67u5q10M6lLi1L7Qmvh0zf2Ai3hcP0zit7M8eR0SWk9wgNQusHQ/* $VF was: 1ICVnGhfs4cDkq364iDD6irgW0QCEUrMwN4q9cEO5BW67u5q10M6lLi1L7Qmvh0zf2Ai3hcP0zit7M8eR0SWk9wgNQusHQ */() {
      this(new Random());
   }

   public _ICVnGhfs4cDkq364iDD6irgW0QCEUrMwN4q9cEO5BW67u5q10M6lLi1L7Qmvh0zf2Ai3hcP0zit7M8eR0SWk9wgNQusHQ/* $VF was: 1ICVnGhfs4cDkq364iDD6irgW0QCEUrMwN4q9cEO5BW67u5q10M6lLi1L7Qmvh0zf2Ai3hcP0zit7M8eR0SWk9wgNQusHQ */(
      Random var1
   ) {
      this.41c2evUolD5ak87wb7oO6VdDO102e0SclCrecow41AN649zTjw3m3P32J84p = var1.nextDouble() * 256.0;
      this.210KLuW1JQ08S12o4mRGh5pU6A2nWF99G253cp7g3R89e4U6PYi9J0e8e7ez = var1.nextDouble() * 256.0;
      this.023vk7KHM00h03keia8F01E87GonRc3VHM5HL3R44941Yfb49a6625WFDKyW = var1.nextDouble() * 256.0;
      int var2 = 0;

      while (var2 < 256) {
         this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var2] = var2++;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         int var3 = var1.nextInt(256 - var5) + var5;
         int var4 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var5];
         this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var5] = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var3];
         this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var3] = var4;
         this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var5 + 256] = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var5];
      }
   }

   public double _035L9zsqtfWfBARoe6qQrc66or0EN2zKOI3OuRNpWlPXHqZuV212V97117H/* $VF was: 5035L9zsqtfWfBARoe6qQrc66or0EN2zKOI3OuRNpWlPXHqZuV212V97117H */(
      double var1, double var3, double var5
   ) {
      double var7 = var1 + this.41c2evUolD5ak87wb7oO6VdDO102e0SclCrecow41AN649zTjw3m3P32J84p;
      double var9 = var3 + this.210KLuW1JQ08S12o4mRGh5pU6A2nWF99G253cp7g3R89e4U6PYi9J0e8e7ez;
      double var11 = var5 + this.023vk7KHM00h03keia8F01E87GonRc3VHM5HL3R44941Yfb49a6625WFDKyW;
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
      int var25 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var16] + var17;
      int var26 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var25] + var18;
      int var27 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var25 + 1] + var18;
      int var28 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var16 + 1] + var17;
      int var29 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var28] + var18;
      int var30 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var28 + 1] + var18;
      return this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
         var23,
         this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
            var21,
            this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
               var19,
               this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                  this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var26], var7, var9, var11
               ),
               this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                  this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var29], var7 - 1.0, var9, var11
               )
            ),
            this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
               var19,
               this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                  this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var27], var7, var9 - 1.0, var11
               ),
               this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                  this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var30], var7 - 1.0, var9 - 1.0, var11
               )
            )
         ),
         this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
            var21,
            this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
               var19,
               this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                  this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var26 + 1], var7, var9, var11 - 1.0
               ),
               this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                  this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var29 + 1], var7 - 1.0, var9, var11 - 1.0
               )
            ),
            this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
               var19,
               this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                  this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var27 + 1], var7, var9 - 1.0, var11 - 1.0
               ),
               this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                  this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var30 + 1], var7 - 1.0, var9 - 1.0, var11 - 1.0
               )
            )
         )
      );
   }

   public double _ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
      double var1, double var3, double var5
   ) {
      return var3 + var1 * (var5 - var3);
   }

   public double _DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
      int var1, double var2, double var4, double var6
   ) {
      int var8 = var1 & 15;
      double var9 = var8 < 8 ? var2 : var4;
      double var11 = var8 < 4 ? var4 : (var8 != 12 && var8 != 14 ? var6 : var2);
      return ((var8 & 1) == 0 ? var9 : -var9) + ((var8 & 2) == 0 ? var11 : -var11);
   }

   public double _03Ue0NQRCM395dDHb41IC3gTE0wHASFW7l5Kd4X28z0W97a289cIJ560suF/* $VF was: 203Ue0NQRCM395dDHb41IC3gTE0wHASFW7l5Kd4X28z0W97a289cIJ560suF */(
      double var1, double var3
   ) {
      return this._035L9zsqtfWfBARoe6qQrc66or0EN2zKOI3OuRNpWlPXHqZuV212V97117H/* $VF was: 5035L9zsqtfWfBARoe6qQrc66or0EN2zKOI3OuRNpWlPXHqZuV212V97117H */(
         var1, var3, 0.0
      );
   }

   public void _26JWQoUZ234v69Qivrnbr611TaO65yv5m53XG6KBMUsWP8391et23J94W5U/* $VF was: 926JWQoUZ234v69Qivrnbr611TaO65yv5m53XG6KBMUsWP8391et23J94W5U */(
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
         double var32 = (var2 + var31) * var11 + this.41c2evUolD5ak87wb7oO6VdDO102e0SclCrecow41AN649zTjw3m3P32J84p;
         int var34 = (int)var32;
         if (var32 < var34) {
            var34--;
         }

         int var35 = var34 & 0xFF;
         var32 -= var34;
         double var36 = var32 * var32 * var32 * (var32 * (var32 * 6.0 - 15.0) + 10.0);

         for (int var38 = 0; var38 < var10; var38++) {
            double var39 = (var6 + var38) * var15 + this.023vk7KHM00h03keia8F01E87GonRc3VHM5HL3R44941Yfb49a6625WFDKyW;
            int var41 = (int)var39;
            if (var39 < var41) {
               var41--;
            }

            int var42 = var41 & 0xFF;
            var39 -= var41;
            double var43 = var39 * var39 * var39 * (var39 * (var39 * 6.0 - 15.0) + 10.0);

            for (int var45 = 0; var45 < var9; var45++) {
               double var46 = (var4 + var45) * var13 + this.210KLuW1JQ08S12o4mRGh5pU6A2nWF99G253cp7g3R89e4U6PYi9J0e8e7ez;
               int var48 = (int)var46;
               if (var46 < var48) {
                  var48--;
               }

               int var49 = var48 & 0xFF;
               var46 -= var48;
               double var50 = var46 * var46 * var46 * (var46 * (var46 * 6.0 - 15.0) + 10.0);
               if (var45 == 0 || var49 != var22) {
                  var22 = var49;
                  int var52 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var35] + var49;
                  int var53 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var52] + var42;
                  int var54 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var52 + 1] + var42;
                  int var55 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var35 + 1] + var49;
                  int var56 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var55] + var42;
                  int var57 = this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var55 + 1] + var42;
                  var23 = this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
                     var36,
                     this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                        this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var53], var32, var46, var39
                     ),
                     this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                        this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var56], var32 - 1.0, var46, var39
                     )
                  );
                  var25 = this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
                     var36,
                     this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                        this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var54], var32, var46 - 1.0, var39
                     ),
                     this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                        this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var57], var32 - 1.0, var46 - 1.0, var39
                     )
                  );
                  var27 = this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
                     var36,
                     this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                        this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var53 + 1], var32, var46, var39 - 1.0
                     ),
                     this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                        this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var56 + 1], var32 - 1.0, var46, var39 - 1.0
                     )
                  );
                  var29 = this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
                     var36,
                     this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                        this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var54 + 1], var32, var46 - 1.0, var39 - 1.0
                     ),
                     this._DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64/* $VF was: 4DT217uc1phoUw8wbdR80v6hdBMaxxvHsoFZUiLC48uhmx7vdW7gQkjzOv64 */(
                        this.449TTW759NYNhN8I55W9gawbOY1wRdIi9j4Gwa8MZSm88jDz2H2S2133601X[var57 + 1], var32 - 1.0, var46 - 1.0, var39 - 1.0
                     )
                  );
               }

               double var62 = this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
                  var50, var23, var25
               );
               double var63 = this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
                  var50, var27, var29
               );
               double var64 = this._ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX/* $VF was: 1ZW21tUf1va81C0bHdX4j69l9JrU1E6OyhfFZ65FQjn31m19E6u8to4bRtRX */(
                  var43, var62, var63
               );
               int var58 = var19++;
               var1[var58] += var64 * var20;
            }
         }
      }
   }
}
