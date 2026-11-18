package x;

import java.util.ArrayList;
import java.util.Random;

public class Class0022 extends Class0019 {
   private Boolean 9qqkOsA6p362jXgjJHBZjg81198O3g5E0I5S565gPw3CF63nbt5f8LflD5D0 = null;

   public Class0022 _40Ds4KKUsIXBA4gOfhfRI73ZSpW2fH941QpWcgo7dRq3r57itOd4tinaHVc/* $VF was: 540Ds4KKUsIXBA4gOfhfRI73ZSpW2fH941QpWcgo7dRq3r57itOd4tinaHVc */(
      boolean var1
   ) {
      this.9qqkOsA6p362jXgjJHBZjg81198O3g5E0I5S565gPw3CF63nbt5f8LflD5D0 = var1;
      return this;
   }

   private boolean _3jEjo67h9kHcD3EHCF621Q94C7f6Z4m9TsSu96DC07QhDH20F2014563ETA/* $VF was: 93jEjo67h9kHcD3EHCF621Q94C7f6Z4m9TsSu96DC07QhDH20F2014563ETA */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      int var6 = Class0374.13rQHj7jyK2n010yQ2rV862eska8BZiCAH4ogMzHE9pr6DgIRIy0WF95zDaI.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      int var7 = Class0374.56iEq00y1pozIA7jMx4e22a3mg4513a5c0nA7L9Z3xFuZW4arBrYZ7QshP7u.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      if (var2.nextInt(100) <= 5) {
         var6 = Class0326.0a0xco5j0v6RbF4nkpthp07GapLduKaM6IPXX6Z8pK74W8uW30wiV6ug86S7.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
         var7 = Class0326.5He7e111KoUkC6c0oqPazMAjdT3bFsFMMNBX7kCZ2881Lt120W8P3m0V161z.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      }

      int var8 = var2.nextInt(4) + 4;
      int var9 = var2.nextInt(100);
      if (var9 >= 6 && var9 <= 14) {
         var6 = Class0326.7Jw487v921PQZ784fW6S4ik3jTxnY4Vy85I3O5s5mhF6J5nh7TWpfMsfN883.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
         var7 = Class0326.74M5f90b9j8njfM42RuX1wA6mO943esNI3Y4Nn82L6r08kG5BQNlOPtfrkOl.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
         var8 = var2.nextInt(1) + 1;
      }

      boolean var10 = true;
      if (var4 >= 1 && var4 + var8 + 1 <= 128) {
         for (int var11 = var4; var11 <= var4 + 1 + var8; var11++) {
            byte var15 = 1;
            if (var11 == var4) {
               var15 = 0;
            }

            if (var11 >= var4 + 1 + var8 - 2) {
               var15 = 2;
            }

            for (int var12 = var3 - var15; var12 <= var3 + var15 && var10; var12++) {
               for (int var13 = var5 - var15; var13 <= var5 + var15 && var10; var13++) {
                  if (var11 >= 0 && var11 < 128) {
                     int var14 = var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                        var12, var11, var13
                     );
                     if (var14 != 0 && var14 != var7) {
                        var10 = false;
                     }
                  } else {
                     var10 = false;
                  }
               }
            }
         }

         if (!var10) {
            return false;
         }

