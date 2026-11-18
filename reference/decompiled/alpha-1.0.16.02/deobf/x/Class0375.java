package x;

import org.lwjgl.opengl.GL11;

public class Class0375 extends Class0090 {
   public Class0375() {
      super(new Class0259(), 1.0F);
      this.a(new Class0259());
   }

   protected float a(Class0021 var1) {
      return 180.0F;
   }

   protected boolean a(Class0021 var1, int var2) {
      if (var2 != 0) {
         return false;
      }

      if (var2 != 0) {
         return false;
      }

      this.a("/mob/spider_eyes.png");
      float var3 = (1.0F - var1.a(1.0F)) * 0.5F;
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var3);
      return true;
   }
}
