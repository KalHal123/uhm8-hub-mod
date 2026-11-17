package srv;

public class Class53 extends Class350 {
   public Class53(int var1) {
      super(var1);
      this.field_1038 = 64;
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
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

      Class364 var9 = new Class364(var3, var4, var5, var6, var8);
      if (var9.method_216()) {
         var3.method_237(var9);
         var1.field_1497--;
      }

      return true;
   }
}
