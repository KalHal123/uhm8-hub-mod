package x;

import java.util.Random;

public class Class0247 extends Class0312 {
   protected Class0247(int var1, int var2) {
      super(var1, Class0155.i);
      this.aZ = var2;
      float var3 = 0.375F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
      this.b(true);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (var1.a(var2, var3 + 1, var4) == 0) {
         int var6 = 1;

         while (var1.a(var2, var3 - var6, var4) == this.ba) {
            var6++;
         }

         if (var6 < 3) {
            int var7 = var1.e(var2, var3, var4);
            if (var7 == 15) {
               var1.d(var2, var3 + 1, var4, this.ba);
               var1.b(var2, var3, var4, 0);
            } else {
               var1.b(var2, var3, var4, var7 + 1);
            }
         }
      }
   }

   @Override
   public boolean a(Class0065 var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      if (var5 == this.ba) {
         return true;
      } else if (var5 != Class0312.u.ba && var5 != Class0312.v.ba) {
         return false;
      } else if (var1.f(var2 - 1, var3 - 1, var4) == Class0155.f) {
         return true;
      } else if (var1.f(var2 + 1, var3 - 1, var4) == Class0155.f) {
         return true;
      } else {
         return var1.f(var2, var3 - 1, var4 - 1) == Class0155.f ? true : var1.f(var2, var3 - 1, var4 + 1) == Class0155.f;
      }
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      this.h(var1, var2, var3, var4);
   }

   protected final void h(Class0065 var1, int var2, int var3, int var4) {
      if (!this.g(var1, var2, var3, var4)) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean g(Class0065 var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4);
   }

   @Override
   public Class0057 d(Class0065 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int a(int var1, Random var2) {
      return Class0086.aH.aQ;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public int f() {
      return 1;
   }
}
