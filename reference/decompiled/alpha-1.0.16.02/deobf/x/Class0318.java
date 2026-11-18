package x;

public class Class0318 extends Class0086 {
   public Class0318(int var1) {
      super(var1);
      this.aS = 64;
      this.aR = 1;
   }

   @Override
   public boolean a(Class0124 var1, Class0089 var2, Class0065 var3, int var4, int var5, int var6, int var7) {
      if (var7 == 0) {
         return false;
      }

      if (!var3.f(var4, var5, var6).a()) {
         return false;
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

      if (!Class0312.aD.a(var3, var4, var5, var6)) {
         return false;
      }

      if (var7 == 1) {
         var3.b(var4, var5, var6, Class0312.aD.ba, Class0118.b((var2.an + 180.0F) * 16.0F / 360.0F + 0.5) & 15);
      } else {
         var3.b(var4, var5, var6, Class0312.aI.ba, var7);
      }

      var1.a--;
      var2.a((Class0366)var3.b(var4, var5, var6));
      return true;
   }
}
