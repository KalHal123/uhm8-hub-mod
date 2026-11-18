package x;

public class Class0094 {
   public final int a;
   public final int b;
   public final int c;
   public final Class0161 d;
   private final Class0107 e;

   public Class0094(Class0107 var1, Class0161 var2, int var3, int var4, int var5) {
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

   public boolean a(Class0124 var1) {
      return true;
   }

   public Class0124 b() {
      return this.d.a_(this.a);
   }

   public void b(Class0124 var1) {
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
