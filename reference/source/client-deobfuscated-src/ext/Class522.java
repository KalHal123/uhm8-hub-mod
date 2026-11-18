package ext;

public class Class522 extends Class755 {
   private Class160 field_1460;
   private Class604 field_164 = null;

   public Class522(int var1, Class160 var2, Class604 var3) {
      this(var1, var2);
      this.field_164 = var3;
   }

   public Class522(int var1, Class160 var2) {
      super(var1);
      this.field_1460 = var2;
      this.field_945 = 64;
      this.field_2438 = 1;
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      }

      var5++;
      Class108 var8 = this.field_164;
      if (var8 == null) {
         if (this.field_1460 == Class160.field_265) {
            var8 = Class108.field_1403;
         } else {
            var8 = Class108.field_1979;
         }
      }

      if (!var8.method_432(var3, var4, var5, var6)) {
         return false;
      }

      int var9 = Class469.method_468((var2.field_1661 + 180.0F) * 4.0F / 360.0F - 0.5) & 3;
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

      int var12 = (var3.method_768(var4 - var10, var5, var6 - var11) ? 1 : 0) + (var3.method_768(var4 - var10, var5 + 1, var6 - var11) ? 1 : 0);
      int var13 = (var3.method_768(var4 + var10, var5, var6 + var11) ? 1 : 0) + (var3.method_768(var4 + var10, var5 + 1, var6 + var11) ? 1 : 0);
      boolean var14 = var3.method_197(var4 - var10, var5, var6 - var11) == var8.field_2151
         || var3.method_197(var4 - var10, var5 + 1, var6 - var11) == var8.field_2151;
      boolean var15 = var3.method_197(var4 + var10, var5, var6 + var11) == var8.field_2151
         || var3.method_197(var4 + var10, var5 + 1, var6 + var11) == var8.field_2151;
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

      var3.method_1481(var4, var5, var6, var8.field_2151);
      var3.method_518(var4, var5, var6, var9);
      var3.method_1481(var4, var5 + 1, var6, var8.field_2151);
      var3.method_518(var4, var5 + 1, var6, var9 + 8);
      var1.field_2326--;
      return true;
   }
}
