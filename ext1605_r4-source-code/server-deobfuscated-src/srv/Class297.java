package srv;

import java.util.Random;

public class Class297 extends Class371 {
   protected Class297(int var1, int var2) {
      super(var1, var2, Class111.field_1050);
      this.method_194(true);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_813(var2, var3 + 1, var4) == 0) {
         int var6 = 1;

         while (var1.method_813(var2, var3 - var6, var4) == this.field_1379) {
            var6++;
         }

         if (var6 < 3) {
            int var7 = var1.method_929(var2, var3, var4);
            if (var7 == 15) {
               var1.method_226(var2, var3 + 1, var4, this.field_1379);
               var1.method_489(var2, var3, var4, 0);
            } else {
               var1.method_489(var2, var3, var4, var7 + 1);
            }
         }
      }
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class94.method_27(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1 - var5, var4 + 1 - var5);
   }

   @Override
   public int method_310(int var1) {
      return var1 == 1 ? this.field_1137 - 1 : (var1 == 0 ? this.field_1137 + 1 : this.field_1137);
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public int method_225() {
      return 13;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return !super.method_769(var1, var2, var3, var4) ? false : this.method_645(var1, var2, var3, var4);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      if (!this.method_645(var1, var2, var3, var4)) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_645(Class317 var1, int var2, int var3, int var4) {
      if (var1.method_149(var2 - 1, var3, var4).method_325()) {
         return false;
      }

      if (var1.method_149(var2 + 1, var3, var4).method_325()) {
         return false;
      }

      if (var1.method_149(var2, var3, var4 - 1).method_325()) {
         return false;
      }

      if (var1.method_149(var2, var3, var4 + 1).method_325()) {
         return false;
      }

      int var5 = var1.method_813(var2, var3 - 1, var4);
      return var5 == Class371.field_314.field_1379 || var5 == Class371.field_378.field_1379;
   }

   @Override
   public void method_762(Class317 var1, int var2, int var3, int var4, Class252 var5) {
      var5.method_671((Class252)null, 1);
   }
}
