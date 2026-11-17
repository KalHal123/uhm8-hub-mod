package srv;

import java.util.Random;

public class Class324 extends Class19 {
   private int field_566;
   int field_820;
   int field_6;
   int field_62;
   int field_262;
   Random field_532;

   public Class324(int var1, int var2, int var3) {
      this.field_566 = var1;
      this.field_820 = var2;
      this.field_6 = var3;
      this.field_62 = var2 / 16;
      this.field_262 = var3 / 16;
   }

   public void method_416(Class317 var1, int var2, int var3, int var4, int var5) {
      if (var5 != 0) {
         for (int var6 = -var5; var6 <= var5; var6++) {
            for (int var7 = -var5; var7 <= var5; var7++) {
               for (int var8 = -var5; var8 <= var5; var8++) {
                  if (var6 * var6 + var7 * var7 + var8 * var8 <= var5 * var5
                     && (var2 + var6) / 16 - (this.field_62 < 0 ? 1 : 0) == this.field_62
                     && (var4 + var8) / 16 - (this.field_262 < 0 ? 1 : 0) == this.field_262
                     && var3 + var7 >= 1
                     && var1.method_813(var2 + var6, var3 + var7, var4 + var8) != Class323.field_1588.field_1379) {
                     boolean var9 = var1.method_813(var2 + var6, var3 + var7, var4 + var8) != Class371.field_536.field_1379;
                     if (var3 + var7 > 3 || var9 || !var9 && this.field_532.nextInt(4) < 3) {
                        if (var3 + var7 > 3) {
                           var1.method_260(var2 + var6, var3 + var7, var4 + var8, 0);
                        } else {
                           var1.method_260(var2 + var6, var3 + var7, var4 + var8, Class371.field_535.field_1379);

                           for (int var10 = -1; var10 <= 1; var10++) {
                              for (int var11 = -1; var11 <= 1; var11++) {
                                 for (int var12 = -1; var12 <= 1; var12++) {
                                    if (var1.method_813(var2 + var6 + var10, var3 + var7 + var12, var4 + var8 + var11) == Class371.field_1294.field_1379) {
                                       var1.method_260(var2 + var6 + var10, var3 + var7 + var12, var4 + var8 + var11, Class323.field_1435.field_1379);
                                    } else if (var1.method_813(var2 + var6 + var10, var3 + var7 + var12, var4 + var8 + var11) == Class371.field_1082.field_1379
                                       )
                                     {
                                       var1.method_260(var2 + var6 + var10, var3 + var7 + var12, var4 + var8 + var11, Class323.field_406.field_1379);
                                    }
                                 }
                              }
                           }

                           if (var3 + var7 == 3 && this.field_532.nextInt(80) == 0) {
                              var1.method_260(var2 + var6, var3 + var7 + 1, var4 + var8, Class323.field_1588.field_1379);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      this.field_532 = var2;
      if (var4 < 10) {
         try {
            this.method_416(var1, var3, var4, var5, this.field_566);
         } catch (StackOverflowError var7) {
            System.out.println("StackOverflowError at " + var3 + " " + var4 + " " + var5 + ", " + this.field_566);
         }
      }

      return true;
   }
}
