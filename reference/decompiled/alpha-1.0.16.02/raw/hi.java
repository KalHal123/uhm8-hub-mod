public class hi implements fy {
   private String a;
   private fy b;
   private fy c;

   public hi(String var1, fy var2, fy var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   @Override
   public int a() {
      return this.b.a() + this.c.a();
   }

   @Override
   public String b() {
      return this.a;
   }

   @Override
   public eo a_(int var1) {
      return var1 >= this.b.a() ? this.c.a_(var1 - this.b.a()) : this.b.a_(var1);
   }

   @Override
   public eo a(int var1, int var2) {
      return var1 >= this.b.a() ? this.c.a(var1 - this.b.a(), var2) : this.b.a(var1, var2);
   }

   @Override
   public void a(int var1, eo var2) {
      if (var1 >= this.b.a()) {
         this.c.a(var1 - this.b.a(), var2);
      } else {
         this.b.a(var1, var2);
      }
   }

   @Override
   public int c() {
      return this.b.c();
   }

   @Override
   public void d() {
      this.b.d();
      this.c.d();
   }
}
