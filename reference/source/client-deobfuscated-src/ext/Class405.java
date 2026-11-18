package ext;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class Class405 implements Interface752 {
   public final Class99 field_902;
   private Random field_2123;
   private Class387 field_2328;
   private Class387 field_533;
   private Class387 field_892;
   private Class387 field_951;
   private Class387 field_2026;
   public Class387 field_625;
   public Class387 field_1444;
   public Class387 field_1287;
   public Class107 field_1829;
   public Class387 field_2183;
   private Class454 field_2533;
   private double[] field_656;
   private double[] field_2705 = new double[256];
   private double[] field_447 = new double[256];
   private double[] field_295 = new double[256];
   private Class414 field_1495 = new Class298();
   double[] field_2585;
   double[] field_191;
   double[] field_940;
   double[] field_424;
   double[] field_1896;
   int[][] field_2218 = new int[32][32];
   private int field_1062 = 0;
   private long field_1554 = 0L;

   public Class405(Class454 var1, long var2) {
      this.field_2533 = var1;
      this.field_2123 = new Random(var2);
      this.field_2328 = new Class387(this.field_2123, 16);
      this.field_533 = new Class387(this.field_2123, 16);
      this.field_892 = new Class387(this.field_2123, 8);
      this.field_951 = new Class387(this.field_2123, 4);
      this.field_2026 = new Class387(this.field_2123, 4);
      this.field_625 = new Class387(this.field_2123, 10);
      this.field_1444 = new Class387(this.field_2123, 16);
      this.field_1287 = new Class387(this.field_2123, 5);
      this.field_2183 = new Class387(this.field_2123, 8);
      this.field_902 = new Class99(this.field_2123);
   }

   public void method_1643(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 64;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.field_656 = this.method_499(this.field_656, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for (int var9 = 0; var9 < var4; var9++) {
         for (int var10 = 0; var10 < var4; var10++) {
            for (int var11 = 0; var11 < 16; var11++) {
               double var12 = 0.125;
               double var14 = this.field_656[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.field_656[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.field_656[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.field_656[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.field_656[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.field_656[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.field_656[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.field_656[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for (int var30 = 0; var30 < 8; var30++) {
                  double var31 = 0.25;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for (int var41 = 0; var41 < 4; var41++) {
                     int var42 = var41 + var9 * 4 << 11 | 0 + var10 * 4 << 7 | var11 * 8 + var30;
                     short var43 = 128;
                     double var44 = 0.25;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for (int var50 = 0; var50 < 4; var50++) {
                        int var51 = 0;
                        if (var11 * 8 + var30 < var5) {
                           if (this.field_2533.field_743 && var11 * 8 + var30 >= var5 - 1) {
                              var51 = Class108.field_2441.field_2151;
                           } else {
                              var51 = Class108.field_2883.field_2151;
                           }

                           if (this.field_2533.field_743 && var11 * 8 + var30 >= var5 - 1) {
                              var51 = Class108.field_1070.field_2151;
                           } else {
                              var51 = Class108.field_2692.field_2151;
                           }

                           if (this.field_2533.field_2807 && var11 * 8 + var30 >= var5 - 1) {
                              var51 = Class108.field_2692.field_2151;
                           } else {
                              var51 = Class108.field_2883.field_2151;
                           }
                        }

                        if (var46 > 0.0) {
                           var51 = Class108.field_720.field_2151;
                        }

                        var3[var42] = (byte)var51;
                        var42 += var43;
                        var46 += var48;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }
   }

   public void method_1565(int var1, int var2, byte[] var3) {
      byte var4 = (byte)Class108.field_2692.field_2151;
      byte var5 = (byte)Class108.field_2692.field_2151;
      byte var6 = 64;
      double var7 = 0.03125;
      this.field_2705 = this.field_951.method_552(this.field_2705, var1 * 16, var2 * 16, 0.0, 16, 16, 1, var7, var7, 1.0);
      this.field_447 = this.field_951.method_552(this.field_447, var2 * 16, 109.0134, var1 * 16, 16, 1, 16, var7, 1.0, var7);
      this.field_295 = this.field_2026.method_552(this.field_295, var1 * 16, var2 * 16, 0.0, 16, 16, 1, var7 * 2.0, var7 * 2.0, var7 * 2.0);

      for (int var9 = 0; var9 < 16; var9++) {
         for (int var10 = 0; var10 < 16; var10++) {
            boolean var11 = this.field_2705[var9 + var10 * 16] + this.field_2123.nextDouble() * 0.2 > 0.0;
            boolean var12 = this.field_447[var9 + var10 * 16] + this.field_2123.nextDouble() * 0.2 > 3.0;
            int var13 = (int)(this.field_295[var9 + var10 * 16] / 3.0 + 3.0 + this.field_2123.nextDouble() * 0.25);
            int var14 = -1;
            byte var15;
            byte var16;
            if (this.field_2533.field_2807) {
               var15 = var4;
               var16 = var5;
            } else {
               var15 = (byte)Class108.field_1970.field_2151;
               var16 = (byte)Class108.field_1047.field_2151;
            }

            for (int var17 = 127; var17 >= 0; var17--) {
               int var18 = (var9 * 16 + var10) * 128 + var17;
               if (var17 >= 95 + this.field_2123.nextInt(6) - 1 && var3[var18] != 0) {
                  var3[var18] = (byte)Class108.field_1674.field_2151;

                  for (int var19 = (int)(this.field_1287.method_385(var1 * 13.2, var2 * 13.2) / 2.0); var19 > 0; var19--) {
                     if (var19 + var17 < 128 && var18 + var19 < var3.length && var3[var18 + var19] == 0) {
                        var3[var19 + var18] = (byte)Class108.field_2441.field_2151;
                     }
                  }
               }

               if (var17 <= this.field_2123.nextInt(6) - 1) {
                  var3[var18] = (byte)Class108.field_2945.field_2151;
               } else {
                  byte var20 = var3[var18];
                  if (var20 == 0) {
                     var14 = -1;
                  } else if (var20 == Class108.field_720.field_2151) {
                     if (var14 == -1) {
                        if (var13 <= 0) {
                           var15 = 0;
                           var16 = (byte)Class108.field_720.field_2151;
                        } else if (var17 >= var6 - 4 && var17 <= var6 + 1) {
                           var15 = (byte)Class108.field_1970.field_2151;
                           var16 = (byte)Class108.field_1047.field_2151;
                           if (this.field_2533.field_2807) {
                              var15 = var4;
                              var16 = var5;
                           }

                           if (var12) {
                              var15 = 0;
                           }

                           if (var12) {
                              var16 = (byte)Class108.field_1741.field_2151;
                           }

                           if (var11) {
                              var15 = (byte)Class108.field_2692.field_2151;
                           }

                           if (var11) {
                              var16 = (byte)Class108.field_2692.field_2151;
                           }
                        }

                        if (var17 < var6 && var15 == 0) {
                           var15 = (byte)Class108.field_2883.field_2151;
                        }

                        var14 = var13;
                        if (var17 >= var6 - 1) {
                           var3[var18] = var15;
                        } else {
                           var3[var18] = var16;
                        }
                     } else if (var14 > 0) {
                        var14--;
                        var3[var18] = var16;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public Class741 method_1337(int var1, int var2) {
      if (Math.abs(System.currentTimeMillis() - this.field_1554) > 5000L) {
         SimpleDateFormat var3 = new SimpleDateFormat("HH");
         this.field_1062 = Integer.parseInt(var3.format(Calendar.getInstance().getTime()));
         this.field_1554 = System.currentTimeMillis();
      }

      boolean var8 = Class310.field_742 || this.field_1062 > 22 || this.field_1062 < 5;
      this.field_2123.setSeed(var1 * 341873128712L + var2 * 132897987541L);
      byte[] var4 = new byte[32768];
      Class741 var5 = new Class741(this.field_2533, var4, var1, var2);
      var1 += var8 ? this.field_2123.nextInt(2000) - this.field_2123.nextInt(1000) : 0;
      var2 += var8 ? this.field_2123.nextInt(2000) - this.field_2123.nextInt(1000) : 0;
      if (!Class310.field_254 && !(this.field_2533 instanceof Class262)) {
         this.method_1643(var1, var2, var4);
         this.method_1565(var1, var2, var4);
         this.field_1495.method_147(this, this.field_2533, var1, var2, var4);
         var5.method_1475();
      }

      return var5;
   }

   private double[] method_499(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412;
      double var10 = 684.412;
      this.field_424 = this.field_625.method_552(this.field_424, var2, var3, var4, var5, 1, var7, 1.0, 0.0, 1.0);
      this.field_1896 = this.field_1444.method_552(this.field_1896, var2, var3, var4, var5, 1, var7, 100.0, 0.0, 100.0);
      this.field_2585 = this.field_892.method_552(this.field_2585, var2, var3, var4, var5, var6, var7, var8 / 80.0, var10 / 160.0, var8 / 80.0);
      this.field_191 = this.field_2328.method_552(this.field_191, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.field_940 = this.field_533.method_552(this.field_940, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for (int var14 = 0; var14 < var5; var14++) {
         for (int var15 = 0; var15 < var7; var15++) {
            double var16 = (this.field_424[var13] + 256.0) / 512.0;
            if (var16 > 1.0) {
               var16 = 1.0;
            }

            double var18 = 0.0;
            double var20 = this.field_1896[var13] / 8000.0;
            if (var20 < 0.0) {
               var20 = -var20;
            }

            var20 = var20 * 3.0 - 3.0;
            if (var20 < 0.0) {
               var20 /= 2.0;
               if (var20 < -1.0) {
                  var20 = -1.0;
               }

               var20 /= 1.4;
               var20 /= 2.0;
               var16 = 0.0;
            } else {
               if (var20 > 1.0) {
                  var20 = 1.0;
               }

               var20 /= 6.0;
            }

            var16 += 0.5;
            var20 = var20 * var6 / 16.0;
            double var22 = var6 / 2.0 + var20 * 4.0;
            var13++;

            for (int var24 = 0; var24 < var6; var24++) {
               double var25 = 0.0;
               double var27 = (var24 - var22) * 12.0 / var16;
               if (var27 < 0.0) {
                  var27 *= 4.0;
               }

               double var29 = this.field_191[var12] / 512.0;
               double var31 = this.field_940[var12] / 512.0;
               double var33 = (this.field_2585[var12] / 10.0 + 1.0) / 2.0;
               if (var33 < 0.0) {
                  var25 = var29;
               } else if (var33 > 1.0) {
                  var25 = var31;
               } else {
                  var25 = var29 + (var31 - var29) * var33;
               }

               var25 -= var27;
               if (var24 > var6 - 4) {
                  double var35 = (var24 - (var6 - 4)) / 3.0F;
                  var25 = var25 * (1.0 - var35) + -10.0 * var35;
               }

               if (var24 < var18) {
                  double var45 = (var18 - var24) / 4.0;
                  if (var45 < 0.0) {
                     var45 = 0.0;
                  }

                  if (var45 > 1.0) {
                     var45 = 1.0;
                  }

                  var25 = var25 * (1.0 - var45) + -10.0 * var45;
               }

               var1[var12] = var25;
               var12++;
            }
         }
      }

      return var1;
   }

   @Override
   public boolean method_972(int var1, int var2) {
      return true;
   }

   @Override
   public void method_1834(Interface752 var1, int var2, int var3) {
      Thread227.method_233(new Class169(this, var1, var2, var3), this);
   }

   public void method_744(Interface752 var1, int var2, int var3) {
      Class646.field_1552 = true;
      Interface127.Inner128 var7 = Interface127.Inner128.method_555(this.field_2533.method_1805());
      Class457 var4 = var7.method_476(var2, var3, Class457.Inner598.field_2556);
      Class457 var5 = var7.method_476(var2, var3, Class457.Inner598.field_2018);
      Class457 var6 = var7.method_476(var2, var3, Class457.Inner598.field_240);
      int var26 = var2 * 16;
      int var8 = var3 * 16;
      this.field_2123.setSeed(this.field_2533.field_482);
      long var9 = this.field_2123.nextLong() / 2L * 2L + 1L;
      long var11 = this.field_2123.nextLong() / 2L * 2L + 1L;
      this.field_2123.setSeed(var2 * var9 + var3 * var11 ^ this.field_2533.field_482);
      double var13 = 0.25;
      int var15 = 3;
      if (!(this.field_2533 instanceof Class262) && !(this.field_2533 instanceof Class46)) {
         this.field_902.method_1174(this.field_2533, var2, var3);
      }

      if (var4.method_1583(this.field_2123, this.field_2533, var2, var3)) {
         label421:
         for (int var21 = 0; var21 < 16; var21++) {
            for (int var22 = 0; var22 < 16; var22++) {
               for (int var23 = 127; var23 > 97; var23--) {
                  if (this.field_2123.nextInt(70) == 0
                     && this.field_2533.method_197(var2 * 16 + var21, var23, var3 * 16 + var22) == Class108.field_1070.field_2151) {
                     var21 += var2 * 16;
                     var22 += var3 * 16;
                     this.field_2533.method_470(var21, ++var23, var22, Class108.field_2441.field_2151);
                     break label421;
                  }
               }
            }
         }

         boolean var137 = false;
         if (var4 instanceof Class12) {
            var137 = ((Class12)var4).field_2312 == 2;
         }

         Class641 var140 = var137 && this.field_2123.nextInt(40) == 0 ? new Class195().method_1872(var137) : new Class195();
         if (this.field_2123.nextInt(10) == 0) {
            var140 = var137 && this.field_2123.nextInt(50) == 0 ? new Class161().method_610(var137) : new Class161();
         }

         Class151 var143 = new Class151();

         for (int var17 = 0; var17 < var15; var17++) {
            int var18 = var26 + this.field_2123.nextInt(16) + 8;
            int var19 = var8 + this.field_2123.nextInt(16) + 8;
            var140.method_1421(1.0, 1.0, 1.0);
            var140.method_303(this.field_2533, this.field_2123, var18, this.field_2533.method_718(var18, var19), var19);
         }

         for (int var61 = 0; var61 < var15; var61++) {
            int var90 = var26 + this.field_2123.nextInt(8) + 8;
            int var119 = var8 + this.field_2123.nextInt(8) + 8;
            var143.method_1421(1.0, 1.0, 1.0);
            var143.method_303(this.field_2533, this.field_2123, var90, this.field_2533.method_718(var90, var119), var119);
         }

         for (int var62 = 0; var62 < 2; var62++) {
            int var91 = var26 + this.field_2123.nextInt(16) + 8;
            int var120 = this.field_2123.nextInt(128);
            int var20 = var8 + this.field_2123.nextInt(16) + 8;
            new Class610(Class108.field_1371.field_2151).method_303(this.field_2533, this.field_2123, var91, var120, var20);
         }

         for (int var24 = 0; var24 < 100; var24++) {
            int var63 = var26 + this.field_2123.nextInt(16) + 8;
            int var92 = this.field_2123.nextInt(128);
            int var121 = var8 + this.field_2123.nextInt(16) + 8;
            new Class123().method_303(this.field_2533, this.field_2123, var63, var92, var121);
         }

         if (this.field_2123.nextInt(2) == 0) {
            int var64 = var26 + this.field_2123.nextInt(16) + 8;
            int var93 = this.field_2123.nextInt(128);
            int var122 = var8 + this.field_2123.nextInt(16) + 8;
            new Class610(Class108.field_1120.field_2151).method_303(this.field_2533, this.field_2123, var64, var93, var122);
         }

         if (this.field_2123.nextInt(2) == 0) {
            int var65 = var26 + this.field_2123.nextInt(8) + 8;
            int var94 = this.field_2123.nextInt(128);
            int var123 = var8 + this.field_2123.nextInt(8) + 8;
            new Class610(Class390.field_2936.field_2151).method_303(this.field_2533, this.field_2123, var65, var94, var123);
         }

         if (this.field_2123.nextInt(4) == 0) {
            int var66 = var26 + this.field_2123.nextInt(16) + 8;
            int var95 = this.field_2123.nextInt(128);
            int var124 = var8 + this.field_2123.nextInt(16) + 8;
            new Class610(Class108.field_3124.field_2151).method_303(this.field_2533, this.field_2123, var66, var95, var124);
         }

         if (this.field_2123.nextInt(8) == 0) {
            int var67 = var26 + this.field_2123.nextInt(16) + 8;
            int var96 = this.field_2123.nextInt(128);
            int var125 = var8 + this.field_2123.nextInt(16) + 8;
            new Class610(Class108.field_2060.field_2151).method_303(this.field_2533, this.field_2123, var67, var96, var125);
         }

         if (this.field_2123.nextInt(10) == 0) {
            var15++;
         }

         if (!Minecraft.field_1601) {
            if (Class605.method_1162(this.field_2533, var26, var8)) {
               for (int var25 = 0; var25 != 50; var25++) {
                  if (this.field_2123.nextInt(8) == 0) {
                     int var68 = var26 + this.field_2123.nextInt(16) + 8;
                     int var97 = 50 + this.field_2123.nextInt(16);
                     int var126 = var8 + this.field_2123.nextInt(16) + 8;
                     new Class605().method_303(this.field_2533, this.field_2123, var68, var97, var126);
                  }
               }
            }

            for (int var144 = 0; var144 < 4; var144++) {
               new Class534(Class390.field_1479.field_2151)
                  .method_303(
                     this.field_2533,
                     this.field_2123,
                     var26 + this.field_2123.nextInt(16) + 8,
                     this.field_2123.nextInt(128),
                     var8 + this.field_2123.nextInt(16) + 8
                  );
            }

            for (int var145 = 0; var145 < 5; var145++) {
               new Class175(Class390.field_141.field_2151)
                  .method_303(
                     this.field_2533,
                     this.field_2123,
                     var26 + this.field_2123.nextInt(16) + 8,
                     this.field_2123.nextInt(128),
                     var8 + this.field_2123.nextInt(16) + 8
                  );
            }

            for (int var146 = 0; var146 < 5; var146++) {
               new Class318()
                  .method_303(
                     this.field_2533,
                     this.field_2123,
                     var26 + this.field_2123.nextInt(16) + 8,
                     this.field_2123.nextInt(10),
                     var8 + this.field_2123.nextInt(16) + 8
                  );
            }

            for (int var147 = 0; var147 < 16; var147++) {
               new Class382()
                  .method_303(
                     this.field_2533,
                     this.field_2123,
                     var26 + this.field_2123.nextInt(16) + 8,
                     this.field_2123.nextInt(128),
                     var8 + this.field_2123.nextInt(16) + 8
                  );
            }

            for (int var148 = 0; var148 < 3; var148++) {
               new Class18(Class390.field_854.field_2151)
                  .method_303(
                     this.field_2533,
                     this.field_2123,
                     var26 + this.field_2123.nextInt(16) + 8,
                     this.field_2123.nextInt(128),
                     var8 + this.field_2123.nextInt(16) + 8
                  );
            }
         }

         for (int var69 = 0; var69 < 10; var69++) {
            int var98 = var26 + this.field_2123.nextInt(16) + 8;
            int var127 = this.field_2123.nextInt(128);
            int var132 = var8 + this.field_2123.nextInt(16) + 8;
            new Class674().method_303(this.field_2533, this.field_2123, var98, var127, var132);
         }

         for (int var70 = 0; var70 < 1; var70++) {
            int var99 = var26 + this.field_2123.nextInt(16) + 8;
            int var128 = this.field_2123.nextInt(128);
            int var133 = var8 + this.field_2123.nextInt(16) + 8;
            new Class643().method_303(this.field_2533, this.field_2123, var99, var128, var133);
         }

         for (int var71 = 0; var71 < 50; var71++) {
            int var100 = var26 + this.field_2123.nextInt(16) + 8;
            int var129 = this.field_2123.nextInt(this.field_2123.nextInt(120) + 8);
            int var134 = var8 + this.field_2123.nextInt(16) + 8;
            new Class339(Class108.field_536.field_2151).method_303(this.field_2533, this.field_2123, var100, var129, var134);
         }

         for (int var72 = 0; var72 < 20; var72++) {
            int var101 = var26 + this.field_2123.nextInt(16) + 8;
            int var130 = this.field_2123.nextInt(this.field_2123.nextInt(this.field_2123.nextInt(112) + 8) + 8);
            int var135 = var8 + this.field_2123.nextInt(16) + 8;
            new Class339(Class108.field_1423.field_2151).method_303(this.field_2533, this.field_2123, var101, var130, var135);
         }

         for (int var73 = var26 + 8; var73 < var26 + 8 + 16; var73++) {
            for (int var102 = var8 + 8; var102 < var8 + 8 + 16; var102++) {
               int var131 = this.field_2533.method_451(var73, var102);
               if (this.field_2533.field_743
                  && var131 > 0
                  && var131 < 128
                  && this.field_2533.method_197(var73, var131, var102) == 0
                  && this.field_2533.method_1286(var73, var131 - 1, var102).method_1552()
                  && this.field_2533.method_1286(var73, var131 - 1, var102) != Class160.field_1644) {
                  this.field_2533.method_1481(var73, var131, var102, Class108.field_1070.field_2151);
               }
            }
         }
      }

      if (!Minecraft.field_1601) {
         for (int var138 = 0; var138 != 8; var138++) {
            for (int var141 = 0; var141 != 4; var141++) {
               int var16 = var26 + var138 * 2;
               int var74 = 5 + this.field_2123.nextInt(2);
               int var103 = var8 + var141 * 4;
               new Class102(2 + this.field_2123.nextInt(3), var26, var8).method_303(this.field_2533, this.field_2123, var16, var74, var103);
               var6.method_1583(this.field_2123, this.field_2533, var2, var3);
            }
         }
      }

      if (var5.method_1583(this.field_2123, this.field_2533, var2, var3)) {
         var13 = 0.5;
         var15 = (int)((this.field_2183.method_385(var26 * var13, var8 * var13) / 8.0 + this.field_2123.nextDouble() * 4.0 + 4.0) / 3.0);
         if (var15 < 0) {
            boolean var30 = false;
         }

         for (int var31 = 0; var31 < 8; var31++) {
            int var46 = var26 + this.field_2123.nextInt(16) + 8;
            int var75 = this.field_2123.nextInt(128);
            int var104 = var8 + this.field_2123.nextInt(16) + 8;
            new Class434().method_303(this.field_2533, this.field_2123, var46, var75, var104);
         }

         for (int var32 = 0; var32 < 1; var32++) {
            int var47 = var26 + this.field_2123.nextInt(64) + 8;
            int var76 = this.field_2123.nextInt(5) + 55;
            int var105 = var8 + this.field_2123.nextInt(64) + 8;
            new Class705().method_303(this.field_2533, this.field_2123, var47, var76, var105);
         }

         for (int var33 = 0; var33 < 10; var33++) {
            int var48 = var26 + this.field_2123.nextInt(16);
            int var77 = this.field_2123.nextInt(128);
            int var106 = var8 + this.field_2123.nextInt(16);
            new Class685(32).method_303(this.field_2533, this.field_2123, var48, var77, var106);
         }

         for (int var34 = 0; var34 < 20; var34++) {
            int var49 = var26 + this.field_2123.nextInt(16);
            int var78 = this.field_2123.nextInt(128);
            int var107 = var8 + this.field_2123.nextInt(16);
            new Class294(Class108.field_1047.field_2151, 32).method_303(this.field_2533, this.field_2123, var49, var78, var107);
         }

         for (int var35 = 0; var35 < 10; var35++) {
            int var50 = var26 + this.field_2123.nextInt(16);
            int var79 = this.field_2123.nextInt(128);
            int var108 = var8 + this.field_2123.nextInt(16);
            new Class294(Class108.field_1741.field_2151, 32).method_303(this.field_2533, this.field_2123, var50, var79, var108);
         }

         for (int var36 = 0; var36 < 20; var36++) {
            int var51 = var26 + this.field_2123.nextInt(16);
            int var80 = this.field_2123.nextInt(128);
            int var109 = var8 + this.field_2123.nextInt(16);
            new Class294(Class108.field_1028.field_2151, Class390.field_2682.field_2151, 16).method_303(this.field_2533, this.field_2123, var51, var80, var109);
         }

         for (int var37 = 0; var37 < 20; var37++) {
            int var52 = var26 + this.field_2123.nextInt(16);
            int var81 = this.field_2123.nextInt(64);
            int var110 = var8 + this.field_2123.nextInt(16);
            new Class294(Class108.field_508.field_2151, Class390.field_2480.field_2151, 8).method_303(this.field_2533, this.field_2123, var52, var81, var110);
         }

         for (int var38 = 0; var38 < 2; var38++) {
            int var53 = var26 + this.field_2123.nextInt(16);
            int var82 = this.field_2123.nextInt(32);
            int var111 = var8 + this.field_2123.nextInt(16);
            new Class294(Class108.field_1887.field_2151, Class390.field_91.field_2151, 8).method_303(this.field_2533, this.field_2123, var53, var82, var111);
         }

         for (int var39 = 0; var39 < 8; var39++) {
            int var54 = var26 + this.field_2123.nextInt(16);
            int var83 = this.field_2123.nextInt(16);
            int var112 = var8 + this.field_2123.nextInt(16);
            new Class294(Class108.field_36.field_2151, Class390.field_962.field_2151, 7).method_303(this.field_2533, this.field_2123, var54, var83, var112);
         }

         for (int var40 = 0; var40 < 4; var40++) {
            int var55 = var26 + this.field_2123.nextInt(16);
            int var84 = this.field_2123.nextInt(16);
            int var113 = var8 + this.field_2123.nextInt(16);
            new Class294(Class108.field_564.field_2151, Class390.field_1436.field_2151, 7).method_303(this.field_2533, this.field_2123, var55, var84, var113);
         }

         for (int var41 = 0; var41 < 4; var41++) {
            int var56 = var26 + this.field_2123.nextInt(16);
            int var85 = this.field_2123.nextInt(10);
            int var114 = var8 + this.field_2123.nextInt(16);
            new Class294(Class390.field_1735.field_2151, Class390.field_1735.field_2151, 3).method_303(this.field_2533, this.field_2123, var56, var85, var114);
         }

         for (int var42 = 0; var42 < 4; var42++) {
            int var57 = var26 + this.field_2123.nextInt(16);
            int var86 = this.field_2123.nextInt(10);
            int var115 = var8 + this.field_2123.nextInt(16);
            new Class294(Class390.field_178.field_2151, Class390.field_178.field_2151, 3).method_303(this.field_2533, this.field_2123, var57, var86, var115);
         }

         for (int var43 = 0; var43 < 4; var43++) {
            int var58 = var26 + this.field_2123.nextInt(16);
            int var87 = this.field_2123.nextInt(10);
            int var116 = var8 + this.field_2123.nextInt(16);
            new Class294(Class390.field_2414.field_2151, Class390.field_2414.field_2151, 3).method_303(this.field_2533, this.field_2123, var58, var87, var116);
         }

         for (int var44 = 0; var44 < 4; var44++) {
            int var59 = var26 + this.field_2123.nextInt(16);
            int var88 = this.field_2123.nextInt(10);
            int var117 = var8 + this.field_2123.nextInt(16);
            new Class294(Class390.field_1943.field_2151, Class390.field_1943.field_2151, 3).method_303(this.field_2533, this.field_2123, var59, var88, var117);
         }

         for (int var45 = 0; var45 < 4; var45++) {
            int var60 = var26 + this.field_2123.nextInt(16);
            int var89 = this.field_2123.nextInt(16);
            int var118 = var8 + this.field_2123.nextInt(16);
            new Class294(Class390.field_1501.field_2151, Class390.field_1501.field_2151, 7).method_303(this.field_2533, this.field_2123, var60, var89, var118);
         }
      }

      Class646.field_1552 = false;
   }

   @Override
   public boolean method_762(boolean var1, Interface608 var2) {
      return true;
   }

   @Override
   public boolean method_1225() {
      return false;
   }

   @Override
   public boolean method_1354() {
      return true;
   }
}
