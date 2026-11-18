package ext;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import javax.imageio.ImageIO;

class Canvas281 extends Canvas {
   private BufferedImage field_213;

   public Canvas281() {
      try {
         this.field_213 = ImageIO.read(Class100.method_1854("/gui/logo.png"));
      } catch (IOException var2) {
      }

      byte var1 = 100;
      this.setPreferredSize(new Dimension(var1, var1));
      this.setMinimumSize(new Dimension(var1, var1));
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      var1.drawImage(this.field_213, this.getWidth() / 2 - this.field_213.getWidth() / 2, 32, (ImageObserver)null);
   }
}
