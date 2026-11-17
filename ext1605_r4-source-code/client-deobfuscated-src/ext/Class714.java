package ext;

import org.lwjgl.opengl.GL11;

public class Class714 {
   private Interface698 field_713;
   private int field_1844 = -1;
   private boolean field_1299 = false;
   private boolean field_905 = false;

   public Class714(Interface698 var1) {
      this.field_713 = var1;
   }

   public Class714() {
   }

   public void method_1018(Class108 var1, int var2, int var3, int var4, int var5) {
      this.field_1844 = var5;
      this.method_617(var1, var2, var3, var4);
      this.field_1844 = -1;
   }

   public boolean method_617(Class108 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1900();
      var1.method_1433(this.field_713, var2, var3, var4);
      switch (var5) {
         case -1:
            return true;
         case 0:
         default:
            return this.method_1424(var1, var2, var3, var4);
         case 1:
            return this.method_1117(var1, var2, var3, var4);
         case 2:
            return this.method_756(var1, var2, var3, var4);
         case 3:
            return this.method_918(var1, var2, var3, var4);
         case 4:
            return this.method_1818(var1, var2, var3, var4);
         case 5:
            return this.method_1825(var1, var2, var3, var4);
         case 6:
            return this.method_1409(var1, var2, var3, var4);
         case 7:
            return this.method_937(var1, var2, var3, var4);
         case 8:
            return this.method_384(var1, var2, var3, var4);
         case 9:
            return this.method_232(var1, var2, var3, var4);
         case 10:
            return this.method_594(var1, var2, var3, var4);
         case 11:
            return this.method_621(var1, var2, var3, var4);
         case 12:
            return this.method_222(var1, var2, var3, var4);
         case 13:
            return this.method_561(var1, var2, var3, var4);
         case 14:
            return this.method_1621(var1, var2, var3, var4, false);
      }
   }

