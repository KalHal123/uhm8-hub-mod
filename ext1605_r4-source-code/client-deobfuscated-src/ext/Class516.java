package ext;

public class Class516 extends Class265 {
   private Class265 field_2030;
   protected String field_1886 = "Controls";
   private Class693 field_1746;
   private int field_280 = -1;

   public Class516(Class265 var1, Class693 var2) {
      this.field_2030 = var1;
      this.field_1746 = var2;
   }

   @Override
   public void method_836() {
      this.field_577.clear();

      for (int var1 = 0; var1 < this.field_1746.field_1038.length; var1++) {
         this.field_577
            .add(new Class331(var1, this.field_2345 / 2 - 155 + var1 % 2 * 160, this.field_562 / 6 + 24 * (var1 >> 1), this.field_1746.method_1584(var1)));
      }

      this.field_577.add(new Class423(200, this.field_2345 / 2 - 100, this.field_562 / 6 + 168, "Done"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      for (int var2 = 0; var2 < this.field_1746.field_1038.length; var2++) {
         this.field_577.get(var2).field_1027 = this.field_1746.method_1584(var2);
      }

      if (var1.field_2254 == 200) {
         this.field_3013.method_1290(this.field_2030);
      } else {
         this.field_280 = var1.field_2254;
         var1.field_1027 = "> " + this.field_1746.method_1584(var1.field_2254) + " <";
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
      if (this.field_280 >= 0) {
         this.field_1746.method_795(this.field_280, var2);
         this.field_577.get(this.field_280).field_1027 = this.field_1746.method_1584(this.field_280);
         this.field_280 = -1;
      } else {
         super.method_437(var1, var2);
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, this.field_1886, this.field_2345 / 2, 20, 16777215);
      super.method_1938(var1, var2, var3);
   }
}
