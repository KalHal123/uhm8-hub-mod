package srv;

public class Class171 extends Class66 implements Interface327 {
   private Class150[] field_267 = new Class150[36];

   @Override
   public int method_214() {
      return 27;
   }

   @Override
   public Class150 method_908(int var1) {
      return this.field_267[var1];
   }

   public void method_351(int var1, Class150 var2) {
      this.field_267[var1] = var2;
      if (var2 != null && var2.field_1497 > this.method_624()) {
         var2.field_1497 = this.method_624();
      }

      this.method_766();
   }

   @Override
   public void method_816(Class100 var1) {
      super.method_816(var1);
      Class310 var2 = var1.method_836("Items");
      this.field_267 = new Class150[this.method_214()];

      for (int var3 = 0; var3 < var2.method_622(); var3++) {
         Class100 var4 = (Class100)var2.method_542(var3);
         int var5 = var4.method_561("Slot") & 255;
         if (var5 >= 0 && var5 < this.field_267.length) {
            this.field_267[var5] = new Class150(var4);
         }
      }
   }

   @Override
   public void method_878(Class100 var1) {
      super.method_878(var1);
      Class310 var2 = new Class310();

      for (int var3 = 0; var3 < this.field_267.length; var3++) {
         if (this.field_267[var3] != null) {
            Class100 var4 = new Class100();
            var4.method_1003("Slot", (byte)var3);
            this.field_267[var3].method_110(var4);
            var2.method_162(var4);
         }
      }

      var1.method_280("Items", var2);
   }

   public int method_624() {
      return 64;
   }
}
