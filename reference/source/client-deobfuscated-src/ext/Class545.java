package ext;

public class Class545 extends Class103 {
   public Class735 field_312 = new Class735(this, 3, 3);
   public Class369 field_1232 = new Class369();
   public int field_629 = 0;

   @Override
   public void method_314(Interface181 var1) {
      this.field_629 = 0;

      for (int var2 = 0; var2 < 3; var2++) {
         for (int var3 = 0; var3 < 3; var3++) {
            Class334 var4 = this.field_312.method_1416(var2 + var3 * 3);
            if (var4 != null) {
               this.field_629 = this.field_629 + var4.method_1798() * var4.field_2326;
            }
         }
      }
   }

   public void method_6(Class354 var1) {
      Class267 var2 = var1.field_559;
      if (var2.field_1377 != null) {
         var1.method_1771(var2.field_1377);
      }

      for (int var3 = 0; var3 < 9; var3++) {
         Class334 var4 = this.field_312.method_1416(var3);
         if (var4 != null) {
            var1.method_1771(var4);
         }
      }
   }
}
