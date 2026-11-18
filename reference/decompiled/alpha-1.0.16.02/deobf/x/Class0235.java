package x;

public class Class0235 extends Class0032 {
   private Class0032 a;
   private String h;
   private String i;
   private int k;

   public Class0235(Class0032 var1, String var2, String var3, int var4) {
      this.a = var1;
      this.h = var2;
      this.i = var3;
      this.k = var4;
   }

   @Override
   public void a() {
      this.e.add(new Class0352(0, this.c / 2 - 155 + 0, this.d / 6 + 96, "Yes"));
      this.e.add(new Class0352(1, this.c / 2 - 155 + 160, this.d / 6 + 96, "No"));
   }

   @Override
   protected void a(Class0138 var1) {
      this.a.a(var1.d == 0, this.k);
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.h, this.c / 2, 70, 16777215);
      this.a(this.g, this.i, this.c / 2, 90, 16777215);
      super.a(var1, var2, var3);
   }
}
