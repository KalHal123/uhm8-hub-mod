package x;

import java.util.Random;

public class Class0042 extends Class0312 {
   protected Class0042(int var1, int var2) {
      super(var1, var2, Class0155.n);
   }

   @Override
   public Class0057 d(Class0065 var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.125F;
      if (var5 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if (var5 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if (var5 == 4) {
         this.a(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if (var5 == 5) {
         this.a(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.d(var1, var2, var3, var4);
   }

   @Override
   public Class0057 f(Class0065 var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.125F;
      if (var5 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if (var5 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if (var5 == 4) {
         this.a(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if (var5 == 5) {
         this.a(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.f(var1, var2, var3, var4);
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
      return 8;
   }

   @Override
   public boolean a(Class0065 var1, int var2, int var3, int var4) {
      if (var1.g(var2 - 1, var3, var4)) {
         return true;
      } else if (var1.g(var2 + 1, var3, var4)) {
         return true;
      } else {
         return var1.g(var2, var3, var4 - 1) ? true : var1.g(var2, var3, var4 + 1);
      }
   }

   @Override
   public void d(Class0065 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if ((var6 == 0 || var5 == 2) && var1.g(var2, var3, var4 + 1)) {
         var6 = 2;
      }

      if ((var6 == 0 || var5 == 3) && var1.g(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if ((var6 == 0 || var5 == 4) && var1.g(var2 + 1, var3, var4)) {
         var6 = 4;
      }

      if ((var6 == 0 || var5 == 5) && var1.g(var2 - 1, var3, var4)) {
         var6 = 5;
      }

      var1.b(var2, var3, var4, var6);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = false;
      if (var6 == 2 && var1.g(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if (var6 == 3 && var1.g(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if (var6 == 4 && var1.g(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 5 && var1.g(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if (!var7) {
         this.b_(var1, var2, var3, var4, var6);
         var1.d(var2, var3, var4, 0);
      }

      super.a(var1, var2, var3, var4, var5);
   }

   @Override
   public int a(Random var1) {
      return 1;
   }
}
