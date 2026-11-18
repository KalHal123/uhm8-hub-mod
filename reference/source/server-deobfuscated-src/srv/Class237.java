package srv;

import java.util.Random;

public class Class237 extends Class371 {
   public static boolean field_876 = false;

   public Class237(int var1, int var2) {
      super(var1, var2, Class111.field_1357);
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      var1.method_809(var2, var3, var4, this.field_1379);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      var1.method_809(var2, var3, var4, this.field_1379);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      this.method_315(var1, var2, var3, var4);
   }

   private void method_315(Class317 var1, int var2, int var3, int var4) {
      if (method_865(var1, var2, var3 - 1, var4) && var3 >= 0) {
         Class129 var5 = new Class129(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, this.field_1379);
         if (field_876) {
            while (!var5.field_120) {
               var5.method_439();
            }
         } else {
            var1.method_237(var5);
         }
      }
   }

   @Override
   public int method_796() {
      return 3;
   }

   public static boolean method_865(Class317 var0, int var1, int var2, int var3) {
      int var4 = var0.method_813(var1, var2, var3);
      if (var4 == 0) {
         return true;
      }

      if (var4 == Class371.field_1424.field_1379) {
         return true;
      }

      Class111 var5 = Class371.field_57[var4].field_658;
      return var5 == Class111.field_1394 ? true : var5 == Class111.field_306;
   }
}
