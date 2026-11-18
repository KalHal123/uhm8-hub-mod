package ext;

public class Class523 extends Class633 {
   private final Class475 field_24;

   public Class523(Class475 var1) {
      this.field_24 = var1;
   }

   @Override
   public Class475 method_338() {
      return new Class475(1, 1);
   }

   @Override
   public Class475 method_1399() {
      return this.field_24;
   }

   @Override
   public boolean method_1051(Class454 var1, int var2, int var3) {
      if (Class517.method_27(var2, var3, this.field_24.field_2785 + 1, this.field_24.field_256 + 1)) {
         for (int var4 = 128; var4 > 0; var4--) {
            var1.method_470(this.field_24.field_2785 + 1, var4, this.field_24.field_256 + 1, Class108.field_3014.field_2151);
         }
      }

      if (Class517.method_27(var2, var3, this.field_24.field_2785 + 14, this.field_24.field_256 + 1)) {
         for (int var5 = 128; var5 > 0; var5--) {
            var1.method_470(this.field_24.field_2785 + 14, var5, this.field_24.field_256 + 1, Class108.field_3014.field_2151);
         }
      }

      if (Class517.method_27(var2, var3, this.field_24.field_2785 + 1, this.field_24.field_256 + 14)) {
         for (int var6 = 128; var6 > 0; var6--) {
            var1.method_470(this.field_24.field_2785 + 1, var6, this.field_24.field_256 + 14, Class108.field_3014.field_2151);
         }
      }

      if (Class517.method_27(var2, var3, this.field_24.field_2785 + 14, this.field_24.field_256 + 14)) {
         for (int var7 = 128; var7 > 0; var7--) {
            var1.method_470(this.field_24.field_2785 + 14, var7, this.field_24.field_256 + 14, Class108.field_3014.field_2151);
         }
      }

      return false;
   }
}
