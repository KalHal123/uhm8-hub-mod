package ext;

import java.util.Random;

public class Class234 extends Class108 {
   public Class234(int var1, int var2) {
      super(var1, var2, Class160.field_1787);
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      float var6 = 0.125F;
      switch (var5) {
         case 2:
            this.method_1618(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
            break;
         case 3:
            this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
            break;
         case 4:
            this.method_1618(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 5:
            this.method_1618(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
            break;
         case 6:
            this.method_1618(0.0F, 1.0F - var6, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 7:
            this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, var6, 1.0F);
      }

      return super.method_720(var1, var2, var3, var4);
   }

   @Override
   public Class630 method_366(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      float var6 = 0.125F;
      if (var5 == 2) {
         this.method_1618(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if (var5 == 3) {
         this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if (var5 == 4) {
         this.method_1618(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if (var5 == 5) {
         this.method_1618(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.method_366(var1, var2, var3, var4);
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public int method_1900() {
      return 8;
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2 - 1, var3, var4)
         ? true
         : (var1.method_768(var2 + 1, var3, var4) ? true : (var1.method_768(var2, var3, var4 - 1) ? true : var1.method_768(var2, var3, var4 + 1)));
   }

   @Override
   public void method_1886(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if ((var6 == 0 || var5 == 2) && var1.method_768(var2, var3, var4 + 1)) {
         var6 = 2;
      }

      if ((var6 == 0 || var5 == 3) && var1.method_768(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if ((var6 == 0 || var5 == 4) && var1.method_768(var2 + 1, var3, var4)) {
         var6 = 4;
      }

      if ((var6 == 0 || var5 == 5) && var1.method_768(var2 - 1, var3, var4)) {
         var6 = 5;
      }

      var1.method_518(var2, var3, var4, var6);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      boolean var7 = false;
      if (var6 == 2 && var1.method_768(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if (var6 == 3 && var1.method_768(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if (var6 == 4 && var1.method_768(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 5 && var1.method_768(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if (!var7) {
         this.method_625(var1, var2, var3, var4, var6);
         var1.method_1481(var2, var3, var4, 0);
      }

      super.method_1464(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_1257(Random var1) {
      return 1;
   }
}
