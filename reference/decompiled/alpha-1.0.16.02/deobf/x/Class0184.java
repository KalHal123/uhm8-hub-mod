package x;

import java.util.Random;

public class Class0184 extends Class0130 {
   public Class0184(int var1, int var2) {
      super(var1, var2, Class0155.r, false);
      this.bm = 0.98F;
      this.b(true);
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public boolean c(Class0351 var1, int var2, int var3, int var4, int var5) {
      return super.c(var1, var2, var3, var4, 1 - var5);
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4) {
      Class0155 var5 = var1.f(var2, var3 - 1, var4);
      if (var5.c() || var5.d()) {
         var1.d(var2, var3, var4, Class0312.A.ba);
      }
   }

   @Override
   public int a(Random var1) {
      return 0;
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (var1.a(Class0049.b, var2, var3, var4) > 11 - Class0312.q[this.ba]) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, Class0312.B.ba);
      }
   }
}