         int var19 = var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
            var3, var4 - 1, var5
         );
         if ((
               var19 == Class0374.7PNon6vXb15QMPF2RsGjkMT2XUJ34uf1bCtR2s36iU8f2S4h9ad2QNz13ZbQ.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                  || var19
                     == Class0374.6j4yS8klFSfIfD965MZ6mY0ONg4WtVPHoC2zi9VEluvDD7f3XYn5Sy418jGK.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
            )
            && var4 < 128 - var8 - 1) {
            var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
               var3,
               var4 - 1,
               var5,
               Class0374.6j4yS8klFSfIfD965MZ6mY0ONg4WtVPHoC2zi9VEluvDD7f3XYn5Sy418jGK.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
            );

            for (int var24 = var4 - 3 + var8; var24 <= var4 + var8; var24++) {
               int var20 = var24 - (var4 + var8);
               int var22 = 1 - var20 / 2;

               for (int var23 = var3 - var22; var23 <= var3 + var22; var23++) {
                  int var16 = var23 - var3;

                  for (int var17 = var5 - var22; var17 <= var5 + var22; var17++) {
                     int var18 = var17 - var5;
                     if ((Math.abs(var16) != var22 || Math.abs(var18) != var22 || var2.nextInt(2) != 0 && var20 != 0)
                        && !Class0374.2L7emVlws4mWlhQfXZX3Y8nHF9Yk8e4nM0d75en1z3k2T8748066N7xSJy47[var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                           var23, var24, var17
                        )]) {
                        var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
                           var23, var24, var17, var7
                        );
                     }
                  }
               }
            }

            for (int var25 = 0; var25 < var8; var25++) {
               int var21 = var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                  var3, var4 + var25, var5
               );
               if (var21 == 0 || var21 == var7) {
                  var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
                     var3, var4 + var25, var5, var6
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

   private void _Yh15T1eE701Yd2sN3d957VDJhHgB7om8NDiyeVKvI3KDN36xVn114sQ8q5E/* $VF was: 1Yh15T1eE701Yd2sN3d957VDJhHgB7om8NDiyeVKvI3KDN36xVn114sQ8q5E */(
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

   private void _wep7Mdg3Ed1aj702lWMT1ulV1bVC448FnKN5nzd2h5h8aydZs5L17Q02AUS/* $VF was: 8wep7Mdg3Ed1aj702lWMT1ulV1bVC448FnKN5nzd2h5h8aydZs5L17Q02AUS */(
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

   private boolean _28TyP8W7PCI3g6g3Zg8iv8pTTPQFIfdpmWYM2j8IZ2GKhZ0Hdgp8RUKz5QY/* $VF was: 828TyP8W7PCI3g6g3Zg8iv8pTTPQFIfdpmWYM2j8IZ2GKhZ0Hdgp8RUKz5QY */(
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
                  this._Yh15T1eE701Yd2sN3d957VDJhHgB7om8NDiyeVKvI3KDN36xVn114sQ8q5E/* $VF was: 1Yh15T1eE701Yd2sN3d957VDJhHgB7om8NDiyeVKvI3KDN36xVn114sQ8q5E */(
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
                     == Class0374.6j4yS8klFSfIfD965MZ6mY0ONg4WtVPHoC2zi9VEluvDD7f3XYn5Sy418jGK.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                  || var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                        var14, var15, var16
                     )
                     == Class0374.7PNon6vXb15QMPF2RsGjkMT2XUJ34uf1bCtR2s36iU8f2S4h9ad2QNz13ZbQ.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg) {
                  this._wep7Mdg3Ed1aj702lWMT1ulV1bVC448FnKN5nzd2h5h8aydZs5L17Q02AUS/* $VF was: 8wep7Mdg3Ed1aj702lWMT1ulV1bVC448FnKN5nzd2h5h8aydZs5L17Q02AUS */(
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
      return this.9qqkOsA6p362jXgjJHBZjg81198O3g5E0I5S565gPw3CF63nbt5f8LflD5D0 == null
            || var6.nextInt(150) != 0 && !this.9qqkOsA6p362jXgjJHBZjg81198O3g5E0I5S565gPw3CF63nbt5f8LflD5D0
         ? this._3jEjo67h9kHcD3EHCF621Q94C7f6Z4m9TsSu96DC07QhDH20F2014563ETA/* $VF was: 93jEjo67h9kHcD3EHCF621Q94C7f6Z4m9TsSu96DC07QhDH20F2014563ETA */(
            var1, var2, var3, var4, var5
         )
         : this._28TyP8W7PCI3g6g3Zg8iv8pTTPQFIfdpmWYM2j8IZ2GKhZ0Hdgp8RUKz5QY/* $VF was: 828TyP8W7PCI3g6g3Zg8iv8pTTPQFIfdpmWYM2j8IZ2GKhZ0Hdgp8RUKz5QY */(
            var1, var2, var3, var4, var5
         );
   }
}
