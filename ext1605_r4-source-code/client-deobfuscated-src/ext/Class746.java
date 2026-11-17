package ext;

public class Class746 extends Class755 {
   public Class746(int var1) {
      super(var1);
      this.field_2438 = 1;
   }

   @Override
   public Class334 method_1566(Class334 var1, Class454 var2, Class354 var3) {
      if (var3 instanceof Class404) {
         if (((Class301)var3.field_559).field_1258 > 10) {
            ((Class301)var3.field_559).field_1258 -= 10;
            var2.method_1904(var3, "ext1605.neutralspecial", 1.0F, 1.0F / (field_2073.nextFloat() * 0.4F + 0.8F));
            var2.method_1447(new Class547(var2, var3));
         }
      } else if (var3.field_559.method_1807(Class50.field_2952.field_10)) {
         var2.method_1904(var3, "ext1605.neutralspecial", 1.0F, 1.0F / (field_2073.nextFloat() * 0.4F + 0.8F));
         var2.method_1447(new Class547(var2, var3));
      }

      return var1;
   }
}
