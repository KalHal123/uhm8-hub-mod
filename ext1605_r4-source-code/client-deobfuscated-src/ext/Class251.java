package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class Class251 implements Interface608 {
   private String field_486 = "";
   private Minecraft field_61;
   private String field_2702 = "";
   private long field_2503 = System.currentTimeMillis();
   private boolean field_3056 = false;

   public Class251(Minecraft var1) {
      this.field_61 = var1;
   }

   public void method_348(String var1) {
      this.field_3056 = false;
      this.method_37(var1);
   }

   @Override
   public void method_128(String var1) {
      this.field_3056 = true;
      this.method_37(this.field_2702);
   }

   public void method_37(String var1) {
      if (!this.field_61.field_649) {
         if (!this.field_3056) {
            throw new Error314();
         }
      } else {
         this.field_2702 = var1;
         Class187 var2 = new Class187(this.field_61.field_2517, this.field_61.field_2477);
         int var3 = var2.method_884();
         int var4 = var2.method_351();
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
   public void method_825(String var1) {
      if (!this.field_61.field_649) {
         if (!this.field_3056) {
            throw new Error314();
         }
      } else {
         this.field_2503 = 0L;
         this.field_486 = var1;
         this.method_520(-1);
         this.field_2503 = 0L;
      }
   }

   @Override
   public void method_520(int var1) {
      if (!this.field_61.field_649) {
         if (!this.field_3056) {
            throw new Error314();
         }
      } else {
         long var2 = System.currentTimeMillis();
         if (var2 - this.field_2503 >= 20L) {
            this.field_2503 = var2;
            Class187 var4 = new Class187(this.field_61.field_2517, this.field_61.field_2477);
            int var5 = var4.method_884();
            int var6 = var4.method_351();
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0, var5, var6, 0.0, 100.0, 300.0);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -200.0F);
            GL11.glClear(16640);
            Class368 var7 = Class368.field_2696;
            int var8 = this.field_61.field_2176.method_1545("/dirt.png");
            GL11.glBindTexture(3553, var8);
            float var9 = 32.0F;
            var7.method_186();
            var7.method_1748(789516);
            var7.method_318(0.0, var6, 0.0, 0.0, var6 / var9);
            var7.method_318(var5, var6, 0.0, var5 / var9, var6 / var9);
            var7.method_318(var5, 0.0, 0.0, var5 / var9, 0.0);
            var7.method_318(0.0, 0.0, 0.0, 0.0, 0.0);
            var7.method_406();
            if (var1 >= 0) {
               byte var10 = 100;
               byte var11 = 2;
               byte var12 = 13;
               int var13 = var6 - 16;
               GL11.glDisable(3553);
               var7.method_186();
               var7.method_1748(8421504);
               var7.method_1724(var12, var13, 0.0);
               var7.method_1724(var12, var13 + var11, 0.0);
               var7.method_1724(var12 + var10, var13 + var11, 0.0);
               var7.method_1724(var12 + var10, var13, 0.0);
               var7.method_1748(8454016);
               var7.method_1724(var12, var13, 0.0);
               var7.method_1724(var12, var13 + var11, 0.0);
               var7.method_1724(var12 + var1, var13 + var11, 0.0);
               var7.method_1724(var12 + var1, var13, 0.0);
               var7.method_406();
               GL11.glEnable(3553);
            }

            this.field_61.field_1541.method_1444(this.field_2702, 13, var6 - 40, 16777215);
            this.field_61.field_1541.method_1444(this.field_486, 13, var6 - 28, 1090519039);
            Display.update();

            try {
               Thread.yield();
            } catch (Exception var14) {
            }
         }
      }
   }
}
