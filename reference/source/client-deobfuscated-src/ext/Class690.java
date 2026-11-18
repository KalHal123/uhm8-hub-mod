package ext;

public class Class690 extends Class265 {
   private Class265 field_251;

   public Class690(Class265 var1) {
      this.field_251 = var1;
   }

   @Override
   public void method_836() {
      super.method_836();
      this.field_577.clear();
      this.field_577.add(new Class423(0, this.field_2345 / 2 - 100, this.field_562 / 4 + 120 + 12, "Done"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_2254 == 0) {
         this.field_3013.method_1290(this.field_251);
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      String var4 = "ExtensionLoader 16.05_20#";
      Class254.method_773(
         this.field_1683,
         var4,
         new Class187(this.field_3013.field_2517, this.field_3013.field_2477).method_884() - this.field_1683.method_962(var4) - 2,
         2,
         14737632
      );
      this.method_1491(this.field_1683, "Extensions loaded:", this.field_2345 / 2, 20, 16777215);

      for (int var5 = 0; var5 < Class3.method_1418().size(); var5++) {
         this.field_1683.method_1870("- " + Class3.method_1418().get(var5).toString(), 20, 60 + var5 * 16, 16777215);
      }

      super.method_1938(var1, var2, var3);
   }
}
