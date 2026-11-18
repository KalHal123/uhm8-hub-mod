package srv;

import java.util.Random;

public class Class262 extends Class371 {
   private int[] field_518 = new int[256];
   private int[] field_656 = new int[256];

   protected Class262(int var1, int var2) {
      super(var1, var2, Class111.field_1297);
      this.method_221(Class371.field_1031.field_1379, 5, 20);
      this.method_221(Class371.field_158.field_1379, 5, 5);
      this.method_221(Class371.field_831.field_1379, 30, 60);
      this.method_221(Class371.field_135.field_1379, 30, 20);
      this.method_221(Class371.field_1589.field_1379, 15, 100);
      this.method_221(Class371.field_1113.field_1379, 30, 60);
      this.method_194(true);
   }

   private void method_221(int var1, int var2, int var3) {
      this.field_518[var1] = var2;
      this.field_656[var1] = var3;
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public int method_225() {
      return 3;
   }

   @Override
   public int method_757(Random var1) {
      return 0;
   }

   @Override
   public int method_796() {
      return 10;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.method_929(var2, var3, var4);
      if (var6 < 15) {
         var1.method_489(var2, var3, var4, var6 + 1);
         var1.method_809(var2, var3, var4, this.field_1379);
      }

      if (!this.method_438(var1, var2, var3, var4)) {
         if (!var1.method_604(var2, var3 - 1, var4) || var6 > 3) {
            var1.method_226(var2, var3, var4, 0);
         }
      } else if (!this.method_320(var1, var2, var3 - 1, var4) && var6 == 15 && var5.nextInt(4) == 0) {
         var1.method_226(var2, var3, var4, 0);
      } else if (var6 % 2 == 0 && var6 > 2) {
         this.method_880(var1, var2 + 1, var3, var4, 300, var5);
         this.method_880(var1, var2 - 1, var3, var4, 300, var5);
         this.method_880(var1, var2, var3 - 1, var4, 200, var5);
         this.method_880(var1, var2, var3 + 1, var4, 250, var5);
         this.method_880(var1, var2, var3, var4 - 1, 300, var5);
         this.method_880(var1, var2, var3, var4 + 1, 300, var5);

         for (int var7 = var2 - 1; var7 <= var2 + 1; var7++) {
            for (int var8 = var4 - 1; var8 <= var4 + 1; var8++) {
               for (int var9 = var3 - 1; var9 <= var3 + 4; var9++) {
                  if (var7 != var2 || var9 != var3 || var8 != var4) {
                     int var10 = 100;
                     if (var9 > var3 + 1) {
                        var10 += (var9 - (var3 + 1)) * 100;
                     }

                     int var11 = this.method_948(var1, var7, var9, var8);
                     if (var11 > 0 && var5.nextInt(var10) <= var11) {
                        var1.method_226(var7, var9, var8, this.field_1379);
                     }
                  }
               }
            }
         }
      }
   }

   private void method_880(Class317 var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = this.field_656[var1.method_813(var2, var3, var4)];
      if (var6.nextInt(var5) < var7) {
         boolean var8 = var1.method_813(var2, var3, var4) == Class371.field_1589.field_1379;
         if (var6.nextInt(2) == 0) {
            var1.method_226(var2, var3, var4, this.field_1379);
         } else {
            var1.method_226(var2, var3, var4, 0);
         }

         if (var8) {
            Class371.field_1589.method_43(var1, var2, var3, var4, 0);
         }
      }
   }

   private boolean method_438(Class317 var1, int var2, int var3, int var4) {
      return this.method_320(var1, var2 + 1, var3, var4)
         ? true
         : (
            this.method_320(var1, var2 - 1, var3, var4)
               ? true
               : (
                  this.method_320(var1, var2, var3 - 1, var4)
                     ? true
                     : (
                        this.method_320(var1, var2, var3 + 1, var4)
                           ? true
                           : (this.method_320(var1, var2, var3, var4 - 1) ? true : this.method_320(var1, var2, var3, var4 + 1))
                     )
               )
         );
   }

   private int method_948(Class317 var1, int var2, int var3, int var4) {
      byte var5 = 0;
      if (var1.method_813(var2, var3, var4) != 0) {
         return 0;
      }

      int var6 = this.method_746(var1, var2 + 1, var3, var4, var5);
      var6 = this.method_746(var1, var2 - 1, var3, var4, var6);
      var6 = this.method_746(var1, var2, var3 - 1, var4, var6);
      var6 = this.method_746(var1, var2, var3 + 1, var4, var6);
      var6 = this.method_746(var1, var2, var3, var4 - 1, var6);
      return this.method_746(var1, var2, var3, var4 + 1, var6);
   }

   @Override
   public boolean method_138() {
      return false;
   }

   public boolean method_320(Interface351 var1, int var2, int var3, int var4) {
      return this.field_518[var1.method_813(var2, var3, var4)] > 0;
   }

   public int method_746(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.field_518[var1.method_813(var2, var3, var4)];
      return var6 > var5 ? var6 : var5;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return var1.method_604(var2, var3 - 1, var4) || this.method_438(var1, var2, var3, var4);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      if (!var1.method_604(var2, var3 - 1, var4) && !this.method_438(var1, var2, var3, var4)) {
         var1.method_226(var2, var3, var4, 0);
      }
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      if (!var1.method_604(var2, var3 - 1, var4) && !this.method_438(var1, var2, var3, var4)) {
         var1.method_226(var2, var3, var4, 0);
      } else {
         var1.method_809(var2, var3, var4, this.field_1379);
      }
   }
}
