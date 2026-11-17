package ext;

import java.util.Random;

public class Class743 extends Class108 {
   protected Class743(int var1, int var2) {
      super(var1, var2, Class160.field_1246);
      this.method_1646(true);
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class755.field_103.field_10;
   }

   @Override
   public int method_1257(Random var1) {
      return 4;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextBoolean()) {
         double var6 = (var5.nextDouble() - 0.5) * 0.1;
         double var8 = (var5.nextDouble() - 0.5) * 0.1;
         var1.method_1347("snow1", var2, var3, var4, var6, 0.8, var8);
      }

      if (var5.nextBoolean()) {
         double var10 = (var5.nextDouble() - 0.5) * 0.2;
         double var12 = (var5.nextDouble() - 0.5) * 0.2;
         var1.method_1347("snow2", var2, var3, var4, var10, 0.95, var12);
      }

      if (var5.nextBoolean()) {
         double var11 = (var5.nextDouble() + 0.5) * 0.2;
         double var13 = (var5.nextDouble() - 0.5) * 0.1;
         var1.method_1347("snow3", var2, var3, var4, var11, 0.45, var13);
      }

      if (var1.method_1763(Enum621.field_2016, var2, var3, var4) > 11) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }
}
