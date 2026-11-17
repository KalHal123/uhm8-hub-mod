package ext;

import java.util.Random;

public class Class102 extends Class641 {
   private int field_958;
   int field_156;
   int field_2135;
   int field_918;
   int field_2433;
   Random field_795;

   public Class102(int var1, int var2, int var3) {
      this.field_958 = var1;
      this.field_156 = var2;
      this.field_2135 = var3;
      this.field_918 = var2 / 16;
      this.field_2433 = var3 / 16;
   }

   public void method_1489(Class454 var1, int var2, int var3, int var4, int var5) {
      if (var5 != 0) {
         for (int var6 = -var5; var6 <= var5; var6++) {
            for (int var7 = -var5; var7 <= var5; var7++) {
               for (int var8 = -var5; var8 <= var5; var8++) {
                  if (var6 * var6 + var7 * var7 + var8 * var8 <= var5 * var5
                     && (var2 + var6) / 16 - (this.field_918 < 0 ? 1 : 0) == this.field_918
                     && (var4 + var8) / 16 - (this.field_2433 < 0 ? 1 : 0) == this.field_2433
                     && var3 + var7 >= 1
                     && var1.method_197(var2 + var6, var3 + var7, var4 + var8) != Class390.field_2874.field_2151) {
                     boolean var9 = var1.method_197(var2 + var6, var3 + var7, var4 + var8) != Class108.field_2945.field_2151;
                     if (var3 + var7 > 3 || var9 || !var9 && this.field_795.nextInt(4) < 3) {
                        if (var3 + var7 > 3) {
                           var1.method_470(var2 + var6, var3 + var7, var4 + var8, 0);
                        } else {
                           var1.method_470(var2 + var6, var3 + var7, var4 + var8, Class108.field_2883.field_2151);

                           for (int var10 = -1; var10 <= 1; var10++) {
                              for (int var11 = -1; var11 <= 1; var11++) {
                                 for (int var12 = -1; var12 <= 1; var12++) {
                                    if (var1.method_197(var2 + var6 + var10, var3 + var7 + var12, var4 + var8 + var11) == Class108.field_720.field_2151) {
                                       var1.method_470(var2 + var6 + var10, var3 + var7 + var12, var4 + var8 + var11, Class390.field_2592.field_2151);
                                    } else if (var1.method_197(var2 + var6 + var10, var3 + var7 + var12, var4 + var8 + var11) == Class108.field_1047.field_2151
                                       )
                                     {
                                       var1.method_470(var2 + var6 + var10, var3 + var7 + var12, var4 + var8 + var11, Class390.field_271.field_2151);
                                    }
                                 }
                              }
                           }

                           if (var3 + var7 == 3 && this.field_795.nextInt(80) == 0) {
                              var1.method_470(var2 + var6, var3 + var7 + 1, var4 + var8, Class390.field_2874.field_2151);
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
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      this.field_795 = var2;
      if (var4 < 10) {
         try {
            this.method_1489(var1, var3, var4, var5, this.field_958);
         } catch (StackOverflowError var7) {
            System.out.println("StackOverflowError at " + var3 + " " + var4 + " " + var5 + ", " + this.field_958);
         }
      }

      return true;
   }
}
