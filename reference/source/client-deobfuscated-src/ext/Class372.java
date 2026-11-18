package ext;

import java.util.Random;

public class Class372 extends Class407 {
   private boolean field_887;

   public Class372(int var1, int var2, boolean var3) {
      super(var1, var2, Class160.field_68);
      if (var3) {
         this.method_1936(true);
      }

      this.field_887 = var3;
   }

   @Override
   public int method_1520() {
      return 30;
   }

   @Override
   public void method_1202(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      this.method_1814(var1, var2, var3, var4);
      super.method_1202(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1677(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      this.method_1814(var1, var2, var3, var4);
      super.method_1677(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_676(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      this.method_1814(var1, var2, var3, var4);
      return super.method_676(var1, var2, var3, var4, var5);
   }

   private void method_1814(Class454 var1, int var2, int var3, int var4) {
      this.method_60(var1, var2, var3, var4);
      if (this.field_19 == Class407.field_2144.field_19) {
         var1.method_1481(var2, var3, var4, Class407.field_2178.field_19);
      }
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_19 == Class407.field_2178.field_19) {
         var1.method_1481(var2, var3, var4, Class407.field_2144.field_19);
      }
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class755.field_1672.field_10;
   }

   @Override
   public int method_806(Random var1) {
      return 4 + var1.nextInt(2);
   }

   @Override
   public void method_453(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_887) {
         this.method_60(var1, var2, var3, var4);
      }
   }

   private void method_60(Class454 var1, int var2, int var3, int var4) {
      Random var5 = var1.field_2150;
      double var6 = 0.0625;

      for (int var8 = 0; var8 < 6; var8++) {
         double var9 = var2 + var5.nextFloat();
         double var11 = var3 + var5.nextFloat();
         double var13 = var4 + var5.nextFloat();
         if (var8 == 0 && !var1.method_768(var2, var3 + 1, var4)) {
            var11 = var3 + 1 + var6;
         }

         if (var8 == 1 && !var1.method_768(var2, var3 - 1, var4)) {
            var11 = var3 + 0 - var6;
         }

         if (var8 == 2 && !var1.method_768(var2, var3, var4 + 1)) {
            var13 = var4 + 1 + var6;
         }

         if (var8 == 3 && !var1.method_768(var2, var3, var4 - 1)) {
            var13 = var4 + 0 - var6;
         }

         if (var8 == 4 && !var1.method_768(var2 + 1, var3, var4)) {
            var9 = var2 + 1 + var6;
         }

         if (var8 == 5 && !var1.method_768(var2 - 1, var3, var4)) {
            var9 = var2 + 0 - var6;
         }

         if (var9 < var2 || var9 > var2 + 1 || var11 < 0.0 || var11 > var3 + 1 || var13 < var4 || var13 > var4 + 1) {
            var1.method_1347("reddust", var9, var11, var13, 0.0, 0.0, 0.0);
         }
      }
   }
}
