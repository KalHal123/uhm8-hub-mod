package x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Class0325 {
   public static final int 8d2lLtfkFyz39PPPRx2P5X8j7mUVezi5Z7D26Cm3S9DKv04jPLP34h2o4a3O = 30;
   private final Class0315 1AB1jhtV2UoKcyDiulLlb6608Syg20hb8Eh01R0tBrT5xsgBmloygh8450wV;
   private final List<Class0034> 3XfqRXiIhVO6Zn1ixCN16oXaxse30CqIKrdMm50QB8p72QffL7X4JJGFEkhn;

   public static int _hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h/* $VF was: 9hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h */(
      int var0
   ) {
      return var0 >= 0 ? var0 * 16 : var0 * 16 + 1;
   }

   public static boolean _5MX9kjWH3ipxdHdEowh7oQEbvfI8y92M5CDCXn03Q264Vkw0R6a96O7Ot49/* $VF was: 15MX9kjWH3ipxdHdEowh7oQEbvfI8y92M5CDCXn03Q264Vkw0R6a96O7Ot49 */(
      int var0, int var1, int var2, int var3
   ) {
      int var4 = _hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h/* $VF was: 9hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h */(var0);
      int var5 = _hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h/* $VF was: 9hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h */(var1);
      return var2 <= var4 && var3 <= var5 && var2 > var4 - 16 && var3 > var5 - 16;
   }

   public Class0325(Random var1, Class0315 var2) {
      long var3 = System.currentTimeMillis();
      this.3XfqRXiIhVO6Zn1ixCN16oXaxse30CqIKrdMm50QB8p72QffL7X4JJGFEkhn = new ArrayList<>();
      this.1AB1jhtV2UoKcyDiulLlb6608Syg20hb8Eh01R0tBrT5xsgBmloygh8450wV = var2;
      int[] var5 = new int[900];
      Arrays.fill(var5, 0);
      int var6 = 0;

      boolean var7;
      do {
         var7 = false;

         for (int var8 = 0; var8 < var5.length; var8++) {
            if (var5[var8] == 0) {
               int var9 = var8 % 30;
               int var10 = var8 / 30;
               Class0315 var11 = new Class0315(
                     _hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h/* $VF was: 9hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h */(
                        var2.1D8m5U4GB4arPZ7684Hb9CP8F458GRgW52CH7KZ90VYC8IWzRz99xA26eD79
                     ),
                     _hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h/* $VF was: 9hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h */(
                        var2.32JU2hh89MNsO4JlDTayzXSS4478EYm4xoxn215WA3dTx34UhYR5myk8cpzr
                     )
                  )
                  ._h5SgVf4d2b0P7V64CX9XppbjHD2KCR03VLMdMVOPuKOUJCgZ0nxH8Q0G8kR/* $VF was: 6h5SgVf4d2b0P7V64CX9XppbjHD2KCR03VLMdMVOPuKOUJCgZ0nxH8Q0G8kR */(
                     (var9 - 15) * 14, (var10 - 15) * 14
                  );
               Class0034 var12 = Class0034._90S8WUEjsUlIk53OF5y7FPChO1pX5dMinddEJMgNJu4ve1K5ZV6OCt2g5T5/* $VF was: 390S8WUEjsUlIk53OF5y7FPChO1pX5dMinddEJMgNJu4ve1K5ZV6OCt2g5T5 */(
                  var1, var11
               );
               Class0315 var13 = var12._155zZR8t2Cbq0I65w3T2P9frJ393hs90A6vhvVPoxH61BPyWNHJn7M4bf16/* $VF was: 6155zZR8t2Cbq0I65w3T2P9frJ393hs90A6vhvVPoxH61BPyWNHJn7M4bf16 */();
               boolean var14 = true;

               label65:
               for (int var15 = 0; var15 < var13.1D8m5U4GB4arPZ7684Hb9CP8F458GRgW52CH7KZ90VYC8IWzRz99xA26eD79; var15++) {
                  for (int var16 = 0; var16 < var13.32JU2hh89MNsO4JlDTayzXSS4478EYm4xoxn215WA3dTx34UhYR5myk8cpzr; var16++) {
                     if (var9 + var15 >= 30 || var10 + var16 >= 30 || var5[var9 + var15 + (var10 + var16) * 30] != 0) {
                        var14 = false;
                        break label65;
                     }
                  }
               }

               if (!var14) {
                  var7 = true;
               } else {
                  var6++;
                  this.3XfqRXiIhVO6Zn1ixCN16oXaxse30CqIKrdMm50QB8p72QffL7X4JJGFEkhn.add(var12);

                  for (int var17 = 0; var17 < var13.1D8m5U4GB4arPZ7684Hb9CP8F458GRgW52CH7KZ90VYC8IWzRz99xA26eD79; var17++) {
                     for (int var18 = 0; var18 < var13.32JU2hh89MNsO4JlDTayzXSS4478EYm4xoxn215WA3dTx34UhYR5myk8cpzr; var18++) {
                        var5[var9 + var17 + (var10 + var18) * 30] = var6;
                     }
                  }
               }
            }
         }
      } while (var7);
   }

   public void _60wZaREu6n7E4b4FqPW1aurTbd0EH8Cg8jkemWoRmA0jU1hNDeix6f1XFmP/* $VF was: 560wZaREu6n7E4b4FqPW1aurTbd0EH8Cg8jkemWoRmA0jU1hNDeix6f1XFmP */(
      Class0320 var1, int var2, int var3
   ) {
      ArrayList var4 = new ArrayList();

      for (Class0034 var6 : this.3XfqRXiIhVO6Zn1ixCN16oXaxse30CqIKrdMm50QB8p72QffL7X4JJGFEkhn) {
         Class0315 var7 = var6._R38M2O6566x2pen53vJb71a4871DZeTgLLz2piGfBjTn4JTalO4b0mdIdRI/* $VF was: 2R38M2O6566x2pen53vJb71a4871DZeTgLLz2piGfBjTn4JTalO4b0mdIdRI */();
         int var8 = var7.1D8m5U4GB4arPZ7684Hb9CP8F458GRgW52CH7KZ90VYC8IWzRz99xA26eD79
            - _hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h/* $VF was: 9hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h */(var2);
         int var9 = var7.32JU2hh89MNsO4JlDTayzXSS4478EYm4xoxn215WA3dTx34UhYR5myk8cpzr
            - _hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h/* $VF was: 9hcUf1GjYFE1n5h3C7d8SBi5q87cLRLfP557HX30ui129KXy0HvQUt5q2d9h */(var3);
         if (var8 <= 0
            && var9 <= 0
            && var8 >= -29
            && var9 >= -29
            && var6._Xu3W9Y012Z47lG36iry0n5a339b3Up3MYVi24623ZUogs6SE9LV8t5Xy0cd/* $VF was: 7Xu3W9Y012Z47lG36iry0n5a339b3Up3MYVi24623ZUogs6SE9LV8t5Xy0cd */(
               var1, var2, var3
            )) {
            var4.add(var6);
         }
      }

      for (Class0034 var11 : var4) {
         this.3XfqRXiIhVO6Zn1ixCN16oXaxse30CqIKrdMm50QB8p72QffL7X4JJGFEkhn.remove(var11);
      }
   }
}
