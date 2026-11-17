package ext;

class Class419 {
   public double field_147;
   public double field_942;
   public double field_2376;
   final Class373 field_1685;

   public Class419(Class373 var1, int var2, int var3) {
      this.field_1685 = var1;
      this.field_147 = this.field_942 = 10 + var3 + Class373.method_20().nextDouble() * 32.0 + var2;
   }

   public void method_293() {
      this.field_942 = this.field_147;
      if (this.field_147 > 0.0) {
         this.field_2376 -= 0.6;
      }

      this.field_147 = this.field_147 + this.field_2376;
      this.field_2376 *= 0.9;
      if (this.field_147 < 0.0) {
         this.field_147 = 0.0;
         this.field_2376 = 0.0;
      }
   }
}
