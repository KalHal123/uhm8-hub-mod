package ext;

public class Class109 extends Class755 {
   public Class109(int var1) {
      super(var1);
      this.field_2438 = 1;
      this.field_945 = 64;
   }

   @Override
   public void method_286(Class334 var1, Class377 var2) {
      if (var2 instanceof Class436) {
         Class436 var3 = (Class436)var2;
         if (!var3.field_1095) {
            var3.field_1095 = true;
            var1.field_2326--;
         }
      }
   }

   @Override
   public void method_1935(Class334 var1, Class377 var2) {
      this.method_286(var1, var2);
   }
}
