public class nx {
   public int a;
   public int b;

   public nx(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public int hashCode() {
      return this.a << 8 | this.b;
   }

   @Override
   public boolean equals(Object var1) {
      nx var2 = (nx)var1;
      return var2.a == this.a && var2.b == this.b;
   }
}
