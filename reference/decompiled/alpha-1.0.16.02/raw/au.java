public class au extends bd {
   private bd h;
   protected String a = "Options";
   private fi i;

   public au(bd var1, fi var2) {
      this.h = var1;
      this.i = var2;
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < this.i.u; var1++) {
         this.e.add(new n(var1, this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), this.i.b(var1)));
      }

      this.e.add(new fb(100, this.c / 2 - 100, this.d / 6 + 120 + 12, "Controls..."));
      this.e.add(new fb(200, this.c / 2 - 100, this.d / 6 + 168, "Done"));
   }

   @Override
   protected void a(fb var1) {
      if (var1.e) {
         if (var1.d < 100) {
            this.i.b(var1.d, 1);
            var1.c = this.i.b(var1.d);
         }

         if (var1.d == 100) {
            this.b.a(new lj(this, this.i));
         }

         if (var1.d == 200) {
            this.b.a(this.h);
         }
      }
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.a, this.c / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }
}
