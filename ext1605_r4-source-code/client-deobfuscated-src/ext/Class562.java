package ext;

public class Class562 extends Class755 {
   public Class562(int var1) {
      super(var1);
      this.field_2438 = 1;
   }

   @Override
   public Class334 method_1566(Class334 var1, Class454 var2, Class354 var3) {
      float var4 = 1.0F;
      float var5 = var3.field_2984 + (var3.field_2866 - var3.field_2984) * var4;
      float var6 = var3.field_2772 + (var3.field_1661 - var3.field_2772) * var4;
      double var7 = var3.field_2553 + (var3.field_1417 - var3.field_2553) * var4;
      double var9 = var3.field_2068 + (var3.field_2654 - var3.field_2068) * var4;
      double var11 = var3.field_1780 + (var3.field_2013 - var3.field_1780) * var4;
      Class214 var13 = Class214.method_701(var7, var9, var11);
      float var14 = Class469.method_255(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var15 = Class469.method_1667(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var16 = -Class469.method_255(-var5 * (float) (Math.PI / 180.0));
      float var17 = Class469.method_1667(-var5 * (float) (Math.PI / 180.0));
      float var18 = var15 * var16;
      float var19 = var14 * var16;
      double var20 = 5.0;
      Class214 var22 = var13.method_1750(var18 * var20, var17 * var20, var19 * var20);
      Class366 var23 = var2.method_1030(var13, var22, true);
      if (var23 == null) {
         return var1;
      }

      if (var23.field_1786 == 0) {
         int var24 = var23.field_1129;
         int var25 = var23.field_1756;
         int var26 = var23.field_513;
         var2.method_1447(new Class256(var2, var24 + 0.5F, var25 + 1.5F, var26 + 0.5F));
         var1.field_2326--;
      }

      return var1;
   }
}
