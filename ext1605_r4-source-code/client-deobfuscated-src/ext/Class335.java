package ext;

public class Class335 extends Class265 {
   private Class265 field_29;
   private String field_1405;
   private String field_1516;
   private int field_1174;

   public Class335(Class265 var1, String var2, String var3, int var4) {
      this.field_29 = var1;
      this.field_1405 = var2;
      this.field_1516 = var3;
      this.field_1174 = var4;
   }

   @Override
   public void method_836() {
      this.field_577.add(new Class331(0, this.field_2345 / 2 - 155 + 0, this.field_562 / 6 + 96, "Yes"));
      this.field_577.add(new Class331(1, this.field_2345 / 2 - 155 + 160, this.field_562 / 6 + 96, "No"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      this.field_29.method_1229(var1.field_2254 == 0, this.field_1174);
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, this.field_1405, this.field_2345 / 2, 70, 16777215);
      this.method_1491(this.field_1683, this.field_1516, this.field_2345 / 2, 90, 16777215);
      super.method_1938(var1, var2, var3);
   }
}
