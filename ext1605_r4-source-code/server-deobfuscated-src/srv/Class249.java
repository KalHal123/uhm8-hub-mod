package srv;

import java.util.Random;

public class Class249 extends Class19 {
   private int field_369;

   public Class249(int var1) {
      this.field_369 = var1;
   }

   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      if (var1.method_813(var3, var4 + 1, var5) != Class371.field_1294.field_1379) {
         return false;
      }

      if (var1.method_813(var3, var4 - 1, var5) != Class371.field_1294.field_1379) {
         return false;
      }

      if (var1.method_813(var3, var4, var5) != 0 && var1.method_813(var3, var4, var5) != Class371.field_1294.field_1379) {
         return false;
      }

      int var6 = 0;
      if (var1.method_813(var3 - 1, var4, var5) == Class371.field_1294.field_1379) {
         var6++;
      }

      if (var1.method_813(var3 + 1, var4, var5) == Class371.field_1294.field_1379) {
         var6++;
      }

      if (var1.method_813(var3, var4, var5 - 1) == Class371.field_1294.field_1379) {
         var6++;
      }

      if (var1.method_813(var3, var4, var5 + 1) == Class371.field_1294.field_1379) {
         var6++;
      }

      int var7 = 0;
      if (var1.method_813(var3 - 1, var4, var5) == 0) {
         var7++;
      }

      if (var1.method_813(var3 + 1, var4, var5) == 0) {
         var7++;
      }

      if (var1.method_813(var3, var4, var5 - 1) == 0) {
         var7++;
      }

      if (var1.method_813(var3, var4, var5 + 1) == 0) {
         var7++;
      }

      if (var6 == 3 && var7 == 1) {
         var1.method_226(var3, var4, var5, this.field_369);
      }

      return true;
   }
}
