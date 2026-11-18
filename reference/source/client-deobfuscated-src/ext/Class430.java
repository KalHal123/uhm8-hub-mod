package ext;

import java.util.Random;

public class Class430 extends Class666 {
   protected Class430(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.4F;
      this.method_1618(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      super.method_766(var1, var2, var3, var4, var5);
      if (var1.method_1676(var2, var3 + 1, var4) >= 9 && var5.nextInt(5) == 0) {
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 < 15) {
            var1.method_518(var2, var3, var4, var6 + 1);
         } else {
            var1.method_470(var2, var3, var4, 0);
            Class641 var7 = new Class195();
            if (var5.nextInt(10) == 0) {
               var7 = new Class161();
            }

            if (!var7.method_303(var1, var5, var2, var3, var4)) {
               var1.method_470(var2, var3, var4, this.field_2151);
            }
         }
      }
   }
}
