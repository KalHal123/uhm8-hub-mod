package ext;

import org.lwjgl.opengl.GL11;

public class Class172 extends Class265 {
   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class423(2, this.field_2345 / 2 - 100, this.field_562 / 4 + 96, "Title menu"));
      if (this.field_3013.field_2935 == null) {
         this.field_577.get(1).field_143 = false;
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_2254 == 0) {
      }

      if (var1.field_2254 == 1) {
         this.field_3013.method_82();
         this.field_3013.method_1290((Class265)null);
      }

      if (var1.field_2254 == 2) {
         this.field_3013.method_1824((Class454)null);
         this.field_3013.method_1290(new Class373());
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      method_421(0, 0, this.field_2345, this.field_562, 805306368, -1610612736);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      this.method_1491(this.field_1683, "Game over!", this.field_2345 / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      this.method_1491(this.field_1683, "You survived " + (((Class46)this.field_3013.field_2648).field_2530 - 1) + " waves", this.field_2345 / 2, 100, 16777215);
      super.method_1938(var1, var2, var3);
   }

   @Override
   public boolean method_1440() {
      return false;
   }
}
