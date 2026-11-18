package x;

public class Class0308 extends Class0032 {
   private Class0032 h;
   protected String a = "Controls";
   private Class0145 i;
   private int k = -1;

   public Class0308(Class0032 var1, Class0145 var2) {
      this.h = var1;
      this.i = var2;
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < this.i.s.length; var1++) {
         this.e.add(new Class0352(var1, this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), this.i.a(var1)));
      }

      this.e.add(new Class0138(200, this.c / 2 - 100, this.d / 6 + 168, "Done"));
   }

   @Override
   protected void a(Class0138 var1) {
      for (int var2 = 0; var2 < this.i.s.length; var2++) {
         ((Class0138)this.e.get(var2)).c = this.i.a(var2);
      }

      if (var1.d == 200) {
         this.b.a(this.h);
      } else {
         this.k = var1.d;
         var1.c = "> " + this.i.a(var1.d) + " <";
      }
   }

   @Override
   protected void a(char var1, int var2) {
      if (this.k >= 0) {
         this.i.a(this.k, var2);
         ((Class0138)this.e.get(this.k)).c = this.i.a(this.k);
         this.k = -1;
      } else {
         super.a(var1, var2);
      }
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.a, this.c / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }
}
