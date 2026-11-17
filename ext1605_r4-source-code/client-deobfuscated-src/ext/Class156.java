package ext;

public class Class156 implements Interface181 {
   private String field_1742;
   private Interface181 field_2092;
   private Interface181 field_1410;

   public Class156(String var1, Interface181 var2, Interface181 var3) {
      this.field_1742 = var1;
      this.field_2092 = var2;
      this.field_1410 = var3;
   }

   @Override
   public int method_1574() {
      return this.field_2092.method_1574() + this.field_1410.method_1574();
   }

   @Override
   public String method_18() {
      return this.field_1742;
   }

   @Override
   public Class334 method_1416(int var1) {
      return var1 >= this.field_2092.method_1574() ? this.field_1410.method_1416(var1 - this.field_2092.method_1574()) : this.field_2092.method_1416(var1);
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      return var1 >= this.field_2092.method_1574()
         ? this.field_1410.method_485(var1 - this.field_2092.method_1574(), var2)
         : this.field_2092.method_485(var1, var2);
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      if (var1 >= this.field_2092.method_1574()) {
         this.field_1410.method_708(var1 - this.field_2092.method_1574(), var2);
      } else {
         this.field_2092.method_708(var1, var2);
      }
   }

   @Override
   public int method_1387() {
      return this.field_2092.method_1387();
   }

   @Override
   public void method_1831() {
      this.field_2092.method_1831();
      this.field_1410.method_1831();
   }
}
