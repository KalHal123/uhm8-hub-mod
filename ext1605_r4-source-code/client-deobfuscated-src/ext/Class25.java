package ext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class Class25 extends Class641 {
   public static int field_2963 = 25;
   private final Map<Class475, Class25.Inner26> field_2967 = new HashMap<>();
   private final HashMap<Class475, Class517> field_2039 = new HashMap<>();

   private Class25.Inner26 method_904(Class454 var1, Random var2, int var3, int var4, int var5, Class475 var6, int var7) {
      return this.method_1921(var1, var2, var3, var4, var5, var6, var7, new Class468<>(0));
   }

   private Class25.Inner26 method_1921(Class454 var1, Random var2, int var3, int var4, int var5, Class475 var6, int var7, Class468<Integer> var8) {
      if (this.field_2967.containsKey(var6)) {
         return null;
      }

      this.field_2967.put(var6, null);
      if (var1.method_197(var3, var4, var5) != 0) {
         return null;
      }

      while (var1.method_197(var3, var4, var5) == 0) {
         if (--var4 <= 0) {
            return null;
         }
      }

      if (var4 > 104) {
         return null;
      }

      var4 /= 4;
      var4 = ++var4 * 4;
      int var9 = 3 + var2.nextInt(3);
      int var10 = (116 - var4) / 4 - 2;
      if (var10 <= 0) {
         return null;
      }

      int var11 = 2 + var2.nextInt(var10);
      Class25.Inner26 var12 = new Class25.Inner26(var9, var11, var3, var4, var5);

      for (int var13 = -var9 + 1; var13 <= var9 - 1; var13++) {
         for (int var14 = 1; var14 <= 3; var14++) {
            for (int var15 = 0; var15 <= var11; var15++) {
               var1.method_470(var13 + var3, var4 + 4 * var15 + var14, -var9 + 1 + var5, Class390.field_1892.field_2151);
               var1.method_470(var13 + var3, var4 + 4 * var15 + var14, var9 - 1 + var5, Class390.field_1892.field_2151);
               var1.method_470(-var9 + 1 + var3, var4 + 4 * var15 + var14, var13 + var5, Class390.field_1892.field_2151);
               var1.method_470(var9 - 1 + var3, var4 + 4 * var15 + var14, var13 + var5, Class390.field_1892.field_2151);
            }
         }
      }

      for (int var31 = -var9; var31 <= var9; var31++) {
         for (int var37 = -var9; var37 <= var9; var37++) {
            for (int var45 = 0; var45 <= var11 + 1; var45++) {
               var1.method_470(var31 + var3, var4 + 4 * var45, var37 + var5, Class390.field_1825.field_2151);
            }
         }
      }

      for (int var32 = 1; var32 <= 3; var32++) {
         for (int var38 = 0; var38 <= var11; var38++) {
            var1.method_470(var9 + var3, var4 + 4 * var38 + var32, -var9 + var5, Class390.field_1583.field_2151);
            var1.method_470(-var9 + var3, var4 + 4 * var38 + var32, var9 + var5, Class390.field_1583.field_2151);
            var1.method_470(-var9 + var3, var4 + 4 * var38 + var32, -var9 + var5, Class390.field_1583.field_2151);
            var1.method_470(var9 + var3, var4 + 4 * var38 + var32, var9 + var5, Class390.field_1583.field_2151);
         }
      }

      for (int var33 = -var9 + 1; var33 <= var9 - 1; var33++) {
         for (int var39 = -var9 + 1; var39 <= var9 - 1; var39++) {
            for (int var46 = var4 - 1; var46 > 0 && var1.method_197(var33 + var3, var46, var39 + var5) == 0; var46--) {
               var1.method_470(var33 + var3, var46, var39 + var5, Class390.field_1583.field_2151);
            }
         }
      }

      for (int var34 = 0; var34 < var11; var34++) {
         int var40 = var4 + 1 + 4 * var34;
         Class25.Inner727[] var47 = new Class25.Inner727[4];
         var12.field_2348.add(var47);

         for (int var16 = 0; var16 < 4; var16++) {
            var47[var16] = Class25.Inner727.field_2707;
         }

         for (int var50 = 0; var50 < 4; var50++) {
            int var17 = 0;
            int var18 = (var50 & 2) - 1;
            if (var50 % 2 == 1) {
               var17 = var18;
               var18 = 0;
            }

            int var19 = var17 * (var9 - 1) + var3;
            int var20 = var18 * (var9 - 1) + var5;
            switch (var2.nextInt(5)) {
               case 1:
                  var1.method_470(var19, var40 + 1, var20, Class390.field_2690.field_2151);
                  var47[var50] = Class25.Inner727.field_2437;
                  break;
               case 2:
                  Class475 var21 = new Class475(var6.method_1091() + var17, var6.method_814() + var18);
                  if (!this.field_2967.containsKey(var21)) {
                     var47[var50] = Class25.Inner727.field_2339;

                     for (int var22 = 0; var22 <= var7 / 2 + 1; var22++) {
                        if (var2.nextInt(var7 + 1) == 0 && (Integer)var8.field_343 < field_2963) {
                           Class468 var23 = var8;
                           Integer var24 = (Integer)var23.field_343;
                           var23.field_343 = (T)(Integer)var23.field_343 + 1;
                           int var57 = var9 + 8 + var2.nextInt(3);
                           Class25.Inner26 var58 = this.method_1921(var1, var2, var3 + var17 * var57, 128, var5 + var18 * var57, var21, var7 + 1, var8);
                           if (var58 == null || var58.field_787 + (var58.field_2452 + 1) * 4 < var40) {
                              break;
                           }

                           var1.method_470(var19, var40, var20, 0);
                           var1.method_470(var19, var40 + 1, var20, 0);

                           for (int var25 = var9; var25 < var57 - var58.field_1801 + 1; var25++) {
                              var19 += var17;
                              var20 += var18;

                              for (int var26 = -1; var26 <= 1; var26++) {
                                 for (int var27 = -1; var27 <= 1; var27++) {
                                    if (var1.method_197(var19 + var26, var40 - 1, var20 + var27) == 0) {
                                       var1.method_470(var19 + var26, var40 - 1, var20 + var27, Class390.field_81.field_2151);
                                    }
                                 }
                              }
                           }

                           var19 += var17;
                           var20 += var18;
                           var1.method_470(var19, var40, var20, 0);
                           var1.method_470(var19, var40 + 1, var20, 0);
                           break;
                        }
                     }
                  }
            }
         }
      }

      int var35 = var4 + (var11 + 1) * 4 + 1;

      for (int var41 = 0; var41 <= 1; var41++) {
         var1.method_470(var9 + var3, var35 + var41, -var9 + var5, Class390.field_1583.field_2151);
         var1.method_470(-var9 + var3, var35 + var41, var9 + var5, Class390.field_1583.field_2151);
         var1.method_470(-var9 + var3, var35 + var41, -var9 + var5, Class390.field_1583.field_2151);
         var1.method_470(var9 + var3, var35 + var41, var9 + var5, Class390.field_1583.field_2151);
      }

      if (var2.nextInt(10) == 0) {
         var1.method_470(var3, var35 + var9, var5, Class390.field_2597.field_2151);
         var1.method_470(var3, var35 + var9 - 1, var5, Class390.field_1583.field_2151);

         for (int var42 = 0; var42 < var9 - 1; var42++) {
            for (int var48 = -var9 + 1 + var42; var48 <= var9 - 1 - var42; var48++) {
               for (int var51 = -var9 + 1 + var42; var51 <= var9 - 1 - var42; var51++) {
                  var1.method_470(var3 + var48, var35 + var42, var5 + var51, Class390.field_2540.field_2151);
               }
            }
         }
      } else {
         for (int var43 = 0; var43 <= 1; var43++) {
            var1.method_470(var9 - 1 + var3, var35 + var43, -var9 + 1 + var5, Class390.field_1892.field_2151);
            var1.method_470(-var9 + 1 + var3, var35 + var43, var9 - 1 + var5, Class390.field_1892.field_2151);
            var1.method_470(-var9 + 1 + var3, var35 + var43, -var9 + 1 + var5, Class390.field_1892.field_2151);
            var1.method_470(var9 - 1 + var3, var35 + var43, var9 - 1 + var5, Class390.field_1892.field_2151);
         }

         var1.method_470(var9 - 2 + var3, var35, -var9 + 1 + var5, Class390.field_1892.field_2151);
         var1.method_470(-var9 + 2 + var3, var35, var9 - 1 + var5, Class390.field_1892.field_2151);
         var1.method_470(-var9 + 2 + var3, var35, -var9 + 1 + var5, Class390.field_1892.field_2151);
         var1.method_470(var9 - 2 + var3, var35, var9 - 1 + var5, Class390.field_1892.field_2151);
         var1.method_470(var9 - 1 + var3, var35, -var9 + 2 + var5, Class390.field_1892.field_2151);
         var1.method_470(-var9 + 1 + var3, var35, var9 - 2 + var5, Class390.field_1892.field_2151);
         var1.method_470(-var9 + 1 + var3, var35, -var9 + 2 + var5, Class390.field_1892.field_2151);
         var1.method_470(var9 - 1 + var3, var35, var9 - 2 + var5, Class390.field_1892.field_2151);
      }

      for (int var36 = 0; var36 <= var11; var36++) {
         if (var11 != var36) {
            int var44 = var2.nextInt(4);
            int var49 = (1 + var2.nextInt(var9 - 2)) * (var2.nextInt(2) * 2 - 1);
            int var52 = 0;
            int var53 = 0;
            switch (var44) {
               case 0:
                  var52 = var3 + var49;
                  var53 = var5 + var9 - 2;
                  break;
               case 1:
                  var52 = var3 + var49;
                  var53 = var5 - var9 + 2;
                  break;
               case 2:
                  var52 = var3 + var9 - 2;
                  var53 = var5 + var49;
                  break;
               case 3:
                  var52 = var3 - var9 + 2;
                  var53 = var5 + var49;
            }

            for (int var54 = 1; var54 <= 4; var54++) {
               var1.method_470(var52, var4 + var54 + var36 * 4, var53, Class108.field_2568.field_2151);
               var1.method_1342(var52, var4 + var54 + var36 * 4, var53, var44 + 2);
            }
         }
      }

      this.field_2967.put(var6, var12);
      return var12;
   }

   private void method_4(Class454 var1, Random var2) {
      label154:
      for (Entry var4 : this.field_2967.entrySet()) {
         if (var4.getValue() != null && ((Class25.Inner26)var4.getValue()).field_2452 >= 8) {
            Class25.Inner26 var5 = (Class25.Inner26)var4.getValue();

            for (int var6 = 4; var6 < var5.field_2452 - 3; var6++) {
               label110:
               for (int var7 = 0; var7 < 4; var7++) {
                  for (int var8 = 0; var8 < 3; var8++) {
                     if (var5.field_2348.get(var6 + var8)[var7] != Class25.Inner727.field_2707) {
                        continue label110;
                     }
                  }

                  int var22 = 0;
                  int var9 = (var7 & 2) - 1;
                  if (var7 % 2 == 1) {
                     var22 = var9;
                     var9 = 0;
                  }

                  Class475 var10 = new Class475((Class475)var4.getKey());
                  var10.method_173(var22, var9);
                  Class25.Inner26 var11 = this.field_2967.get(var10);
                  if (var11 != null) {
                     int var12 = Math.max(Math.abs(var11.field_2743 - var5.field_2743), Math.abs(var11.field_2743 - var5.field_2743));
                     if (var12 - var11.field_1801 - var5.field_1801 < 5) {
                        continue;
                     }
                  }

                  if (var2.nextInt(10) == 0) {
                     int var23 = var22 * var5.field_1801 + var5.field_2743;
                     int var24 = var9 * var5.field_1801 + var5.field_832;
                     int var25 = var9;
                     int var13 = var22;
                     var1.method_470(var23, var5.field_787 + var6 * 4 + 2, var24, Class390.field_3125.field_2151);
                     var1.method_470(var23, var5.field_787 + var6 * 4 + 8, var24, Class390.field_3125.field_2151);
                     var1.method_470(var23 + var22, var5.field_787 + var6 * 4 + 2, var24 + var9, Class390.field_3125.field_2151);
                     var1.method_470(var23 + var22, var5.field_787 + var6 * 4 + 8, var24 + var9, Class390.field_3125.field_2151);

                     int[] var14;
                     for (var14 = new int[]{var2.nextInt(5) + 1, var2.nextInt(5) + 1, var2.nextInt(5) + 1, var2.nextInt(5) + 1};
                        Math.abs(var14[0] - var14[2]) == 1;
                        var14[2] = var2.nextInt(5) + 1
                     ) {
                        var14[0] = var2.nextInt(5) + 1;
                     }

                     while (Math.abs(var14[1] - var14[3]) == 1) {
                        var14[1] = var2.nextInt(5) + 1;
                        var14[3] = var2.nextInt(5) + 1;
                     }

                     for (int var15 = var5.field_787 + var6 * 4 + 1; var15 <= var5.field_787 + var6 * 4 + 9; var15++) {
                        for (int var16 = 0; var16 < 3; var16++) {
                           boolean var17 = var16 == 1 && var15 != var5.field_787 + var6 * 4 + 1 && var15 != var5.field_787 + var6 * 4 + 9;
                           var1.method_470(
                              var23 + var22 * (2 + var16),
                              var15,
                              var24 + var9 * (2 + var16),
                              !var17 ? Class390.field_1476.field_2151 : Class390.field_2041.field_2151
                           );
                           if (var17) {
                              for (byte var18 = -1; var18 <= 1; var18 += 2) {
                                 byte var19 = 0;
                                 var25 *= var18;
                                 var13 *= var18;
                                 if (var25 == 1) {
                                    var19 = 5;
                                 } else if (var25 == -1) {
                                    var19 = 4;
                                 } else if (var13 == 1) {
                                    var19 = 3;
                                 } else if (var13 == -1) {
                                    var19 = 2;
                                 }

                                 var25 *= var18;
                                 var13 *= var18;
                                 int var20 = var15 - (var5.field_787 + var6 * 4 + 1);
                                 if (var20 != var14[var18 + 1] && var20 != var14[var18 + 2]) {
                                    int var21 = var2.nextBoolean() ? Class390.field_13.field_2151 : Class390.field_2958.field_2151;
                                    var1.method_1193(
                                       var23 + var22 * (2 + var16) + var25 * var18,
                                       var15,
                                       var24 + var9 * (2 + var16) + var13 * var18,
                                       var21 + var2.nextInt(5),
                                       var19
                                    );
                                 }
                              }
                           }
                        }
                     }
                     continue label154;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      if (Math.abs(var3) < 64 && Math.abs(var5) < 64) {
         return false;
      }

      this.method_904(var1, var2, var3, var4, var5, new Class475(Class100.method_1640(var3, 196), Class100.method_1640(var5, 196)), 0);
      this.method_4(var1, var2);
      return true;
   }

   private Class517 method_1291(int var1, int var2, Random var3) {
      Class475 var4 = new Class475(var1 / 1000, var2 / 1000);
      if (this.field_2039.containsKey(var4)) {
         return this.field_2039.get(var4);
      }

      Class517 var5 = new Class517(var3, var4);
      this.field_2039.put(var4, var5);
      return var5;
   }

   public Class25(Random var1) {
   }

   private static class Inner26 {
      public int field_1801;
      public int field_2452;
      public int field_2743;
      public int field_787;
      public int field_832;
      public List<Class25.Inner727[]> field_2348 = new ArrayList<>();

      public Inner26(int var1, int var2, int var3, int var4, int var5) {
         this.field_1801 = var1;
         this.field_2452 = var2;
         this.field_2743 = var3;
         this.field_787 = var4;
         this.field_832 = var5;
      }
   }

   private enum Inner727 {
      field_2707,
      field_2437,
      field_2339;

      public static Class25.Inner727[] method_941() {
         return (Class25.Inner727[])field_1736.clone();
      }

      public static Class25.Inner727 method_719(String var0) {
         return Enum.valueOf(Class25.Inner727.class, var0);
      }
   }
}
