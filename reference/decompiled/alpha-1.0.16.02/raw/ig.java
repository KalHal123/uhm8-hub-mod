import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class ig {
   private Minecraft h;
   private float i = 0.0F;
   public iy a;
   private int j;
   private jx k = null;
   private long l = System.currentTimeMillis();
   private Random m = new Random();
   volatile int b = 0;
   volatile int c = 0;
   FloatBuffer d = da.d(16);
   float e;
   float f;
   float g;
   private float n;
   private float o;

   public ig(Minecraft var1) {
      this.h = var1;
      this.a = new iy(var1);
   }

   public void a() {
      this.n = this.o;
      float var1 = this.h.e.c(ei.b(this.h.g.ah), ei.b(this.h.g.ai), ei.b(this.h.g.aj));
      float var2 = (3 - this.h.y.e) / 3.0F;
      float var3 = var1 * (1.0F - var2) + var2;
      this.o = this.o + (var3 - this.o) * 0.1F;
      this.j++;
      this.a.a();
      if (this.h.J) {
         this.c();
      }
   }

   public void a(float var1) {
      if (this.h.g != null) {
         double var2 = this.h.b.c();
         this.h.x = this.h.g.a((double)var2, var1);
         double var4 = var2;
         ah var6 = this.h.g.e(var1);
         if (this.h.x != null) {
            var4 = this.h.x.f.c(var6);
         }

         if (this.h.b instanceof ib) {
            var2 = 32.0;
            var4 = 32.0;
         } else {
            if (var4 > 3.0) {
               var4 = 3.0;
            }

            var2 = var4;
         }

         ah var7 = this.h.g.f(var1);
         ah var8 = var6.c(var7.a * var2, var7.b * var2, var7.c * var2);
         this.k = null;
         List var9 = this.h.e.b(this.h.g, this.h.g.ar.a(var7.a * var2, var7.b * var2, var7.c * var2));
         double var10 = 0.0;

         for (int var12 = 0; var12 < var9.size(); var12++) {
            jx var13 = (jx)var9.get(var12);
            if (var13.c_()) {
               float var14 = 0.1F;
               cb var15 = var13.ar.b(var14, var14, var14);
               lv var16 = var15.a(var6, var8);
               if (var16 != null) {
                  double var17 = var6.c(var16.f);
                  if (var17 < var10 || var10 == 0.0) {
                     this.k = var13;
                     var10 = var17;
                  }
               }
            }
         }

         if (this.k != null && !(this.h.b instanceof ib)) {
            this.h.x = new lv(this.k);
         }
      }
   }

   private float d(float var1) {
      be var2 = this.h.g;
      float var3 = 70.0F;
      if (var2.a(fs.f)) {
         var3 = 60.0F;
      }

      if (var2.D <= 0) {
         float var4 = var2.I + var1;
         var3 /= (1.0F - 500.0F / (var4 + 500.0F)) * 2.0F + 1.0F;
      }

      return var3;
   }

   private void e(float var1) {
      be var2 = this.h.g;
      float var3 = var2.F - var1;
      if (var2.D <= 0) {
         float var4 = var2.I + var1;
         GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }

      if (!(var3 < 0.0F)) {
         var3 /= var2.G;
         var3 = ei.a(var3 * var3 * var3 * var3 * (float) Math.PI);
         float var7 = var2.H;
         GL11.glRotatef(-var7, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
      }
   }

   private void f(float var1) {
      if (!this.h.y.w) {
         be var2 = this.h.g;
         float var3 = var2.aC - var2.aB;
         float var4 = var2.aC + var3 * var1;
         float var5 = var2.e + (var2.f - var2.e) * var1;
         float var6 = var2.K + (var2.L - var2.K) * var1;
         GL11.glTranslatef(ei.a(var4 * (float) Math.PI) * var5 * 0.5F, -Math.abs(ei.b(var4 * (float) Math.PI) * var5), 0.0F);
         GL11.glRotatef(ei.a(var4 * (float) Math.PI) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(Math.abs(ei.b(var4 * (float) Math.PI + 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }
   }

   private void g(float var1) {
      be var2 = this.h.g;
      double var3 = var2.ae + (var2.ah - var2.ae) * var1;
      double var5 = var2.af + (var2.ai - var2.af) * var1;
      double var7 = var2.ag + (var2.aj - var2.ag) * var1;
      if (this.h.y.w) {
         double var9 = 4.0;
         float var11 = var2.o + (var2.n - var2.o) * var1;
         float var12 = var2.an - 10.0F;
         float var13 = var2.ao + 2.0F;
         double var14 = -ei.a(var12 / 180.0F * (float) Math.PI) * ei.b(var13 / 180.0F * (float) Math.PI) * var9;
         double var16 = ei.b(var12 / 180.0F * (float) Math.PI) * ei.b(var13 / 180.0F * (float) Math.PI) * var9;
         double var18 = -ei.a(var13 / 180.0F * (float) Math.PI) * var9;

         for (int var20 = 0; var20 < 8; var20++) {
            float var21 = (var20 & 1) * 2 - 1;
            float var22 = (var20 >> 1 & 1) * 2 - 1;
            float var23 = (var20 >> 2 & 1) * 2 - 1;
            var21 *= 0.1F;
            var22 *= 0.1F;
            var23 *= 0.1F;
            lv var24 = this.h
               .e
               .a(ah.b(var3 + var21, var5 + var22, var7 + var23), ah.b(var3 - var14 + var21 + var23, var5 - var18 + var22, var7 - var16 + var23));
            if (var24 != null) {
               double var25 = var24.f.c(ah.b(var3, var5, var7));
               if (var25 < var9) {
                  var9 = var25;
               }
            }
         }

         GL11.glRotatef(var2.ao - var13, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var2.an - var12, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, 0.0F, (float)(-var9));
         GL11.glRotatef(var12 - var2.an, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var13 - var2.ao, 1.0F, 0.0F, 0.0F);
      } else {
         GL11.glTranslatef(0.0F, 0.0F, -0.1F);
      }

      GL11.glRotatef(var2.aq + (var2.ao - var2.aq) * var1, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var2.ap + (var2.an - var2.ap) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
   }

   private void a(float var1, int var2) {
      this.i = 256 >> this.h.y.e;
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float var3 = 0.07F;
      if (this.h.y.g) {
         GL11.glTranslatef(-(var2 * 2 - 1) * var3, 0.0F, 0.0F);
      }

      GLU.gluPerspective(this.d(var1), (float)this.h.c / this.h.d, 0.05F, this.i);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if (this.h.y.g) {
         GL11.glTranslatef((var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.e(var1);
      if (this.h.y.f) {
         this.f(var1);
      }

      this.g(var1);
   }

   private void b(float var1, int var2) {
      GL11.glLoadIdentity();
      if (this.h.y.g) {
         GL11.glTranslatef((var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      GL11.glPushMatrix();
      this.e(var1);
      if (this.h.y.f) {
         this.f(var1);
      }

      if (!this.h.y.w) {
         this.a.a(var1);
      }

      GL11.glPopMatrix();
      if (!this.h.y.w) {
         this.a.b(var1);
         this.e(var1);
      }

      if (this.h.y.f) {
         this.f(var1);
      }
   }

   public void b(float var1) {
      if (!Display.isActive()) {
         if (System.currentTimeMillis() - this.l > 500L) {
            this.h.g();
         }
      } else {
         this.l = System.currentTimeMillis();
      }

      if (this.h.I) {
         this.h.B.c();
         int var2 = this.h.B.a;
         int var3 = this.h.B.b;
         byte var4 = 1;
         if (this.h.y.c) {
            var4 = -1;
         }

         this.h.g.d(var2, var3 * var4);
      }

      if (!this.h.v) {
         ip var7 = new ip(this.h.c, this.h.d);
         int var8 = var7.a();
         int var9 = var7.b();
         int var5 = Mouse.getX() * var8 / this.h.c;
         int var6 = var9 - Mouse.getY() * var9 / this.h.d - 1;
         if (this.h.e != null) {
            this.c(var1);
            this.h.u.a(var1, this.h.p != null, var5, var6);
         } else {
            GL11.glViewport(0, 0, this.h.c, this.h.d);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16640);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            this.b();
         }

         if (this.h.p != null) {
            GL11.glClear(256);
            this.h.p.a(var5, var6, var1);
         }
      }
   }

   public void c(float var1) {
      this.a(var1);
      be var2 = this.h.g;
      e var3 = this.h.f;
      bm var4 = this.h.h;
      double var5 = var2.aF + (var2.ah - var2.aF) * var1;
      double var7 = var2.aG + (var2.ai - var2.aG) * var1;
      double var9 = var2.aH + (var2.aj - var2.aH) * var1;

      for (int var11 = 0; var11 < 2; var11++) {
         if (this.h.y.g) {
            if (var11 == 0) {
               GL11.glColorMask(false, true, true, false);
            } else {
               GL11.glColorMask(true, false, false, false);
            }
         }

         GL11.glViewport(0, 0, this.h.c, this.h.d);
         this.j(var1);
         GL11.glClear(16640);
         GL11.glEnable(2884);
         this.a(var1, var11);
         k.a();
         if (this.h.y.e < 2) {
            this.a(-1);
            var3.a(var1);
         }

         GL11.glEnable(2912);
         this.a(1);
         ka var12 = new ka();
         var12.a(var5, var7, var9);
         this.h.f.a(var12, var1);
         this.h.f.a(var2, false);
         this.a(0);
         GL11.glEnable(2912);
         GL11.glBindTexture(3553, this.h.n.a("/terrain.png"));
         j.a();
         var3.a(var2, 0, var1);
         j.b();
         var3.a(var2.e(var1), var12, var1);
         var4.b(var2, var1);
         j.a();
         this.a(0);
         var4.a(var2, var1);
         if (this.h.x != null && var2.a(fs.f)) {
            GL11.glDisable(3008);
            var3.a(var2, this.h.x, 0, var2.b.e(), var1);
            var3.b(var2, this.h.x, 0, var2.b.e(), var1);
            GL11.glEnable(3008);
         }

         GL11.glBlendFunc(770, 771);
         this.a(0);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         GL11.glBindTexture(3553, this.h.n.a("/terrain.png"));
         if (this.h.y.i) {
            GL11.glColorMask(false, false, false, false);
            int var13 = var3.a(var2, 1, var1);
            GL11.glColorMask(true, true, true, true);
            if (this.h.y.g) {
               if (var11 == 0) {
                  GL11.glColorMask(false, true, true, false);
               } else {
                  GL11.glColorMask(true, false, false, false);
               }
            }

            if (var13 > 0) {
               var3.a(1, var1);
            }
         } else {
            var3.a(var2, 1, var1);
         }

         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         if (this.h.x != null && !var2.a(fs.f)) {
            GL11.glDisable(3008);
            var3.a(var2, this.h.x, 0, var2.b.e(), var1);
            var3.b(var2, this.h.x, 0, var2.b.e(), var1);
            GL11.glEnable(3008);
         }

         GL11.glDisable(2912);
         if (this.h.e.d) {
            this.h(var1);
         }

         if (this.h.J) {
            this.i(var1);
         }

         if (this.k != null) {
         }

         this.a(0);
         GL11.glEnable(2912);
         var3.b(var1);
         GL11.glDisable(2912);
         this.a(1);
         GL11.glClear(256);
         this.b(var1, var11);
         if (!this.h.y.g) {
            return;
         }
      }

      GL11.glColorMask(true, true, true, false);
   }

   private void c() {
      if (this.h.y.i) {
         be var1 = this.h.g;
         cj var2 = this.h.e;
         int var3 = ei.b(var1.ah);
         int var4 = ei.b(var1.ai);
         int var5 = ei.b(var1.aj);
         byte var6 = 16;

         for (int var7 = 0; var7 < 150; var7++) {
            int var8 = var3 + this.m.nextInt(var6) - this.m.nextInt(var6);
            int var9 = var5 + this.m.nextInt(var6) - this.m.nextInt(var6);
            int var10 = var2.e(var8, var9);
            int var11 = var2.a(var8, var10 - 1, var9);
            if (var10 <= var4 + var6 && var10 >= var4 - var6) {
               float var12 = this.m.nextFloat();
               float var13 = this.m.nextFloat();
               if (var11 > 0) {
                  this.h.h.a(new ms(var2, var8 + var12, var10 + 0.1F - ln.n[var11].be, var9 + var13));
               }
            }
         }
      }
   }

   private void h(float var1) {
      be var2 = this.h.g;
      cj var3 = this.h.e;
      int var4 = ei.b(var2.ah);
      int var5 = ei.b(var2.ai);
      int var6 = ei.b(var2.aj);
      he var7 = he.a;
      GL11.glDisable(2884);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glBindTexture(3553, this.h.n.a("/snow.png"));
      double var8 = var2.aF + (var2.ah - var2.aF) * var1;
      double var10 = var2.aG + (var2.ai - var2.aG) * var1;
      double var12 = var2.aH + (var2.aj - var2.aH) * var1;
      byte var14 = 5;
      if (this.h.y.i) {
         var14 = 10;
      }

      for (int var15 = var4 - var14; var15 <= var4 + var14; var15++) {
         for (int var16 = var6 - var14; var16 <= var6 + var14; var16++) {
            int var17 = var3.d(var15, var16);
            if (var17 < 0) {
               var17 = 0;
            }

            int var18 = var5 - var14;
            int var19 = var5 + var14;
            if (var18 < var17) {
               var18 = var17;
            }

            if (var19 < var17) {
               var19 = var17;
            }

            float var20 = 2.0F;
            if (var18 != var19) {
               this.m.setSeed(var15 * var15 * 3121 + var15 * 45238971 + var16 * var16 * 418711 + var16 * 13761);
               float var21 = this.j + var1;
               float var22 = ((this.j & 511) + var1) / 512.0F;
               float var23 = this.m.nextFloat() + var21 * 0.01F * (float)this.m.nextGaussian();
               float var24 = this.m.nextFloat() + var21 * (float)this.m.nextGaussian() * 0.001F;
               double var25 = var15 + 0.5F - var2.ah;
               double var27 = var16 + 0.5F - var2.aj;
               float var29 = ei.a(var25 * var25 + var27 * var27) / var14;
               var7.b();
               float var30 = var3.c(var15, 128, var16);
               GL11.glColor4f(var30, var30, var30, (1.0F - var29 * var29) * 0.7F);
               var7.b(-var8 * 1.0, -var10 * 1.0, -var12 * 1.0);
               var7.a(var15 + 0, var18, var16 + 0, 0.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 + var24);
               var7.a(var15 + 1, var18, var16 + 1, 1.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 + var24);
               var7.a(var15 + 1, var19, var16 + 1, 1.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 + var24);
               var7.a(var15 + 0, var19, var16 + 0, 0.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 + var24);
               var7.a(var15 + 0, var18, var16 + 1, 0.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 + var24);
               var7.a(var15 + 1, var18, var16 + 0, 1.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 + var24);
               var7.a(var15 + 1, var19, var16 + 0, 1.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 + var24);
               var7.a(var15 + 0, var19, var16 + 1, 0.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 + var24);
               var7.b(0.0, 0.0, 0.0);
               var7.a();
            }
         }
      }

      GL11.glEnable(2884);
      GL11.glDisable(3042);
   }

   private void i(float var1) {
      be var2 = this.h.g;
      cj var3 = this.h.e;
      int var4 = ei.b(var2.ah);
      int var5 = ei.b(var2.ai);
      int var6 = ei.b(var2.aj);
      he var7 = he.a;
      GL11.glDisable(2884);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glBindTexture(3553, this.h.n.a("/rain.png"));
      double var8 = var2.aF + (var2.ah - var2.aF) * var1;
      double var10 = var2.aG + (var2.ai - var2.aG) * var1;
      double var12 = var2.aH + (var2.aj - var2.aH) * var1;
      byte var14 = 5;
      if (this.h.y.i) {
         var14 = 10;
      }

      for (int var15 = var4 - var14; var15 <= var4 + var14; var15++) {
         for (int var16 = var6 - var14; var16 <= var6 + var14; var16++) {
            int var17 = var3.e(var15, var16);
            int var18 = var5 - var14;
            int var19 = var5 + var14;
            if (var18 < var17) {
               var18 = var17;
            }

            if (var19 < var17) {
               var19 = var17;
            }

            float var20 = 2.0F;
            if (var18 != var19) {
               float var21 = ((this.j + var15 * var15 * 3121 + var15 * 45238971 + var16 * var16 * 418711 + var16 * 13761 & 31) + var1) / 32.0F;
               double var22 = var15 + 0.5F - var2.ah;
               double var24 = var16 + 0.5F - var2.aj;
               float var26 = ei.a(var22 * var22 + var24 * var24) / var14;
               var7.b();
               float var27 = var3.c(var15, 128, var16);
               GL11.glColor4f(var27, var27, var27, (1.0F - var26 * var26) * 0.7F);
               var7.b(-var8 * 1.0, -var10 * 1.0, -var12 * 1.0);
               var7.a(var15 + 0, var18, var16 + 0, 0.0F * var20, var18 * var20 / 8.0F + var21 * var20);
               var7.a(var15 + 1, var18, var16 + 1, 1.0F * var20, var18 * var20 / 8.0F + var21 * var20);
               var7.a(var15 + 1, var19, var16 + 1, 1.0F * var20, var19 * var20 / 8.0F + var21 * var20);
               var7.a(var15 + 0, var19, var16 + 0, 0.0F * var20, var19 * var20 / 8.0F + var21 * var20);
               var7.a(var15 + 0, var18, var16 + 1, 0.0F * var20, var18 * var20 / 8.0F + var21 * var20);
               var7.a(var15 + 1, var18, var16 + 0, 1.0F * var20, var18 * var20 / 8.0F + var21 * var20);
               var7.a(var15 + 1, var19, var16 + 0, 1.0F * var20, var19 * var20 / 8.0F + var21 * var20);
               var7.a(var15 + 0, var19, var16 + 1, 0.0F * var20, var19 * var20 / 8.0F + var21 * var20);
               var7.b(0.0, 0.0, 0.0);
               var7.a();
            }
         }
      }

      GL11.glEnable(2884);
      GL11.glDisable(3042);
   }

   public void b() {
      ip var1 = new ip(this.h.c, this.h.d);
      int var2 = var1.a();
      int var3 = var1.b();
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, var2, var3, 0.0, 1000.0, 3000.0);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   private void j(float var1) {
      cj var2 = this.h.e;
      be var3 = this.h.g;
      float var4 = 1.0F / (4 - this.h.y.e);
      var4 = 1.0F - (float)Math.pow(var4, 0.25);
      ah var5 = var2.b(var1);
      float var6 = (float)var5.a;
      float var7 = (float)var5.b;
      float var8 = (float)var5.c;
      ah var9 = var2.e(var1);
      this.e = (float)var9.a;
      this.f = (float)var9.b;
      this.g = (float)var9.c;
      this.e = this.e + (var6 - this.e) * var4;
      this.f = this.f + (var7 - this.f) * var4;
      this.g = this.g + (var8 - this.g) * var4;
      if (var3.a(fs.f)) {
         this.e = 0.02F;
         this.f = 0.02F;
         this.g = 0.2F;
      } else if (var3.a(fs.g)) {
         this.e = 0.6F;
         this.f = 0.1F;
         this.g = 0.0F;
      }

      float var10 = this.n + (this.o - this.n) * var1;
      this.e *= var10;
      this.f *= var10;
      this.g *= var10;
      if (this.h.y.g) {
         float var11 = (this.e * 30.0F + this.f * 59.0F + this.g * 11.0F) / 100.0F;
         float var12 = (this.e * 30.0F + this.f * 70.0F) / 100.0F;
         float var13 = (this.e * 30.0F + this.g * 70.0F) / 100.0F;
         this.e = var11;
         this.f = var12;
         this.g = var13;
      }

      GL11.glClearColor(this.e, this.f, this.g, 0.0F);
   }

   private void a(int var1) {
      be var2 = this.h.g;
      GL11.glFog(2918, this.a(this.e, this.f, this.g, 1.0F));
      GL11.glNormal3f(0.0F, -1.0F, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (var2.a(fs.f)) {
         GL11.glFogi(2917, 2048);
         GL11.glFogf(2914, 0.1F);
         float var3 = 0.4F;
         float var4 = 0.4F;
         float var5 = 0.9F;
         if (this.h.y.g) {
            float var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
            float var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
            float var8 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
         }
      } else if (var2.a(fs.g)) {
         GL11.glFogi(2917, 2048);
         GL11.glFogf(2914, 2.0F);
         float var9 = 0.4F;
         float var10 = 0.3F;
         float var11 = 0.3F;
         if (this.h.y.g) {
            float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         }
      } else {
         GL11.glFogi(2917, 9729);
         GL11.glFogf(2915, this.i * 0.25F);
         GL11.glFogf(2916, this.i);
         if (var1 < 0) {
            GL11.glFogf(2915, 0.0F);
            GL11.glFogf(2916, this.i * 0.8F);
         }

         if (GLContext.getCapabilities().GL_NV_fog_distance) {
            GL11.glFogi(34138, 34139);
         }
      }

      GL11.glEnable(2903);
      GL11.glColorMaterial(1028, 4608);
   }

   private FloatBuffer a(float var1, float var2, float var3, float var4) {
      ((Buffer)this.d).clear();
      this.d.put(var1).put(var2).put(var3).put(var4);
      ((Buffer)this.d).flip();
      return this.d;
   }
}
