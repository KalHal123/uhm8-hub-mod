package x;

import java.util.ArrayList;
import java.util.Random;

public class Class0238 extends Class0019 {
   private Boolean 5OSzrcDfcoelhQeqXc9Gl0B2Y0c5YiKMMl5Q8piH441M90c1E3z2956JF48f = null;

   public Class0238 _1di7Bn6foJ7FVLIz94n9n1coj7EVW2pD495SmmtM3d6x6Rvu0ok0rU7IJNn/* $VF was: 91di7Bn6foJ7FVLIz94n9n1coj7EVW2pD495SmmtM3d6x6Rvu0ok0rU7IJNn */(
      boolean var1
   ) {
      this.5OSzrcDfcoelhQeqXc9Gl0B2Y0c5YiKMMl5Q8piH441M90c1E3z2956JF48f = var1;
      return this;
   }

   private boolean _U1SX2WqThqu8R93IlQGMN38xN4oV63gHgwWYOG89721sAYIp4o3e741Ak1x/* $VF was: 6U1SX2WqThqu8R93IlQGMN38xN4oV63gHgwWYOG89721sAYIp4o3e741Ak1x */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      int var6 = Class0326.290TyZs78735bF1Sz65A264ITdG7GdrLVQQFP92PQi9P01v7CpAw2qAzbKV7.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      int var7 = Class0326.32fEZ0vq2n6kiYiCU6WAD7KPJZFUb7r2gYsm7E88O6Km7FT06ZE03xvpMjw2.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      int var8 = var2.nextInt(4) + 4;
      boolean var9 = true;
      if (var4 >= 1 && var4 + var8 + 1 <= 128) {
         for (int var10 = var4; var10 <= var4 + 1 + var8; var10++) {
            byte var14 = 1;
            if (var10 == var4) {
               var14 = 0;
            }

            if (var10 >= var4 + 1 + var8 - 2) {
               var14 = 2;
            }

            for (int var11 = var3 - var14; var11 <= var3 + var14 && var9; var11++) {
               for (int var12 = var5 - var14; var12 <= var5 + var14 && var9; var12++) {
                  if (var10 >= 0 && var10 < 128) {
                     int var13 = var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                        var11, var10, var12
                     );
                     if (var13 != 0 && var13 != var7) {
                        var9 = false;
                     }
                  } else {
                     var9 = false;
                  }
               }
            }
         }

         if (!var9) {
            return false;
         }

