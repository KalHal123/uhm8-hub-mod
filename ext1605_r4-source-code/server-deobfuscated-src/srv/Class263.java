package srv;

import java.util.Random;

public class Class263 extends Class277 {
   private final boolean field_1565;

   public Class263(int var1, int var2, boolean var3) {
      super(var1, Class111.field_1043);
      this.field_1137 = var2;
      this.field_1565 = var3;
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class323.field_1070.field_1379;
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      super.method_1013(var1, var2, var3, var4);
      this.method_589(var1, var2, var3, var4);
   }

   private void method_589(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3, var4 - 1);
      int var6 = var1.method_813(var2, var3, var4 + 1);
      int var7 = var1.method_813(var2 - 1, var3, var4);
      int var8 = var1.method_813(var2 + 1, var3, var4);
      byte var9 = 3;
      if (Class371.field_380[var5] && !Class371.field_380[var6]) {
         var9 = 3;
      }

      if (Class371.field_380[var6] && !Class371.field_380[var5]) {
         var9 = 2;
      }

      if (Class371.field_380[var7] && !Class371.field_380[var8]) {
         var9 = 5;
      }

      if (Class371.field_380[var8] && !Class371.field_380[var7]) {
         var9 = 4;
      }

      var1.method_489(var2, var3, var4, var9);
   }

   @Override
   public int method_897(Interface351 var1, int var2, int var3, int var4, int var5) {
      return var5 != 1 && var5 != 0
         ? (var5 != var1.method_929(var2, var3, var4) ? (this.field_1565 ? this.field_1137 - 2 : this.field_1137 - 1) : this.field_1137)
         : Class371.field_1294.field_1137;
   }

   @Override
   public int method_310(int var1) {
      return var1 != 1 && var1 != 0
         ? (var1 == 3 ? this.field_1137 : (this.field_1565 ? this.field_1137 - 2 : this.field_1137 - 1))
         : Class371.field_1294.field_1379;
   }

   @Override
   public void method_496(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_1565) {
         int var6 = var1.method_929(var2, var3, var4);
         float var7 = var2 + 0.5F;
         float var8 = var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         int var12 = var5.nextInt(3) + 1;
         if (var6 == 4) {
            var1.method_140("snowflake" + var12, var7 - var10, var8, var9 + var11, 0.0, -0.01, 0.0);
         } else if (var6 == 5) {
            var1.method_140("snowflake" + var12, var7 + var10, var8, var9 + var11, 0.0, -0.01, 0.0);
         } else if (var6 == 2) {
            var1.method_140("snowflake" + var12, var7 + var11, var8, var9 - var10, 0.0, -0.01, 0.0);
         } else if (var6 == 3) {
            var1.method_140("snowflake" + var12, var7 + var11, var8, var9 + var10, 0.0, -0.01, 0.0);
         }
      }
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      Class86 var6 = (Class86)var1.method_49(var2, var3, var4);
      return true;
   }

   public static void method_888(boolean var0, Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      Class66 var6 = var1.method_49(var2, var3, var4);
      if (var0) {
         var1.method_226(var2, var3, var4, Class323.field_531.field_1379);
      } else {
         var1.method_226(var2, var3, var4, Class323.field_1070.field_1379);
      }

      var1.method_489(var2, var3, var4, var5);
      var1.method_563(var2, var3, var4, var6);
   }

   @Override
   protected Class66 method_707() {
      return new Class86();
   }
}
