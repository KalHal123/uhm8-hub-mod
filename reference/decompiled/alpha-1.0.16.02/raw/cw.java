import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

class cw extends Canvas {
   private BufferedImage a;

   public cw() {
      try {
         this.a = ImageIO.read(an.class.getResource("/gui/logo.png"));
      } catch (IOException var2) {
      }

      byte var1 = 100;
      this.setPreferredSize(new Dimension(var1, var1));
      this.setMinimumSize(new Dimension(var1, var1));
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      var1.drawImage(this.a, this.getWidth() / 2 - this.a.getWidth() / 2, 32, null);
   }
}
