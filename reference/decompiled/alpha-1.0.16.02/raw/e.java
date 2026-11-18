import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class e implements ic {
   public List a = new ArrayList();
   private cj k;
   private er l;
   private List m = new ArrayList();
   private bj[] n;
   private bj[] o;
   private int p;
   private int q;
   private int r;
   private int s;
   private Minecraft t;
   private ay u;
   private IntBuffer v;
   private boolean w = false;
   private int x = 0;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   private int G;
   private int H = -1;
   private int I = 2;
   private int J;
   private int K;
   private int L;
   int[] b = new int[50000];
   IntBuffer c = da.c(64);
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private List R = new ArrayList();
   private kl[] S = new kl[]{new kl(), new kl(), new kl(), new kl()};
   int d = 0;
   int e = da.a(1);
   double f = -9999.0;
   double g = -9999.0;
   double h = -9999.0;
   public float i;
   int j = 0;

   public e(Minecraft var1, er var2) {
      this.t = var1;
      this.l = var2;
      byte var3 = 64;
      this.s = da.a(var3 * var3 * var3 * 3);
      this.w = var1.k().a();
      if (this.w) {
         ((Buffer)this.c).clear();
         this.v = da.c(var3 * var3 * var3);
         ((Buffer)this.v).clear();
         ((Buffer)this.v).position(0);
         ((Buffer)this.v).limit(var3 * var3 * var3);
         ARBOcclusionQuery.glGenQueriesARB(this.v);
      }

      this.y = da.a(3);
      GL11.glPushMatrix();
      GL11.glNewList(this.y, 4864);
      this.f();
      GL11.glEndList();
      GL11.glPopMatrix();
      he var4 = he.a;
      this.z = this.y + 1;
      GL11.glNewList(this.z, 4864);
      byte var6 = 64;
      int var7 = 256 / var6 + 2;
      float var5 = 16.0F;

      for (int var8 = -var6 * var7; var8 <= var6 * var7; var8 += var6) {
         for (int var9 = -var6 * var7; var9 <= var6 * var7; var9 += var6) {
            var4.b();
            var4.a(var8 + 0, var5, var9 + 0);
            var4.a(var8 + var6, var5, var9 + 0);
            var4.a(var8 + var6, var5, var9 + var6);
            var4.a(var8 + 0, var5, var9 + var6);
            var4.a();
         }
      }

      GL11.glEndList();
      this.A = this.y + 2;
      GL11.glNewList(this.A, 4864);
      var5 = -16.0F;
      var4.b();

      for (int var11 = -var6 * var7; var11 <= var6 * var7; var11 += var6) {
         for (int var12 = -var6 * var7; var12 <= var6 * var7; var12 += var6) {
            var4.a(var11 + var6, var5, var12 + 0);
            var4.a(var11 + 0, var5, var12 + 0);
            var4.a(var11 + 0, var5, var12 + var6);
            var4.a(var11 + var6, var5, var12 + var6);
         }
      }

      var4.a();
      GL11.glEndList();
   }

   private void f() {
      Random var1 = new Random(10842L);
      he var2 = he.a;
      var2.b();

      for (int var3 = 0; var3 < 1500; var3++) {
         double var4 = var1.nextFloat() * 2.0F - 1.0F;
         double var6 = var1.nextFloat() * 2.0F - 1.0F;
         double var8 = var1.nextFloat() * 2.0F - 1.0F;
         double var10 = 0.25F + var1.nextFloat() * 0.25F;
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < 1.0 && var12 > 0.01) {
            var12 = 1.0 / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0;
            double var16 = var6 * 100.0;
            double var18 = var8 * 100.0;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var1.nextDouble() * Math.PI * 2.0;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for (int var38 = 0; var38 < 4; var38++) {
               double var39 = 0.0;
               double var41 = ((var38 & 2) - 1) * var10;
               double var43 = ((var38 + 1 & 2) - 1) * var10;
               double var45 = var39;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var51 = var49;
               double var53 = var47 * var28 + var45 * var30;
               double var55 = var45 * var28 - var47 * var30;
               double var57 = var55 * var22 - var51 * var24;
               double var59 = var53;
               double var61 = var51 * var22 + var55 * var24;
               var2.a(var14 + var57, var16 + var59, var18 + var61);
            }
         }
      }

      var2.a();
   }

   public void a(cj var1) {
      if (this.k != null) {
         this.k.b(this);
      }

      this.f = -9999.0;
      this.g = -9999.0;
      this.h = -9999.0;
      km.a.a(var1);
      this.k = var1;
      this.u = new ay(var1);
      if (var1 != null) {
         var1.a(this);
         this.a();
      }
   }

   public void a() {
      ln.K.a(this.t.y.i);
      this.H = this.t.y.e;
      if (this.o != null) {
         for (int var1 = 0; var1 < this.o.length; var1++) {
            this.o[var1].c();
         }
      }

      int var7 = 64 << 3 - this.H;
      if (var7 > 400) {
         var7 = 400;
      }

      this.p = var7 / 16 + 1;
      this.q = 8;
      this.r = var7 / 16 + 1;
      this.o = new bj[this.p * this.q * this.r];
      this.n = new bj[this.p * this.q * this.r];
      byte var2 = 0;
      int var3 = 0;
      this.B = 0;
      this.C = 0;
      this.D = 0;
      this.E = this.p;
      this.F = this.q;
      this.G = this.r;

      for (int var4 = 0; var4 < this.m.size(); var4++) {
         ((bj)this.m.get(var4)).u = false;
      }

      this.m.clear();
      this.a.clear();

      for (int var8 = 0; var8 < this.p; var8++) {
         for (int var5 = 0; var5 < this.q; var5++) {
            for (int var6 = 0; var6 < this.r; var6++) {
               this.o[(var6 * this.q + var5) * this.p + var8] = new bj(this.k, this.a, var8 * 16, var5 * 16, var6 * 16, 16, this.s + var2);
               if (this.w) {
                  this.o[(var6 * this.q + var5) * this.p + var8].z = this.v.get(var3);
               }

               this.o[(var6 * this.q + var5) * this.p + var8].y = false;
               this.o[(var6 * this.q + var5) * this.p + var8].x = true;
               this.o[(var6 * this.q + var5) * this.p + var8].o = true;
               this.o[(var6 * this.q + var5) * this.p + var8].w = var3++;
               this.o[(var6 * this.q + var5) * this.p + var8].f();
               this.n[(var6 * this.q + var5) * this.p + var8] = this.o[(var6 * this.q + var5) * this.p + var8];
               this.m.add(this.o[(var6 * this.q + var5) * this.p + var8]);
               var2 += 3;
            }
         }
      }

      if (this.k != null) {
         be var9 = this.t.g;
         this.b(ei.b(var9.ah), ei.b(var9.ai), ei.b(var9.aj));
         Arrays.sort(this.n, new et(var9));
      }

      this.I = 2;
   }

   public void a(ah var1, nq var2, float var3) {
      if (this.I > 0) {
         this.I--;
      } else {
         fq.a.a(this.k, this.l, this.t.o, this.t.g, var3);
         km.a.a(this.k, this.l, this.t.o, this.t.g, this.t.y, var3);
         this.J = 0;
         this.K = 0;
         this.L = 0;
         be var4 = this.t.g;
         km.b = var4.aF + (var4.ah - var4.aF) * var3;
         km.c = var4.aG + (var4.ai - var4.aG) * var3;
         km.d = var4.aH + (var4.aj - var4.aH) * var3;
         fq.b = var4.aF + (var4.ah - var4.aF) * var3;
         fq.c = var4.aG + (var4.ai - var4.aG) * var3;
         fq.d = var4.aH + (var4.aj - var4.aH) * var3;
         List var5 = this.k.i();
         this.J = var5.size();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            jx var7 = (jx)var5.get(var6);
            if (var7.a(var1) && var2.a(var7.ar) && (var7 != this.t.g || this.t.y.w)) {
               this.K++;
               km.a.a(var7, var3);
            }
         }

         for (int var8 = 0; var8 < this.a.size(); var8++) {
            fq.a.a((ht)this.a.get(var8), var3);
         }
      }
   }

   public String b() {
      return "C: " + this.P + "/" + this.M + ". F: " + this.N + ", O: " + this.O + ", E: " + this.Q;
   }

   public String c() {
      return "E: " + this.K + "/" + this.J + ". B: " + this.L + ", I: " + (this.J - this.L - this.K);
   }

   private void b(int var1, int var2, int var3) {
      var1 -= 8;
      var2 -= 8;
      var3 -= 8;
      this.B = Integer.MAX_VALUE;
      this.C = Integer.MAX_VALUE;
      this.D = Integer.MAX_VALUE;
      this.E = Integer.MIN_VALUE;
      this.F = Integer.MIN_VALUE;
      this.G = Integer.MIN_VALUE;
      int var4 = this.p * 16;
      int var5 = var4 / 2;

      for (int var6 = 0; var6 < this.p; var6++) {
         int var7 = var6 * 16;
         int var8 = var7 + var5 - var1;
         if (var8 < 0) {
            var8 -= var4 - 1;
         }

         var8 /= var4;
         var7 -= var8 * var4;
         if (var7 < this.B) {
            this.B = var7;
         }

         if (var7 > this.E) {
            this.E = var7;
         }

         for (int var9 = 0; var9 < this.r; var9++) {
            int var10 = var9 * 16;
            int var11 = var10 + var5 - var3;
            if (var11 < 0) {
               var11 -= var4 - 1;
            }

            var11 /= var4;
            var10 -= var11 * var4;
            if (var10 < this.D) {
               this.D = var10;
            }

            if (var10 > this.G) {
               this.G = var10;
            }

            for (int var12 = 0; var12 < this.q; var12++) {
               int var13 = var12 * 16;
               if (var13 < this.C) {
                  this.C = var13;
               }

               if (var13 > this.F) {
                  this.F = var13;
               }

               bj var14 = this.o[(var9 * this.q + var12) * this.p + var6];
               boolean var15 = var14.u;
               var14.a(var7, var13, var10);
               if (!var15 && var14.u) {
                  this.m.add(var14);
               }
            }
         }
      }
   }

   public int a(dg var1, int var2, double var3) {
      if (this.t.y.e != this.H) {
         this.a();
      }

      if (var2 == 0) {
         this.M = 0;
         this.N = 0;
         this.O = 0;
         this.P = 0;
         this.Q = 0;
      }

      double var5 = var1.aF + (var1.ah - var1.aF) * var3;
      double var7 = var1.aG + (var1.ai - var1.aG) * var3;
      double var9 = var1.aH + (var1.aj - var1.aH) * var3;
      double var11 = var1.ah - this.f;
      double var13 = var1.ai - this.g;
      double var15 = var1.aj - this.h;
      if (var11 * var11 + var13 * var13 + var15 * var15 > 16.0) {
         this.f = var1.ah;
         this.g = var1.ai;
         this.h = var1.aj;
         this.b(ei.b(var1.ah), ei.b(var1.ai), ei.b(var1.aj));
         Arrays.sort(this.n, new et(var1));
      }

      int var17 = 0;
      if (this.w && !this.t.y.g && var2 == 0) {
         int var18 = 0;
         int var19 = 16;
         this.a(var18, var19);

         for (int var20 = var18; var20 < var19; var20++) {
            this.n[var20].x = true;
         }

         var17 += this.a(var18, var19, var2, var3);

         do {
            var18 = var19;
            var19 *= 2;
            if (var19 > this.n.length) {
               var19 = this.n.length;
            }

            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glDisable(3008);
            GL11.glDisable(2912);
            GL11.glColorMask(false, false, false, false);
            GL11.glDepthMask(false);
            this.a(var18, var19);
            GL11.glPushMatrix();
            float var35 = 0.0F;
            float var21 = 0.0F;
            float var22 = 0.0F;

            for (int var23 = var18; var23 < var19; var23++) {
               if (this.n[var23].e()) {
                  this.n[var23].o = false;
               } else {
                  if (!this.n[var23].o) {
                     this.n[var23].x = true;
                  }

                  if (this.n[var23].o && !this.n[var23].y) {
                     float var24 = ei.c(this.n[var23].a(var1));
                     int var25 = (int)(1.0F + var24 / 128.0F);
                     if (this.x % var25 == var23 % var25) {
                        bj var26 = this.n[var23];
                        float var27 = (float)(var26.i - var5);
                        float var28 = (float)(var26.j - var7);
                        float var29 = (float)(var26.k - var9);
                        float var30 = var27 - var35;
                        float var31 = var28 - var21;
                        float var32 = var29 - var22;
                        if (var30 != 0.0F || var31 != 0.0F || var32 != 0.0F) {
                           GL11.glTranslatef(var30, var31, var32);
                           var35 += var30;
                           var21 += var31;
                           var22 += var32;
                        }

                        ARBOcclusionQuery.glBeginQueryARB(35092, this.n[var23].z);
                        this.n[var23].d();
                        ARBOcclusionQuery.glEndQueryARB(35092);
                        this.n[var23].y = true;
                     }
                  }
               }
            }

            GL11.glPopMatrix();
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2912);
            var17 += this.a(var18, var19, var2, var3);
         } while (var19 < this.n.length);
      } else {
         var17 += this.a(0, this.n.length, var2, var3);
      }

      return var17;
   }

   private void a(int var1, int var2) {
      for (int var3 = var1; var3 < var2; var3++) {
         if (this.n[var3].y) {
            ((Buffer)this.c).clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(this.n[var3].z, 34919, this.c);
            if (this.c.get(0) != 0) {
               this.n[var3].y = false;
               ((Buffer)this.c).clear();
               ARBOcclusionQuery.glGetQueryObjectuARB(this.n[var3].z, 34918, this.c);
               this.n[var3].x = this.c.get(0) != 0;
            }
         }
      }
   }

   private int a(int var1, int var2, int var3, double var4) {
      this.R.clear();
      int var6 = 0;

      for (int var7 = var1; var7 < var2; var7++) {
         if (var3 == 0) {
            this.M++;
            if (this.n[var7].p[var3]) {
               this.Q++;
            } else if (!this.n[var7].o) {
               this.N++;
            } else if (this.w && !this.n[var7].x) {
               this.O++;
            } else {
               this.P++;
            }
         }

         if (!this.n[var7].p[var3] && this.n[var7].o && this.n[var7].x) {
            int var8 = this.n[var7].a(var3);
            if (var8 >= 0) {
               this.R.add(this.n[var7]);
               var6++;
            }
         }
      }

      be var19 = this.t.g;
      double var20 = var19.aF + (var19.ah - var19.aF) * var4;
      double var10 = var19.aG + (var19.ai - var19.aG) * var4;
      double var12 = var19.aH + (var19.aj - var19.aH) * var4;
      int var14 = 0;

      for (int var15 = 0; var15 < this.S.length; var15++) {
         this.S[var15].b();
      }

      for (int var21 = 0; var21 < this.R.size(); var21++) {
         bj var16 = (bj)this.R.get(var21);
         int var17 = -1;

         for (int var18 = 0; var18 < var14; var18++) {
            if (this.S[var18].a(var16.i, var16.j, var16.k)) {
               var17 = var18;
            }
         }

         if (var17 < 0) {
            var17 = var14++;
            this.S[var17].a(var16.i, var16.j, var16.k, var20, var10, var12);
         }

         this.S[var17].a(var16.a(var3));
      }

      this.a(var3, var4);
      return var6;
   }

   public void a(int var1, double var2) {
      for (int var4 = 0; var4 < this.S.length; var4++) {
         this.S[var4].a();
      }
   }

   public void d() {
      this.x++;
   }

   public void a(float var1) {
      GL11.glDisable(3553);
      ah var2 = this.k.b(var1);
      float var3 = (float)var2.a;
      float var4 = (float)var2.b;
      float var5 = (float)var2.c;
      if (this.t.y.g) {
         float var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
         float var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
         float var8 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
         var3 = var6;
         var4 = var7;
         var5 = var8;
      }

      GL11.glColor3f(var3, var4, var5);
      he var12 = he.a;
      GL11.glDepthMask(false);
      GL11.glEnable(2912);
      GL11.glColor3f(var3, var4, var5);
      GL11.glCallList(this.z);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glDisable(3008);
      GL11.glEnable(3042);
      GL11.glBlendFunc(1, 1);
      GL11.glPushMatrix();
      float var13 = 0.0F;
      float var14 = 0.0F;
      float var9 = 0.0F;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTranslatef(var13, var14, var9);
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(this.k.c(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
      float var10 = 30.0F;
      GL11.glBindTexture(3553, this.l.a("/terrain/sun.png"));
      var12.b();
      var12.a(-var10, 100.0, -var10, 0.0, 0.0);
      var12.a(var10, 100.0, -var10, 1.0, 0.0);
      var12.a(var10, 100.0, var10, 1.0, 1.0);
      var12.a(-var10, 100.0, var10, 0.0, 1.0);
      var12.a();
      var10 = 20.0F;
      GL11.glBindTexture(3553, this.l.a("/terrain/moon.png"));
      var12.b();
      var12.a(-var10, -100.0, var10, 1.0, 1.0);
      var12.a(var10, -100.0, var10, 0.0, 1.0);
      var12.a(var10, -100.0, -var10, 0.0, 0.0);
      var12.a(-var10, -100.0, -var10, 1.0, 0.0);
      var12.a();
      GL11.glDisable(3553);
      float var11 = this.k.f(var1);
      if (var11 > 0.0F) {
         GL11.glColor4f(var11, var11, var11, var11);
         GL11.glCallList(this.y);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(2912);
      GL11.glPopMatrix();
      GL11.glColor3f(var3 * 0.2F + 0.04F, var4 * 0.2F + 0.04F, var5 * 0.6F + 0.1F);
      GL11.glDisable(3553);
      GL11.glCallList(this.A);
      GL11.glEnable(3553);
      GL11.glDepthMask(true);
   }

   public void b(float var1) {
      if (this.t.y.i) {
         this.c(var1);
      } else {
         GL11.glDisable(2884);
         float var2 = (float)(this.t.g.aG + (this.t.g.ai - this.t.g.aG) * var1);
         byte var3 = 32;
         int var4 = 256 / var3;
         he var5 = he.a;
         GL11.glBindTexture(3553, this.l.a("/clouds.png"));
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         ah var6 = this.k.d(var1);
         float var7 = (float)var6.a;
         float var8 = (float)var6.b;
         float var9 = (float)var6.c;
         if (this.t.y.g) {
            float var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
            float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
            float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
            var7 = var10;
            var8 = var11;
            var9 = var12;
         }

         float var22 = 4.8828125E-4F;
         double var23 = this.t.g.ae + (this.t.g.ah - this.t.g.ae) * var1 + (this.x + var1) * 0.03F;
         double var13 = this.t.g.ag + (this.t.g.aj - this.t.g.ag) * var1;
         int var15 = ei.b(var23 / 2048.0);
         int var16 = ei.b(var13 / 2048.0);
         var23 -= var15 * 2048;
         var13 -= var16 * 2048;
         float var17 = 120.0F - var2 + 0.33F;
         float var18 = (float)(var23 * var22);
         float var19 = (float)(var13 * var22);
         var5.b();
         var5.a(var7, var8, var9, 0.8F);

         for (int var20 = -var3 * var4; var20 < var3 * var4; var20 += var3) {
            for (int var21 = -var3 * var4; var21 < var3 * var4; var21 += var3) {
               var5.a(var20 + 0, var17, var21 + var3, (var20 + 0) * var22 + var18, (var21 + var3) * var22 + var19);
               var5.a(var20 + var3, var17, var21 + var3, (var20 + var3) * var22 + var18, (var21 + var3) * var22 + var19);
               var5.a(var20 + var3, var17, var21 + 0, (var20 + var3) * var22 + var18, (var21 + 0) * var22 + var19);
               var5.a(var20 + 0, var17, var21 + 0, (var20 + 0) * var22 + var18, (var21 + 0) * var22 + var19);
            }
         }

         var5.a();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2884);
      }
   }

   public void c(float var1) {
      GL11.glDisable(2884);
      float var2 = (float)(this.t.g.aG + (this.t.g.ai - this.t.g.aG) * var1);
      he var3 = he.a;
      float var4 = 12.0F;
      float var5 = 4.0F;
      double var6 = (this.t.g.ae + (this.t.g.ah - this.t.g.ae) * var1 + (this.x + var1) * 0.03F) / var4;
      double var8 = (this.t.g.ag + (this.t.g.aj - this.t.g.ag) * var1) / var4 + 0.33F;
      float var10 = 108.0F - var2 + 0.33F;
      int var11 = ei.b(var6 / 2048.0);
      int var12 = ei.b(var8 / 2048.0);
      var6 -= var11 * 2048;
      var8 -= var12 * 2048;
      GL11.glBindTexture(3553, this.l.a("/clouds.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      ah var13 = this.k.d(var1);
      float var14 = (float)var13.a;
      float var15 = (float)var13.b;
      float var16 = (float)var13.c;
      if (this.t.y.g) {
         float var17 = (var14 * 30.0F + var15 * 59.0F + var16 * 11.0F) / 100.0F;
         float var18 = (var14 * 30.0F + var15 * 70.0F) / 100.0F;
         float var19 = (var14 * 30.0F + var16 * 70.0F) / 100.0F;
         var14 = var17;
         var15 = var18;
         var16 = var19;
      }

      float var35 = (float)(var6 * 0.0);
      float var37 = (float)(var8 * 0.0);
      float var39 = 0.00390625F;
      var35 = ei.b(var6) * var39;
      var37 = ei.b(var8) * var39;
      float var20 = (float)(var6 - ei.b(var6));
      float var21 = (float)(var8 - ei.b(var8));
      byte var22 = 8;
      byte var23 = 3;
      float var24 = 9.765625E-4F;
      GL11.glScalef(var4, 1.0F, var4);

      for (int var25 = 0; var25 < 2; var25++) {
         if (var25 == 0) {
            GL11.glColorMask(false, false, false, false);
         } else {
            GL11.glColorMask(true, true, true, true);
         }

         for (int var26 = -var23 + 1; var26 <= var23; var26++) {
            for (int var27 = -var23 + 1; var27 <= var23; var27++) {
               var3.b();
               float var28 = var26 * var22;
               float var29 = var27 * var22;
               float var30 = var28 - var20;
               float var31 = var29 - var21;
               if (var10 > -var5 - 1.0F) {
                  var3.a(var14 * 0.7F, var15 * 0.7F, var16 * 0.7F, 0.8F);
                  var3.b(0.0F, -1.0F, 0.0F);
                  var3.a(var30 + 0.0F, var10 + 0.0F, var31 + var22, (var28 + 0.0F) * var39 + var35, (var29 + var22) * var39 + var37);
                  var3.a(var30 + var22, var10 + 0.0F, var31 + var22, (var28 + var22) * var39 + var35, (var29 + var22) * var39 + var37);
                  var3.a(var30 + var22, var10 + 0.0F, var31 + 0.0F, (var28 + var22) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                  var3.a(var30 + 0.0F, var10 + 0.0F, var31 + 0.0F, (var28 + 0.0F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
               }

               if (var10 <= var5 + 1.0F) {
                  var3.a(var14, var15, var16, 0.8F);
                  var3.b(0.0F, 1.0F, 0.0F);
                  var3.a(var30 + 0.0F, var10 + var5 - var24, var31 + var22, (var28 + 0.0F) * var39 + var35, (var29 + var22) * var39 + var37);
                  var3.a(var30 + var22, var10 + var5 - var24, var31 + var22, (var28 + var22) * var39 + var35, (var29 + var22) * var39 + var37);
                  var3.a(var30 + var22, var10 + var5 - var24, var31 + 0.0F, (var28 + var22) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                  var3.a(var30 + 0.0F, var10 + var5 - var24, var31 + 0.0F, (var28 + 0.0F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
               }

               var3.a(var14 * 0.9F, var15 * 0.9F, var16 * 0.9F, 0.8F);
               if (var26 > -1) {
                  var3.b(-1.0F, 0.0F, 0.0F);

                  for (int var32 = 0; var32 < var22; var32++) {
                     var3.a(var30 + var32 + 0.0F, var10 + 0.0F, var31 + var22, (var28 + var32 + 0.5F) * var39 + var35, (var29 + var22) * var39 + var37);
                     var3.a(var30 + var32 + 0.0F, var10 + var5, var31 + var22, (var28 + var32 + 0.5F) * var39 + var35, (var29 + var22) * var39 + var37);
                     var3.a(var30 + var32 + 0.0F, var10 + var5, var31 + 0.0F, (var28 + var32 + 0.5F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                     var3.a(var30 + var32 + 0.0F, var10 + 0.0F, var31 + 0.0F, (var28 + var32 + 0.5F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                  }
               }

               if (var26 <= 1) {
                  var3.b(1.0F, 0.0F, 0.0F);

                  for (int var40 = 0; var40 < var22; var40++) {
                     var3.a(var30 + var40 + 1.0F - var24, var10 + 0.0F, var31 + var22, (var28 + var40 + 0.5F) * var39 + var35, (var29 + var22) * var39 + var37);
                     var3.a(var30 + var40 + 1.0F - var24, var10 + var5, var31 + var22, (var28 + var40 + 0.5F) * var39 + var35, (var29 + var22) * var39 + var37);
                     var3.a(var30 + var40 + 1.0F - var24, var10 + var5, var31 + 0.0F, (var28 + var40 + 0.5F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                     var3.a(var30 + var40 + 1.0F - var24, var10 + 0.0F, var31 + 0.0F, (var28 + var40 + 0.5F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                  }
               }

               var3.a(var14 * 0.8F, var15 * 0.8F, var16 * 0.8F, 0.8F);
               if (var27 > -1) {
                  var3.b(0.0F, 0.0F, -1.0F);

                  for (int var41 = 0; var41 < var22; var41++) {
                     var3.a(var30 + 0.0F, var10 + var5, var31 + var41 + 0.0F, (var28 + 0.0F) * var39 + var35, (var29 + var41 + 0.5F) * var39 + var37);
                     var3.a(var30 + var22, var10 + var5, var31 + var41 + 0.0F, (var28 + var22) * var39 + var35, (var29 + var41 + 0.5F) * var39 + var37);
                     var3.a(var30 + var22, var10 + 0.0F, var31 + var41 + 0.0F, (var28 + var22) * var39 + var35, (var29 + var41 + 0.5F) * var39 + var37);
                     var3.a(var30 + 0.0F, var10 + 0.0F, var31 + var41 + 0.0F, (var28 + 0.0F) * var39 + var35, (var29 + var41 + 0.5F) * var39 + var37);
                  }
               }

               if (var27 <= 1) {
                  var3.b(0.0F, 0.0F, 1.0F);

                  for (int var42 = 0; var42 < var22; var42++) {
                     var3.a(var30 + 0.0F, var10 + var5, var31 + var42 + 1.0F - var24, (var28 + 0.0F) * var39 + var35, (var29 + var42 + 0.5F) * var39 + var37);
                     var3.a(var30 + var22, var10 + var5, var31 + var42 + 1.0F - var24, (var28 + var22) * var39 + var35, (var29 + var42 + 0.5F) * var39 + var37);
                     var3.a(var30 + var22, var10 + 0.0F, var31 + var42 + 1.0F - var24, (var28 + var22) * var39 + var35, (var29 + var42 + 0.5F) * var39 + var37);
                     var3.a(var30 + 0.0F, var10 + 0.0F, var31 + var42 + 1.0F - var24, (var28 + 0.0F) * var39 + var35, (var29 + var42 + 0.5F) * var39 + var37);
                  }
               }

               var3.a();
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2884);
   }

   public boolean a(dg var1, boolean var2) {
      Collections.sort(this.m, new gc(var1));
      int var3 = this.m.size() - 1;
      int var4 = this.m.size();

      for (int var5 = 0; var5 < var4; var5++) {
         bj var6 = (bj)this.m.get(var3 - var5);
         if (!var2) {
            if (var6.a(var1) > 1024.0F) {
               if (var6.o) {
                  if (var5 >= 3) {
                     return false;
                  }
               } else if (var5 >= 1) {
                  return false;
               }
            }
         } else if (!var6.o) {
            continue;
         }

         var6.a();
         this.m.remove(var6);
         var6.u = false;
      }

      return this.m.size() == 0;
   }

   public void a(dg var1, lv var2, int var3, eo var4, float var5) {
      he var6 = he.a;
      GL11.glEnable(3042);
      GL11.glEnable(3008);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, (ei.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F);
      if (var3 == 0) {
         if (this.i > 0.0F) {
            GL11.glBlendFunc(774, 768);
            int var7 = this.l.a("/terrain.png");
            GL11.glBindTexture(3553, var7);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
            GL11.glPushMatrix();
            int var8 = this.k.a(var2.b, var2.c, var2.d);
            ln var9 = var8 > 0 ? ln.n[var8] : null;
            GL11.glDisable(3008);
            GL11.glPolygonOffset(-3.0F, -3.0F);
            GL11.glEnable(32823);
            var6.b();
            double var10 = var1.aF + (var1.ah - var1.aF) * var5;
            double var12 = var1.aG + (var1.ai - var1.aG) * var5;
            double var14 = var1.aH + (var1.aj - var1.aH) * var5;
            var6.b(-var10, -var12, -var14);
            var6.c();
            if (var9 == null) {
               var9 = ln.t;
            }

            this.u.a(var9, var2.b, var2.c, var2.d, 240 + (int)(this.i * 10.0F));
            var6.a();
            var6.b(0.0, 0.0, 0.0);
            GL11.glPolygonOffset(0.0F, 0.0F);
            GL11.glDisable(32823);
            GL11.glEnable(3008);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
         }
      } else if (var4 != null) {
         GL11.glBlendFunc(770, 771);
         float var16 = ei.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F;
         GL11.glColor4f(var16, var16, var16, ei.a((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F);
         int var17 = this.l.a("/terrain.png");
         GL11.glBindTexture(3553, var17);
         int var18 = var2.b;
         int var20 = var2.c;
         int var11 = var2.d;
         if (var2.e == 0) {
            var20--;
         }

         if (var2.e == 1) {
            var20++;
         }

         if (var2.e == 2) {
            var11--;
         }

         if (var2.e == 3) {
            var11++;
         }

         if (var2.e == 4) {
            var18--;
         }

         if (var2.e == 5) {
            var18++;
         }
      }

      GL11.glDisable(3042);
      GL11.glDisable(3008);
   }

   public void b(dg var1, lv var2, int var3, eo var4, float var5) {
      if (var3 == 0 && var2.a == 0) {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         float var6 = 0.002F;
         int var7 = this.k.a(var2.b, var2.c, var2.d);
         if (var7 > 0) {
            ln.n[var7].a((mz)this.k, var2.b, var2.c, var2.d);
            double var8 = var1.aF + (var1.ah - var1.aF) * var5;
            double var10 = var1.aG + (var1.ai - var1.aG) * var5;
            double var12 = var1.aH + (var1.aj - var1.aH) * var5;
            this.a(ln.n[var7].f(this.k, var2.b, var2.c, var2.d).b(var6, var6, var6).c(-var8, -var10, -var12));
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
      }
   }

   private void a(cb var1) {
      he var2 = he.a;
      var2.a(3);
      var2.a(var1.a, var1.b, var1.c);
      var2.a(var1.d, var1.b, var1.c);
      var2.a(var1.d, var1.b, var1.f);
      var2.a(var1.a, var1.b, var1.f);
      var2.a(var1.a, var1.b, var1.c);
      var2.a();
      var2.a(3);
      var2.a(var1.a, var1.e, var1.c);
      var2.a(var1.d, var1.e, var1.c);
      var2.a(var1.d, var1.e, var1.f);
      var2.a(var1.a, var1.e, var1.f);
      var2.a(var1.a, var1.e, var1.c);
      var2.a();
      var2.a(1);
      var2.a(var1.a, var1.b, var1.c);
      var2.a(var1.a, var1.e, var1.c);
      var2.a(var1.d, var1.b, var1.c);
      var2.a(var1.d, var1.e, var1.c);
      var2.a(var1.d, var1.b, var1.f);
      var2.a(var1.d, var1.e, var1.f);
      var2.a(var1.a, var1.b, var1.f);
      var2.a(var1.a, var1.e, var1.f);
      var2.a();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = ei.a(var1, 16);
      int var8 = ei.a(var2, 16);
      int var9 = ei.a(var3, 16);
      int var10 = ei.a(var4, 16);
      int var11 = ei.a(var5, 16);
      int var12 = ei.a(var6, 16);

      for (int var13 = var7; var13 <= var10; var13++) {
         int var14 = var13 % this.p;
         if (var14 < 0) {
            var14 += this.p;
         }

         for (int var15 = var8; var15 <= var11; var15++) {
            int var16 = var15 % this.q;
            if (var16 < 0) {
               var16 += this.q;
            }

            for (int var17 = var9; var17 <= var12; var17++) {
               int var18 = var17 % this.r;
               if (var18 < 0) {
                  var18 += this.r;
               }

               int var19 = (var18 * this.q + var16) * this.p + var14;
               bj var20 = this.o[var19];
               if (!var20.u) {
                  this.m.add(var20);
               }

               var20.f();
            }
         }
      }
   }

   @Override
   public void a(int var1, int var2, int var3) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   @Override
   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   public void a(nq var1, float var2) {
      for (int var3 = 0; var3 < this.o.length; var3++) {
         if (!this.o[var3].e() && (!this.o[var3].o || (var3 + this.j & 15) == 0)) {
            this.o[var3].a(var1);
         }
      }

      this.j++;
   }

   @Override
   public void a(String var1, int var2, int var3, int var4) {
      if (var1 != null) {
         this.t.u.b("C418 - " + var1);
      }

      this.t.A.a(var1, var2, var3, var4, 1.0F, 1.0F);
   }

   @Override
   public void a(String var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 16.0F;
      if (var8 > 1.0F) {
         var10 *= var8;
      }

      if (this.t.g.d(var2, var4, var6) < var10 * var10) {
         this.t.A.b(var1, (float)var2, (float)var4, (float)var6, var8, var9);
      }
   }

   @Override
   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      double var14 = this.t.g.ah - var2;
      double var16 = this.t.g.ai - var4;
      double var18 = this.t.g.aj - var6;
      if (!(var14 * var14 + var16 * var16 + var18 * var18 > 256.0)) {
         if (var1 == "bubble") {
            this.t.h.a(new aw(this.k, var2, var4, var6, var8, var10, var12));
         } else if (var1 == "smoke") {
            this.t.h.a(new my(this.k, var2, var4, var6));
         } else if (var1 == "explode") {
            this.t.h.a(new dj(this.k, var2, var4, var6, var8, var10, var12));
         } else if (var1 == "flame") {
            this.t.h.a(new is(this.k, var2, var4, var6, var8, var10, var12));
         } else if (var1 == "lava") {
            this.t.h.a(new cm(this.k, var2, var4, var6));
         } else if (var1 == "splash") {
            this.t.h.a(new kf(this.k, var2, var4, var6, var8, var10, var12));
         } else if (var1 == "largesmoke") {
            this.t.h.a(new my(this.k, var2, var4, var6, 2.5F));
         } else if (var1 == "reddust") {
            this.t.h.a(new eh(this.k, var2, var4, var6));
         } else if (var1 == "snowballpoof") {
            this.t.h.a(new hw(this.k, var2, var4, var6, dd.aB));
         } else if (var1 == "slime") {
            this.t.h.a(new hw(this.k, var2, var4, var6, dd.aK));
         }
      }
   }

   @Override
   public void a(jx var1) {
      if (var1.aV != null) {
         this.l.a(var1.aV, new jh());
      }
   }

   @Override
   public void b(jx var1) {
      if (var1.aV != null) {
         this.l.b(var1.aV);
      }
   }

   @Override
   public void e() {
      for (int var1 = 0; var1 < this.o.length; var1++) {
         if (this.o[var1].A) {
            if (!this.o[var1].u) {
               this.m.add(this.o[var1]);
            }

            this.o[var1].f();
         }
      }
   }
}
