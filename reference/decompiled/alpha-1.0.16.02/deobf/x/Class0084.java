package x;

public class Class0084 extends Class0032 {
   private Class0178 a;
   private int h = 0;

   public Class0084(Class0178 var1) {
      this.a = var1;
   }

   @Override
   protected void a(char var1, int var2) {
   }

   @Override
   public void a() {
      this.e.clear();
   }

   @Override
   public void g() {
      this.h++;
      if (this.h % 20 == 0) {
         this.a.a(new Class0162());
      }

      if (this.a != null) {
         this.a.a();
      }
   }

   @Override
   protected void a(Class0138 var1) {
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.b(0);
      this.a(this.g, "Downloading terrain", this.c / 2, this.d / 2 - 50, 16777215);
      super.a(var1, var2, var3);
   }
}
