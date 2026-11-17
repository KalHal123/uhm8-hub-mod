package srv;

final class Class17 {
   public final int field_674;
   public final int field_212;

   public Class17(int var1, int var2) {
      this.field_674 = var1;
      this.field_212 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class17)) {
         return false;
      }

      Class17 var2 = (Class17)var1;
      return this.field_674 == var2.field_674 && this.field_212 == var2.field_212;
   }

   @Override
   public int hashCode() {
      return this.field_674 << 16 ^ this.field_212;
   }
}
