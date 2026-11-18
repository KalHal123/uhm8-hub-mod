package srv;

public class Class68 extends Class66 {
   public int field_1391 = -1;
   public String field_1554 = "Pig";
   public double field_708;
   public double field_578 = 0.0;

   public Class68() {
      this.field_1391 = 20;
   }

   public boolean method_471() {
      return this.field_416.method_818(this.field_720 + 0.5, this.field_1400 + 0.5, this.field_454 + 0.5, 16.0) != null;
   }

   @Override
   public void method_855() {
      this.field_578 = this.field_708;
      if (this.method_471()) {
         double var1 = this.field_720 + this.field_416.field_413.nextFloat();
         double var3 = this.field_1400 + this.field_416.field_413.nextFloat();
         double var5 = this.field_454 + this.field_416.field_413.nextFloat();
         this.field_416.method_140("smoke", var1, var3, var5, 0.0, 0.0, 0.0);
         this.field_416.method_140("flame", var1, var3, var5, 0.0, 0.0, 0.0);

         for (this.field_708 = this.field_708 + 1000.0F / (this.field_1391 + 200.0F); this.field_708 > 360.0; this.field_578 -= 360.0) {
            this.field_708 -= 360.0;
         }

         if (this.field_1391 == -1) {
            this.method_600();
         }

         if (this.field_1391 > 0) {
            this.field_1391--;
         } else {
            byte var7 = 4;

            for (int var8 = 0; var8 < var7; var8++) {
               Class92 var9 = (Class92)Class227.method_133(this.field_1554, this.field_416);
               if (var9 == null) {
                  return;
               }

               int var10 = this.field_416
                  .method_494(
                     var9.getClass(),
                     Class94.method_27(this.field_720, this.field_1400, this.field_454, this.field_720 + 1, this.field_1400 + 1, this.field_454 + 1)
                        .method_99(8.0, 4.0, 8.0)
                  )
                  .size();
               if (var10 >= 6) {
                  this.method_600();
                  return;
               }

               if (var9 != null) {
                  double var11 = this.field_720 + (this.field_416.field_413.nextDouble() - this.field_416.field_413.nextDouble()) * 4.0;
                  double var13 = this.field_1400 + this.field_416.field_413.nextInt(3) - 1;
                  double var15 = this.field_454 + (this.field_416.field_413.nextDouble() - this.field_416.field_413.nextDouble()) * 4.0;
                  var9.method_885(var11, var13, var15, this.field_416.field_413.nextFloat() * 360.0F, 0.0F);
                  if (var9.method_53()) {
                     this.field_416.method_237(var9);

                     for (int var17 = 0; var17 < 20; var17++) {
                        var1 = this.field_720 + 0.5 + (this.field_416.field_413.nextFloat() - 0.5) * 2.0;
                        var3 = this.field_1400 + 0.5 + (this.field_416.field_413.nextFloat() - 0.5) * 2.0;
                        var5 = this.field_454 + 0.5 + (this.field_416.field_413.nextFloat() - 0.5) * 2.0;
                        this.field_416.method_140("smoke", var1, var3, var5, 0.0, 0.0, 0.0);
                        this.field_416.method_140("flame", var1, var3, var5, 0.0, 0.0, 0.0);
                     }

                     var9.method_792();
                     this.method_600();
                  }
               }
            }

            super.method_855();
         }
      }
   }

   private void method_600() {
      this.field_1391 = 200 + this.field_416.field_413.nextInt(600);
   }

   @Override
   public void method_816(Class100 var1) {
      super.method_816(var1);
      this.field_1554 = var1.method_219("EntityId");
      this.field_1391 = var1.method_799("Delay");
   }

   @Override
   public void method_878(Class100 var1) {
      super.method_878(var1);
      var1.method_152("EntityId", this.field_1554);
      var1.method_761("Delay", (short)this.field_1391);
   }
}
