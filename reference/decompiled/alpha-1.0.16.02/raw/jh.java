import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class jh implements gr {
   private int[] a;
   private int b;
   private int c;

   @Override
   public BufferedImage a(BufferedImage var1) {
      if (var1 == null) {
         return null;
      }

      this.b = 64;
      this.c = 32;
      BufferedImage var2 = new BufferedImage(this.b, this.c, 2);
      Graphics var3 = var2.getGraphics();
      var3.drawImage(var1, 0, 0, null);
      var3.dispose();
      this.a = ((DataBufferInt)var2.getRaster().getDataBuffer()).getData();
      this.b(0, 0, 32, 16);
      this.a(32, 0, 64, 32);
      this.b(0, 16, 64, 32);
      boolean var4 = false;

      for (int var5 = 32; var5 < 64; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            int var7 = this.a[var5 + var6 * 64];
            if ((var7 >> 24 & 0xFF) < 128) {
               var4 = true;
            }
         }
      }

      if (!var4) {
         for (int var9 = 32; var9 < 64; var9++) {
            for (int var10 = 0; var10 < 16; var10++) {
               int var11 = this.a[var9 + var10 * 64];
               if ((var11 >> 24 & 0xFF) < 128) {
                  var4 = true;
               }
            }
         }
      }

      return var2;
   }

   private void a(int var1, int var2, int var3, int var4) {
      if (!this.c(var1, var2, var3, var4)) {
         for (int var5 = var1; var5 < var3; var5++) {
            for (int var6 = var2; var6 < var4; var6++) {
               this.a[var5 + var6 * this.b] = this.a[var5 + var6 * this.b] & 16777215;
            }
         }
      }
   }

   private void b(int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            this.a[var5 + var6 * this.b] = this.a[var5 + var6 * this.b] | 0xFF000000;
         }
      }
   }

   private boolean c(int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            int var7 = this.a[var5 + var6 * this.b];
            if ((var7 >> 24 & 0xFF) < 128) {
               return true;
            }
         }
      }

      return false;
   }
}
