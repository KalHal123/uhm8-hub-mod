package ext;

import org.lwjgl.opengl.GL11;

public class Class221 extends Class591 {
   private float field_2202;

   public Class221(Class110 var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.field_2202 = var3;
   }

   protected void method_1632(Class143 var1, float var2) {
      GL11.glScalef(this.field_2202, this.field_2202, this.field_2202);
   }

   @Override
   protected void method_1224(Class377 var1, float var2) {
      this.method_1632((Class143)var1, var2);
   }
}
