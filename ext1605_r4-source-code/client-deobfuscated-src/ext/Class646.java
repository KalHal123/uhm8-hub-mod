package ext;

import java.util.Random;

public class Class646 extends Class108 {
   public static boolean field_1552 = false;

   public Class646(int var1, int var2) {
      super(var1, var2, Class160.field_1350);
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      var1.method_600(var2, var3, var4, this.field_2151);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      var1.method_600(var2, var3, var4, this.field_2151);
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      this.method_583(var1, var2, var3, var4);
   }

   private void method_583(Class454 var1, int var2, int var3, int var4) {
      if (Math.abs(var2) <= 12540000 && Math.abs(var4) <= 12540000 && method_1770(var1, var2, var3 - 1, var4) && var3 >= 0) {
         Class492 var5 = new Class492(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, this.field_2151);
         if (field_1552) {
            while (!var5.field_2642) {
               var5.method_46();
            }
         } else {
            var1.method_1447(var5);
         }
      }
   }

   @Override
   public int method_1427() {
      return 3;
   }

   public static boolean method_1770(Class454 var0, int var1, int var2, int var3) {
      int var4 = var0.method_197(var1, var2, var3);
      if (var4 == 0) {
         return true;
      }

      if (var4 == Class108.field_1781.field_2151) {
         return true;
      }

      Class160 var5 = Class108.field_1221[var4].field_1854;
      return var5 == Class160.field_1413 ? true : var5 == Class160.field_3120;
   }
}
