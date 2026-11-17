package ext;

import java.util.Random;

public class Class605 extends Class641 {
   public void method_167(Class454 var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7 = 2;

      for (int var8 = -var5; var8 <= var5; var8++) {
         for (int var9 = -var7; var9 <= var7; var9++) {
            for (int var10 = -var6; var10 <= var6; var10++) {
               if (var8 * var8 + var9 * var9 + var10 * var10 <= var5 * var5
                  && (
                     var1.method_197(var2 + var8, var3 + var9, var4 + var10) == Class108.field_536.field_2151
                        || var1.method_197(var2 + var8, var3 + var9, var4 + var10) == Class108.field_2883.field_2151
                  )) {
                  var1.method_470(var2 + var8, var3 + var9, var4 + var10, Class390.field_1375.field_2151);
               }
            }
         }
      }
   }

   public static boolean method_1162(Class454 var0, int var1, int var2) {
      for (int var3 = 0; var3 != 16; var3++) {
         for (int var4 = 0; var4 != 16; var4++) {
            if (var0.method_197(var1 + var3, 63, var2 + var4) != Class108.field_2883.field_2151
               || var0.method_197(var1 + var3, 62, var2 + var4) != Class108.field_2883.field_2151) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      if (var4 >= 62 && var4 <= 64) {
         for (int var6 = 0; var6 < 2; var6++) {
            int var7 = var5 + var2.nextInt(8) - var2.nextInt(8);
            int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
            int var9 = var3 + var2.nextInt(8) - var2.nextInt(8);
            if (var1.method_197(var9, var8, var7) == Class108.field_2883.field_2151) {
               for (int var10 = var8;
                  (var1.method_197(var7, var10, var9) == Class108.field_2883.field_2151 || var1.method_197(var7, var10, var9) == Class108.field_536.field_2151)
                     && var10 > 10;
                  var10--
               ) {
                  var1.method_470(var9, var10, var7, Class390.field_1375.field_2151);
               }

               boolean var11 = var2.nextInt(100) <= 50;
               this.method_167(var1, var9, var8, var7, 2 + var2.nextInt(var11 ? 6 : 2), 2 + var2.nextInt(!var11 ? 6 : 2));
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
