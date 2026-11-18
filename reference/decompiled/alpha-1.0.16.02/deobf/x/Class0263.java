package x;

class Class0263 {
   public double a;
   public double b;
   public double c;

   public Class0263(Class0075 var1, int var2, int var3) {
      this.d = var1;
      this.a = this.b = 10 + var3 + Class0075.j().nextDouble() * 32.0 + var2;
   }

   public void a() {
      this.b = this.a;
      if (this.a > 0.0) {
         this.c -= 0.6;
      }

      this.a = this.a + this.c;
      this.c *= 0.9;
      if (this.a < 0.0) {
         this.a = 0.0;
         this.c = 0.0;
      }
   }
}
