package ext;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class Class170 {
   private int field_2485;
   private int field_2387;
   private int field_1667;
   private float field_1197;
   private float field_1381;
   private float field_2917;
   private IntBuffer field_2281 = Class504.method_323(65536);
   private boolean field_2338 = false;
   private boolean field_2020 = false;

   public void method_1785(int var1, int var2, int var3, double var4, double var6, double var8) {
      this.field_2338 = true;
      ((Buffer)this.field_2281).clear();
      this.field_2485 = var1;
      this.field_2387 = var2;
      this.field_1667 = var3;
      this.field_1197 = (float)var4;
      this.field_1381 = (float)var6;
      this.field_2917 = (float)var8;
   }

   public boolean method_788(int var1, int var2, int var3) {
      return !this.field_2338 ? false : var1 == this.field_2485 && var2 == this.field_2387 && var3 == this.field_1667;
   }

   public void method_1499(int var1) {
      this.field_2281.put(var1);
      if (this.field_2281.remaining() == 0) {
         this.method_749();
      }
   }

   public void method_749() {
      if (this.field_2338) {
         if (!this.field_2020) {
            ((Buffer)this.field_2281).flip();
            this.field_2020 = true;
         }

         if (this.field_2281.remaining() > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef(this.field_2485 - this.field_1197, this.field_2387 - this.field_1381, this.field_1667 - this.field_2917);
            GL11.glCallLists(this.field_2281);
            GL11.glPopMatrix();
         }
      }
   }

   public void method_1388() {
      this.field_2338 = false;
      this.field_2020 = false;
   }
}
