package x;

public class Class0313 implements Class0161 {
   private Class0124[] a = new Class0124[1];

   @Override
   public int a() {
      return 1;
   }

   @Override
   public Class0124 a_(int var1) {
      return this.a[var1];
   }

   @Override
   public String b() {
      return "Result";
   }

   @Override
   public Class0124 a(int var1, int var2) {
      if (this.a[var1] != null) {
         Class0124 var3 = this.a[var1];
         this.a[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void a(int var1, Class0124 var2) {
      this.a[var1] = var2;
   }

   @Override
   public int c() {
      return 64;
   }

   @Override
   public void d() {
   }
}
