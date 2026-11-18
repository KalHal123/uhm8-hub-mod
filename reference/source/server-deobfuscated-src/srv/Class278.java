package srv;

import java.util.Random;

public class Class278 extends Class226 {
   private int field_514;
   private int field_1056 = 0;

   public Class278(int var1, int var2) {
      super(var1, var2, Class111.field_1567, false);
      this.field_514 = var2;
      this.method_194(true);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      this.field_1056 = 0;
      this.method_291(var1, var2, var3, var4);
      super.method_721(var1, var2, var3, var4, var5);
   }

   public void method_790(Class317 var1, int var2, int var3, int var4, int var5) {
      if (var1.method_813(var2, var3, var4) == this.field_1379) {
         int var6 = var1.method_929(var2, var3, var4);
         if (var6 != 0 && var6 == var5 - 1) {
            this.method_291(var1, var2, var3, var4);
         }
      }
   }

   public void method_291(Class317 var1, int var2, int var3, int var4) {
      if (this.field_1056++ < 100) {
         int var5 = var1.method_149(var2, var3 - 1, var4).method_325() ? 16 : 0;
         int var6 = var1.method_929(var2, var3, var4);
         if (var6 == 0) {
            var6 = 1;
            var1.method_489(var2, var3, var4, 1);
         }

         var5 = this.method_539(var1, var2, var3 - 1, var4, var5);
         var5 = this.method_539(var1, var2, var3, var4 - 1, var5);
         var5 = this.method_539(var1, var2, var3, var4 + 1, var5);
         var5 = this.method_539(var1, var2 - 1, var3, var4, var5);
         var5 = this.method_539(var1, var2 + 1, var3, var4, var5);
         int var7 = var5 - 1;
         if (var7 < 10) {
            var7 = 1;
         }

         if (var7 != var6) {
            var1.method_489(var2, var3, var4, var7);
            this.method_790(var1, var2, var3 - 1, var4, var6);
            this.method_790(var1, var2, var3 + 1, var4, var6);
            this.method_790(var1, var2, var3, var4 - 1, var6);
            this.method_790(var1, var2, var3, var4 + 1, var6);
            this.method_790(var1, var2 - 1, var3, var4, var6);
            this.method_790(var1, var2 + 1, var3, var4, var6);
         }
      }
   }

   private int method_539(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_813(var2, var3, var4);
      if (var6 == Class371.field_158.field_1379) {
         return 16;
      }

      if (var6 == this.field_1379) {
         int var7 = var1.method_929(var2, var3, var4);
         if (var7 != 0 && var7 > var5) {
            return var7;
         }
      }

      return var5;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.method_929(var2, var3, var4);
      if (var6 == 0) {
         this.field_1056 = 0;
         this.method_291(var1, var2, var3, var4);
      } else if (var6 == 1) {
         this.method_132(var1, var2, var3, var4);
      } else if (var5.nextInt(10) == 0) {
         this.method_291(var1, var2, var3, var4);
      }
   }

   private void method_132(Class317 var1, int var2, int var3, int var4) {
      this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
      var1.method_226(var2, var3, var4, 0);
   }

   @Override
   public int method_757(Random var1) {
      return var1.nextInt(20) == 0 ? 1 : 0;
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class371.field_330.field_1379;
   }

   @Override
   public boolean method_491() {
      return !this.field_609;
   }

   @Override
   public void method_220(Class317 var1, int var2, int var3, int var4, Class252 var5) {
      super.method_220(var1, var2, var3, var4, var5);
   }
}
