package x;

final class Class0182 {
   public final int a;
   public final int b;

   public Class0182(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class0182)) {
         return false;
      }

      Class0182 var2 = (Class0182)var1;
      return this.a == var2.a && this.b == var2.b;
   }

   @Override
   public int hashCode() {
      return this.a << 16 ^ this.b;
   }
}
