package ext;

import java.util.Random;

public class Class610 extends Class641 {
   private int field_365;

   public Class610(int var1) {
      this.field_365 = var1;
   }

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 64; var6++) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if (var1.method_197(var7, var8, var9) == 0 && ((Class666)Class108.field_1221[this.field_365]).method_1674(var1, var7, var8, var9)) {
            var1.method_470(var7, var8, var9, this.field_365);
         }
      }

      return true;
   }
}
