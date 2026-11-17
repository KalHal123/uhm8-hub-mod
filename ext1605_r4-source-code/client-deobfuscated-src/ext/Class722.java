package ext;

import java.util.Random;

public abstract class Class722 extends Class108 {
   protected int field_2217 = 1;

   protected Class722(int var1, Class160 var2) {
      super(var1, (var2 == Class160.field_3120 ? 14 : 12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      if (var2 == Class160.field_3120) {
         this.field_2217 = 2;
      }

      this.method_1618(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.method_1646(true);
   }

   public static float method_74(int var0) {
      if (var0 >= 8) {
         var0 = 0;
      }

      return (var0 + 1) / 9.0F;
   }

   @Override
   public int method_1735(int var1) {
      return var1 != 0 && var1 != 1 ? this.field_2972 + 1 : this.field_2972;
   }

   protected int method_551(Class454 var1, int var2, int var3, int var4) {
      return var1.method_1286(var2, var3, var4) != this.field_1854 ? -1 : var1.method_1110(var2, var3, var4);
   }

   protected int method_1934(Interface698 var1, int var2, int var3, int var4) {
      if (var1.method_1286(var2, var3, var4) != this.field_1854) {
         return -1;
      }

      int var5 = var1.method_1110(var2, var3, var4);
      if (var5 >= 8) {
         var5 = 0;
      }

      return var5;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_1380(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   @Override
   public boolean method_991(Interface698 var1, int var2, int var3, int var4, int var5) {
      Class160 var6 = var1.method_1286(var2, var3, var4);
      return var6 == this.field_1854 ? false : (var6 == Class160.field_1644 ? false : (var5 == 1 ? true : super.method_991(var1, var2, var3, var4, var5)));
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int method_1900() {
      return 4;
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return 0;
   }

   @Override
   public int method_1257(Random var1) {
      return 0;
   }

   private Class214 method_897(Interface698 var1, int var2, int var3, int var4) {
      Class214 var5 = Class214.method_701(0.0, 0.0, 0.0);
      int var6 = this.method_1934(var1, var2, var3, var4);

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

         int var10 = this.method_1934(var1, var8, var3, var9);
         if (var10 < 0) {
            if (!var1.method_1286(var8, var3, var9).method_1552()) {
               var10 = this.method_1934(var1, var8, var3 - 1, var9);
               if (var10 >= 0) {
                  int var11 = var10 - (var6 - 8);
                  var5 = var5.method_1750((var8 - var2) * var11, (var3 - var3) * var11, (var9 - var4) * var11);
               }
            }
         } else if (var10 >= 0) {
            int var14 = var10 - var6;
            var5 = var5.method_1750((var8 - var2) * var14, (var3 - var3) * var14, (var9 - var4) * var14);
         }
      }

      if (var1.method_1110(var2, var3, var4) >= 8) {
         boolean var12 = false;
         if (var12 || this.method_991(var1, var2, var3, var4 - 1, 2)) {
            var12 = true;
         }

         if (var12 || this.method_991(var1, var2, var3, var4 + 1, 3)) {
            var12 = true;
         }

         if (var12 || this.method_991(var1, var2 - 1, var3, var4, 4)) {
            var12 = true;
         }

         if (var12 || this.method_991(var1, var2 + 1, var3, var4, 5)) {
            var12 = true;
         }

         if (var12 || this.method_991(var1, var2, var3 + 1, var4 - 1, 2)) {
            var12 = true;
         }

         if (var12 || this.method_991(var1, var2, var3 + 1, var4 + 1, 3)) {
            var12 = true;
         }

         if (var12 || this.method_991(var1, var2 - 1, var3 + 1, var4, 4)) {
            var12 = true;
         }

         if (var12 || this.method_991(var1, var2 + 1, var3 + 1, var4, 5)) {
            var12 = true;
         }

         if (var12) {
            var5 = var5.method_341().method_1750(0.0, -6.0, 0.0);
         }
      }

      return var5.method_341();
   }

   @Override
   public void method_1332(Class454 var1, int var2, int var3, int var4, Class359 var5, Class214 var6) {
      Class214 var7 = this.method_897(var1, var2, var3, var4);
      var6.field_882 = var6.field_882 + var7.field_882;
      var6.field_1911 = var6.field_1911 + var7.field_1911;
      var6.field_3045 = var6.field_3045 + var7.field_3045;
   }

   @Override
   public int method_1427() {
      return this.field_1854 == Class160.field_1413 ? 5 : (this.field_1854 == Class160.field_3120 ? 30 : 0);
   }

   @Override
   public float method_876(Interface698 var1, int var2, int var3, int var4) {
      float var5 = var1.method_1154(var2, var3, var4);
      float var6 = var1.method_1154(var2, var3 + 1, var4);
      return var5 > var6 ? var5 : var6;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      super.method_766(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_287() {
      return this.field_1854 == Class160.field_1413 ? 1 : 0;
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_1854 == Class160.field_1413 && var5.nextInt(64) == 0) {
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 > 0 && var6 < 8) {
            var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F);
         }
      }

      if (this.field_1854 == Class160.field_3120
         && var1.method_1286(var2, var3 + 1, var4) == Class160.field_1255
         && !var1.method_768(var2, var3 + 1, var4)
         && var5.nextInt(100) == 0) {
         double var12 = var2 + var5.nextFloat();
         double var8 = var3 + this.field_84;
         double var10 = var4 + var5.nextFloat();
         var1.method_1347("lava", var12, var8, var10, 0.0, 0.0, 0.0);
      }
   }

   public static double method_61(Interface698 var0, int var1, int var2, int var3, Class160 var4) {
      Class214 var5 = null;
      if (var4 == Class160.field_1413) {
         var5 = ((Class722)Class108.field_536).method_897(var0, var1, var2, var3);
      }

      if (var4 == Class160.field_3120) {
         var5 = ((Class722)Class108.field_1423).method_897(var0, var1, var2, var3);
      }

      return var5.field_882 == 0.0 && var5.field_3045 == 0.0 ? -1000.0 : Math.atan2(var5.field_3045, var5.field_882) - (Math.PI / 2);
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      this.method_910(var1, var2, var3, var4);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_910(var1, var2, var3, var4);
   }

   private void method_910(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_197(var2, var3, var4) == this.field_2151 && this.field_1854 == Class160.field_3120) {
         boolean var5 = false;
         if (var5 || var1.method_1286(var2, var3, var4 - 1) == Class160.field_1413) {
            var5 = true;
         }

         if (var5 || var1.method_1286(var2, var3, var4 + 1) == Class160.field_1413) {
            var5 = true;
         }

         if (var5 || var1.method_1286(var2 - 1, var3, var4) == Class160.field_1413) {
            var5 = true;
         }

         if (var5 || var1.method_1286(var2 + 1, var3, var4) == Class160.field_1413) {
            var5 = true;
         }

         if (var5 || var1.method_1286(var2, var3 + 1, var4) == Class160.field_1413) {
            var5 = true;
         }

         if (var5) {
            int var6 = var1.method_1110(var2, var3, var4);
            if (var6 == 0) {
               var1.method_1481(var2, var3, var4, Class108.field_3085.field_2151);
            } else if (var6 <= 4) {
               var1.method_1481(var2, var3, var4, Class108.field_2201.field_2151);
            }

            this.method_289(var1, var2, var3, var4);
         }
      }
   }

   protected void method_289(Class454 var1, int var2, int var3, int var4) {
      var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "random.fizz", 0.5F, 2.6F + (var1.field_2150.nextFloat() - var1.field_2150.nextFloat()) * 0.8F);

      for (int var5 = 0; var5 < 8; var5++) {
         var1.method_1347("largesmoke", var2 + Math.random(), var3 + 1.2, var4 + Math.random(), 0.0, 0.0, 0.0);
      }
   }
}
