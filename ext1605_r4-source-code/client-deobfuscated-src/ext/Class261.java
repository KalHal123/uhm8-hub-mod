package ext;

public class Class261 extends Class421 {
   public Class261(Class581 var1, Interface269 var2, Interface752 var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class741 method_1337(int var1, int var2) {
      if (var1 == this.field_2152 && var2 == this.field_1581 && this.field_505 != null) {
         return this.field_505;
      }

      int var3 = var1 & 31;
      int var4 = var2 & 31;
      int var5 = var3 + var4 * 32;
      if (!this.method_972(var1, var2)) {
         if (this.field_427[var5] != null) {
            this.field_427[var5].method_1400();
            this.method_1544(this.field_427[var5]);
            this.method_138(this.field_427[var5]);
         }

         Class741 var6 = this.method_422(var1, var2);
         if (var6 == null) {
            if (this.field_1905 == null) {
               var6 = this.field_2000;
            } else {
               var6 = this.field_1905.method_1337(var1, var2);
            }
         }

         this.field_427[var5] = var6;
         if (this.field_427[var5] != null) {
            this.field_427[var5].method_116();
         }
      }

      this.field_2152 = var1;
      this.field_1581 = var2;
      this.field_505 = this.field_427[var5];
      return this.field_427[var5];
   }

   @Override
   public void method_1834(Interface752 var1, int var2, int var3) {
      this.method_1337(var2, var3).method_659();
   }
}
