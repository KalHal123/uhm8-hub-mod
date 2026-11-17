package ext;

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

public class Class398 {
   private Minecraft field_2342;
   private float field_1607 = 0.0F;
   public Class703 field_1256;
   private int field_1586;
   private Class359 field_1493 = null;
   private long field_2335 = System.currentTimeMillis();
   private Random field_1740 = new Random();
   volatile int field_1438 = 0;
   volatile int field_917 = 0;
   FloatBuffer field_2678 = Class504.method_8(16);
   float field_1575;
   float field_645;
   float field_1998;
   private float field_1870;
   private float field_2071;

   public Class398(Minecraft var1) {
      this.field_2342 = var1;
      this.field_1256 = new Class703(var1);
   }

   public void method_1182() {
      this.field_1870 = this.field_2071;
      float var1 = this.field_2342
         .field_2648
         .method_1154(
            Class469.method_468(this.field_2342.field_2787.field_1417),
            Class469.method_468(this.field_2342.field_2787.field_2654),
            Class469.method_468(this.field_2342.field_2787.field_2013)
         );
      float var2 = (3 - Math.min(this.field_2342.field_1754.field_2733 - 1, 3)) / 3.0F;
      if (this.field_2342.field_1754.field_2733 == 0) {
         var2 = 1.0F;
      }

      float var3 = var1 * (1.0F - var2) + var2;
      this.field_2071 = this.field_2071 + (var3 - this.field_2071) * 0.1F;
      this.field_1586++;
      this.field_1256.method_58();
      if (this.field_2342.field_1310) {
         this.method_260();
      }
   }

   public void method_104(float var1) {
      if (this.field_2342.field_2787 != null) {
         double var2 = this.field_2342.field_3103.method_229();
         this.field_2342.field_864 = this.field_2342.field_2787.method_1195(var2, var1);
         double var4 = var2;
         Class214 var6 = this.field_2342.field_2787.method_371(var1);
         if (this.field_2342.field_864 != null) {
            var4 = this.field_2342.field_864.field_393.method_562(var6);
         }

         if (this.field_2342.field_3103 instanceof Class494) {
            var2 = 32.0;
            var4 = 32.0;
         } else {
            if (var4 > 3.0) {
               var4 = 3.0;
            }

            var2 = var4;
         }

         Class214 var7 = this.field_2342.field_2787.method_1570(var1);
         Class214 var8 = var6.method_1750(var7.field_882 * var2, var7.field_1911 * var2, var7.field_3045 * var2);
         this.field_1493 = null;
         List var9 = this.field_2342
            .field_2648
            .method_1349(
               this.field_2342.field_2787,
               this.field_2342.field_2787.field_235.method_1669(var7.field_882 * var2, var7.field_1911 * var2, var7.field_3045 * var2)
            );
         double var10 = 0.0;

         for (int var12 = 0; var12 < var9.size(); var12++) {
            Class359 var13 = (Class359)var9.get(var12);
            if (var13.method_243()) {
               float var14 = 0.1F;
               Class630 var15 = var13.field_235.method_1384(var14, var14, var14);
               Class366 var16 = var15.method_64(var6, var8);
               if (var16 != null) {
                  double var17 = var6.method_562(var16.field_393);
                  if (var17 < var10 || var10 == 0.0) {
                     this.field_1493 = var13;
                     var10 = var17;
                  }
               }
            }
         }

         if (this.field_1493 != null && !(this.field_2342.field_3103 instanceof Class494)) {
            this.field_2342.field_864 = new Class366(this.field_1493);
         }
      }
   }

   private float method_1061(float var1) {
      Class563 var2 = this.field_2342.field_2787;
      float var3 = 70.0F;
      if (var2.method_482(Class160.field_1413)) {
         var3 = 60.0F;
      }

      if (var2.field_2572 <= 0) {
         float var4 = var2.field_567 + var1;
         var3 /= (1.0F - 500.0F / (var4 + 500.0F)) * 2.0F + 1.0F;
      }

      return Math.max(var3 + (this.field_2342.field_1754.field_133 - 0.5F) * 80.0F + (Class119.method_696(54) ? -45 : 0), 5.0F);
   }

