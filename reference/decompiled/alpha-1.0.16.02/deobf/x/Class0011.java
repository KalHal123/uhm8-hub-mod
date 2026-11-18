package x;

import java.util.List;
import java.util.Random;

public class Class0011 extends Class0312 {
   private Class0253 a;

   protected Class0011(int var1, int var2, Class0253 var3) {
      super(var1, var2, Class0155.d);
      this.a = var3;
      this.b(true);
      float var4 = 0.0625F;
      this.a(var4, 0.0F, var4, 1.0F - var4, 0.03125F, 1.0F - var4);
   }

   @Override
   public int a() {
      return 20;
   }

   @Override
   public Class0057 d(Class0065 var1, int var2, int var3, int var4) {
      return null;
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
   public boolean a(Class0065 var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4);
   }

   @Override
   public void e(Class0065 var1, int var2, int var3, int var4) {
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (!var1.g(var2, var3 - 1, var4)) {
         var6 = true;
      }

      if (var6) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (var1.e(var2, var3, var4) != 0) {
         this.h(var1, var2, var3, var4);
      }
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, Class0268 var5) {
      if (var1.e(var2, var3, var4) != 1) {
         this.h(var1, var2, var3, var4);
      }
   }

   private void h(Class0065 var1, int var2, int var3, int var4) {
      boolean var5 = var1.e(var2, var3, var4) == 1;
      boolean var6 = false;
      float var7 = 0.125F;
      List var8 = null;
      if (this.a == Class0253.a) {
         var8 = var1.b(null, Class0057.b(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (this.a == Class0253.b) {
         var8 = var1.a(Class0158.class, Class0057.b(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (this.a == Class0253.c) {
         var8 = var1.a(Class0089.class, Class0057.b(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (var8.size() > 0) {
         var6 = true;
      }

      if (var6 && !var5) {
         var1.b(var2, var3, var4, 1);
         var1.g(var2, var3, var4, this.ba);
         var1.g(var2, var3 - 1, var4, this.ba);
         var1.b(var2, var3, var4, var2, var3, var4);
         var1.a(var2 + 0.5, var3 + 0.1, var4 + 0.5, "random.click", 0.3F, 0.6F);
      }

      if (!var6 && var5) {
         var1.b(var2, var3, var4, 0);
         var1.g(var2, var3, var4, this.ba);
         var1.g(var2, var3 - 1, var4, this.ba);
         var1.b(var2, var3, var4, var2, var3, var4);
         var1.a(var2 + 0.5, var3 + 0.1, var4 + 0.5, "random.click", 0.3F, 0.5F);
      }

      if (var6) {
         var1.h(var2, var3, var4, this.ba);
      }
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if (var5 > 0) {
         var1.g(var2, var3, var4, this.ba);
         var1.g(var2, var3 - 1, var4, this.ba);
      }

      super.b(var1, var2, var3, var4);
   }

   @Override
   public void a(Class0351 var1, int var2, int var3, int var4) {
      boolean var5 = var1.e(var2, var3, var4) == 1;
      float var6 = 0.0625F;
      if (var5) {
         this.a(var6, 0.0F, var6, 1.0F - var6, 0.03125F, 1.0F - var6);
      } else {
         this.a(var6, 0.0F, var6, 1.0F - var6, 0.0625F, 1.0F - var6);
      }
   }

   @Override
   public boolean b(Class0351 var1, int var2, int var3, int var4, int var5) {
      return var1.e(var2, var3, var4) > 0;
   }

   @Override
   public boolean c(Class0065 var1, int var2, int var3, int var4, int var5) {
      return var1.e(var2, var3, var4) == 0 ? false : var5 == 1;
   }

   @Override
   public boolean d() {
      return true;
   }

   @Override
   public void e() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }
}
