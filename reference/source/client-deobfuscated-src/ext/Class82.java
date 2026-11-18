package ext;

import java.util.HashSet;
import java.util.Set;

public class Class82 {
   private int field_2689;
   private Class field_3033;
   private Class<? extends Class377>[] field_477;
   private Set<Class346> field_3135 = new HashSet<>();

   public Class82(int var1, Class var2, Class<? extends Class377>[] var3) {
      this.field_2689 = var1;
      this.field_3033 = var2;
      this.field_477 = var3;
   }

   public void method_59(Class454 var1) {
      int var2 = var1.method_1694(this.field_3033);
      if (var2 < this.field_2689) {
         for (int var3 = 0; var3 < 3; var3++) {
            this.method_1478(var1, 1, (Interface608)null);
         }
      }
   }

   protected Class450 method_278(Class454 var1, int var2, int var3) {
      int var4 = var2 + var1.field_2150.nextInt(16);
      int var5 = var1.field_2150.nextInt(128);
      int var6 = var3 + var1.field_2150.nextInt(16);
      return new Class450(var4, var5, var6);
   }

   private int method_1478(Class454 var1, int var2, Interface608 var3) {
      this.field_3135.clear();

      for (int var4 = 0; var4 < var1.field_70.size(); var4++) {
         Class354 var8 = var1.field_70.get(var4);
         int var9 = Class469.method_468(var8.field_1417 / 16.0);
         int var5 = Class469.method_468(var8.field_2013 / 16.0);
         byte var10 = 4;

         for (int var6 = -var10; var6 <= var10; var6++) {
            for (int var7 = -var10; var7 <= var10; var7++) {
               this.field_3135.add(new Class346(var6 + var9, var7 + var5));
            }
         }
      }

      int var28 = 0;

      for (Class346 var33 : this.field_3135) {
         if (var1.field_2150.nextInt(10) == 0) {
            int var29 = var1.field_2150.nextInt(this.field_477.length);
            Class450 var34 = this.method_278(var1, var33.field_2263 * 16, var33.field_1976 * 16);
            int var30 = var34.field_1865;
            int var31 = var34.field_322;
            int var11 = var34.field_2359;
            if (var1.method_768(var30, var31, var11)) {
               return 0;
            }

            if (var1.method_1286(var30, var31, var11) != Class160.field_1255) {
               return 0;
            }

            for (int var12 = 0; var12 < 3; var12++) {
               int var13 = var30;
               int var14 = var31;
               int var15 = var11;
               byte var16 = 6;

               for (int var17 = 0; var17 < 2; var17++) {
                  var13 += var1.field_2150.nextInt(var16) - var1.field_2150.nextInt(var16);
                  var14 += var1.field_2150.nextInt(1) - var1.field_2150.nextInt(1);
                  var15 += var1.field_2150.nextInt(var16) - var1.field_2150.nextInt(var16);
                  if (var1.method_768(var13, var14 - 1, var15)
                     && !var1.method_768(var13, var14, var15)
                     && !var1.method_1286(var13, var14, var15).method_743()
                     && !var1.method_768(var13, var14 + 1, var15)) {
                     float var18 = var13 + 0.5F;
                     float var19 = var14;
                     float var20 = var15 + 0.5F;
                     if (var1.method_230(var18, var19, var20, 24.0) == null) {
                        float var21 = var18 - var1.field_18;
                        float var22 = var19 - var1.field_934;
                        float var23 = var20 - var1.field_1361;
                        float var24 = var21 * var21 + var22 * var22 + var23 * var23;
                        if (var24 >= 576.0F) {
                           Class377 var25;
                           try {
                              var25 = this.field_477[var29].getConstructor(Class454.class).newInstance(var1);
                           } catch (Exception var27) {
                              var27.printStackTrace();
                              return var28;
                           }

                           var25.method_253(var18, var19, var20, var1.field_2150.nextFloat() * 360.0F, 0.0F);
                           if (var25.method_713()) {
                              var28++;
                              var1.method_1447(var25);
                              if (var25 instanceof Class639 && var1.field_2150.nextInt(100) == 0) {
                                 Class716 var26 = new Class716(var1);
                                 var26.method_253(var18, var19, var20, var25.field_1661, 0.0F);
                                 var1.method_1447(var26);
                                 var26.method_1050(var25);
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
