package ext;

import org.lwjgl.opengl.GL11;

public class Class528 extends Class600 {
   private Class552 field_2579 = new Class552();

   public void method_393(Class243 var1, double var2, double var4, double var6, float var8) {
      Class108 var9 = var1.method_1438();
      GL11.glPushMatrix();
      float var10 = 0.6666667F;
      if (var9 == Class108.field_1115) {
         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         float var12 = var1.method_1664() * 360 / 16.0F;
         GL11.glRotatef(-var12, 0.0F, 1.0F, 0.0F);
         this.field_2579.field_1067.field_597 = true;
      } else {
         int var17 = var1.method_1664();
         float var11 = 0.0F;
         if (var17 == 2) {
            var11 = 180.0F;
         }

         if (var17 == 4) {
            var11 = 90.0F;
         }

         if (var17 == 5) {
            var11 = -90.0F;
         }

         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         GL11.glRotatef(-var11, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
         this.field_2579.field_1067.field_597 = false;
      }

      this.method_1821("/item/sign.png");
      GL11.glPushMatrix();
      GL11.glScalef(var10, -var10, -var10);
      this.field_2579.method_1316();
      GL11.glPopMatrix();
      Class640 var18 = this.method_262();
      float var16 = 0.016666668F * var10;
      GL11.glTranslatef(0.0F, 0.5F * var10, 0.07F * var10);
      GL11.glScalef(var16, -var16, var16);
      GL11.glNormal3f(0.0F, 0.0F, -1.0F * var16);
      GL11.glDepthMask(false);
      byte var13 = 0;

      for (int var14 = 0; var14 < var1.field_585.length; var14++) {
         String var15 = var1.field_585[var14];
         if (var14 == var1.field_2581) {
            var15 = "> " + var15 + " <";
            var18.method_1870(var15, -var18.method_962(var15) / 2, var14 * 10 - var1.field_585.length * 5, var13);
         } else {
            var18.method_1870(var15, -var18.method_962(var15) / 2, var14 * 10 - var1.field_585.length * 5, var13);
         }
      }

      GL11.glDepthMask(true);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   @Override
   public void method_945(Class186 var1, double var2, double var4, double var6, float var8) {
      this.method_393((Class243)var1, var2, var4, var6, var8);
   }
}
