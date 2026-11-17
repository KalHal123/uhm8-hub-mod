package srv;

import java.util.Random;

public class Class50 extends Class371 {
   public Class50(int var1, int var2) {
      super(var1, var2, Class111.field_621);
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      float var6 = 0.125F;
      switch (var5) {
         case 2:
            this.method_177(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
            break;
         case 3:
            this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
            break;
         case 4:
            this.method_177(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 5:
            this.method_177(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
            break;
         case 6:
            this.method_177(0.0F, 1.0F - var6, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 7:
            this.method_177(0.0F, 0.0F, 0.0F, 1.0F, var6, 1.0F);
      }

      return super.method_872(var1, var2, var3, var4);
   }

   @Override
   public Class94 method_930(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      float var6 = 0.125F;
      switch (var5) {
         case 2:
            this.method_177(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
            break;
         case 3:
            this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
            break;
         case 4:
            this.method_177(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 5:
            this.method_177(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
            break;
         case 6:
            this.method_177(0.0F, 1.0F - var6, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 7:
            this.method_177(0.0F, 0.0F, 0.0F, 1.0F, var6, 1.0F);
      }

      return super.method_930(var1, var2, var3, var4);
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public boolean method_786() {
      return false;
   }

   @Override
   public int method_225() {
      return 8;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      if (var1.method_604(var2, var3 - 1, var4)) {
         return true;
      } else if (var1.method_604(var2, var3 + 1, var4)) {
         return true;
      } else if (var1.method_604(var2 - 1, var3, var4)) {
         return true;
      } else if (var1.method_604(var2 + 1, var3, var4)) {
         return true;
      } else {
         return var1.method_604(var2, var3, var4 - 1) ? true : var1.method_604(var2, var3, var4 + 1);
      }
   }

   @Override
   public void method_202(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_929(var2, var3, var4);
      if ((var6 == 0 || var5 == 2) && var1.method_604(var2, var3, var4 + 1)) {
         var6 = 2;
      } else if ((var6 == 0 || var5 == 3) && var1.method_604(var2, var3, var4 - 1)) {
         var6 = 3;
      } else if ((var6 == 0 || var5 == 4) && var1.method_604(var2 + 1, var3, var4)) {
         var6 = 4;
      } else if ((var6 == 0 || var5 == 5) && var1.method_604(var2 - 1, var3, var4)) {
         var6 = 5;
      } else if ((var6 == 0 || var5 == 6) && var1.method_604(var2, var3 + 1, var4)) {
         var6 = 6;
      } else if ((var6 == 0 || var5 == 7) && var1.method_604(var2, var3 - 1, var4)) {
         var6 = 7;
      }

      var1.method_489(var2, var3, var4, var6);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_929(var2, var3, var4);
      boolean var7 = false;
      if (var6 == 2 && var1.method_604(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if (var6 == 3 && var1.method_604(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if (var6 == 4 && var1.method_604(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 5 && var1.method_604(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 6 && var1.method_604(var2, var3 + 1, var4)) {
         var7 = true;
      }

      if (var6 == 7 && var1.method_604(var2, var3 - 1, var4)) {
         var7 = true;
      }

      if (!var7) {
         this.method_363(var1, var2, var3, var4, var6);
         var1.method_226(var2, var3, var4, 0);
      }

      super.method_721(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_757(Random var1) {
      return 1;
   }
}
