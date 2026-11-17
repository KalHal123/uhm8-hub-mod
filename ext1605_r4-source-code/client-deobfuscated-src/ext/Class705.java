package ext;

import java.util.Random;

public class Class705 extends Class641 {
   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      for (int var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; var10++) {
         for (int var11 = var4 - 1; var11 <= var4 + var6 + 1; var11++) {
            for (int var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; var12++) {
               Class160 var13 = var1.method_1286(var10, var11, var12);
               if ((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1)
                     && var11 == var4
                     && var1.method_197(var10, var11, var12) == Class108.field_2883.field_2151
                  || var1.method_197(var10, var11, var12) == Class108.field_536.field_2151
                     && var1.method_197(var10, var11 + 1, var12) == Class108.field_2883.field_2151
                  || var1.method_197(var10, var11 + 1, var12) == Class108.field_536.field_2151) {
                  var9++;
               }
            }
         }
      }

      if (var9 >= 1 && var9 <= 5 && var2.nextBoolean()) {
         for (int var18 = var3 - var7 - 1; var18 <= var3 + var7 + 1; var18++) {
            for (int var20 = var4 + var6; var20 >= var4 - 1; var20--) {
               for (int var22 = var5 - var8 - 1; var22 <= var5 + var8 + 1; var22++) {
                  if (var18 != var3 - var7 - 1
                     && var20 != var4 - 1
                     && var22 != var5 - var8 - 1
                     && var18 != var3 + var7 + 1
                     && var20 != var4 + var6 + 1
                     && var22 != var5 + var8 + 1) {
                     var1.method_1481(var18, var20, var22, Class108.field_2883.field_2151);
                  } else if (var20 >= 0 && var1.method_1286(var18, var20 - 1, var22).method_1888()) {
                     var1.method_1481(var18, var20, var22, 1);
                  } else if (!var1.method_1286(var18, var20, var22).method_1888() && (var20 == var4 - 1 || var2.nextInt(12) == 1)) {
                     if (var20 == var4 - 1 && var2.nextInt(8) != 0) {
                        var1.method_1481(var18, var20, var22, Class390.field_1825.field_2151);
                     } else {
                        var1.method_1481(var18, var20, var22, var20 == var4 - 1 ? 135 : Class390.field_1825.field_2151);
                     }
                  }
               }
            }
         }

         for (int var19 = 0; var19 < 2; var19++) {
            for (int var21 = 0; var21 < 2; var21++) {
               int var23 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
               int var24 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
               int var14 = 0;
               if (var1.method_1286(var23 - 1, var4, var24).method_1888()) {
                  var14++;
               }

               if (var1.method_1286(var23 + 1, var4, var24).method_1888()) {
                  var14++;
               }

               if (var1.method_1286(var23, var4, var24 - 1).method_1888()) {
                  var14++;
               }

               if (var1.method_1286(var23, var4, var24 + 1).method_1888()) {
                  var14++;
               }

               if (var14 != 1) {
                  var1.method_1481(var23, var4, var24, Class108.field_93.field_2151);
                  Class520 var15 = (Class520)var1.method_1303(var23, var4, var24);

                  for (int var16 = 0; var16 < 8; var16++) {
                     Class334 var17 = this.method_693(var2);
                     if (var17 != null) {
                        var15.method_708(var2.nextInt(var15.method_1574()), var17);
                     }
                  }
                  break;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private Class334 method_693(Random var1) {
      int var2 = var1.nextInt(13);
      return var2 == 0
         ? new Class334(Class755.field_2189)
         : (
            var2 == 1
               ? new Class334(Class755.field_591, var1.nextInt(4) + 2)
               : (
                  var2 == 2
                     ? new Class334(Class50.field_3015)
                     : (
                        var2 == 3
                           ? new Class334(Class50.field_1191, var1.nextInt(4) + 1)
                           : (
                              var2 == 4
                                 ? new Class334(Class755.field_2508, var1.nextInt(4) + 1)
                                 : (
                                    var2 == 5
                                       ? new Class334(Class755.field_3019, var1.nextInt(4) + 1)
                                       : (
                                          var2 == 6
                                             ? new Class334(Class755.field_2962)
                                             : (
                                                var2 == 7
                                                   ? new Class334(Class50.field_58)
                                                   : (
                                                      var2 == 8
                                                         ? new Class334(Class50.field_418)
                                                         : (
                                                            var2 == 9
                                                               ? new Class334(Class50.field_2907)
                                                               : (
                                                                  var2 == 10 && var1.nextInt(100) == 0
                                                                     ? new Class334(Class50.field_2372)
                                                                     : (
                                                                        var2 == 11 && var1.nextInt(2) == 0
                                                                           ? new Class334(Class755.field_1672, var1.nextInt(8) + 2)
                                                                           : (
                                                                              var2 == 12 && var1.nextInt(10) == 0
                                                                                 ? new Class334(Class50.field_1243)
                                                                                 : (
                                                                                    var2 == 13 && var1.nextInt(10) == 0
                                                                                       ? new Class334(Class50.field_2952, 2 + var1.nextInt(10))
                                                                                       : (
                                                                                          var2 == 14 && var1.nextInt(10) == 0
                                                                                             ? new Class334(Class50.field_94)
                                                                                             : null
                                                                                       )
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   private String method_540(Random var1) {
      int var2 = var1.nextInt(4);
      return var2 == 0 ? "Spider" : (var2 == 1 ? "Slime" : (var2 == 2 ? "Slime" : (var2 == 3 ? "Spider" : "")));
   }
}
