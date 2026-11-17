package ext;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class Thread49 extends Thread {
   String field_2355;
   final Interface148 field_1373;
   final Class233 field_2757;

   Thread49(Class233 var1, String var2, Interface148 var3) {
      this.field_2757 = var1;
      this.field_2355 = var2;
      this.field_1373 = var3;
   }

   @Override
   public void run() {
      while (this.field_2355.charAt(0) == 1 || this.field_2355.charAt(0) == 2) {
         this.field_2355 = this.field_2355.substring(1);
      }

      if (this.field_2355 == "@@") {
         this.field_2757.field_2491 = new BufferedImage(32, 16, 2);
         Graphics2D var13 = this.field_2757.field_2491.createGraphics();
         var13.setColor(new Color(0, 0, 0));
         var13.fillRect(0, 0, 32, 16);
         var13.dispose();
      } else {
         for (String var2 : Class100.field_1534) {
            String var3 = var2 + this.field_2355 + ".png";
            if (var2.startsWith("file://")) {
               try {
                  this.field_2757.field_2491 = ImageIO.read(new File(var3.substring(7)));
               } catch (IOException var10) {
                  System.out.println("Failed to load skin from " + var3);
               }
            } else {
               HttpURLConnection var4 = null;

               try {
                  URL var5 = new URL(var3);
                  var4 = (HttpURLConnection)var5.openConnection();
                  var4.setDoInput(true);
                  var4.setDoOutput(false);
                  var4.connect();
                  if (var4.getResponseCode() == 404) {
                     return;
                  }

                  if (this.field_1373 == null) {
                     this.field_2757.field_2491 = ImageIO.read(var4.getInputStream());
                  } else {
                     this.field_2757.field_2491 = this.field_1373.method_1152(ImageIO.read(var4.getInputStream()));
                  }
               } catch (Exception var11) {
                  var11.printStackTrace();
               } finally {
                  var4.disconnect();
               }
            }

            if (this.field_2757.field_2491 != null) {
               break;
            }
         }

         if (this.field_2757.field_2491 == null) {
            System.out.println("Failed to load skin.");
         } else {
            this.field_2757.method_1102();
         }
      }
   }
}