   private void method_858(float var1) {
      Class563 var2 = this.field_2342.field_2787;
      float var3 = var2.field_2148 - var1;
      if (var2.field_2572 <= 0) {
         float var4 = var2.field_567 + var1;
         GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }

      if (var3 >= 0.0F) {
         var3 /= var2.field_1322;
         var3 = Class469.method_1667(var3 * var3 * var3 * var3 * (float) Math.PI);
         float var7 = var2.field_523;
         GL11.glRotatef(-var7, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
      }
   }

   private void method_1233(float var1) {
      if (!this.field_2342.field_1754.field_1955) {
         Class563 var2 = this.field_2342.field_2787;
         float var3 = var2.field_574 - var2.field_621;
         float var4 = var2.field_574 + var3 * var1;
         float var5 = var2.field_771 + (var2.field_2216 - var2.field_771) * var1;
         float var6 = var2.field_1758 + (var2.field_32 - var2.field_1758) * var1;
         GL11.glTranslatef(Class469.method_1667(var4 * (float) Math.PI) * var5 * 0.5F, -Math.abs(Class469.method_255(var4 * (float) Math.PI) * var5), 0.0F);
         GL11.glRotatef(Class469.method_1667(var4 * (float) Math.PI) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(Math.abs(Class469.method_255(var4 * (float) Math.PI + 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }
   }

   private void method_840(float var1) {
      Class563 var2 = this.field_2342.field_2787;
      double var3 = var2.field_2553 + (var2.field_1417 - var2.field_2553) * var1;
      double var5 = var2.field_2068 + (var2.field_2654 - var2.field_2068) * var1;
      double var7 = var2.field_1780 + (var2.field_2013 - var2.field_1780) * var1;
      float var9 = var2.field_1661;
      float var10 = var2.field_2772;
      float var11 = var2.field_2866;
      if (this.field_2342.field_1754.field_1955) {
         double var12 = 6.0;
         double var14 = -Class469.method_1667(var9 / 180.0F * (float) Math.PI) * Class469.method_255(var11 / 180.0F * (float) Math.PI) * var12;
         double var16 = Class469.method_255(var9 / 180.0F * (float) Math.PI) * Class469.method_255(var11 / 180.0F * (float) Math.PI) * var12;
         double var18 = -Class469.method_1667(var11 / 180.0F * (float) Math.PI) * var12;

         for (int var20 = 0; var20 < 8; var20++) {
            float var21 = (var20 & 1) * 2 - 1;
            float var22 = (var20 >> 1 & 1) * 2 - 1;
            float var23 = (var20 >> 2 & 1) * 2 - 1;
            var21 *= 0.1F;
            var22 *= 0.1F;
            var23 *= 0.1F;
            Class366 var24 = this.field_2342
               .field_2648
               .method_818(
                  Class214.method_701(var3 + var21, var5 + var22, var7 + var23),
                  Class214.method_701(var3 - var14 + var21 + var23, var5 - var18 + var22, var7 - var16 + var23)
               );
            if (var24 != null) {
               double var25 = var24.field_393.method_562(Class214.method_701(var3, var5, var7));
               if (var25 < var12) {
                  var12 = var25;
               }
            }
         }

         GL11.glRotatef(var2.field_2866 - var11, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var9 - var9, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, 0.0F, (float)(-var12));
         GL11.glRotatef(var9 - var9, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var11 - var2.field_2866, 1.0F, 0.0F, 0.0F);
      } else {
         GL11.glTranslatef(0.0F, 0.0F, -0.1F);
      }

      GL11.glRotatef(var2.field_2984 + (var2.field_2866 - var2.field_2984) * var1, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var10 + (var9 - var10) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
   }

   private void method_1679(float var1, int var2) {
      if (this.field_2342.field_1754.field_2733 == 0) {
         this.field_1607 = 1024.0F;
      } else {
         this.field_1607 = 256 >> Math.min(this.field_2342.field_1754.field_2733 - 1, 3);
      }

      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float var3 = 0.07F;
      if (this.field_2342.field_1754.field_359) {
         GL11.glTranslatef(-(var2 * 2 - 1) * var3, 0.0F, 0.0F);
      }

      GLU.gluPerspective(this.method_1061(var1), (float)this.field_2342.field_2517 / this.field_2342.field_2477, 0.05F, this.field_1607);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if (this.field_2342.field_1754.field_359) {
         GL11.glTranslatef((var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.method_858(var1);
      if (this.field_2342.field_1754.field_379) {
         this.method_1233(var1);
      }

      this.method_840(var1);
   }

   private void method_1918(float var1, int var2) {
      if (!Class310.field_2389) {
         GL11.glLoadIdentity();
         if (this.field_2342.field_1754.field_359) {
            GL11.glTranslatef((var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
         }

         GL11.glPushMatrix();
         this.method_858(var1);
         if (this.field_2342.field_1754.field_379) {
            this.method_1233(var1);
         }

         if (!this.field_2342.field_1754.field_1955) {
            this.field_1256.method_1922(var1);
         }

         GL11.glPopMatrix();
         if (!this.field_2342.field_1754.field_1955) {
            this.field_1256.method_536(var1);
            this.method_858(var1);
         }

         if (this.field_2342.field_1754.field_379) {
            this.method_1233(var1);
         }
      }
   }

   public void method_103(float var1) {
      if (!Display.isActive()) {
         if (System.currentTimeMillis() - this.field_2335 > 500L && this.field_2342.field_1754.field_6) {
            this.field_2342.method_1660();
         }
      } else {
         this.field_2335 = System.currentTimeMillis();
      }

      if (this.field_2342.field_1449) {
         this.field_2342.field_2679.method_1122();
         float var2 = this.field_2342.field_1754.field_1309 * 0.6F + 0.2F;
         float var3 = var2 * var2 * var2 * 8.0F;
         float var4 = this.field_2342.field_2679.field_2826 * var3;
         float var5 = this.field_2342.field_2679.field_2488 * var3;
         byte var6 = 1;
         if (this.field_2342.field_1754.field_55) {
            var6 = -1;
         }

         this.field_2342.field_2787.method_1775(var4, var5 * var6);
      }

      Class187 var7 = new Class187(this.field_2342.field_2517, this.field_2342.field_2477);
      int var8 = var7.method_884();
      int var9 = var7.method_351();
      if (!this.field_2342.field_2350) {
         int var10 = Mouse.getX() * var8 / this.field_2342.field_2517;
         int var11 = var9 - Mouse.getY() * var9 / this.field_2342.field_2477 - 1;
         if (this.field_2342.field_2648 != null) {
            this.method_608(var1);
            if (this.field_2342.field_1754.field_712) {
               this.field_2342.field_267.method_692(this.field_2342, this.field_1607, this.field_1575, this.field_645, this.field_1998);
            }

            this.field_2342.field_964.method_101(var1, this.field_2342.field_1883 != null, var10, var11);
         } else {
            GL11.glViewport(0, 0, this.field_2342.field_2517, this.field_2342.field_2477);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16640);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            this.method_808();
         }

         if (this.field_2342.field_1883 != null) {
            GL11.glClear(256);
            this.field_2342.field_1883.method_1938(var10, var11, var1);
         }

         if (!Thread62.field_221) {
            Class254.method_773(
               this.field_2342.field_1541,
               "Downloading resources... [" + Math.round((float)Thread62.field_216 / Thread62.field_2752 * 100.0F) + "%]",
               10,
               this.field_2342.field_1883 != null ? 10 : var9 - 60,
               13421772
            );
         }

         Class119.method_1864(var8, var9);
      }
   }

   public void method_608(float var1) {
      this.method_104(var1);
      Class563 var2 = this.field_2342.field_2787;
      Class411 var3 = this.field_2342.field_1265;
      Class443 var4 = this.field_2342.field_2681;
      double var5 = var2.field_2173 + (var2.field_1417 - var2.field_2173) * var1;
      double var7 = var2.field_2270 + (var2.field_2654 - var2.field_2270) * var1;
      double var9 = var2.field_1907 + (var2.field_2013 - var2.field_1907) * var1;

      for (int var11 = 0; var11 < 2; var11++) {
         if (this.field_2342.field_1754.field_359) {
            if (var11 == 0) {
               GL11.glColorMask(false, true, true, false);
            } else {
               GL11.glColorMask(true, false, false, false);
            }
         }

         GL11.glViewport(0, 0, this.field_2342.field_2517, this.field_2342.field_2477);
         this.method_1773(var1);
         GL11.glClear(16640);
         GL11.glEnable(2884);
         this.method_1679(var1, var11);
         Class601.method_1236();
         if (this.field_2342.field_1754.field_2733 < 2) {
            this.method_23(-1);
            var3.method_1179(var1);
         }

         GL11.glEnable(2912);
         this.method_23(1);
         if (this.field_2342.field_1754.field_712) {
            this.field_2342.field_267.method_517(this.field_2342.field_267.field_2063);
         }

         Class720 var12 = new Class720();
         var12.method_564(var5, var7, var9);
         this.field_2342.field_1265.method_1003(var12, var1);
         this.field_2342.field_1265.method_446(var2, false);
         this.method_23(0);
         GL11.glEnable(2912);
         GL11.glBindTexture(3553, this.field_2342.field_2176.method_1545(Minecraft.field_1094));
         Class584.method_62();
         var3.method_1382(var2, 0, var1);
         Class584.method_331();
         var3.method_895(var2.method_371(var1), var12, var1);
         var4.method_710(var2, var1);
         Class584.method_62();
         this.method_23(0);
         var4.method_42(var2, var1);
         if (this.field_2342.field_864 != null && var2.method_482(Class160.field_1413)) {
            GL11.glDisable(3008);
            var3.method_429(var2, this.field_2342.field_864, 0, var2.field_559.method_93(), var1);
            var3.method_949(var2, this.field_2342.field_864, 0, var2.field_559.method_93(), var1);
            GL11.glEnable(3008);
         }

         GL11.glBlendFunc(770, 771);
         this.method_23(0);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         GL11.glBindTexture(3553, this.field_2342.field_2176.method_1545(Class614.method_1576(Class614.field_1949)));
         if (this.field_2342.field_1754.field_674 != 2) {
            GL11.glColorMask(false, false, false, false);
            int var13 = var3.method_1382(var2, 1, var1);
            GL11.glColorMask(true, true, true, true);
            if (this.field_2342.field_1754.field_359) {
               if (var11 == 0) {
                  GL11.glColorMask(false, true, true, false);
               } else {
                  GL11.glColorMask(true, false, false, false);
               }
            }

            if (var13 > 0) {
               var3.method_495(1, var1);
            }
         } else {
            var3.method_1382(var2, 1, var1);
         }

         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         if (this.field_2342.field_864 != null && !var2.method_482(Class160.field_1413)) {
            GL11.glDisable(3008);
            var3.method_429(var2, this.field_2342.field_864, 0, var2.field_559.method_93(), var1);
            var3.method_949(var2, this.field_2342.field_864, 0, var2.field_559.method_93(), var1);
            GL11.glEnable(3008);
         }

         GL11.glDisable(2912);
         if (this.field_2342.field_2648.field_743 && this.field_2342.field_1754.field_674 != 2) {
            this.method_315(var1);
         }

         if (this.field_2342.field_1310) {
            this.method_1137(var1);
         }

         if (this.field_1493 != null) {
         }

         this.method_23(0);
         GL11.glEnable(2912);
         if (this.field_2342.field_1754.field_674 != 2 && this.field_2342.field_741) {
            var3.method_516(var1);
         }

         if (this.field_2342.field_1754.field_712) {
            Class478.method_1907(this.field_2342.field_267.method_638(this.field_2342), this.field_2342);
         }

         GL11.glDisable(2912);
         this.method_23(1);
         GL11.glClear(256);
         this.method_1918(var1, var11);
         if (this.field_2342.field_1754.field_712) {
            Class478.method_1907(this.field_2342.field_267.method_1255(this.field_2342), this.field_2342);
            this.field_2342.field_267.method_517(0);
         }

         if (!this.field_2342.field_1754.field_359) {
            return;
         }
      }

      GL11.glColorMask(true, true, true, false);
   }

   private void method_260() {
      if (this.field_2342.field_1754.field_674 != 2) {
         Class563 var1 = this.field_2342.field_2787;
         Class454 var2 = this.field_2342.field_2648;
         int var3 = Class469.method_468(var1.field_1417);
         int var4 = Class469.method_468(var1.field_2654);
         int var5 = Class469.method_468(var1.field_2013);
         byte var6 = 16;

         for (int var7 = 0; var7 < 150; var7++) {
            int var8 = var3 + this.field_1740.nextInt(var6) - this.field_1740.nextInt(var6);
            int var9 = var5 + this.field_1740.nextInt(var6) - this.field_1740.nextInt(var6);
            int var10 = var2.method_1879(var8, var9 + 2);
            int var11 = var2.method_197(var8, var10 - 1, var9);
            if (var10 <= var4 + var6 && var10 >= var4 - var6) {
               float var12 = this.field_1740.nextFloat();
               float var13 = this.field_1740.nextFloat();
               if (var11 > 0) {
                  this.field_2342.field_2681.method_206(new Class594(var2, var8 + var12, var10 + 0.3F - Class108.field_1221[var11].field_2905, var9 + var13));
               }
            }
         }
      }
   }

   private void method_315(float var1) {
      Class563 var2 = this.field_2342.field_2787;
      Class454 var3 = this.field_2342.field_2648;
      int var4 = Class469.method_468(var2.field_1417);
      int var5 = Class469.method_468(var2.field_2654);
      int var6 = Class469.method_468(var2.field_2013);
      Class368 var7 = Class368.field_2696;
      GL11.glDisable(2884);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glBindTexture(3553, this.field_2342.field_2176.method_1545("/snow.png"));
      double var8 = var2.field_2173 + (var2.field_1417 - var2.field_2173) * var1;
      double var10 = var2.field_2270 + (var2.field_2654 - var2.field_2270) * var1;
      double var12 = var2.field_1907 + (var2.field_2013 - var2.field_1907) * var1;
      byte var14 = 5;
      if (this.field_2342.field_1754.field_674 != 2) {
         var14 = 10;
      }

      for (int var15 = var4 - var14; var15 <= var4 + var14; var15++) {
         for (int var16 = var6 - var14; var16 <= var6 + var14; var16++) {
            int var17 = var3.method_451(var15, var16);
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
               this.field_1740.setSeed(var15 * var15 * 3121 + var15 * 45238971 + var16 * var16 * 418711 + var16 * 13761);
               float var21 = this.field_1586 + var1;
               float var22 = ((this.field_1586 & 511) + var1) / 512.0F;
               float var23 = this.field_1740.nextFloat() + var21 * 0.01F * (float)this.field_1740.nextGaussian();
               float var24 = this.field_1740.nextFloat() + var21 * (float)this.field_1740.nextGaussian() * 0.001F;
               double var25 = var15 + 0.5F - var2.field_1417;
               double var27 = var16 + 0.5F - var2.field_2013;
               float var29 = Class469.method_822(var25 * var25 + var27 * var27) / var14;
               var7.method_186();
               float var30 = var3.method_1154(var15, 128, var16);
               GL11.glColor4f(var30, var30, var30, (1.0F - var29 * var29) * 0.7F);
               var7.method_387(-var8 * 1.0, -var10 * 1.0, -var12 * 1.0);
               var7.method_318(var15 + 0, var18, var16 + 0, 0.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 + var24);
               var7.method_318(var15 + 1, var18, var16 + 1, 1.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 + var24);
               var7.method_318(var15 + 1, var19, var16 + 1, 1.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 + var24);
               var7.method_318(var15 + 0, var19, var16 + 0, 0.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 + var24);
               var7.method_318(var15 + 0, var18, var16 + 1, 0.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 + var24);
               var7.method_318(var15 + 1, var18, var16 + 0, 1.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 + var24);
               var7.method_318(var15 + 1, var19, var16 + 0, 1.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 + var24);
               var7.method_318(var15 + 0, var19, var16 + 1, 0.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 + var24);
               var7.method_387(0.0, 0.0, 0.0);
               var7.method_406();
            }
         }
      }

      GL11.glEnable(2884);
      GL11.glDisable(3042);
   }

   private void method_1137(float var1) {
      Class563 var2 = this.field_2342.field_2787;
      Class454 var3 = this.field_2342.field_2648;
      int var4 = Class469.method_468(var2.field_1417);
      int var5 = Class469.method_468(var2.field_2654);
      int var6 = Class469.method_468(var2.field_2013);
      Class368 var7 = Class368.field_2696;
      GL11.glDisable(2884);
      GL11.glNormal3f(0.0F, 2.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glBindTexture(3553, this.field_2342.field_2176.method_1545("/rain.png"));
      double var8 = var2.field_2173 + (var2.field_1417 - var2.field_2173) * var1;
      double var10 = var2.field_2270 + (var2.field_2654 - var2.field_2270) * var1;
      double var12 = var2.field_1907 + (var2.field_2013 - var2.field_1907) * var1;
      byte var14 = 5;
      if (this.field_2342.field_1754.field_674 != 2) {
         var14 = 10;
      }

      for (int var15 = var4 - var14; var15 <= var4 + var14; var15++) {
         for (int var16 = var6 - var14; var16 <= var6 + var14; var16++) {
            int var17 = var3.method_451(var15, var16);
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
               this.field_1740.setSeed(var15 * var15 * 1312 + var15 * 57284571 + var16 * var16 * 102984 + var16 * 68392);
               float var21 = this.field_1586 + var1;
               float var22 = ((this.field_1586 & 511) + var1) / 256.0F;
               float var23 = this.field_1740.nextFloat() + var21 * 0.01F * (float)this.field_1740.nextGaussian();
               float var24 = this.field_1740.nextFloat() + var21 * (float)this.field_1740.nextGaussian() * 0.001F;
               double var25 = var15 + 0.5F - var2.field_1417;
               double var27 = var16 + 0.5F - var2.field_2013;
               float var29 = Class469.method_822(var25 * var25 + var27 * var27) / var14;
               var7.method_186();
               float var30 = var3.method_1154(var15, 128, var16);
               GL11.glColor4f(var30, var30, var30, 1.0F - var29 * var29 + 0.7F);
               var7.method_387(-var8 * 1.0, -var10 - 2.0, -var12 * 1.0);
               var7.method_318(var15 + 0, var18, var16 + 0, 0.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 / var24);
               var7.method_318(var15 + 1, var18, var16 + 1, 1.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 / var24);
               var7.method_318(var15 + 1, var19, var16 + 1, 1.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 / var24);
               var7.method_318(var15 + 0, var19, var16 + 0, 0.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 / var24);
               var7.method_318(var15 + 0, var18, var16 + 1, 0.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 / var24);
               var7.method_318(var15 + 1, var18, var16 + 0, 1.0F * var20 + var23, var18 * var20 / 8.0F + var22 * var20 / var24);
               var7.method_318(var15 + 1, var19, var16 + 0, 1.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 / var24);
               var7.method_318(var15 + 0, var19, var16 + 1, 0.0F * var20 + var23, var19 * var20 / 8.0F + var22 * var20 / var24);
               var7.method_387(0.0, 0.0, 0.0);
               var7.method_406();
            }
         }
      }

      GL11.glEnable(2884);
      GL11.glDisable(3042);
   }

   public void method_808() {
      Class187 var1 = new Class187(this.field_2342.field_2517, this.field_2342.field_2477);
      int var2 = var1.method_884();
      int var3 = var1.method_351();
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, var2, var3, 0.0, 1000.0, 3000.0);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   private void method_1773(float var1) {
      Class454 var2 = this.field_2342.field_2648;
      Class563 var3 = this.field_2342.field_2787;
      float var4 = 1.0F / (4 - Math.min(this.field_2342.field_1754.field_2733 - 1, 3));
      if (this.field_2342.field_1754.field_2733 == 5) {
         var4 = Float.NEGATIVE_INFINITY;
      } else {
         var4 = 1.0F - (float)Math.pow(var4, 0.25);
      }

      Class214 var5 = var2.method_1631(var1);
      float var6 = (float)var5.field_882;
      float var7 = (float)var5.field_1911;
      float var8 = (float)var5.field_3045;
      Class214 var9 = var2.method_238(var1);
      this.field_1575 = (float)var9.field_882;
      this.field_645 = (float)var9.field_1911;
      this.field_1998 = (float)var9.field_3045;
      this.field_1575 = this.field_1575 + (var6 - this.field_1575) * var4;
      this.field_645 = this.field_645 + (var7 - this.field_645) * var4;
      this.field_1998 = this.field_1998 + (var8 - this.field_1998) * var4;
      if (var3.method_482(Class160.field_1413)) {
         this.field_1575 = 0.02F;
         this.field_645 = 0.02F;
         this.field_1998 = 0.2F;
      } else if (var3.method_482(Class160.field_3120)) {
         this.field_1575 = 0.6F;
         this.field_645 = 0.1F;
         this.field_1998 = 0.0F;
      }

      float var10 = this.field_1870 + (this.field_2071 - this.field_1870) * var1;
      this.field_1575 *= var10;
      this.field_645 *= var10;
      this.field_1998 *= var10;
      if (this.field_2342.field_1754.field_359) {
         float var11 = (this.field_1575 * 30.0F + this.field_645 * 59.0F + this.field_1998 * 11.0F) / 100.0F;
         float var12 = (this.field_1575 * 30.0F + this.field_645 * 70.0F) / 100.0F;
         float var13 = (this.field_1575 * 30.0F + this.field_1998 * 70.0F) / 100.0F;
         this.field_1575 = var11;
         this.field_645 = var12;
         this.field_1998 = var13;
      }

      long var16 = var2.field_2075 % 23000L;
      float var17 = 0.0F;
      if (var16 >= 22000L) {
         var17 = (float)(1000L - (var16 - 22000L)) / 1000.0F;
      } else if (var16 >= 21000L) {
         var17 = (float)(var16 - 21000L) / 1000.0F;
      }

      float[] var14 = Class100.method_1084(var17 / 2.0F, this.field_1575, this.field_645, this.field_1998);
      this.field_1575 = var14[0];
      this.field_645 = var14[1];
      this.field_1998 = var14[2];
      GL11.glClearColor(this.field_1575, this.field_645, this.field_1998, 0.0F);
   }

   private void method_23(int var1) {
      Class563 var2 = this.field_2342.field_2787;
      GL11.glFog(2918, this.method_9(this.field_1575, this.field_645, this.field_1998, 1.0F));
      GL11.glNormal3f(0.0F, -1.0F, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (var2.method_482(Class160.field_1413)) {
         GL11.glFogi(2917, 2048);
         GL11.glFogf(2914, 0.1F);
      } else if (var2.method_482(Class160.field_3120)) {
         GL11.glFogi(2917, 2048);
         GL11.glFogf(2914, 2.0F);
      } else {
         GL11.glFogi(2917, 9729);
         GL11.glFogf(2915, this.field_1607 * 0.25F);
         GL11.glFogf(2916, this.field_1607);
         if (var1 < 0) {
            GL11.glFogf(2915, 0.0F);
            GL11.glFogf(2916, this.field_1607 * 0.8F);
         }

         if (GLContext.getCapabilities().GL_NV_fog_distance) {
            GL11.glFogi(34138, 34139);
         }
      }

      GL11.glEnable(2903);
      GL11.glColorMaterial(1028, 4608);
   }

   private FloatBuffer method_9(float var1, float var2, float var3, float var4) {
      ((Buffer)this.field_2678).clear();
      this.field_2678.put(var1).put(var2).put(var3).put(var4);
      ((Buffer)this.field_2678).flip();
      return this.field_2678;
   }
}
