package x;

import org.lwjgl.opengl.GL11;

public class Class0364 extends Class0090 {
   private float f;

   public Class0364(Class0142 var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.f = var3;
   }

   protected void a(Class0192 var1, float var2) {
      GL11.glScalef(this.f, this.f, this.f);
   }
}
