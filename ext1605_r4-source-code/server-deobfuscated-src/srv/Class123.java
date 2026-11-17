package srv;

import java.util.Random;

public class Class123 extends Class292 {
   int field_650 = 1;

   public Class123(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public boolean method_786() {
      return false;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return true;
   }

   @Override
   public void method_762(Class317 var1, int var2, int var3, int var4, Class252 var5) {
      if (var5 instanceof Class41) {
         Class41 var6 = (Class41)var5;
         if (var6.field_399 <= 0) {
            var6.field_399 = 20;
            var6.method_228(1);
         }
      }
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      Class150 var6 = var5.field_783.method_40();
      if (var6 == null) {
         return false;
      }

      if (var6.field_1298 == Class323.field_973.field_1379) {
         var1.method_226(var2, var3, var4, 117);
         var5.field_783.method_844(Class323.field_973.field_1379);
         var1.method_621(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "ext.infuse", 1.0F, 1.0F);
      } else if (var6.field_1298 == Class350.field_922.field_473) {
         var1.method_226(var2, var3, var4, 118);
         var5.field_783.method_844(Class350.field_922.field_473);
         var1.method_621(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "ext.infuse", 1.0F, 0.7F);
      } else if (var6.field_1298 == Class13.field_1270.field_473) {
         var1.method_226(var2, var3, var4, 119);
         var5.field_783.method_844(Class13.field_1270.field_473);
         var1.method_621(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "ext.infuse", 1.0F, 0.3F);
      }

      return true;
   }

   @Override
   public void method_496(Class317 var1, int var2, int var3, int var4, Random var5) {
   }
}
