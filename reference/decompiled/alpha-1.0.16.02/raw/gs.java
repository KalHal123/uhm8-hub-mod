final class gs {
   public final int a;
   public final int b;

   public gs(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof gs)) {
         return false;
      }

      gs var2 = (gs)var1;
      return this.a == var2.a && this.b == var2.b;
   }

   @Override
   public int hashCode() {
      return this.a << 16 ^ this.b;
   }
}
