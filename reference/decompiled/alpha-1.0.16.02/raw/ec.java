import org.lwjgl.opengl.GL11;

public class ec extends ai {
   public void a(al var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable(32826);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      int var10 = dd.aB.a((eo)null);
      this.a("/gui/items.png");
      he var11 = he.a;
      float var12 = (var10 % 16 * 16 + 0) / 256.0F;
      float var13 = (var10 % 16 * 16 + 16) / 256.0F;
      float var14 = (var10 / 16 * 16 + 0) / 256.0F;
      float var15 = (var10 / 16 * 16 + 16) / 256.0F;
      float var16 = 1.0F;
      float var17 = 0.5F;
      float var18 = 0.25F;
      GL11.glRotatef(180.0F - this.a.i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.a.j, 1.0F, 0.0F, 0.0F);
      var11.b();
      var11.b(0.0F, 1.0F, 0.0F);
      var11.a(0.0F - var17, 0.0F - var18, 0.0, var12, var15);
      var11.a(var16 - var17, 0.0F - var18, 0.0, var13, var15);
      var11.a(var16 - var17, 1.0F - var18, 0.0, var13, var14);
      var11.a(0.0F - var17, 1.0F - var18, 0.0, var12, var14);
      var11.a();
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }
}
