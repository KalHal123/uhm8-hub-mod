package x;

public class Class0108 extends Class0086 {
   public Class0108(int var1) {
      super(var1);
   }

   @Override
   public boolean a(Class0124 var1, Class0089 var2, Class0065 var3, int var4, int var5, int var6, int var7) {
      if (var7 == 0) {
         var5--;
      }

      if (var7 == 1) {
         var5++;
      }

      if (var7 == 2) {
         var6--;
      }

      if (var7 == 3) {
         var6++;
      }

      if (var7 == 4) {
         var4--;
      }

      if (var7 == 5) {
         var4++;
      }

      if (var3.a(var4, var5, var6) != 0) {
         return false;
      }

      if (Class0312.av.a(var3, var4, var5, var6)) {
         var1.a--;
         var3.d(var4, var5, var6, Class0312.av.ba);
      }

      return true;
   }
}
