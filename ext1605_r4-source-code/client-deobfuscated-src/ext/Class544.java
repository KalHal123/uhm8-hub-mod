package ext;

class Class544 {
   final int field_698;
   Object field_1391;
   Class544 field_708;
   final int field_1595;

   Class544(int var1, int var2, Object var3, Class544 var4) {
      this.field_1391 = var3;
      this.field_708 = var4;
      this.field_698 = var2;
      this.field_1595 = var1;
   }

   public final int method_1554() {
      return this.field_698;
   }

   public final Object method_295() {
      return this.field_1391;
   }

   @Override
   public final boolean equals(Object var1) {
      if (!(var1 instanceof Class544)) {
         return false;
      }

      Class544 var2 = (Class544)var1;
      Integer var3 = this.method_1554();
      Integer var4 = var2.method_1554();
      if (var3 == var4 || var3 != null && var3.equals(var4)) {
         Object var5 = this.method_295();
         Object var6 = var2.method_295();
         if (var5 == var6 || var5 != null && var5.equals(var6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public final int hashCode() {
      return Class738.method_1868(this.field_698);
   }

   @Override
   public final String toString() {
      return this.method_1554() + "=" + this.method_295();
   }
}
