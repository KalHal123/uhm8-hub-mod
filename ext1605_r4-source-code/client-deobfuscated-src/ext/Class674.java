package ext;

import java.util.Random;

public class Class674 extends Class641 {
   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 20; var6++) {
         int var7 = var3 + var2.nextInt(4) - var2.nextInt(4);
         int var8 = var4;
         int var9 = var5 + var2.nextInt(4) - var2.nextInt(4);
         if (var1.method_197(var7, var4, var9) == 0
            && (
               var1.method_1286(var7 - 1, var4 - 1, var9) == Class160.field_1413
                  || var1.method_1286(var7 + 1, var4 - 1, var9) == Class160.field_1413
                  || var1.method_1286(var7, var4 - 1, var9 - 1) == Class160.field_1413
                  || var1.method_1286(var7, var4 - 1, var9 + 1) == Class160.field_1413
            )) {
            int var10 = 2 + var2.nextInt(var2.nextInt(3) + 1);

            for (int var11 = 0; var11 < var10; var11++) {
               if (Class108.field_764.method_1674(var1, var7, var8 + var11, var9)) {
                  var1.method_470(var7, var8 + var11, var9, Class108.field_764.field_2151);
               }
            }
         }
      }

      return true;
   }
}
