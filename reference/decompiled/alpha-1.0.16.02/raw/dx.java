public class dx {
   public ah a;
   public float b;
   public float c;

   public dx(float var1, float var2, float var3, float var4, float var5) {
      this(ah.a(var1, var2, var3), var4, var5);
   }

   public dx a(float var1, float var2) {
      return new dx(this, var1, var2);
   }

   public dx(dx var1, float var2, float var3) {
      this.a = var1.a;
      this.b = var2;
      this.c = var3;
   }

   public dx(ah var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }
}
