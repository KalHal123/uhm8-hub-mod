package ext;

import java.util.Random;

public class Class74 implements Interface664 {
   private final Class107 field_16;
   private final Class107 field_669;
   private final Class107 field_2830;

   public Class74(Random var1) {
      this.field_16 = new Class107(var1);
      this.field_669 = new Class107(var1);
      this.field_2830 = new Class107(var1);
   }

   @Override
   public float method_1766() {
      return 1.0F;
   }

   private Class74.Inner453 method_1272(int var1, int var2, int var3, int var4) {
      int var5 = var1 * 5436345 + var2 * -12416265;
      int var6 = var3 * 4256285 + var4 * -82344232;
      double var7 = this.field_669.method_398(var5 / 634.0, var6 / 634.0);
      if (var7 < 0.0) {
         var7 = -var7;
      }

      if (var7 > 1.0) {
         var7 %= 1.0;
      }

      if (var7 < 0.3) {
         return Class74.Inner453.field_2261;
      } else if (var7 < 0.4) {
         return Class74.Inner453.field_1668;
      } else if (var7 < 0.5) {
         return Class74.Inner453.field_1354;
      } else if (var7 < 0.6) {
         return Class74.Inner453.field_1332;
      } else if (var7 < 0.7) {
         return Class74.Inner453.field_126;
      } else if (var7 < 0.8) {
         return Class74.Inner453.field_2006;
      } else {
         return var7 < 0.9 ? Class74.Inner453.field_37 : Class74.Inner453.field_2261;
      }
   }

   private void method_337() {
   }

   private Class74.Inner453[] method_1697(int var1, int var2, int var3) {
      return new Class74.Inner453[]{
         this.method_1272(var1, var2, var3, 0),
         this.method_1272(var1, var2, var3, 1),
         this.method_1272(var1, var2, var3, 2),
         this.method_1272(var1, var2, var3, 3)
      };
   }

