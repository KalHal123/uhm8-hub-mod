public class dl {
   public final int a;
   public final int b;
   public final int c;
   public final fy d;
   private final dy e;

   public dl(dy var1, fy var2, int var3, int var4, int var5) {
      this.e = var1;
      this.d = var2;
      this.a = var3;
      this.b = var4;
      this.c = var5;
   }

   public boolean a(int var1, int var2) {
      int var3 = (this.e.c - this.e.a) / 2;
      int var4 = (this.e.d - this.e.h) / 2;
      var1 -= var3;
      var2 -= var4;
      return var1 >= this.b - 1 && var1 < this.b + 16 + 1 && var2 >= this.c - 1 && var2 < this.c + 16 + 1;
   }

   public void a() {
      this.d();
   }

   public boolean a(eo var1) {
      return true;
   }

   public eo b() {
      return this.d.a_(this.a);
   }

   public void b(eo var1) {
      this.d.a(this.a, var1);
      this.d();
   }

   public int c() {
      return -1;
   }

   public void d() {
      this.d.d();
   }
}
