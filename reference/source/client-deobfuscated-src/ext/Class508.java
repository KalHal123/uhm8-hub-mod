package ext;

import java.util.Random;

public class Class508 extends Class641 {
   private int field_2271;

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 64; var6++) {
         int var9 = var3 + var2.nextInt(16) - var2.nextInt(16);
         int var7;
         int var8;
         int var10 = var1.method_197(var9, (var8 = var4 + var2.nextInt(4) - var2.nextInt(4)) - 1, var7 = var5 + var2.nextInt(8) - var2.nextInt(8));
         boolean var11 = var10 != 0
            && var10 != 9
            && var10 != 116
            && var10 != 18
            && var10 != Class390.field_141.field_2151
            && var10 != Class390.field_854.field_2151;
         if (var1.method_197(var9, var8, var7) == 0 && var11) {
            var1.method_470(var9, var8, var7, Class108.field_1979.field_2151);
         }
      }

      return true;
   }
}
