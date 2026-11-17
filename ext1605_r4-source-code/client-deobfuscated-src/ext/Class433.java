package ext;

public class Class433 extends Class755 {
   public Class433(int var1) {
      super(var1);
      this.field_945 = 64;
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
      if (var7 == 0) {
         return false;
      }

      if (var7 == 1) {
         return false;
      }

      byte var8 = 0;
      if (var7 == 4) {
         var8 = 1;
      }

      if (var7 == 3) {
         var8 = 2;
      }

      if (var7 == 5) {
         var8 = 3;
      }

      Class268 var9 = new Class268(var3, var4, var5, var6, var8);
      if (var9.method_89()) {
         var3.method_1447(var9);
         var1.field_2326--;
      }

      return true;
   }
}
