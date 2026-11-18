package srv;

import java.util.Random;

public class Class23 extends Class371 {
   protected Class23(int var1, int var2) {
      super(var1, var2, Class111.field_621);
      this.method_194(true);
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
      return 2;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return var1.method_604(var2 - 1, var3, var4)
         ? true
         : (
            var1.method_604(var2 + 1, var3, var4)
               ? true
               : (var1.method_604(var2, var3, var4 - 1) ? true : (var1.method_604(var2, var3, var4 + 1) ? true : var1.method_604(var2, var3 - 1, var4)))
         );
   }

   @Override
   public void method_202(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_929(var2, var3, var4);
      if (var5 == 1 && var1.method_604(var2, var3 - 1, var4)) {
         var6 = 5;
      }

      if (var5 == 2 && var1.method_604(var2, var3, var4 + 1)) {
         var6 = 4;
      }

      if (var5 == 3 && var1.method_604(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if (var5 == 4 && var1.method_604(var2 + 1, var3, var4)) {
         var6 = 2;
      }

      if (var5 == 5 && var1.method_604(var2 - 1, var3, var4)) {
         var6 = 1;
      }

      var1.method_489(var2, var3, var4, var6);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      super.method_373(var1, var2, var3, var4, var5);
      if (var1.method_929(var2, var3, var4) == 0) {
         this.method_1013(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      if (var1.method_604(var2 - 1, var3, var4)) {
         var1.method_489(var2, var3, var4, 1);
      } else if (var1.method_604(var2 + 1, var3, var4)) {
         var1.method_489(var2, var3, var4, 2);
      } else if (var1.method_604(var2, var3, var4 - 1)) {
         var1.method_489(var2, var3, var4, 3);
      } else if (var1.method_604(var2, var3, var4 + 1)) {
         var1.method_489(var2, var3, var4, 4);
      } else if (var1.method_604(var2, var3 - 1, var4)) {
         var1.method_489(var2, var3, var4, 5);
      }

      this.method_222(var1, var2, var3, var4);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      if (this.method_222(var1, var2, var3, var4)) {
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

   private boolean method_222(Class317 var1, int var2, int var3, int var4) {
      if (!this.method_769(var1, var2, var3, var4)) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public Class3 method_393(Class317 var1, int var2, int var3, int var4, Class47 var5, Class47 var6) {
      int var7 = var1.method_929(var2, var3, var4) & 7;
      float var8 = 0.15F;
      if (var7 == 1) {
         this.method_177(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if (var7 == 2) {
         this.method_177(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if (var7 == 3) {
         this.method_177(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if (var7 == 4) {
         this.method_177(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.method_177(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.method_393(var1, var2, var3, var4, var5, var6);
   }
}
