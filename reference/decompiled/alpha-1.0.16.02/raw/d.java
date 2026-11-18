import org.lwjgl.opengl.GL11;

public class d extends dh {
   public d() {
      super(new eg(), 0.5F);
   }

   protected void a(cy var1, float var2) {
      cy var3 = var1;
      float var4 = var3.b(var2);
      float var5 = 1.0F + ei.a(var4 * 100.0F) * var4 * 0.01F;
      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      var4 *= var4;
      var4 *= var4;
      float var6 = (1.0F + var4 * 0.4F) * var5;
      float var7 = (1.0F + var4 * 0.1F) / var5;
      GL11.glScalef(var6, var7, var6);
   }

   protected int a(cy var1, float var2, float var3) {
      cy var4 = var1;
      float var5 = var4.b(var3);
      if ((int)(var5 * 10.0F) % 2 == 0) {
         return 0;
      }

      int var6 = (int)(var5 * 0.2F * 255.0F);
      if (var6 < 0) {
         var6 = 0;
      }

      if (var6 > 255) {
         var6 = 255;
      }

      short var7 = 255;
      short var8 = 255;
      short var9 = 255;
      return var6 << 24 | var7 << 16 | var8 << 8 | var9;
   }
}
