package x;

public class Class0368 extends Class0086 {
   public Class0368(int var1) {
      super(var1);
      this.aS = 64;
   }

   @Override
   public boolean a(Class0124 var1, Class0089 var2, Class0065 var3, int var4, int var5, int var6, int var7) {
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

      Class0237 var9 = new Class0237(var3, var4, var5, var6, var8);
      if (var9.i()) {
         var3.a(var9);
         var1.a--;
      }

      return true;
   }
}
