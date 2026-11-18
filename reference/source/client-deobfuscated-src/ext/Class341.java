package ext;

public class Class341 extends Class265 {
   private Class348 field_96;
   private int field_1903 = 0;

   public Class341(Class348 var1) {
      this.field_96 = var1;
   }

   @Override
   protected void method_437(char var1, int var2) {
   }

   @Override
   public void method_836() {
      this.field_577.clear();
   }

   @Override
   public void method_1414() {
      this.field_1903++;
      if (this.field_1903 % 20 == 0) {
         this.field_96.method_1519(new Class393());
      }

      if (this.field_96 != null) {
         this.field_96.method_458();
      }
   }

   @Override
   protected void method_1445(Class423 var1) {
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1784(0.0F);
      this.method_1491(this.field_1683, "Downloading terrain", this.field_2345 / 2, this.field_562 / 2 - 50, 16777215);
      super.method_1938(var1, var2, var3);
   }
}
