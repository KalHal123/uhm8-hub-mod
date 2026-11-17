package ext;

import org.lwjgl.opengl.GL11;

public class Class673 extends Class591 {
   public Class673() {
      super(new Class622(), 1.0F);
      this.method_1734(new Class622());
   }

   protected float method_1513(Class639 var1) {
      return 180.0F;
   }

   protected boolean method_1351(Class639 var1, int var2) {
      if (var2 != 0) {
         return false;
      }

      if (var2 != 0) {
         return false;
      }

      this.method_1261("/mob/spider_eyes.png");
      float var3 = (1.0F - var1.method_50(1.0F)) * 0.5F;
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var3);
      return true;
   }

   @Override
   protected float method_1069(Class377 var1) {
      return this.method_1513((Class639)var1);
   }

   @Override
   protected boolean method_882(Class377 var1, int var2) {
      return this.method_1351((Class639)var1, var2);
   }
}
