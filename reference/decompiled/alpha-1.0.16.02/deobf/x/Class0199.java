package x;

public class Class0199 implements Class0161 {
   private String a;
   private Class0161 b;
   private Class0161 c;

   public Class0199(String var1, Class0161 var2, Class0161 var3) {
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
   public Class0124 a_(int var1) {
      return var1 >= this.b.a() ? this.c.a_(var1 - this.b.a()) : this.b.a_(var1);
   }

   @Override
   public Class0124 a(int var1, int var2) {
      return var1 >= this.b.a() ? this.c.a(var1 - this.b.a(), var2) : this.b.a(var1, var2);
   }

   @Override
   public void a(int var1, Class0124 var2) {
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
