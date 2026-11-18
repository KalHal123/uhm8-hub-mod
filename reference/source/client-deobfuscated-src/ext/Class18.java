package ext;

import java.util.Random;

public class Class18 extends Class641 {
   private int field_744;

   public Class18(int var1) {
      this.field_744 = var1;
   }

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         boolean var10 = false;
         if (var8 > 90) {
            var10 = true;
         } else if (var8 > 80) {
            var10 = var2.nextInt(100) > 80;
         }

         if (var10 && var1.method_197(var7, var8, var9) == 0) {
            var1.method_470(var7, var8, var9, this.field_744);
         }
      }

      return true;
   }
}
