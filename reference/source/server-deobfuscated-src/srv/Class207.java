package srv;

import java.util.Random;

public class Class207 extends Class19 {
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
               if ((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1)
                     && var11 == var4
                     && var1.method_813(var10, var11, var12) == Class371.field_535.field_1379
                  || var1.method_813(var10, var11, var12) == Class371.field_1051.field_1379
                     && var1.method_813(var10, var11 + 1, var12) == Class371.field_535.field_1379
                  || var1.method_813(var10, var11 + 1, var12) == Class371.field_1051.field_1379) {
                  var9++;
               }
            }
         }
      }

      if (var9 >= 1 && var9 <= 30 && var2.nextBoolean()) {
         for (int var17 = var3 - var7 - 1; var17 <= var3 + var7 + 1; var17++) {
            for (int var19 = var4 + var6; var19 >= var4 - 1; var19--) {
               for (int var21 = var5 - var8 - 1; var21 <= var5 + var8 + 1; var21++) {
                  if (var17 != var3 - var7 - 1
                     && var19 != var4 - 1
                     && var21 != var5 - var8 - 1
                     && var17 != var3 + var7 + 1
                     && var19 != var4 + var6 + 1
                     && var21 != var5 + var8 + 1) {
                     var1.method_226(var17, var19, var21, Class371.field_535.field_1379);
                  } else if (var19 >= 0 && var1.method_149(var17, var19 - 1, var21).method_325()) {
                     var1.method_226(var17, var19, var21, 1);
                  } else if (!var1.method_149(var17, var19, var21).method_325() && (var19 == var4 - 1 || var2.nextInt(12) == 1)) {
                     if (var19 == var4 - 1 && var2.nextInt(8) != 0) {
                        var1.method_226(var17, var19, var21, Class323.field_1129.field_1379);
                     } else {
                        var1.method_226(var17, var19, var21, var19 == var4 - 1 ? 135 : Class371.field_1294.field_1379);
                     }
                  }
               }
            }
         }

         for (int var18 = 0; var18 < 2; var18++) {
            for (int var20 = 0; var20 < 2; var20++) {
               int var22 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
               int var23 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
               int var14 = 0;
               if (var1.method_149(var22 - 1, var4, var23).method_325()) {
                  var14++;
               }

               if (var1.method_149(var22 + 1, var4, var23).method_325()) {
                  var14++;
               }

               if (var1.method_149(var22, var4, var23 - 1).method_325()) {
                  var14++;
               }

               if (var1.method_149(var22, var4, var23 + 1).method_325()) {
                  var14++;
               }

               if (var14 != 1) {
                  var1.method_226(var22, var4, var23, Class371.field_649.field_1379);
                  Class171 var15 = (Class171)var1.method_49(var22, var4, var23);
                  boolean var16 = false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private Class150 method_626(Random var1) {
      int var2 = var1.nextInt(11);
      return var2 == 0
         ? new Class150(Class350.field_1024)
         : (
            var2 == 1
               ? new Class150(Class350.field_922, var1.nextInt(4) + 1)
               : (
                  var2 == 2
                     ? new Class150(Class13.field_971)
                     : (
                        var2 == 3
                           ? new Class150(Class13.field_479, var1.nextInt(4) + 1)
                           : (
                              var2 == 4
                                 ? new Class150(Class350.field_1249, var1.nextInt(4) + 1)
                                 : (
                                    var2 == 5
                                       ? new Class150(Class350.field_1492, var1.nextInt(4) + 1)
                                       : (
                                          var2 == 6
                                             ? new Class150(Class350.field_945)
                                             : (
                                                var2 == 7 && var1.nextInt(100) == 0
                                                   ? new Class150(Class13.field_640)
                                                   : (
                                                      var2 == 8 && var1.nextInt(2) == 0
                                                         ? new Class150(Class350.field_1392, var1.nextInt(4) + 1)
                                                         : (var2 == 9 && var1.nextInt(10) == 0 ? new Class150(Class13.field_637) : null)
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   private String method_329(Random var1) {
      int var2 = var1.nextInt(4);
      return var2 == 0 ? "Spider" : (var2 == 1 ? "Slime" : (var2 == 2 ? "Slime" : (var2 == 3 ? "Spider" : "")));
   }
}
