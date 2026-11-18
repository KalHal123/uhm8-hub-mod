package srv;

import java.util.Random;

public class Class82 extends Class371 {
   int field_1545 = 1;

   public Class82(int var1, int var2, int var3) {
      super(var1, var2, Class111.field_1043);
      this.method_194(true);
      this.field_1545 = 0;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public boolean method_786() {
      return true;
   }

   @Override
   public int method_225() {
      return this.field_1545;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return true;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      super.method_373(var1, var2, var3, var4, var5);
      if (var1.method_929(var2, var3, var4) == 0) {
         this.method_1013(var1, var2, var3, var4);
      }
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class94.method_27(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1 - var5, var4 + 1 - var5);
   }

   @Override
   public Class94 method_930(Class317 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class94.method_27(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1, var4 + 1 - var5);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      if (this.method_808(var1, var2, var3, var4)) {
         int var6 = var1.method_929(var2, var3, var4);
         boolean var7 = false;
         if (!var1.method_604(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if (!var1.method_604(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if (!var1.method_604(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if (!var1.method_604(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if (!var1.method_604(var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if (var7) {
            this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
            var1.method_226(var2, var3, var4, 0);
         }
      }
   }

   private boolean method_808(Class317 var1, int var2, int var3, int var4) {
      if (!this.method_769(var1, var2, var3, var4)) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_496(Class317 var1, int var2, int var3, int var4, Random var5) {
   }

   @Override
   public void method_762(Class317 var1, int var2, int var3, int var4, Class252 var5) {
      if (!(var5 instanceof Class39)) {
         var5.method_671((Class252)null, 5);
         var5.field_1034 = 300;
      }
   }
}
