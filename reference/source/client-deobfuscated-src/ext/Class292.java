package ext;

import java.util.Random;

public class Class292 extends Class19 {
   protected final boolean field_2366;

   protected Class292(int var1, boolean var2) {
      super(var1, Class160.field_68);
      this.field_2366 = var2;
      this.field_2972 = 45;
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class108.field_2604.field_2151;
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      super.method_1937(var1, var2, var3, var4);
      this.method_1587(var1, var2, var3, var4);
   }

   private void method_1587(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4 - 1);
      int var6 = var1.method_197(var2, var3, var4 + 1);
      int var7 = var1.method_197(var2 - 1, var3, var4);
      int var8 = var1.method_197(var2 + 1, var3, var4);
      byte var9 = 3;
      if (Class108.field_710[var5] && !Class108.field_710[var6]) {
         var9 = 3;
      }

      if (Class108.field_710[var6] && !Class108.field_710[var5]) {
         var9 = 2;
      }

      if (Class108.field_710[var7] && !Class108.field_710[var8]) {
         var9 = 5;
      }

      if (Class108.field_710[var8] && !Class108.field_710[var7]) {
         var9 = 4;
      }

      var1.method_518(var2, var3, var4, var9);
   }

   @Override
   public int method_213(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return Class108.field_720.field_2972;
      }

      if (var5 == 0) {
         return Class108.field_720.field_2972;
      }

      int var6 = var1.method_1110(var2, var3, var4);
      return var5 != var6 ? this.field_2972 : (this.field_2366 ? this.field_2972 + 16 : this.field_2972 - 1);
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_2366) {
         int var6 = var1.method_1110(var2, var3, var4);
         float var7 = var2 + 0.5F;
         float var8 = var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         if (var6 == 4) {
            var1.method_1347("smoke", var7 - var10, var8, var9 + var11, 0.0, 0.0, 0.0);
            var1.method_1347("flame", var7 - var10, var8, var9 + var11, 0.0, 0.0, 0.0);
         } else if (var6 == 5) {
            var1.method_1347("smoke", var7 + var10, var8, var9 + var11, 0.0, 0.0, 0.0);
            var1.method_1347("flame", var7 + var10, var8, var9 + var11, 0.0, 0.0, 0.0);
         } else if (var6 == 2) {
            var1.method_1347("smoke", var7 + var11, var8, var9 - var10, 0.0, 0.0, 0.0);
            var1.method_1347("flame", var7 + var11, var8, var9 - var10, 0.0, 0.0, 0.0);
         } else if (var6 == 3) {
            var1.method_1347("smoke", var7 + var11, var8, var9 + var10, 0.0, 0.0, 0.0);
            var1.method_1347("flame", var7 + var11, var8, var9 + var10, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public int method_1735(int var1) {
      return var1 == 1 ? Class108.field_720.field_2151 : (var1 == 0 ? Class108.field_720.field_2151 : (var1 == 3 ? this.field_2972 - 1 : this.field_2972));
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      Class38 var6 = (Class38)var1.method_1303(var2, var3, var4);
      var5.method_1790(var6);
      return true;
   }

   public static void method_357(boolean var0, Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      Class186 var6 = var1.method_1303(var2, var3, var4);
      if (var0) {
         var1.method_1481(var2, var3, var4, Class108.field_847.field_2151);
      } else {
         var1.method_1481(var2, var3, var4, Class108.field_2604.field_2151);
      }

      var1.method_518(var2, var3, var4, var5);
      var1.method_1516(var2, var3, var4, var6);
   }

   @Override
   protected Class186 method_1267() {
      return new Class38();
   }
}
