package x;

public class Class0022 extends Class0032 {
   private Class0032 h;
   protected String a = "Options";
   private Class0145 i;

   public Class0022(Class0032 var1, Class0145 var2) {
      this.h = var1;
      this.i = var2;
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < this.i.u; var1++) {
         this.e.add(new Class0352(var1, this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), this.i.b(var1)));
      }

      this.e.add(new Class0138(100, this.c / 2 - 100, this.d / 6 + 120 + 12, "Controls..."));
      this.e.add(new Class0138(200, this.c / 2 - 100, this.d / 6 + 168, "Done"));
   }

   @Override
   protected void a(Class0138 var1) {
      if (var1.e) {
         if (var1.d < 100) {
            this.i.b(var1.d, 1);
            var1.c = this.i.b(var1.d);
         }

         if (var1.d == 100) {
            this.b.a(new Class0308(this, this.i));
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
