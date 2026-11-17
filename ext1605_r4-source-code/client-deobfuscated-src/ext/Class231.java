package ext;

import java.util.Random;

public class Class231 extends Class615 {
   protected Class231(int var1, int var2) {
      super(var1, var2);
      this.field_2119 = var2;
      this.method_1936(true);
      float var3 = 0.5F;
      this.method_1930(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
   }

   @Override
   protected boolean method_1107(int var1) {
      return var1 == Class407.field_342.field_19;
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      super.method_732(var1, var2, var3, var4, var5);
      if (var1.method_1676(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 < 7) {
            float var7 = this.method_597(var1, var2, var3, var4);
            if (var5.nextInt((int)(100.0F / var7)) == 0) {
               var1.method_518(var2, var3, var4, ++var6);
            }
         }
      }
   }

   private float method_597(Class454 var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.method_197(var2, var3, var4 - 1);
      int var7 = var1.method_197(var2, var3, var4 + 1);
      int var8 = var1.method_197(var2 - 1, var3, var4);
      int var9 = var1.method_197(var2 + 1, var3, var4);
      int var10 = var1.method_197(var2 - 1, var3, var4 - 1);
      int var11 = var1.method_197(var2 + 1, var3, var4 - 1);
      int var12 = var1.method_197(var2 + 1, var3, var4 + 1);
      int var13 = var1.method_197(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.field_19 || var9 == this.field_19;
      boolean var15 = var6 == this.field_19 || var7 == this.field_19;
      boolean var16 = var10 == this.field_19 || var11 == this.field_19 || var12 == this.field_19 || var13 == this.field_19;

      for (int var17 = var2 - 1; var17 <= var2 + 1; var17++) {
         for (int var18 = var4 - 1; var18 <= var4 + 1; var18++) {
            int var19 = var1.method_197(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if (var19 == Class407.field_342.field_19) {
               var20 = 1.0F;
               if (var1.method_1110(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if (var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if (var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   @Override
   public int method_1411(int var1, int var2) {
      if (var2 < 0) {
         var2 = 7;
      }

      return this.field_2119 + var2;
   }

   @Override
   public int method_178() {
      return 6;
   }

   @Override
   public void method_1000(Class454 var1, int var2, int var3, int var4, int var5) {
      super.method_1000(var1, var2, var3, var4, var5);

      for (int var6 = 0; var6 < 3; var6++) {
         if (var1.field_2150.nextInt(15) <= var5) {
            float var7 = 0.7F;
            float var8 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            float var9 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            float var10 = var1.field_2150.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            Class198 var11 = new Class198(var1, var2 + var8, var3 + var9, var4 + var10, new Class334(Class755.field_2432));
            var11.field_2283 = 10;
            var1.method_1447(var11);
         }
      }
   }

   @Override
   public int method_1651(int var1, Random var2) {
      System.out.println("Get resource: " + var1);
      return var1 == 7 ? Class755.field_751.field_10 : -1;
   }

   @Override
   public int method_806(Random var1) {
      return 1;
   }
}
