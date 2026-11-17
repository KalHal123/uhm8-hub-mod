package srv;

class Class139 {
   final long field_238;
   Object field_1542;
   Class139 field_1410;
   final int field_583;

   Class139(int var1, long var2, Object var4, Class139 var5) {
      this.field_1542 = var4;
      this.field_1410 = var5;
      this.field_238 = var2;
      this.field_583 = var1;
   }

   public final long method_36() {
      return this.field_238;
   }

   public final Object method_111() {
      return this.field_1542;
   }

   @Override
   public final boolean equals(Object var1) {
      if (!(var1 instanceof Class139)) {
         return false;
      }

      Class139 var2 = (Class139)var1;
      Long var3 = this.method_36();
      Long var4 = var2.method_36();
      if (var3 == var4 || var3 != null && var3.equals(var4)) {
         Object var5 = this.method_111();
         Object var6 = var2.method_111();
         if (var5 == var6 || var5 != null && var5.equals(var6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public final int hashCode() {
      return Class232.method_167(this.field_238);
   }

   @Override
   public final String toString() {
      return this.method_36() + "=" + this.method_111();
   }
}
