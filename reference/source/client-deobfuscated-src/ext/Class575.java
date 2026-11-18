package ext;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class575 extends Class280 {
   private int field_3001 = -1;
   private BufferedImage field_2226;
   public Class218 field_2699 = new Class218();

   public Class575() {
      this.field_220 = "Extension Standard";
      this.field_2200 = "The standard design of Extension 16.05";

      try {
         this.field_2226 = ImageIO.read(Class100.method_1145("/pack.png"));
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   @Override
   public void method_1312(Minecraft var1) {
      if (this.field_2226 != null) {
         var1.field_2176.method_418(this.field_3001);
      }
   }

   @Override
   public void method_1463(Minecraft var1) {
      if (this.field_2226 != null && this.field_3001 < 0) {
         this.field_3001 = var1.field_2176.method_285(this.field_2226);
      }

      if (this.field_2226 != null) {
         var1.field_2176.method_462(this.field_3001);
      } else {
         GL11.glBindTexture(3553, var1.field_2176.method_1545("/gui/unknown_pack.png"));
      }
   }
}
