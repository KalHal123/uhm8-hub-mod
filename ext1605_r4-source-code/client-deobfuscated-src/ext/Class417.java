package ext;

public class Class417 implements Interface181 {
   public Class334[] field_125;
   private int field_1235;
   private Class658 field_1776;

   public Class417(Class658 var1, int var2, int var3) {
      this.field_1235 = var2 * var3;
      this.field_125 = new Class334[this.field_1235];
      this.field_1776 = var1;
   }

   public Class417(Class658 var1, Class334[] var2) {
      this.field_1235 = var2.length;
      this.field_125 = var2;
      this.field_1776 = var1;
   }

   @Override
   public int method_1574() {
      return this.field_1235;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_125[var1];
   }

   @Override
   public String method_18() {
      return "Crafting";
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (this.field_125[var1] != null) {
         if (this.field_125[var1].field_2326 <= var2) {
            Class334 var4 = this.field_125[var1];
            this.field_125[var1] = null;
            this.field_1776.method_314(this);
            return var4;
         }

         Class334 var3 = this.field_125[var1].method_1502(var2);
         if (this.field_125[var1].field_2326 == 0) {
            this.field_125[var1] = null;
         }

         this.field_1776.method_314(this);
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.method_1882(var1, var2, true);
   }

   public void method_1882(int var1, Class334 var2, boolean var3) {
      this.field_125[var1] = var2;
      if (var3) {
         this.field_1776.method_314(this);
      }
   }

   @Override
   public int method_1387() {
      return 1000;
   }

   @Override
   public void method_1831() {
      this.field_1776.method_314(this);
   }
}
