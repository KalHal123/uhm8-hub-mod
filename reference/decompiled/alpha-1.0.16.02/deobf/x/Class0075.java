package x;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class Class0075 extends Class0032 {
   private static final Random h = new Random();
   String[] a = new String[]{
      " *   * * *   * *** *** *** *** *** ***",
      " ** ** * **  * *   *   * * * * *    * ",
      " * * * * * * * **  *   **  *** **   * ",
      " *   * * *  ** *   *   * * * * *    * ",
      " *   * * *   * *** *** * * * * *    * "
   };
   private Class0263[][] i;
   private float k = 0.0F;
   private String l = "missingno";

   public Class0075() {
      try {
         ArrayList var1 = new ArrayList();
         BufferedReader var2 = new BufferedReader(new InputStreamReader(Class0075.class.getResourceAsStream("/title/splashes.txt")));
         String var3 = "";

         while ((var3 = var2.readLine()) != null) {
            var3 = var3.trim();
            if (var3.length() > 0) {
               var1.add(var3);
            }
         }

         this.l = (String)var1.get(h.nextInt(var1.size()));
      } catch (Exception var4) {
      }
   }

   @Override
   public void g() {
      this.k++;
      if (this.i != null) {
         for (int var1 = 0; var1 < this.i.length; var1++) {
            for (int var2 = 0; var2 < this.i[var1].length; var2++) {
               this.i[var1][var2].a();
            }
         }
      }
   }

   @Override
   protected void a(char var1, int var2) {
   }

   @Override
   public void a() {
      Calendar var1 = Calendar.getInstance();
      var1.setTime(new Date());
      if (this.b.i.b.equals("athna") && var1.get(2) + 1 == 7 && var1.get(5) == 26 && var1.get(1) == 2010) {
         this.l = "Happy birthday! I love you! Alex x";
      } else if (var1.get(2) + 1 == 11 && var1.get(5) == 9) {
         this.l = "Happy birthday, ez!";
      } else if (var1.get(2) + 1 == 6 && var1.get(5) == 1) {
         this.l = "Happy birthday, Notch!";
      } else if (var1.get(2) + 1 == 12 && var1.get(5) == 24) {
         this.l = "Merry X-mas!";
      } else if (var1.get(2) + 1 == 1 && var1.get(5) == 1) {
         this.l = "Happy new year!";
      }

      this.e.clear();
      this.e.add(new Class0138(1, this.c / 2 - 100, this.d / 4 + 48, "Singleplayer"));
      this.e.add(new Class0138(2, this.c / 2 - 100, this.d / 4 + 72, "Multiplayer"));
      this.e.add(new Class0138(3, this.c / 2 - 100, this.d / 4 + 96, "Play tutorial level"));
      this.e.add(new Class0138(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Options..."));
      ((Class0138)this.e.get(2)).e = false;
      if (this.b.i == null) {
         ((Class0138)this.e.get(1)).e = false;
      }
   }

   @Override
   protected void a(Class0138 var1) {
      if (var1.d == 0) {
         this.b.a(new Class0022(this, this.b.y));
      }

      if (var1.d == 1) {
         this.b.a(new Class0251(this));
      }

      if (var1.d == 2) {
         this.b.a(new Class0156(this));
      }
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      Class0195 var4 = Class0195.a;
      this.a(var3);
      GL11.glBindTexture(3553, this.b.n.a("/gui/logo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var4.b(16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef(this.c / 2 + 90, 70.0F, 0.0F);
      GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
      float var5 = 1.8F - Class0118.e(Class0118.a((float)(System.currentTimeMillis() % 1000L) / 1000.0F * (float) Math.PI * 2.0F) * 0.1F);
      var5 = var5 * 100.0F / (this.g.a(this.l) + 32);
      GL11.glScalef(var5, var5, var5);
      this.a(this.g, this.l, 0, -8, 16776960);
      GL11.glPopMatrix();
      String var6 = "Copyright Mojang Specifications. Do not distribute.";
      this.b(this.g, var6, this.c - this.g.a(var6) - 2, this.d - 10, 16777215);
      long var7 = Runtime.getRuntime().maxMemory();
      long var9 = Runtime.getRuntime().totalMemory();
      long var11 = Runtime.getRuntime().freeMemory();
      long var13 = var7 - var11;
      var6 = "Free memory: " + var13 * 100L / var7 + "% of " + var7 / 1024L / 1024L + "MB";
      this.b(this.g, var6, this.c - this.g.a(var6) - 2, 2, 8421504);
      var6 = "Allocated memory: " + var9 * 100L / var7 + "% (" + var9 / 1024L / 1024L + "MB)";
      this.b(this.g, var6, this.c - this.g.a(var6) - 2, 12, 8421504);
      super.a(var1, var2, var3);
   }

   private void a(float var1) {
      if (this.i == null) {
         this.i = new Class0263[this.a[0].length()][this.a.length];

         for (int var2 = 0; var2 < this.i.length; var2++) {
            for (int var3 = 0; var3 < this.i[var2].length; var3++) {
               this.i[var2][var3] = new Class0263(this, var2, var3);
            }
         }
      }

      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      Class0233 var14 = new Class0233(this.b.c, this.b.d);
      int var15 = 120 * var14.a;
      GLU.gluPerspective(70.0F, (float)this.b.c / var15, 0.05F, 100.0F);
      GL11.glViewport(0, this.b.d - var15, this.b.c, var15);
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GL11.glDisable(2884);
      GL11.glCullFace(1029);
      GL11.glDepthMask(true);

      for (int var4 = 0; var4 < 3; var4++) {
         GL11.glPushMatrix();
         GL11.glTranslatef(0.4F, 0.6F, -12.0F);
         if (var4 == 0) {
            GL11.glClear(256);
            GL11.glTranslatef(0.0F, -0.4F, 0.0F);
            GL11.glScalef(0.98F, 1.0F, 1.0F);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
         }

         if (var4 == 1) {
            GL11.glDisable(3042);
            GL11.glClear(256);
         }

         if (var4 == 2) {
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
         }

         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(0.89F, 1.0F, 0.4F);
         GL11.glTranslatef(-this.a[0].length() * 0.5F, -this.a.length * 0.5F, 0.0F);
         GL11.glBindTexture(3553, this.b.n.a("/terrain.png"));
         if (var4 == 0) {
            GL11.glBindTexture(3553, this.b.n.a("/title/black.png"));
         }

         Class0026 var5 = new Class0026();

         for (int var6 = 0; var6 < this.a.length; var6++) {
            for (int var7 = 0; var7 < this.a[var6].length(); var7++) {
               char var8 = this.a[var6].charAt(var7);
               if (var8 != ' ') {
                  GL11.glPushMatrix();
                  Class0263 var9 = this.i[var7][var6];
                  float var10 = (float)(var9.b + (var9.a - var9.b) * var1);
                  float var11 = 1.0F;
                  float var12 = 1.0F;
                  float var13 = 0.0F;
                  if (var4 == 0) {
                     var11 = var10 * 0.04F + 1.0F;
                     var12 = 1.0F / var11;
                     var10 = 0.0F;
                  }

                  GL11.glTranslatef(var7, var6, var10);
                  GL11.glScalef(var11, var11, var11);
                  GL11.glRotatef(var13, 0.0F, 1.0F, 0.0F);
                  var5.a(Class0312.t, var12);
                  GL11.glPopMatrix();
               }
            }
         }

         GL11.glPopMatrix();
      }

      GL11.glDisable(3042);
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glViewport(0, 0, this.b.c, this.b.d);
      GL11.glEnable(2884);
   }
}
