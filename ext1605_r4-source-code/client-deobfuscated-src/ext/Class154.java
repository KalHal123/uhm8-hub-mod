package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class154 {
   public String field_415 = "";
   public long field_980 = -1L;
   public float field_2735 = 1500.0F;
   public Minecraft field_2615;

   public Class154(Minecraft var1, String var2, float var3) {
      this.field_415 = var2;
      this.field_2735 = var3;
      this.field_980 = System.currentTimeMillis();
      this.field_2615 = var1;
   }

   public void method_1006(String var1) {
      this.field_415 = var1;
      this.field_980 = System.currentTimeMillis();
   }

   public void method_609(int var1, int var2) {
      if (!this.field_415.isEmpty()) {
         GL11.glDisable(2896);
         GL11.glDisable(2912);
         Class368 var3 = Class368.field_2696;
         GL11.glBindTexture(3553, this.field_2615.field_2176.method_1545(this.field_415));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var3.method_1284(true);
         var3.method_1748(7368816);
         var3.method_318(0.0, var2, 0.0, 0.0, 1.0);
         var3.method_318(var1, var2, 0.0, 1.0, 1.0);
         var3.method_318(var1, 0.0, 0.0, 1.0, 0.0);
         var3.method_318(0.0, 0.0, 0.0, 0.0, 0.0);
         var3.method_406();
         float var4 = 1.0F - (float)(System.currentTimeMillis() - this.field_980) / this.field_2735;
         if (var4 < 0.0F) {
            var4 = 0.0F;
         }

         int var5 = (int)(255.0F * var4) * 16777216;
         Class254.method_194(0, 0, var1, var2, var5);
      }
   }
}
