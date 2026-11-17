package ext;

import java.util.Random;

public class Class382 extends Class641 {
   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 6; var6++) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.method_197(var7, var8 - 1, var9) != Class108.field_2883.field_2151 && var1.method_197(var7, var8 - 1, var9) != Class108.field_536.field_2151) {
            for (int var10 = 0; var10 != 5 && var1.method_197(var7, var8 + var10, var9) == Class108.field_2883.field_2151; var10++) {
               if (var10 == 4) {
                  var1.method_470(var7, var8, var9, var2.nextInt(20) > 16 ? Class108.field_2554.field_2151 : Class108.field_2938.field_2151);
               }
            }
         }
      }

      return true;
   }
}
