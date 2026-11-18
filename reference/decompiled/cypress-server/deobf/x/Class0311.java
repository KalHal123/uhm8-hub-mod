package x;

import java.util.Random;

public class Class0311 extends Class0149 {
   protected void _UBHBLxoPQXtpb7H2T8GvX33X27UYeWDl7dfc66vpETT0FLeu7y46Rm8MRxg/* $VF was: 0UBHBLxoPQXtpb7H2T8GvX33X27UYeWDl7dfc66vpETT0FLeu7y46Rm8MRxg */(
      int var1, int var2, byte[] var3, double var4, double var6, double var8
   ) {
      this._RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62/* $VF was: 0RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62 */(
         var1,
         var2,
         var3,
         var4,
         var6,
         var8,
         1.0F + this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextFloat() * 6.0F,
         0.0F,
         0.0F,
         -1,
         -1,
         0.5
      );
   }

   protected void _RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62/* $VF was: 0RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62 */(
      int var1, int var2, byte[] var3, double var4, double var6, double var8, float var10, float var11, float var12, int var13, int var14, double var15
   ) {
      double var17 = var1 * 16 + 8;
      double var19 = var2 * 16 + 8;
      float var21 = 0.0F;
      float var22 = 0.0F;
      Random var23 = new Random(this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextLong());
      if (var14 <= 0) {
         int var24 = this.8H1m1JwHjYznI5gWtTnn4vQ9F1pGOGN1zx4c1YHugEoqYrF3C52w1BRveR5z * 16 - 16;
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
         double var27 = 1.5
            + Class0383._RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y/* $VF was: 2RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y */(
                  var13 * (float) Math.PI / var14
               )
               * var10
               * 1.0F;
         double var29 = var27 * var15;
         float var31 = Class0383._61li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5/* $VF was: 561li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5 */(
            var12
         );
         float var32 = Class0383._RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y/* $VF was: 2RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y */(
            var12
         );
         var4 += Class0383._61li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5/* $VF was: 561li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5 */(
               var11
            )
            * var31;
         var6 += var32;
         var8 += Class0383._RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y/* $VF was: 2RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y */(
               var11
            )
            * var31;
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
            this._RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62/* $VF was: 0RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62 */(
               var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 - (float) (Math.PI / 2), var12 / 3.0F, var13, var14, 1.0
            );
            this._RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62/* $VF was: 0RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62 */(
               var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 + (float) (Math.PI / 2), var12 / 3.0F, var13, var14, 1.0
            );
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
               int var41 = Class0383._1Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1/* $VF was: 51Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1 */(
                     var4 - var27
                  )
                  - var1 * 16
                  - 1;
               int var42 = Class0383._1Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1/* $VF was: 51Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1 */(
                     var4 + var27
                  )
                  - var1 * 16
                  + 1;
               int var43 = Class0383._1Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1/* $VF was: 51Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1 */(
                     var6 - var29
                  )
                  - 1;
               int var44 = Class0383._1Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1/* $VF was: 51Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1 */(
                     var6 + var29
                  )
                  + 1;
               int var45 = Class0383._1Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1/* $VF was: 51Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1 */(
                     var8 - var27
                  )
                  - var2 * 16
                  - 1;
               int var46 = Class0383._1Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1/* $VF was: 51Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1 */(
                     var8 + var27
                  )
                  - var2 * 16
                  + 1;
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
                           if (var3[var49]
                                 == Class0374.6WvJ6V26pr5u0Fh3Q3Y68RSs29gTa6XNLg3WpPim67g49Usu7pi58cJWNZQ1.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                              || var3[var49]
                                 == Class0374.3Gt3dwovB7WMJC12rZwamdpVuoM683E2LUqOZ7L5Fvk91ofNV238Ei5e3796.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                              )
                            {
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
                              if (var59
                                 == Class0374.7PNon6vXb15QMPF2RsGjkMT2XUJ34uf1bCtR2s36iU8f2S4h9ad2QNz13ZbQ.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                                 )
                               {
                                 var55 = true;
                              }

                              if (var59
                                    == Class0374.84wY2TV2G2Ezy2W68u63fFsKVC8cf1JnBo37PyEkE9dS542N2v3XUR9NujZ0.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                                 || var59
                                    == Class0374.6j4yS8klFSfIfD965MZ6mY0ONg4WtVPHoC2zi9VEluvDD7f3XYn5Sy418jGK.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                                 || var59
                                    == Class0374.7PNon6vXb15QMPF2RsGjkMT2XUJ34uf1bCtR2s36iU8f2S4h9ad2QNz13ZbQ.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                                 )
                               {
                                 if (var56 < 10) {
                                    var3[var54] = (byte)Class0374.6p4pFe4OBkDaRCv34TlO6rfnkjs2UXDQy5V5gJ1rwNKtCE8jEv2w0HA821CD.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
                                 } else {
                                    var3[var54] = 0;
                                    if (var55
                                       && var3[var54 - 1]
                                          == Class0374.6j4yS8klFSfIfD965MZ6mY0ONg4WtVPHoC2zi9VEluvDD7f3XYn5Sy418jGK.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                                       )
                                     {
                                       var3[var54 - 1] = (byte)Class0374.7PNon6vXb15QMPF2RsGjkMT2XUJ34uf1bCtR2s36iU8f2S4h9ad2QNz13ZbQ.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
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
   protected void _rkn44mCkcq7F34026OAUEs1jwc4kj022u9pl28I0ZeFbb9DFaoIbfnlY62C/* $VF was: 4rkn44mCkcq7F34026OAUEs1jwc4kj022u9pl28I0ZeFbb9DFaoIbfnlY62C */(
      Class0320 var1, int var2, int var3, int var4, int var5, byte[] var6
   ) {
      int var7 = this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5
         .nextInt(
            this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5
                  .nextInt(this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextInt(40) + 1)
               + 1
         );
      if (this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextInt(15) != 0) {
         var7 = 0;
      }

      for (int var8 = 0; var8 < var7; var8++) {
         double var9 = var2 * 16 + this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextInt(16);
         double var11 = this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5
            .nextInt(this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextInt(120) + 8);
         double var13 = var3 * 16 + this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextInt(16);
         int var15 = 1;
         if (this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextInt(4) == 0) {
            this._UBHBLxoPQXtpb7H2T8GvX33X27UYeWDl7dfc66vpETT0FLeu7y46Rm8MRxg/* $VF was: 0UBHBLxoPQXtpb7H2T8GvX33X27UYeWDl7dfc66vpETT0FLeu7y46Rm8MRxg */(
               var4, var5, var6, var9, var11, var13
            );
            var15 += this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextInt(4);
         }

         for (int var16 = 0; var16 < var15; var16++) {
            float var17 = this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextFloat() * (float) Math.PI * 2.0F;
            float var18 = (this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextFloat() * 2.0F
               + this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextFloat();
            this._RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62/* $VF was: 0RrfRL5iOQRGq1zf0508Q573Dt4887JLn1bc5Y4CEhd297590Q75Z09oyl62 */(
               var4, var5, var6, var9, var11, var13, var19, var17, var18, 0, 0, 1.0
            );
         }
      }
   }
}
