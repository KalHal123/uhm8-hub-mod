package x;

import org.lwjgl.opengl.GL11;

public class Class0045 extends Class0090 {
   private Class0069 f = (Class0069)this.d;
   private Class0069 g = new Class0069(1.0F);
   private Class0069 h = new Class0069(0.5F);
   private static final String[] i = new String[]{"cloth", "chain", "iron", "diamond", "gold"};

   public Class0045() {
      super(new Class0069(0.0F), 0.5F);
   }

   protected boolean a(Class0089 var1, int var2) {
      Class0124 var3 = var1.b.d(3 - var2);
      if (var3 != null) {
         Class0086 var4 = var3.a();
         if (var4 instanceof Class0331) {
            Class0331 var5 = (Class0331)var4;
            this.a("/armor/" + i[var5.aX] + "_" + (var2 == 2 ? 2 : 1) + ".png");
            Class0069 var6 = var2 == 2 ? this.h : this.g;
            var6.a.h = var2 == 0;
            var6.b.h = var2 == 0;
            var6.c.h = var2 == 1 || var2 == 2;
            var6.d.h = var2 == 1;
            var6.e.h = var2 == 1;
            var6.f.h = var2 == 2 || var2 == 3;
            var6.g.h = var2 == 2 || var2 == 3;
            this.a(var6);
            return true;
         }
      }

      return false;
   }

   public void a(Class0089 var1, double var2, double var4, double var6, float var8, float var9) {
      Class0124 var10 = var1.b.e();
      Class0069 var11 = (Class0069)this.d;
      var11.i = var10 != null;
      super.a(var1, var2, var4 - var1.ay, var6, var8, var9);
      var11.i = false;
      Class0264 var12 = this.a();
      float var13 = 1.6F;
      float var14 = 0.016666668F * var13;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + 2.3F, (float)var6);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.a.i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(this.a.j, 1.0F, 0.0F, 0.0F);
      float var15 = var1.d(this.a.h);
      var14 = (float)(var14 * (Math.sqrt(var15) / 2.0));
      GL11.glScalef(-var14, -var14, var14);
      String var16 = var1.i;
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      Class0195 var17 = Class0195.a;
      GL11.glDisable(3553);
      var17.b();
      int var18 = var12.a(var16) / 2;
      var17.a(0.0F, 0.0F, 0.0F, 0.25F);
      var17.a(-var18 - 1, -1.0, 0.0);
      var17.a(-var18 - 1, 8.0, 0.0);
      var17.a(var18 + 1, 8.0, 0.0);
      var17.a(var18 + 1, -1.0, 0.0);
      var17.a();
      GL11.glEnable(3553);
      var12.b(var16, -var12.a(var16) / 2, 0, 553648127);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      var12.b(var16, -var12.a(var16) / 2, 0, -1);
      GL11.glEnable(2896);
      GL11.glDisable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   protected void a(Class0089 var1, float var2) {
      Class0124 var3 = var1.b.e();
      if (var3 != null) {
         GL11.glPushMatrix();
         this.f.d.b(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if (var3.c < 256 && Class0026.a(Class0312.n[var3.c].f())) {
            float var6 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var6 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
         } else if (Class0086.c[var3.c].a()) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            float var5 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var5, var5, var5);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.a.f.a(var3);
         GL11.glPopMatrix();
      }
   }

   protected void b(Class0089 var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   public void b() {
      this.f.j = 0.0F;
      this.f.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
      this.f.d.a(0.0625F);
   }
}
