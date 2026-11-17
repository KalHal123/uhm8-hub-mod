package srv;

import java.util.Random;

public class Class6 extends Class19 {
   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 6; var6++) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.method_813(var7, var8 - 1, var9) != Class371.field_535.field_1379 && var1.method_813(var7, var8 - 1, var9) != Class371.field_1051.field_1379) {
            for (int var10 = 0; var10 != 5 && var1.method_813(var7, var8 + var10, var9) == Class371.field_535.field_1379; var10++) {
               if (var10 == 4) {
                  var1.method_260(var7, var8, var9, var2.nextInt(20) > 16 ? Class371.field_111.field_1379 : Class371.field_1111.field_1379);
               }
            }
         }
      }

      return true;
   }
}
