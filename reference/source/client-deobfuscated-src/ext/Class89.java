package ext;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

public class Class89 extends Class203 {
   protected float[] field_1987 = new float[320];
   protected float[] field_195 = new float[320];
   private Minecraft field_2893;
   private int[] field_924 = new int[256];
   private double field_1182;
   private double field_1189;

   public Class89(Minecraft var1) {
      super(Class755.field_2124.method_1543((Class334)null));
      this.field_2893 = var1;
      this.field_118 = 1;

      try {
         BufferedImage var2 = ImageIO.read(Class100.method_1854("/gui/items.png"));
         int var3 = this.field_1808 % 16 * 16;
         int var4 = this.field_1808 / 16 * 16;
         var2.getRGB(var3, var4, 16, 16, this.field_924, 0, 16);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method_1610() {
      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = this.field_924[var1] >> 24 & 0xFF;
         int var3 = this.field_924[var1] >> 16 & 0xFF;
         int var4 = this.field_924[var1] >> 8 & 0xFF;
         int var5 = this.field_924[var1] >> 0 & 0xFF;
         if (this.field_85) {
            int var6 = (var3 * 30 + var4 * 59 + var5 * 11) / 100;
            int var7 = (var3 * 30 + var4 * 70) / 100;
            int var8 = (var3 * 30 + var5 * 70) / 100;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         this.field_2765[var1 * 4 + 0] = (byte)var3;
         this.field_2765[var1 * 4 + 1] = (byte)var4;
         this.field_2765[var1 * 4 + 2] = (byte)var5;
         this.field_2765[var1 * 4 + 3] = (byte)var2;
      }

      double var20 = 0.0;
      if (this.field_2893.field_2648 != null && this.field_2893.field_2787 != null) {
         double var21 = this.field_2893.field_2648.field_18 - this.field_2893.field_2787.field_1417;
         double var23 = this.field_2893.field_2648.field_1361 - this.field_2893.field_2787.field_2013;
         var20 = (this.field_2893.field_2787.field_1661 - 90.0F) * Math.PI / 180.0 - Math.atan2(var23, var21);
      }

      double var22 = var20 - this.field_1182;

      while (var22 < -Math.PI) {
         var22 += Math.PI * 2;
      }

      while (var22 >= Math.PI) {
         var22 -= Math.PI * 2;
      }

      if (var22 < -1.0) {
         var22 = -1.0;
      }

      if (var22 > 1.0) {
         var22 = 1.0;
      }

      this.field_1189 += var22 * 0.1;
      this.field_1189 *= 0.8;
      this.field_1182 = this.field_1182 + this.field_1189;
      double var24 = Math.sin(this.field_1182);
      double var25 = Math.cos(this.field_1182);

      for (int var9 = -4; var9 <= 4; var9++) {
         int var10 = (int)(8.5 + var25 * var9 * 0.3);
         int var11 = (int)(7.5 - var24 * var9 * 0.3 * 0.5);
         int var12 = var11 * 16 + var10;
         int var13 = 100;
         int var14 = 100;
         int var15 = 100;
         short var16 = 255;
         if (this.field_85) {
            int var17 = (var13 * 30 + var14 * 59 + var15 * 11) / 100;
            int var18 = (var13 * 30 + var14 * 70) / 100;
            int var19 = (var13 * 30 + var15 * 70) / 100;
            var13 = var17;
            var14 = var18;
            var15 = var19;
         }

         this.field_2765[var12 * 4 + 0] = (byte)var13;
         this.field_2765[var12 * 4 + 1] = (byte)var14;
         this.field_2765[var12 * 4 + 2] = (byte)var15;
         this.field_2765[var12 * 4 + 3] = (byte)var16;
      }

      for (int var26 = -8; var26 <= 16; var26++) {
         int var27 = (int)(8.5 + var24 * var26 * 0.3);
         int var28 = (int)(7.5 + var25 * var26 * 0.3 * 0.5);
         int var29 = var28 * 16 + var27;
         int var30 = var26 >= 0 ? 255 : 100;
         int var31 = var26 >= 0 ? 20 : 100;
         int var32 = var26 >= 0 ? 20 : 100;
         short var33 = 255;
         if (this.field_85) {
            int var34 = (var30 * 30 + var31 * 59 + var32 * 11) / 100;
            int var35 = (var30 * 30 + var31 * 70) / 100;
            int var36 = (var30 * 30 + var32 * 70) / 100;
            var30 = var34;
            var31 = var35;
            var32 = var36;
         }

         this.field_2765[var29 * 4 + 0] = (byte)var30;
         this.field_2765[var29 * 4 + 1] = (byte)var31;
         this.field_2765[var29 * 4 + 2] = (byte)var32;
         this.field_2765[var29 * 4 + 3] = (byte)var33;
      }
   }
}
