import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class fb extends lb {
   private int g = 200;
   private int h = 20;
   public int a;
   public int b;
   public String c;
   public int d;
   public boolean e = true;
   public boolean f = true;

   public fb(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   protected fb(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.g = var4;
      this.h = var5;
      this.c = var6;
   }

   public void a(Minecraft var1, int var2, int var3) {
      if (this.f) {
         jt var4 = var1.o;
         GL11.glBindTexture(3553, var1.n.a("/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         byte var5 = 1;
         boolean var6 = var2 >= this.a && var3 >= this.b && var2 < this.a + this.g && var3 < this.b + this.h;
         if (!this.e) {
            var5 = 0;
         } else if (var6) {
            var5 = 2;
         }

         this.b(this.a, this.b, 0, 46 + var5 * 20, this.g / 2, this.h);
         this.b(this.a + this.g / 2, this.b, 200 - this.g / 2, 46 + var5 * 20, this.g / 2, this.h);
         if (!this.e) {
            this.a(var4, this.c, this.a + this.g / 2, this.b + (this.h - 8) / 2, -6250336);
         } else if (var6) {
            this.a(var4, this.c, this.a + this.g / 2, this.b + (this.h - 8) / 2, 16777120);
         } else {
            this.a(var4, this.c, this.a + this.g / 2, this.b + (this.h - 8) / 2, 14737632);
         }
      }
   }

   public boolean a(int var1, int var2) {
      return this.e && var1 >= this.a && var2 >= this.b && var1 < this.a + this.g && var2 < this.b + this.h;
   }
}
