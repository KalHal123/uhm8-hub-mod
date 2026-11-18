package x;

import org.lwjgl.opengl.GL11;

public class Class0280 extends Class0010 {
   protected Class0142 d;

   public Class0280() {
      this.b = 0.5F;
      this.d = new Class0189();
   }

   public void a(Class0367 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      double var10 = var1.aF + (var1.ah - var1.aF) * var9;
      double var12 = var1.aG + (var1.ai - var1.aG) * var9;
      double var14 = var1.aH + (var1.aj - var1.aH) * var9;
      double var16 = 0.3F;
      Class0009 var18 = var1.g(var10, var12, var14);
      float var19 = var1.aq + (var1.ao - var1.aq) * var9;
      if (var18 != null) {
         Class0009 var20 = var1.a(var10, var12, var14, var16);
         Class0009 var21 = var1.a(var10, var12, var14, -var16);
         if (var20 == null) {
            var20 = var18;
         }

         if (var21 == null) {
            var21 = var18;
         }

         var2 += var18.a - var10;
         var4 += (var20.b + var21.b) / 2.0 - var12;
         var6 += var18.c - var14;
         Class0009 var22 = var21.c(-var20.a, -var20.b, -var20.c);
         if (var22.c() != 0.0) {
            var22 = var22.b();
            var8 = (float)(Math.atan2(var22.c, var22.a) * 180.0 / Math.PI);
            var19 = (float)(Math.atan(var22.b) * 73.0);
         }
      }

      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var19, 0.0F, 0.0F, 1.0F);
      float var23 = var1.b - var9;
      float var24 = var1.a - var9;
      if (var24 < 0.0F) {
         var24 = 0.0F;
      }

      if (var23 > 0.0F) {
         GL11.glRotatef(Class0118.a(var23) * var23 * var24 / 10.0F * var1.c, 1.0F, 0.0F, 0.0F);
      }

      if (var1.d != 0) {
         this.a("/terrain.png");
         float var26 = 0.75F;
         GL11.glScalef(var26, var26, var26);
         GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         if (var1.d == 1) {
            new Class0026().a(Class0312.au);
         } else if (var1.d == 2) {
            new Class0026().a(Class0312.aB);
         }

         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
         GL11.glScalef(1.0F / var26, 1.0F / var26, 1.0F / var26);
      }

      this.a("/item/cart.png");
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.d.b(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