   private boolean method_1621(Class108 var1, int var2, int var3, int var4, boolean var5) {
      Class368 var6 = Class368.field_2696;
      byte var7 = 1;
      byte var8 = 0;
      float var9 = 1.0F;
      if (!var5) {
         var9 = var1.method_1320(this.field_713, var2, var3 - 1, var4);
      }

      var6.method_1101(var9, var9, var9);
      double var10 = (var7 * 16.0 + 1.0) / 256.0;
      double var12 = (var7 * 16.0 + 15.0 - 0.01) / 256.0;
      double var14 = (var8 * 16.0 + 1.0) / 512.0;
      double var16 = (var8 * 16.0 + 15.0 - 0.01) / 512.0;
      double var18 = var2 + 0.0625;
      double var20 = var2 + 0.9375;
      double var22 = var4 + 0.0625;
      double var24 = var4 + 0.9375;
      var6.method_318(var18, var3, var24, var10, var16);
      var6.method_318(var18, var3, var22, var10, var14);
      var6.method_318(var20, var3, var22, var12, var14);
      var6.method_318(var20, var3, var24, var12, var16);
      var10 = (var7 * 16.0 + 0.0) / 256.0;
      var12 = (var7 * 16.0 + 16.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2 + 1;
      var20 = var3 + 0.0625;
      var22 = var4 + 1;
      var6.method_318(var2, var20, var22, var10, var16);
      var6.method_318(var2, var20, var4, var10, var14);
      var6.method_318(var18, var20, var4, var12, var14);
      var6.method_318(var18, var20, var22, var12, var16);
      if (!var5) {
         var9 = var1.method_1320(this.field_713, var2, var3, var4 - 1);
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2;
      var20 = var2 + 1;
      var22 = var3 + 0.0625;
      var24 = var3 + 0.25;
      double var26 = var4;
      var6.method_318(var18, var24, var26, var10, var16);
      var6.method_318(var20, var24, var26, var10, var14);
      var6.method_318(var20, var22, var26, var12, var14);
      var6.method_318(var18, var22, var26, var12, var16);
      var10 = (var7 * 16.0 + 0.0) / 256.0;
      var12 = (var7 * 16.0 + 1.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 1.0) / 512.0;
      var16 = (var8 * 16.0 + 15.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var2 + 0.9375;
      var22 = var3;
      var24 = var3 + 0.0625;
      var26 = var4 + 0.0625;
      var6.method_318(var18, var24, var26, var10, var16);
      var6.method_318(var20, var24, var26, var10, var14);
      var6.method_318(var20, var22, var26, var12, var14);
      var6.method_318(var18, var22, var26, var12, var16);
      if (!var5) {
         var9 = var1.method_1320(this.field_713, var2, var3, var4 + 1);
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2;
      var20 = var2 + 1;
      var22 = var3 + 0.0625;
      var24 = var3 + 0.25;
      var26 = var4 + 1;
      var6.method_318(var20, var24, var26, var10, var16);
      var6.method_318(var18, var24, var26, var10, var14);
      var6.method_318(var18, var22, var26, var12, var14);
      var6.method_318(var20, var22, var26, var12, var16);
      var10 = (var7 * 16.0 + 0.0) / 256.0;
      var12 = (var7 * 16.0 + 1.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 1.0) / 512.0;
      var16 = (var8 * 16.0 + 15.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var2 + 0.9375;
      var22 = var3;
      var24 = var3 + 0.0625;
      var26 = var4 + 0.9375;
      var6.method_318(var20, var24, var26, var10, var16);
      var6.method_318(var18, var24, var26, var10, var14);
      var6.method_318(var18, var22, var26, var12, var14);
      var6.method_318(var20, var22, var26, var12, var16);
      if (!var5) {
         var9 = var1.method_1320(this.field_713, var2 - 1, var3, var4);
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2;
      var20 = var3 + 0.0625;
      var22 = var3 + 0.25;
      var24 = var4;
      var26 = var4 + 1;
      var6.method_318(var18, var22, var26, var10, var16);
      var6.method_318(var18, var22, var24, var10, var14);
      var6.method_318(var18, var20, var24, var12, var14);
      var6.method_318(var18, var20, var26, var12, var16);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var3;
      var22 = var3 + 0.0625;
      var24 = var4 + 0.0625;
      var26 = var4 + 0.9375;
      var6.method_318(var18, var22, var26, var10, var16);
      var6.method_318(var18, var22, var24, var10, var14);
      var6.method_318(var18, var20, var24, var12, var14);
      var6.method_318(var18, var20, var26, var12, var16);
      if (!var5) {
         var9 = var1.method_1320(this.field_713, var2 + 1, var3, var4);
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2 + 1;
      var20 = var3 + 0.0625;
      var22 = var3 + 0.25;
      var24 = var4;
      var26 = var4 + 1;
      var6.method_318(var18, var22, var24, var10, var16);
      var6.method_318(var18, var22, var26, var10, var14);
      var6.method_318(var18, var20, var26, var12, var14);
      var6.method_318(var18, var20, var24, var12, var16);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2 + 0.9375;
      var20 = var3;
      var22 = var3 + 0.0625;
      var24 = var4 + 0.0625;
      var26 = var4 + 0.9375;
      var6.method_318(var18, var22, var24, var10, var16);
      var6.method_318(var18, var22, var26, var10, var14);
      var6.method_318(var18, var20, var26, var12, var14);
      var6.method_318(var18, var20, var24, var12, var16);
      if (!var5) {
         var9 = var1.method_1320(this.field_713, var2, var3 + 1, var4);
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 0.0) / 256.0;
      var12 = (var7 * 16.0 + 1.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2 + 0.0;
      var20 = var2 + 0.0625;
      var22 = var3 + 0.25;
      var24 = var4 + 0.0;
      var26 = var4 + 1;
      var6.method_318(var20, var22, var26, var10, var16);
      var6.method_318(var20, var22, var24, var10, var14);
      var6.method_318(var18, var22, var24, var12, var14);
      var6.method_318(var18, var22, var26, var12, var16);
      var10 = (var7 * 16.0 + 0.0) / 256.0;
      var12 = (var7 * 16.0 + 1.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2 + 0.9375;
      var20 = var2 + 1;
      var22 = var3 + 0.25;
      var24 = var4 + 0.0;
      var26 = var4 + 1;
      var6.method_318(var20, var22, var26, var10, var16);
      var6.method_318(var20, var22, var24, var10, var14);
      var6.method_318(var18, var22, var24, var12, var14);
      var6.method_318(var18, var22, var26, var12, var16);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 15.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 1.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var2 + 0.9375;
      var22 = var3 + 0.25;
      var24 = var4 + 0.0;
      var26 = var4 + 0.0625;
      var6.method_318(var20, var22, var26, var10, var16);
      var6.method_318(var20, var22, var24, var10, var14);
      var6.method_318(var18, var22, var24, var12, var14);
      var6.method_318(var18, var22, var26, var12, var16);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 15.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 1.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var2 + 0.9375;
      var22 = var3 + 0.25;
      var24 = var4 + 0.9375;
      var26 = var4 + 1;
      var6.method_318(var20, var22, var26, var10, var16);
      var6.method_318(var20, var22, var24, var10, var14);
      var6.method_318(var18, var22, var24, var12, var14);
      var6.method_318(var18, var22, var26, var12, var16);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 15.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 1.0) / 512.0;
      var16 = (var8 * 16.0 + 15.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var2 + 0.9375;
      var22 = var3 + 0.125;
      var24 = var4 + 0.0625;
      var26 = var4 + 0.9375;
      var6.method_318(var20, var22, var26, var10, var16);
      var6.method_318(var20, var22, var24, var10, var14);
      var6.method_318(var18, var22, var24, var12, var14);
      var6.method_318(var18, var22, var26, var12, var16);
      if (!var5) {
         var9 = Math.min(var1.method_1320(this.field_713, var2, var3 + 1, var4 - 1), var1.method_1320(this.field_713, var2, var3 + 1, var4));
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 1.0) / 512.0;
      var16 = (var8 * 16.0 + 15.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var2 + 0.9375;
      var22 = var3 + 0.125;
      var24 = var3 + 0.25;
      var26 = var4 + 0.9375;
      var6.method_318(var18, var24, var26, var10, var16);
      var6.method_318(var20, var24, var26, var10, var14);
      var6.method_318(var20, var22, var26, var12, var14);
      var6.method_318(var18, var22, var26, var12, var16);
      if (!var5) {
         var9 = Math.min(var1.method_1320(this.field_713, var2, var3 + 1, var4 + 1), var1.method_1320(this.field_713, var2, var3 + 1, var4));
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 1.0) / 512.0;
      var16 = (var8 * 16.0 + 15.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var2 + 0.9375;
      var22 = var3 + 0.125;
      var24 = var3 + 0.25;
      var26 = var4 + 0.0625;
      var6.method_318(var20, var24, var26, var10, var16);
      var6.method_318(var18, var24, var26, var10, var14);
      var6.method_318(var18, var22, var26, var12, var14);
      var6.method_318(var20, var22, var26, var12, var16);
      if (!var5) {
         var9 = Math.min(var1.method_1320(this.field_713, var2 + 1, var3 + 1, var4), var1.method_1320(this.field_713, var2, var3 + 1, var4));
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2 + 0.9375;
      var20 = var3 + 0.125;
      var22 = var3 + 0.25;
      var24 = var4 + 0.0625;
      var26 = var4 + 0.9375;
      var6.method_318(var18, var22, var26, var10, var16);
      var6.method_318(var18, var22, var24, var10, var14);
      var6.method_318(var18, var20, var24, var12, var14);
      var6.method_318(var18, var20, var26, var12, var16);
      if (!var5) {
         var9 = Math.min(var1.method_1320(this.field_713, var2 - 1, var3 + 1, var4), var1.method_1320(this.field_713, var2, var3 + 1, var4));
      }

      var6.method_1101(var9, var9, var9);
      var10 = (var7 * 16.0 + 1.0) / 256.0;
      var12 = (var7 * 16.0 + 4.0 - 0.01) / 256.0;
      var14 = (var8 * 16.0 + 0.0) / 512.0;
      var16 = (var8 * 16.0 + 16.0 - 0.01) / 512.0;
      var18 = var2 + 0.0625;
      var20 = var3 + 0.125;
      var22 = var3 + 0.25;
      var24 = var4 + 0.0625;
      var26 = var4 + 0.9375;
      var6.method_318(var18, var22, var24, var10, var16);
      var6.method_318(var18, var22, var26, var10, var14);
      var6.method_318(var18, var20, var26, var12, var14);
      var6.method_318(var18, var20, var24, var12, var16);
      var7 = 13;
      var8 = 12;
      var6.method_1101(1.0F, 1.0F, 1.0F);
      Class476 var50 = var5 ? null : (Class476)this.field_713.method_1303(var2, var3, var4);
      if (!var5 && var3 > 1) {
         int var11 = this.field_713.method_197(var2, var3 - 1, var4);
         Class476 var70 = (Class476)this.field_713.method_1303(var2, var3, var4);
         if (var11 == Class390.field_3040.field_2151) {
            var6.method_1101(0.2F, 1.0F, 0.2F);
         } else if (var11 == Class390.field_1075.field_2151) {
            var6.method_1101(0.1F, 1.0F, 0.4F);
         } else if (var11 == Class108.field_93.field_2151) {
            var6.method_1101(1.0F, 0.8F, 0.0F);
         } else if (var11 != Class108.field_2604.field_2151 && var11 != Class108.field_847.field_2151) {
            if (var11 == Class108.field_2441.field_2151) {
               var9 = var1.method_1320(this.field_713, var2, var3 + 1, var4);
               var6.method_1101(var9, var9, var9);
               var7 = 3;
               var8 = 4;
            }
         } else if (var70.method_1416(0).field_2326 == 64) {
            var6.method_1101(1.0F, 0.0F, 0.0F);
         } else {
            var6.method_1101(0.5F, 0.0F, 0.0F);
         }
      }

      if (var50 == null || var50.method_1416(0).field_2326 > 0) {
         double var51 = (var7 * 16.0 + 1.0) / 256.0;
         double var13 = (var7 * 16.0 + 15.0 - 0.01) / 256.0;
         double var15 = (var8 * 16.0 + 1.0) / 512.0;
         double var17 = (var8 * 16.0 + 15.0 - 0.01) / 512.0;
         double var19 = var2 + 0.0625;
         double var21 = var2 + 0.9375;
         double var23 = var3 + 0.125;
         double var25 = var4 + 0.0625;
         double var27 = var4 + 0.9375;
         var6.method_318(var21, var23, var27, var51, var17);
         var6.method_318(var21, var23, var25, var51, var15);
         var6.method_318(var19, var23, var25, var13, var15);
         var6.method_318(var19, var23, var27, var13, var17);
      }

      return true;
   }

   public boolean method_756(Class108 var1, int var2, int var3, int var4) {
      int var5 = this.field_713.method_1110(var2, var3, var4);
      Class368 var6 = Class368.field_2696;
      float var7 = var1.method_1320(this.field_713, var2, var3, var4);
      if (Class108.field_2146[var1.field_2151] > 0) {
         var7 = 1.0F;
      }

      var6.method_1101(var7, var7, var7);
      double var8 = 0.4F;
      double var10 = 0.5 - var8;
      double var12 = 0.2F;
      if (var5 == 1) {
         this.method_523(var1, var2 - var10, var3 + var12, var4, -var8, 0.0);
      } else if (var5 == 2) {
         this.method_523(var1, var2 + var10, var3 + var12, var4, var8, 0.0);
      } else if (var5 == 3) {
         this.method_523(var1, var2, var3 + var12, var4 - var10, 0.0, -var8);
      } else if (var5 == 4) {
         this.method_523(var1, var2, var3 + var12, var4 + var10, 0.0, var8);
      } else {
         this.method_523(var1, var2, var3, var4, 0.0, 0.0);
      }

      return true;
   }

   public boolean method_222(Class108 var1, int var2, int var3, int var4) {
      int var5 = this.field_713.method_1110(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      Class368 var8 = Class368.field_2696;
      boolean var9 = this.field_1844 >= 0;
      if (!var9) {
         this.field_1844 = Class108.field_2201.field_2972;
      }

      float var10 = 0.25F;
      float var11 = 0.1875F;
      float var12 = 0.1875F;
      if (var6 == 5) {
         var1.method_1618(0.5F - var11, 0.0F, 0.5F - var10, 0.5F + var11, var12, 0.5F + var10);
      } else if (var6 == 6) {
         var1.method_1618(0.5F - var10, 0.0F, 0.5F - var11, 0.5F + var10, var12, 0.5F + var11);
      } else if (var6 == 4) {
         var1.method_1618(0.5F - var11, 0.5F - var10, 1.0F - var12, 0.5F + var11, 0.5F + var10, 1.0F);
      } else if (var6 == 3) {
         var1.method_1618(0.5F - var11, 0.5F - var10, 0.0F, 0.5F + var11, 0.5F + var10, var12);
      } else if (var6 == 2) {
         var1.method_1618(1.0F - var12, 0.5F - var10, 0.5F - var11, 1.0F, 0.5F + var10, 0.5F + var11);
      } else if (var6 == 1) {
         var1.method_1618(0.0F, 0.5F - var10, 0.5F - var11, var12, 0.5F + var10, 0.5F + var11);
      }

      this.method_1424(var1, var2, var3, var4);
      if (!var9) {
         this.field_1844 = -1;
      }

      float var13 = var1.method_1320(this.field_713, var2, var3, var4);
      if (Class108.field_2146[var1.field_2151] > 0) {
         var13 = 1.0F;
      }

      var8.method_1101(var13, var13, var13);
      int var14 = var1.method_1735(0);
      if (this.field_1844 >= 0) {
         var14 = this.field_1844;
      }

      int var15 = (var14 & 15) << 4;
      int var16 = var14 & 4080;
      float var17 = var15 / 256.0F;
      float var18 = (var15 + 15.99F) / 256.0F;
      float var19 = var16 / 512.0F;
      float var20 = (var16 + 15.99F) / 512.0F;
      Class214[] var21 = new Class214[8];
      float var22 = 0.0625F;
      float var23 = 0.0625F;
      float var24 = 0.625F;
      var21[0] = Class214.method_701(-var22, 0.0, -var23);
      var21[1] = Class214.method_701(var22, 0.0, -var23);
      var21[2] = Class214.method_701(var22, 0.0, var23);
      var21[3] = Class214.method_701(-var22, 0.0, var23);
      var21[4] = Class214.method_701(-var22, var24, -var23);
      var21[5] = Class214.method_701(var22, var24, -var23);
      var21[6] = Class214.method_701(var22, var24, var23);
      var21[7] = Class214.method_701(-var22, var24, var23);

      for (int var25 = 0; var25 < 8; var25++) {
         if (var7) {
            var21[var25].field_3045 -= 0.0625;
            var21[var25].method_31((float) Math.PI * 2.0F / 9.0F);
         } else {
            var21[var25].field_3045 += 0.0625;
            var21[var25].method_31((float) -Math.PI * 2.0F / 9.0F);
         }

         if (var6 == 6) {
            var21[var25].method_1615((float) (Math.PI / 2));
         }

         if (var6 < 5) {
            var21[var25].field_1911 -= 0.375;
            var21[var25].method_31((float) (Math.PI / 2));
            if (var6 == 4) {
               var21[var25].method_1615(0.0F);
            }

            if (var6 == 3) {
               var21[var25].method_1615((float) Math.PI);
            }

            if (var6 == 2) {
               var21[var25].method_1615((float) (Math.PI / 2));
            }

            if (var6 == 1) {
               var21[var25].method_1615((float) (-Math.PI / 2));
            }

            var21[var25].field_882 += var2 + 0.5;
            var21[var25].field_1911 += var3 + 0.5F;
            var21[var25].field_3045 += var4 + 0.5;
         } else {
            var21[var25].field_882 += var2 + 0.5;
            var21[var25].field_1911 += var3 + 0.125F;
            var21[var25].field_3045 += var4 + 0.5;
         }
      }

      Class214 var30 = null;
      Class214 var26 = null;
      Class214 var27 = null;
      Class214 var28 = null;

      for (int var29 = 0; var29 < 6; var29++) {
         if (var29 == 0) {
            var17 = (var15 + 7) / 256.0F;
            var18 = (var15 + 9 - 0.01F) / 256.0F;
            var19 = (var16 + 6) / 512.0F;
            var20 = (var16 + 8 - 0.01F) / 512.0F;
         } else if (var29 == 2) {
            var17 = (var15 + 7) / 256.0F;
            var18 = (var15 + 9 - 0.01F) / 256.0F;
            var19 = (var16 + 6) / 512.0F;
            var20 = (var16 + 16 - 0.01F) / 512.0F;
         }

         if (var29 == 0) {
            var30 = var21[0];
            var26 = var21[1];
            var27 = var21[2];
            var28 = var21[3];
         } else if (var29 == 1) {
            var30 = var21[7];
            var26 = var21[6];
            var27 = var21[5];
            var28 = var21[4];
         } else if (var29 == 2) {
            var30 = var21[1];
            var26 = var21[0];
            var27 = var21[4];
            var28 = var21[5];
         } else if (var29 == 3) {
            var30 = var21[2];
            var26 = var21[1];
            var27 = var21[5];
            var28 = var21[6];
         } else if (var29 == 4) {
            var30 = var21[3];
            var26 = var21[2];
            var27 = var21[6];
            var28 = var21[7];
         } else if (var29 == 5) {
            var30 = var21[0];
            var26 = var21[3];
            var27 = var21[7];
            var28 = var21[4];
         }

         var8.method_318(var30.field_882, var30.field_1911, var30.field_3045, var17, var20);
         var8.method_318(var26.field_882, var26.field_1911, var26.field_3045, var18, var20);
         var8.method_318(var27.field_882, var27.field_1911, var27.field_3045, var18, var19);
         var8.method_318(var28.field_882, var28.field_1911, var28.field_3045, var17, var19);
      }

      return true;
   }

   public boolean method_918(Class108 var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      int var6 = var1.method_1735(0);
      if (this.field_1844 >= 0) {
         var6 = this.field_1844;
      }

      float var7 = var1.method_1320(this.field_713, var2, var3, var4);
      var5.method_1101(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 4080;
      double var10 = var8 / 256.0F;
      double var12 = (var8 + 15.99F) / 256.0F;
      double var14 = var9 / 512.0F;
      double var16 = (var9 + 15.99F) / 512.0F;
      float var18 = 1.4F;
      if (!this.field_713.method_768(var2, var3 - 1, var4) && !Class108.field_1781.method_144(this.field_713, var2, var3 - 1, var4)) {
         float var75 = 0.2F;
         float var34 = 0.0625F;
         if ((var2 + var3 + var4 & 1) == 1) {
            var10 = var8 / 256.0F;
            var12 = (var8 + 15.99F) / 256.0F;
            var14 = (var9 + 16) / 512.0F;
            var16 = (var9 + 15.99F + 16.0F) / 512.0F;
         }

         if ((var2 / 2 + var3 / 2 + var4 / 2 & 1) == 1) {
            double var60 = var12;
            var12 = var10;
            var10 = var60;
         }

         if (Class108.field_1781.method_144(this.field_713, var2 - 1, var3, var4)) {
            var5.method_318(var2 + var75, var3 + var18 + var34, var4 + 1, var12, var14);
            var5.method_318(var2 + 0, var3 + 0 + var34, var4 + 1, var12, var16);
            var5.method_318(var2 + 0, var3 + 0 + var34, var4 + 0, var10, var16);
            var5.method_318(var2 + var75, var3 + var18 + var34, var4 + 0, var10, var14);
            var5.method_318(var2 + var75, var3 + var18 + var34, var4 + 0, var10, var14);
            var5.method_318(var2 + 0, var3 + 0 + var34, var4 + 0, var10, var16);
            var5.method_318(var2 + 0, var3 + 0 + var34, var4 + 1, var12, var16);
            var5.method_318(var2 + var75, var3 + var18 + var34, var4 + 1, var12, var14);
         }

         if (Class108.field_1781.method_144(this.field_713, var2 + 1, var3, var4)) {
            var5.method_318(var2 + 1 - var75, var3 + var18 + var34, var4 + 0, var10, var14);
            var5.method_318(var2 + 1 - 0, var3 + 0 + var34, var4 + 0, var10, var16);
            var5.method_318(var2 + 1 - 0, var3 + 0 + var34, var4 + 1, var12, var16);
            var5.method_318(var2 + 1 - var75, var3 + var18 + var34, var4 + 1, var12, var14);
            var5.method_318(var2 + 1 - var75, var3 + var18 + var34, var4 + 1, var12, var14);
            var5.method_318(var2 + 1 - 0, var3 + 0 + var34, var4 + 1, var12, var16);
            var5.method_318(var2 + 1 - 0, var3 + 0 + var34, var4 + 0, var10, var16);
            var5.method_318(var2 + 1 - var75, var3 + var18 + var34, var4 + 0, var10, var14);
         }

         if (Class108.field_1781.method_144(this.field_713, var2, var3, var4 - 1)) {
            var5.method_318(var2 + 0, var3 + var18 + var34, var4 + var75, var12, var14);
            var5.method_318(var2 + 0, var3 + 0 + var34, var4 + 0, var12, var16);
            var5.method_318(var2 + 1, var3 + 0 + var34, var4 + 0, var10, var16);
            var5.method_318(var2 + 1, var3 + var18 + var34, var4 + var75, var10, var14);
            var5.method_318(var2 + 1, var3 + var18 + var34, var4 + var75, var10, var14);
            var5.method_318(var2 + 1, var3 + 0 + var34, var4 + 0, var10, var16);
            var5.method_318(var2 + 0, var3 + 0 + var34, var4 + 0, var12, var16);
            var5.method_318(var2 + 0, var3 + var18 + var34, var4 + var75, var12, var14);
         }

         if (Class108.field_1781.method_144(this.field_713, var2, var3, var4 + 1)) {
            var5.method_318(var2 + 1, var3 + var18 + var34, var4 + 1 - var75, var10, var14);
            var5.method_318(var2 + 1, var3 + 0 + var34, var4 + 1 - 0, var10, var16);
            var5.method_318(var2 + 0, var3 + 0 + var34, var4 + 1 - 0, var12, var16);
            var5.method_318(var2 + 0, var3 + var18 + var34, var4 + 1 - var75, var12, var14);
            var5.method_318(var2 + 0, var3 + var18 + var34, var4 + 1 - var75, var12, var14);
            var5.method_318(var2 + 0, var3 + 0 + var34, var4 + 1 - 0, var12, var16);
            var5.method_318(var2 + 1, var3 + 0 + var34, var4 + 1 - 0, var10, var16);
            var5.method_318(var2 + 1, var3 + var18 + var34, var4 + 1 - var75, var10, var14);
         }

         if (Class108.field_1781.method_144(this.field_713, var2, var3 + 1, var4)) {
            double var61 = var2 + 0.5 + 0.5;
            double var63 = var2 + 0.5 - 0.5;
            double var65 = var4 + 0.5 + 0.5;
            double var67 = var4 + 0.5 - 0.5;
            double var69 = var2 + 0.5 - 0.5;
            double var71 = var2 + 0.5 + 0.5;
            double var73 = var4 + 0.5 - 0.5;
            double var35 = var4 + 0.5 + 0.5;
            var10 = var8 / 256.0F;
            var12 = (var8 + 15.99F) / 256.0F;
            var14 = var9 / 512.0F;
            var16 = (var9 + 15.99F) / 512.0F;
            var3++;
            var18 = -0.2F;
            if ((var2 + var3 + var4 & 1) == 0) {
               var5.method_318(var69, var3 + var18, var4 + 0, var12, var14);
               var5.method_318(var61, var3 + 0, var4 + 0, var12, var16);
               var5.method_318(var61, var3 + 0, var4 + 1, var10, var16);
               var5.method_318(var69, var3 + var18, var4 + 1, var10, var14);
               var10 = var8 / 256.0F;
               var12 = (var8 + 15.99F) / 256.0F;
               var14 = (var9 + 16) / 512.0F;
               var16 = (var9 + 15.99F + 16.0F) / 512.0F;
               var5.method_318(var71, var3 + var18, var4 + 1, var12, var14);
               var5.method_318(var63, var3 + 0, var4 + 1, var12, var16);
               var5.method_318(var63, var3 + 0, var4 + 0, var10, var16);
               var5.method_318(var71, var3 + var18, var4 + 0, var10, var14);
            } else {
               var5.method_318(var2 + 0, var3 + var18, var35, var12, var14);
               var5.method_318(var2 + 0, var3 + 0, var67, var12, var16);
               var5.method_318(var2 + 1, var3 + 0, var67, var10, var16);
               var5.method_318(var2 + 1, var3 + var18, var35, var10, var14);
               var10 = var8 / 256.0F;
               var12 = (var8 + 15.99F) / 256.0F;
               var14 = (var9 + 16) / 512.0F;
               var16 = (var9 + 15.99F + 16.0F) / 512.0F;
               var5.method_318(var2 + 1, var3 + var18, var73, var12, var14);
               var5.method_318(var2 + 1, var3 + 0, var65, var12, var16);
               var5.method_318(var2 + 0, var3 + 0, var65, var10, var16);
               var5.method_318(var2 + 0, var3 + var18, var73, var10, var14);
            }
         }
      } else {
         double var33 = var2 + 0.5 + 0.2;
         double var19 = var2 + 0.5 - 0.2;
         double var21 = var4 + 0.5 + 0.2;
         double var23 = var4 + 0.5 - 0.2;
         double var25 = var2 + 0.5 - 0.3;
         double var27 = var2 + 0.5 + 0.3;
         double var29 = var4 + 0.5 - 0.3;
         double var31 = var4 + 0.5 + 0.3;
         var5.method_318(var25, var3 + var18, var4 + 1, var12, var14);
         var5.method_318(var33, var3 + 0, var4 + 1, var12, var16);
         var5.method_318(var33, var3 + 0, var4 + 0, var10, var16);
         var5.method_318(var25, var3 + var18, var4 + 0, var10, var14);
         var5.method_318(var27, var3 + var18, var4 + 0, var12, var14);
         var5.method_318(var19, var3 + 0, var4 + 0, var12, var16);
         var5.method_318(var19, var3 + 0, var4 + 1, var10, var16);
         var5.method_318(var27, var3 + var18, var4 + 1, var10, var14);
         var10 = var8 / 256.0F;
         var12 = (var8 + 15.99F) / 256.0F;
         var14 = (var9 + 16) / 512.0F;
         var16 = (var9 + 15.99F + 16.0F) / 512.0F;
         var5.method_318(var2 + 1, var3 + var18, var31, var12, var14);
         var5.method_318(var2 + 1, var3 + 0, var23, var12, var16);
         var5.method_318(var2 + 0, var3 + 0, var23, var10, var16);
         var5.method_318(var2 + 0, var3 + var18, var31, var10, var14);
         var5.method_318(var2 + 0, var3 + var18, var29, var12, var14);
         var5.method_318(var2 + 0, var3 + 0, var21, var12, var16);
         var5.method_318(var2 + 1, var3 + 0, var21, var10, var16);
         var5.method_318(var2 + 1, var3 + var18, var29, var10, var14);
         var33 = var2 + 0.5 - 0.5;
         var19 = var2 + 0.5 + 0.5;
         var21 = var4 + 0.5 - 0.5;
         var23 = var4 + 0.5 + 0.5;
         var25 = var2 + 0.5 - 0.4;
         var27 = var2 + 0.5 + 0.4;
         var29 = var4 + 0.5 - 0.4;
         var31 = var4 + 0.5 + 0.4;
         var5.method_318(var25, var3 + var18, var4 + 0, var10, var14);
         var5.method_318(var33, var3 + 0, var4 + 0, var10, var16);
         var5.method_318(var33, var3 + 0, var4 + 1, var12, var16);
         var5.method_318(var25, var3 + var18, var4 + 1, var12, var14);
         var5.method_318(var27, var3 + var18, var4 + 1, var10, var14);
         var5.method_318(var19, var3 + 0, var4 + 1, var10, var16);
         var5.method_318(var19, var3 + 0, var4 + 0, var12, var16);
         var5.method_318(var27, var3 + var18, var4 + 0, var12, var14);
         var10 = var8 / 256.0F;
         var12 = (var8 + 15.99F) / 256.0F;
         var14 = var9 / 512.0F;
         var16 = (var9 + 15.99F) / 512.0F;
         var5.method_318(var2 + 0, var3 + var18, var31, var10, var14);
         var5.method_318(var2 + 0, var3 + 0, var23, var10, var16);
         var5.method_318(var2 + 1, var3 + 0, var23, var12, var16);
         var5.method_318(var2 + 1, var3 + var18, var31, var12, var14);
         var5.method_318(var2 + 1, var3 + var18, var29, var10, var14);
         var5.method_318(var2 + 1, var3 + 0, var21, var10, var16);
         var5.method_318(var2 + 0, var3 + 0, var21, var12, var16);
         var5.method_318(var2 + 0, var3 + var18, var29, var12, var14);
      }

      return true;
   }

   public boolean method_1825(Class108 var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      int var6 = var1.method_774(1, this.field_713.method_1110(var2, var3, var4));
      if (this.field_1844 >= 0) {
         var6 = this.field_1844;
      }

      float var7 = var1.method_1320(this.field_713, var2, var3, var4);
      var5.method_1101(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 4080;
      double var10 = var8 / 256.0F;
      double var12 = (var8 + 15.99F) / 256.0F;
      double var14 = var9 / 512.0F;
      double var16 = (var9 + 15.99F) / 512.0F;
      float var18 = 0.0F;
      float var19 = 0.03125F;
      boolean var20 = Class176.method_556(this.field_713, var2 - 1, var3, var4)
         || !this.field_713.method_768(var2 - 1, var3, var4) && Class176.method_556(this.field_713, var2 - 1, var3 - 1, var4);
      boolean var21 = Class176.method_556(this.field_713, var2 + 1, var3, var4)
         || !this.field_713.method_768(var2 + 1, var3, var4) && Class176.method_556(this.field_713, var2 + 1, var3 - 1, var4);
      boolean var22 = Class176.method_556(this.field_713, var2, var3, var4 - 1)
         || !this.field_713.method_768(var2, var3, var4 - 1) && Class176.method_556(this.field_713, var2, var3 - 1, var4 - 1);
      boolean var23 = Class176.method_556(this.field_713, var2, var3, var4 + 1)
         || !this.field_713.method_768(var2, var3, var4 + 1) && Class176.method_556(this.field_713, var2, var3 - 1, var4 + 1);
      if (!this.field_713.method_768(var2, var3 + 1, var4)) {
         if (this.field_713.method_768(var2 - 1, var3, var4) && Class176.method_556(this.field_713, var2 - 1, var3 + 1, var4)) {
            var20 = true;
         }

         if (this.field_713.method_768(var2 + 1, var3, var4) && Class176.method_556(this.field_713, var2 + 1, var3 + 1, var4)) {
            var21 = true;
         }

         if (this.field_713.method_768(var2, var3, var4 - 1) && Class176.method_556(this.field_713, var2, var3 + 1, var4 - 1)) {
            var22 = true;
         }

         if (this.field_713.method_768(var2, var3, var4 + 1) && Class176.method_556(this.field_713, var2, var3 + 1, var4 + 1)) {
            var23 = true;
         }
      }

      float var24 = 0.3125F;
      float var25 = var2 + 0;
      float var26 = var2 + 1;
      float var27 = var4 + 0;
      float var28 = var4 + 1;
      byte var29 = 0;
      if ((var20 || var21) && !var22 && !var23) {
         var29 = 1;
      }

      if ((var22 || var23) && !var21 && !var20) {
         var29 = 2;
      }

      if (var29 != 0) {
         var10 = (var8 + 16) / 256.0F;
         var12 = (var8 + 16 + 15.99F) / 256.0F;
         var14 = var9 / 512.0F;
         var16 = (var9 + 15.99F) / 512.0F;
      }

      if (var29 == 0) {
         if (var21 || var22 || var23 || var20) {
            if (!var20) {
               var25 += var24;
            }

            if (!var20) {
               var10 += var24 / 16.0F;
            }

            if (!var21) {
               var26 -= var24;
            }

            if (!var21) {
               var12 -= var24 / 16.0F;
            }

            if (!var22) {
               var27 += var24;
            }

            if (!var22) {
               var14 += var24 / 32.0F;
            }

            if (!var23) {
               var28 -= var24;
            }

            if (!var23) {
               var16 -= var24 / 32.0F;
            }
         }

         var5.method_318(var26 + var18, var3 + var19, var28 + var18, var12, var16);
         var5.method_318(var26 + var18, var3 + var19, var27 - var18, var12, var14);
         var5.method_318(var25 - var18, var3 + var19, var27 - var18, var10, var14);
         var5.method_318(var25 - var18, var3 + var19, var28 + var18, var10, var16);
      }

      if (var29 == 1) {
         var5.method_318(var26 + var18, var3 + var19, var28 + var18, var12, var16);
         var5.method_318(var26 + var18, var3 + var19, var27 - var18, var12, var14);
         var5.method_318(var25 - var18, var3 + var19, var27 - var18, var10, var14);
         var5.method_318(var25 - var18, var3 + var19, var28 + var18, var10, var16);
      }

      if (var29 == 2) {
         var5.method_318(var26 + var18, var3 + var19, var28 + var18, var12, var16);
         var5.method_318(var26 + var18, var3 + var19, var27 - var18, var10, var16);
         var5.method_318(var25 - var18, var3 + var19, var27 - var18, var10, var14);
         var5.method_318(var25 - var18, var3 + var19, var28 + var18, var12, var14);
      }

      var10 = (var8 + 16) / 256.0F;
      var12 = (var8 + 16 + 15.99F) / 256.0F;
      var14 = var9 / 512.0F;
      var16 = (var9 + 15.99F) / 512.0F;
      if (!this.field_713.method_768(var2, var3 + 1, var4)) {
         if (this.field_713.method_768(var2 - 1, var3, var4) && this.field_713.method_197(var2 - 1, var3 + 1, var4) == Class108.field_2512.field_2151) {
            var5.method_318(var2 + var19, var3 + 1 + var18, var4 + 1 + var18, var12, var14);
            var5.method_318(var2 + var19, var3 + 0 - var18, var4 + 1 + var18, var10, var14);
            var5.method_318(var2 + var19, var3 + 0 - var18, var4 + 0 - var18, var10, var16);
            var5.method_318(var2 + var19, var3 + 1 + var18, var4 + 0 - var18, var12, var16);
         }

         if (this.field_713.method_768(var2 + 1, var3, var4) && this.field_713.method_197(var2 + 1, var3 + 1, var4) == Class108.field_2512.field_2151) {
            var5.method_318(var2 + 1 - var19, var3 + 0 - var18, var4 + 1 + var18, var10, var16);
            var5.method_318(var2 + 1 - var19, var3 + 1 + var18, var4 + 1 + var18, var12, var16);
            var5.method_318(var2 + 1 - var19, var3 + 1 + var18, var4 + 0 - var18, var12, var14);
            var5.method_318(var2 + 1 - var19, var3 + 0 - var18, var4 + 0 - var18, var10, var14);
         }

         if (this.field_713.method_768(var2, var3, var4 - 1) && this.field_713.method_197(var2, var3 + 1, var4 - 1) == Class108.field_2512.field_2151) {
            var5.method_318(var2 + 1 + var18, var3 + 0 - var18, var4 + var19, var10, var16);
            var5.method_318(var2 + 1 + var18, var3 + 1 + var18, var4 + var19, var12, var16);
            var5.method_318(var2 + 0 - var18, var3 + 1 + var18, var4 + var19, var12, var14);
            var5.method_318(var2 + 0 - var18, var3 + 0 - var18, var4 + var19, var10, var14);
         }

         if (this.field_713.method_768(var2, var3, var4 + 1) && this.field_713.method_197(var2, var3 + 1, var4 + 1) == Class108.field_2512.field_2151) {
            var5.method_318(var2 + 1 + var18, var3 + 1 + var18, var4 + 1 - var19, var12, var14);
            var5.method_318(var2 + 1 + var18, var3 + 0 - var18, var4 + 1 - var19, var10, var14);
            var5.method_318(var2 + 0 - var18, var3 + 0 - var18, var4 + 1 - var19, var10, var16);
            var5.method_318(var2 + 0 - var18, var3 + 1 + var18, var4 + 1 - var19, var12, var16);
         }
      }

      return true;
   }

   public boolean method_232(Class108 var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      int var6 = this.field_713.method_1110(var2, var3, var4);
      int var7 = var1.method_774(0, var6);
      if (this.field_1844 >= 0) {
         var7 = this.field_1844;
      }

      float var8 = var1.method_1320(this.field_713, var2, var3, var4);
      var5.method_1101(var8, var8, var8);
      int var9 = (var7 & 15) << 4;
      int var10 = var7 & 4080;
      double var11 = var9 / 256.0F;
      double var13 = (var9 + 15.99F) / 256.0F;
      double var15 = var10 / 512.0F;
      double var17 = (var10 + 15.99F) / 512.0F;
      float var19 = 0.0625F;
      float var20 = var2 + 1;
      float var21 = var2 + 1;
      float var22 = var2 + 0;
      float var23 = var2 + 0;
      float var24 = var4 + 0;
      float var25 = var4 + 1;
      float var26 = var4 + 1;
      float var27 = var4 + 0;
      float var28 = var3 + var19;
      float var29 = var3 + var19;
      float var30 = var3 + var19;
      float var31 = var3 + var19;
      if (var6 == 1 || var6 == 2 || var6 == 3 || var6 == 7) {
         var20 = var23 = var2 + 1;
         var21 = var22 = var2 + 0;
         var24 = var25 = var4 + 1;
         var26 = var27 = var4 + 0;
      } else if (var6 == 8) {
         var20 = var21 = var2 + 0;
         var22 = var23 = var2 + 1;
         var24 = var27 = var4 + 1;
         var25 = var26 = var4 + 0;
      } else if (var6 == 9) {
         var20 = var23 = var2 + 0;
         var21 = var22 = var2 + 1;
         var24 = var25 = var4 + 0;
         var26 = var27 = var4 + 1;
      }

      if (var6 == 2 || var6 == 4) {
         var28++;
         var31++;
      } else if (var6 == 3 || var6 == 5) {
         var29++;
         var30++;
      }

      var5.method_318(var20, var28, var24, var13, var15);
      var5.method_318(var21, var29, var25, var13, var17);
      var5.method_318(var22, var30, var26, var11, var17);
      var5.method_318(var23, var31, var27, var11, var15);
      var5.method_318(var23, var31, var27, var11, var15);
      var5.method_318(var22, var30, var26, var11, var17);
      var5.method_318(var21, var29, var25, var13, var17);
      var5.method_318(var20, var28, var24, var13, var15);
      return true;
   }

   public boolean method_384(Class108 var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      int var6 = var1.method_1735(0);
      if (this.field_1844 >= 0) {
         var6 = this.field_1844;
      }

      float var7 = var1.method_1320(this.field_713, var2, var3, var4);
      var5.method_1101(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 4080;
      double var10 = var8 / 256.0F;
      double var12 = (var8 + 15.99F) / 256.0F;
      double var14 = var9 / 512.0F;
      double var16 = (var9 + 15.99F) / 512.0F;
      int var18 = this.field_713.method_1110(var2, var3, var4);
      float var19 = 0.0F;
      float var20 = 0.05F;
      switch (var18) {
         case 2:
            var5.method_318(var2 + 1 + var19, var3 + 1 + var19, var4 + 1 - var20, var10, var14);
            var5.method_318(var2 + 1 + var19, var3 + 0 - var19, var4 + 1 - var20, var10, var16);
            var5.method_318(var2 + 0 - var19, var3 + 0 - var19, var4 + 1 - var20, var12, var16);
            var5.method_318(var2 + 0 - var19, var3 + 1 + var19, var4 + 1 - var20, var12, var14);
            break;
         case 3:
            var5.method_318(var2 + 1 + var19, var3 + 0 - var19, var4 + var20, var12, var16);
            var5.method_318(var2 + 1 + var19, var3 + 1 + var19, var4 + var20, var12, var14);
            var5.method_318(var2 + 0 - var19, var3 + 1 + var19, var4 + var20, var10, var14);
            var5.method_318(var2 + 0 - var19, var3 + 0 - var19, var4 + var20, var10, var16);
            break;
         case 4:
            var5.method_318(var2 + 1 - var20, var3 + 0 - var19, var4 + 1 + var19, var12, var16);
            var5.method_318(var2 + 1 - var20, var3 + 1 + var19, var4 + 1 + var19, var12, var14);
            var5.method_318(var2 + 1 - var20, var3 + 1 + var19, var4 + 0 - var19, var10, var14);
            var5.method_318(var2 + 1 - var20, var3 + 0 - var19, var4 + 0 - var19, var10, var16);
            break;
         case 5:
            var5.method_318(var2 + var20, var3 + 1 + var19, var4 + 1 + var19, var10, var14);
            var5.method_318(var2 + var20, var3 + 0 - var19, var4 + 1 + var19, var10, var16);
            var5.method_318(var2 + var20, var3 + 0 - var19, var4 + 0 - var19, var12, var16);
            var5.method_318(var2 + var20, var3 + 1 + var19, var4 + 0 - var19, var12, var14);
            break;
         case 6:
            var5.method_318(var2 + 1 + var19, var3 + 1 - var20, var4 + 1 + var19, var10, var14);
            var5.method_318(var2 + 0 - var19, var3 + 1 - var20, var4 + 1 + var19, var10, var16);
            var5.method_318(var2 + 0 - var19, var3 + 1 - var20, var4 + 0 - var19, var12, var16);
            var5.method_318(var2 + 1 + var19, var3 + 1 - var20, var4 + 0 - var19, var12, var14);
            break;
         case 7:
            var5.method_318(var2 + 1 + var19, var3 + var20, var4 + 1 + var19, var10, var14);
            var5.method_318(var2 + 1 + var19, var3 + var20, var4 + 0 - var19, var10, var16);
            var5.method_318(var2 + 0 - var19, var3 + var20, var4 + 0 - var19, var12, var16);
            var5.method_318(var2 + 0 - var19, var3 + var20, var4 + 1 + var19, var12, var14);
      }

      return true;
   }

   public boolean method_1117(Class108 var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      float var6 = var1.method_1320(this.field_713, var2, var3, var4);
      var5.method_1101(var6, var6, var6);
      this.method_1080(var1, this.field_713.method_1110(var2, var3, var4), var2, var3, var4);
      return true;
   }

   public boolean method_1409(Class108 var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      float var6 = var1.method_1320(this.field_713, var2, var3, var4);
      var5.method_1101(var6, var6, var6);
      this.method_1002(var1, this.field_713.method_1110(var2, var3, var4), var2, var3 - 0.0625F, var4);
      return true;
   }

   public void method_523(Class108 var1, double var2, double var4, double var6, double var8, double var10) {
      Class368 var12 = Class368.field_2696;
      int var13 = var1.method_1735(0);
      if (this.field_1844 >= 0) {
         var13 = this.field_1844;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 4080;
      float var16 = var14 / 256.0F;
      float var17 = (var14 + 15.99F) / 256.0F;
      float var18 = var15 / 512.0F;
      float var19 = (var15 + 15.99F) / 512.0F;
      double var20 = var16 + 0.02734375;
      double var22 = var18 + 0.0234375;
      double var24 = var16 + 0.03515625;
      double var26 = var18 + 0.03125;
      var2 += 0.5;
      var6 += 0.5;
      double var28 = var2 - 0.5;
      double var30 = var2 + 0.5;
      double var32 = var6 - 0.5;
      double var34 = var6 + 0.5;
      double var36 = 0.0625;
      double var38 = 0.625;
      var12.method_318(var2 + var8 * (1.0 - var38) - var36, var4 + var38, var6 + var10 * (1.0 - var38) - var36, var20, var22);
      var12.method_318(var2 + var8 * (1.0 - var38) - var36, var4 + var38, var6 + var10 * (1.0 - var38) + var36, var20, var26);
      var12.method_318(var2 + var8 * (1.0 - var38) + var36, var4 + var38, var6 + var10 * (1.0 - var38) + var36, var24, var26);
      var12.method_318(var2 + var8 * (1.0 - var38) + var36, var4 + var38, var6 + var10 * (1.0 - var38) - var36, var24, var22);
      var12.method_318(var2 - var36, var4 + 1.0, var32, var16, var18);
      var12.method_318(var2 - var36 + var8, var4 + 0.0, var32 + var10, var16, var19);
      var12.method_318(var2 - var36 + var8, var4 + 0.0, var34 + var10, var17, var19);
      var12.method_318(var2 - var36, var4 + 1.0, var34, var17, var18);
      var12.method_318(var2 + var36, var4 + 1.0, var34, var16, var18);
      var12.method_318(var2 + var8 + var36, var4 + 0.0, var34 + var10, var16, var19);
      var12.method_318(var2 + var8 + var36, var4 + 0.0, var32 + var10, var17, var19);
      var12.method_318(var2 + var36, var4 + 1.0, var32, var17, var18);
      var12.method_318(var28, var4 + 1.0, var6 + var36, var16, var18);
      var12.method_318(var28 + var8, var4 + 0.0, var6 + var36 + var10, var16, var19);
      var12.method_318(var30 + var8, var4 + 0.0, var6 + var36 + var10, var17, var19);
      var12.method_318(var30, var4 + 1.0, var6 + var36, var17, var18);
      var12.method_318(var30, var4 + 1.0, var6 - var36, var16, var18);
      var12.method_318(var30 + var8, var4 + 0.0, var6 - var36 + var10, var16, var19);
      var12.method_318(var28 + var8, var4 + 0.0, var6 - var36 + var10, var17, var19);
      var12.method_318(var28, var4 + 1.0, var6 - var36, var17, var18);
   }

   public void method_1080(Class108 var1, int var2, double var3, double var5, double var7) {
      Class368 var9 = Class368.field_2696;
      int var10 = var1.method_1005(this.field_713, 0, var2, var3, var5, var7);
      if (this.field_1844 >= 0) {
         var10 = this.field_1844;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 4080;
      double var13 = var11 / 256.0F;
      double var15 = (var11 + 15.99F) / 256.0F;
      double var17 = var12 / 512.0F;
      double var19 = (var12 + 15.99F) / 512.0F;
      double var21 = var3 + 0.5 - 0.45F;
      double var23 = var3 + 0.5 + 0.45F;
      double var25 = var7 + 0.5 - 0.45F;
      double var27 = var7 + 0.5 + 0.45F;
      var9.method_318(var21, var5 + 1.0, var25, var13, var17);
      var9.method_318(var21, var5 + 0.0, var25, var13, var19);
      var9.method_318(var23, var5 + 0.0, var27, var15, var19);
      var9.method_318(var23, var5 + 1.0, var27, var15, var17);
      var9.method_318(var23, var5 + 1.0, var27, var13, var17);
      var9.method_318(var23, var5 + 0.0, var27, var13, var19);
      var9.method_318(var21, var5 + 0.0, var25, var15, var19);
      var9.method_318(var21, var5 + 1.0, var25, var15, var17);
      var9.method_318(var21, var5 + 1.0, var27, var13, var17);
      var9.method_318(var21, var5 + 0.0, var27, var13, var19);
      var9.method_318(var23, var5 + 0.0, var25, var15, var19);
      var9.method_318(var23, var5 + 1.0, var25, var15, var17);
      var9.method_318(var23, var5 + 1.0, var25, var13, var17);
      var9.method_318(var23, var5 + 0.0, var25, var13, var19);
      var9.method_318(var21, var5 + 0.0, var27, var15, var19);
      var9.method_318(var21, var5 + 1.0, var27, var15, var17);
   }

   public void method_1002(Class108 var1, int var2, double var3, double var5, double var7) {
      Class368 var9 = Class368.field_2696;
      int var10 = var1.method_774(0, var2);
      if (this.field_1844 >= 0) {
         var10 = this.field_1844;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 4080;
      double var13 = var11 / 256.0F;
      double var15 = (var11 + 15.99F) / 256.0F;
      double var17 = var12 / 512.0F;
      double var19 = (var12 + 15.99F) / 512.0F;
      double var21 = var3 + 0.5 - 0.25;
      double var23 = var3 + 0.5 + 0.25;
      double var25 = var7 + 0.5 - 0.5;
      double var27 = var7 + 0.5 + 0.5;
      var9.method_318(var21, var5 + 1.0, var25, var13, var17);
      var9.method_318(var21, var5 + 0.0, var25, var13, var19);
      var9.method_318(var21, var5 + 0.0, var27, var15, var19);
      var9.method_318(var21, var5 + 1.0, var27, var15, var17);
      var9.method_318(var21, var5 + 1.0, var27, var13, var17);
      var9.method_318(var21, var5 + 0.0, var27, var13, var19);
      var9.method_318(var21, var5 + 0.0, var25, var15, var19);
      var9.method_318(var21, var5 + 1.0, var25, var15, var17);
      var9.method_318(var23, var5 + 1.0, var27, var13, var17);
      var9.method_318(var23, var5 + 0.0, var27, var13, var19);
      var9.method_318(var23, var5 + 0.0, var25, var15, var19);
      var9.method_318(var23, var5 + 1.0, var25, var15, var17);
      var9.method_318(var23, var5 + 1.0, var25, var13, var17);
      var9.method_318(var23, var5 + 0.0, var25, var13, var19);
      var9.method_318(var23, var5 + 0.0, var27, var15, var19);
      var9.method_318(var23, var5 + 1.0, var27, var15, var17);
      var21 = var3 + 0.5 - 0.5;
      var23 = var3 + 0.5 + 0.5;
      var25 = var7 + 0.5 - 0.25;
      var27 = var7 + 0.5 + 0.25;
      var9.method_318(var21, var5 + 1.0, var25, var13, var17);
      var9.method_318(var21, var5 + 0.0, var25, var13, var19);
      var9.method_318(var23, var5 + 0.0, var25, var15, var19);
      var9.method_318(var23, var5 + 1.0, var25, var15, var17);
      var9.method_318(var23, var5 + 1.0, var25, var13, var17);
      var9.method_318(var23, var5 + 0.0, var25, var13, var19);
      var9.method_318(var21, var5 + 0.0, var25, var15, var19);
      var9.method_318(var21, var5 + 1.0, var25, var15, var17);
      var9.method_318(var23, var5 + 1.0, var27, var13, var17);
      var9.method_318(var23, var5 + 0.0, var27, var13, var19);
      var9.method_318(var21, var5 + 0.0, var27, var15, var19);
      var9.method_318(var21, var5 + 1.0, var27, var15, var17);
      var9.method_318(var21, var5 + 1.0, var27, var13, var17);
      var9.method_318(var21, var5 + 0.0, var27, var13, var19);
      var9.method_318(var23, var5 + 0.0, var27, var15, var19);
      var9.method_318(var23, var5 + 1.0, var27, var15, var17);
   }

   public boolean method_1818(Class108 var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      boolean var6 = var1.method_991(this.field_713, var2, var3 + 1, var4, 1);
      boolean var7 = var1.method_991(this.field_713, var2, var3 - 1, var4, 0);
      boolean[] var8 = new boolean[]{
         var1.method_991(this.field_713, var2, var3, var4 - 1, 2),
         var1.method_991(this.field_713, var2, var3, var4 + 1, 3),
         var1.method_991(this.field_713, var2 - 1, var3, var4, 4),
         var1.method_991(this.field_713, var2 + 1, var3, var4, 5)
      };
      if (!var6 && !var7 && !var8[0] && !var8[1] && !var8[2] && !var8[3]) {
         return false;
      }

      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      double var14 = 0.0;
      double var16 = 1.0;
      Class160 var18 = var1.field_1854;
      int var19 = this.field_713.method_1110(var2, var3, var4);
      float var20 = this.method_349(var2, var3, var4, var18);
      float var21 = this.method_349(var2, var3, var4 + 1, var18);
      float var22 = this.method_349(var2 + 1, var3, var4 + 1, var18);
      float var23 = this.method_349(var2 + 1, var3, var4, var18);
      if (this.field_905 || var6) {
         var9 = true;
         int var24 = var1.method_774(1, var19);
         float var29 = (float)Class722.method_61(this.field_713, var2, var3, var4, var18);
         if (var29 > -999.0F) {
            var24 = var1.method_774(2, var19);
         }

         int var30 = (var24 & 15) << 4;
         int var25 = var24 & 4080;
         double var31 = (var30 + 8.0) / 256.0;
         double var33 = (var25 + 8.0) / 512.0;
         if (var29 < -999.0F) {
            var29 = 0.0F;
         } else {
            var31 = (var30 + 16) / 256.0F;
            var33 = (var25 + 16) / 512.0F;
         }

         float var35 = Class469.method_1667(var29) * 8.0F / 256.0F;
         float var36 = Class469.method_255(var29) * 8.0F / 256.0F;
         float var26 = Class469.method_1667(var29) * 8.0F / 512.0F;
         float var27 = Class469.method_255(var29) * 8.0F / 512.0F;
         float var28 = var1.method_876(this.field_713, var2, var3, var4);
         var5.method_1101(var11 * var28, var11 * var28, var11 * var28);
         var5.method_318(var2 + 0, var3 + var20, var4 + 0, var31 - var36 - var35, var33 - var27 + var26);
         var5.method_318(var2 + 0, var3 + var21, var4 + 1, var31 - var36 + var35, var33 + var27 + var26);
         var5.method_318(var2 + 1, var3 + var22, var4 + 1, var31 + var36 + var35, var33 + var27 - var26);
         var5.method_318(var2 + 1, var3 + var23, var4 + 0, var31 + var36 - var35, var33 - var27 - var26);
      }

      if (this.field_905 || var7) {
         float var52 = var1.method_1320(this.field_713, var2, var3 - 1, var4);
         var5.method_1101(var10 * var52, var10 * var52, var10 * var52);
         this.method_1116(var1, var2, var3, var4, var1.method_1735(0));
         var9 = true;
      }

      for (int var47 = 0; var47 < 4; var47++) {
         int var53 = var2;
         int var48 = var4;
         if (var47 == 0) {
            var48 = var4 - 1;
         }

         if (var47 == 1) {
            var48++;
         }

         if (var47 == 2) {
            var53 = var2 - 1;
         }

         if (var47 == 3) {
            var53++;
         }

         int var54 = var1.method_774(var47 + 2, var19);
         int var55 = (var54 & 15) << 4;
         int var32 = var54 & 4080;
         if (this.field_905 || var8[var47]) {
            float var34;
            float var49;
            float var50;
            float var51;
            float var56;
            float var57;
            if (var47 == 0) {
               var56 = var20;
               var49 = var23;
               var50 = var2;
               var34 = var2 + 1;
               var51 = var4;
               var57 = var4;
            } else if (var47 == 1) {
               var56 = var22;
               var49 = var21;
               var50 = var2 + 1;
               var34 = var2;
               var51 = var4 + 1;
               var57 = var4 + 1;
            } else if (var47 == 2) {
               var56 = var21;
               var49 = var20;
               var50 = var2;
               var34 = var2;
               var51 = var4 + 1;
               var57 = var4;
            } else {
               var56 = var23;
               var49 = var22;
               var50 = var2 + 1;
               var34 = var2 + 1;
               var51 = var4;
               var57 = var4 + 1;
            }

            var9 = true;
            double var58 = (var55 + 0) / 256.0F;
            double var38 = (var55 + 16 - 0.01) / 256.0;
            double var40 = (var32 + (1.0F - var56) * 16.0F) / 512.0F;
            double var42 = (var32 + (1.0F - var49) * 16.0F) / 512.0F;
            double var44 = (var32 + 16 - 0.01) / 512.0;
            float var46 = var1.method_1320(this.field_713, var53, var3, var48);
            if (var47 < 2) {
               var46 *= var12;
            } else {
               var46 *= var13;
            }

            var5.method_1101(var11 * var46, var11 * var46, var11 * var46);
            var5.method_318(var50, var3 + var56, var51, var58, var40);
            var5.method_318(var34, var3 + var49, var57, var38, var42);
            var5.method_318(var34, var3 + 0, var57, var38, var44);
            var5.method_318(var50, var3 + 0, var51, var58, var44);
         }
      }

      var1.field_2905 = var14;
      var1.field_84 = var16;
      return var9;
   }

   private float method_349(int var1, int var2, int var3, Class160 var4) {
      int var5 = 0;
      float var6 = 0.0F;

      for (int var7 = 0; var7 < 4; var7++) {
         int var8 = var1 - (var7 & 1);
         int var9 = var3 - (var7 >> 1 & 1);
         if (this.field_713.method_1286(var8, var2 + 1, var9) == var4) {
            return 1.0F;
         }

         Class160 var10 = this.field_713.method_1286(var8, var2, var9);
         if (var10 != var4) {
            if (!var10.method_1888()) {
               var6++;
               var5++;
            }
         } else {
            int var11 = this.field_713.method_1110(var8, var2, var9);
            if (var11 >= 8 || var11 == 0) {
               var6 += Class722.method_74(var11) * 10.0F;
               var5 += 10;
            }

            var6 += Class722.method_74(var11);
            var5++;
         }
      }

      return 1.0F - var6 / var5;
   }

   public void method_1849(Class108 var1, Class454 var2, int var3, int var4, int var5) {
      float var6 = 0.5F;
      float var7 = 1.0F;
      float var8 = 0.8F;
      float var9 = 0.6F;
      Class368 var10 = Class368.field_2696;
      var10.method_186();
      float var11 = var1.method_1320(var2, var3, var4, var5);
      float var12 = var1.method_1320(var2, var3, var4 - 1, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.method_1101(var6 * var12, var6 * var12, var6 * var12);
      this.method_1116(var1, -0.5, -0.5, -0.5, var1.method_1735(0));
      var12 = var1.method_1320(var2, var3, var4 + 1, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.method_1101(var7 * var12, var7 * var12, var7 * var12);
      this.method_1205(var1, -0.5, -0.5, -0.5, var1.method_1735(1));
      var12 = var1.method_1320(var2, var3, var4, var5 - 1);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.method_1101(var8 * var12, var8 * var12, var8 * var12);
      this.method_205(var1, -0.5, -0.5, -0.5, var1.method_1735(2));
      var12 = var1.method_1320(var2, var3, var4, var5 + 1);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.method_1101(var8 * var12, var8 * var12, var8 * var12);
      this.method_2(var1, -0.5, -0.5, -0.5, var1.method_1735(3));
      var12 = var1.method_1320(var2, var3 - 1, var4, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.method_1101(var9 * var12, var9 * var12, var9 * var12);
      this.method_1844(var1, -0.5, -0.5, -0.5, var1.method_1735(4));
      var12 = var1.method_1320(var2, var3 + 1, var4, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.method_1101(var9 * var12, var9 * var12, var9 * var12);
      this.method_1833(var1, -0.5, -0.5, -0.5, var1.method_1735(5));
      var10.method_406();
   }

   public boolean method_1424(Class108 var1, int var2, int var3, int var4) {
      int var5 = var1.method_606(this.field_713, var2, var3, var4);
      float var6 = (var5 >> 16 & 0xFF) / 255.0F;
      float var7 = (var5 >> 8 & 0xFF) / 255.0F;
      float var8 = (var5 & 0xFF) / 255.0F;
      return this.method_373(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean method_373(Class108 var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      Class368 var8 = Class368.field_2696;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = var1.method_1320(this.field_713, var2, var3, var4);
      if (this.field_905 || var1.method_991(this.field_713, var2, var3 - 1, var4, 0)) {
         float var27 = var1.method_1320(this.field_713, var2, var3 - 1, var4);
         var8.method_1101(var14 * var27, var18 * var27, var22 * var27);
         this.method_1116(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2, var3 + 1, var4, 1)) {
         float var28 = var1.method_1320(this.field_713, var2, var3 + 1, var4);
         if (var1.field_84 != 1.0 && !var1.field_1854.method_743()) {
            var28 = var26;
         }

         var8.method_1101(var15 * var28, var19 * var28, var23 * var28);
         this.method_1205(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2, var3, var4 - 1, 2)) {
         float var29 = var1.method_1320(this.field_713, var2, var3, var4 - 1);
         if (var1.field_1459 > 0.0) {
            var29 = var26;
         }

         var8.method_1101(var16 * var29, var20 * var29, var24 * var29);
         this.method_205(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 2));
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2, var3, var4 + 1, 3)) {
         float var30 = var1.method_1320(this.field_713, var2, var3, var4 + 1);
         if (var1.field_1426 < 1.0) {
            var30 = var26;
         }

         var8.method_1101(var16 * var30, var20 * var30, var24 * var30);
         this.method_2(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 3));
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2 - 1, var3, var4, 4)) {
         float var31 = var1.method_1320(this.field_713, var2 - 1, var3, var4);
         if (var1.field_1757 > 0.0) {
            var31 = var26;
         }

         var8.method_1101(var17 * var31, var21 * var31, var25 * var31);
         this.method_1844(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 4));
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2 + 1, var3, var4, 5)) {
         float var32 = var1.method_1320(this.field_713, var2 + 1, var3, var4);
         if (var1.field_1078 < 1.0) {
            var32 = var26;
         }

         var8.method_1101(var17 * var32, var21 * var32, var25 * var32);
         this.method_1833(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 5));
         var9 = true;
      }

      return var9;
   }

   public boolean method_561(Class108 var1, int var2, int var3, int var4) {
      int var5 = var1.method_606(this.field_713, var2, var3, var4);
      float var6 = (var5 >> 16 & 0xFF) / 255.0F;
      float var7 = (var5 >> 8 & 0xFF) / 255.0F;
      float var8 = (var5 & 0xFF) / 255.0F;
      return this.method_1(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean method_1(Class108 var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      Class368 var8 = Class368.field_2696;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = 0.0625F;
      float var27 = var1.method_1320(this.field_713, var2, var3, var4);
      if (this.field_905 || var1.method_991(this.field_713, var2, var3 - 1, var4, 0)) {
         float var28 = var1.method_1320(this.field_713, var2, var3 - 1, var4);
         var8.method_1101(var14 * var28, var18 * var28, var22 * var28);
         this.method_1116(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2, var3 + 1, var4, 1)) {
         float var29 = var1.method_1320(this.field_713, var2, var3 + 1, var4);
         if (var1.field_84 != 1.0 && !var1.field_1854.method_743()) {
            var29 = var27;
         }

         var8.method_1101(var15 * var29, var19 * var29, var23 * var29);
         this.method_1205(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2, var3, var4 - 1, 2)) {
         float var30 = var1.method_1320(this.field_713, var2, var3, var4 - 1);
         if (var1.field_1459 > 0.0) {
            var30 = var27;
         }

         var8.method_1101(var16 * var30, var20 * var30, var24 * var30);
         var8.method_1167(0.0F, 0.0F, var26);
         this.method_205(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 2));
         var8.method_1167(0.0F, 0.0F, -var26);
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2, var3, var4 + 1, 3)) {
         float var31 = var1.method_1320(this.field_713, var2, var3, var4 + 1);
         if (var1.field_1426 < 1.0) {
            var31 = var27;
         }

         var8.method_1101(var16 * var31, var20 * var31, var24 * var31);
         var8.method_1167(0.0F, 0.0F, -var26);
         this.method_2(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 3));
         var8.method_1167(0.0F, 0.0F, var26);
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2 - 1, var3, var4, 4)) {
         float var32 = var1.method_1320(this.field_713, var2 - 1, var3, var4);
         if (var1.field_1757 > 0.0) {
            var32 = var27;
         }

         var8.method_1101(var17 * var32, var21 * var32, var25 * var32);
         var8.method_1167(var26, 0.0F, 0.0F);
         this.method_1844(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 4));
         var8.method_1167(-var26, 0.0F, 0.0F);
         var9 = true;
      }

      if (this.field_905 || var1.method_991(this.field_713, var2 + 1, var3, var4, 5)) {
         float var33 = var1.method_1320(this.field_713, var2 + 1, var3, var4);
         if (var1.field_1078 < 1.0) {
            var33 = var27;
         }

         var8.method_1101(var17 * var33, var21 * var33, var25 * var33);
         var8.method_1167(-var26, 0.0F, 0.0F);
         this.method_1833(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 5));
         var8.method_1167(var26, 0.0F, 0.0F);
         var9 = true;
      }

      return var9;
   }

   public boolean method_621(Class108 var1, int var2, int var3, int var4) {
      boolean var5 = false;
      float var6 = 0.375F;
      float var7 = 0.625F;
      var1.method_1618(var6, 0.0F, var6, var7, 1.0F, var7);
      this.method_1424(var1, var2, var3, var4);
      boolean var8 = false;
      boolean var9 = false;
      if (this.field_713.method_197(var2 - 1, var3, var4) == var1.field_2151 || this.field_713.method_197(var2 + 1, var3, var4) == var1.field_2151) {
         var8 = true;
      }

      if (this.field_713.method_197(var2, var3, var4 - 1) == var1.field_2151 || this.field_713.method_197(var2, var3, var4 + 1) == var1.field_2151) {
         var9 = true;
      }

      boolean var10 = this.field_713.method_197(var2 - 1, var3, var4) == var1.field_2151;
      boolean var11 = this.field_713.method_197(var2 + 1, var3, var4) == var1.field_2151;
      boolean var12 = this.field_713.method_197(var2, var3, var4 - 1) == var1.field_2151;
      boolean var13 = this.field_713.method_197(var2, var3, var4 + 1) == var1.field_2151;
      if (!var8 && !var9) {
         var8 = true;
      }

      var6 = 0.4375F;
      var7 = 0.5625F;
      float var14 = 0.75F;
      float var15 = 0.9375F;
      float var16 = var10 ? 0.0F : var6;
      float var17 = var11 ? 1.0F : var7;
      float var18 = var12 ? 0.0F : var6;
      float var19 = var13 ? 1.0F : var7;
      if (var8) {
         var1.method_1618(var16, var14, var6, var17, var15, var7);
         this.method_1424(var1, var2, var3, var4);
      }

      if (var9) {
         var1.method_1618(var6, var14, var18, var7, var15, var19);
         this.method_1424(var1, var2, var3, var4);
      }

      var14 = 0.375F;
      var15 = 0.5625F;
      if (var8) {
         var1.method_1618(var16, var14, var6, var17, var15, var7);
         this.method_1424(var1, var2, var3, var4);
      }

      if (var9) {
         var1.method_1618(var6, var14, var18, var7, var15, var19);
         this.method_1424(var1, var2, var3, var4);
      }

      var1.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean method_594(Class108 var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = this.field_713.method_1110(var2, var3, var4);
      if (var6 == 0) {
         var1.method_1618(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         this.method_1424(var1, var2, var3, var4);
         var1.method_1618(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         this.method_1424(var1, var2, var3, var4);
      } else if (var6 == 1) {
         var1.method_1618(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         this.method_1424(var1, var2, var3, var4);
         var1.method_1618(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         this.method_1424(var1, var2, var3, var4);
      } else if (var6 == 2) {
         var1.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         this.method_1424(var1, var2, var3, var4);
         var1.method_1618(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         this.method_1424(var1, var2, var3, var4);
      } else if (var6 == 3) {
         var1.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         this.method_1424(var1, var2, var3, var4);
         var1.method_1618(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         this.method_1424(var1, var2, var3, var4);
      }

      var1.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean method_937(Class108 var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      Class604 var6 = (Class604)var1;
      boolean var7 = false;
      float var8 = 0.5F;
      float var9 = 1.0F;
      float var10 = 0.8F;
      float var11 = 0.6F;
      float var12 = var1.method_1320(this.field_713, var2, var3, var4);
      float var13 = var1.method_1320(this.field_713, var2, var3 - 1, var4);
      if (var6.field_2905 > 0.0) {
         var13 = var12;
      }

      if (Class108.field_2146[var1.field_2151] > 0) {
         var13 = 1.0F;
      }

      var5.method_1101(var8 * var13, var8 * var13, var8 * var13);
      this.method_1116(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 0));
      var7 = true;
      var13 = var1.method_1320(this.field_713, var2, var3 + 1, var4);
      if (var6.field_84 < 1.0) {
         var13 = var12;
      }

      if (Class108.field_2146[var1.field_2151] > 0) {
         var13 = 1.0F;
      }

      var5.method_1101(var9 * var13, var9 * var13, var9 * var13);
      this.method_1205(var1, var2, var3, var4, var1.method_213(this.field_713, var2, var3, var4, 1));
      var7 = true;
      var13 = var1.method_1320(this.field_713, var2, var3, var4 - 1);
      if (var6.field_1459 > 0.0) {
         var13 = var12;
      }

      if (Class108.field_2146[var1.field_2151] > 0) {
         var13 = 1.0F;
      }

      var5.method_1101(var10 * var13, var10 * var13, var10 * var13);
      int var14 = var1.method_213(this.field_713, var2, var3, var4, 2);
      if (var14 < 0) {
         this.field_1299 = true;
         var14 = -var14;
      }

      this.method_205(var1, var2, var3, var4, var14);
      var7 = true;
      this.field_1299 = false;
      var13 = var1.method_1320(this.field_713, var2, var3, var4 + 1);
      if (var6.field_1426 < 1.0) {
         var13 = var12;
      }

      if (Class108.field_2146[var1.field_2151] > 0) {
         var13 = 1.0F;
      }

      var5.method_1101(var10 * var13, var10 * var13, var10 * var13);
      var14 = var1.method_213(this.field_713, var2, var3, var4, 3);
      if (var14 < 0) {
         this.field_1299 = true;
         var14 = -var14;
      }

      this.method_2(var1, var2, var3, var4, var14);
      var7 = true;
      this.field_1299 = false;
      var13 = var1.method_1320(this.field_713, var2 - 1, var3, var4);
      if (var6.field_1757 > 0.0) {
         var13 = var12;
      }

      if (Class108.field_2146[var1.field_2151] > 0) {
         var13 = 1.0F;
      }

      var5.method_1101(var11 * var13, var11 * var13, var11 * var13);
      var14 = var1.method_213(this.field_713, var2, var3, var4, 4);
      if (var14 < 0) {
         this.field_1299 = true;
         var14 = -var14;
      }

      this.method_1844(var1, var2, var3, var4, var14);
      var7 = true;
      this.field_1299 = false;
      var13 = var1.method_1320(this.field_713, var2 + 1, var3, var4);
      if (var6.field_1078 < 1.0) {
         var13 = var12;
      }

      if (Class108.field_2146[var1.field_2151] > 0) {
         var13 = 1.0F;
      }

      var5.method_1101(var11 * var13, var11 * var13, var11 * var13);
      var14 = var1.method_213(this.field_713, var2, var3, var4, 5);
      if (var14 < 0) {
         this.field_1299 = true;
         var14 = -var14;
      }

      this.method_1833(var1, var2, var3, var4, var14);
      var7 = true;
      this.field_1299 = false;
      return var7;
   }

   public void method_1116(Class108 var1, double var2, double var4, double var6, int var8) {
      Class368 var9 = Class368.field_2696;
      if (this.field_1844 >= 0) {
         var8 = this.field_1844;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 4080;
      double var12 = (var10 + var1.field_1757 * 16.0) / 256.0;
      double var14 = (var10 + var1.field_1078 * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.field_1459 * 16.0) / 512.0;
      double var18 = (var11 + var1.field_1426 * 16.0 - 0.01) / 512.0;
      if (var1.field_1757 < 0.0 || var1.field_1078 > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.field_1459 < 0.0 || var1.field_1426 > 1.0) {
         var16 = (var11 + 0.0F) / 512.0F;
         var18 = (var11 + 15.99F) / 512.0F;
      }

      double var20 = var2 + var1.field_1757;
      double var22 = var2 + var1.field_1078;
      double var24 = var4 + var1.field_2905;
      double var26 = var6 + var1.field_1459;
      double var28 = var6 + var1.field_1426;
      var9.method_318(var20, var24, var28, var12, var18);
      var9.method_318(var20, var24, var26, var12, var16);
      var9.method_318(var22, var24, var26, var14, var16);
      var9.method_318(var22, var24, var28, var14, var18);
   }

   public void method_1205(Class108 var1, double var2, double var4, double var6, int var8) {
      Class368 var9 = Class368.field_2696;
      if (this.field_1844 >= 0) {
         var8 = this.field_1844;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 4080;
      double var12 = (var10 + var1.field_1757 * 16.0) / 256.0;
      double var14 = (var10 + var1.field_1078 * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.field_1459 * 16.0) / 512.0;
      double var18 = (var11 + var1.field_1426 * 16.0 - 0.01) / 512.0;
      if (var1.field_1757 < 0.0 || var1.field_1078 > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.field_1459 < 0.0 || var1.field_1426 > 1.0) {
         var16 = (var11 + 0.0F) / 512.0F;
         var18 = (var11 + 15.99F) / 512.0F;
      }

      double var20 = var2 + var1.field_1757;
      double var22 = var2 + var1.field_1078;
      double var24 = var4 + var1.field_84;
      double var26 = var6 + var1.field_1459;
      double var28 = var6 + var1.field_1426;
      var9.method_318(var22, var24, var28, var14, var18);
      var9.method_318(var22, var24, var26, var14, var16);
      var9.method_318(var20, var24, var26, var12, var16);
      var9.method_318(var20, var24, var28, var12, var18);
   }

   public void method_205(Class108 var1, double var2, double var4, double var6, int var8) {
      Class368 var9 = Class368.field_2696;
      if (this.field_1844 >= 0) {
         var8 = this.field_1844;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 4080;
      double var12 = (var10 + var1.field_1757 * 16.0) / 256.0;
      double var14 = (var10 + var1.field_1078 * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.field_2905 * 16.0) / 512.0;
      double var18 = (var11 + var1.field_84 * 16.0 - 0.01) / 512.0;
      if (this.field_1299) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.field_1757 < 0.0 || var1.field_1078 > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.field_2905 < 0.0 || var1.field_84 > 1.0) {
         var16 = (var11 + 0.0F) / 512.0F;
         var18 = (var11 + 15.99F) / 512.0F;
      }

      double var30 = var2 + var1.field_1757;
      double var22 = var2 + var1.field_1078;
      double var24 = var4 + var1.field_2905;
      double var26 = var4 + var1.field_84;
      double var28 = var6 + var1.field_1459;
      var9.method_318(var30, var26, var28, var14, var16);
      var9.method_318(var22, var26, var28, var12, var16);
      var9.method_318(var22, var24, var28, var12, var18);
      var9.method_318(var30, var24, var28, var14, var18);
   }

   public void method_2(Class108 var1, double var2, double var4, double var6, int var8) {
      Class368 var9 = Class368.field_2696;
      if (this.field_1844 >= 0) {
         var8 = this.field_1844;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 4080;
      double var12 = (var10 + var1.field_1757 * 16.0) / 256.0;
      double var14 = (var10 + var1.field_1078 * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.field_2905 * 16.0) / 512.0;
      double var18 = (var11 + var1.field_84 * 16.0 - 0.01) / 512.0;
      if (this.field_1299) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.field_1757 < 0.0 || var1.field_1078 > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.field_2905 < 0.0 || var1.field_84 > 1.0) {
         var16 = (var11 + 0.0F) / 512.0F;
         var18 = (var11 + 15.99F) / 512.0F;
      }

      double var30 = var2 + var1.field_1757;
      double var22 = var2 + var1.field_1078;
      double var24 = var4 + var1.field_2905;
      double var26 = var4 + var1.field_84;
      double var28 = var6 + var1.field_1426;
      var9.method_318(var30, var26, var28, var12, var16);
      var9.method_318(var30, var24, var28, var12, var18);
      var9.method_318(var22, var24, var28, var14, var18);
      var9.method_318(var22, var26, var28, var14, var16);
   }

   public void method_1844(Class108 var1, double var2, double var4, double var6, int var8) {
      Class368 var9 = Class368.field_2696;
      if (this.field_1844 >= 0) {
         var8 = this.field_1844;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 4080;
      double var12 = (var10 + var1.field_1459 * 16.0) / 256.0;
      double var14 = (var10 + var1.field_1426 * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.field_2905 * 16.0) / 512.0;
      double var18 = (var11 + var1.field_84 * 16.0 - 0.01) / 512.0;
      if (this.field_1299) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.field_1459 < 0.0 || var1.field_1426 > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.field_2905 < 0.0 || var1.field_84 > 1.0) {
         var16 = (var11 + 0.0F) / 512.0F;
         var18 = (var11 + 15.99F) / 512.0F;
      }

      double var30 = var2 + var1.field_1757;
      double var22 = var4 + var1.field_2905;
      double var24 = var4 + var1.field_84;
      double var26 = var6 + var1.field_1459;
      double var28 = var6 + var1.field_1426;
      var9.method_318(var30, var24, var28, var14, var16);
      var9.method_318(var30, var24, var26, var12, var16);
      var9.method_318(var30, var22, var26, var12, var18);
      var9.method_318(var30, var22, var28, var14, var18);
   }

   public void method_1833(Class108 var1, double var2, double var4, double var6, int var8) {
      Class368 var9 = Class368.field_2696;
      if (this.field_1844 >= 0) {
         var8 = this.field_1844;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 4080;
      double var12 = (var10 + var1.field_1459 * 16.0) / 256.0;
      double var14 = (var10 + var1.field_1426 * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.field_2905 * 16.0) / 512.0;
      double var18 = (var11 + var1.field_84 * 16.0 - 0.01) / 512.0;
      if (this.field_1299) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.field_1459 < 0.0 || var1.field_1426 > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.field_2905 < 0.0 || var1.field_84 > 1.0) {
         var16 = (var11 + 0.0F) / 512.0F;
         var18 = (var11 + 15.99F) / 512.0F;
      }

      double var30 = var2 + var1.field_1078;
      double var22 = var4 + var1.field_2905;
      double var24 = var4 + var1.field_84;
      double var26 = var6 + var1.field_1459;
      double var28 = var6 + var1.field_1426;
      var9.method_318(var30, var22, var28, var12, var18);
      var9.method_318(var30, var22, var26, var14, var18);
      var9.method_318(var30, var24, var26, var14, var16);
      var9.method_318(var30, var24, var28, var12, var16);
   }

   public void method_533(Class108 var1, float var2) {
      this.method_819(var1, var2, false);
   }

   public void method_819(Class108 var1, float var2, boolean var3) {
      int var4 = var1.method_1900();
      Class368 var5 = Class368.field_2696;
      if (var4 == 0) {
         var1.method_1035();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var6 = 0.5F;
         float var7 = 1.0F;
         float var8 = 0.8F;
         float var9 = 0.6F;
         var5.method_1284(var3);
         var5.method_1120(var7, var7, var7, var2);
         this.method_1116(var1, 0.0, 0.0, 0.0, var1.method_1735(0));
         var5.method_1120(var6, var6, var6, var2);
         this.method_1205(var1, 0.0, 0.0, 0.0, var1.method_1735(1));
         var5.method_1120(var8, var8, var8, var2);
         this.method_205(var1, 0.0, 0.0, 0.0, var1.method_1735(2));
         this.method_2(var1, 0.0, 0.0, 0.0, var1.method_1735(3));
         var5.method_1120(var9, var9, var9, var2);
         this.method_1844(var1, 0.0, 0.0, 0.0, var1.method_1735(4));
         this.method_1833(var1, 0.0, 0.0, 0.0, var1.method_1735(5));
         var5.method_406();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }

      if (var4 == 14) {
         var1.method_1035();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         this.method_1621(var1, 0, 0, 0, true);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }
   }

   public void method_234(Class108 var1) {
      byte var2 = -1;
      Class368 var3 = Class368.field_2696;
      int var4 = var1.method_1900();
      switch (var4) {
         case 1:
            var3.method_1284(true);
            var3.method_548(0.0F, -1.0F, 0.0F);
            this.method_1080(var1, var2, -0.5, -0.5, -0.5);
            var3.method_406();
            break;
         case 2:
            var3.method_1284(true);
            var3.method_548(0.0F, -1.0F, 0.0F);
            this.method_523(var1, -0.5, -0.5, -0.5, 0.0, 0.0);
            var3.method_406();
            break;
         case 3:
         case 4:
         case 5:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         default:
            if (var4 == 10) {
               for (int var6 = 0; var6 < 2; var6++) {
                  if (var6 == 0) {
                     var1.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
                  }

                  if (var6 == 1) {
                     var1.method_1618(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
                  }

                  GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                  var3.method_1284(true);
                  var3.method_548(0.0F, -1.0F, 0.0F);
                  this.method_1116(var1, 0.0, 0.0, 0.0, var1.method_1735(0));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(0.0F, 1.0F, 0.0F);
                  this.method_1205(var1, 0.0, 0.0, 0.0, var1.method_1735(1));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(0.0F, 0.0F, -1.0F);
                  this.method_205(var1, 0.0, 0.0, 0.0, var1.method_1735(2));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(0.0F, 0.0F, 1.0F);
                  this.method_2(var1, 0.0, 0.0, 0.0, var1.method_1735(3));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(-1.0F, 0.0F, 0.0F);
                  this.method_1844(var1, 0.0, 0.0, 0.0, var1.method_1735(4));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(1.0F, 0.0F, 0.0F);
                  this.method_1833(var1, 0.0, 0.0, 0.0, var1.method_1735(5));
                  var3.method_406();
                  GL11.glTranslatef(0.5F, 0.5F, 0.5F);
               }
            } else if (var4 == 11) {
               for (int var8 = 0; var8 < 4; var8++) {
                  float var7 = 0.125F;
                  if (var8 == 0) {
                     var1.method_1618(0.5F - var7, 0.0F, 0.0F, 0.5F + var7, 1.0F, var7 * 2.0F);
                  }

                  if (var8 == 1) {
                     var1.method_1618(0.5F - var7, 0.0F, 1.0F - var7 * 2.0F, 0.5F + var7, 1.0F, 1.0F);
                  }

                  var7 = 0.0625F;
                  if (var8 == 2) {
                     var1.method_1618(0.5F - var7, 1.0F - var7 * 3.0F, -var7 * 2.0F, 0.5F + var7, 1.0F - var7, 1.0F + var7 * 2.0F);
                  }

                  if (var8 == 3) {
                     var1.method_1618(0.5F - var7, 0.5F - var7 * 3.0F, -var7 * 2.0F, 0.5F + var7, 0.5F - var7, 1.0F + var7 * 2.0F);
                  }

                  GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                  var3.method_1284(true);
                  var3.method_548(0.0F, -1.0F, 0.0F);
                  this.method_1116(var1, 0.0, 0.0, 0.0, var1.method_1735(0));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(0.0F, 1.0F, 0.0F);
                  this.method_1205(var1, 0.0, 0.0, 0.0, var1.method_1735(1));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(0.0F, 0.0F, -1.0F);
                  this.method_205(var1, 0.0, 0.0, 0.0, var1.method_1735(2));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(0.0F, 0.0F, 1.0F);
                  this.method_2(var1, 0.0, 0.0, 0.0, var1.method_1735(3));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(-1.0F, 0.0F, 0.0F);
                  this.method_1844(var1, 0.0, 0.0, 0.0, var1.method_1735(4));
                  var3.method_406();
                  var3.method_1284(true);
                  var3.method_548(1.0F, 0.0F, 0.0F);
                  this.method_1833(var1, 0.0, 0.0, 0.0, var1.method_1735(5));
                  var3.method_406();
                  GL11.glTranslatef(0.5F, 0.5F, 0.5F);
               }

               var1.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
            break;
         case 6:
            var3.method_1284(true);
            var3.method_548(0.0F, -1.0F, 0.0F);
            this.method_1002(var1, var2, -0.5, -0.5, -0.5);
            var3.method_406();
            break;
         case 13:
            var1.method_1035();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float var5 = 0.0625F;
            var3.method_1284(true);
            var3.method_548(0.0F, -1.0F, 0.0F);
            this.method_1116(var1, 0.0, 0.0, 0.0, var1.method_1735(0));
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(0.0F, 1.0F, 0.0F);
            this.method_1205(var1, 0.0, 0.0, 0.0, var1.method_1735(1));
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(0.0F, 0.0F, -1.0F);
            var3.method_1167(0.0F, 0.0F, var5);
            this.method_205(var1, 0.0, 0.0, 0.0, var1.method_1735(2));
            var3.method_1167(0.0F, 0.0F, -var5);
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(0.0F, 0.0F, 1.0F);
            var3.method_1167(0.0F, 0.0F, -var5);
            this.method_2(var1, 0.0, 0.0, 0.0, var1.method_1735(3));
            var3.method_1167(0.0F, 0.0F, var5);
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(-1.0F, 0.0F, 0.0F);
            var3.method_1167(var5, 0.0F, 0.0F);
            this.method_1844(var1, 0.0, 0.0, 0.0, var1.method_1735(4));
            var3.method_1167(-var5, 0.0F, 0.0F);
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(1.0F, 0.0F, 0.0F);
            var3.method_1167(-var5, 0.0F, 0.0F);
            this.method_1833(var1, 0.0, 0.0, 0.0, var1.method_1735(5));
            var3.method_1167(var5, 0.0F, 0.0F);
            var3.method_406();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            break;
         case 14:
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            this.method_1621(var1, 0, 0, 0, true);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         case 0:
            var1.method_1035();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var3.method_1284(true);
            var3.method_548(0.0F, -1.0F, 0.0F);
            this.method_1116(var1, 0.0, 0.0, 0.0, var1.method_1735(0));
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(0.0F, 1.0F, 0.0F);
            this.method_1205(var1, 0.0, 0.0, 0.0, var1.method_1735(1));
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(0.0F, 0.0F, -1.0F);
            this.method_205(var1, 0.0, 0.0, 0.0, var1.method_1735(2));
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(0.0F, 0.0F, 1.0F);
            this.method_2(var1, 0.0, 0.0, 0.0, var1.method_1735(3));
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(-1.0F, 0.0F, 0.0F);
            this.method_1844(var1, 0.0, 0.0, 0.0, var1.method_1735(4));
            var3.method_406();
            var3.method_1284(true);
            var3.method_548(1.0F, 0.0F, 0.0F);
            this.method_1833(var1, 0.0, 0.0, 0.0, var1.method_1735(5));
            var3.method_406();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }
   }

   public static boolean method_759(int var0) {
      return var0 == 0 ? true : (var0 == 13 ? true : (var0 == 10 ? true : var0 == 11));
   }
}
