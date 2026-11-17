package ext;

public class Class720 implements Interface215 {
   private Class145 field_2037 = Class601.method_1236();
   private double field_2649;
   private double field_1566;
   private double field_1215;

   @Override
   public void method_564(double var1, double var3, double var5) {
      this.field_2649 = var1;
      this.field_1566 = var3;
      this.field_1215 = var5;
   }

   public boolean method_957(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.field_2037
         .method_1049(
            var1 - this.field_2649, var3 - this.field_1566, var5 - this.field_1215, var7 - this.field_2649, var9 - this.field_1566, var11 - this.field_1215
         );
   }

   @Override
   public boolean method_570(Class630 var1) {
      return this.method_957(var1.field_2118, var1.field_946, var1.field_1714, var1.field_1702, var1.field_3132, var1.field_858);
   }
}
