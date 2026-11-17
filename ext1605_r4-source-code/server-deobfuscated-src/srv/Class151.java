package srv;

import java.util.Random;

public class Class151 implements Interface14 {
   private final Class345 field_1443;

   public Class151(Random var1) {
      this.field_1443 = new Class345(var1);
   }

   @Override
   public float method_449() {
      return 0.8F;
   }

   private boolean method_531(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3, var4);
      return var5 != 0 && Class371.field_57[var5].method_491() && Class371.field_57[var5].method_138() && Class371.field_57[var5].method_786();
   }

   private boolean method_759(Class317 var1, int var2, int var3, int var4) {
      int var5 = 256;

      for (int var6 = 0; var6 < 8; var6++) {
         for (int var7 = 0; var7 < 15; var7++) {
            for (int var8 = 0; var8 < 15; var8++) {
               if (this.method_531(var1, var2 * 16 + var7, var3 + var6, var4 * 16 + var8)) {
                  if (--var5 == 0) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }

   public void method_238(Class317 var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < 9; var5++) {
         for (int var6 = 0; var6 < 6; var6++) {
            var1.method_260(var2 + var5 + 3, var3 + var6, var4 + 2, Class371.field_741.field_1379);
            var1.method_260(var2 + var5 + 3, var3 + var6, var4 + 12, Class371.field_741.field_1379);
            var1.method_260(var2 + 2, var3 + var6, var4 + 3 + var5, Class371.field_741.field_1379);
            var1.method_260(var2 + 12, var3 + var6, var4 + 3 + var5, Class371.field_741.field_1379);
         }
      }

      for (int var17 = 0; var17 < 9; var17++) {
         for (int var19 = 0; var19 < 9; var19++) {
            var1.method_260(var2 + var19 + 3, var3, var4 + var17 + 3, Class371.field_741.field_1379);
         }
      }

      int var18 = var2 * 56236445 - var3 * 1235617 + var4 * 1242535;
      int var20 = var2 * 234745 - var3 * 83452 - var4 * 784345;
      double var7 = this.field_1443.method_78(var18 / 2.0, var20 / 2.0);
      double var9 = this.field_1443.method_78(var20 / 2.0, var18 / 2.0);
      if (var7 >= 0.25) {
         Class171 var11 = new Class171();
         var1.method_260(var2 + 7, var3 + 1, var4 + 7, Class371.field_649.field_1379);
         var1.method_563(var2 + 7, var3 + 1, var4 + 7, var11);
         Random var12 = new Random(var18 + var20);

         for (int var13 = 0; var13 < var11.method_214(); var13++) {
            for (int var14 = 0; var14 < 300; var14++) {
               int var15 = var12.nextInt(32767);
               if (Class350.field_218[var15] != null) {
                  Class150 var16 = new Class150(var15);
                  var11.method_351(var13, var16);
                  break;
               }
            }
         }
      } else {
         Class68 var21 = new Class68();
         var21.field_1554 = "Slime";
         var1.method_260(var2 + 7, var3 + 1, var4 + 7, Class371.field_219.field_1379);
         var1.method_563(var2 + 7, var3 + 1, var4 + 7, var21);
      }
   }

   @Override
   public void method_1024(Class317 var1, int var2, int var3, Class81 var4) {
      int var5 = 127;

      while (var5 > 0 && this.method_759(var1, var2, var5, var3)) {
         var5--;
      }

      while (var5 < 108) {
         this.method_238(var1, var2 * 16, var5, var3 * 16);
         var5 += 6;
      }

      for (int var6 = 0; var6 < 9; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            var1.method_260(var2 * 16 + var7 + 3, var5, var3 * 16 + var6 + 3, Class371.field_741.field_1379);
         }
      }
   }
}
