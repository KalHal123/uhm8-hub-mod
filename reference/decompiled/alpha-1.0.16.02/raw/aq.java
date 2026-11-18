import org.lwjgl.opengl.GL11;

public class aq extends bd {
   @Override
   public void a() {
      this.e.clear();
      this.e.add(new fb(1, this.c / 2 - 100, this.d / 4 + 72, "Respawn"));
      this.e.add(new fb(2, this.c / 2 - 100, this.d / 4 + 96, "Title menu"));
      if (this.b.i == null) {
         ((fb)this.e.get(1)).e = false;
      }
   }

   @Override
   protected void a(char var1, int var2) {
   }

   @Override
   protected void a(fb var1) {
      if (var1.d == 0) {
      }

      if (var1.d == 1) {
         this.b.o();
         this.b.a((bd)null);
      }

      if (var1.d == 2) {
         this.b.a((cj)null);
         this.b.a(new ct());
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
