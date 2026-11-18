package srv;

import java.util.Random;

public class Class74 extends Class277 {
   public Class74(int var1, Class111 var2) {
      super(var1, var2);
      this.field_1137 = 1;
      this.method_194(true);
      this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
   }

   @Override
   protected Class66 method_707() {
      return new Class54();
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
   public int method_225() {
      return 14;
   }

   @Override
   public boolean method_212(Interface351 var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      Class54 var6 = (Class54)var1.method_49(var2, var3, var4);
      if (var6.method_908(0).field_1497 != 0) {
         if (++var6.field_1094 >= 2 && var5.nextInt(3) == 0) {
            if (var6.method_908(0).field_1497 == 64) {
               var1.method_674(var2, var3, var4, var2, var3, var4);
            }

            var6.method_420(0, 1);
            var6.field_1094 = 0;
            if (var6.method_908(0).field_1497 == 0) {
               for (int var7 = 0; var7 < 12; var7++) {
                  var1.method_140("smoke", var2 + var5.nextDouble(), var3 + 0.4, var4 + var5.nextDouble(), 0.0, 0.1, 0.0);
                  var1.method_674(var2, var3, var4, var2, var3, var4);
               }
            }
         }
      }
   }

   @Override
   public void method_496(Class317 var1, int var2, int var3, int var4, Random var5) {
      Class54 var6 = (Class54)var1.method_49(var2, var3, var4);
      if (var6.method_908(0).field_1497 != 0) {
         if (var5.nextInt(2) == 0) {
            var1.method_140("snowballpoof", var2 + var5.nextDouble(), var3 + 0.4, var4 + var5.nextDouble(), 0.0, 0.0, 0.0);
         }

         if (var5.nextInt(3) == 0) {
            for (int var7 = var3 + 1; var7 < Math.min(128, var6.method_908(0).field_1497 + var3) && var1.method_813(var2, var7, var4) == 0; var7++) {
               if (var5.nextInt(6) == 0) {
                  var1.method_140("splash", var2 + var5.nextDouble(), var7 + var5.nextDouble(), var4 + var5.nextDouble(), 0.0, 0.0, 0.0);
               }
            }
         }
      }
   }
}
