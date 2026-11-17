package srv;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Class343 implements Interface103 {
   public final Class81 field_1169;
   private Random field_675;
   private Class104 field_1005;
   private Class104 field_1505;
   private Class104 field_381;
   private Class104 field_895;
   private Class104 field_358;
   public Class104 field_498;
   public Class104 field_128;
   public Class104 field_1287;
   public Class345 field_1059;
   public Class104 field_407;
   private Class317 field_999;
   private double[] field_1359;
   private double[] field_901 = new double[256];
   private double[] field_712 = new double[256];
   private double[] field_758 = new double[256];
   private Class147 field_1149 = new Class308();
   double[] field_1165;
   double[] field_735;
   double[] field_1010;
   double[] field_17;
   double[] field_902;
   int[][] field_1234 = new int[32][32];
   private int field_912 = 0;
   private long field_1444 = 0L;

   public Class343(Class317 var1, long var2) {
      this.field_999 = var1;
      this.field_675 = new Random(var2);
      this.field_1005 = new Class104(this.field_675, 16);
      this.field_1505 = new Class104(this.field_675, 16);
      this.field_381 = new Class104(this.field_675, 8);
      this.field_895 = new Class104(this.field_675, 4);
      this.field_358 = new Class104(this.field_675, 4);
      this.field_498 = new Class104(this.field_675, 10);
      this.field_128 = new Class104(this.field_675, 16);
      this.field_1287 = new Class104(this.field_675, 5);
      this.field_407 = new Class104(this.field_675, 8);
      this.field_1169 = new Class81(this.field_675);
   }

   public void method_211(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 64;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.field_1359 = this.method_636(this.field_1359, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for (int var9 = 0; var9 < var4; var9++) {
         for (int var10 = 0; var10 < var4; var10++) {
            for (int var11 = 0; var11 < 16; var11++) {
               double var12 = 0.125;
               double var14 = this.field_1359[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.field_1359[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.field_1359[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.field_1359[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.field_1359[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.field_1359[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.field_1359[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.field_1359[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

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
                           if (this.field_999.field_1136 && var11 * 8 + var30 >= var5 - 1) {
                              var51 = Class371.field_811.field_1379;
                           } else {
                              var51 = Class371.field_535.field_1379;
                           }

                           if (this.field_999.field_1136 && var11 * 8 + var30 >= var5 - 1) {
                              var51 = Class371.field_1595.field_1379;
                           } else {
                              var51 = Class371.field_378.field_1379;
                           }

                           if (this.field_999.field_871 && var11 * 8 + var30 >= var5 - 1) {
                              var51 = Class371.field_378.field_1379;
                           } else {
                              var51 = Class371.field_535.field_1379;
                           }
                        }

                        if (var46 > 0.0) {
                           var51 = Class371.field_1294.field_1379;
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

   public void method_1000(int var1, int var2, byte[] var3) {
      byte var4 = (byte)Class371.field_378.field_1379;
      byte var5 = (byte)Class371.field_378.field_1379;
      byte var6 = 64;
      double var7 = 0.03125;
      this.field_901 = this.field_895.method_277(this.field_901, var1 * 16, var2 * 16, 0.0, 16, 16, 1, var7, var7, 1.0);
      this.field_712 = this.field_895.method_277(this.field_712, var2 * 16, 109.0134, var1 * 16, 16, 1, 16, var7, 1.0, var7);
      this.field_758 = this.field_358.method_277(this.field_758, var1 * 16, var2 * 16, 0.0, 16, 16, 1, var7 * 2.0, var7 * 2.0, var7 * 2.0);

      for (int var9 = 0; var9 < 16; var9++) {
         for (int var10 = 0; var10 < 16; var10++) {
            boolean var11 = this.field_901[var9 + var10 * 16] + this.field_675.nextDouble() * 0.2 > 0.0;
            boolean var12 = this.field_712[var9 + var10 * 16] + this.field_675.nextDouble() * 0.2 > 3.0;
            int var13 = (int)(this.field_758[var9 + var10 * 16] / 3.0 + 3.0 + this.field_675.nextDouble() * 0.25);
            int var14 = -1;
            byte var15;
            byte var16;
            if (this.field_999.field_871) {
               var15 = var4;
               var16 = var5;
            } else {
               var15 = (byte)Class371.field_1206.field_1379;
               var16 = (byte)Class371.field_1082.field_1379;
            }

            for (int var17 = 127; var17 >= 0; var17--) {
               int var18 = (var9 * 16 + var10) * 128 + var17;
               if (var17 >= 95 + this.field_675.nextInt(6) - 1 && var3[var18] != 0) {
                  var3[var18] = (byte)Class371.field_1325.field_1379;

                  for (int var19 = (int)(this.field_1287.method_802(var1 * 13.2, var2 * 13.2) / 2.0); var19 > 0; var19--) {
                     if (var19 + var17 < 128 && var18 + var19 < var3.length && var3[var18 + var19] == 0) {
                        var3[var19 + var18] = (byte)Class371.field_811.field_1379;
                     }
                  }
               }

               if (var17 <= this.field_675.nextInt(6) - 1) {
                  var3[var18] = (byte)Class371.field_536.field_1379;
               } else {
                  byte var20 = var3[var18];
                  if (var20 == 0) {
                     var14 = -1;
                  } else if (var20 == Class371.field_1294.field_1379) {
                     if (var14 == -1) {
                        if (var13 <= 0) {
                           var15 = 0;
                           var16 = (byte)Class371.field_1294.field_1379;
                        } else if (var17 >= var6 - 4 && var17 <= var6 + 1) {
                           var15 = (byte)Class371.field_1206.field_1379;
                           var16 = (byte)Class371.field_1082.field_1379;
                           if (this.field_999.field_871) {
                              var15 = var4;
                              var16 = var5;
                           }

                           if (var12) {
                              var15 = 0;
                           }

                           if (var12) {
                              var16 = (byte)Class371.field_636.field_1379;
                           }

                           if (var11) {
                              var15 = (byte)Class371.field_378.field_1379;
                           }

                           if (var11) {
                              var16 = (byte)Class371.field_378.field_1379;
                           }
                        }

                        if (var17 < var6 && var15 == 0) {
                           var15 = (byte)Class371.field_535.field_1379;
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
   public Class166 method_986(int var1, int var2) {
      if (Math.abs(System.currentTimeMillis() - this.field_1444) > 5000L) {
         SimpleDateFormat var3 = new SimpleDateFormat("HH");
         this.field_912 = Integer.parseInt(var3.format(Calendar.getInstance().getTime()));
         this.field_1444 = System.currentTimeMillis();
      }

      boolean var8 = this.field_912 > 22 || this.field_912 < 5;
      this.field_675.setSeed(var1 * 341873128712L + var2 * 132897987541L);
      byte[] var4 = new byte[32768];
      Class166 var5 = new Class166(this.field_999, var4, var1, var2);
      var1 += var8 ? this.field_675.nextInt(2000) - this.field_675.nextInt(1000) : 0;
      var2 += var8 ? this.field_675.nextInt(2000) - this.field_675.nextInt(1000) : 0;
      this.method_211(var1, var2, var4);
      this.method_1000(var1, var2, var4);
      this.field_1149.method_359(this, this.field_999, var1, var2, var4);
      var5.method_297();
      return var5;
   }

   private double[] method_636(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412;
      double var10 = 684.412;
      this.field_17 = this.field_498.method_277(this.field_17, var2, var3, var4, var5, 1, var7, 1.0, 0.0, 1.0);
      this.field_902 = this.field_128.method_277(this.field_902, var2, var3, var4, var5, 1, var7, 100.0, 0.0, 100.0);
      this.field_1165 = this.field_381.method_277(this.field_1165, var2, var3, var4, var5, var6, var7, var8 / 80.0, var10 / 160.0, var8 / 80.0);
      this.field_735 = this.field_1005.method_277(this.field_735, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.field_1010 = this.field_1505.method_277(this.field_1010, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for (int var14 = 0; var14 < var5; var14++) {
         for (int var15 = 0; var15 < var7; var15++) {
            double var16 = (this.field_17[var13] + 256.0) / 512.0;
            if (var16 > 1.0) {
               var16 = 1.0;
            }

            double var18 = 0.0;
            double var20 = this.field_902[var13] / 8000.0;
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

               double var29 = this.field_735[var12] / 512.0;
               double var31 = this.field_1010[var12] / 512.0;
               double var33 = (this.field_1165[var12] / 10.0 + 1.0) / 2.0;
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
   public boolean method_161(int var1, int var2) {
      return true;
   }

   @Override
   public void method_321(Interface103 var1, int var2, int var3) {
      Thread190.method_331(new Class192(this, var1, var2, var3), this);
   }

   public void method_433(Interface103 var1, int var2, int var3) {
      Class237.field_876 = true;
      Interface210.Inner211 var7 = Interface210.Inner211.method_688(this.field_999.method_642());
      Class49 var4 = var7.method_842(var2, var3, Class49.Inner296.field_372);
      Class49 var5 = var7.method_842(var2, var3, Class49.Inner296.field_145);
      Class49 var6 = var7.method_842(var2, var3, Class49.Inner296.field_976);
      int var26 = var2 * 16;
      int var8 = var3 * 16;
      this.field_675.setSeed(this.field_999.field_68);
      long var9 = this.field_675.nextLong() / 2L * 2L + 1L;
      long var11 = this.field_675.nextLong() / 2L * 2L + 1L;
      this.field_675.setSeed(var2 * var9 + var3 * var11 ^ this.field_999.field_68);
      double var13 = 0.25;
      int var15 = 3;
      this.field_1169.method_233(this.field_999, var2, var3);
      if (var4.method_851(this.field_675, this.field_999, var2, var3)) {
         label410:
         for (int var21 = 0; var21 < 16; var21++) {
            for (int var22 = 0; var22 < 16; var22++) {
               for (int var23 = 127; var23 > 97; var23--) {
                  if (this.field_675.nextInt(70) == 0
                     && this.field_999.method_813(var2 * 16 + var21, var23, var3 * 16 + var22) == Class371.field_1595.field_1379) {
                     var21 += var2 * 16;
                     var22 += var3 * 16;
                     this.field_999.method_260(var21, ++var23, var22, Class371.field_811.field_1379);
                     break label410;
                  }
               }
            }
         }

         boolean var137 = false;
         if (var4 instanceof Class251) {
            var137 = ((Class251)var4).field_1225 == 2;
         }

         Class19 var140 = var137 && this.field_675.nextInt(40) == 0 ? new Class22().method_512(var137) : new Class22();
         if (this.field_675.nextInt(10) == 0) {
            var140 = var137 && this.field_675.nextInt(50) == 0 ? new Class269().method_353(var137) : new Class269();
         }

         Class236 var143 = new Class236();

         for (int var17 = 0; var17 < var15; var17++) {
            int var18 = var26 + this.field_675.nextInt(16) + 8;
            int var19 = var8 + this.field_675.nextInt(16) + 8;
            var140.method_744(1.0, 1.0, 1.0);
            var140.method_453(this.field_999, this.field_675, var18, this.field_999.method_713(var18, var19), var19);
         }

         for (int var61 = 0; var61 < var15; var61++) {
            int var90 = var26 + this.field_675.nextInt(8) + 8;
            int var119 = var8 + this.field_675.nextInt(8) + 8;
            var143.method_744(1.0, 1.0, 1.0);
            var143.method_453(this.field_999, this.field_675, var90, this.field_999.method_713(var90, var119), var119);
         }

         for (int var62 = 0; var62 < 2; var62++) {
            int var91 = var26 + this.field_675.nextInt(16) + 8;
            int var120 = this.field_675.nextInt(128);
            int var20 = var8 + this.field_675.nextInt(16) + 8;
            new Class370(Class371.field_86.field_1379).method_453(this.field_999, this.field_675, var91, var120, var20);
         }

         for (int var24 = 0; var24 < 100; var24++) {
            int var63 = var26 + this.field_675.nextInt(16) + 8;
            int var92 = this.field_675.nextInt(128);
            int var121 = var8 + this.field_675.nextInt(16) + 8;
            new Class78().method_453(this.field_999, this.field_675, var63, var92, var121);
         }

         if (this.field_675.nextInt(2) == 0) {
            int var64 = var26 + this.field_675.nextInt(16) + 8;
            int var93 = this.field_675.nextInt(128);
            int var122 = var8 + this.field_675.nextInt(16) + 8;
            new Class370(Class371.field_527.field_1379).method_453(this.field_999, this.field_675, var64, var93, var122);
         }

         if (this.field_675.nextInt(2) == 0) {
            int var65 = var26 + this.field_675.nextInt(8) + 8;
            int var94 = this.field_675.nextInt(128);
            int var123 = var8 + this.field_675.nextInt(8) + 8;
            new Class370(Class323.field_207.field_1379).method_453(this.field_999, this.field_675, var65, var94, var123);
         }

         if (this.field_675.nextInt(4) == 0) {
            int var66 = var26 + this.field_675.nextInt(16) + 8;
            int var95 = this.field_675.nextInt(128);
            int var124 = var8 + this.field_675.nextInt(16) + 8;
            new Class370(Class371.field_292.field_1379).method_453(this.field_999, this.field_675, var66, var95, var124);
         }

         if (this.field_675.nextInt(8) == 0) {
            int var67 = var26 + this.field_675.nextInt(16) + 8;
            int var96 = this.field_675.nextInt(128);
            int var125 = var8 + this.field_675.nextInt(16) + 8;
            new Class370(Class371.field_49.field_1379).method_453(this.field_999, this.field_675, var67, var96, var125);
         }

         if (this.field_675.nextInt(10) == 0) {
            var15++;
         }

         if (Class298.method_477(this.field_999, var26, var8)) {
            for (int var25 = 0; var25 != 50; var25++) {
               if (this.field_675.nextInt(8) == 0) {
                  int var68 = var26 + this.field_675.nextInt(16) + 8;
                  int var97 = 50 + this.field_675.nextInt(16);
                  int var126 = var8 + this.field_675.nextInt(16) + 8;
                  new Class298().method_453(this.field_999, this.field_675, var68, var97, var126);
               }
            }
         }

         for (int var144 = 0; var144 < 4; var144++) {
            new Class223(Class323.field_905.field_1379)
               .method_453(
                  this.field_999, this.field_675, var26 + this.field_675.nextInt(16) + 8, this.field_675.nextInt(128), var8 + this.field_675.nextInt(16) + 8
               );
         }

         for (int var145 = 0; var145 < 5; var145++) {
            new Class299(Class323.field_116.field_1379)
               .method_453(
                  this.field_999, this.field_675, var26 + this.field_675.nextInt(16) + 8, this.field_675.nextInt(128), var8 + this.field_675.nextInt(16) + 8
               );
         }

         for (int var146 = 0; var146 < 5; var146++) {
            new Class353()
               .method_453(
                  this.field_999, this.field_675, var26 + this.field_675.nextInt(16) + 8, this.field_675.nextInt(10), var8 + this.field_675.nextInt(16) + 8
               );
         }

         for (int var147 = 0; var147 < 16; var147++) {
            new Class6()
               .method_453(
                  this.field_999, this.field_675, var26 + this.field_675.nextInt(16) + 8, this.field_675.nextInt(128), var8 + this.field_675.nextInt(16) + 8
               );
         }

         for (int var148 = 0; var148 < 3; var148++) {
            new Class63(Class323.field_973.field_1379)
               .method_453(
                  this.field_999, this.field_675, var26 + this.field_675.nextInt(16) + 8, this.field_675.nextInt(128), var8 + this.field_675.nextInt(16) + 8
               );
         }

         for (int var69 = 0; var69 < 10; var69++) {
            int var98 = var26 + this.field_675.nextInt(16) + 8;
            int var127 = this.field_675.nextInt(128);
            int var132 = var8 + this.field_675.nextInt(16) + 8;
            new Class141().method_453(this.field_999, this.field_675, var98, var127, var132);
         }

         for (int var70 = 0; var70 < 1; var70++) {
            int var99 = var26 + this.field_675.nextInt(16) + 8;
            int var128 = this.field_675.nextInt(128);
            int var133 = var8 + this.field_675.nextInt(16) + 8;
            new Class341().method_453(this.field_999, this.field_675, var99, var128, var133);
         }

         for (int var71 = 0; var71 < 50; var71++) {
            int var100 = var26 + this.field_675.nextInt(16) + 8;
            int var129 = this.field_675.nextInt(this.field_675.nextInt(120) + 8);
            int var134 = var8 + this.field_675.nextInt(16) + 8;
            new Class249(Class371.field_1051.field_1379).method_453(this.field_999, this.field_675, var100, var129, var134);
         }

         for (int var72 = 0; var72 < 20; var72++) {
            int var101 = var26 + this.field_675.nextInt(16) + 8;
            int var130 = this.field_675.nextInt(this.field_675.nextInt(this.field_675.nextInt(112) + 8) + 8);
            int var135 = var8 + this.field_675.nextInt(16) + 8;
            new Class249(Class371.field_1103.field_1379).method_453(this.field_999, this.field_675, var101, var130, var135);
         }

         for (int var73 = var26 + 8; var73 < var26 + 8 + 16; var73++) {
            for (int var102 = var8 + 8; var102 < var8 + 8 + 16; var102++) {
               int var131 = this.field_999.method_641(var73, var102);
               if (this.field_999.field_1136
                  && var131 > 0
                  && var131 < 128
                  && this.field_999.method_813(var73, var131, var102) == 0
                  && this.field_999.method_149(var73, var131 - 1, var102).method_330()
                  && this.field_999.method_149(var73, var131 - 1, var102) != Class111.field_504) {
                  this.field_999.method_226(var73, var131, var102, Class371.field_1595.field_1379);
               }
            }
         }
      }

      for (int var138 = 0; var138 != 8; var138++) {
         for (int var141 = 0; var141 != 4; var141++) {
            int var16 = var26 + var138 * 2;
            int var74 = 5 + this.field_675.nextInt(2);
            int var103 = var8 + var141 * 4;
            new Class324(2 + this.field_675.nextInt(3), var26, var8).method_453(this.field_999, this.field_675, var16, var74, var103);
            var6.method_851(this.field_675, this.field_999, var2, var3);
         }
      }

      if (var5.method_851(this.field_675, this.field_999, var2, var3)) {
         var13 = 0.5;
         var15 = (int)((this.field_407.method_802(var26 * var13, var8 * var13) / 8.0 + this.field_675.nextDouble() * 4.0 + 4.0) / 3.0);
         if (var15 < 0) {
            boolean var30 = false;
         }

         for (int var31 = 0; var31 < 8; var31++) {
            int var46 = var26 + this.field_675.nextInt(16) + 8;
            int var75 = this.field_675.nextInt(128);
            int var104 = var8 + this.field_675.nextInt(16) + 8;
            new Class376().method_453(this.field_999, this.field_675, var46, var75, var104);
         }

         for (int var32 = 0; var32 < 1; var32++) {
            int var47 = var26 + this.field_675.nextInt(64) + 8;
            int var76 = this.field_675.nextInt(5) + 55;
            int var105 = var8 + this.field_675.nextInt(64) + 8;
            new Class207().method_453(this.field_999, this.field_675, var47, var76, var105);
         }

         for (int var33 = 0; var33 < 10; var33++) {
            int var48 = var26 + this.field_675.nextInt(16);
            int var77 = this.field_675.nextInt(128);
            int var106 = var8 + this.field_675.nextInt(16);
            new Class76(32).method_453(this.field_999, this.field_675, var48, var77, var106);
         }

         for (int var34 = 0; var34 < 20; var34++) {
            int var49 = var26 + this.field_675.nextInt(16);
            int var78 = this.field_675.nextInt(128);
            int var107 = var8 + this.field_675.nextInt(16);
            new Class337(Class371.field_1082.field_1379, 32).method_453(this.field_999, this.field_675, var49, var78, var107);
         }

         for (int var35 = 0; var35 < 10; var35++) {
            int var50 = var26 + this.field_675.nextInt(16);
            int var79 = this.field_675.nextInt(128);
            int var108 = var8 + this.field_675.nextInt(16);
            new Class337(Class371.field_636.field_1379, 32).method_453(this.field_999, this.field_675, var50, var79, var108);
         }

         for (int var36 = 0; var36 < 20; var36++) {
            int var51 = var26 + this.field_675.nextInt(16);
            int var80 = this.field_675.nextInt(128);
            int var109 = var8 + this.field_675.nextInt(16);
            new Class337(Class371.field_1296.field_1379, Class323.field_1412.field_1379, 16).method_453(this.field_999, this.field_675, var51, var80, var109);
         }

         for (int var37 = 0; var37 < 20; var37++) {
            int var52 = var26 + this.field_675.nextInt(16);
            int var81 = this.field_675.nextInt(64);
            int var110 = var8 + this.field_675.nextInt(16);
            new Class337(Class371.field_1069.field_1379, Class323.field_784.field_1379, 8).method_453(this.field_999, this.field_675, var52, var81, var110);
         }

         for (int var38 = 0; var38 < 2; var38++) {
            int var53 = var26 + this.field_675.nextInt(16);
            int var82 = this.field_675.nextInt(32);
            int var111 = var8 + this.field_675.nextInt(16);
            new Class337(Class371.field_386.field_1379, Class323.field_159.field_1379, 8).method_453(this.field_999, this.field_675, var53, var82, var111);
         }

         for (int var39 = 0; var39 < 8; var39++) {
            int var54 = var26 + this.field_675.nextInt(16);
            int var83 = this.field_675.nextInt(16);
            int var112 = var8 + this.field_675.nextInt(16);
            new Class337(Class371.field_161.field_1379, Class323.field_929.field_1379, 7).method_453(this.field_999, this.field_675, var54, var83, var112);
         }

         for (int var40 = 0; var40 < 4; var40++) {
            int var55 = var26 + this.field_675.nextInt(16);
            int var84 = this.field_675.nextInt(16);
            int var113 = var8 + this.field_675.nextInt(16);
            new Class337(Class371.field_666.field_1379, Class323.field_523.field_1379, 7).method_453(this.field_999, this.field_675, var55, var84, var113);
         }

         for (int var41 = 0; var41 < 4; var41++) {
            int var56 = var26 + this.field_675.nextInt(16);
            int var85 = this.field_675.nextInt(10);
            int var114 = var8 + this.field_675.nextInt(16);
            new Class337(Class323.field_462.field_1379, Class323.field_462.field_1379, 3).method_453(this.field_999, this.field_675, var56, var85, var114);
         }

         for (int var42 = 0; var42 < 4; var42++) {
            int var57 = var26 + this.field_675.nextInt(16);
            int var86 = this.field_675.nextInt(10);
            int var115 = var8 + this.field_675.nextInt(16);
            new Class337(Class323.field_1416.field_1379, Class323.field_1416.field_1379, 3).method_453(this.field_999, this.field_675, var57, var86, var115);
         }

         for (int var43 = 0; var43 < 4; var43++) {
            int var58 = var26 + this.field_675.nextInt(16);
            int var87 = this.field_675.nextInt(10);
            int var116 = var8 + this.field_675.nextInt(16);
            new Class337(Class323.field_422.field_1379, Class323.field_422.field_1379, 3).method_453(this.field_999, this.field_675, var58, var87, var116);
         }

         for (int var44 = 0; var44 < 4; var44++) {
            int var59 = var26 + this.field_675.nextInt(16);
            int var88 = this.field_675.nextInt(10);
            int var117 = var8 + this.field_675.nextInt(16);
            new Class337(Class323.field_693.field_1379, Class323.field_693.field_1379, 3).method_453(this.field_999, this.field_675, var59, var88, var117);
         }

         for (int var45 = 0; var45 < 4; var45++) {
            int var60 = var26 + this.field_675.nextInt(16);
            int var89 = this.field_675.nextInt(16);
            int var118 = var8 + this.field_675.nextInt(16);
            new Class337(Class323.field_705.field_1379, Class323.field_705.field_1379, 7).method_453(this.field_999, this.field_675, var60, var89, var118);
         }
      }

      Class237.field_876 = false;
   }

   @Override
   public boolean method_541(boolean var1, Interface282 var2) {
      return true;
   }

   @Override
   public boolean method_756() {
      return false;
   }

   @Override
   public boolean method_845() {
      return true;
   }
}
