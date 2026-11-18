package ext;

import java.util.Random;

public class Class556 extends Class108 {
   protected Class556(int var1, int var2) {
      super(var1, var2, Class160.field_2730);
      this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.method_1646(true);
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3 - 1, var4);
      return var5 != 0 && Class108.field_1221[var5].method_214() ? var1.method_1286(var2, var3 - 1, var4).method_1552() : false;
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_1283(var1, var2, var3, var4);
   }

   private boolean method_1283(Class454 var1, int var2, int var3, int var4) {
      if (!this.method_432(var1, var2, var3, var4)) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_209(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = Class755.field_103.field_10;
      float var7 = 0.7F;
      double var8 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.5;
      double var10 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.5;
      double var12 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.5;
      Class198 var14 = new Class198(var1, var2 + var8, var3 + var10, var4 + var12, new Class334(var6));
      var14.field_2283 = 10;
      var1.method_1447(var14);
      var1.method_1481(var2, var3, var4, 0);
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class108.field_1674.field_2151;
   }

   @Override
   public int method_1257(Random var1) {
      return 0;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1763(Enum621.field_2016, var2, var3, var4) > 11) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_991(Interface698 var1, int var2, int var3, int var4, int var5) {
      Class160 var6 = var1.method_1286(var2, var3, var4);
      return var5 == 1 ? true : (var6 == this.field_1854 ? false : super.method_991(var1, var2, var3, var4, var5));
   }
}
