package x;

import org.lwjgl.opengl.GL11;

public class Class0164 extends Class0010 {
   @Override
   public void a(Class0268 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      a(var1.ar, var2 - var1.aF, var4 - var1.aG, var6 - var1.aH);
      GL11.glPopMatrix();
   }
}
