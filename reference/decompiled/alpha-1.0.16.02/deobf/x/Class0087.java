package x;

import org.lwjgl.opengl.GL11;

public class Class0087 extends Class0010 {
   private Class0026 d = new Class0026();

   public Class0087() {
      this.b = 0.5F;
   }

   public void a(Class0133 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/terrain.png");
      Class0312 var10 = Class0312.n[var1.a];
      Class0065 var11 = var1.i();
      GL11.glDisable(2896);
      this.d.a(var10, var11, Class0118.b(var1.ah), Class0118.b(var1.ai), Class0118.b(var1.aj));
      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }
}
