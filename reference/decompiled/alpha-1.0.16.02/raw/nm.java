import java.util.Random;

public class nm extends ia {
   @Override
   public boolean a(cj var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + 4;
      boolean var7 = true;
      if (var4 >= 1 && var4 + var6 + 1 <= 128) {
         for (int var8 = var4; var8 <= var4 + 1 + var6; var8++) {
            byte var9 = 1;
            if (var8 == var4) {
               var9 = 0;
            }

            if (var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for (int var10 = var3 - var9; var10 <= var3 + var9 && var7; var10++) {
               for (int var11 = var5 - var9; var11 <= var5 + var9 && var7; var11++) {
                  if (var8 >= 0 && var8 < 128) {
                     int var12 = var1.a(var10, var8, var11);
                     if (var12 != 0 && var12 != ln.K.ba) {
                        var7 = false;
                     }
                  } else {
                     var7 = false;
                  }
               }
            }
         }

         if (!var7) {
            return false;
         }

         int var16 = var1.a(var3, var4 - 1, var5);
         if ((var16 == ln.u.ba || var16 == ln.v.ba) && var4 < 128 - var6 - 1) {
            var1.a(var3, var4 - 1, var5, ln.v.ba);

            for (int var17 = var4 - 3 + var6; var17 <= var4 + var6; var17++) {
               int var19 = var17 - (var4 + var6);
               int var21 = 1 - var19 / 2;

               for (int var22 = var3 - var21; var22 <= var3 + var21; var22++) {
                  int var13 = var22 - var3;

                  for (int var14 = var5 - var21; var14 <= var5 + var21; var14++) {
                     int var15 = var14 - var5;
                     if ((Math.abs(var13) != var21 || Math.abs(var15) != var21 || var2.nextInt(2) != 0 && var19 != 0) && !ln.p[var1.a(var22, var17, var14)]) {
                        var1.a(var22, var17, var14, ln.K.ba);
                     }
                  }
               }
            }

            for (int var18 = 0; var18 < var6; var18++) {
               int var20 = var1.a(var3, var4 + var18, var5);
               if (var20 == 0 || var20 == ln.K.ba) {
                  var1.a(var3, var4 + var18, var5, ln.J.ba);
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
