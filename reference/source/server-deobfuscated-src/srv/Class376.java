package srv;

import java.util.Random;

public class Class376 extends Class19 {
   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      for (int var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; var10++) {
         for (int var11 = var4 - 1; var11 <= var4 + var6 + 1; var11++) {
            for (int var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; var12++) {
               Class111 var13 = var1.method_149(var10, var11, var12);
               if (var11 == var4 - 1 && !var13.method_325()) {
                  return false;
               }

               if (var11 == var4 + var6 + 1 && !var13.method_325()) {
                  return false;
               }

               if ((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1)
                  && var11 == var4
                  && var1.method_813(var10, var11, var12) == 0
                  && var1.method_813(var10, var11 + 1, var12) == 0) {
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
                     var1.method_226(var18, var20, var22, 0);
                  } else if (var20 >= 0 && !var1.method_149(var18, var20 - 1, var22).method_325()) {
                     var1.method_226(var18, var20, var22, 0);
                  } else if (var1.method_149(var18, var20, var22).method_325()) {
                     if (var20 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.method_226(var18, var20, var22, Class371.field_1198.field_1379);
                     } else {
                        var1.method_226(var18, var20, var22, Class371.field_319.field_1379);
                     }
                  }
               }
            }
         }

         for (int var19 = 0; var19 < 2; var19++) {
            for (int var21 = 0; var21 < 3; var21++) {
               int var23 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
               int var24 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
               if (var1.method_813(var23, var4, var24) == 0) {
                  int var14 = 0;
                  if (var1.method_149(var23 - 1, var4, var24).method_325()) {
                     var14++;
                  }

                  if (var1.method_149(var23 + 1, var4, var24).method_325()) {
                     var14++;
                  }

                  if (var1.method_149(var23, var4, var24 - 1).method_325()) {
                     var14++;
                  }

                  if (var1.method_149(var23, var4, var24 + 1).method_325()) {
                     var14++;
                  }

                  if (var14 == 1) {
                     var1.method_226(var23, var4, var24, Class371.field_649.field_1379);
                     Class171 var15 = (Class171)var1.method_49(var23, var4, var24);

                     for (int var16 = 0; var16 < 8; var16++) {
                        Class150 var17 = this.method_102(var2);
                        if (var17 != null) {
                           var15.method_351(var2.nextInt(var15.method_214()), var17);
                        }
                     }
                     break;
                  }
               }
            }
         }

         var1.method_226(var3, var4, var5, Class371.field_219.field_1379);
         Class68 var25 = (Class68)var1.method_49(var3, var4, var5);
         var25.field_1554 = this.method_270(var2);
         return true;
      } else {
         return false;
      }
   }

   private Class150 method_102(Random var1) {
      int var2 = var1.nextInt(11);
      return var2 == 0
         ? new Class150(Class350.field_1024)
         : (
            var2 == 1
               ? new Class150(Class350.field_849, var1.nextInt(4) + 1)
               : (
                  var2 == 2
                     ? new Class150(Class350.field_1583)
                     : (
                        var2 == 3
                           ? new Class150(Class350.field_1080, var1.nextInt(4) + 1)
                           : (
                              var2 == 4
                                 ? new Class150(Class350.field_1249, var1.nextInt(4) + 1)
                                 : (
                                    var2 == 5
                                       ? new Class150(Class350.field_1001, var1.nextInt(4) + 1)
                                       : (
                                          var2 == 6
                                             ? new Class150(Class350.field_945)
                                             : (
                                                var2 == 7 && var1.nextInt(100) == 0
                                                   ? new Class150(Class350.field_546)
                                                   : (
                                                      var2 == 8 && var1.nextInt(2) == 0
                                                         ? new Class150(Class350.field_1392, var1.nextInt(4) + 1)
                                                         : (
                                                            var2 == 9 && var1.nextInt(10) == 0
                                                               ? new Class150(Class350.field_218[Class350.field_182.field_473 + var1.nextInt(2)])
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

   private String method_270(Random var1) {
      int var2 = var1.nextInt(4);
      return var2 == 0 ? "Skeleton" : (var2 == 1 ? "Zombie" : (var2 == 2 ? "Zombie" : (var2 == 3 ? "Spider" : "")));
   }
}
