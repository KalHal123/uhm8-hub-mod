public class 3yrPc6w1hTdSRiedlCK0V6x4Z593Pu5N38Ew8xRIDcB9A6g1NYbKgyYV5jMqsXyUc2x7819A03o14038i55de5CEC6a7 {
   public static byte _j01me4u1oGPbG1u8MiHyH7aO3631es2I0M92R36vDs37j92oz97VMA85723/* $VF was: 9j01me4u1oGPbG1u8MiHyH7aO3631es2I0M92R36vDs37j92oz97VMA85723 */(
      byte var0
   ) {
      byte var1 = 0;
      boolean var2 = true;

      for (short var3 = 128; var3 != 0; var3 >>= 1) {
         if (var2) {
            if ((var0 & var3) != 0) {
               var2 = false;
               var1 = (byte)(var1 | var3);
            }
         } else if ((var0 & var3) == 0) {
            var2 = true;
            var1 = (byte)(var1 | var3);
         }
      }

      return var1;
   }

   public static byte _7IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w/* $VF was: 17IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w */(
      byte var0
   ) {
      byte var1 = 0;
      boolean var2 = true;

      for (short var3 = 128; var3 != 0; var3 >>= 1) {
         if ((var3 & var0) != 0) {
            var2 = !var2;
         }

         if (!var2) {
            var1 = (byte)(var1 | var3);
         }
      }

      return var1;
   }

   public static byte _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
      String var0
   ) {
      byte var1 = 0;

      for (int var2 = 0; var2 != 4; var2++) {
         int var3 = 8 >> var2;
         if (var0.charAt(1 + var2) == '*') {
            var1 = (byte)(var1 | var3);
         }
      }

      return var1;
   }

   public static short _5R8vHSjx3VT07493IkoMj86S34aeC54xZy0QF1wE05439K9jc00LXVUZXpl/* $VF was: 85R8vHSjx3VT07493IkoMj86S34aeC54xZy0QF1wE05439K9jc00LXVUZXpl */(
      String var0
   ) {
      short var1 = 0;

      for (int var2 = 0; var2 != 4; var2++) {
         int var3 = 8 >> var2;
         if (var0.charAt(1 + var2) != ' ') {
            var1 = (short)(var1 | var3);
            if (var0.charAt(1 + var2) == '^') {
               var1 = (short)(var1 | var3 << 4);
            }
         }
      }

      return var1;
   }

   public static String _IaF6k1k2UXZ7dmxAb4qYyJgSc671TQR8wOuPk6LWqX5Q17Cex273lrxxlBA/* $VF was: 6IaF6k1k2UXZ7dmxAb4qYyJgSc671TQR8wOuPk6LWqX5Q17Cex273lrxxlBA */(
      byte var0, boolean var1
   ) {
      if (var1) {
         var0 = _j01me4u1oGPbG1u8MiHyH7aO3631es2I0M92R36vDs37j92oz97VMA85723/* $VF was: 9j01me4u1oGPbG1u8MiHyH7aO3631es2I0M92R36vDs37j92oz97VMA85723 */(var0);
      }

      String var2 = "";
      var2 = var2 + "/";
      var2 = var2 + ((var0 & 8) != 0 ? "*" : " ");
      var2 = var2 + ((var0 & 4) != 0 ? "*" : " ");
      var2 = var2 + ((var0 & 2) != 0 ? "*" : " ");
      return var2 + ((var0 & 1) != 0 ? "*" : " ");
   }

   public static String _Fp58mzmRT2A5XnSb7XBpT4isaf3yx3Fq49uJ3Ng84U0fA8NwWw197WSy2F4/* $VF was: 3Fp58mzmRT2A5XnSb7XBpT4isaf3yx3Fq49uJ3Ng84U0fA8NwWw197WSy2F4 */(
      byte var0, boolean var1
   ) {
      if (var1) {
         var0 = _j01me4u1oGPbG1u8MiHyH7aO3631es2I0M92R36vDs37j92oz97VMA85723/* $VF was: 9j01me4u1oGPbG1u8MiHyH7aO3631es2I0M92R36vDs37j92oz97VMA85723 */(var0);
      }

      String var2 = "";
      var2 = var2 + "/";
      var2 = var2 + ((var0 & 8) != 0 ? ((var0 & 128) != 0 ? "^" : "*") : " ");
      var2 = var2 + ((var0 & 4) != 0 ? ((var0 & 64) != 0 ? "^" : "*") : " ");
      var2 = var2 + ((var0 & 2) != 0 ? ((var0 & 32) != 0 ? "^" : "*") : " ");
      return var2 + ((var0 & 1) != 0 ? ((var0 & 16) != 0 ? "^" : "*") : " ");
   }

   public static String _Wgt9HqAD7yWZZ406W6CQY19roNXuUYDk1Y3k19M34OcmzE4qxWeR376l98q/* $VF was: 3Wgt9HqAD7yWZZ406W6CQY19roNXuUYDk1Y3k19M34OcmzE4qxWeR376l98q */(
      String var0
   ) {
      var0 = var0.replaceAll("[A%\\*!#830\\-\\+NSPO]", " ");
      var0 = var0.replaceAll("[ZR(@$746\\]{MBL:]", "*");
      var0 = var0.replaceAll("[QI)_=129\\[}CE~;]", "^");
      String var1 = "";
      byte var2 = -1;

      for (int var3 = 0; var3 != var0.length() / 5; var3++) {
         String var4 = var0.substring(var3 * 5, var3 * 5 + 5);
         switch (var4) {
            case "/|*  ":
               var2 = 0;
               break;
            case "/| * ":
               var2 = 1;
               break;
            case "/|  *":
               var2 = 2;
               break;
            case "/| **":
               var2 = 3;
               break;
            case "/|* *":
               var2 = 4;
               break;
            case "/|*| ":
               var2 = 5;
               break;
            case "/||* ":
               var2 = 6;
               break;
            case "/|| *":
               var2 = 7;
               break;
            case "/||**":
               var2 = 8;
               break;
            case "/|*|*":
               var2 = 9;
               break;
            case "/| *|":
               var2 = 10;
               break;
            case "/|   ":
               var1 = var1 + " ";
               break;
            default:
               switch (var2) {
                  case 0:
                     var1 = var1
                        + _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                           var4
                        );
                     break;
                  case 1:
                     var1 = var1
                        + (char)(
                           97
                              + _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                                 var4
                              )
                        );
                     break;
                  case 2:
                     var1 = var1
                        + (char)(
                           65
                              + _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                                 var4
                              )
                        );
                     break;
                  case 3:
                     var1 = var1
                        + (char)(
                           122
                              - _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                                 var4
                              )
                        );
                     break;
                  case 4:
                     var1 = var1
                        + (char)(
                           90
                              - _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                                 var4
                              )
                        );
                     break;
                  case 5:
                     var1 = var1
                        + _7IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w/* $VF was: 17IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w */(
                           _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                              var4
                           )
                        );
                     break;
                  case 6:
                     var1 = var1
                        + (char)(
                           97
                              + _7IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w/* $VF was: 17IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w */(
                                 _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                                    var4
                                 )
                              )
                        );
                     break;
                  case 7:
                     var1 = var1
                        + (char)(
                           65
                              + _7IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w/* $VF was: 17IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w */(
                                 _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                                    var4
                                 )
                              )
                        );
                     break;
                  case 8:
                     var1 = var1
                        + (char)(
                           122
                              - _7IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w/* $VF was: 17IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w */(
                                 _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                                    var4
                                 )
                              )
                        );
                     break;
                  case 9:
                     var1 = var1
                        + (char)(
                           90
                              - _7IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w/* $VF was: 17IW5Itf2FNZK01bX4fcT1Fbk36ZPgiL0rISK1y3h1OW9aRq13FV7baYZi1w */(
                                 _h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J/* $VF was: 2h9vd37nDrh4XwOoLiTO80P5n6nUT20N8tqD41CjO8u1ZMAeDv8r1H7Hx64J */(
                                    var4
                                 )
                              )
                        );
                     break;
                  case 10:
                     byte var7 = 0;
                     char var12 = (char)(
                        var7
                           + (
                              _5R8vHSjx3VT07493IkoMj86S34aeC54xZy0QF1wE05439K9jc00LXVUZXpl/* $VF was: 85R8vHSjx3VT07493IkoMj86S34aeC54xZy0QF1wE05439K9jc00LXVUZXpl */(
                                    var4
                                 )
                                 << 8
                           )
                     );
                     var4 = var0.substring(++var3 * 5, var3 * 5 + 5);
                     char var13 = (char)(
                        var12
                           + _5R8vHSjx3VT07493IkoMj86S34aeC54xZy0QF1wE05439K9jc00LXVUZXpl/* $VF was: 85R8vHSjx3VT07493IkoMj86S34aeC54xZy0QF1wE05439K9jc00LXVUZXpl */(
                              var4
                           )
                     );
                     var1 = var1 + var13;
               }
         }
      }

      return var1;
   }
}
