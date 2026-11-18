package ext;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class724 extends Class280 {
   private ZipFile field_1693;
   private int field_875 = -1;
   private BufferedImage field_893;
   private File field_2402;

   public Class724(File var1) {
      this.field_220 = var1.getName();
      this.field_2402 = var1;
   }

   private String method_436(String var1) {
      if (var1 != null && var1.length() > 34) {
         var1 = var1.substring(0, 34);
      }

      return var1;
   }

   @Override
   public void method_84(Minecraft var1) throws IOException {
      ZipFile var2 = null;
      InputStream var3 = null;

      try {
         var2 = new ZipFile(this.field_2402);

         try {
            var3 = var2.getInputStream(var2.getEntry("pack.txt"));
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));
            this.field_2200 = this.method_436(var4.readLine());
            this.field_1097 = this.method_436(var4.readLine());
            var4.close();
            var3.close();
         } catch (Exception var23) {
         }

         try {
            this.field_1774 = new Class218();
            var3 = var2.getInputStream(var2.getEntry("packconfig.cfg"));
            this.field_1774 = Class218.method_933(var3);
            var3.close();
         } catch (Exception var22) {
         }

         try {
            var3 = var2.getInputStream(var2.getEntry("pack.png"));
            this.field_893 = ImageIO.read(var3);
            var3.close();
         } catch (Exception var21) {
         }

         try {
            var3 = var2.getInputStream(var2.getEntry("terrain.png"));
            BufferedImage var27 = ImageIO.read(var3);
            if (var27.getWidth() != 256 || var27.getHeight() != 512) {
               this.field_1774.field_2923 = false;
            }

            var3.close();
         } catch (Exception var24) {
         }

         var2.close();
      } catch (Exception var25) {
         var25.printStackTrace();
      } finally {
         try {
            var3.close();
         } catch (Exception var20) {
         }

         try {
            var2.close();
         } catch (Exception var19) {
         }
      }
   }

   @Override
   public void method_1312(Minecraft var1) {
      if (this.field_893 != null) {
         var1.field_2176.method_418(this.field_875);
      }

      this.method_467();
   }

   @Override
   public void method_1463(Minecraft var1) {
      if (this.field_893 != null && this.field_875 < 0) {
         this.field_875 = var1.field_2176.method_285(this.field_893);
      }

      if (this.field_893 != null) {
         var1.field_2176.method_462(this.field_875);
      } else {
         GL11.glBindTexture(3553, var1.field_2176.method_1545("/gui/unknown_pack.png"));
      }
   }

   @Override
   public void method_267() {
      try {
         this.field_1693 = new ZipFile(this.field_2402);
      } catch (Exception var2) {
      }
   }

   @Override
   public void method_467() {
      try {
         this.field_1693.close();
      } catch (Exception var2) {
      }

      this.field_1693 = null;
   }

   @Override
   public InputStream method_631(String var1) {
      try {
         ZipEntry var2 = this.field_1693.getEntry(var1.substring(1));
         if (var2 != null) {
            return this.field_1693.getInputStream(var2);
         }
      } catch (Exception var3) {
      }

      return Class100.method_1145(var1);
   }
}
