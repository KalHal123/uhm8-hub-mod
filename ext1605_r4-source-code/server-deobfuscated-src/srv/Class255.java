package srv;

import java.util.Random;

public class Class255 extends Class371 {
   protected Class255(int var1) {
      super(var1, Class111.field_384);
      this.field_1137 = 87;
      this.method_194(true);
      this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.method_1030(255);
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return Class94.method_27(var2 + 0, var3 + 0, var4 + 0, var2 + 1, var3 + 1, var4 + 1);
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(5) == 0) {
         if (this.method_763(var1, var2, var3, var4)) {
            var1.method_489(var2, var3, var4, 7);
         } else {
            int var6 = var1.method_929(var2, var3, var4);
            if (var6 > 0) {
               var1.method_489(var2, var3, var4, var6 - 1);
            } else if (!this.method_283(var1, var2, var3, var4)) {
               var1.method_226(var2, var3, var4, Class371.field_1082.field_1379);
            }
         }
      }
   }

   @Override
   public void method_220(Class317 var1, int var2, int var3, int var4, Class252 var5) {
      if (var1.field_413.nextInt(4) == 0) {
         var1.method_226(var2, var3, var4, Class371.field_1082.field_1379);
      }
   }

   private boolean method_283(Class317 var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var4 - var5; var7 <= var4 + var5; var7++) {
            if (var1.method_813(var6, var3 + 1, var7) == Class371.field_1510.field_1379) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method_763(Class317 var1, int var2, int var3, int var4) {
      for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
         for (int var6 = var3; var6 <= var3 + 1; var6++) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
               if (var1.method_149(var5, var6, var7) == Class111.field_1394) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      super.method_721(var1, var2, var3, var4, var5);
      Class111 var6 = var1.method_149(var2, var3 + 1, var4);
      if (var6.method_325()) {
         var1.method_226(var2, var3, var4, Class371.field_1082.field_1379);
      }
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class371.field_1082.method_852(0, var2);
   }
}
