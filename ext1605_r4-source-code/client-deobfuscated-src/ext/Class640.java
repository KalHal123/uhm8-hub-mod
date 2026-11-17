package ext;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class Class640 {
   private int[] field_2823 = new int[256];
   public int field_812 = 0;
   private int field_3106;
   private IntBuffer field_2494 = Class504.method_323(1024);

   public Class640(Class693 var1, String var2, Class432 var3) {
      BufferedImage var4;
      try {
         var4 = ImageIO.read(var3.field_2793.field_602.method_631(var2));
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }

      int var5 = var4.getWidth();
      int var6 = var4.getHeight();
      int[] var7 = new int[var5 * var6];
      var4.getRGB(0, 0, var5, var6, var7, 0, var5);

      for (int var14 = 0; var14 < 256; var14++) {
         int var8 = var14 % 16;
         int var9 = var14 / 16;

         int var10;
         for (var10 = 7; var10 >= 0; var10--) {
            int var11 = var8 * 8 + var10;
            boolean var15 = true;

            for (int var16 = 0; var16 < 8 && var15; var16++) {
               int var12 = (var9 * 8 + var16) * var5;
               int var13 = var7[var11 + var12] & 0xFF;
               if (var13 > 0) {
                  var15 = false;
               }
            }

            if (!var15) {
               break;
            }
         }

         if (var14 == 32) {
            var10 = 2;
         }

         this.field_2823[var14] = var10 + 2;
      }

      this.field_812 = var3.method_285(var4);
      this.field_3106 = Class504.method_225(288);
      Class368 var28 = Class368.field_2696;

      for (int var19 = 0; var19 < 256; var19++) {
         GL11.glNewList(this.field_3106 + var19, 4864);
         var28.method_1284(true);
         int var21 = var19 % 16 * 8;
         int var23 = var19 / 16 * 8;
         float var29 = 7.99F;
         float var31 = 0.0F;
         float var17 = 0.0F;
         var28.method_318(0.0, 0.0F + var29, 0.0, var21 / 128.0F + var31, (var23 + var29) / 128.0F + var17);
         var28.method_318(0.0F + var29, 0.0F + var29, 0.0, (var21 + var29) / 128.0F + var31, (var23 + var29) / 128.0F + var17);
         var28.method_318(0.0F + var29, 0.0, 0.0, (var21 + var29) / 128.0F + var31, var23 / 128.0F + var17);
         var28.method_318(0.0, 0.0, 0.0, var21 / 128.0F + var31, var23 / 128.0F + var17);
         var28.method_406();
         GL11.glTranslatef(this.field_2823[var19], 0.0F, 0.0F);
         GL11.glEndList();
      }

      for (int var20 = 0; var20 < 32; var20++) {
         int var22 = (var20 >> 3 & 1) * 85;
         int var24 = (var20 >> 2 & 1) * 170 + var22;
         int var25 = (var20 >> 1 & 1) * 170 + var22;
         int var30 = (var20 >> 0 & 1) * 170 + var22;
         if (var20 == 6) {
            var24 += 85;
         }

         boolean var32 = var20 >= 16;
         if (var1.field_359) {
            int var26 = (var24 * 30 + var25 * 59 + var30 * 11) / 100;
            int var27 = (var24 * 30 + var25 * 70) / 100;
            int var33 = (var24 * 30 + var30 * 70) / 100;
            var24 = var26;
            var25 = var27;
            var30 = var33;
         }

         if (var32) {
            var24 /= 4;
            var25 /= 4;
            var30 /= 4;
         }

         GL11.glNewList(this.field_3106 + 256 + var20, 4864);
         GL11.glColor3f(var24 / 255.0F, var25 / 255.0F, var30 / 255.0F);
         GL11.glEndList();
      }
   }

   public void method_1444(String var1, int var2, int var3, int var4) {
      this.method_1472(var1, var2 + 1, var3 + 1, var4, true);
      this.method_1870(var1, var2, var3, var4);
   }

   public void method_1870(String var1, int var2, int var3, int var4) {
      this.method_1472(var1, var2, var3, var4, false);
   }

   public void method_1472(String var1, int var2, int var3, int var4, boolean var5) {
      if (var1 != null) {
         if (var5) {
            int var6 = var4 & 0xFF000000;
            var4 = (var4 & 16579836) >> 2;
            var4 += var6;
            int var14;
            int var15;
            var4 = var6 != 255 && var6 != 0 ? (var14 = var4 | var6 / 2 << 24) : (var15 = var4 | 0xFF000000);
         }

         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glBindTexture(3553, this.field_812);
         float var7 = (var4 >> 16 & 0xFF) / 255.0F;
         float var8 = (var4 >> 8 & 0xFF) / 255.0F;
         float var9 = (var4 & 0xFF) / 255.0F;
         float var10 = (var4 >> 24 & 0xFF) / 255.0F;
         if (var10 == 0.0F) {
            var10 = 1.0F;
         }

         GL11.glColor4f(var7, var8, var9, var10);
         ((Buffer)this.field_2494).clear();
         GL11.glPushMatrix();
         GL11.glTranslatef(var2, var3, 0.0F);

         for (int var16 = 0; var16 < var1.length(); var16++) {
            for (; var1.charAt(var16) == 167 && var1.length() > var16 + 1; var16 += 2) {
               int var11 = "0123456789abcdef".indexOf(var1.toLowerCase().charAt(var16 + 1));
               if (var11 < 0 || var11 > 15) {
                  var11 = 15;
               }

               this.field_2494.put(this.field_3106 + 256 + var11 + (var5 ? 16 : 0));
               if (this.field_2494.remaining() == 0) {
                  ((Buffer)this.field_2494).flip();
                  GL11.glCallLists(this.field_2494);
                  ((Buffer)this.field_2494).clear();
               }
            }

            int var17 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
               .indexOf(var1.charAt(var16));
            if (var17 >= 0) {
               this.field_2494.put(this.field_3106 + var17 + 32);
            }

            if (this.field_2494.remaining() == 0) {
               ((Buffer)this.field_2494).flip();
               GL11.glCallLists(this.field_2494);
               ((Buffer)this.field_2494).clear();
            }
         }

         ((Buffer)this.field_2494).flip();
         GL11.glCallLists(this.field_2494);
         GL11.glPopMatrix();
      }
   }

   public int method_962(String var1) {
      if (var1 == null) {
         return 0;
      }

      int var2 = 0;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         if (var1.charAt(var3) == 167) {
            var3++;
         } else {
            int var4 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
               .indexOf(var1.charAt(var3));
            if (var4 >= 0) {
               var2 += this.field_2823[var4 + 32];
            }
         }
      }

      return var2;
   }
}
