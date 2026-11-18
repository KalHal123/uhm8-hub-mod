package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class85 extends Class423 {
   public int field_719;
   public Class265 field_2473;

   public Class85(int var1, int var2, int var3, String var4, int var5, Class265 var6) {
      super(var1, var2, var3, 25, 20, var4);
      this.field_719 = var5;
      this.field_2473 = var6;
   }

   @Override
   public void method_792(Minecraft var1, int var2, int var3) {
      if (this.field_1422) {
         int var5 = this.field_2064;
         int var6 = this.field_2157;
         Class640 var7 = var1.field_1541;
         GL11.glBindTexture(3553, var1.field_2176.method_1545("/gui/GUICREA.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         byte var8 = 1;
         boolean var4 = var2 >= this.field_2064
            && var3 >= this.field_2157
            && var2 < this.field_2064 + this.field_368
            && var3 < this.field_2157 + this.field_660;
         if (!this.field_143) {
            var8 = 0;
         } else if (var4) {
            var8 = 2;
         }

         this.method_1219(var5, var6, 0, 46 + var8 * 20, this.field_368 / 2, this.field_660);
         this.method_1219(var5 + this.field_368 / 2, var6, 200 - this.field_368 / 2, 46 + var8 * 20, this.field_368 / 2, this.field_660);
         if (!this.field_143) {
            this.method_1491(var7, this.field_1027, var5 + this.field_368 / 2, var6 + (this.field_660 - 8) / 2, -6250336);
         } else if (var4) {
            this.method_1491(var7, this.field_1027, var5 + this.field_368 / 2, var6 + (this.field_660 - 8) / 2, 16777120);
         } else {
            this.method_1491(var7, this.field_1027, var5 + this.field_368 / 2, var6 + (this.field_660 - 8) / 2, 14737632);
         }
      }
   }

   @Override
   public boolean method_1322() {
      return false;
   }
}
