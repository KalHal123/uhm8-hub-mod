package ext;

public class Class322 implements Interface181 {
   private Class334[] field_2155;
   private int field_2816;
   private Class103 field_2551;

   public Class322(Class103 var1, int var2, int var3) {
      this.field_2816 = var2 * var3;
      this.field_2155 = new Class334[this.field_2816];
      this.field_2551 = var1;
   }

   public Class322(Class103 var1, Class334[] var2) {
      this.field_2816 = var2.length;
      this.field_2155 = var2;
      this.field_2551 = var1;
   }

   @Override
   public int method_1574() {
      return this.field_2816;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_2155[var1];
   }

   @Override
   public String method_18() {
      return "Crafting";
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (this.field_2155[var1] != null) {
         if (this.field_2155[var1].field_2326 <= var2) {
            Class334 var4 = this.field_2155[var1];
            this.field_2155[var1] = null;
            this.field_2551.method_314(this);
            return var4;
         }

         Class334 var3 = this.field_2155[var1].method_1502(var2);
         if (this.field_2155[var1].field_2326 == 0) {
            this.field_2155[var1] = null;
         }

         this.field_2551.method_314(this);
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.field_2155[var1] = var2;
      this.field_2551.method_314(this);
   }

   @Override
   public int method_1387() {
      return 64;
   }

   @Override
   public void method_1831() {
   }
}