         int var18 = var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
            var3, var4 - 1, var5
         );
         if ((
               var18 == Class0374.8BUQTnGdsm3C12q0F0RM0XhE8AIVzy6cqOCUus3fxs8528rz4J93HVLmTV8l.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                  || var18
                     == Class0374.8BUQTnGdsm3C12q0F0RM0XhE8AIVzy6cqOCUus3fxs8528rz4J93HVLmTV8l.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
            )
            && var4 < 128 - var8 - 1) {
            var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
               var3,
               var4 - 1,
               var5,
               Class0374.8BUQTnGdsm3C12q0F0RM0XhE8AIVzy6cqOCUus3fxs8528rz4J93HVLmTV8l.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
            );

            for (int var23 = var4 - 1 + var8; var23 <= var4 + var8; var23++) {
               boolean var19 = true;
               byte var21 = 1;

               for (int var22 = var3 - var21; var22 <= var3 - var21; var22++) {
                  int var15 = var22 - var3;

                  for (int var16 = var5 - var21; var16 <= var5 - var21; var16++) {
                     int var17 = var16 - var5;
                     if (!Class0374.2L7emVlws4mWlhQfXZX3Y8nHF9Yk8e4nM0d75en1z3k2T8748066N7xSJy47[var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                        var22, var23, var16
                     )]) {
                        var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
                           var22 + 1, var23, var16 + 1, var7
                        );
                     }
                  }
               }
            }

            for (int var24 = 0; var24 < var8; var24++) {
               int var20 = var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                  var3, var4 + var24, var5
               );
               if (var20 == 0 || var20 == var7) {
                  var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
                     var3, var4 + var24, var5, var6
                  );
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void _XZCka12CPfUMDgV9D8AwhpVl8zxQU8ctKEp04A776u7o7LO1SgqWyA7OiMu/* $VF was: 9XZCka12CPfUMDgV9D8AwhpVl8zxQU8ctKEp04A776u7o7LO1SgqWyA7OiMu */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      int var6 = Class0326.6w0Ak6kFf6iSvdfs83Aa067wfIAA1V8bf3pVgXkX220gNG64m9pdj4bAoPzY.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      int var7 = Class0326.7R2eB3D4RYaaza6jt6k7j0gQL0NMFy4CYAnK2J4i9TyKxifjj836822d40qD.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      float var8 = 0.0F;
      float var9 = var2.nextFloat() * (float) Math.PI * 2.0F;
      int var10 = var2.nextInt(8) + 7;
      float var11 = var4;

      for (int var12 = 0; var12 < var10; var12++) {
         var9 = (float)(var9 + (var2.nextFloat() - 0.5) * 0.1);
         var8++;
         float var13 = var8 / var10;
         var3 = (int)(
            var3
               + Class0383._61li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5/* $VF was: 561li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5 */(
                     var9
                  )
                  * (1.0F - var13)
         );
         var11 += var13;
         var5 = (int)(
            var5
               + Class0383._RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y/* $VF was: 2RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y */(
                     var9
                  )
                  * (1.0F - var13)
         );
         var4 = Math.round(var11);
         var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
            var3, var4, var5, var6
         );
      }

      var4 += var2.nextInt(2) + 1;
      int var16 = var2.nextInt(2) + 2;

      for (int var17 = 0; var17 < var16; var17++) {
         var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
            var3, var4, var5, var7
         );

         for (float var18 = 0.0F; var18 < Math.PI * 2; var18 = (float)(var18 + (Math.PI / 5))) {
            int var19 = var2.nextInt(var17 + 2) + var17 + 2;
            float var20 = var3;
            float var21 = var5;

            for (int var14 = 0; var14 < var19; var14++) {
               var21 += Class0383._RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y/* $VF was: 2RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y */(
                  var18
               );
               var20 += Class0383._61li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5/* $VF was: 561li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5 */(
                  var18
               );
               if (!var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                     Math.round(var20), var4 - var17, Math.round(var21)
                  )
                  ._HP5X3wQEG2MUgmZoYs1Zc811NBh225ncLJsqP3Ch04G7prKFIQOY3w8V3n0/* $VF was: 3HP5X3wQEG2MUgmZoYs1Zc811NBh225ncLJsqP3Ch04G7prKFIQOY3w8V3n0 */()) {
                  var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
                     Math.round(var20), var4 - var17, Math.round(var21), var7
                  );
               }
            }
         }
      }
   }

   private void _B6hHjllLOBT3IjWrLJ0hU0i4Zt1d915QwaMXrfnWpYgU7OJky16BwotGs0c/* $VF was: 8B6hHjllLOBT3IjWrLJ0hU0i4Zt1d915QwaMXrfnWpYgU7OJky16BwotGs0c */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      int var6 = Class0326.61XvY642LdD3XgUK7OO4mQ5d52V3C463uS7775BCy1xNcz7FY17GGn37KSoD.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      int var7 = var2.nextInt(3);

      for (int var8 = 0; var8 < var7; var8++) {
         int var9 = var2.nextInt(4) + 2;
         int var10 = var3;
         int var11 = var4;
         int var12 = var5;

         for (int var13 = 0; var13 < var9; var13++) {
            var10 += var2.nextInt(3) - 1;
            var11--;
            var12 += var2.nextInt(3) - 1;
            if (var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                  var10, var11, var12
               )
               != Class0374.3HLig28nH9t7mhwBU54V5V2O58AKe0W4SvYH0t3HXba1NW6aI9DTKO1OGO0n.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg) {
               var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
                  var10, var11, var12, var6
               );
            }
         }
      }
   }

   private boolean _A5LOahX0QA4N6J3gv4sd06Wfy9IE92Q7979r3tIeu9jasoNU12Rq29U1n6u/* $VF was: 4A5LOahX0QA4N6J3gv4sd06Wfy9IE92Q7979r3tIeu9jasoNU12Rq29U1n6u */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      int var6 = Class0326.6w0Ak6kFf6iSvdfs83Aa067wfIAA1V8bf3pVgXkX220gNG64m9pdj4bAoPzY.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      int var7 = Class0326.7R2eB3D4RYaaza6jt6k7j0gQL0NMFy4CYAnK2J4i9TyKxifjj836822d40qD.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      if (var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
               var3, var4 - 1, var5
            )
            != Class0374.7PNon6vXb15QMPF2RsGjkMT2XUJ34uf1bCtR2s36iU8f2S4h9ad2QNz13ZbQ.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
         && var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
               var3, var4 - 1, var5
            )
            != Class0374.6j4yS8klFSfIfD965MZ6mY0ONg4WtVPHoC2zi9VEluvDD7f3XYn5Sy418jGK.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg) {
         return true;
      }

      Random var8 = new Random(var2.nextLong() + var3 + var4 + var5 + var1.0I1d62cDt27eX5XR4dH3ENv3Gx50msU4F2b6CTMh2E7v1r34XKKA6YmTFjcA);
      ArrayList var9 = new ArrayList();
      int var10 = 7 + var8.nextInt(10);
      var9.add(
         Class0046._R6Ct2j71RDuXZAq358OMe8d5N8pr4dyImRXjRhXWc6848sUUDAWLmdmJ48n/* $VF was: 8R6Ct2j71RDuXZAq358OMe8d5N8pr4dyImRXjRhXWc6848sUUDAWLmdmJ48n */(
            var3, var4 + var10, var5
         )
      );

      for (int var11 = 0; var9.size() > 0; var11++) {
         for (Class0046 var13 : new ArrayList(var9)) {
            int var14 = (int)Math.round(var13.02TXG7qRT4aa2n906to45cfaZpszzcA38Ox7XU7AC69n58fTTxf85CesWH02);
            int var15 = (int)Math.round(var13.16zNz8pF7XAJ1JEV1T1a5YuX6H199stRsJD923yZaGID14Yiliyl1elzg900);
            int var16 = (int)Math.round(var13.36ctH4WYfNGZ1U2c159qWNCDzP1L885HmTi51Oyn4t8n0jYcFaYv7C6qfsTQ);
            if ((
                  !var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                           var14, var15, var16
                        )
                        ._HP5X3wQEG2MUgmZoYs1Zc811NBh225ncLJsqP3Ch04G7prKFIQOY3w8V3n0/* $VF was: 3HP5X3wQEG2MUgmZoYs1Zc811NBh225ncLJsqP3Ch04G7prKFIQOY3w8V3n0 */()
                     || var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                           var14, var15, var16
                        )
                        != var7
               )
               && var15 >= 0
               && (var8.nextInt(3) != 0 || var9.size() <= 3)) {
               var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
                  var14, var15, var16, var6
               );
               int var17 = 0;

               while (var8.nextInt(var9.size() / 30 + 2) <= 1 && var9.size() <= 10000) {
                  if (++var17 >= 4) {
                     break;
                  }

                  Class0046 var18 = var13._3QT754BcvIH455397FsoUedcw31u1Sqd4t8AKL44UU37Nf17SE0uqrXXrz7/* $VF was: 23QT754BcvIH455397FsoUedcw31u1Sqd4t8AKL44UU37Nf17SE0uqrXXrz7 */(
                     var8.nextInt(3) - 1, -1.0, var8.nextInt(3) - 1
                  );
                  var9.add(var18);
               }

               if (var11 > 2 && var8.nextInt(Math.max(40, 78 - var11)) == 3) {
                  this._XZCka12CPfUMDgV9D8AwhpVl8zxQU8ctKEp04A776u7o7LO1SgqWyA7OiMu/* $VF was: 9XZCka12CPfUMDgV9D8AwhpVl8zxQU8ctKEp04A776u7o7LO1SgqWyA7OiMu */(
                     var1, var2, var14, var15, var16
                  );
               }

               var9.remove(var13);
               var9.add(
                  var13._3QT754BcvIH455397FsoUedcw31u1Sqd4t8AKL44UU37Nf17SE0uqrXXrz7/* $VF was: 23QT754BcvIH455397FsoUedcw31u1Sqd4t8AKL44UU37Nf17SE0uqrXXrz7 */(
                     0.0, -1.0, 0.0
                  )
               );
            } else {
               var9.remove(var13);
               if (var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                        var14, var15, var16
                     )
                     == Class0374.8BUQTnGdsm3C12q0F0RM0XhE8AIVzy6cqOCUus3fxs8528rz4J93HVLmTV8l.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                  || var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                        var14, var15, var16
                     )
                     == Class0374.8BUQTnGdsm3C12q0F0RM0XhE8AIVzy6cqOCUus3fxs8528rz4J93HVLmTV8l.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg) {
                  this._B6hHjllLOBT3IjWrLJ0hU0i4Zt1d915QwaMXrfnWpYgU7OJky16BwotGs0c/* $VF was: 8B6hHjllLOBT3IjWrLJ0hU0i4Zt1d915QwaMXrfnWpYgU7OJky16BwotGs0c */(
                     var1, var8, var14, var15, var16
                  );
               }
            }
         }
      }

      return true;
   }

   @Override
   public boolean _QASFp0IVH1Io4Y6hWJ89W819w74iAGD0XCK30D5J5JohH4SSZzEmdpLguZl/* $VF was: 4QASFp0IVH1Io4Y6hWJ89W819w74iAGD0XCK30D5J5JohH4SSZzEmdpLguZl */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      Random var6 = new Random(var2.nextLong() + var3 + var4 + var5 + var1.0I1d62cDt27eX5XR4dH3ENv3Gx50msU4F2b6CTMh2E7v1r34XKKA6YmTFjcA);
      return this.5OSzrcDfcoelhQeqXc9Gl0B2Y0c5YiKMMl5Q8piH441M90c1E3z2956JF48f == null
            || var6.nextInt(150) != 0 && !this.5OSzrcDfcoelhQeqXc9Gl0B2Y0c5YiKMMl5Q8piH441M90c1E3z2956JF48f
         ? this._U1SX2WqThqu8R93IlQGMN38xN4oV63gHgwWYOG89721sAYIp4o3e741Ak1x/* $VF was: 6U1SX2WqThqu8R93IlQGMN38xN4oV63gHgwWYOG89721sAYIp4o3e741Ak1x */(
            var1, var2, var3, var4, var5
         )
         : this._A5LOahX0QA4N6J3gv4sd06Wfy9IE92Q7979r3tIeu9jasoNU12Rq29U1n6u/* $VF was: 4A5LOahX0QA4N6J3gv4sd06Wfy9IE92Q7979r3tIeu9jasoNU12Rq29U1n6u */(
            var1, var2, var3, var4, var5
         );
   }
}
