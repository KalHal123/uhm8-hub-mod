package ext;

import org.lwjgl.opengl.GL11;

public class Class319 extends Class459 {
   public void method_1604(Class565 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable(32826);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      int var10 = Class755.field_103.method_1543((Class334)null);
      this.method_1261("/gui/items.png");
      Class368 var11 = Class368.field_2696;
      float var12 = (var10 % 16 * 16 + 0) / 256.0F;
      float var13 = (var10 % 16 * 16 + 16) / 256.0F;
      float var14 = (var10 / 16 * 16 + 0) / 256.0F;
      float var15 = (var10 / 16 * 16 + 16) / 256.0F;
      float var16 = 1.0F;
      float var17 = 0.5F;
      float var18 = 0.25F;
      GL11.glRotatef(180.0F - this.field_40.field_376, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_40.field_519, 1.0F, 0.0F, 0.0F);
      var11.method_186();
      var11.method_548(0.0F, 1.0F, 0.0F);
      var11.method_318(0.0F - var17, 0.0F - var18, 0.0, var12, var15);
      var11.method_318(var16 - var17, 0.0F - var18, 0.0, var13, var15);
      var11.method_318(var16 - var17, 1.0F - var18, 0.0, var13, var14);
      var11.method_318(0.0F - var17, 1.0F - var18, 0.0, var12, var14);
      var11.method_406();
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_1604((Class565)var1, var2, var4, var6, var8, var9);
   }
}
