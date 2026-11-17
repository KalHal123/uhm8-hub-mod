package srv;

import java.util.Random;

public class Class91 extends Class277 {
   private Class field_1473;
   private boolean field_692;

   protected Class91(int var1, Class var2, boolean var3) {
      super(var1, Class111.field_1200);
      this.field_692 = var3;
      this.field_1137 = 4;
      this.field_1473 = var2;
      float var4 = 0.25F;
      float var5 = 1.0F;
      this.method_177(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var5, 0.5F + var4);
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public void method_15(Interface351 var1, int var2, int var3, int var4) {
      if (!this.field_692) {
         int var5 = var1.method_929(var2, var3, var4);
         float var6 = 0.28125F;
         float var7 = 0.78125F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         float var10 = 0.125F;
         this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if (var5 == 2) {
            this.method_177(var8, var6, 1.0F - var10, var9, var7, 1.0F);
         }

         if (var5 == 3) {
            this.method_177(var8, var6, 0.0F, var9, var7, var10);
         }

         if (var5 == 4) {
            this.method_177(1.0F - var10, var6, var8, 1.0F, var7, var9);
         }

         if (var5 == 5) {
            this.method_177(0.0F, var6, var8, var10, var7, var9);
         }
      }
   }

   @Override
   public int method_225() {
      return -1;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   protected Class66 method_707() {
      try {
         return (Class66)this.field_1473.newInstance();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class350.field_1504.field_473;
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (this.field_692) {
         if (!var1.method_149(var2, var3 - 1, var4).method_325()) {
            var6 = true;
         }
      } else {
         int var7 = var1.method_929(var2, var3, var4);
         var6 = true;
         if (var7 == 2 && var1.method_149(var2, var3, var4 + 1).method_325()) {
            var6 = false;
         }

         if (var7 == 3 && var1.method_149(var2, var3, var4 - 1).method_325()) {
            var6 = false;
         }

         if (var7 == 4 && var1.method_149(var2 + 1, var3, var4).method_325()) {
            var6 = false;
         }

         if (var7 == 5 && var1.method_149(var2 - 1, var3, var4).method_325()) {
            var6 = false;
         }
      }

      if (var6) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
      }

      super.method_721(var1, var2, var3, var4, var5);
   }
}
