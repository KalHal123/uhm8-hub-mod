package ext;

import java.util.Random;

public class Class466 extends Class722 {
   protected Class466(int var1, Class160 var2) {
      super(var1, var2);
      this.method_1646(false);
      if (var2 == Class160.field_3120) {
         this.method_1646(true);
      }
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      super.method_1464(var1, var2, var3, var4, var5);
      if (var1.method_197(var2, var3, var4) == this.field_2151) {
         this.method_355(var1, var2, var3, var4);
      }
   }

   private void method_355(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      var1.field_2771 = true;
      var1.method_307(var2, var3, var4, this.field_2151 - 1, var5);
      var1.method_1678(var2, var3, var4, var2, var3, var4);
      var1.method_600(var2, var3, var4, this.field_2151 - 1);
      var1.field_2771 = false;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_1854 == Class160.field_3120) {
         int var6 = var5.nextInt(3);

         for (int var7 = 0; var7 < var6; var7++) {
            var2 += var5.nextInt(3) - 1;
            var3++;
            var4 += var5.nextInt(3) - 1;
            int var8 = var1.method_197(var2, var3, var4);
            if (var8 == 0) {
               if (this.method_1586(var1, var2 - 1, var3, var4)
                  || this.method_1586(var1, var2 + 1, var3, var4)
                  || this.method_1586(var1, var2, var3, var4 - 1)
                  || this.method_1586(var1, var2, var3, var4 + 1)
                  || this.method_1586(var1, var2, var3 - 1, var4)
                  || this.method_1586(var1, var2, var3 + 1, var4)) {
                  var1.method_1481(var2, var3, var4, Class108.field_1781.field_2151);
                  return;
               }
            } else if (Class108.field_1221[var8].field_1854.method_1552()) {
               return;
            }
         }
      }
   }

   private boolean method_1586(Class454 var1, int var2, int var3, int var4) {
      return var1.method_1286(var2, var3, var4).method_1578();
   }
}
