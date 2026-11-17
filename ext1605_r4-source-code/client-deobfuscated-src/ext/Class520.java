package ext;

public class Class520 extends Class186 implements Interface181 {
   private Class334[] field_302 = new Class334[36];

   @Override
   public int method_1574() {
      return 27;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_302[var1];
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (this.field_302[var1] != null) {
         if (this.field_302[var1].field_2326 <= var2) {
            Class334 var4 = this.field_302[var1];
            this.field_302[var1] = null;
            this.method_430();
            return var4;
         }

         Class334 var3 = this.field_302[var1].method_1502(var2);
         if (this.field_302[var1].field_2326 == 0) {
            this.field_302[var1] = null;
         }

         this.method_430();
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void method_1831() {
      super.method_430();
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.field_302[var1] = var2;
      if (var2 != null && var2.field_2326 > this.method_1387()) {
         var2.field_2326 = this.method_1387();
      }

      this.method_430();
   }

   @Override
   public String method_18() {
      return "Chest";
   }

   @Override
   public void method_434(Class686 var1) {
      super.method_434(var1);
      Class378 var2 = var1.method_1609("Items");
      this.field_302 = new Class334[this.method_1574()];

      for (int var3 = 0; var3 < var2.method_619(); var3++) {
         Class686 var4 = (Class686)var2.method_1557(var3);
         int var5 = var4.method_1913("Slot") & 255;
         if (var5 >= 0 && var5 < this.field_302.length) {
            this.field_302[var5] = new Class334(var4);
         }
      }
   }

   @Override
   public void method_1623(Class686 var1) {
      super.method_1623(var1);
      Class378 var2 = new Class378();

      for (int var3 = 0; var3 < this.field_302.length; var3++) {
         if (this.field_302[var3] != null) {
            Class686 var4 = new Class686();
            var4.method_1567("Slot", (byte)var3);
            this.field_302[var3].method_1589(var4);
            var2.method_1885(var4);
         }
      }

      var1.method_936("Items", var2);
   }

   @Override
   public int method_1387() {
      return 10000;
   }
}
