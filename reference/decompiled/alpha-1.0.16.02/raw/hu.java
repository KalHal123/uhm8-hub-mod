public class hu extends bd {
   private int a = 0;
   private int h = 0;

   @Override
   public void a() {
      this.a = 0;
      this.e.clear();
      this.e.add(new fb(1, this.c / 2 - 100, this.d / 4 + 48, "Save and quit to title"));
      if (this.b.j()) {
         ((fb)this.e.get(0)).c = "Disconnect";
      }

      this.e.add(new fb(4, this.c / 2 - 100, this.d / 4 + 24, "Back to game"));
      this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 96, "Options..."));
   }

   @Override
   protected void a(fb var1) {
      if (var1.d == 0) {
         this.b.a(new au(this, this.b.y));
      }

      if (var1.d == 1) {
         if (this.b.j()) {
            this.b.e.k();
         }

         this.b.a((cj)null);
         this.b.a(new ct());
      }

      if (var1.d == 4) {
         this.b.a((bd)null);
         this.b.e();
      }
   }

   @Override
   public void g() {
      super.g();
      this.h++;
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      boolean var4 = !this.b.e.a(this.a++);
      if (var4 || this.h < 20) {
         float var5 = (this.h % 10 + var3) / 10.0F;
         var5 = ei.a(var5 * (float) Math.PI * 2.0F) * 0.2F + 0.8F;
         int var6 = (int)(255.0F * var5);
         this.b(this.g, "Saving level..", 8, this.d - 16, var6 << 16 | var6 << 8 | var6);
      }

      this.a(this.g, "Game menu", this.c / 2, 40, 16777215);
      super.a(var1, var2, var3);
   }
}
