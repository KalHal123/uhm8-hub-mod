package ext;

import org.lwjgl.opengl.GL11;

public class Class509 extends Class459 {
   public boolean field_323 = false;

   public Class509(boolean var1) {
      this.field_323 = var1;
   }

   public void method_1243(Class408 var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.field_323) {
         Class584.method_62();
      }

      this.method_1261(var1.method_431());
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var1.field_2772 + (var1.field_1661 - var1.field_2772) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var1.field_2984 + (var1.field_2866 - var1.field_2984) * var9, 0.0F, 0.0F, 1.0F);
      Class368 var10 = Class368.field_2696;
      byte var11 = 0;
      float var12 = 0.0F;
      float var13 = 0.5F;
      float var14 = (0 + var11 * 10) / 32.0F;
      float var15 = (5 + var11 * 10) / 32.0F;
      float var16 = 0.0F;
      float var17 = 0.15625F;
      float var18 = (5 + var11 * 10) / 32.0F;
      float var19 = (10 + var11 * 10) / 32.0F;
      float var20 = 0.05625F;
      GL11.glEnable(32826);
      float var21 = var1.field_2077 - var9;
      if (var21 > 0.0F) {
         float var22 = -Class469.method_1667(var21 * 3.0F) * var21;
         GL11.glRotatef(var22, 0.0F, 0.0F, 1.0F);
      }

      if (this.field_323) {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

      GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
      GL11.glScalef(var20, var20, var20);
      GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
      GL11.glNormal3f(var20, 0.0F, 0.0F);
      var10.method_186();
      var10.method_318(-7.0, -2.0, -2.0, var16, var18);
      var10.method_318(-7.0, -2.0, 2.0, var17, var18);
      var10.method_318(-7.0, 2.0, 2.0, var17, var19);
      var10.method_318(-7.0, 2.0, -2.0, var16, var19);
      var10.method_406();
      GL11.glNormal3f(-var20, 0.0F, 0.0F);
      var10.method_186();
      var10.method_318(-7.0, 2.0, -2.0, var16, var18);
      var10.method_318(-7.0, 2.0, 2.0, var17, var18);
      var10.method_318(-7.0, -2.0, 2.0, var17, var19);
      var10.method_318(-7.0, -2.0, -2.0, var16, var19);
      var10.method_406();

      for (int var23 = 0; var23 < 4; var23++) {
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glNormal3f(0.0F, 0.0F, var20);
         var10.method_186();
         var10.method_318(-8.0, -2.0, 0.0, var12, var14);
         var10.method_318(8.0, -2.0, 0.0, var13, var14);
         var10.method_318(8.0, 2.0, 0.0, var13, var15);
         var10.method_318(-8.0, 2.0, 0.0, var12, var15);
         var10.method_406();
      }

      GL11.glDisable(32826);
      GL11.glPopMatrix();
      if (this.field_323) {
         Class584.method_331();
      }
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_1243((Class408)var1, var2, var4, var6, var8, var9);
   }
}
