package srv;

import java.util.Random;

public abstract class Class195 extends Class371 {
   protected int field_482 = 1;

   protected Class195(int var1, Class111 var2) {
      super(var1, (var2 == Class111.field_306 ? 14 : 12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      if (var2 == Class111.field_306) {
         this.field_482 = 2;
      }

      this.method_177(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.method_194(true);
   }

   public static float method_230(int var0) {
      if (var0 >= 8) {
         var0 = 0;
      }

      return (var0 + 1) / 9.0F;
   }

   @Override
   public int method_310(int var1) {
      return var1 != 0 && var1 != 1 ? this.field_1137 + 1 : this.field_1137;
   }

   protected int method_144(Class317 var1, int var2, int var3, int var4) {
      return var1.method_149(var2, var3, var4) != this.field_658 ? -1 : var1.method_929(var2, var3, var4);
   }

   protected int method_938(Interface351 var1, int var2, int var3, int var4) {
      if (var1.method_149(var2, var3, var4) != this.field_658) {
         return -1;
      }

      int var5 = var1.method_929(var2, var3, var4);
      if (var5 >= 8) {
         var5 = 0;
      }

      return var5;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public boolean method_573(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   @Override
   public boolean method_212(Interface351 var1, int var2, int var3, int var4, int var5) {
      Class111 var6 = var1.method_149(var2, var3, var4);
      return var6 == this.field_658 ? false : (var6 == Class111.field_504 ? false : (var5 == 1 ? true : super.method_212(var1, var2, var3, var4, var5)));
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int method_225() {
      return 4;
   }

   @Override
   public int method_852(int var1, Random var2) {
      return 0;
   }

   @Override
   public int method_757(Random var1) {
      return 0;
   }

   private Class47 method_356(Interface351 var1, int var2, int var3, int var4) {
      Class47 var5 = Class47.method_875(0.0, 0.0, 0.0);
      int var6 = this.method_938(var1, var2, var3, var4);

      for (int var7 = 0; var7 < 4; var7++) {
         int var8 = var2;
         int var9 = var4;
         if (var7 == 0) {
            var8 = var2 - 1;
         }

         if (var7 == 1) {
            var9 = var4 - 1;
         }

         if (var7 == 2) {
            var8++;
         }

         if (var7 == 3) {
            var9++;
         }

         int var10 = this.method_938(var1, var8, var3, var9);
         if (var10 < 0) {
            if (!var1.method_149(var8, var3, var9).method_330()) {
               var10 = this.method_938(var1, var8, var3 - 1, var9);
               if (var10 >= 0) {
                  int var11 = var10 - (var6 - 8);
                  var5 = var5.method_203((var8 - var2) * var11, (var3 - var3) * var11, (var9 - var4) * var11);
               }
            }
         } else if (var10 >= 0) {
            int var14 = var10 - var6;
            var5 = var5.method_203((var8 - var2) * var14, (var3 - var3) * var14, (var9 - var4) * var14);
         }
      }

      if (var1.method_929(var2, var3, var4) >= 8) {
         boolean var12 = false;
         if (var12 || this.method_212(var1, var2, var3, var4 - 1, 2)) {
            var12 = true;
         }

         if (var12 || this.method_212(var1, var2, var3, var4 + 1, 3)) {
            var12 = true;
         }

         if (var12 || this.method_212(var1, var2 - 1, var3, var4, 4)) {
            var12 = true;
         }

         if (var12 || this.method_212(var1, var2 + 1, var3, var4, 5)) {
            var12 = true;
         }

         if (var12 || this.method_212(var1, var2, var3 + 1, var4 - 1, 2)) {
            var12 = true;
         }

         if (var12 || this.method_212(var1, var2, var3 + 1, var4 + 1, 3)) {
            var12 = true;
         }

         if (var12 || this.method_212(var1, var2 - 1, var3 + 1, var4, 4)) {
            var12 = true;
         }

         if (var12 || this.method_212(var1, var2 + 1, var3 + 1, var4, 5)) {
            var12 = true;
         }

         if (var12) {
            var5 = var5.method_37().method_203(0.0, -6.0, 0.0);
         }
      }

      return var5.method_37();
   }

   @Override
   public void method_536(Class317 var1, int var2, int var3, int var4, Class252 var5, Class47 var6) {
      Class47 var7 = this.method_356(var1, var2, var3, var4);
      var6.field_13 = var6.field_13 + var7.field_13;
      var6.field_173 = var6.field_173 + var7.field_173;
      var6.field_510 = var6.field_510 + var7.field_510;
   }

   @Override
   public int method_796() {
      return this.field_658 == Class111.field_1394 ? 5 : (this.field_658 == Class111.field_306 ? 30 : 0);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      super.method_373(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      this.method_105(var1, var2, var3, var4);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      this.method_105(var1, var2, var3, var4);
   }

   private void method_105(Class317 var1, int var2, int var3, int var4) {
      if (var1.method_813(var2, var3, var4) == this.field_1379 && this.field_658 == Class111.field_306) {
         boolean var5 = false;
         if (var5 || var1.method_149(var2, var3, var4 - 1) == Class111.field_1394) {
            var5 = true;
         }

         if (var5 || var1.method_149(var2, var3, var4 + 1) == Class111.field_1394) {
            var5 = true;
         }

         if (var5 || var1.method_149(var2 - 1, var3, var4) == Class111.field_1394) {
            var5 = true;
         }

         if (var5 || var1.method_149(var2 + 1, var3, var4) == Class111.field_1394) {
            var5 = true;
         }

         if (var5 || var1.method_149(var2, var3 + 1, var4) == Class111.field_1394) {
            var5 = true;
         }

         if (var5) {
            int var6 = var1.method_929(var2, var3, var4);
            if (var6 == 0) {
               var1.method_226(var2, var3, var4, Class371.field_274.field_1379);
            } else if (var6 <= 4) {
               var1.method_226(var2, var3, var4, Class371.field_319.field_1379);
            }

            this.method_627(var1, var2, var3, var4);
         }
      }
   }

   protected void method_627(Class317 var1, int var2, int var3, int var4) {
      var1.method_621(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "random.fizz", 0.5F, 2.6F + (var1.field_413.nextFloat() - var1.field_413.nextFloat()) * 0.8F);

      for (int var5 = 0; var5 < 8; var5++) {
         var1.method_140("largesmoke", var2 + Math.random(), var3 + 1.2, var4 + Math.random(), 0.0, 0.0, 0.0);
      }
   }
}
