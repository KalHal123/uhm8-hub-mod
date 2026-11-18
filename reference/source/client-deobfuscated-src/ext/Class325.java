package ext;

public class Class325 {
   public static byte method_1905(byte var0) {
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

   public static byte method_261(byte var0) {
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

   public static byte method_530(String var0) {
      byte var1 = 0;

      for (int var2 = 0; var2 != 4; var2++) {
         int var3 = 8 >> var2;
         if (var0.charAt(1 + var2) == '*') {
            var1 = (byte)(var1 | var3);
         }
      }

      return var1;
   }

   public static short method_1591(String var0) {
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

   public static String method_1248(byte var0, boolean var1) {
      if (var1) {
         var0 = method_1905(var0);
      }

      String var2 = "";
      var2 = var2 + "/";
      var2 = var2 + ((var0 & 8) != 0 ? "*" : " ");
      var2 = var2 + ((var0 & 4) != 0 ? "*" : " ");
      var2 = var2 + ((var0 & 2) != 0 ? "*" : " ");
      return var2 + ((var0 & 1) != 0 ? "*" : " ");
   }

   public static String method_670(byte var0, boolean var1) {
      if (var1) {
         var0 = method_1905(var0);
      }

      String var2 = "";
      var2 = var2 + "/";
      var2 = var2 + ((var0 & 8) != 0 ? ((var0 & 128) != 0 ? "^" : "*") : " ");
      var2 = var2 + ((var0 & 4) != 0 ? ((var0 & 64) != 0 ? "^" : "*") : " ");
      var2 = var2 + ((var0 & 2) != 0 ? ((var0 & 32) != 0 ? "^" : "*") : " ");
      return var2 + ((var0 & 1) != 0 ? ((var0 & 16) != 0 ? "^" : "*") : " ");
   }

   public static String method_707(String var0) {
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
                     var1 = var1 + method_530(var4);
                     break;
                  case 1:
                     var1 = var1 + (char)(97 + method_530(var4));
                     break;
                  case 2:
                     var1 = var1 + (char)(65 + method_530(var4));
                     break;
                  case 3:
                     var1 = var1 + (char)(122 - method_530(var4));
                     break;
                  case 4:
                     var1 = var1 + (char)(90 - method_530(var4));
                     break;
                  case 5:
                     var1 = var1 + method_261(method_530(var4));
                     break;
                  case 6:
                     var1 = var1 + (char)(97 + method_261(method_530(var4)));
                     break;
                  case 7:
                     var1 = var1 + (char)(65 + method_261(method_530(var4)));
                     break;
                  case 8:
                     var1 = var1 + (char)(122 - method_261(method_530(var4)));
                     break;
                  case 9:
                     var1 = var1 + (char)(90 - method_261(method_530(var4)));
                     break;
                  case 10:
                     byte var7 = 0;
                     char var12 = (char)(var7 + (method_1591(var4) << 8));
                     var4 = var0.substring(++var3 * 5, var3 * 5 + 5);
                     char var13 = (char)(var12 + method_1591(var4));
                     var1 = var1 + var13;
               }
         }
      }

      return var1;
   }
}
