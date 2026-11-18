package srv;

import java.util.Random;

public class Class141 extends Class19 {
   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 20; var6++) {
         int var7 = var3 + var2.nextInt(4) - var2.nextInt(4);
         int var8 = var4;
         int var9 = var5 + var2.nextInt(4) - var2.nextInt(4);
         if (var1.method_813(var7, var4, var9) == 0
            && (
               var1.method_149(var7 - 1, var4 - 1, var9) == Class111.field_1394
                  || var1.method_149(var7 + 1, var4 - 1, var9) == Class111.field_1394
                  || var1.method_149(var7, var4 - 1, var9 - 1) == Class111.field_1394
                  || var1.method_149(var7, var4 - 1, var9 + 1) == Class111.field_1394
            )) {
            int var10 = 2 + var2.nextInt(var2.nextInt(3) + 1);

            for (int var11 = 0; var11 < var10; var11++) {
               if (Class371.field_963.method_645(var1, var7, var8 + var11, var9)) {
                  var1.method_260(var7, var8 + var11, var9, Class371.field_963.field_1379);
               }
            }
         }
      }

      return true;
   }
}
