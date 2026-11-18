package ext;

import org.lwjgl.opengl.GL11;

public class Class357 extends Class459 {
   private Class714 field_907 = new Class714();

   public Class357() {
      this.field_859 = 0.5F;
   }

   public void method_164(Class492 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.method_1261(Class614.method_1576(Class614.field_1949));
      Class108 var10 = Class108.field_1221[var1.field_1021];
      Class454 var11 = var1.method_199();
      GL11.glDisable(2896);
      this.field_907
         .method_1849(var10, var11, Class469.method_468(var1.field_1417), Class469.method_468(var1.field_2654), Class469.method_468(var1.field_2013));
      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_164((Class492)var1, var2, var4, var6, var8, var9);
   }
}
