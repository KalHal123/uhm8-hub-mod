package ext;

import java.util.Random;

public class Class385 implements Interface664 {
   private final Class107 field_2594;

   public Class385(Random var1) {
      this.field_2594 = new Class107(var1);
   }

   @Override
   public float method_1766() {
      return 0.8F;
   }

   private boolean method_1262(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4);
      return var5 != 0 && Class108.field_1221[var5].method_214() && Class108.field_1221[var5].method_916() && Class108.field_1221[var5].method_636();
   }

   private boolean method_139(Class454 var1, int var2, int var3, int var4) {
      int var5 = 256;

      for (int var6 = 0; var6 < 8; var6++) {
         for (int var7 = 0; var7 < 15; var7++) {
            for (int var8 = 0; var8 < 15; var8++) {
               if (this.method_1262(var1, var2 * 16 + var7, var3 + var6, var4 * 16 + var8)) {
                  if (--var5 == 0) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }

   public void method_504(Class454 var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < 9; var5++) {
         for (int var6 = 0; var6 < 6; var6++) {
            var1.method_470(var2 + var5 + 3, var3 + var6, var4 + 2, Class108.field_1294.field_2151);
            var1.method_470(var2 + var5 + 3, var3 + var6, var4 + 12, Class108.field_1294.field_2151);
            var1.method_470(var2 + 2, var3 + var6, var4 + 3 + var5, Class108.field_1294.field_2151);
            var1.method_470(var2 + 12, var3 + var6, var4 + 3 + var5, Class108.field_1294.field_2151);
         }
      }

      for (int var17 = 0; var17 < 9; var17++) {
         for (int var19 = 0; var19 < 9; var19++) {
            var1.method_470(var2 + var19 + 3, var3, var4 + var17 + 3, Class108.field_1294.field_2151);
         }
      }

      int var18 = var2 * 56236445 - var3 * 1235617 + var4 * 1242535;
      int var20 = var2 * 234745 - var3 * 83452 - var4 * 784345;
      double var7 = this.field_2594.method_398(var18 / 2.0, var20 / 2.0);
      double var9 = this.field_2594.method_398(var20 / 2.0, var18 / 2.0);
      if (var7 >= 0.25) {
         Class520 var11 = new Class520();
         var1.method_470(var2 + 7, var3 + 1, var4 + 7, Class108.field_93.field_2151);
         var1.method_1516(var2 + 7, var3 + 1, var4 + 7, var11);
         Random var12 = new Random(var18 + var20);

         for (int var13 = 0; var13 < var11.method_1574(); var13++) {
            for (int var14 = 0; var14 < 300; var14++) {
               int var15 = var12.nextInt(32767);
               if (Class755.field_2576[var15] != null) {
                  Class334 var16 = new Class334(var15);
                  var11.method_708(var13, var16);
                  break;
               }
            }
         }
      } else {
         Class529 var21 = new Class529();
         var21.field_34 = "Slime";
         var1.method_470(var2 + 7, var3 + 1, var4 + 7, Class108.field_288.field_2151);
         var1.method_1516(var2 + 7, var3 + 1, var4 + 7, var21);
      }
   }

   @Override
   public void method_1166(Class454 var1, int var2, int var3, Class99 var4) {
      int var5 = 127;

      while (var5 > 0 && this.method_139(var1, var2, var5, var3)) {
         var5--;
      }

      while (var5 < 108) {
         this.method_504(var1, var2 * 16, var5, var3 * 16);
         var5 += 6;
      }

      for (int var6 = 0; var6 < 9; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            var1.method_470(var2 * 16 + var7 + 3, var5, var3 * 16 + var6 + 3, Class108.field_1294.field_2151);
         }
      }
   }
}
