package x;

import java.util.Random;

public class Class0353 extends Class0218 {
   private int a;

   public Class0353(int var1) {
      this.a = var1;
   }

   @Override
   public boolean a(Class0065 var1, Random var2, int var3, int var4, int var5) {
      if (var1.a(var3, var4 + 1, var5) != Class0312.t.ba) {
         return false;
      }

      if (var1.a(var3, var4 - 1, var5) != Class0312.t.ba) {
         return false;
      }

      if (var1.a(var3, var4, var5) != 0 && var1.a(var3, var4, var5) != Class0312.t.ba) {
         return false;
      }

      int var6 = 0;
      if (var1.a(var3 - 1, var4, var5) == Class0312.t.ba) {
         var6++;
      }

      if (var1.a(var3 + 1, var4, var5) == Class0312.t.ba) {
         var6++;
      }

      if (var1.a(var3, var4, var5 - 1) == Class0312.t.ba) {
         var6++;
      }

      if (var1.a(var3, var4, var5 + 1) == Class0312.t.ba) {
         var6++;
      }

      int var7 = 0;
      if (var1.a(var3 - 1, var4, var5) == 0) {
         var7++;
      }

      if (var1.a(var3 + 1, var4, var5) == 0) {
         var7++;
      }

      if (var1.a(var3, var4, var5 - 1) == 0) {
         var7++;
      }

      if (var1.a(var3, var4, var5 + 1) == 0) {
         var7++;
      }

      if (var6 == 3 && var7 == 1) {
         var1.d(var3, var4, var5, this.a);
      }

      return true;
   }
}
