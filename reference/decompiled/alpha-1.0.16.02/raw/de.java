import org.lwjgl.opengl.GL11;

public class de extends ai {
   private ay d = new ay();

   public de() {
      this.b = 0.5F;
   }

   public void a(ex var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/terrain.png");
      ln var10 = ln.n[var1.a];
      cj var11 = var1.i();
      GL11.glDisable(2896);
      this.d.a(var10, var11, ei.b(var1.ah), ei.b(var1.ai), ei.b(var1.aj));
      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }
}
