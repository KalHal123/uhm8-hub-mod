package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class423 extends Class254 {
   protected int field_368;
   protected int field_660;
   public int field_2064;
   public int field_2157;
   public String field_1027;
   public int field_2254;
   public boolean field_143;
   public boolean field_1422;
   public boolean field_2767 = false;
   public int field_354 = 16777120;
   public int field_1980 = 14737632;
   public long field_2716;
   public final long field_1584 = 300L;

   public Class423(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   public Class423(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.field_143 = true;
      this.field_1422 = true;
      this.field_2254 = var1;
      this.field_2064 = var2;
      this.field_2157 = var3;
      this.field_368 = var4;
      this.field_660 = var5;
      this.field_1027 = var6;
      this.field_2716 = System.currentTimeMillis();
   }

   public boolean method_1322() {
      return true;
   }

   protected int method_1523(boolean var1) {
      byte var2 = 1;
      if (!this.field_143) {
         var2 = 0;
      } else if (var1) {
         var2 = 2;
      }

      return var2;
   }

   public void method_792(Minecraft var1, int var2, int var3) {
      if (this.field_1422) {
         Class187 var4 = new Class187(var1.field_2517, var1.field_2477);
         int var5 = var4.method_884();
         int var6 = var4.method_351();
         int var7 = this.field_2064;
         int var8 = this.field_2157;
         long var9 = System.currentTimeMillis() - this.field_2716;
         if (this.method_1322() && var9 >= 0L && var9 < 300L) {
            float var11 = (float)var9 / 300.0F;
            var8 = (int)(var8 + var6 * Class100.method_640(1.0F - var11));
         }

         Class640 var13 = var1.field_1541;
         GL11.glBindTexture(3553, var1.field_2176.method_1545("/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_2767 = var2 >= this.field_2064
            && var3 >= this.field_2157
            && var2 < this.field_2064 + this.field_368
            && var3 < this.field_2157 + this.field_660;
         int var12 = this.method_1523(this.field_2767);
         this.method_1219(var7, var8, 0, 46 + var12 * 20, this.field_368 / 2, this.field_660);
         this.method_1219(var7 + this.field_368 / 2, var8, 200 - this.field_368 / 2, 46 + var12 * 20, this.field_368 / 2, this.field_660);
         this.method_1692(var1, var2, var3);
         if (!this.field_143) {
            this.method_1491(var13, this.field_1027, var7 + this.field_368 / 2, var8 + (this.field_660 - 8) / 2, -6250336);
         } else if (this.field_2767) {
            this.method_1491(var13, this.field_1027, var7 + this.field_368 / 2, var8 + (this.field_660 - 8) / 2, this.field_354);
         } else {
            this.method_1491(var13, this.field_1027, var7 + this.field_368 / 2, var8 + (this.field_660 - 8) / 2, this.field_1980);
         }
      }
   }

   public Class423 method_1437(int var1, int var2) {
      this.field_354 = var1;
      this.field_1980 = var2;
      return this;
   }

   protected void method_1692(Minecraft var1, int var2, int var3) {
   }

   public void method_15(int var1, int var2) {
   }

   public boolean method_94(Minecraft var1, int var2, int var3) {
      return this.field_143
         && var2 >= this.field_2064
         && var3 >= this.field_2157
         && var2 < this.field_2064 + this.field_368
         && var3 < this.field_2157 + this.field_660;
   }
}
