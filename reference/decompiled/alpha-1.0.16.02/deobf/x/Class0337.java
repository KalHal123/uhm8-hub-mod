package x;

import java.util.Random;

public class Class0337 extends Class0312 {
   protected Class0337(int var1) {
      super(var1, Class0155.b);
      this.aZ = 3;
      this.b(true);
   }

   @Override
   public int a(Class0351 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return 0;
      }

      if (var5 == 0) {
         return 2;
      }

      Class0155 var6 = var1.f(var2, var3 + 1, var4);
      return var6 != Class0155.s && var6 != Class0155.t ? 3 : 68;
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (var1.j(var2, var3 + 1, var4) < 4 && var1.f(var2, var3 + 1, var4).b()) {
         if (var5.nextInt(4) != 0) {
            return;
         }

         var1.d(var2, var3, var4, Class0312.v.ba);
      } else if (var1.j(var2, var3 + 1, var4) >= 9) {
         int var6 = var2 + var5.nextInt(3) - 1;
         int var7 = var3 + var5.nextInt(5) - 3;
         int var8 = var4 + var5.nextInt(3) - 1;
         if (var1.a(var6, var7, var8) == Class0312.v.ba && var1.j(var6, var7 + 1, var8) >= 4 && !var1.f(var6, var7 + 1, var8).b()) {
            var1.d(var6, var7, var8, Class0312.u.ba);
         }
      }
   }

   @Override
   public int a(int var1, Random var2) {
      return Class0312.v.a(0, var2);
   }
}
