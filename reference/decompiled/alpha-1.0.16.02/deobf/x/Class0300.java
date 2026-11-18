package x;

import org.lwjgl.opengl.GL11;

public class Class0300 {
   protected float j = 0.0F;

   protected void a(int var1, int var2, int var3, int var4, int var5) {
      float var6 = (var5 >> 24 & 0xFF) / 255.0F;
      float var7 = (var5 >> 16 & 0xFF) / 255.0F;
      float var8 = (var5 >> 8 & 0xFF) / 255.0F;
      float var9 = (var5 & 0xFF) / 255.0F;
      Class0195 var10 = Class0195.a;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(var7, var8, var9, var6);
      var10.b();
      var10.a(var1, var4, 0.0);
      var10.a(var3, var4, 0.0);
      var10.a(var3, var2, 0.0);
      var10.a(var1, var2, 0.0);
      var10.a();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   protected void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (var5 >> 24 & 0xFF) / 255.0F;
      float var8 = (var5 >> 16 & 0xFF) / 255.0F;
      float var9 = (var5 >> 8 & 0xFF) / 255.0F;
      float var10 = (var5 & 0xFF) / 255.0F;
      float var11 = (var6 >> 24 & 0xFF) / 255.0F;
      float var12 = (var6 >> 16 & 0xFF) / 255.0F;
      float var13 = (var6 >> 8 & 0xFF) / 255.0F;
      float var14 = (var6 & 0xFF) / 255.0F;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      Class0195 var15 = Class0195.a;
      var15.b();
      var15.a(var8, var9, var10, var7);
      var15.a(var3, var2, 0.0);
      var15.a(var1, var2, 0.0);
      var15.a(var12, var13, var14, var11);
      var15.a(var1, var4, 0.0);
      var15.a(var3, var4, 0.0);
      var15.a();
      GL11.glShadeModel(7424);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(3553);
   }

   public void a(Class0264 var1, String var2, int var3, int var4, int var5) {
      var1.a(var2, var3 - var1.a(var2) / 2, var4, var5);
   }

   public void b(Class0264 var1, String var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, var5);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      Class0195 var9 = Class0195.a;
      var9.b();
      var9.a(var1 + 0, var2 + var6, this.j, (var3 + 0) * var7, (var4 + var6) * var8);
      var9.a(var1 + var5, var2 + var6, this.j, (var3 + var5) * var7, (var4 + var6) * var8);
      var9.a(var1 + var5, var2 + 0, this.j, (var3 + var5) * var7, (var4 + 0) * var8);
      var9.a(var1 + 0, var2 + 0, this.j, (var3 + 0) * var7, (var4 + 0) * var8);
      var9.a();
   }
}
