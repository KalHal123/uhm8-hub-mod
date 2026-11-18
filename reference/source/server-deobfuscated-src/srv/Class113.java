package srv;

import java.util.Random;

public class Class113 extends Class342 {
   protected Class113(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.4F;
      this.method_177(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      super.method_373(var1, var2, var3, var4, var5);
      if (var1.method_339(var2, var3 + 1, var4) >= 9 && var5.nextInt(5) == 0) {
         int var6 = var1.method_929(var2, var3, var4);
         if (var6 < 15) {
            var1.method_489(var2, var3, var4, var6 + 1);
         } else {
            var1.method_260(var2, var3, var4, 0);
            Class19 var7 = new Class22();
            if (var5.nextInt(10) == 0) {
               var7 = new Class269();
            }

            if (!var7.method_453(var1, var5, var2, var3, var4)) {
               var1.method_260(var2, var3, var4, this.field_1379);
            }
         }
      }
   }
}