   private boolean method_411(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4);
      return var5 != 0 && Class108.field_1221[var5].method_214() && Class108.field_1221[var5].method_916() && Class108.field_1221[var5].method_636();
   }

   private boolean method_1183(Class454 var1, int var2, int var3, int var4) {
      int var5 = 256;

      for (int var6 = 0; var6 < 8; var6++) {
         for (int var7 = 0; var7 < 15; var7++) {
            for (int var8 = 0; var8 < 15; var8++) {
               if (this.method_411(var1, var2 * 16 + var7, var3 + var6, var4 * 16 + var8)) {
                  if (--var5 == 0) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }

   private void method_1501(Class454 var1, int var2, int var3, int var4, int var5) {
      for (int var6 = var4; var6 >= 0; var6--) {
         if (this.method_411(var1, var3, var6, var5)) {
            return;
         }

         var1.method_470(var3, var6, var5, var2);
      }
   }

   private void method_1801(Class454 var1, int var2, int var3, int var4, int var5, int var6, int var7, Class108 var8, int var9, int var10) {
      switch (var9) {
         case 0:
            var2 += 11;
            var3++;
            var4 += 7;
            var2 += var5;
            var3 += var6;
            var4 += var7;
            break;
         case 1:
            var2 += 8;
            var3++;
            var4 += 11;
            var2 -= var7;
            var3 += var6;
            var4 += var5;
            break;
         case 2:
            var2 += 7;
            var3++;
            var4 += 4;
            var2 += var7;
            var3 += var6;
            var4 -= var5;
            break;
         case 3:
            var2 += 4;
            var3++;
            var4 += 8;
            var2 -= var5;
            var3 += var6;
            var4 -= var7;
      }

      var1.method_307(var2, var3, var4, var8.field_2151, var9);
      var1.method_307(var2, var3 + 1, var4, var8.field_2151, var9 + 8 + var10);
   }

   private void method_1404(Class454 var1, int var2, int var3, int var4, int var5, int var6, int var7, Class108 var8, int var9) {
      switch (var9) {
         case 0:
            var2 += 11;
            var3++;
            var4 += 7;
            var2 += var5;
            var3 += var6;
            var4 += var7;
            break;
         case 1:
            var2 += 8;
            var3++;
            var4 += 11;
            var2 -= var7;
            var3 += var6;
            var4 += var5;
            break;
         case 2:
            var2 += 7;
            var3++;
            var4 += 4;
            var2 += var7;
            var3 += var6;
            var4 -= var5;
            break;
         case 3:
            var2 += 4;
            var3++;
            var4 += 8;
            var2 -= var5;
            var3 += var6;
            var4 -= var7;
      }

      var1.method_470(var2, var3, var4, var8.field_2151);
   }

   private void method_310(Class454 var1, int var2, int var3, int var4, Class99 var5) {
      if (!var5.method_367(Class74.class, var2, var4)) {
      }

      int var6 = var2 * 16;
      int var7 = var4 * 16;

      for (int var8 = 7; var8 > 0; var8--) {
         var1.method_470(var6 + 2, var3 + var8, var7 + 2, Class390.field_81.field_2151);
         var1.method_470(var6 + 2, var3 + var8, var7 + 13, Class390.field_81.field_2151);
         var1.method_470(var6 + 13, var3 + var8, var7 + 2, Class390.field_81.field_2151);
         var1.method_470(var6 + 13, var3 + var8, var7 + 13, Class390.field_81.field_2151);
         if (var8 != 7) {
            for (int var9 = 3; var9 <= 12; var9++) {
               int var10 = var9 >= 6 && var9 <= 9 ? 1 : 0;
               if (var10 != 0 || var8 < 5) {
                  var1.method_470(var6 + var9, var3 + var8, var7 + 3 + var10, Class390.field_1892.field_2151);
                  var1.method_470(var6 + var9, var3 + var8, var7 + 12 - var10, Class390.field_1892.field_2151);
               }
            }

            for (int var20 = 4; var20 <= 11; var20++) {
               int var25 = var20 >= 6 && var20 <= 9 ? 1 : 0;
               if (var25 != 0 || var8 < 5) {
                  var1.method_470(var6 + 3 + var25, var3 + var8, var7 + var20, Class390.field_1892.field_2151);
                  var1.method_470(var6 + 12 - var25, var3 + var8, var7 + var20, Class390.field_1892.field_2151);
               }
            }
         }
      }

      for (int var13 = 2; var13 <= 13; var13++) {
         for (int var21 = 2; var21 <= 13; var21++) {
            var1.method_470(var6 + var13, var3, var7 + var21, Class390.field_1825.field_2151);
         }
      }

      for (int var14 = 1; var14 < 15; var14++) {
         for (int var22 = 7; var22 <= 8; var22++) {
            var1.method_470(var6 + var14, var3 + 7, var7 + var22, Class390.field_1583.field_2151);
            var1.method_470(var6 + var22, var3 + 7, var7 + var14, Class390.field_1583.field_2151);
         }
      }

      for (int var15 = 5; var15 <= 10; var15++) {
         for (int var23 = 5; var23 <= 10; var23++) {
            var1.method_470(var6 + var15, var3 + 7, var7 + var23, Class390.field_1583.field_2151);
         }
      }

      for (int var16 = 0; var16 < 4; var16++) {
         var1.method_470(var6 + 4 - var16, var3 + 6, var7 + 6, Class390.field_1583.field_2151);
         var1.method_470(var6 + 4 - var16, var3 + 6, var7 + 9, Class390.field_1583.field_2151);
         var1.method_470(var6 + 11 + var16, var3 + 6, var7 + 6, Class390.field_1583.field_2151);
         var1.method_470(var6 + 11 + var16, var3 + 6, var7 + 9, Class390.field_1583.field_2151);
         var1.method_470(var6 + 6, var3 + 6, var7 + 4 - var16, Class390.field_1583.field_2151);
         var1.method_470(var6 + 9, var3 + 6, var7 + 4 - var16, Class390.field_1583.field_2151);
         var1.method_470(var6 + 6, var3 + 6, var7 + 11 + var16, Class390.field_1583.field_2151);
         var1.method_470(var6 + 9, var3 + 6, var7 + 11 + var16, Class390.field_1583.field_2151);
      }

      var1.method_470(var6 + 4, var3 + 6, var7 + 4, Class390.field_1583.field_2151);
      var1.method_470(var6 + 4, var3 + 6, var7 + 5, Class390.field_1583.field_2151);
      var1.method_470(var6 + 5, var3 + 6, var7 + 4, Class390.field_1583.field_2151);
      var1.method_470(var6 + 11, var3 + 6, var7 + 11, Class390.field_1583.field_2151);
      var1.method_470(var6 + 10, var3 + 6, var7 + 11, Class390.field_1583.field_2151);
      var1.method_470(var6 + 11, var3 + 6, var7 + 10, Class390.field_1583.field_2151);
      var1.method_470(var6 + 11, var3 + 6, var7 + 4, Class390.field_1583.field_2151);
      var1.method_470(var6 + 10, var3 + 6, var7 + 4, Class390.field_1583.field_2151);
      var1.method_470(var6 + 11, var3 + 6, var7 + 5, Class390.field_1583.field_2151);
      var1.method_470(var6 + 4, var3 + 6, var7 + 11, Class390.field_1583.field_2151);
      var1.method_470(var6 + 5, var3 + 6, var7 + 11, Class390.field_1583.field_2151);
      var1.method_470(var6 + 4, var3 + 6, var7 + 10, Class390.field_1583.field_2151);

      for (int var17 = 0; var17 < 3; var17++) {
         var1.method_470(var6 + 3 - var17, var3 + 5, var7 + 5, Class390.field_1583.field_2151);
         var1.method_470(var6 + 3 - var17, var3 + 5, var7 + 10, Class390.field_1583.field_2151);
         var1.method_470(var6 + 12 + var17, var3 + 5, var7 + 5, Class390.field_1583.field_2151);
         var1.method_470(var6 + 12 + var17, var3 + 5, var7 + 10, Class390.field_1583.field_2151);
         var1.method_470(var6 + 5, var3 + 5, var7 + 3 - var17, Class390.field_1583.field_2151);
         var1.method_470(var6 + 10, var3 + 5, var7 + 3 - var17, Class390.field_1583.field_2151);
         var1.method_470(var6 + 5, var3 + 5, var7 + 12 + var17, Class390.field_1583.field_2151);
         var1.method_470(var6 + 10, var3 + 5, var7 + 12 + var17, Class390.field_1583.field_2151);
      }

      for (int var18 = 0; var18 < 2; var18++) {
         var1.method_470(var6 + 4, var3 + 5, var7 + 3 - var18, Class390.field_1583.field_2151);
         var1.method_470(var6 + 3, var3 + 5, var7 + 3 - var18, Class390.field_1583.field_2151);
         var1.method_470(var6 + 3 - var18, var3 + 5, var7 + 4, Class390.field_1583.field_2151);
         var1.method_470(var6 + 3 - var18, var3 + 5, var7 + 3, Class390.field_1583.field_2151);
         var1.method_470(var6 + 11, var3 + 5, var7 + 12 + var18, Class390.field_1583.field_2151);
         var1.method_470(var6 + 12, var3 + 5, var7 + 12 + var18, Class390.field_1583.field_2151);
         var1.method_470(var6 + 12 + var18, var3 + 5, var7 + 11, Class390.field_1583.field_2151);
         var1.method_470(var6 + 12 + var18, var3 + 5, var7 + 12, Class390.field_1583.field_2151);
         var1.method_470(var6 + 4, var3 + 5, var7 + 12 + var18, Class390.field_1583.field_2151);
         var1.method_470(var6 + 3, var3 + 5, var7 + 12 + var18, Class390.field_1583.field_2151);
         var1.method_470(var6 + 3 - var18, var3 + 5, var7 + 11, Class390.field_1583.field_2151);
         var1.method_470(var6 + 3 - var18, var3 + 5, var7 + 12, Class390.field_1583.field_2151);
         var1.method_470(var6 + 11, var3 + 5, var7 + 3 - var18, Class390.field_1583.field_2151);
         var1.method_470(var6 + 12, var3 + 5, var7 + 3 - var18, Class390.field_1583.field_2151);
         var1.method_470(var6 + 12 + var18, var3 + 5, var7 + 4, Class390.field_1583.field_2151);
         var1.method_470(var6 + 12 + var18, var3 + 5, var7 + 3, Class390.field_1583.field_2151);
      }

      int var19 = var3 / 8;
      Class74.Inner453[] var24 = this.method_1697(var2, var19, var4);

      for (int var26 = 0; var26 < 4; var26++) {
         switch (var24[var26]) {
            case field_1354:
               this.method_1404(var1, var6, var3, var7, 0, 1, 0, Class108.field_2741, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 0, Class108.field_2741, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 0, Class108.field_2741, var26);
               this.method_1404(var1, var6, var3, var7, 0, 1, 1, Class108.field_2741, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 1, Class108.field_2741, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 1, Class108.field_2741, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, -1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 0, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 2, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 0, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 3, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, -2, Class390.field_1583, var26);
               break;
            case field_1332:
               this.method_1404(var1, var6, var3, var7, 0, 1, 0, Class390.field_2010, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 0, Class390.field_2010, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 0, Class390.field_2010, var26);
               this.method_1404(var1, var6, var3, var7, 0, 1, 1, Class390.field_2010, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 1, Class390.field_2010, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 1, Class390.field_2010, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, -1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 0, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 2, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 0, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 3, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, -2, Class390.field_1583, var26);
               break;
            case field_2914:
               this.method_1404(var1, var6, var3, var7, 0, 1, 0, Class390.field_2352, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 0, Class390.field_2352, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 0, Class390.field_2352, var26);
               this.method_1404(var1, var6, var3, var7, 0, 1, 1, Class390.field_2352, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 1, Class390.field_2352, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 1, Class390.field_2352, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, -1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 0, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 2, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 0, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 3, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, -2, Class390.field_1583, var26);
               break;
            case field_2006:
               this.method_1404(var1, var6, var3, var7, 0, 1, 0, Class390.field_1825, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 0, Class390.field_1825, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 0, Class390.field_1825, var26);
               this.method_1404(var1, var6, var3, var7, 0, 1, 1, Class390.field_1825, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 1, Class390.field_1825, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 1, Class390.field_1825, var26);
               this.method_1404(var1, var6, var3, var7, 1, 1, 0, Class390.field_13, var26);
               this.method_1404(var1, var6, var3, var7, 1, 2, 0, Class390.field_1641, var26);
               this.method_1404(var1, var6, var3, var7, 1, 3, 0, Class390.field_2149, var26);
               this.method_1404(var1, var6, var3, var7, 1, 1, 1, Class390.field_735, var26);
               this.method_1404(var1, var6, var3, var7, 1, 2, 1, Class390.field_1906, var26);
               this.method_1404(var1, var6, var3, var7, 1, 3, 1, Class390.field_816, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, -1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 0, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 2, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 0, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 3, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, -2, Class390.field_1583, var26);
               break;
            case field_126:
               this.method_1404(var1, var6, var3, var7, 0, 1, 0, Class390.field_2849, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 0, Class390.field_2849, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 0, Class390.field_2849, var26);
               this.method_1404(var1, var6, var3, var7, 0, 1, 1, Class390.field_2849, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 1, Class390.field_2849, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 1, Class390.field_2849, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, -1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 0, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 2, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 0, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 3, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, -2, Class390.field_1583, var26);
               break;
            case field_1668:
               this.method_1404(var1, var6, var3, var7, 0, 1, 0, Class390.field_1162, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 0, Class390.field_1162, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 0, Class390.field_1162, var26);
               this.method_1404(var1, var6, var3, var7, 0, 1, 1, Class390.field_1162, var26);
               this.method_1404(var1, var6, var3, var7, 0, 2, 1, Class390.field_1162, var26);
               this.method_1404(var1, var6, var3, var7, 0, 3, 1, Class390.field_1162, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, -1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 0, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 1, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 1, 0, 2, Class108.field_1970, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, -1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 0, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 1, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 2, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 0, 3, Class390.field_81, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, 3, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 1, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 2, -2, Class390.field_1583, var26);
               this.method_1404(var1, var6, var3, var7, 2, 3, -2, Class390.field_1583, var26);
               break;
            case field_2261:
               int var11 = var26 == 0 ? 1 : (var26 == 2 ? -1 : 0);
               int var12 = var26 == 1 ? 1 : (var26 == 3 ? -1 : 0);
               var11 += var2;
               var12 += var4;
               if (this.method_1272(var11, var19, var12, (var26 + 2) % 4) == Class74.Inner453.field_2261 && var5.method_1797(var11, var12) instanceof Class74) {
                  this.method_1404(var1, var6, var3, var7, 0, 0, 0, Class390.field_2690, var26);
                  this.method_1404(var1, var6, var3, var7, 0, 0, 1, Class390.field_2690, var26);
                  this.method_1404(var1, var6, var3, var7, 0, 1, 0, Class390.field_2690, var26);
                  this.method_1404(var1, var6, var3, var7, 0, 1, 1, Class390.field_2690, var26);
                  this.method_1404(var1, var6, var3, var7, 3, -1, 0, Class390.field_1825, var26);
                  this.method_1404(var1, var6, var3, var7, 3, -1, 1, Class390.field_1825, var26);
                  this.method_1404(var1, var6, var3, var7, 4, -1, 0, Class390.field_1825, var26);
                  this.method_1404(var1, var6, var3, var7, 4, -1, 1, Class390.field_1825, var26);
               }
            case field_37:
               int var28 = var26 == 0 ? 1 : (var26 == 2 ? -1 : 0);
               int var31 = var26 == 1 ? 1 : (var26 == 3 ? -1 : 0);
               var28 += var2;
               var31 += var4;
               if (this.method_1272(var28, var19, var31, (var26 + 2) % 4) == Class74.Inner453.field_2261 && var5.method_1797(var28, var31) instanceof Class74) {
                  this.method_1404(var1, var6, var3, var7, 3, -1, 0, Class390.field_1825, var26);
                  this.method_1404(var1, var6, var3, var7, 3, -1, 1, Class390.field_1825, var26);
                  this.method_1404(var1, var6, var3, var7, 4, -1, 0, Class390.field_1825, var26);
                  this.method_1404(var1, var6, var3, var7, 4, -1, 1, Class390.field_1825, var26);
               }
         }
      }

      this.method_770(var1, var6 + 4, var3 + 1, var7 + 4);
      this.method_770(var1, var6 + 11, var3 + 1, var7 + 4);
      this.method_770(var1, var6 + 4, var3 + 1, var7 + 11);
      this.method_770(var1, var6 + 11, var3 + 1, var7 + 11);
   }

   private void method_770(Class454 var1, int var2, int var3, int var4) {
      Random var5 = new Random(var2 * 456856235L - var3 * 184761862L + var4 * 4618624L + 18162412L);
      if (var5.nextInt(127) == 0) {
         var1.method_470(var2, var3, var4, Class108.field_93.field_2151);
         Class520 var6 = new Class520();
         var1.method_1516(var2, var3, var4, var6);

         for (int var7 = 0; var7 < var6.method_1574(); var7++) {
            int var8 = var5.nextInt(30);
            if (var8 < 1) {
               var6.method_708(var7, new Class334(Class755.field_591));
            } else if (var8 < 6) {
               var6.method_708(var7, new Class334(Class390.field_13.field_2151 + var8 - 1, var5.nextInt(15) + 1));
            } else if (var8 < 11) {
               var6.method_708(var7, new Class334(Class390.field_2958.field_2151 + var8 - 6, var5.nextInt(15) + 1));
            } else if (var8 < 12) {
               var6.method_708(var7, new Class334(Class755.field_3063));
            } else if (var8 < 13) {
               var6.method_708(var7, new Class334(Class755.field_362));
            } else if (var8 < 14) {
               var6.method_708(var7, new Class334(Class50.field_3015));
            } else if (var8 < 15) {
               var6.method_708(var7, new Class334(Class50.field_1076));
            } else if (var8 < 16) {
               var6.method_708(var7, new Class334(Class50.field_2236));
            }
         }
      }
   }

   private void method_1920(Class454 var1, int var2, int var3, int var4) {
      for (int var5 = 2; var5 <= 13; var5++) {
         for (int var6 = 2; var6 <= 13; var6++) {
            for (int var7 = 5; var7 < 8; var7++) {
               if (!this.method_411(var1, var2 * 16 + var5, var3 + var7, var4 * 16 + var6)) {
                  var1.method_470(var2 * 16 + var5, var3 + var7, var4 * 16 + var6, Class390.field_1825.field_2151);
               }
            }
         }
      }

      for (int var8 = 3; var8 <= 12; var8++) {
         for (int var9 = 3; var9 <= 12; var9++) {
            this.method_1501(var1, Class390.field_1505.field_2151, var2 * 16 + var8, var3 + 4, var4 * 16 + var9);
         }
      }
   }

   @Override
   public void method_1166(Class454 var1, int var2, int var3, Class99 var4) {
      int var5 = (int)((this.field_16.method_398(var2, var3) / 2.0 + 1.0) * 8.0);

      for (int var6 = var5; var6 >= 0; var6--) {
         int var7 = 30 + var6 * 8;
         if (!this.method_1183(var1, var2, var7, var3)) {
            if (var5 != var6) {
               this.method_1920(var1, var2, var7, var3);
            }
            break;
         }

         this.method_310(var1, var2, var7, var3, var4);
      }
   }

   private enum Inner453 {
      field_2803,
      field_2261,
      field_2914,
      field_1332,
      field_126,
      field_1668,
      field_1354,
      field_37,
      field_2006;

      public static Class74.Inner453[] method_1100() {
         return (Class74.Inner453[])field_1257.clone();
      }

      public static Class74.Inner453 method_1850(String var0) {
         return Enum.valueOf(Class74.Inner453.class, var0);
      }
   }
}
