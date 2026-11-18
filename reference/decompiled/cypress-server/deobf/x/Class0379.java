package x;

import java.util.Random;

public class Class0379 extends Class0019 {
   @Override
   public boolean _QASFp0IVH1Io4Y6hWJ89W819w74iAGD0XCK30D5J5JohH4SSZzEmdpLguZl/* $VF was: 4QASFp0IVH1Io4Y6hWJ89W819w74iAGD0XCK30D5J5JohH4SSZzEmdpLguZl */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      for (int var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; var10++) {
         for (int var11 = var4 - 1; var11 <= var4 + var6 + 1; var11++) {
            for (int var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; var12++) {
               Class0112 var13 = var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                  var10, var11, var12
               );
               if (var11 == var4 - 1
                  && !var13._Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN/* $VF was: 3Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN */()
                  )
                {
                  return false;
               }

               if (var11 == var4 + var6 + 1
                  && !var13._Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN/* $VF was: 3Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN */()
                  )
                {
                  return false;
               }

               if ((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1)
                  && var11 == var4
                  && var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                        var10, var11, var12
                     )
                     == 0
                  && var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                        var10, var11 + 1, var12
                     )
                     == 0) {
                  var9++;
               }
            }
         }
      }

      if (var9 >= 1 && var9 <= 5) {
         for (int var18 = var3 - var7 - 1; var18 <= var3 + var7 + 1; var18++) {
            for (int var20 = var4 + var6; var20 >= var4 - 1; var20--) {
               for (int var22 = var5 - var8 - 1; var22 <= var5 + var8 + 1; var22++) {
                  if (var18 != var3 - var7 - 1
                     && var20 != var4 - 1
                     && var22 != var5 - var8 - 1
                     && var18 != var3 + var7 + 1
                     && var20 != var4 + var6 + 1
                     && var22 != var5 + var8 + 1) {
                     var1._JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA/* $VF was: 2JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA */(
                        var18, var20, var22, 0
                     );
                  } else if (var20 >= 0
                     && !var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                           var18, var20 - 1, var22
                        )
                        ._Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN/* $VF was: 3Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN */()
                     )
                   {
                     var1._JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA/* $VF was: 2JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA */(
                        var18, var20, var22, 0
                     );
                  } else if (var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                        var18, var20, var22
                     )
                     ._Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN/* $VF was: 3Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN */()
                     )
                   {
                     if (var20 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1._JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA/* $VF was: 2JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA */(
                           var18,
                           var20,
                           var22,
                           Class0374.7LDU2G1WFpmnRFjJL3Z1kISDiNBpPQMe77Z3ZgBZfahrSp5ugR4sH7481oEE.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                        );
                     } else {
                        var1._JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA/* $VF was: 2JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA */(
                           var18,
                           var20,
                           var22,
                           Class0374.21mT63sbm7iXSQdYCY3PQnkImb5dorw1XMeKpwjzxhBpi780vxLL0ydy1G1C.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                        );
                     }
                  }
               }
            }
         }

         for (int var19 = 0; var19 < 2; var19++) {
            for (int var21 = 0; var21 < 3; var21++) {
               int var23 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
               int var24 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
               if (var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                     var23, var4, var24
                  )
                  == 0) {
                  int var14 = 0;
                  if (var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                        var23 - 1, var4, var24
                     )
                     ._Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN/* $VF was: 3Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN */()
                     )
                   {
                     var14++;
                  }

                  if (var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                        var23 + 1, var4, var24
                     )
                     ._Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN/* $VF was: 3Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN */()
                     )
                   {
                     var14++;
                  }

                  if (var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                        var23, var4, var24 - 1
                     )
                     ._Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN/* $VF was: 3Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN */()
                     )
                   {
                     var14++;
                  }

                  if (var1._Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
                        var23, var4, var24 + 1
                     )
                     ._Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN/* $VF was: 3Ei26183Z2INCGiuiVBA4J01IteuXBBNq61ZOj8dD427fC8fkkdOHq4bm4JN */()
                     )
                   {
                     var14++;
                  }

                  if (var14 == 1) {
                     var1._JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA/* $VF was: 2JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA */(
                        var23,
                        var4,
                        var24,
                        Class0374.43c8IiRhrKZ30ZYe9d66O5Nkc5XpIBYwqU6zE2inyR0p1320T8Wjoj2wHl3W.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
                     );
                     Class0173 var15 = (Class0173)var1._J7cespnQj87Gvm5p96Cp6J81x7XwD71hDJaOZ4PZZzAg1e1l1Oy1W8j8o5C/* $VF was: 0J7cespnQj87Gvm5p96Cp6J81x7XwD71hDJaOZ4PZZzAg1e1l1Oy1W8j8o5C */(
                        var23, var4, var24
                     );

                     for (int var16 = 0; var16 < 8; var16++) {
                        Class0152 var17 = this._vS2GfbIYJqYhLvL0OhVYuyASptR63P9ui2YFjZhJ9MvXuLn3Pe71Ai7I6IS/* $VF was: 0vS2GfbIYJqYhLvL0OhVYuyASptR63P9ui2YFjZhJ9MvXuLn3Pe71Ai7I6IS */(
                           var2
                        );
                        if (var17 != null) {
                           var15._T9oNF22tx37v01YXV91uE41xZ7plf49jmRik9xf9x1hpRfT0vzrjj2UtxCI/* $VF was: 3T9oNF22tx37v01YXV91uE41xZ7plf49jmRik9xf9x1hpRfT0vzrjj2UtxCI */(
                              var2.nextInt(
                                 var15._7TBLT6P2Q2J9gzv0TGDw7bQ7inN2yM8KA5OK1uVa717TQoUqtu28mk5kk7R/* $VF was: 27TBLT6P2Q2J9gzv0TGDw7bQ7inN2yM8KA5OK1uVa717TQoUqtu28mk5kk7R */()
                              ),
                              var17
                           );
                        }
                     }
                     break;
                  }
               }
            }
         }

         var1._JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA/* $VF was: 2JVhoTZdX4Xg3GX592gD560uYno08v3t8041d2a97Mjd49YXwEdBN7f0i5iA */(
            var3,
            var4,
            var5,
            Class0374.1Q21J0wGgC2BJQ0n594l40zErO068pL7ET2V31ABE01fixh27GT9e7XOlnpy.8X4563TBs5E7K85YmV54x2ZH5UKnuBVs0gswhiE59069e91eI6Y1h0K06YWg
         );
         Class0067 var25 = (Class0067)var1._J7cespnQj87Gvm5p96Cp6J81x7XwD71hDJaOZ4PZZzAg1e1l1Oy1W8j8o5C/* $VF was: 0J7cespnQj87Gvm5p96Cp6J81x7XwD71hDJaOZ4PZZzAg1e1l1Oy1W8j8o5C */(
            var3, var4, var5
         );
         var25.9fZ53okO0A91g1CFUm2La98ZP9fArB7nlV7wA2P7krKrsQYACPm4QR2593L6 = this._r3qtPTd7OPF905qmxF2F6sSNg72Nb9ez1r3hE91bR49CotTgh53pz397lz5/* $VF was: 2r3qtPTd7OPF905qmxF2F6sSNg72Nb9ez1r3hE91bR49CotTgh53pz397lz5 */(
            var2
         );
         return true;
      } else {
         return false;
      }
   }

   private Class0152 _vS2GfbIYJqYhLvL0OhVYuyASptR63P9ui2YFjZhJ9MvXuLn3Pe71Ai7I6IS/* $VF was: 0vS2GfbIYJqYhLvL0OhVYuyASptR63P9ui2YFjZhJ9MvXuLn3Pe71Ai7I6IS */(
      Random var1
   ) {
      int var2 = var1.nextInt(11);
      return var2 == 0
         ? new Class0152(Class0353.6J04DBGgEu643SoqRd018e960XKrK7a6Y466M04uxrW8r2sDKDOUUL8j7zt7)
         : (
            var2 == 1
               ? new Class0152(Class0353.5BmrzV6W093kdkkO1hzq43XInOIb5YeG21197jX8zlwpZ00PbbDoWUMtoTt0, var1.nextInt(4) + 1)
               : (
                  var2 == 2
                     ? new Class0152(Class0353.9qv3j6p29t8Wa85Y4JSdcxUtg0k13BcvmWx55v141x0878CRCh3nUz8bxD5t)
                     : (
                        var2 == 3
                           ? new Class0152(Class0353.6j4KQxqt50lYX6m7y99ha2hsLfZpe646f8zMpPyuF5Qbty7tcswk6976u2LI, var1.nextInt(4) + 1)
                           : (
                              var2 == 4
                                 ? new Class0152(Class0353.7jor3zevS7zsnB472Qe9BDwzm1QfN0FG2sTleJ2bEk8dhoHuBpm9lK9oSXE6, var1.nextInt(4) + 1)
                                 : (
                                    var2 == 5
                                       ? new Class0152(Class0353.69E4fGQ9j9VV5GAi5wbno5o58geC2MQ3V79IS9Q98OV7KrN044sg2tRL2kUr, var1.nextInt(4) + 1)
                                       : (
                                          var2 == 6
                                             ? new Class0152(Class0353.5ru7Dpztp0meK2Kqi46YLP4Tf40S310ngLKq0LvntX07N2s3hYzF93VxiYPd)
                                             : (
                                                var2 == 7 && var1.nextInt(100) == 0
                                                   ? new Class0152(Class0353.3LfM0w5qOA51Ssa88rJaMmbS6BrU7J4RVOIIvzxotmMFu1h4XdL2i8naixGo)
                                                   : (
                                                      var2 == 8 && var1.nextInt(2) == 0
                                                         ? new Class0152(
                                                            Class0353.8dp6d30bJGwA8FN7pfR8uP6zJPQ19005aWe7ehh9c4PCEMv7l75hMJtRN6J5, var1.nextInt(4) + 1
                                                         )
                                                         : (
                                                            var2 == 9 && var1.nextInt(10) == 0
                                                               ? new Class0152(
                                                                  Class0353.1PEZyJX065hYs4uf56wQNE8HN86xGjQhm0jj25K9v1IRBcLLnrjV2523PdlU[Class0353.17T6sjsPYvMN5qZVErfjC3RiCxeSc3468wHua31lX4TJ071lwckR75sz7418
                                                                        .2yRER5eRfh6sYQRaW6IeEvlHNCurxrgDIfc3AZI8AG8xzB25sA584C3J91Ol
                                                                     + var1.nextInt(2)]
                                                               )
                                                               : null
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

   private String _r3qtPTd7OPF905qmxF2F6sSNg72Nb9ez1r3hE91bR49CotTgh53pz397lz5/* $VF was: 2r3qtPTd7OPF905qmxF2F6sSNg72Nb9ez1r3hE91bR49CotTgh53pz397lz5 */(
      Random var1
   ) {
      int var2 = var1.nextInt(4);
      return var2 == 0 ? "Skeleton" : (var2 == 1 ? "Zombie" : (var2 == 2 ? "Zombie" : (var2 == 3 ? "Spider" : "")));
   }
}
