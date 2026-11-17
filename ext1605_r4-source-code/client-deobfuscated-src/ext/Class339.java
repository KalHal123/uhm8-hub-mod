package ext;

import java.util.Random;

public class Class339 extends Class641 {
   private int field_1628;

   public Class339(int var1) {
      this.field_1628 = var1;
   }

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      if (var1.method_197(var3, var4 + 1, var5) != Class108.field_720.field_2151) {
         return false;
      }

      if (var1.method_197(var3, var4 - 1, var5) != Class108.field_720.field_2151) {
         return false;
      }

      if (var1.method_197(var3, var4, var5) != 0 && var1.method_197(var3, var4, var5) != Class108.field_720.field_2151) {
         return false;
      }

      int var6 = 0;
      if (var1.method_197(var3 - 1, var4, var5) == Class108.field_720.field_2151) {
         var6++;
      }

      if (var1.method_197(var3 + 1, var4, var5) == Class108.field_720.field_2151) {
         var6++;
      }

      if (var1.method_197(var3, var4, var5 - 1) == Class108.field_720.field_2151) {
         var6++;
      }

      if (var1.method_197(var3, var4, var5 + 1) == Class108.field_720.field_2151) {
         var6++;
      }

      int var7 = 0;
      if (var1.method_197(var3 - 1, var4, var5) == 0) {
         var7++;
      }

      if (var1.method_197(var3 + 1, var4, var5) == 0) {
         var7++;
      }

      if (var1.method_197(var3, var4, var5 - 1) == 0) {
         var7++;
      }

      if (var1.method_197(var3, var4, var5 + 1) == 0) {
         var7++;
      }

      if (var6 == 3 && var7 == 1) {
         var1.method_1481(var3, var4, var5, this.field_1628);
      }

      return true;
   }
}
