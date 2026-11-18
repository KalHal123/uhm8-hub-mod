package srv;

import java.util.Random;

public class Class78 extends Class19 {
   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 64; var6++) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.method_813(var7, var8, var9) == 0 && Class323.field_117.method_645(var1, var7, var8, var9)) {
            var1.method_260(var7, var8, var9, 165);
         }
      }

      return true;
   }
}
