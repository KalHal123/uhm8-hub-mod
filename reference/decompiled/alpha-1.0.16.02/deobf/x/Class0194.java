package x;

import java.util.Random;

public class Class0194 extends Class0250 {
   protected Class0194(int var1, Class0155 var2) {
      super(var1, var2);
      this.b(false);
      if (var2 == Class0155.g) {
         this.b(true);
      }
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      if (var1.a(var2, var3, var4) == this.ba) {
         this.j(var1, var2, var3, var4);
      }
   }

   private void j(Class0065 var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      var1.h = true;
      var1.a(var2, var3, var4, this.ba - 1, var5);
      var1.b(var2, var3, var4, var2, var3, var4);
      var1.h(var2, var3, var4, this.ba - 1);
      var1.h = false;
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (this.bl == Class0155.g) {
         int var6 = var5.nextInt(3);

         for (int var7 = 0; var7 < var6; var7++) {
            var2 += var5.nextInt(3) - 1;
            var3++;
            var4 += var5.nextInt(3) - 1;
            int var8 = var1.a(var2, var3, var4);
            if (var8 == 0) {
               if (this.k(var1, var2 - 1, var3, var4)
                  || this.k(var1, var2 + 1, var3, var4)
                  || this.k(var1, var2, var3, var4 - 1)
                  || this.k(var1, var2, var3, var4 + 1)
                  || this.k(var1, var2, var3 - 1, var4)
                  || this.k(var1, var2, var3 + 1, var4)) {
                  var1.d(var2, var3, var4, Class0312.ar.ba);
                  return;
               }
            } else if (Class0312.n[var8].bl.c()) {
               return;
            }
         }
      }
   }

   private boolean k(Class0065 var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4).e();
   }
}
