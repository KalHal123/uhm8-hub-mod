package ext;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class Class151 extends Class641 {
   private Boolean field_399 = null;

   public Class151 method_1334(boolean var1) {
      this.field_399 = var1;
      return this;
   }

   private boolean method_1754(Class454 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class390.field_1853.field_2151;
      int var7 = Class390.field_366.field_2151;
      int var8 = var2.nextInt(4) + 4;
      boolean var9 = true;
      if (var4 >= 1 && var4 + var8 + 1 <= 128) {
         for (int var10 = var4; var10 <= var4 + 1 + var8; var10++) {
            byte var14 = 1;
            if (var10 == var4) {
               var14 = 0;
            }

            if (var10 >= var4 + 1 + var8 - 2) {
               var14 = 2;
            }

            for (int var11 = var3 - var14; var11 <= var3 + var14 && var9; var11++) {
               for (int var12 = var5 - var14; var12 <= var5 + var14 && var9; var12++) {
                  if (var10 >= 0 && var10 < 128) {
                     int var13 = var1.method_197(var11, var10, var12);
                     if (var13 != 0 && var13 != var7) {
                        var9 = false;
                     }
                  } else {
                     var9 = false;
                  }
               }
            }
         }

         if (!var9) {
            return false;
         }

         int var18 = var1.method_197(var3, var4 - 1, var5);
         if ((var18 == Class108.field_1674.field_2151 || var18 == Class108.field_1674.field_2151) && var4 < 128 - var8 - 1) {
            var1.method_470(var3, var4 - 1, var5, Class108.field_1674.field_2151);

            for (int var23 = var4 - 1 + var8; var23 <= var4 + var8; var23++) {
               boolean var19 = true;
               byte var21 = 1;

               for (int var22 = var3 - var21; var22 <= var3 - var21; var22++) {
                  int var15 = var22 - var3;

                  for (int var16 = var5 - var21; var16 <= var5 - var21; var16++) {
                     int var17 = var16 - var5;
                     if (!Class108.field_710[var1.method_197(var22, var23, var16)]) {
                        var1.method_470(var22 + 1, var23, var16 + 1, var7);
                     }
                  }
               }
            }

            for (int var24 = 0; var24 < var8; var24++) {
               int var20 = var1.method_197(var3, var4 + var24, var5);
               if (var20 == 0 || var20 == var7) {
                  var1.method_470(var3, var4 + var24, var5, var6);
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method_1668(Class454 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class390.field_2274.field_2151;
      int var7 = Class390.field_397.field_2151;
      float var8 = 0.0F;
      float var9 = var2.nextFloat() * (float) Math.PI * 2.0F;
      int var10 = var2.nextInt(8) + 7;
      float var11 = var4;

      for (int var12 = 0; var12 < var10; var12++) {
         var9 = (float)(var9 + (var2.nextFloat() - 0.5) * 0.1);
         var8++;
         float var13 = var8 / var10;
         var3 = (int)(var3 + Class469.method_255(var9) * (1.0F - var13));
         var11 += var13;
         var5 = (int)(var5 + Class469.method_1667(var9) * (1.0F - var13));
         var4 = Math.round(var11);
         var1.method_470(var3, var4, var5, var6);
      }

      var4 += var2.nextInt(2) + 1;
      int var16 = var2.nextInt(2) + 2;

      for (int var17 = 0; var17 < var16; var17++) {
         var1.method_470(var3, var4, var5, var7);

         for (float var18 = 0.0F; var18 < Math.PI * 2; var18 = (float)(var18 + (Math.PI / 5))) {
            int var19 = var2.nextInt(var17 + 2) + var17 + 2;
            float var20 = var3;
            float var21 = var5;

            for (int var14 = 0; var14 < var19; var14++) {
               var21 += Class469.method_1667(var18);
               var20 += Class469.method_255(var18);
               if (!var1.method_1286(Math.round(var20), var4 - var17, Math.round(var21)).method_1552()) {
                  var1.method_470(Math.round(var20), var4 - var17, Math.round(var21), var7);
               }
            }
         }
      }
   }

   private void method_1014(Class454 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class390.field_1176.field_2151;
      int var7 = var2.nextInt(3);

      for (int var8 = 0; var8 < var7; var8++) {
         int var9 = var2.nextInt(4) + 2;
         int var10 = var3;
         int var11 = var4;
         int var12 = var5;

         for (int var13 = 0; var13 < var9; var13++) {
            var10 += var2.nextInt(3) - 1;
            var11--;
            var12 += var2.nextInt(3) - 1;
            if (var1.method_197(var10, var11, var12) != Class108.field_2945.field_2151) {
               var1.method_470(var10, var11, var12, var6);
            }
         }
      }
   }

   private boolean method_401(Class454 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class390.field_2274.field_2151;
      int var7 = Class390.field_397.field_2151;
      if (var1.method_197(var3, var4 - 1, var5) != Class108.field_1970.field_2151 && var1.method_197(var3, var4 - 1, var5) != Class108.field_1047.field_2151) {
         return true;
      }

      Random var8 = new Random(var2.nextLong() + var3 + var4 + var5 + var1.field_482);
      ArrayList var9 = new ArrayList();
      int var10 = 7 + var8.nextInt(10);
      var9.add(Class214.method_701(var3, var4 + var10, var5));

      for (int var11 = 0; var9.size() > 0; var11++) {
         for (Class214 var13 : new ArrayList(var9)) {
            int var14 = (int)Math.round(var13.field_882);
            int var15 = (int)Math.round(var13.field_1911);
            int var16 = (int)Math.round(var13.field_3045);
            if ((!var1.method_1286(var14, var15, var16).method_1552() || var1.method_197(var14, var15, var16) != var7)
               && var15 >= 0
               && (var8.nextInt(3) != 0 || var9.size() <= 3)) {
               var1.method_470(var14, var15, var16, var6);
               int var17 = 0;

               while (var8.nextInt(var9.size() / 30 + 2) <= 1 && var9.size() <= 10000) {
                  if (++var17 >= 4) {
                     break;
                  }

                  Class214 var18 = var13.method_1750(var8.nextInt(3) - 1, -1.0, var8.nextInt(3) - 1);
                  var9.add(var18);
               }

               if (var11 > 2 && var8.nextInt(Math.max(40, 78 - var11)) == 3) {
                  this.method_1668(var1, var2, var14, var15, var16);
               }

               var9.remove(var13);
               var9.add(var13.method_1750(0.0, -1.0, 0.0));
            } else {
               var9.remove(var13);
               if (var1.method_197(var14, var15, var16) == Class108.field_1674.field_2151
                  || var1.method_197(var14, var15, var16) == Class108.field_1674.field_2151) {
                  this.method_1014(var1, var8, var14, var15, var16);
               }
            }
         }
      }

      return true;
   }

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      Random var6 = new Random(var2.nextLong() + var3 + var4 + var5 + var1.field_482);
      return Minecraft.field_1601 || this.field_399 == null || var6.nextInt(150) != 0 && !this.field_399
         ? this.method_1754(var1, var2, var3, var4, var5)
         : this.method_401(var1, var2, var3, var4, var5);
   }
}
