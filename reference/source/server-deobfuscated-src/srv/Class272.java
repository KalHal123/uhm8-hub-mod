package srv;

public class Class272 extends Class66 {
   public String[] field_281 = new String[]{"", "", "", ""};
   public int field_1042 = -1;

   @Override
   public void method_878(Class100 var1) {
      super.method_878(var1);
      var1.method_152("Text1", this.field_281[0]);
      var1.method_152("Text2", this.field_281[1]);
      var1.method_152("Text3", this.field_281[2]);
      var1.method_152("Text4", this.field_281[3]);
   }

   @Override
   public void method_816(Class100 var1) {
      super.method_816(var1);

      for (int var2 = 0; var2 < 4; var2++) {
         this.field_281[var2] = var1.method_219("Text" + (var2 + 1));
         if (this.field_281[var2].length() > 15) {
            this.field_281[var2] = this.field_281[var2].substring(0, 15);
         }
      }
   }
}
