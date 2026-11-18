package x;

public class Class0123 extends Class0353 {
   private Class0112 8WSn5Y01cfTU644Q181idr2OhTtjnNpr8V45H9zV2kfx9iLxc7JNQU2A28pT;
   private Class0387 4y0X01NSlVkx0ho8477C12qB54fQ1H3c3THGDE5057qa7vjE2dAp633rStkb = null;

   public Class0123(int var1, Class0112 var2, Class0387 var3) {
      this(var1, var2);
      this.4y0X01NSlVkx0ho8477C12qB54fQ1H3c3THGDE5057qa7vjE2dAp633rStkb = var3;
   }

   public Class0123(int var1, Class0112 var2) {
      super(var1);
      this.8WSn5Y01cfTU644Q181idr2OhTtjnNpr8V45H9zV2kfx9iLxc7JNQU2A28pT = var2;
      this.6PhPlV1l7Wmzk3pQluFRska0v9N3877uegn2rBIcM87nITa6MPeQJg0T1Y7h = 64;
      this.1mtNVz8G4h665TJH28TCUUOgaZ5IyJ3cDwrQer0EfJ8bmMvkv3Z3Sk8753Yf = 1;
   }

   @Override
   public boolean _qFkg7vuq1qgIpx2R7QYw9C5cBia34Vw1iSsgP0B6LfP7xoqd32mZGT4NGoI/* $VF was: 0qFkg7vuq1qgIpx2R7QYw9C5cBia34Vw1iSsgP0B6LfP7xoqd32mZGT4NGoI */(
      Class0152 var1, Class0040 var2, Class0320 var3, int var4, int var5, int var6, int var7
   ) {
      if (var7 != 1) {
         return false;
      }

      var5++;
      Class0374 var8 = this.4y0X01NSlVkx0ho8477C12qB54fQ1H3c3THGDE5057qa7vjE2dAp633rStkb;
      if (var8 == null) {
         if (this.8WSn5Y01cfTU644Q181idr2OhTtjnNpr8V45H9zV2kfx9iLxc7JNQU2A28pT == Class0112.7MB68VRBG67t42q67BnXPe865G692ZKgy1BsSkSOh542115w1qtS82v277wW) {
            var8 = Class0374.01l222zH4I0G7086L44zvC2wlJByYvrRp9it2w1w8w526VjC97xZ1Lep4y23;
         } else {
            var8 = Class0374.44CvEyMY35RazKfQw2bH8olZ03jO9y6Y82pYO2H38tfAoE3uZ1uz0Gyu9cQu;
         }
      }

      if (!var8._O99UbgL4Z85vI3kKk4qiYnUS5syyf116Bb5vabD9pr9Qy48msOUF7k7yLY8/* $VF was: 7O99UbgL4Z85vI3kKk4qiYnUS5syyf116Bb5vabD9pr9Qy48msOUF7k7yLY8 */(
         var3, var4, var5, var6
      )) {
         return false;
      }

      int var9 = Class0383._1Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1/* $VF was: 51Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1 */(
            (var2.5bjP62l3un7D1T2Cbc00YUO3RxrWoQU2Ja2vSqBCgLp5Gr2zl21wGy4JLSXk + 180.0F) * 4.0F / 360.0F - 0.5
         )
         & 3;
      byte var10 = 0;
      byte var11 = 0;
      if (var9 == 0) {
         var11 = 1;
      }

      if (var9 == 1) {
         var10 = -1;
      }

      if (var9 == 2) {
         var11 = -1;
      }

      if (var9 == 3) {
         var10 = 1;
      }

      int var12 = (
            var3._wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9/* $VF was: 5wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9 */(
                  var4 - var10, var5, var6 - var11
               )
               ? 1
               : 0
         )
         + (
            var3._wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9/* $VF was: 5wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9 */(
                  var4 - var10, var5 + 1, var6 - var11
               )
               ? 1
               : 0
         );
      int var13 = (
            var3._wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9/* $VF was: 5wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9 */(
                  var4 + var10, var5, var6 + var11
               )
               ? 1
               : 0
         )
         + (
            var3._wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9/* $VF was: 5wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9 */(
                  var4 + var10, var5 + 1, var6 + var11
               )
               ? 1
               : 0
         );
      boolean var14 = var3._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
               var4 - var10, var5, var6 - var11
            )
            == var8.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
         || var3._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
               var4 - var10, var5 + 1, var6 - var11
            )
            == var8.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      boolean var15 = var3._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
               var4 + var10, var5, var6 + var11
            )
            == var8.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
         || var3._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
               var4 + var10, var5 + 1, var6 + var11
            )
            == var8.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg;
      boolean var16 = false;
      if (var14 && !var15) {
         var16 = true;
      } else if (var13 > var12) {
         var16 = true;
      }

      if (var16) {
         var9 = var9 - 1 & 3;
         var9 += 4;
      }

      var3._JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA/* $VF was: 2JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA */(
         var4, var5, var6, var8.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
      );
      var3._tV30UbbYd6W5d8Jeu9no0Ns9acyS441Hxxewae18kcPB7H4rM8H0bzvoE9D/* $VF was: 4tV30UbbYd6W5d8Jeu9no0Ns9acyS441Hxxewae18kcPB7H4rM8H0bzvoE9D */(
         var4, var5, var6, var9
      );
      var3._JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA/* $VF was: 2JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA */(
         var4, var5 + 1, var6, var8.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
      );
      var3._tV30UbbYd6W5d8Jeu9no0Ns9acyS441Hxxewae18kcPB7H4rM8H0bzvoE9D/* $VF was: 4tV30UbbYd6W5d8Jeu9no0Ns9acyS441Hxxewae18kcPB7H4rM8H0bzvoE9D */(
         var4, var5 + 1, var6, var9 + 8
      );
      var1.9CL9mox68rJB71t7I4CK4mo3i6HlOyGYz585sBqK8EUu53V1Fk6eK316FAyX--;
      return true;
   }
}
