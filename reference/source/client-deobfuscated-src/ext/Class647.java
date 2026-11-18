package ext;

public class Class647 {
   public final Enum621 field_127;
   public int field_2416;
   public int field_209;
   public int field_2791;
   public int field_2453;
   public int field_2470;
   public int field_639;

   public Class647(Enum621 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_127 = var1;
      this.field_2416 = var2;
      this.field_209 = var3;
      this.field_2791 = var4;
      this.field_2453 = var5;
      this.field_2470 = var6;
      this.field_639 = var7;
   }

   public void method_543(Class454 var1) {
      int var2 = this.field_2453 - this.field_2416;
      int var3 = this.field_2470 - this.field_209;
      int var4 = this.field_639 - this.field_2791;
      int var5 = var2 * var3 * var4;
      if (var5 <= 32768) {
         for (int var6 = this.field_2416; var6 <= this.field_2453; var6++) {
            for (int var7 = this.field_2791; var7 <= this.field_639; var7++) {
               if (var1.method_1372(var6, 0, var7)) {
                  for (int var8 = this.field_209; var8 <= this.field_2470; var8++) {
                     if (var8 >= 0 && var8 < 128) {
                        int var9 = var1.method_1763(this.field_127, var6, var8, var7);
                        boolean var10 = false;
                        int var11 = var1.method_197(var6, var8, var7);
                        int var12 = Class108.field_2371[var11];
                        if (var12 == 0) {
                           var12 = 1;
                        }

                        int var13 = 0;
                        if (this.field_127 == Enum621.field_1792) {
                           if (var1.method_1624(var6, var8, var7)) {
                              var13 = 15;
                           }
                        } else if (this.field_127 == Enum621.field_2016) {
                           var13 = Class108.field_2146[var11];
                        }

                        int var22;
                        if (var12 >= 15 && var13 == 0) {
                           var22 = 0;
                        } else {
                           int var14 = var1.method_1763(this.field_127, var6 - 1, var8, var7);
                           int var16 = var1.method_1763(this.field_127, var6 + 1, var8, var7);
                           int var17 = var1.method_1763(this.field_127, var6, var8 - 1, var7);
                           int var18 = var1.method_1763(this.field_127, var6, var8 + 1, var7);
                           int var19 = var1.method_1763(this.field_127, var6, var8, var7 - 1);
                           int var20 = var1.method_1763(this.field_127, var6, var8, var7 + 1);
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
                           var1.method_1777(this.field_127, var6, var8, var7, var22);
                           int var21 = var22 - 1;
                           if (var21 < 0) {
                              var21 = 0;
                           }

                           var1.method_589(this.field_127, var6 - 1, var8, var7, var21);
                           var1.method_589(this.field_127, var6, var8 - 1, var7, var21);
                           var1.method_589(this.field_127, var6, var8, var7 - 1, var21);
                           if (var6 + 1 >= this.field_2453) {
                              var1.method_589(this.field_127, var6 + 1, var8, var7, var21);
                           }

                           if (var8 + 1 >= this.field_2470) {
                              var1.method_589(this.field_127, var6, var8 + 1, var7, var21);
                           }

                           if (var7 + 1 >= this.field_639) {
                              var1.method_589(this.field_127, var6, var8, var7 + 1, var21);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean method_1514(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 >= this.field_2416
         && var2 >= this.field_209
         && var3 >= this.field_2791
         && var4 <= this.field_2453
         && var5 <= this.field_2470
         && var6 <= this.field_639) {
         return true;
      }

      byte var7 = 1;
      if (var1 >= this.field_2416 - var7
         && var2 >= this.field_209 - var7
         && var3 >= this.field_2791 - var7
         && var4 <= this.field_2453 + var7
         && var5 <= this.field_2470 + var7
         && var6 <= this.field_639 + var7) {
         int var8 = this.field_2453 - this.field_2416;
         int var9 = this.field_2470 - this.field_209;
         int var10 = this.field_639 - this.field_2791;
         if (var1 > this.field_2416) {
            var1 = this.field_2416;
         }

         if (var2 > this.field_209) {
            var2 = this.field_209;
         }

         if (var3 > this.field_2791) {
            var3 = this.field_2791;
         }

         if (var4 < this.field_2453) {
            var4 = this.field_2453;
         }

         if (var5 < this.field_2470) {
            var5 = this.field_2470;
         }

         if (var6 < this.field_639) {
            var6 = this.field_639;
         }

         int var11 = var4 - var1;
         int var12 = var5 - var2;
         int var13 = var6 - var3;
         int var14 = var8 * var9 * var10;
         int var15 = var11 * var12 * var13;
         if (var15 - var14 <= 2) {
            this.field_2416 = var1;
            this.field_209 = var2;
            this.field_2791 = var3;
            this.field_2453 = var4;
            this.field_2470 = var5;
            this.field_639 = var6;
            return true;
         }
      }

      return false;
   }
}
