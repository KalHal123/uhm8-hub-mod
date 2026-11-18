package ext;

import java.util.Random;

public class Class607 extends Class108 {
   protected Class607(int var1) {
      super(var1, Class160.field_1750);
      this.field_2972 = 3;
      this.method_1646(true);
   }

   @Override
   public int method_213(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0) {
         return 2;
      }

      if (!Class310.field_2660) {
         Class457 var6 = var1.method_1805().method_1497(var2, var4, Class457.Inner598.field_2556);
         if (var6 != null) {
            switch (var6.method_1691()) {
               case 1:
                  if (var5 == 1) {
                     return 320;
                  }

                  Class160 var9 = var1.method_1286(var2, var3 + 1, var4);
                  return var9 != Class160.field_2730 && var9 != Class160.field_1246 ? 321 : 68;
               case 2:
                  if (var5 == 1) {
                     return 215;
                  }

                  Class160 var7 = var1.method_1286(var2, var3 + 1, var4);
                  return var7 != Class160.field_2730 && var7 != Class160.field_1246 ? 214 : 68;
            }
         }
      }

      if (var5 == 1) {
         return 0;
      }

      Class160 var8 = var1.method_1286(var2, var3 + 1, var4);
      return var8 != Class160.field_2730 && var8 != Class160.field_1246 ? 3 : 68;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1676(var2, var3 + 1, var4) < 4 && var1.method_1286(var2, var3 + 1, var4).method_1494()) {
         if (var5.nextInt(4) != 0) {
            return;
         }

         var1.method_1481(var2, var3, var4, Class108.field_1047.field_2151);
      } else if (var1.method_1676(var2, var3 + 1, var4) >= 9) {
         int var6 = var2 + var5.nextInt(3) - 1;
         int var7 = var3 + var5.nextInt(5) - 3;
         int var8 = var4 + var5.nextInt(3) - 1;
         if (var1.method_197(var6, var7, var8) == Class108.field_1047.field_2151
            && var1.method_1676(var6, var7 + 1, var8) >= 4
            && !var1.method_1286(var6, var7 + 1, var8).method_1494()) {
            var1.method_1481(var6, var7, var8, this.field_2151);
         }
      }
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class108.field_1047.method_1901(0, var2);
   }
}
