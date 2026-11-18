package srv;

public class Class121 extends Class350 {
   private Class111 field_1378;
   private Class384 field_785 = null;

   public Class121(int var1, Class111 var2, Class384 var3) {
      this(var1, var2);
      this.field_785 = var3;
   }

   public Class121(int var1, Class111 var2) {
      super(var1);
      this.field_1378 = var2;
      this.field_1038 = 64;
      this.field_275 = 1;
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      }

      var5++;
      Class371 var8 = this.field_785;
      if (var8 == null) {
         if (this.field_1378 == Class111.field_1200) {
            var8 = Class371.field_9;
         } else {
            var8 = Class371.field_654;
         }
      }

      if (!var8.method_769(var3, var4, var5, var6)) {
         return false;
      }

      int var9 = Class380.method_502((var2.field_909 + 180.0F) * 4.0F / 360.0F - 0.5) & 3;
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

      int var12 = (var3.method_604(var4 - var10, var5, var6 - var11) ? 1 : 0) + (var3.method_604(var4 - var10, var5 + 1, var6 - var11) ? 1 : 0);
      int var13 = (var3.method_604(var4 + var10, var5, var6 + var11) ? 1 : 0) + (var3.method_604(var4 + var10, var5 + 1, var6 + var11) ? 1 : 0);
      boolean var14 = var3.method_813(var4 - var10, var5, var6 - var11) == var8.field_1379
         || var3.method_813(var4 - var10, var5 + 1, var6 - var11) == var8.field_1379;
      boolean var15 = var3.method_813(var4 + var10, var5, var6 + var11) == var8.field_1379
         || var3.method_813(var4 + var10, var5 + 1, var6 + var11) == var8.field_1379;
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

      var3.method_226(var4, var5, var6, var8.field_1379);
      var3.method_489(var4, var5, var6, var9);
      var3.method_226(var4, var5 + 1, var6, var8.field_1379);
      var3.method_489(var4, var5 + 1, var6, var9 + 8);
      var1.field_1497--;
      return true;
   }
}
