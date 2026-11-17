package ext;

import java.util.Random;

public class Class2 extends Class407 {
   public static boolean field_728 = false;

   public Class2(int var1, int var2) {
      super(var1, var2, Class160.field_1350);
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      var1.method_600(var2, var3, var4, this.field_19);
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      var1.method_600(var2, var3, var4, this.field_19);
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      this.method_91(var1, var2, var3, var4);
   }

   private void method_91(Class454 var1, int var2, int var3, int var4) {
      int var5 = var2;
      int var6 = var3;
      int var7 = var4;
      if (method_1073(var1, var5, var6 - 1, var7) && var6 >= 0) {
         Class492 var8 = new Class492(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, this.field_19);
         if (field_728) {
            while (!var8.field_2642) {
               var8.method_46();
            }
         } else {
            var1.method_1447(var8);
         }
      }
   }

   @Override
   public int method_1520() {
      return 3;
   }

   public static boolean method_1073(Class454 var0, int var1, int var2, int var3) {
      int var4 = var0.method_197(var1, var2, var3);
      if (var4 == 0) {
         return true;
      }

      if (var4 == Class407.field_1151.field_19) {
         return true;
      }

      Class160 var5 = Class407.field_495[var4].field_1201;
      return var5 == Class160.field_1413 ? true : var5 == Class160.field_3120;
   }
}
