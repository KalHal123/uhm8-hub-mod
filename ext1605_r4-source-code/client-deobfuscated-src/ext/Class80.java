package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class80 extends Class423 {
   public float field_2182 = 1.0F;
   public boolean field_1268 = false;
   private int field_1236 = 0;

   public Class80(int var1, int var2, int var3, int var4, String var5, float var6) {
      super(var1, var2, var3, 150, 20, var5);
      this.field_1236 = var4;
      this.field_2182 = var6;
   }

   @Override
   protected int method_1523(boolean var1) {
      return 0;
   }

   @Override
   protected void method_1692(Minecraft var1, int var2, int var3) {
      if (this.field_1422) {
         if (this.field_1268) {
            this.field_2182 = (float)(var2 - (this.field_2064 + 4)) / (this.field_368 - 8);
            if (this.field_2182 < 0.0F) {
               this.field_2182 = 0.0F;
            }

            if (this.field_2182 > 1.0F) {
               this.field_2182 = 1.0F;
            }

            var1.field_1754.method_781(this.field_1236, this.field_2182);
            this.field_1027 = var1.field_1754.method_1698(this.field_1236);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.method_1219(this.field_2064 + (int)(this.field_2182 * (this.field_368 - 8)), this.field_2157, 0, 66, 4, 20);
         this.method_1219(this.field_2064 + (int)(this.field_2182 * (this.field_368 - 8)) + 4, this.field_2157, 196, 66, 4, 20);
      }
   }

   @Override
   public boolean method_94(Minecraft var1, int var2, int var3) {
      if (super.method_94(var1, var2, var3)) {
         this.field_2182 = (float)(var2 - (this.field_2064 + 4)) / (this.field_368 - 8);
         if (this.field_2182 < 0.0F) {
            this.field_2182 = 0.0F;
         }

         if (this.field_2182 > 1.0F) {
            this.field_2182 = 1.0F;
         }

         var1.field_1754.method_781(this.field_1236, this.field_2182);
         this.field_1027 = var1.field_1754.method_1698(this.field_1236);
         this.field_1268 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_15(int var1, int var2) {
      this.field_1268 = false;
   }
}
