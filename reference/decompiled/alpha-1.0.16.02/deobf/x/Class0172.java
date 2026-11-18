package x;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class Class0172 implements Class0360 {
   private String a = "";
   private Minecraft b;
   private String c = "";
   private long d = System.currentTimeMillis();
   private boolean e = false;

   public Class0172(Minecraft var1) {
      this.b = var1;
   }

   public void a(String var1) {
      this.e = false;
      this.c(var1);
   }

   @Override
   public void b(String var1) {
      this.e = true;
      this.c(this.c);
   }

   public void c(String var1) {
      if (!this.b.F) {
         if (!this.e) {
            throw new Class0357();
         }
      } else {
         this.c = var1;
         Class0233 var2 = new Class0233(this.b.c, this.b.d);
         int var3 = var2.a();
         int var4 = var2.b();
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0, var3, var4, 0.0, 100.0, 300.0);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      }
   }

   @Override
   public void d(String var1) {
      if (!this.b.F) {
         if (!this.e) {
            throw new Class0357();
         }
      } else {
         this.d = 0L;
         this.a = var1;
         this.a(-1);
         this.d = 0L;
      }
   }

   @Override
   public void a(int var1) {
      if (!this.b.F) {
         if (!this.e) {
            throw new Class0357();
         }
      } else {
         long var2 = System.currentTimeMillis();
         if (var2 - this.d >= 20L) {
            this.d = var2;
            Class0233 var4 = new Class0233(this.b.c, this.b.d);
            int var5 = var4.a();
            int var6 = var4.b();
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0, var5, var6, 0.0, 100.0, 300.0);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -200.0F);
            GL11.glClear(16640);
            Class0195 var7 = Class0195.a;
            int var8 = this.b.n.a("/dirt.png");
            GL11.glBindTexture(3553, var8);
            float var9 = 32.0F;
            var7.b();
            var7.b(4210752);
            var7.a(0.0, var6, 0.0, 0.0, var6 / var9);
            var7.a(var5, var6, 0.0, var5 / var9, var6 / var9);
            var7.a(var5, 0.0, 0.0, var5 / var9, 0.0);
            var7.a(0.0, 0.0, 0.0, 0.0, 0.0);
            var7.a();
            if (var1 >= 0) {
               byte var10 = 100;
               byte var11 = 2;
               int var12 = var5 / 2 - var10 / 2;
               int var13 = var6 / 2 + 16;
               GL11.glDisable(3553);
               var7.b();
               var7.b(8421504);
               var7.a(var12, var13, 0.0);
               var7.a(var12, var13 + var11, 0.0);
               var7.a(var12 + var10, var13 + var11, 0.0);
               var7.a(var12 + var10, var13, 0.0);
               var7.b(8454016);
               var7.a(var12, var13, 0.0);
               var7.a(var12, var13 + var11, 0.0);
               var7.a(var12 + var1, var13 + var11, 0.0);
               var7.a(var12 + var1, var13, 0.0);
               var7.a();
               GL11.glEnable(3553);
            }

            this.b.o.a(this.c, (var5 - this.b.o.a(this.c)) / 2, var6 / 2 - 4 - 16, 16777215);
            this.b.o.a(this.a, (var5 - this.b.o.a(this.a)) / 2, var6 / 2 - 4 + 8, 16777215);
            Display.update();

            try {
               Thread.yield();
            } catch (Exception var14) {
            }
         }
      }
   }
}
