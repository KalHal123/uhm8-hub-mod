import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class iy {
   private Minecraft a;
   private eo b = null;
   private float c = 0.0F;
   private float d = 0.0F;
   private ay e = new ay();

   public iy(Minecraft var1) {
      this.a = var1;
   }

   public void a(eo var1) {
      GL11.glPushMatrix();
      if (var1.c < 256 && ay.a(ln.n[var1.c].f())) {
         GL11.glBindTexture(3553, this.a.n.a("/terrain.png"));
         this.e.a(ln.n[var1.c]);
      } else {
         if (var1.c < 256) {
            GL11.glBindTexture(3553, this.a.n.a("/terrain.png"));
         } else {
            GL11.glBindTexture(3553, this.a.n.a("/gui/items.png"));
         }

         he var2 = he.a;
         float var3 = (var1.b() % 16 * 16 + 0) / 256.0F;
         float var4 = (var1.b() % 16 * 16 + 16) / 256.0F;
         float var5 = (var1.b() / 16 * 16 + 0) / 256.0F;
         float var6 = (var1.b() / 16 * 16 + 16) / 256.0F;
         float var7 = 1.0F;
         float var8 = 0.0F;
         float var9 = 0.3F;
         GL11.glEnable(32826);
         GL11.glTranslatef(-var8, -var9, 0.0F);
         float var10 = 1.5F;
         GL11.glScalef(var10, var10, var10);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         float var11 = 0.0625F;
         var2.b();
         var2.b(0.0F, 0.0F, 1.0F);
         var2.a(0.0, 0.0, 0.0, var4, var6);
         var2.a(var7, 0.0, 0.0, var3, var6);
         var2.a(var7, 1.0, 0.0, var3, var5);
         var2.a(0.0, 1.0, 0.0, var4, var5);
         var2.a();
         var2.b();
         var2.b(0.0F, 0.0F, -1.0F);
         var2.a(0.0, 1.0, 0.0F - var11, var4, var5);
         var2.a(var7, 1.0, 0.0F - var11, var3, var5);
         var2.a(var7, 0.0, 0.0F - var11, var3, var6);
         var2.a(0.0, 0.0, 0.0F - var11, var4, var6);
         var2.a();
         var2.b();
         var2.b(-1.0F, 0.0F, 0.0F);

         for (int var12 = 0; var12 < 16; var12++) {
            float var13 = var12 / 16.0F;
            float var14 = var4 + (var3 - var4) * var13 - 0.001953125F;
            float var15 = var7 * var13;
            var2.a(var15, 0.0, 0.0F - var11, var14, var6);
            var2.a(var15, 0.0, 0.0, var14, var6);
            var2.a(var15, 1.0, 0.0, var14, var5);
            var2.a(var15, 1.0, 0.0F - var11, var14, var5);
         }

         var2.a();
         var2.b();
         var2.b(1.0F, 0.0F, 0.0F);

         for (int var16 = 0; var16 < 16; var16++) {
            float var19 = var16 / 16.0F;
            float var22 = var4 + (var3 - var4) * var19 - 0.001953125F;
            float var25 = var7 * var19 + 0.0625F;
            var2.a(var25, 1.0, 0.0F - var11, var22, var5);
            var2.a(var25, 1.0, 0.0, var22, var5);
            var2.a(var25, 0.0, 0.0, var22, var6);
            var2.a(var25, 0.0, 0.0F - var11, var22, var6);
         }

         var2.a();
         var2.b();
         var2.b(0.0F, 1.0F, 0.0F);

         for (int var17 = 0; var17 < 16; var17++) {
            float var20 = var17 / 16.0F;
            float var23 = var6 + (var5 - var6) * var20 - 0.001953125F;
            float var26 = var7 * var20 + 0.0625F;
            var2.a(0.0, var26, 0.0, var4, var23);
            var2.a(var7, var26, 0.0, var3, var23);
            var2.a(var7, var26, 0.0F - var11, var3, var23);
            var2.a(0.0, var26, 0.0F - var11, var4, var23);
         }

         var2.a();
         var2.b();
         var2.b(0.0F, -1.0F, 0.0F);

         for (int var18 = 0; var18 < 16; var18++) {
            float var21 = var18 / 16.0F;
            float var24 = var6 + (var5 - var6) * var21 - 0.001953125F;
            float var27 = var7 * var21;
            var2.a(var7, var27, 0.0, var3, var24);
            var2.a(0.0, var27, 0.0, var4, var24);
            var2.a(0.0, var27, 0.0F - var11, var4, var24);
            var2.a(var7, var27, 0.0F - var11, var3, var24);
         }

         var2.a();
         GL11.glDisable(32826);
      }

      GL11.glPopMatrix();
   }

   public void a(float var1) {
      float var2 = this.d + (this.c - this.d) * var1;
      be var3 = this.a.g;
      GL11.glPushMatrix();
      GL11.glRotatef(var3.aq + (var3.ao - var3.aq) * var1, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var3.ap + (var3.an - var3.ap) * var1, 0.0F, 1.0F, 0.0F);
      j.b();
      GL11.glPopMatrix();
      float var4 = this.a.e.c(ei.b(var3.ah), ei.b(var3.ai), ei.b(var3.aj));
      GL11.glColor4f(var4, var4, var4, 1.0F);
      if (this.b != null) {
         GL11.glPushMatrix();
         float var5 = 0.8F;
         float var6 = var3.d(var1);
         float var7 = ei.a(var6 * (float) Math.PI);
         float var8 = ei.a(ei.c(var6) * (float) Math.PI);
         GL11.glTranslatef(-var8 * 0.4F, ei.a(ei.c(var6) * (float) Math.PI * 2.0F) * 0.2F, -var7 * 0.2F);
         GL11.glTranslatef(0.7F * var5, -0.65F * var5 - (1.0F - var2) * 0.6F, -0.9F * var5);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable(32826);
         var6 = var3.d(var1);
         var7 = ei.a(var6 * var6 * (float) Math.PI);
         var8 = ei.a(ei.c(var6) * (float) Math.PI);
         GL11.glRotatef(-var7 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var8 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var8 * 80.0F, 1.0F, 0.0F, 0.0F);
         var6 = 0.4F;
         GL11.glScalef(var6, var6, var6);
         this.a(this.b);
         GL11.glPopMatrix();
      } else {
         GL11.glPushMatrix();
         float var9 = 0.8F;
         float var12 = var3.d(var1);
         float var16 = ei.a(var12 * (float) Math.PI);
         float var20 = ei.a(ei.c(var12) * (float) Math.PI);
         GL11.glTranslatef(-var20 * 0.3F, ei.a(ei.c(var12) * (float) Math.PI * 2.0F) * 0.4F, -var16 * 0.4F);
         GL11.glTranslatef(0.8F * var9, -0.75F * var9 - (1.0F - var2) * 0.6F, -0.9F * var9);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable(32826);
         var12 = var3.d(var1);
         var16 = ei.a(var12 * var12 * (float) Math.PI);
         var20 = ei.a(ei.c(var12) * (float) Math.PI);
         GL11.glRotatef(var20 * 70.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var16 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.a.n.a(this.a.g.aV, this.a.g.v()));
         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
         ai var14 = km.a.a(this.a.g);
         bq var18 = (bq)var14;
         var20 = 1.0F;
         GL11.glScalef(var20, var20, var20);
         var18.b();
         GL11.glPopMatrix();
      }

      GL11.glDisable(32826);
      j.a();
   }

   public void b(float var1) {
      GL11.glDisable(3008);
      if (this.a.g.aQ > 0) {
         int var2 = this.a.n.a("/terrain.png");
         GL11.glBindTexture(3553, var2);
         this.d(var1);
      }

      if (this.a.g.G()) {
         int var7 = ei.b(this.a.g.ah);
         int var3 = ei.b(this.a.g.ai);
         int var4 = ei.b(this.a.g.aj);
         int var5 = this.a.n.a("/terrain.png");
         GL11.glBindTexture(3553, var5);
         int var6 = this.a.e.a(var7, var3, var4);
         if (ln.n[var6] != null) {
            this.a(var1, ln.n[var6].a(2));
         }
      }

      if (this.a.g.a(fs.f)) {
         int var8 = this.a.n.a("/water.png");
         GL11.glBindTexture(3553, var8);
         this.c(var1);
      }

      GL11.glEnable(3008);
   }

   private void a(float var1, int var2) {
      he var3 = he.a;
      float var4 = this.a.g.a(var1);
      var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = 0.0078125F;
      float var11 = var2 % 16 / 256.0F - var10;
      float var12 = (var2 % 16 + 15.99F) / 256.0F + var10;
      float var13 = var2 / 16 / 256.0F - var10;
      float var14 = (var2 / 16 + 15.99F) / 256.0F + var10;
      var3.b();
      var3.a(var5, var7, var9, var12, var14);
      var3.a(var6, var7, var9, var11, var14);
      var3.a(var6, var8, var9, var11, var13);
      var3.a(var5, var8, var9, var12, var13);
      var3.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void c(float var1) {
      he var2 = he.a;
      float var3 = this.a.g.a(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.a.g.an / 64.0F;
      float var11 = this.a.g.ao / 64.0F;
      var2.b();
      var2.a(var5, var7, var9, var4 + var10, var4 + var11);
      var2.a(var6, var7, var9, 0.0F + var10, var4 + var11);
      var2.a(var6, var8, var9, 0.0F + var10, 0.0F + var11);
      var2.a(var5, var8, var9, var4 + var10, 0.0F + var11);
      var2.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   private void d(float var1) {
      he var2 = he.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      float var3 = 1.0F;

      for (int var4 = 0; var4 < 2; var4++) {
         GL11.glPushMatrix();
         int var5 = ln.ar.aZ + var4 * 16;
         int var6 = (var5 & 15) << 4;
         int var7 = var5 & 240;
         float var8 = var6 / 256.0F;
         float var9 = (var6 + 15.99F) / 256.0F;
         float var10 = var7 / 256.0F;
         float var11 = (var7 + 15.99F) / 256.0F;
         float var12 = (0.0F - var3) / 2.0F;
         float var13 = var12 + var3;
         float var14 = 0.0F - var3 / 2.0F;
         float var15 = var14 + var3;
         float var16 = -0.5F;
         GL11.glTranslatef(-(var4 * 2 - 1) * 0.24F, -0.3F, 0.0F);
         GL11.glRotatef((var4 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.b();
         var2.a(var12, var14, var16, var9, var11);
         var2.a(var13, var14, var16, var8, var11);
         var2.a(var13, var15, var16, var8, var10);
         var2.a(var12, var15, var16, var9, var10);
         var2.a();
         GL11.glPopMatrix();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   public void a() {
      this.d = this.c;
      be var1 = this.a.g;
      eo var2 = var1.b.e();
      eo var3 = var2;
      float var4 = 0.4F;
      float var5 = var3 == this.b ? 1.0F : 0.0F;
      float var6 = var5 - this.c;
      if (var6 < -var4) {
         var6 = -var4;
      }

      if (var6 > var4) {
         var6 = var4;
      }

      this.c += var6;
      if (this.c < 0.1F) {
         this.b = var3;
      }
   }

   public void b() {
      this.c = 0.0F;
   }

   public void c() {
      this.c = 0.0F;
   }
}
