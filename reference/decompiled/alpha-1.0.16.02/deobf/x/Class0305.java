package x;

import java.util.Random;

public class Class0305 extends Class0255 {
   private Class a;
   private boolean b;

   protected Class0305(int var1, Class var2, boolean var3) {
      super(var1, Class0155.c);
      this.b = var3;
      this.aZ = 4;
      this.a = var2;
      float var4 = 0.25F;
      float var5 = 1.0F;
      this.a(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var5, 0.5F + var4);
   }

   @Override
   public Class0057 d(Class0065 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public Class0057 f(Class0065 var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
      return super.f(var1, var2, var3, var4);
   }

   @Override
   public void a(Class0351 var1, int var2, int var3, int var4) {
      if (!this.b) {
         int var5 = var1.e(var2, var3, var4);
         float var6 = 0.28125F;
         float var7 = 0.78125F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         float var10 = 0.125F;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if (var5 == 2) {
            this.a(var8, var6, 1.0F - var10, var9, var7, 1.0F);
         }

         if (var5 == 3) {
            this.a(var8, var6, 0.0F, var9, var7, var10);
         }

         if (var5 == 4) {
            this.a(1.0F - var10, var6, var8, 1.0F, var7, var9);
         }

         if (var5 == 5) {
            this.a(0.0F, var6, var8, var10, var7, var9);
         }
      }
   }

   @Override
   public int f() {
      return -1;
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
   protected Class0210 a_() {
      try {
         return (Class0210)this.a.newInstance();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   @Override
   public int a(int var1, Random var2) {
      return Class0086.as.aQ;
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (this.b) {
         if (!var1.f(var2, var3 - 1, var4).a()) {
            var6 = true;
         }
      } else {
         int var7 = var1.e(var2, var3, var4);
         var6 = true;
         if (var7 == 2 && var1.f(var2, var3, var4 + 1).a()) {
            var6 = false;
         }

         if (var7 == 3 && var1.f(var2, var3, var4 - 1).a()) {
            var6 = false;
         }

         if (var7 == 4 && var1.f(var2 + 1, var3, var4).a()) {
            var6 = false;
         }

         if (var7 == 5 && var1.f(var2 - 1, var3, var4).a()) {
            var6 = false;
         }
      }

      if (var6) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

      super.a(var1, var2, var3, var4, var5);
   }
}
