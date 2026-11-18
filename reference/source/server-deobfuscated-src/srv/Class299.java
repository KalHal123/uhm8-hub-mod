package srv;

import java.util.Random;

public class Class299 extends Class19 {
   private int field_1432;

   public Class299(int var1) {
      this.field_1432 = var1;
   }

   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 64; var6++) {
         int var7 = var5 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var10 = var1.method_813(var9, var8 - 1, var7);
         boolean var11 = var10 == 9 || var10 == 79;
         if (var1.method_813(var9, var8, var7) == 0 && var11) {
            var1.method_260(var9, var8, var7, this.field_1432);
         }
      }

      return true;
   }
}
