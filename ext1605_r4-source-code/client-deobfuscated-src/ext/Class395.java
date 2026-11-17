package ext;

public class Class395 extends Class184 {
   private boolean[] field_1961 = new boolean[10];
   private Class693 field_2919;

   public Class395(Class693 var1) {
      this.field_2919 = var1;
   }

   @Override
   public void method_1143(int var1, boolean var2) {
      byte var3 = -1;
      if (var1 == this.field_2919.field_2436.field_2381) {
         var3 = 0;
      }

      if (var1 == this.field_2919.field_1203.field_2381) {
         var3 = 1;
      }

      if (var1 == this.field_2919.field_1509.field_2381) {
         var3 = 2;
      }

      if (var1 == this.field_2919.field_2548.field_2381) {
         var3 = 3;
      }

      if (var1 == this.field_2919.field_922.field_2381) {
         var3 = 4;
      }

      if (var1 == this.field_2919.field_1386.field_2381) {
         var3 = 5;
      }

      if (var3 >= 0) {
         this.field_1961[var3] = var2;
      }
   }

   @Override
   public void method_1114() {
      for (int var1 = 0; var1 < 10; var1++) {
         this.field_1961[var1] = false;
      }
   }

   @Override
   public void method_534(Class354 var1) {
      this.field_2082 = 0.0F;
      this.field_2154 = 0.0F;
      this.field_478 = this.field_1961[4];
      this.field_647 = this.field_1961[5];
      if (Class119.field_685 != null) {
         for (int var2 = 0; var2 != Class119.field_685.length; var2++) {
            if (Class119.field_685[var2] != null && (Class119.field_685[var2].getXAxisValue() != -1.0F || Class119.field_685[var2].getYAxisValue() != -1.0F)) {
               this.field_2082 = -Class119.field_685[var2].getXAxisValue();
               if (this.field_2082 > -0.15 && this.field_2082 < 0.15) {
                  this.field_2082 = 0.0F;
               }

               this.field_2154 = -Class119.field_685[var2].getYAxisValue();
               if (this.field_2154 > -0.15 && this.field_2154 < 0.15) {
                  this.field_2154 = 0.0F;
               }

               if (this.field_2082 != 0.0F || this.field_2154 != 0.0F) {
                  return;
               }
            }
         }
      }

      if (this.field_1961[0]) {
         this.field_2154++;
      }

      if (this.field_1961[1]) {
         this.field_2154--;
      }

      if (this.field_1961[2]) {
         this.field_2082++;
      }

      if (this.field_1961[3]) {
         this.field_2082--;
      }
   }
}
