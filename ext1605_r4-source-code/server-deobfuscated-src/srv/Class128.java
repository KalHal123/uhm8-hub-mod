package srv;

public class Class128 {
   private Interface351 field_747;
   private Class295 field_221 = new Class295();
   private Class326 field_109 = new Class326();
   private Class93[] field_1503 = new Class93[32];

   public Class128(Interface351 var1) {
      this.field_747 = var1;
   }

   public Class16 method_903(Class252 var1, Class252 var2, float var3) {
      return this.method_794(var1, var2.field_1324, var2.field_106.field_817, var2.field_1321, var3);
   }

   public Class16 method_81(Class252 var1, int var2, int var3, int var4, float var5) {
      return this.method_794(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, var5);
   }

   private Class16 method_794(Class252 var1, double var2, double var4, double var6, float var8) {
      this.field_221.method_465();
      this.field_109.method_953();
      Class93 var9 = this.method_608(
         Class380.method_502(var1.field_106.field_1397), Class380.method_502(var1.field_106.field_817), Class380.method_502(var1.field_106.field_601)
      );
      Class93 var10 = this.method_608(
         Class380.method_502(var2 - var1.field_595 / 2.0F), Class380.method_502(var4), Class380.method_502(var6 - var1.field_595 / 2.0F)
      );
      Class93 var11 = new Class93(
         Class380.method_827(var1.field_595 + 1.0F), Class380.method_827(var1.field_907 + 1.0F), Class380.method_827(var1.field_595 + 1.0F)
      );
      return this.method_593(var1, var9, var10, var11, var8);
   }

   private Class16 method_593(Class252 var1, Class93 var2, Class93 var3, Class93 var4, float var5) {
      var2.field_1081 = 0.0F;
      var2.field_133 = var2.method_533(var3);
      var2.field_343 = var2.field_133;
      this.field_221.method_465();
      this.field_221.method_655(var2);
      Class93 var6 = var2;

      while (!this.field_221.method_753()) {
         Class93 var7 = this.field_221.method_820();
         if (var7.field_1596 == var3.field_1596) {
            return this.method_461(var2, var3);
         }

         if (var7.method_533(var3) < var6.method_533(var3)) {
            var6 = var7;
         }

         var7.field_48 = true;
         int var8 = this.method_617(var1, var7, var4, var3, var5);

         for (int var9 = 0; var9 < var8; var9++) {
            Class93 var10 = this.field_1503[var9];
            float var11 = var7.field_1081 + var7.method_533(var10);
            if (!var10.method_183() || var11 < var10.field_1081) {
               var10.field_1210 = var7;
               var10.field_1081 = var11;
               var10.field_133 = var10.method_533(var3);
               if (var10.method_183()) {
                  this.field_221.method_409(var10, var10.field_1081 + var10.field_133);
               } else {
                  var10.field_343 = var10.field_1081 + var10.field_133;
                  this.field_221.method_655(var10);
               }
            }
         }
      }

      return var6 == var2 ? null : this.method_461(var2, var6);
   }

   private int method_617(Class252 var1, Class93 var2, Class93 var3, Class93 var4, float var5) {
      int var6 = 0;
      byte var7 = 0;
      if (this.method_504(var1, var2.field_44, var2.field_249 + 1, var2.field_470, var3) > 0) {
         var7 = 1;
      }

      Class93 var8 = this.method_264(var1, var2.field_44, var2.field_249, var2.field_470 + 1, var3, var7);
      Class93 var9 = this.method_264(var1, var2.field_44 - 1, var2.field_249, var2.field_470, var3, var7);
      Class93 var10 = this.method_264(var1, var2.field_44 + 1, var2.field_249, var2.field_470, var3, var7);
      Class93 var11 = this.method_264(var1, var2.field_44, var2.field_249, var2.field_470 - 1, var3, var7);
      if (var8 != null && !var8.field_48 && var8.method_533(var4) < var5) {
         this.field_1503[var6++] = var8;
      }

      if (var9 != null && !var9.field_48 && var9.method_533(var4) < var5) {
         this.field_1503[var6++] = var9;
      }

      if (var10 != null && !var10.field_48 && var10.method_533(var4) < var5) {
         this.field_1503[var6++] = var10;
      }

      if (var11 != null && !var11.field_48 && var11.method_533(var4) < var5) {
         this.field_1503[var6++] = var11;
      }

      return var6;
   }

   private Class93 method_264(Class252 var1, int var2, int var3, int var4, Class93 var5, int var6) {
      Class93 var7 = null;
      if (this.method_504(var1, var2, var3, var4, var5) > 0) {
         var7 = this.method_608(var2, var3, var4);
      }

      if (var7 == null && this.method_504(var1, var2, var3 + var6, var4, var5) > 0) {
         var7 = this.method_608(var2, var3 + var6, var4);
         var3 += var6;
      }

      if (var7 != null) {
         int var8 = 0;
         boolean var10 = false;

         int var9;
         while (var3 > 0 && (var9 = this.method_504(var1, var2, var3 - 1, var4, var5)) > 0) {
            if (var9 < 0) {
               return null;
            }

            if (++var8 >= 4) {
               return null;
            }

            var3--;
         }

         if (var3 > 0) {
            var7 = this.method_608(var2, var3, var4);
         }
      }

      return var7;
   }

   private final Class93 method_608(int var1, int var2, int var3) {
      int var4 = var1 | var2 << 10 | var3 << 20;
      Class93 var5 = (Class93)this.field_109.method_17(var4);
      if (var5 == null) {
         var5 = new Class93(var1, var2, var3);
         this.field_109.method_120(var4, var5);
      }

      return var5;
   }

   private int method_504(Class252 var1, int var2, int var3, int var4, Class93 var5) {
      for (int var6 = var2; var6 < var2 + var5.field_44; var6++) {
         for (int var7 = var3; var7 < var3 + var5.field_249; var7++) {
            for (int var8 = var4; var8 < var4 + var5.field_470; var8++) {
               Class111 var9 = this.field_747.method_149(var2, var3, var4);
               if (var9.method_330()) {
                  return 0;
               }

               if (var9 == Class111.field_1394 || var9 == Class111.field_306) {
                  return -1;
               }
            }
         }
      }

      return 1;
   }

   private Class16 method_461(Class93 var1, Class93 var2) {
      int var3 = 1;

      for (Class93 var4 = var2; var4.field_1210 != null; var4 = var4.field_1210) {
         var3++;
      }

      Class93[] var5 = new Class93[var3];
      Class93 var7 = var2;

      for (var5[--var3] = var2; var7.field_1210 != null; var5[--var3] = var7) {
         var7 = var7.field_1210;
      }

      return new Class16(var5);
   }
}
