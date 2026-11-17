package ext;

final class Class619 {
   public final int field_576;
   public final int field_641;

   public Class619(int var1, int var2) {
      this.field_576 = var1;
      this.field_641 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class619)) {
         return false;
      }

      Class619 var2 = (Class619)var1;
      return this.field_576 == var2.field_576 && this.field_641 == var2.field_641;
   }

   @Override
   public int hashCode() {
      return this.field_576 << 16 ^ this.field_641;
   }
}
