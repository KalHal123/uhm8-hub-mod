package srv;

public class Class1 {
   public final Enum336 field_318;
   public int field_799;
   public int field_627;
   public int field_1092;
   public int field_1053;
   public int field_1233;
   public int field_370;

   public Class1(Enum336 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_318 = var1;
      this.field_799 = var2;
      this.field_627 = var3;
      this.field_1092 = var4;
      this.field_1053 = var5;
      this.field_1233 = var6;
      this.field_370 = var7;
   }

   public void method_784(Class317 var1) {
      int var2 = this.field_1053 - this.field_799;
      int var3 = this.field_1233 - this.field_627;
      int var4 = this.field_370 - this.field_1092;
      int var5 = var2 * var3 * var4;
      if (var5 <= 32768) {
         for (int var6 = this.field_799; var6 <= this.field_1053; var6++) {
            for (int var7 = this.field_1092; var7 <= this.field_370; var7++) {
               if (var1.method_833(var6, 0, var7)) {
                  for (int var8 = this.field_627; var8 <= this.field_1233; var8++) {
                     if (var8 >= 0 && var8 < 128) {
                        int var9 = var1.method_347(this.field_318, var6, var8, var7);
                        boolean var10 = false;
                        int var11 = var1.method_813(var6, var8, var7);
                        int var12 = Class371.field_1484[var11];
                        if (var12 == 0) {
                           var12 = 1;
                        }

                        int var13 = 0;
                        if (this.field_318 == Enum336.field_50) {
                           if (var1.method_843(var6, var8, var7)) {
                              var13 = 15;
                           }
                        } else if (this.field_318 == Enum336.field_1434) {
                           var13 = Class371.field_1015[var11];
                        }

                        int var22;
                        if (var12 >= 15 && var13 == 0) {
                           var22 = 0;
                        } else {
                           int var14 = var1.method_347(this.field_318, var6 - 1, var8, var7);
                           int var16 = var1.method_347(this.field_318, var6 + 1, var8, var7);
                           int var17 = var1.method_347(this.field_318, var6, var8 - 1, var7);
                           int var18 = var1.method_347(this.field_318, var6, var8 + 1, var7);
                           int var19 = var1.method_347(this.field_318, var6, var8, var7 - 1);
                           int var20 = var1.method_347(this.field_318, var6, var8, var7 + 1);
                           var22 = var14;
                           if (var16 > var14) {
                              var22 = var16;
                           }

                           if (var17 > var22) {
                              var22 = var17;
                           }

                           if (var18 > var22) {
                              var22 = var18;
                           }

                           if (var19 > var22) {
                              var22 = var19;
                           }

                           if (var20 > var22) {
                              var22 = var20;
                           }

                           var22 -= var12;
                           if (var22 < 0) {
                              var22 = 0;
                           }

                           if (var13 > var22) {
                              var22 = var13;
                           }
                        }

                        if (var9 != var22) {
                           var1.method_823(this.field_318, var6, var8, var7, var22);
                           int var21 = var22 - 1;
                           if (var21 < 0) {
                              var21 = 0;
                           }

                           var1.method_380(this.field_318, var6 - 1, var8, var7, var21);
                           var1.method_380(this.field_318, var6, var8 - 1, var7, var21);
                           var1.method_380(this.field_318, var6, var8, var7 - 1, var21);
                           if (var6 + 1 >= this.field_1053) {
                              var1.method_380(this.field_318, var6 + 1, var8, var7, var21);
                           }

                           if (var8 + 1 >= this.field_1233) {
                              var1.method_380(this.field_318, var6, var8 + 1, var7, var21);
                           }

                           if (var7 + 1 >= this.field_370) {
                              var1.method_380(this.field_318, var6, var8, var7 + 1, var21);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean method_556(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 >= this.field_799
         && var2 >= this.field_627
         && var3 >= this.field_1092
         && var4 <= this.field_1053
         && var5 <= this.field_1233
         && var6 <= this.field_370) {
         return true;
      }

      byte var7 = 1;
      if (var1 >= this.field_799 - var7
         && var2 >= this.field_627 - var7
         && var3 >= this.field_1092 - var7
         && var4 <= this.field_1053 + var7
         && var5 <= this.field_1233 + var7
         && var6 <= this.field_370 + var7) {
         int var8 = this.field_1053 - this.field_799;
         int var9 = this.field_1233 - this.field_627;
         int var10 = this.field_370 - this.field_1092;
         if (var1 > this.field_799) {
            var1 = this.field_799;
         }

         if (var2 > this.field_627) {
            var2 = this.field_627;
         }

         if (var3 > this.field_1092) {
            var3 = this.field_1092;
         }

         if (var4 < this.field_1053) {
            var4 = this.field_1053;
         }

         if (var5 < this.field_1233) {
            var5 = this.field_1233;
         }

         if (var6 < this.field_370) {
            var6 = this.field_370;
         }

         int var11 = var4 - var1;
         int var12 = var5 - var2;
         int var13 = var6 - var3;
         int var14 = var8 * var9 * var10;
         int var15 = var11 * var12 * var13;
         if (var15 - var14 <= 2) {
            this.field_799 = var1;
            this.field_627 = var2;
            this.field_1092 = var3;
            this.field_1053 = var4;
            this.field_1233 = var5;
            this.field_370 = var6;
            return true;
         }
      }

      return false;
   }
}
