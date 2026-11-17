package srv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class Class70 extends Class19 {
   public static int field_1571 = 25;
   private final Map<Class312, Class70.Inner71> field_877 = new HashMap<>();
   private final HashMap<Class312, Class322> field_1353 = new HashMap<>();

   private Class70.Inner71 method_699(Class317 var1, Random var2, int var3, int var4, int var5, Class312 var6, int var7) {
      return this.method_52(var1, var2, var3, var4, var5, var6, var7, new Class259<>(0));
   }

   private Class70.Inner71 method_52(Class317 var1, Random var2, int var3, int var4, int var5, Class312 var6, int var7, Class259<Integer> var8) {
      if (this.field_877.containsKey(var6)) {
         return null;
      }

      this.field_877.put(var6, null);
      if (var1.method_813(var3, var4, var5) != 0) {
         return null;
      }

      while (var1.method_813(var3, var4, var5) == 0) {
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
      Class70.Inner71 var12 = new Class70.Inner71(var9, var11, var3, var4, var5);

      for (int var13 = -var9 + 1; var13 <= var9 - 1; var13++) {
         for (int var14 = 1; var14 <= 3; var14++) {
            for (int var15 = 0; var15 <= var11; var15++) {
               var1.method_260(var13 + var3, var4 + 4 * var15 + var14, -var9 + 1 + var5, Class323.field_883.field_1379);
               var1.method_260(var13 + var3, var4 + 4 * var15 + var14, var9 - 1 + var5, Class323.field_883.field_1379);
               var1.method_260(-var9 + 1 + var3, var4 + 4 * var15 + var14, var13 + var5, Class323.field_883.field_1379);
               var1.method_260(var9 - 1 + var3, var4 + 4 * var15 + var14, var13 + var5, Class323.field_883.field_1379);
            }
         }
      }

      for (int var31 = -var9; var31 <= var9; var31++) {
         for (int var37 = -var9; var37 <= var9; var37++) {
            for (int var45 = 0; var45 <= var11 + 1; var45++) {
               var1.method_260(var31 + var3, var4 + 4 * var45, var37 + var5, Class323.field_1129.field_1379);
            }
         }
      }

      for (int var32 = 1; var32 <= 3; var32++) {
         for (int var38 = 0; var38 <= var11; var38++) {
            var1.method_260(var9 + var3, var4 + 4 * var38 + var32, -var9 + var5, Class323.field_1085.field_1379);
            var1.method_260(-var9 + var3, var4 + 4 * var38 + var32, var9 + var5, Class323.field_1085.field_1379);
            var1.method_260(-var9 + var3, var4 + 4 * var38 + var32, -var9 + var5, Class323.field_1085.field_1379);
            var1.method_260(var9 + var3, var4 + 4 * var38 + var32, var9 + var5, Class323.field_1085.field_1379);
         }
      }

      for (int var33 = -var9 + 1; var33 <= var9 - 1; var33++) {
         for (int var39 = -var9 + 1; var39 <= var9 - 1; var39++) {
            for (int var46 = var4 - 1; var46 > 0 && var1.method_813(var33 + var3, var46, var39 + var5) == 0; var46--) {
               var1.method_260(var33 + var3, var46, var39 + var5, Class323.field_1085.field_1379);
            }
         }
      }

      for (int var34 = 0; var34 < var11; var34++) {
         int var40 = var4 + 1 + 4 * var34;
         Class70.Inner209[] var47 = new Class70.Inner209[4];
         var12.field_2.add(var47);

         for (int var16 = 0; var16 < 4; var16++) {
            var47[var16] = Class70.Inner209.field_257;
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
                  var1.method_260(var19, var40 + 1, var20, Class323.field_930.field_1379);
                  var47[var50] = Class70.Inner209.field_983;
                  break;
               case 2:
                  Class312 var21 = new Class312(var6.method_877() + var17, var6.method_215() + var18);
                  if (!this.field_877.containsKey(var21)) {
                     var47[var50] = Class70.Inner209.field_1151;

                     for (int var22 = 0; var22 <= var7 / 2 + 1; var22++) {
                        if (var2.nextInt(var7 + 1) == 0 && (Integer)var8.field_334 < field_1571) {
                           Class259 var23 = var8;
                           Integer var24 = (Integer)var23.field_334;
                           var23.field_334 = (T)(Integer)var23.field_334 + 1;
                           int var57 = var9 + 8 + var2.nextInt(3);
                           Class70.Inner71 var58 = this.method_52(var1, var2, var3 + var17 * var57, 128, var5 + var18 * var57, var21, var7 + 1, var8);
                           if (var58 == null || var58.field_647 + (var58.field_1486 + 1) * 4 < var40) {
                              break;
                           }

                           var1.method_260(var19, var40, var20, 0);
                           var1.method_260(var19, var40 + 1, var20, 0);

                           for (int var25 = var9; var25 < var57 - var58.field_990 + 1; var25++) {
                              var19 += var17;
                              var20 += var18;

                              for (int var26 = -1; var26 <= 1; var26++) {
                                 for (int var27 = -1; var27 <= 1; var27++) {
                                    if (var1.method_813(var19 + var26, var40 - 1, var20 + var27) == 0) {
                                       var1.method_260(var19 + var26, var40 - 1, var20 + var27, Class323.field_250.field_1379);
                                    }
                                 }
                              }
                           }

                           var19 += var17;
                           var20 += var18;
                           var1.method_260(var19, var40, var20, 0);
                           var1.method_260(var19, var40 + 1, var20, 0);
                           break;
                        }
                     }
                  }
            }
         }
      }

      int var35 = var4 + (var11 + 1) * 4 + 1;

      for (int var41 = 0; var41 <= 1; var41++) {
         var1.method_260(var9 + var3, var35 + var41, -var9 + var5, Class323.field_1085.field_1379);
         var1.method_260(-var9 + var3, var35 + var41, var9 + var5, Class323.field_1085.field_1379);
         var1.method_260(-var9 + var3, var35 + var41, -var9 + var5, Class323.field_1085.field_1379);
         var1.method_260(var9 + var3, var35 + var41, var9 + var5, Class323.field_1085.field_1379);
      }

      if (var2.nextInt(10) == 0) {
         var1.method_260(var3, var35 + var9, var5, Class323.field_1307.field_1379);
         var1.method_260(var3, var35 + var9 - 1, var5, Class323.field_1085.field_1379);

         for (int var42 = 0; var42 < var9 - 1; var42++) {
            for (int var48 = -var9 + 1 + var42; var48 <= var9 - 1 - var42; var48++) {
               for (int var51 = -var9 + 1 + var42; var51 <= var9 - 1 - var42; var51++) {
                  var1.method_260(var3 + var48, var35 + var42, var5 + var51, Class323.field_415.field_1379);
               }
            }
         }
      } else {
         for (int var43 = 0; var43 <= 1; var43++) {
            var1.method_260(var9 - 1 + var3, var35 + var43, -var9 + 1 + var5, Class323.field_883.field_1379);
            var1.method_260(-var9 + 1 + var3, var35 + var43, var9 - 1 + var5, Class323.field_883.field_1379);
            var1.method_260(-var9 + 1 + var3, var35 + var43, -var9 + 1 + var5, Class323.field_883.field_1379);
            var1.method_260(var9 - 1 + var3, var35 + var43, var9 - 1 + var5, Class323.field_883.field_1379);
         }

         var1.method_260(var9 - 2 + var3, var35, -var9 + 1 + var5, Class323.field_883.field_1379);
         var1.method_260(-var9 + 2 + var3, var35, var9 - 1 + var5, Class323.field_883.field_1379);
         var1.method_260(-var9 + 2 + var3, var35, -var9 + 1 + var5, Class323.field_883.field_1379);
         var1.method_260(var9 - 2 + var3, var35, var9 - 1 + var5, Class323.field_883.field_1379);
         var1.method_260(var9 - 1 + var3, var35, -var9 + 2 + var5, Class323.field_883.field_1379);
         var1.method_260(-var9 + 1 + var3, var35, var9 - 2 + var5, Class323.field_883.field_1379);
         var1.method_260(-var9 + 1 + var3, var35, -var9 + 2 + var5, Class323.field_883.field_1379);
         var1.method_260(var9 - 1 + var3, var35, var9 - 2 + var5, Class323.field_883.field_1379);
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
               var1.method_260(var52, var4 + var54 + var36 * 4, var53, Class371.field_83.field_1379);
               var1.method_549(var52, var4 + var54 + var36 * 4, var53, var44 + 2);
            }
         }
      }

      this.field_877.put(var6, var12);
      return var12;
   }

   private void method_828(Class317 var1, Random var2) {
      label158:
      for (Entry var4 : this.field_877.entrySet()) {
         if (var4.getValue() != null && ((Class70.Inner71)var4.getValue()).field_1486 >= 8) {
            Class70.Inner71 var5 = (Class70.Inner71)var4.getValue();

            for (int var6 = 4; var6 < var5.field_1486 - 3; var6++) {
               label114:
               for (int var7 = 0; var7 < 4; var7++) {
                  for (int var8 = 0; var8 < 3; var8++) {
                     if (var5.field_2.get(var6 + var8)[var7] != Class70.Inner209.field_257) {
                        continue label114;
                     }
                  }

                  int var22 = 0;
                  int var9 = (var7 & 2) - 1;
                  if (var7 % 2 == 1) {
                     var22 = var9;
                     var9 = 0;
                  }

                  Class312 var10 = new Class312((Class312)var4.getKey());
                  var10.method_781(var22, var9);
                  Class70.Inner71 var11 = this.field_877.get(var10);
                  if (var11 != null) {
                     int var12 = Math.max(Math.abs(var11.field_960 - var5.field_960), Math.abs(var11.field_960 - var5.field_960));
                     if (var12 - var11.field_990 - var5.field_990 < 5) {
                        continue;
                     }
                  }

                  if (var2.nextInt(10) == 0) {
                     int var23 = var22 * var5.field_990 + var5.field_960;
                     int var24 = var9 * var5.field_990 + var5.field_568;
                     int var25 = var9;
                     int var13 = var22;
                     var1.method_260(var23, var5.field_647 + var6 * 4 + 2, var24, Class323.field_1342.field_1379);
                     var1.method_260(var23, var5.field_647 + var6 * 4 + 8, var24, Class323.field_1342.field_1379);
                     var1.method_260(var23 + var22, var5.field_647 + var6 * 4 + 2, var24 + var9, Class323.field_1342.field_1379);
                     var1.method_260(var23 + var22, var5.field_647 + var6 * 4 + 8, var24 + var9, Class323.field_1342.field_1379);

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

                     for (int var15 = var5.field_647 + var6 * 4 + 1; var15 <= var5.field_647 + var6 * 4 + 9; var15++) {
                        for (int var16 = 0; var16 < 3; var16++) {
                           boolean var17 = var16 == 1 && var15 != var5.field_647 + var6 * 4 + 1 && var15 != var5.field_647 + var6 * 4 + 9;
                           var1.method_260(
                              var23 + var22 * (2 + var16),
                              var15,
                              var24 + var9 * (2 + var16),
                              !var17 ? Class323.field_313.field_1379 : Class323.field_567.field_1379
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
                                 int var20 = var15 - (var5.field_647 + var6 * 4 + 1);
                                 if (var20 != var14[var18 + 1] && var20 != var14[var18 + 2]) {
                                    int var21 = var2.nextBoolean() ? Class323.field_1453.field_1379 : Class323.field_1023.field_1379;
                                    if (var15 > 0 && var15 < 128) {
                                       var1.method_86(
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
                     }
                     continue label158;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      if (Math.abs(var3) < 64 && Math.abs(var5) < 64) {
         return false;
      }

      this.method_699(var1, var2, var3, var4, var5, new Class312(Class156.method_859(var3, 196), Class156.method_859(var5, 196)), 0);
      this.method_828(var1, var2);
      return true;
   }

   private Class322 method_706(int var1, int var2, Random var3) {
      Class312 var4 = new Class312(var1 / 1000, var2 / 1000);
      if (this.field_1353.containsKey(var4)) {
         return this.field_1353.get(var4);
      }

      Class322 var5 = new Class322(var3, var4);
      this.field_1353.put(var4, var5);
      return var5;
   }

   public Class70(Random var1) {
   }

   private enum Inner209 {
      field_257,
      field_983,
      field_1151;

      public static Class70.Inner209[] method_443() {
         return (Class70.Inner209[])field_1369.clone();
      }

      public static Class70.Inner209 method_434(String var0) {
         return Enum.valueOf(Class70.Inner209.class, var0);
      }
   }

   private static class Inner71 {
      public int field_990;
      public int field_1486;
      public int field_960;
      public int field_647;
      public int field_568;
      public List<Class70.Inner209[]> field_2 = new ArrayList<>();

      public Inner71(int var1, int var2, int var3, int var4, int var5) {
         this.field_990 = var1;
         this.field_1486 = var2;
         this.field_960 = var3;
         this.field_647 = var4;
         this.field_568 = var5;
      }
   }
}
