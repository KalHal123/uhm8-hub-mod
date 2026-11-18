package x;

import java.util.Random;

public class Class0085 extends Class0312 {
   public static boolean a = false;

   public Class0085(int var1, int var2) {
      super(var1, var2, Class0155.m);
   }

   @Override
   public void e(Class0065 var1, int var2, int var3, int var4) {
      var1.h(var2, var3, var4, this.ba);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      var1.h(var2, var3, var4, this.ba);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   private void h(Class0065 var1, int var2, int var3, int var4) {
      int var5 = var2;
      int var6 = var3;
      int var7 = var4;
      if (a_(var1, var5, var6 - 1, var7) && var6 >= 0) {
         Class0133 var8 = new Class0133(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, this.ba);
         if (a) {
            while (!var8.ax) {
               var8.e_();
            }
         } else {
            var1.a(var8);
         }
      }
   }

   @Override
   public int a() {
      return 3;
   }

   public static boolean a_(Class0065 var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if (var4 == 0) {
         return true;
      }

      if (var4 == Class0312.ar.ba) {
         return true;
      }

      Class0155 var5 = Class0312.n[var4].bl;
      return var5 == Class0155.f ? true : var5 == Class0155.g;
   }
}
