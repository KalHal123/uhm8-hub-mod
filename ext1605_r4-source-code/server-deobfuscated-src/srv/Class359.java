package srv;

import java.util.Random;

public class Class359 extends Class371 {
   protected Class359(int var1, int var2) {
      super(var1, Class111.field_1178);
      this.field_1137 = var2;
      float var3 = 0.375F;
      this.method_177(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
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
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3 - 1, var4);
      return var5 == this.field_1379
         ? true
         : (
            var5 != Class371.field_1206.field_1379 && var5 != Class371.field_1082.field_1379
               ? false
               : (
                  var1.method_149(var2 - 1, var3 - 1, var4) == Class111.field_1394
                     ? true
                     : (
                        var1.method_149(var2 + 1, var3 - 1, var4) == Class111.field_1394
                           ? true
                           : (
                              var1.method_149(var2, var3 - 1, var4 - 1) == Class111.field_1394
                                 ? true
                                 : var1.method_149(var2, var3 - 1, var4 + 1) == Class111.field_1394
                           )
                     )
               )
         );
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      this.method_652(var1, var2, var3, var4);
   }

   protected final void method_652(Class317 var1, int var2, int var3, int var4) {
      if (!this.method_645(var1, var2, var3, var4)) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_645(Class317 var1, int var2, int var3, int var4) {
      return this.method_769(var1, var2, var3, var4);
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class350.field_1470.field_473;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public int method_225() {
      return 1;
   }
}
