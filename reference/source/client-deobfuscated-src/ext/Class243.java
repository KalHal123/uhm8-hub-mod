package ext;

public class Class243 extends Class186 {
   public String[] field_585 = new String[]{"", "", "", ""};
   public int field_2581 = -1;

   @Override
   public void method_1623(Class686 var1) {
      super.method_1623(var1);
      var1.method_375("Text1", this.field_585[0]);
      var1.method_375("Text2", this.field_585[1]);
      var1.method_375("Text3", this.field_585[2]);
      var1.method_375("Text4", this.field_585[3]);
   }

   @Override
   public void method_434(Class686 var1) {
      super.method_434(var1);

      for (int var2 = 0; var2 < 4; var2++) {
         this.field_585[var2] = var1.method_1087("Text" + (var2 + 1));
         if (this.field_585[var2].length() > 15) {
            this.field_585[var2] = this.field_585[var2].substring(0, 15);
         }
      }
   }
}
