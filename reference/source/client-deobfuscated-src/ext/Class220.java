package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class220 extends Class80 {
   public Class265 field_325;

   public Class220(Class265 var1, int var2, int var3, int var4, int var5, String var6, float var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_325 = var1;
      this.field_143 = true;
      this.field_2182 = 0.0F;
      this.field_368 = var5;
   }

   public boolean method_1314(Minecraft var1, int var2, int var3) {
      return this.field_143
         && var2 >= this.field_2064
         && var3 >= this.field_2157
         && var2 < this.field_2064 + this.field_368
         && var3 < this.field_2157 + this.field_660;
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
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.method_1219(this.field_2064 + (int)(this.field_2182 * (this.field_368 - 8)), this.field_2157, 0, 66, 4, 20);
         this.method_1219(this.field_2064 + (int)(this.field_2182 * (this.field_368 - 8)) + 4, this.field_2157, 196, 66, 4, 20);
      }
   }

   @Override
   public boolean method_94(Minecraft var1, int var2, int var3) {
      if (this.method_1314(var1, var2, var3)) {
         this.field_2182 = (float)(var2 - (this.field_2064 + 4)) / (this.field_368 - 8);
         if (this.field_2182 < 0.0F) {
            this.field_2182 = 0.0F;
         }

         if (this.field_2182 > 1.0F) {
            this.field_2182 = 1.0F;
         }

         this.field_1268 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_15(int var1, int var2) {
      if (this.field_2182 == 1.0F) {
         this.field_325.method_220();
      }

      this.field_1268 = false;
      this.field_2182 = 0.0F;
   }
}
