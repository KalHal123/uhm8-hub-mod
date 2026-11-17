package ext;

public class Class136 extends Class669 {
   Class239 field_1491;
   int field_30 = 0;
   int field_3121 = 0;
   public boolean field_2388 = true;

   public Class136(Class454 var1, Class239 var2) {
      super(var1, var2.field_198);
      this.method_253(
         var2.field_1960.get(0).field_88,
         var2.field_1960.get(0).field_730,
         var2.field_1960.get(0).field_2240,
         (float)var2.field_1960.get(0).field_1049,
         (float)var2.field_1960.get(0).field_622
      );
      this.field_1491 = var2;
      this.field_838 = 0.0F;
      this.field_2827 = 0.0F;
      this.field_236 = true;
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      return false;
   }

   @Override
   public void method_1765(Class359 var1) {
   }

   @Override
   public void method_22() {
      if (this.field_30 < this.field_1491.field_1960.size()) {
         Class677 var1 = this.field_1491.field_1960.get(this.field_30);
         this.method_253(var1.field_88, var1.field_730 - 1.62F, var1.field_2240, (float)var1.field_1049, (float)var1.field_622);
         this.field_1747 = (float)var1.field_2899;
         this.field_937 = (float)var1.field_2268;
         this.field_2501 = 0.0;
         if (this.field_1491.field_111.size() > 0
            && this.field_1491.field_111.size() > this.field_3121
            && this.field_1491.field_111.get(this.field_3121).field_2076 == this.field_30) {
            this.field_1491.field_111.get(this.field_3121++).method_1726(this);
         }

         this.field_30++;
      } else {
         this.method_382();
      }

      super.method_22();
   }

   public void method_382() {
      this.field_2388 = false;
      this.field_1662 = true;
      this.method_379(this);
      this.method_656();
      this.field_1468.method_623(this);
   }
}
