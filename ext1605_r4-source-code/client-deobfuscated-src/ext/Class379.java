package ext;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;

public class Class379 implements Interface148 {
   private int[] field_648;
   private int field_1558;
   private int field_2203;

   @Override
   public BufferedImage method_1152(BufferedImage var1) {
      if (var1 == null) {
         return null;
      }

      this.field_1558 = 64;
      this.field_2203 = 32;
      BufferedImage var2 = new BufferedImage(this.field_1558, this.field_2203, 2);
      Graphics var3 = var2.getGraphics();
      var3.drawImage(var1, 0, 0, (ImageObserver)null);
      var3.dispose();
      this.field_648 = ((DataBufferInt)var2.getRaster().getDataBuffer()).getData();
      this.method_1287(0, 0, 32, 16);
      this.method_1486(32, 0, 64, 32);
      this.method_1287(0, 16, 64, 32);
      boolean var4 = false;

      for (int var5 = 32; var5 < 64; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            int var7 = this.field_648[var5 + var6 * 64];
            if ((var7 >> 24 & 0xFF) < 128) {
               var4 = true;
            }
         }
      }

      if (!var4) {
         for (int var9 = 32; var9 < 64; var9++) {
            for (int var10 = 0; var10 < 16; var10++) {
               int var11 = this.field_648[var9 + var10 * 64];
               if ((var11 >> 24 & 0xFF) < 128) {
                  var4 = true;
               }
            }
         }
      }

      return var2;
   }

   private void method_1486(int var1, int var2, int var3, int var4) {
      if (!this.method_1141(var1, var2, var3, var4)) {
         for (int var5 = var1; var5 < var3; var5++) {
            for (int var6 = var2; var6 < var4; var6++) {
               this.field_648[var5 + var6 * this.field_1558] = this.field_648[var5 + var6 * this.field_1558] & 16777215;
            }
         }
      }
   }

   private void method_1287(int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            this.field_648[var5 + var6 * this.field_1558] = this.field_648[var5 + var6 * this.field_1558] | 0xFF000000;
         }
      }
   }

   private boolean method_1141(int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            int var7 = this.field_648[var5 + var6 * this.field_1558];
            if ((var7 >> 24 & 0xFF) < 128) {
               return true;
            }
         }
      }

      return false;
   }
}
