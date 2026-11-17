package ext;

import org.lwjgl.opengl.GL11;

public class Class543 extends Class459 {
   protected Class110 field_1368;

   public Class543() {
      this.field_859 = 0.5F;
      this.field_1368 = new Class282();
   }

   public void method_1159(Class256 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
      float var10 = var1.field_1876 - var9;
      float var11 = var1.field_1868 - var9;
      if (var11 < 0.0F) {
         var11 = 0.0F;
      }

      if (var10 > 0.0F) {
         GL11.glRotatef(Class469.method_1667(var10) * var10 * var11 / 10.0F * var1.field_104, 1.0F, 0.0F, 0.0F);
      }

      this.method_1261(Class614.method_1576(Class614.field_1949));
      float var12 = 0.75F;
      GL11.glScalef(var12, var12, var12);
      GL11.glScalef(1.0F / var12, 1.0F / var12, 1.0F / var12);
      this.method_1261("/item/boat.png");
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.field_1368.method_837(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_1159((Class256)var1, var2, var4, var6, var8, var9);
   }
}
