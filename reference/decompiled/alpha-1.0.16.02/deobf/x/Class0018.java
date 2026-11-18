package x;

import org.lwjgl.opengl.GL11;

public class Class0018 extends Class0032 {
   @Override
   public void a() {
      this.e.clear();
      this.e.add(new Class0138(1, this.c / 2 - 100, this.d / 4 + 72, "Respawn"));
      this.e.add(new Class0138(2, this.c / 2 - 100, this.d / 4 + 96, "Title menu"));
      if (this.b.i == null) {
         ((Class0138)this.e.get(1)).e = false;
      }
   }

   @Override
   protected void a(char var1, int var2) {
   }

   @Override
   protected void a(Class0138 var1) {
      if (var1.d == 0) {
      }

      if (var1.d == 1) {
         this.b.o();
         this.b.a((Class0032)null);
      }

      if (var1.d == 2) {
         this.b.a((Class0065)null);
         this.b.a(new Class0075());
      }
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.a(0, 0, this.c, this.d, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      this.a(this.g, "Game over!", this.c / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      this.a(this.g, "Score: &e" + this.b.g.p(), this.c / 2, 100, 16777215);
      super.a(var1, var2, var3);
   }

   @Override
   public boolean b() {
      return false;
   }
}
