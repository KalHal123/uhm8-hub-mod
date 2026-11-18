public class i implements fy {
   private eo[] a;
   private int b;
   private dy c;

   public i(dy var1, int var2, int var3) {
      this.b = var2 * var3;
      this.a = new eo[this.b];
      this.c = var1;
   }

   public i(dy var1, eo[] var2) {
      this.b = var2.length;
      this.a = var2;
      this.c = var1;
   }

   @Override
   public int a() {
      return this.b;
   }

   @Override
   public eo a_(int var1) {
      return this.a[var1];
   }

   @Override
   public String b() {
      return "Crafting";
   }

   @Override
   public eo a(int var1, int var2) {
      if (this.a[var1] != null) {
         if (this.a[var1].a <= var2) {
            eo var4 = this.a[var1];
            this.a[var1] = null;
            this.c.a(this);
            return var4;
         }

         eo var3 = this.a[var1].a(var2);
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
   public void a(int var1, eo var2) {
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
