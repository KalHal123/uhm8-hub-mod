package ext;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class Class373 extends Class265 {
   private static final Random field_1054 = new Random();
   String[] field_1143 = new String[]{
      " *   * * *   * *** *** *** *** *** ***",
      " ** ** * **  * *   *   * * * * *    * ",
      " * * * * * * * **  *   **  *** **   * ",
      " *   * * *  ** *   *   * * * * *    * ",
      " *   * * *   * *** *** * * * * *    * "
   };
   private Class419[][] field_2590;
   private String field_868 = "missingno";
   private String field_2591 = "";

   public Class373() {
      try {
         ArrayList var1 = new ArrayList();
         BufferedReader var2 = new BufferedReader(new InputStreamReader(Class100.method_1145("/title/splashes.txt")));
         String var3 = "";

         while ((var3 = var2.readLine()) != null) {
            var3 = var3.trim();
            if (var3.length() > 0) {
               var1.add(var3);
            }
         }

         this.field_868 = (String)var1.get(field_1054.nextInt(var1.size()));
      } catch (Exception var4) {
      }
   }

   @Override
   public void method_1414() {
      if (this.field_2590 != null) {
         for (int var1 = 0; var1 < this.field_2590.length; var1++) {
            for (int var2 = 0; var2 < this.field_2590[var1].length; var2++) {
               this.field_2590[var1][var2].method_293();
            }
         }
      }
   }

   private void method_1575() {
      try {
         this.field_2591 = Files.readAllLines(Paths.get("./qfile"), Charset.forName("utf8")).get(0);
         File var1 = new File(Minecraft.method_1379(), "saves/" + this.field_2591);
         if (!var1.exists() || !var1.isDirectory()) {
            throw new IOException();
         }

         this.field_577.get(1).field_143 = true;
         this.field_577.get(1).field_1027 = "Quickload : " + this.field_2591;
         this.field_577.get(1).field_368 = 80 + this.field_2591.length() * 4;
      } catch (IOException var2) {
         this.field_577.get(1).field_143 = false;
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
   }

   @Override
   public void method_836() {
      Calendar var1 = Calendar.getInstance();
      var1.setTime(new Date());
      int var2 = var1.get(2);
      if (var2 == 5 && var1.get(5) == 5) {
         this.field_868 = "Happy birthday, 8064262!";
      } else if (var2 == 5 && var1.get(5) == 6) {
         this.field_868 = "Happy birthday, my beloved...";
      } else if (var2 == 7 && var1.get(5) == 15) {
         String[] var3 = new String[]{"\"Screw you, cat!\"", "\"We're like a secret organization!\"", "Interval Days", "Interval Daze"};
         this.field_868 = var3[field_1054.nextInt(var3.length)];
      } else if (var2 == 7 && var1.get(5) == 31) {
         this.field_868 = "39!";
      } else if (var2 == 2 && var1.get(5) == 3) {
         this.field_868 = "Drummin' along since 2000!";
      } else if ((var2 != 8 || var1.get(5) != 18) && (var2 != 5 || var1.get(5) != 24)) {
         if (var1.get(10) == 7 && var1.get(12) == 27) {
            if (field_1054.nextBoolean()) {
               this.field_868 = "How?";
            } else {
               this.field_868 = "When you see it...";
            }
         }
      } else {
         this.field_868 = "Also try ShovelForge!";
      }

      this.field_577.clear();
      this.field_577.add(new Class279(1, this.field_2345 / 8, this.field_562 / 4 + 48, 120, 20, "Play", true));
      this.field_577.add(new Class279(4, this.field_2345 / 8 + 200 - 60, this.field_562 / 4 + 48, 60, 20, "Quickload", true));
      this.field_577.add(new Class279(0, this.field_2345 / 8, this.field_562 / 4 + 96 + 12, 100, 20, "Options", true));
      this.field_577.add(new Class279(5, this.field_2345 / 8, this.field_562 / 4 + 120 + 12, 80, 20, "Exit", true));
      this.field_577.add(new Class279(6, this.field_2345 / 8, this.field_562 / 4 + 84, 70, 20, "Visuals", true));
      this.field_577.add(new Class279(7, this.field_2345 / 8 + 75, this.field_562 / 4 + 84, 70, 20, "Extensions", true));
      this.field_577.add(new Class279(8, this.field_2345 / 8 + 90, this.field_562 / 4 + 120 + 12, 80, 20, "Credits", true));
      this.method_1575();
      if (Class278.field_2754 == null) {
         this.field_577.get(1).field_143 = false;
      }

      if (Class53.field_1690 != null && !Class53.field_1690.playing("BgMusic")) {
         Class119.field_1519.field_485.method_963("mainmenu", true);
      }
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_2254 == 0) {
         this.field_3013.method_1290(new Class500(this, this.field_3013.field_1754));
      }

      if (var1.field_2254 == 1) {
         this.field_3013.method_1290(new Class649(this));
      }

      if (var1.field_2254 == 2) {
         if (Class119.method_696(54)) {
            this.field_3013.method_1290(new Class613(this));
         } else {
            this.field_3013.method_1290(new Class657(this));
         }
      }

      if (var1.field_2254 == 3) {
         if (Thread62.field_221) {
            this.field_3013.method_1290(Class119.method_696(54) ? new Class401(this) : new Class515(this));
         } else {
            this.field_3013.method_1290(new Class384("", "Downloading resources. Try again later."));
         }
      }

      if (var1.field_2254 == 4 && this.field_2591 != "") {
         File var2 = new File(Minecraft.method_1379(), "saves/" + this.field_2591);
         if (var2.exists() && var2.isDirectory()) {
            this.field_3013.field_3103 = new Class420(this.field_3013);
            this.field_3013.method_715(this.field_2591);
            this.field_3013.method_1290((Class265)null);
         }
      }

      if (var1.field_2254 == 5) {
         this.field_3013.method_1859();
         System.exit(39);
      }

      if (var1.field_2254 == 6) {
         this.field_3013.method_1290(new Class367(this));
      }

      if (var1.field_2254 == 7) {
         this.field_3013.method_1290(new Class690(this));
      }

      if (var1.field_2254 == 8) {
         this.field_3013.method_1290(new Class17(this));
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      Class254.method_421(0, this.field_562 / 4 + 40, this.field_2345, this.field_562, -536870912, -2146697188);
      Class254.method_421(0, 0, this.field_2345, this.field_562 / 4 + 40, 447997183, 11789567);
      Class368 var4 = Class368.field_2696;
      this.method_1518(var3);
      GL11.glBindTexture(3553, this.field_3013.field_2176.method_1545("/gui/logo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_1748(16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef(this.field_2345 / 2 + 90, 70.0F, 0.0F);
      GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
      float var5 = 1.8F - Class469.method_1362(Class469.method_1667((float)(System.currentTimeMillis() % 1000L) / 1000.0F * (float) Math.PI * 2.0F) * 0.1F);
      var5 = var5 * 100.0F / (this.field_1683.method_962(this.field_868) + 32);
      GL11.glScalef(var5, var5, var5);
      this.method_1491(this.field_1683, this.field_868, 0, -8, 16776960);
      GL11.glPopMatrix();
      Class254.method_773(this.field_1683, "Logged in as " + this.field_3013.field_2935.field_382, this.field_2345 / 8, this.field_562 / 4 + 30, 1627389951);
      String var6 = "Copyright Mojang. Distribution strictly prohibited.";
      Class254.method_773(this.field_1683, var6, this.field_2345 - this.field_1683.method_962(var6) - 2, this.field_562 - 10, 16777215);
      long var7 = Runtime.getRuntime().maxMemory();
      long var9 = Runtime.getRuntime().totalMemory();
      long var11 = Runtime.getRuntime().freeMemory();
      long var13 = var7 - var11;
      var6 = "Free memory: " + var13 * 100L / var7 + "% of " + var7 / 1024L / 1024L + "MB";
      Class254.method_773(this.field_1683, var6, this.field_2345 - this.field_1683.method_962(var6) - 2, 2, 8421504);
      var6 = "Allocated memory: " + var9 * 100L / var7 + "% (" + var9 / 1024L / 1024L + "MB)";
      Class254.method_773(this.field_1683, var6, this.field_2345 - this.field_1683.method_962(var6) - 2, 12, 8421504);
      super.method_1938(var1, var2, var3);
   }

   private void method_1518(float var1) {
      if (this.field_2590 == null) {
         this.field_2590 = new Class419[this.field_1143[0].length()][this.field_1143.length];

         for (int var3 = 0; var3 < this.field_2590.length; var3++) {
            for (int var2 = 0; var2 < this.field_2590[var3].length; var2++) {
               this.field_2590[var3][var2] = new Class419(this, var3, var2);
            }
         }
      }

      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      Class187 var15 = new Class187(this.field_3013.field_2517, this.field_3013.field_2477);
      int var14 = 120 * var15.field_2900;
      GLU.gluPerspective(70.0F, (float)this.field_3013.field_2517 / var14, 0.05F, 100.0F);
      GL11.glViewport(0, this.field_3013.field_2477 - var14, this.field_3013.field_2517, var14);
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
         GL11.glTranslatef(-this.field_1143[0].length() * 0.5F, -this.field_1143.length * 0.5F, 0.0F);
         GL11.glBindTexture(3553, this.field_3013.field_2176.method_1545(Class614.method_1576(Class614.field_1949)));
         if (var4 == 0) {
            GL11.glBindTexture(3553, this.field_3013.field_2176.method_1545("/title/black.png"));
         }

         Class714 var5 = new Class714();

         for (int var6 = 0; var6 < this.field_1143.length; var6++) {
            for (int var7 = 0; var7 < this.field_1143[var6].length(); var7++) {
               char var8 = this.field_1143[var6].charAt(var7);
               if (var8 != ' ') {
                  GL11.glPushMatrix();
                  Class419 var9 = this.field_2590[var7][var6];
                  float var10 = (float)(var9.field_942 + (var9.field_147 - var9.field_942) * var1);
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
                  var5.method_819(Class108.field_720, var12, true);
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
      GL11.glViewport(0, 0, this.field_3013.field_2517, this.field_3013.field_2477);
      GL11.glEnable(2884);
   }

   static Random method_20() {
      return field_1054;
   }
}
