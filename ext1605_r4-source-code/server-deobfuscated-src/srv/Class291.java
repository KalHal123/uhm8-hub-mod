package srv;

import java.util.Random;

public class Class291 extends Class195 {
   protected Class291(int var1, Class111 var2) {
      super(var1, var2);
      this.method_194(false);
      if (var2 == Class111.field_306) {
         this.method_194(true);
      }
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      super.method_721(var1, var2, var3, var4, var5);
      if (var1.method_813(var2, var3, var4) == this.field_1379) {
         this.i(var1, var2, var3, var4);
      }
   }

   private void i(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      var1.field_565 = true;
      var1.method_662(var2, var3, var4, this.field_1379 - 1, var5);
      var1.method_674(var2, var3, var4, var2, var3, var4);
      var1.method_809(var2, var3, var4, this.field_1379 - 1);
      var1.field_565 = false;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_658 == Class111.field_306) {
         int var6 = var5.nextInt(3);

         for (int var7 = 0; var7 < var6; var7++) {
            var2 += var5.nextInt(3) - 1;
            var3++;
            var4 += var5.nextInt(3) - 1;
            int var8 = var1.method_813(var2, var3, var4);
            if (var8 == 0) {
               if (this.method_247(var1, var2 - 1, var3, var4)
                  || this.method_247(var1, var2 + 1, var3, var4)
                  || this.method_247(var1, var2, var3, var4 - 1)
                  || this.method_247(var1, var2, var3, var4 + 1)
                  || this.method_247(var1, var2, var3 - 1, var4)
                  || this.method_247(var1, var2, var3 + 1, var4)) {
                  var1.method_226(var2, var3, var4, Class371.field_1424.field_1379);
                  return;
               }
            } else if (Class371.field_57[var8].field_658.method_330()) {
               return;
            }
         }
      }
   }

   private boolean method_247(Class317 var1, int var2, int var3, int var4) {
      return var1.method_149(var2, var3, var4).method_788();
   }
}
