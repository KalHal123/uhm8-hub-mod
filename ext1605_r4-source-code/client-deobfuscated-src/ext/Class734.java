package ext;

import java.util.Random;

public class Class734 extends Class407 {
   protected Class734(int var1) {
      super(var1, Class160.field_1750);
      this.field_2119 = 3;
      this.method_1936(true);
   }

   @Override
   public int method_1278(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return 0;
      }

      if (var5 == 0) {
         return 2;
      }

      Class160 var6 = var1.method_1286(var2, var3 + 1, var4);
      return var6 != Class160.field_2730 && var6 != Class160.field_1246 ? 3 : 68;
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1676(var2, var3 + 1, var4) < 4 && var1.method_1286(var2, var3 + 1, var4).method_1494()) {
         if (var5.nextInt(4) != 0) {
            return;
         }

         var1.method_1481(var2, var3, var4, Class407.field_2578.field_19);
      } else if (var1.method_1676(var2, var3 + 1, var4) >= 9) {
         int var6 = var2 + var5.nextInt(3) - 1;
         int var7 = var3 + var5.nextInt(5) - 3;
         int var8 = var4 + var5.nextInt(3) - 1;
         if (var1.method_197(var6, var7, var8) == Class407.field_2578.field_19
            && var1.method_1676(var6, var7 + 1, var8) >= 4
            && !var1.method_1286(var6, var7 + 1, var8).method_1494()) {
            var1.method_1481(var6, var7, var8, Class407.field_1875.field_19);
         }
      }
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class407.field_2578.method_1651(0, var2);
   }
}
