import org.lwjgl.opengl.GL11;

public class ga extends ai {
   @Override
   public void a(jx var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      a(var1.ar, var2 - var1.aF, var4 - var1.aG, var6 - var1.aH);
      GL11.glPopMatrix();
   }
}
