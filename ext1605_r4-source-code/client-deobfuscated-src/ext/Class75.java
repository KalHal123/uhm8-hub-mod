package ext;

import java.util.Random;

public abstract class Class75 extends Class407 {
   protected int field_633 = 1;

   protected Class75(int var1, Class160 var2) {
      super(var1, (var2 == Class160.field_3120 ? 14 : 12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      if (var2 == Class160.field_3120) {
         this.field_633 = 2;
      }

      this.method_1930(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.method_1936(true);
   }

   public static float method_1105(int var0) {
      if (var0 >= 8) {
         var0 = 0;
      }

      return (var0 + 1) / 9.0F;
   }

   @Override
   public int method_519(int var1) {
      return var1 != 0 && var1 != 1 ? this.field_2119 + 1 : this.field_2119;
   }

   protected int method_1450(Class454 var1, int var2, int var3, int var4) {
      return var1.method_1286(var2, var3, var4) != this.field_1201 ? -1 : var1.method_1110(var2, var3, var4);
   }

   protected int method_1749(Interface698 var1, int var2, int var3, int var4) {
      if (var1.method_1286(var2, var3, var4) != this.field_1201) {
         return -1;
      }

      int var5 = var1.method_1110(var2, var3, var4);
      if (var5 >= 8) {
         var5 = 0;
      }

      return var5;
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public boolean method_646(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   @Override
   public boolean method_1794(Interface698 var1, int var2, int var3, int var4, int var5) {
      Class160 var6 = var1.method_1286(var2, var3, var4);
      if (var6 == this.field_1201) {
         return false;
      } else if (var6 == Class160.field_1644) {
         return false;
      } else {
         return var5 == 1 ? true : super.method_1794(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int method_178() {
      return 4;
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return 0;
   }

   @Override
   public int method_806(Random var1) {
      return 0;
   }

   private Class214 method_14(Interface698 var1, int var2, int var3, int var4) {
      Class214 var5 = Class214.method_701(0.0, 0.0, 0.0);
      int var6 = this.method_1749(var1, var2, var3, var4);

      for (int var7 = 0; var7 < 4; var7++) {
         int var8 = var2;
         int var9 = var3;
         int var10 = var4;
         if (var7 == 0) {
            var8--;
         }

         if (var7 == 1) {
            var10--;
         }

         if (var7 == 2) {
            var8++;
         }

         if (var7 == 3) {
            var10++;
         }

         int var11 = this.method_1749(var1, var8, var9, var10);
         if (var11 < 0) {
            if (!var1.method_1286(var8, var9, var10).method_1552()) {
               var11 = this.method_1749(var1, var8, var9 - 1, var10);
               if (var11 >= 0) {
                  int var12 = var11 - (var6 - 8);
                  var5 = var5.method_1750((var8 - var2) * var12, (var9 - var3) * var12, (var10 - var4) * var12);
               }
            }
         } else if (var11 >= 0) {
            int var15 = var11 - var6;
            var5 = var5.method_1750((var8 - var2) * var15, (var9 - var3) * var15, (var10 - var4) * var15);
         }
      }

      if (var1.method_1110(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if (var13 || this.method_1794(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if (var13 || this.method_1794(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if (var13 || this.method_1794(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if (var13 || this.method_1794(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if (var13 || this.method_1794(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if (var13 || this.method_1794(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if (var13 || this.method_1794(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if (var13 || this.method_1794(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if (var13) {
            var5 = var5.method_341().method_1750(0.0, -6.0, 0.0);
         }
      }

      return var5.method_341();
   }

   @Override
   public void method_105(Class454 var1, int var2, int var3, int var4, Class359 var5, Class214 var6) {
      Class214 var7 = this.method_14(var1, var2, var3, var4);
      var6.field_882 = var6.field_882 + var7.field_882;
      var6.field_1911 = var6.field_1911 + var7.field_1911;
      var6.field_3045 = var6.field_3045 + var7.field_3045;
   }

   @Override
   public int method_1520() {
      if (this.field_1201 == Class160.field_1413) {
         return 5;
      } else {
         return this.field_1201 == Class160.field_3120 ? 30 : 0;
      }
   }

   @Override
   public float method_736(Interface698 var1, int var2, int var3, int var4) {
      float var5 = var1.method_1154(var2, var3, var4);
      float var6 = var1.method_1154(var2, var3 + 1, var4);
      return var5 > var6 ? var5 : var6;
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      super.method_732(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_691() {
      return this.field_1201 == Class160.field_1413 ? 1 : 0;
   }

   @Override
   public void method_453(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_1201 == Class160.field_1413 && var5.nextInt(64) == 0) {
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 > 0 && var6 < 8) {
            var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F);
         }
      }

      if (this.field_1201 == Class160.field_3120
         && var1.method_1286(var2, var3 + 1, var4) == Class160.field_1255
         && !var1.method_768(var2, var3 + 1, var4)
         && var5.nextInt(100) == 0) {
         double var12 = var2 + var5.nextFloat();
         double var8 = var3 + this.field_260;
         double var10 = var4 + var5.nextFloat();
         var1.method_1347("lava", var12, var8, var10, 0.0, 0.0, 0.0);
      }
   }

   public static double method_1097(Interface698 var0, int var1, int var2, int var3, Class160 var4) {
      Class214 var5 = null;
      if (var4 == Class160.field_1413) {
         var5 = ((Class75)Class407.field_1450).method_14(var0, var1, var2, var3);
      }

      if (var4 == Class160.field_3120) {
         var5 = ((Class75)Class407.field_1415).method_14(var0, var1, var2, var3);
      }

      return var5.field_882 == 0.0 && var5.field_3045 == 0.0 ? -1000.0 : Math.atan2(var5.field_3045, var5.field_882) - (Math.PI / 2);
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      this.method_283(var1, var2, var3, var4);
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_283(var1, var2, var3, var4);
   }

   private void method_283(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_197(var2, var3, var4) == this.field_19) {
         if (this.field_1201 == Class160.field_3120) {
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
                  var1.method_1481(var2, var3, var4, Class407.field_803.field_19);
               } else if (var6 <= 4) {
                  var1.method_1481(var2, var3, var4, Class407.field_2732.field_19);
               }

               this.method_396(var1, var2, var3, var4);
            }
         }
      }
   }

   protected void method_396(Class454 var1, int var2, int var3, int var4) {
      var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "random.fizz", 0.5F, 2.6F + (var1.field_2150.nextFloat() - var1.field_2150.nextFloat()) * 0.8F);

      for (int var5 = 0; var5 < 8; var5++) {
         var1.method_1347("largesmoke", var2 + Math.random(), var3 + 1.2, var4 + Math.random(), 0.0, 0.0, 0.0);
      }
   }
}
