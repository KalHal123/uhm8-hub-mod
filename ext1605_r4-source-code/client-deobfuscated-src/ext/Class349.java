package ext;

public class Class349 {
   private Interface698 field_1705;
   private Class530 field_2860 = new Class530();
   private Class738 field_2567 = new Class738();
   private Class709[] field_2333 = new Class709[32];

   public Class349(Interface698 var1) {
      this.field_1705 = var1;
   }

   public Class585 method_1134(Class359 var1, Class359 var2, float var3) {
      return this.method_300(var1, var2.field_1417, var2.field_235.field_946, var2.field_2013, var3);
   }

   public Class585 method_921(Class359 var1, int var2, int var3, int var4, float var5) {
      return this.method_300(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, var5);
   }

   private Class585 method_300(Class359 var1, double var2, double var4, double var6, float var8) {
      this.field_2860.method_111();
      this.field_2567.method_1415();
      Class709 var9 = this.method_1060(
         Class469.method_468(var1.field_235.field_2118), Class469.method_468(var1.field_235.field_946), Class469.method_468(var1.field_235.field_1714)
      );
      Class709 var10 = this.method_1060(
         Class469.method_468(var2 - var1.field_811 / 2.0F), Class469.method_468(var4), Class469.method_468(var6 - var1.field_811 / 2.0F)
      );
      Class709 var11 = new Class709(
         Class469.method_893(var1.field_811 + 1.0F), Class469.method_893(var1.field_1443 + 1.0F), Class469.method_893(var1.field_811 + 1.0F)
      );
      return this.method_998(var1, var9, var10, var11, var8);
   }

   private Class585 method_998(Class359 var1, Class709 var2, Class709 var3, Class709 var4, float var5) {
      var2.field_2998 = 0.0F;
      var2.field_327 = var2.method_246(var3);
      var2.field_2221 = var2.field_327;
      this.field_2860.method_111();
      this.field_2860.method_1561(var2);
      Class709 var6 = var2;

      while (!this.field_2860.method_466()) {
         Class709 var7 = this.field_2860.method_803();
         if (var7.field_3070 == var3.field_3070) {
            return this.method_1115(var2, var3);
         }

         if (var7.method_246(var3) < var6.method_246(var3)) {
            var6 = var7;
         }

         var7.field_2332 = true;
         int var8 = this.method_92(var1, var7, var4, var3, var5);

         for (int var9 = 0; var9 < var8; var9++) {
            Class709 var10 = this.field_2333[var9];
            float var11 = var7.field_2998 + var7.method_246(var10);
            if (!var10.method_1071() || var11 < var10.field_2998) {
               var10.field_1458 = var7;
               var10.field_2998 = var11;
               var10.field_327 = var10.method_246(var3);
               if (var10.method_1071()) {
                  this.field_2860.method_653(var10, var10.field_2998 + var10.field_327);
               } else {
                  var10.field_2221 = var10.field_2998 + var10.field_327;
                  this.field_2860.method_1561(var10);
               }
            }
         }
      }

      return var6 == var2 ? null : this.method_1115(var2, var6);
   }

   private int method_92(Class359 var1, Class709 var2, Class709 var3, Class709 var4, float var5) {
      int var6 = 0;
      byte var7 = 0;
      if (this.method_754(var1, var2.field_2460, var2.field_2742 + 1, var2.field_2997, var3) > 0) {
         var7 = 1;
      }

      Class709 var8 = this.method_152(var1, var2.field_2460, var2.field_2742, var2.field_2997 + 1, var3, var7);
      Class709 var9 = this.method_152(var1, var2.field_2460 - 1, var2.field_2742, var2.field_2997, var3, var7);
      Class709 var10 = this.method_152(var1, var2.field_2460 + 1, var2.field_2742, var2.field_2997, var3, var7);
      Class709 var11 = this.method_152(var1, var2.field_2460, var2.field_2742, var2.field_2997 - 1, var3, var7);
      if (var8 != null && !var8.field_2332 && var8.method_246(var4) < var5) {
         this.field_2333[var6++] = var8;
      }

      if (var9 != null && !var9.field_2332 && var9.method_246(var4) < var5) {
         this.field_2333[var6++] = var9;
      }

      if (var10 != null && !var10.field_2332 && var10.method_246(var4) < var5) {
         this.field_2333[var6++] = var10;
      }

      if (var11 != null && !var11.field_2332 && var11.method_246(var4) < var5) {
         this.field_2333[var6++] = var11;
      }

      return var6;
   }

   private Class709 method_152(Class359 var1, int var2, int var3, int var4, Class709 var5, int var6) {
      Class709 var7 = null;
      if (this.method_754(var1, var2, var3, var4, var5) > 0) {
         var7 = this.method_1060(var2, var3, var4);
      }

      if (var7 == null && this.method_754(var1, var2, var3 + var6, var4, var5) > 0) {
         var7 = this.method_1060(var2, var3 + var6, var4);
         var3 += var6;
      }

      if (var7 != null) {
         int var8 = 0;
         boolean var10 = false;

         int var9;
         while (var3 > 0 && (var9 = this.method_754(var1, var2, var3 - 1, var4, var5)) > 0) {
            if (var9 < 0) {
               return null;
            }

            if (++var8 >= 4) {
               return null;
            }

            var3--;
         }

         if (var3 > 0) {
            var7 = this.method_1060(var2, var3, var4);
         }
      }

      return var7;
   }

   private final Class709 method_1060(int var1, int var2, int var3) {
      int var4 = var1 | var2 << 10 | var3 << 20;
      Class709 var5 = (Class709)this.field_2567.method_911(var4);
      if (var5 == null) {
         var5 = new Class709(var1, var2, var3);
         this.field_2567.method_1539(var4, var5);
      }

      return var5;
   }

   private int method_754(Class359 var1, int var2, int var3, int var4, Class709 var5) {
      for (int var6 = var2; var6 < var2 + var5.field_2460; var6++) {
         for (int var7 = var3; var7 < var3 + var5.field_2742; var7++) {
            for (int var8 = var4; var8 < var4 + var5.field_2997; var8++) {
               Class160 var9 = this.field_1705.method_1286(var2, var3, var4);
               if (var9.method_1552()) {
                  return 0;
               }

               if (var9 == Class160.field_1413 || var9 == Class160.field_3120) {
                  return -1;
               }
            }
         }
      }

      return 1;
   }

   private Class585 method_1115(Class709 var1, Class709 var2) {
      int var3 = 1;

      for (Class709 var4 = var2; var4.field_1458 != null; var4 = var4.field_1458) {
         var3++;
      }

      Class709[] var5 = new Class709[var3];
      Class709 var7 = var2;

      for (var5[--var3] = var2; var7.field_1458 != null; var5[--var3] = var7) {
         var7 = var7.field_1458;
      }

      return new Class585(var5);
   }
}
