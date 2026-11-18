package ext;

import org.lwjgl.opengl.GL11;

public class Class626 extends Class591 {
   private float field_285;

   public Class626(Class110 var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.field_285 = var3;
   }

   @Override
   protected void method_1224(Class377 var1, float var2) {
      GL11.glScalef(this.field_285, this.field_285, this.field_285);
   }
}
