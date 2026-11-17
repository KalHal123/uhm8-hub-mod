package ext;

import org.lwjgl.opengl.GL11;

public class Class254 {
   protected float field_1275 = 0.0F;

   public static void method_194(int var0, int var1, int var2, int var3, int var4) {
      float var5 = (var4 >> 24 & 0xFF) / 255.0F;
      float var6 = (var4 >> 16 & 0xFF) / 255.0F;
      float var7 = (var4 >> 8 & 0xFF) / 255.0F;
      float var8 = (var4 & 0xFF) / 255.0F;
      Class368 var9 = Class368.field_2696;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(var6, var7, var8, var5);
      var9.method_1284(true);
      var9.method_1724(var0, var3, 0.0);
      var9.method_1724(var2, var3, 0.0);
      var9.method_1724(var2, var1, 0.0);
      var9.method_1724(var0, var1, 0.0);
      var9.method_406();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   public static void method_421(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var0;
      int var7 = var1;
      int var8 = var2;
      int var9 = var3;
      int var10 = var4;
      int var11 = var5;
      float var12 = (var10 >> 24 & 0xFF) / 255.0F;
      float var13 = (var10 >> 16 & 0xFF) / 255.0F;
      float var14 = (var10 >> 8 & 0xFF) / 255.0F;
      float var15 = (var10 & 0xFF) / 255.0F;
      float var16 = (var11 >> 24 & 0xFF) / 255.0F;
      float var17 = (var11 >> 16 & 0xFF) / 255.0F;
      float var18 = (var11 >> 8 & 0xFF) / 255.0F;
      float var19 = (var11 & 0xFF) / 255.0F;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      Class368 var20 = Class368.field_2696;
      var20.method_1284(true);
      var20.method_1120(var13, var14, var15, var12);
      var20.method_1724(var8, var7, 0.0);
      var20.method_1724(var6, var7, 0.0);
      var20.method_1120(var17, var18, var19, var16);
      var20.method_1724(var6, var9, 0.0);
      var20.method_1724(var8, var9, 0.0);
      var20.method_406();
      GL11.glShadeModel(7424);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(3553);
   }

   public void method_1491(Class640 var1, String var2, int var3, int var4, int var5) {
      var1.method_1444(var2, var3 - var1.method_962(var2) / 2, var4, var5);
   }

   public static void method_773(Class640 var0, String var1, int var2, int var3, int var4) {
      var0.method_1444(var1, var2, var3, var4);
   }

   public void method_1219(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      Class368 var9 = Class368.field_2696;
      var9.method_1284(true);
      var9.method_318(var1 + 0, var2 + var6, this.field_1275, (var3 + 0) * var7, (var4 + var6) * var8);
      var9.method_318(var1 + var5, var2 + var6, this.field_1275, (var3 + var5) * var7, (var4 + var6) * var8);
      var9.method_318(var1 + var5, var2 + 0, this.field_1275, (var3 + var5) * var7, (var4 + 0) * var8);
      var9.method_318(var1 + 0, var2 + 0, this.field_1275, (var3 + 0) * var7, (var4 + 0) * var8);
      var9.method_406();
   }
}
