public class ip {
   private int b;
   private int c;
   public int a;

   public ip(int var1, int var2) {
      this.b = var1;
      this.c = var2;
      this.a = 1;

      while (this.b / (this.a + 1) >= 320 && this.c / (this.a + 1) >= 240) {
         this.a++;
      }

      this.b = this.b / this.a;
      this.c = this.c / this.a;
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }
}
