package srv;

import java.util.Random;

public class Class266 extends Class371 {
   protected Class266(int var1) {
      super(var1, Class111.field_384);
      this.field_1137 = 3;
      this.method_194(true);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_339(var2, var3 + 1, var4) < 4 && var1.method_149(var2, var3 + 1, var4).method_54()) {
         if (var5.nextInt(4) != 0) {
            return;
         }

         var1.method_226(var2, var3, var4, Class371.field_1082.field_1379);
      } else if (var1.method_339(var2, var3 + 1, var4) >= 9) {
         int var6 = var2 + var5.nextInt(3) - 1;
         int var7 = var3 + var5.nextInt(5) - 3;
         int var8 = var4 + var5.nextInt(3) - 1;
         if (var1.method_813(var6, var7, var8) == Class371.field_1082.field_1379
            && var1.method_339(var6, var7 + 1, var8) >= 4
            && !var1.method_149(var6, var7 + 1, var8).method_54()) {
            var1.method_226(var6, var7, var8, Class371.field_1206.field_1379);
         }
      }
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class371.field_1082.method_852(0, var2);
   }
}
