package x;

public class Class0105 extends Class0086 {
   private Class0155 a;

   public Class0105(int var1, Class0155 var2) {
      super(var1);
      this.a = var2;
      this.aS = 64;
      this.aR = 1;
   }

   @Override
   public boolean a(Class0124 var1, Class0089 var2, Class0065 var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      }

      var5++;
      Class0312 var8;
      if (this.a == Class0155.c) {
         var8 = Class0312.aE;
      } else {
         var8 = Class0312.aL;
      }

      if (!var8.a(var3, var4, var5, var6)) {
         return false;
      }

      int var9 = Class0118.b((var2.an + 180.0F) * 4.0F / 360.0F - 0.5) & 3;
      byte var10 = 0;
      byte var11 = 0;
      if (var9 == 0) {
         var11 = 1;
      }

      if (var9 == 1) {
         var10 = -1;
      }

      if (var9 == 2) {
         var11 = -1;
      }

      if (var9 == 3) {
         var10 = 1;
      }

      int var12 = (var3.g(var4 - var10, var5, var6 - var11) ? 1 : 0) + (var3.g(var4 - var10, var5 + 1, var6 - var11) ? 1 : 0);
      int var13 = (var3.g(var4 + var10, var5, var6 + var11) ? 1 : 0) + (var3.g(var4 + var10, var5 + 1, var6 + var11) ? 1 : 0);
      boolean var14 = var3.a(var4 - var10, var5, var6 - var11) == var8.ba || var3.a(var4 - var10, var5 + 1, var6 - var11) == var8.ba;
      boolean var15 = var3.a(var4 + var10, var5, var6 + var11) == var8.ba || var3.a(var4 + var10, var5 + 1, var6 + var11) == var8.ba;
      boolean var16 = false;
      if (var14 && !var15) {
         var16 = true;
      } else if (var13 > var12) {
         var16 = true;
      }

      if (var16) {
         var9 = var9 - 1 & 3;
         var9 += 4;
      }

      var3.d(var4, var5, var6, var8.ba);
      var3.b(var4, var5, var6, var9);
      var3.d(var4, var5 + 1, var6, var8.ba);
      var3.b(var4, var5 + 1, var6, var9 + 8);
      var1.a--;
      return true;
   }
}
