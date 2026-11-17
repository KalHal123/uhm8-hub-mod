package ext;

public class Class384 extends Class265 {
   private String field_953;
   private String field_553;

   public Class384(String var1, String var2) {
      this.field_953 = var1;
      this.field_553 = var2;
   }

   @Override
   public void method_1414() {
   }

   @Override
   protected void method_437(char var1, int var2) {
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class423(0, this.field_2345 / 2 - 100, this.field_562 / 4 + 120 + 12, "Back to title screen"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_2254 == 0) {
         this.field_3013.method_1290(new Class373());
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      Class254.method_421(0, this.field_562 / 4 * 3, this.field_2345, this.field_562, -2147153098, -2146364641);
      this.method_1491(this.field_1683, this.field_953, this.field_2345 / 2, this.field_562 / 2 - 50, 16777215);
      String[] var4 = this.field_553.split("\n");
      int var5 = 0;

      for (String var9 : var4) {
         this.method_1491(this.field_1683, var9, this.field_2345 / 2, this.field_562 / 2 - 10 + var5 * 12, 16777215);
         var5++;
      }

      super.method_1938(var1, var2, var3);
   }
}
