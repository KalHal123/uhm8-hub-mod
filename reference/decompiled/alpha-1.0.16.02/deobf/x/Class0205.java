package x;

import java.util.Random;

public class Class0205 extends Class0312 {
   protected Class0205(int var1, int var2) {
      super(var1, var2, Class0155.u);
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
   public Class0057 d(Class0065 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class0057.b(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1 - var5, var4 + 1 - var5);
   }

   @Override
   public Class0057 f(Class0065 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class0057.b(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1, var4 + 1 - var5);
   }

   @Override
   public int a(int var1) {
      if (var1 == 1) {
         return this.aZ - 1;
      } else {
         return var1 == 0 ? this.aZ + 1 : this.aZ;
      }
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public int f() {
      return 13;
   }

   @Override
   public boolean a(Class0065 var1, int var2, int var3, int var4) {
      return !super.a(var1, var2, var3, var4) ? false : this.g(var1, var2, var3, var4);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      if (!this.g(var1, var2, var3, var4)) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean g(Class0065 var1, int var2, int var3, int var4) {
      if (var1.f(var2 - 1, var3, var4).a()) {
         return false;
      }

      if (var1.f(var2 + 1, var3, var4).a()) {
         return false;
      }

      if (var1.f(var2, var3, var4 - 1).a()) {
         return false;
      }

      if (var1.f(var2, var3, var4 + 1).a()) {
         return false;
      }

      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 == Class0312.aV.ba || var5 == Class0312.E.ba;
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, Class0268 var5) {
      var5.a(null, 1);
   }
}
