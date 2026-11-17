package ext;

import org.lwjgl.opengl.GL11;

public class Class132 extends Class591 {
   public Class132() {
      super(new Class51(), 0.5F);
   }

   protected void method_156(Class111 var1, float var2) {
      float var3 = var1.method_1240(var2);
      float var4 = 1.0F + Class469.method_1667(var3 * 100.0F) * var3 * 0.01F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 *= var3;
      var3 *= var3;
      float var5 = (1.0F + var3 * 0.4F) * var4;
      float var6 = (1.0F + var3 * 0.1F) / var4;
      GL11.glScalef(var5, var6, var5);
   }

   protected int method_271(Class111 var1, float var2, float var3) {
      float var4 = var1.method_1240(var3);
      if ((int)(var4 * 10.0F) % 2 == 0) {
         return 0;
      }

      int var5 = (int)(var4 * 0.2F * 255.0F);
      if (var5 < 0) {
         var5 = 0;
      }

      if (var5 > 255) {
         var5 = 255;
      }

      short var6 = 255;
      short var7 = 255;
      short var8 = 255;
      return var5 << 24 | var6 << 16 | var7 << 8 | var8;
   }

   @Override
   protected void method_1224(Class377 var1, float var2) {
      this.method_156((Class111)var1, var2);
   }

   @Override
   protected int method_678(Class377 var1, float var2, float var3) {
      return this.method_271((Class111)var1, var2, var3);
   }
}
