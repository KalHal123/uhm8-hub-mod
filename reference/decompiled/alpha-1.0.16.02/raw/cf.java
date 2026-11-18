public class cf extends bd {
   private String a;
   private String h;

   public cf(String var1, String var2) {
      this.a = var1;
      this.h = var2;
   }

   @Override
   public void g() {
   }

   @Override
   protected void a(char var1, int var2) {
   }

   @Override
   public void a() {
      this.e.clear();
      this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Back to title screen"));
   }

   @Override
   protected void a(fb var1) {
      if (var1.d == 0) {
         this.b.a(new ct());
      }
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.a, this.c / 2, this.d / 2 - 50, 16777215);
      this.a(this.g, this.h, this.c / 2, this.d / 2 - 10, 16777215);
      super.a(var1, var2, var3);
   }
}
