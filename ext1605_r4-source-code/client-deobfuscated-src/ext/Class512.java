package ext;

public class Class512 extends Class407 {
   protected Class512(int var1, int var2) {
      super(var1, var2, Class160.field_265);
   }

   @Override
   public int method_519(int var1) {
      return this.field_2119 + (var1 == 1 ? 1 : 0);
   }

   @Override
   public boolean method_676(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if (var6 > 0) {
         this.method_66(var1, var2, var3, var4, var6);
         return true;
      } else {
         return false;
      }
   }

   public void method_66(Class454 var1, int var2, int var3, int var4, int var5) {
      var1.method_686(null, var2, var3, var4);
      var1.method_518(var2, var3, var4, 0);
      int var6 = Class755.field_849.field_10 + var5 - 1;
      float var7 = 0.7F;
      double var8 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.5;
      double var10 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.2 + 0.6;
      double var12 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.5;
      Class198 var14 = new Class198(var1, var2 + var8, var3 + var10, var4 + var12, new Class334(var6));
      var14.field_2283 = 10;
      var1.method_1447(var14);
   }

   @Override
   public void method_997(Class454 var1, int var2, int var3, int var4, int var5, float var6) {
      if (!var1.field_2994) {
         if (var5 > 0) {
            this.method_66(var1, var2, var3, var4, var5);
         }

         super.method_997(var1, var2, var3, var4, var5, var6);
      }
   }
}
