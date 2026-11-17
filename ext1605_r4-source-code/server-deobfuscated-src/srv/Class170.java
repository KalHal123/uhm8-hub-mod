package srv;

import java.util.HashSet;
import java.util.Set;

public class Class170 {
   private int field_29;
   private Class field_1395;
   private Class[] field_457;
   private Set field_1306 = new HashSet();

   public Class170(int var1, Class var2, Class[] var3) {
      this.field_29 = var1;
      this.field_1395 = var2;
      this.field_457 = var3;
   }

   public void method_966(Class317 var1) {
   }

   protected Class89 method_403(Class317 var1, int var2, int var3) {
      int var4 = var2 + var1.field_413.nextInt(16);
      int var5 = var1.field_413.nextInt(128);
      int var6 = var3 + var1.field_413.nextInt(16);
      return new Class89(var4, var5, var6);
   }

   private int method_328(Class317 var1, int var2, Interface282 var3) {
      this.field_1306.clear();

      for (int var4 = 0; var4 < var1.field_469.size(); var4++) {
         Class41 var8 = var1.field_469.get(var4);
         int var9 = Class380.method_502(var8.field_1324 / 16.0);
         int var5 = Class380.method_502(var8.field_1321 / 16.0);
         byte var10 = 4;

         for (int var6 = -var10; var6 <= var10; var6++) {
            for (int var7 = -var10; var7 <= var10; var7++) {
               this.field_1306.add(new Class338(var6 + var9, var7 + var5));
            }
         }
      }

      int var28 = 0;

      for (Class338 var33 : this.field_1306) {
         if (var1.field_413.nextInt(10) == 0) {
            int var29 = var1.field_413.nextInt(this.field_457.length);
            Class89 var34 = this.method_403(var1, var33.field_572 * 16, var33.field_1174 * 16);
            int var30 = var34.field_339;
            int var31 = var34.field_613;
            int var11 = var34.field_1218;
            if (var1.method_604(var30, var31, var11)) {
               return 0;
            }

            if (var1.method_149(var30, var31, var11) != Class111.field_54) {
               return 0;
            }

            for (int var12 = 0; var12 < 3; var12++) {
               int var13 = var30;
               int var14 = var31;
               int var15 = var11;
               byte var16 = 6;

               for (int var17 = 0; var17 < 2; var17++) {
                  var13 += var1.field_413.nextInt(var16) - var1.field_413.nextInt(var16);
                  var14 += var1.field_413.nextInt(1) - var1.field_413.nextInt(1);
                  var15 += var1.field_413.nextInt(var16) - var1.field_413.nextInt(var16);
                  if (var1.method_604(var13, var14 - 1, var15)
                     && !var1.method_604(var13, var14, var15)
                     && !var1.method_149(var13, var14, var15).method_210()
                     && !var1.method_604(var13, var14 + 1, var15)) {
                     float var18 = var13 + 0.5F;
                     float var19 = var14;
                     float var20 = var15 + 0.5F;
                     if (var1.method_818(var18, var19, var20, 24.0) == null) {
                        float var21 = var18 - var1.field_944;
                        float var22 = var19 - var1.field_639;
                        float var23 = var20 - var1.field_1535;
                        float var24 = var21 * var21 + var22 * var22 + var23 * var23;
                        if (var24 >= 576.0F) {
                           Class92 var25;
                           try {
                              var25 = (Class92)this.field_457[var29].getConstructor(Class317.class).newInstance(var1);
                           } catch (Exception var27) {
                              var27.printStackTrace();
                              return var28;
                           }

                           var25.method_885(var18, var19, var20, var1.field_413.nextFloat() * 360.0F, 0.0F);
                           if (var25.method_53()) {
                              var28++;
                              var1.method_237(var25);
                              if (var25 instanceof Class333 && var1.field_413.nextInt(100) == 0) {
                                 Class360 var26 = new Class360(var1);
                                 var26.method_885(var18, var19, var20, var25.field_909, 0.0F);
                                 var1.method_237(var26);
                                 var26.method_720(var25);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var28;
   }
}
