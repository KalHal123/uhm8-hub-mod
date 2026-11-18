package x;

import java.util.ArrayList;
import java.util.Random;

public class Class0273 extends Class0312 {
   private Class0312 a;

   protected Class0273(int var1, Class0312 var2) {
      super(var1, var2.aZ, var2.bl);
      this.a = var2;
      this.c(var2.bb);
      this.b(var2.bc / 3.0F);
      this.a(var2.bj);
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
      return 10;
   }

   @Override
   public boolean c(Class0351 var1, int var2, int var3, int var4, int var5) {
      return super.c(var1, var2, var3, var4, var5);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Class0057 var5, ArrayList var6) {
      int var7 = var1.e(var2, var3, var4);
      if (var7 == 0) {
         this.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 1) {
         this.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      if (var1.f(var2, var3 + 1, var4).a()) {
         var1.d(var2, var3, var4, this.a.ba);
      } else {
         this.h(var1, var2, var3, var4);
         this.h(var1, var2 + 1, var3 - 1, var4);
         this.h(var1, var2 - 1, var3 - 1, var4);
         this.h(var1, var2, var3 - 1, var4 - 1);
         this.h(var1, var2, var3 - 1, var4 + 1);
         this.h(var1, var2 + 1, var3 + 1, var4);
         this.h(var1, var2 - 1, var3 + 1, var4);
         this.h(var1, var2, var3 + 1, var4 - 1);
         this.h(var1, var2, var3 + 1, var4 + 1);
      }

      this.a.a(var1, var2, var3, var4, var5);
   }

   private void h(Class0065 var1, int var2, int var3, int var4) {
      if (this.j(var1, var2, var3, var4)) {
         byte var5 = -1;
         if (this.j(var1, var2 + 1, var3 + 1, var4)) {
            var5 = 0;
         }

         if (this.j(var1, var2 - 1, var3 + 1, var4)) {
            var5 = 1;
         }

         if (this.j(var1, var2, var3 + 1, var4 + 1)) {
            var5 = 2;
         }

         if (this.j(var1, var2, var3 + 1, var4 - 1)) {
            var5 = 3;
         }

         if (var5 < 0) {
            if (this.i(var1, var2 + 1, var3, var4) && !this.i(var1, var2 - 1, var3, var4)) {
               var5 = 0;
            }

            if (this.i(var1, var2 - 1, var3, var4) && !this.i(var1, var2 + 1, var3, var4)) {
               var5 = 1;
            }

            if (this.i(var1, var2, var3, var4 + 1) && !this.i(var1, var2, var3, var4 - 1)) {
               var5 = 2;
            }

            if (this.i(var1, var2, var3, var4 - 1) && !this.i(var1, var2, var3, var4 + 1)) {
               var5 = 3;
            }
         }

         if (var5 < 0) {
            if (this.j(var1, var2 - 1, var3 - 1, var4)) {
               var5 = 0;
            }

            if (this.j(var1, var2 + 1, var3 - 1, var4)) {
               var5 = 1;
            }

            if (this.j(var1, var2, var3 - 1, var4 - 1)) {
               var5 = 2;
            }

            if (this.j(var1, var2, var3 - 1, var4 + 1)) {
               var5 = 3;
            }
         }

         if (var5 >= 0) {
            var1.b(var2, var3, var4, var5);
         }
      }
   }

   private boolean i(Class0065 var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4).a();
   }

   private boolean j(Class0065 var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0 ? false : Class0312.n[var5].f() == 10;
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, Random var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, Class0089 var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, int var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   @Override
   public float c(Class0351 var1, int var2, int var3, int var4) {
      return this.a.c(var1, var2, var3, var4);
   }

   @Override
   public float a(Class0268 var1) {
      return this.a.a(var1);
   }

   @Override
   public int g() {
      return this.a.g();
   }

   @Override
   public int a(int var1, Random var2) {
      return this.a.a(var1, var2);
   }

   @Override
   public int a(Random var1) {
      return this.a.a(var1);
   }

   @Override
   public int a(int var1, int var2) {
      return this.a.a(var1, var2);
   }

   @Override
   public int a(int var1) {
      return this.a.a(var1);
   }

   @Override
   public int a(Class0351 var1, int var2, int var3, int var4, int var5) {
      return this.a.a(var1, var2, var3, var4, var5);
   }

   @Override
   public int a() {
      return this.a.a();
   }

   @Override
   public Class0057 f(Class0065 var1, int var2, int var3, int var4) {
      return this.a.f(var1, var2, var3, var4);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Class0268 var5, Class0009 var6) {
      this.a.a(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean h() {
      return this.a.h();
   }

   @Override
   public boolean a(int var1, boolean var2) {
      return this.a.a(var1, var2);
   }

   @Override
   public boolean a(Class0065 var1, int var2, int var3, int var4) {
      return this.a.a(var1, var2, var3, var4);
   }

   @Override
   public void e(Class0065 var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 0);
      this.a.e(var1, var2, var3, var4);
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4) {
      this.a.b(var1, var2, var3, var4);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5, float var6) {
      this.a.a(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void b_(Class0065 var1, int var2, int var3, int var4, int var5) {
      this.a.b_(var1, var2, var3, var4, var5);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Class0268 var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean a(Class0065 var1, int var2, int var3, int var4, Class0089 var5) {
      return this.a.a(var1, var2, var3, var4, var5);
   }

   @Override
   public void c(Class0065 var1, int var2, int var3, int var4) {
      this.a.c(var1, var2, var3, var4);
   }
}
