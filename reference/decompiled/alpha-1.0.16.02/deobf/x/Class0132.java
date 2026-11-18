package x;

public class Class0132 extends Class0210 implements Class0161 {
   private Class0124[] a = new Class0124[36];

   @Override
   public int a() {
      return 27;
   }

   @Override
   public Class0124 a_(int var1) {
      return this.a[var1];
   }

   @Override
   public Class0124 a(int var1, int var2) {
      if (this.a[var1] != null) {
         if (this.a[var1].a <= var2) {
            Class0124 var4 = this.a[var1];
            this.a[var1] = null;
            return var4;
         }

         Class0124 var3 = this.a[var1].a(var2);
         if (this.a[var1].a == 0) {
            this.a[var1] = null;
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void a(int var1, Class0124 var2) {
      this.a[var1] = var2;
      if (var2 != null && var2.a > this.c()) {
         var2.a = this.c();
      }
   }

   @Override
   public String b() {
      return "Chest";
   }

   @Override
   public void a(Class0193 var1) {
      super.a(var1);
      Class0269 var2 = var1.l("Items");
      this.a = new Class0124[this.a()];

      for (int var3 = 0; var3 < var2.c(); var3++) {
         Class0193 var4 = (Class0193)var2.a(var3);
         int var5 = var4.c("Slot") & 255;
         if (var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = new Class0124(var4);
         }
      }
   }

   @Override
   public void b(Class0193 var1) {
      super.b(var1);
      Class0269 var2 = new Class0269();

      for (int var3 = 0; var3 < this.a.length; var3++) {
         if (this.a[var3] != null) {
            Class0193 var4 = new Class0193();
            var4.a("Slot", (byte)var3);
            this.a[var3].a(var4);
            var2.a(var4);
         }
      }

      var1.a("Items", var2);
   }

   @Override
   public int c() {
      return 64;
   }
}
