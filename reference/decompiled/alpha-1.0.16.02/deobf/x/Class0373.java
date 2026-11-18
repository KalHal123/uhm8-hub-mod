package x;

import java.util.Random;

public class Class0373 extends Class0312 {
   private boolean a;

   public Class0373(int var1, boolean var2) {
      super(var1, 6, Class0155.d);
      this.a = var2;
      if (!var2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.d(255);
   }

   @Override
   public int a(int var1) {
      return var1 <= 1 ? 6 : 5;
   }

   @Override
   public boolean b() {
      return this.a;
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      if (this == Class0312.ak) {
         ;
      }
   }

   @Override
   public void e(Class0065 var1, int var2, int var3, int var4) {
      if (this != Class0312.ak) {
         super.e(var1, var2, var3, var4);
      }

      int var5 = var1.a(var2, var3 - 1, var4);
      if (var5 == ak.ba) {
         var1.d(var2, var3, var4, 0);
         var1.d(var2, var3 - 1, var4, Class0312.aj.ba);
      }
   }

   @Override
   public int a(int var1, Random var2) {
      return Class0312.ak.ba;
   }

   @Override
   public boolean c() {
      return this.a;
   }

   @Override
   public boolean c(Class0351 var1, int var2, int var3, int var4, int var5) {
      if (this != Class0312.ak) {
         super.c(var1, var2, var3, var4, var5);
      }

      if (var5 == 1) {
         return true;
      } else if (!super.c(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         return var5 == 0 ? true : var1.a(var2, var3, var4) != this.ba;
      }
   }
}
