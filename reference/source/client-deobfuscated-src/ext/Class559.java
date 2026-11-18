package ext;

public class Class559 implements Interface181 {
   public Class334[] field_2227 = new Class334[3];
   public Class658 field_515 = null;

   public Class559(Class658 var1) {
      this.field_515 = var1;
   }

   @Override
   public int method_1574() {
      return 1;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_2227[var1];
   }

   @Override
   public String method_18() {
      return "Result";
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (this.field_2227[var1] != null) {
         Class334 var3 = this.field_2227[var1];
         this.field_2227[var1] = null;
         this.field_515.method_314(this);
         return var3;
      } else {
         this.field_515.method_314(this);
         return null;
      }
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.field_2227[var1] = var2;
   }

   @Override
   public int method_1387() {
      return 10000;
   }

   @Override
   public void method_1831() {
   }
}
