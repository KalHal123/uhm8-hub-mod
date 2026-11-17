package srv;

class Class52 {
   final int field_581;
   Object field_728;
   Class52 field_1482;
   final int field_1076;

   Class52(int var1, int var2, Object var3, Class52 var4) {
      this.field_728 = var3;
      this.field_1482 = var4;
      this.field_581 = var2;
      this.field_1076 = var1;
   }

   public final int method_611() {
      return this.field_581;
   }

   public final Object method_333() {
      return this.field_728;
   }

   @Override
   public final boolean equals(Object var1) {
      if (!(var1 instanceof Class52)) {
         return false;
      }

      Class52 var2 = (Class52)var1;
      Integer var3 = this.method_611();
      Integer var4 = var2.method_611();
      if (var3 == var4 || var3 != null && var3.equals(var4)) {
         Object var5 = this.method_333();
         Object var6 = var2.method_333();
         if (var5 == var6 || var5 != null && var5.equals(var6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public final int hashCode() {
      return Class326.method_918(this.field_581);
   }

   @Override
   public final String toString() {
      return this.method_611() + "=" + this.method_333();
   }
}
