package x;

import java.util.Random;

public class Class0131 extends Class0312 {
   protected Class0131(int var1, int var2) {
      super(var1, var2, Class0155.s);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.b(true);
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
      return var1.f(var2, var3 - 1, var4).c();
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      this.h(var1, var2, var3, var4);
   }

   private boolean h(Class0065 var1, int var2, int var3, int var4) {
      if (!this.a(var1, var2, var3, var4)) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public void a_(Class0065 var1, int var2, int var3, int var4, int var5) {
      int var6 = Class0086.aB.aQ;
      float var7 = 0.7F;
      double var8 = var1.m.nextFloat() * var7 + (1.0F - var7) * 0.5;
      double var10 = var1.m.nextFloat() * var7 + (1.0F - var7) * 0.5;
      double var12 = var1.m.nextFloat() * var7 + (1.0F - var7) * 0.5;
      Class0100 var14 = new Class0100(var1, var2 + var8, var3 + var10, var4 + var12, new Class0124(var6));
      var14.c = 10;
      var1.a(var14);
      var1.d(var2, var3, var4, 0);
   }

   @Override
   public int a(int var1, Random var2) {
      return Class0086.aB.aQ;
   }

   @Override
   public int a(Random var1) {
      return 0;
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (var1.a(Class0049.b, var2, var3, var4) > 11) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean c(Class0351 var1, int var2, int var3, int var4, int var5) {
      Class0155 var6 = var1.f(var2, var3, var4);
      if (var5 == 1) {
         return true;
      } else {
         return var6 == this.bl ? false : super.c(var1, var2, var3, var4, var5);
      }
   }
}
