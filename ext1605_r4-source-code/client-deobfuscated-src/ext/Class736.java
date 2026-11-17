package ext;

import java.awt.image.BufferedImage;

public class Class736 {
   public BufferedImage field_2491;
   public boolean field_2482 = false;
   public int field_1424 = 1;
   public int field_846 = -1;
   public boolean field_2646 = false;

   public void method_1102() {
      if (this.field_2491.getHeight() != this.field_2491.getWidth() / 2) {
         this.field_2491 = this.field_2491.getSubimage(0, 0, this.field_2491.getWidth(), this.field_2491.getWidth() / 2);
      }

      int var1 = (int)(54.0F * (this.field_2491.getWidth() / 64.0F));
      int var2 = (int)(20.0F * (this.field_2491.getHeight() / 32.0F));
      this.field_2482 = (this.field_2491.getRGB(var1, var2) & 0xFF000000) == 0;
   }
}
