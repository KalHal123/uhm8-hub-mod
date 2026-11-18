package x;

public class Class0217 implements Class0161 {
   private Class0124[] a;
   private int b;
   private Class0107 c;

   public Class0217(Class0107 var1, int var2, int var3) {
      this.b = var2 * var3;
      this.a = new Class0124[this.b];
      this.c = var1;
   }

   public Class0217(Class0107 var1, Class0124[] var2) {
      this.b = var2.length;
      this.a = var2;
      this.c = var1;
   }

   @Override
   public int a() {
      return this.b;
   }

   @Override
   public Class0124 a_(int var1) {
      return this.a[var1];
   }

   @Override
   public String b() {
      return "Crafting";
   }

   @Override
   public Class0124 a(int var1, int var2) {
      if (this.a[var1] != null) {
         if (this.a[var1].a <= var2) {
            Class0124 var4 = this.a[var1];
            this.a[var1] = null;
            this.c.a(this);
            return var4;
         }

         Class0124 var3 = this.a[var1].a(var2);
         if (this.a[var1].a == 0) {
            this.a[var1] = null;
         }

         this.c.a(this);
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void a(int var1, Class0124 var2) {
      this.a[var1] = var2;
      this.c.a(this);
   }

   @Override
   public int c() {
      return 64;
   }

   @Override
   public void d() {
   }
}
