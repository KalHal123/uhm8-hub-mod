package ext;

import java.util.Random;

public class Class97 extends Class296 {
   private Class field_2469;
   private boolean field_2418;

   protected Class97(int var1, Class var2, boolean var3) {
      super(var1, Class160.field_265);
      this.field_2418 = var3;
      this.field_2119 = 4;
      this.field_2469 = var2;
      float var4 = 0.25F;
      float var5 = 1.0F;
      this.method_1930(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var5, 0.5F + var4);
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public Class630 method_1331(Class454 var1, int var2, int var3, int var4) {
      this.method_547(var1, var2, var3, var4);
      return super.method_1331(var1, var2, var3, var4);
   }

   @Override
   public void method_547(Interface698 var1, int var2, int var3, int var4) {
      if (!this.field_2418) {
         int var5 = var1.method_1110(var2, var3, var4);
         float var6 = 0.28125F;
         float var7 = 0.78125F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         float var10 = 0.125F;
         this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if (var5 == 2) {
            this.method_1930(var8, var6, 1.0F - var10, var9, var7, 1.0F);
         }

         if (var5 == 3) {
            this.method_1930(var8, var6, 0.0F, var9, var7, var10);
         }

         if (var5 == 4) {
            this.method_1930(1.0F - var10, var6, var8, 1.0F, var7, var9);
         }

         if (var5 == 5) {
            this.method_1930(0.0F, var6, var8, var10, var7, var9);
         }
      }
   }

   @Override
   public int method_178() {
      return -1;
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   protected Class186 method_1700() {
      try {
         return (Class186)this.field_2469.newInstance();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class755.field_606.field_10;
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (this.field_2418) {
         if (!var1.method_1286(var2, var3 - 1, var4).method_1888()) {
            var6 = true;
         }
      } else {
         int var7 = var1.method_1110(var2, var3, var4);
         var6 = true;
         if (var7 == 2 && var1.method_1286(var2, var3, var4 + 1).method_1888()) {
            var6 = false;
         }

         if (var7 == 3 && var1.method_1286(var2, var3, var4 - 1).method_1888()) {
            var6 = false;
         }

         if (var7 == 4 && var1.method_1286(var2 + 1, var3, var4).method_1888()) {
            var6 = false;
         }

         if (var7 == 5 && var1.method_1286(var2 - 1, var3, var4).method_1888()) {
            var6 = false;
         }
      }

      if (var6) {
         this.method_1227(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }

      super.method_1300(var1, var2, var3, var4, var5);
   }
}
