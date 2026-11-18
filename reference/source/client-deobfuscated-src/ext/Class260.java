package ext;

public class Class260 implements Interface181 {
   private Class334[] field_2991 = new Class334[1];

   @Override
   public int method_1574() {
      return 1;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_2991[var1];
   }

   @Override
   public String method_18() {
      return "Result";
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (this.field_2991[var1] != null) {
         Class334 var3 = this.field_2991[var1];
         this.field_2991[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.field_2991[var1] = var2;
   }

   @Override
   public int method_1387() {
      return 64;
   }

   @Override
   public void method_1831() {
   }
}
