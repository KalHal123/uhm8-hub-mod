package ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Class517 {
   public static final int field_1602 = 30;
   private final Class475 field_400;
   private final List<Class633> field_2775;

   public static int method_48(int var0) {
      return var0 >= 0 ? var0 * 16 : var0 * 16 + 15;
   }

   public static boolean method_27(int var0, int var1, int var2, int var3) {
      int var4 = method_48(var0);
      int var5 = method_48(var1);
      return var2 <= var4 && var3 <= var5 && var2 > var4 - 16 && var3 > var5 - 16;
   }

   public Class517(Random var1, Class475 var2) {
      long var3 = System.currentTimeMillis();
      this.field_2775 = new ArrayList<>();
      this.field_400 = var2;
      int[] var5 = new int[900];
      Arrays.fill(var5, 0);
      int var6 = 0;

      boolean var7;
      do {
         var7 = false;

         for (int var8 = 0; var8 < var5.length; var8++) {
            if (var5[var8] == 0) {
               int var9 = var8 % 30;
               int var10 = var8 / 30;
               Class475 var11 = new Class475(method_48(var2.field_2785), method_48(var2.field_256)).method_794((var9 - 15) * 14, (var10 - 15) * 14);
               Class633 var12 = Class633.method_960(var1, var11);
               Class475 var13 = var12.method_338();
               boolean var14 = true;

               label65:
               for (int var15 = 0; var15 < var13.field_2785; var15++) {
                  for (int var16 = 0; var16 < var13.field_256; var16++) {
                     if (var9 + var15 >= 30 || var10 + var16 >= 30 || var5[var9 + var15 + (var10 + var16) * 30] != 0) {
                        var14 = false;
                        break label65;
                     }
                  }
               }

               if (!var14) {
                  var7 = true;
               } else {
                  var6++;
                  this.field_2775.add(var12);

                  for (int var17 = 0; var17 < var13.field_2785; var17++) {
                     for (int var18 = 0; var18 < var13.field_256; var18++) {
                        var5[var9 + var17 + (var10 + var18) * 30] = var6;
                     }
                  }
               }
            }
         }
      } while (var7);
   }

   public void method_1860(Class454 var1, int var2, int var3) {
      ArrayList var4 = new ArrayList();

      for (Class633 var6 : this.field_2775) {
         Class475 var7 = var6.method_1399();
         int var8 = var7.field_2785 - method_48(var2);
         int var9 = var7.field_256 - method_48(var3);
         if (var8 <= 0 && var9 <= 0 && var8 >= -29 && var9 >= -29 && var6.method_1051(var1, var2, var3)) {
            var4.add(var6);
         }
      }

      for (Class633 var11 : var4) {
         this.field_2775.remove(var11);
      }
   }
}
