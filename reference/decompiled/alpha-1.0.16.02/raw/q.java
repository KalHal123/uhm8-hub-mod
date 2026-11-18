import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class q extends eq {
   private Map b = new HashMap();

   public void a(ba var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      jx var9 = (jx)this.b.get(var1.b);
      if (var9 == null) {
         var9 = ep.a(var1.b, null);
         this.b.put(var1.b, var9);
      }

      if (var9 != null) {
         var9.a(var1.e);
         float var10 = 0.4375F;
         GL11.glTranslatef(0.0F, 0.4F, 0.0F);
         GL11.glRotatef((float)(var1.d + (var1.c - var1.d) * var8) * 10.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
         GL11.glScalef(var10, var10, var10);
         var9.c(var2, var4, var6, 0.0F, 0.0F);
         km.a.a(var9, 0.0, 0.0, 0.0, 0.0F, var8);
      }

      GL11.glPopMatrix();
   }
}
