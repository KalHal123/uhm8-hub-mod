package ext;

import java.util.Random;

public class Class688 extends Class108 {
   int field_2279 = 1;

   public Class688(int var1, int var2, int var3) {
      super(var1, var2, Class160.field_68);
      this.method_1646(true);
      this.field_2279 = 0;
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_636() {
      return true;
   }

   @Override
   public int method_1900() {
      return this.field_2279;
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return true;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      super.method_766(var1, var2, var3, var4, var5);
      if (var1.method_1110(var2, var3, var4) == 0) {
         this.method_1937(var1, var2, var3, var4);
      }
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class630.method_969(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1 - var5, var4 + 1 - var5);
   }

   @Override
   public Class630 method_366(Class454 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class630.method_969(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1, var4 + 1 - var5);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      if (this.method_740(var1, var2, var3, var4)) {
         int var6 = var1.method_1110(var2, var3, var4);
         boolean var7 = false;
         if (!var1.method_768(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if (!var1.method_768(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if (!var1.method_768(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if (!var1.method_768(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if (!var1.method_768(var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if (var7) {
            this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
            var1.method_1481(var2, var3, var4, 0);
         }
      }
   }

   private boolean method_740(Class454 var1, int var2, int var3, int var4) {
      if (!this.method_432(var1, var2, var3, var4)) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
   }

   @Override
   public void method_1220(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      if (!(var5 instanceof Class198)) {
         var5.method_308((Class359)null, 5);
         var5.field_1439 = 300;
      }
   }
}
