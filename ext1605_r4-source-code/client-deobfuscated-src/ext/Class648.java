package ext;

import org.lwjgl.opengl.GL11;

public class Class648 extends Class355 {
   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class331(0, 0, 0, ""));
   }

   @Override
   protected void method_542(float var1) {
      int var2 = this.field_3013.field_2176.method_1545("/gui/guiplayer.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_3013.field_2176.method_462(var2);
      int var3 = (this.field_2345 - this.field_2320) / 2;
      int var4 = (this.field_562 - this.field_2029) / 2;
      this.method_1219(var3, var4, 0, 0, this.field_2320, this.field_2029);
   }
}
