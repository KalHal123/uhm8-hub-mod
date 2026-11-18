package x;

import java.util.Random;

public class Class0362 implements Class0020 {
   private Random j;
   private Class0303 k;
   private Class0303 l;
   private Class0303 m;
   private Class0303 n;
   private Class0303 o;
   public Class0303 a;
   public Class0303 b;
   public Class0303 c;
   private Class0065 p;
   private double[] q;
   private double[] r = new double[256];
   private double[] s = new double[256];
   private double[] t = new double[256];
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   double[] h;
   int[][] i = new int[32][32];

   public Class0362(Class0065 var1, long var2) {
      this.p = var1;
      this.j = new Random(var2);
      this.k = new Class0303(this.j, 16);
      this.l = new Class0303(this.j, 16);
      this.m = new Class0303(this.j, 8);
      this.n = new Class0303(this.j, 4);
      this.o = new Class0303(this.j, 4);
      this.a = new Class0303(this.j, 10);
      this.b = new Class0303(this.j, 16);
      this.c = new Class0303(this.j, 8);
   }

   public void a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 64;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.q = this.a(this.q, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for (int var9 = 0; var9 < var4; var9++) {
         for (int var10 = 0; var10 < var4; var10++) {
            for (int var11 = 0; var11 < 16; var11++) {
               double var12 = 0.125;
               double var14 = this.q[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.q[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.q[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.q[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.q[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.q[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.q[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.q[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

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
                           if (this.p.d && var11 * 8 + var30 >= var5 - 1) {
                              var51 = Class0312.aT.ba;
                           } else {
                              var51 = Class0312.B.ba;
                           }
                        }

                        if (var46 > 0.0) {
                           var51 = Class0312.t.ba;
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

   public void b(int var1, int var2, byte[] var3) {
      byte var4 = 64;
      double var5 = 0.03125;
      this.r = this.n.a(this.r, var1 * 16, var2 * 16, 0.0, 16, 16, 1, var5, var5, 1.0);
      this.s = this.n.a(this.s, var2 * 16, 109.0134, var1 * 16, 16, 1, 16, var5, 1.0, var5);
      this.t = this.o.a(this.t, var1 * 16, var2 * 16, 0.0, 16, 16, 1, var5 * 2.0, var5 * 2.0, var5 * 2.0);

      for (int var7 = 0; var7 < 16; var7++) {
         for (int var8 = 0; var8 < 16; var8++) {
            boolean var9 = this.r[var7 + var8 * 16] + this.j.nextDouble() * 0.2 > 0.0;
            boolean var10 = this.s[var7 + var8 * 16] + this.j.nextDouble() * 0.2 > 3.0;
            int var11 = (int)(this.t[var7 + var8 * 16] / 3.0 + 3.0 + this.j.nextDouble() * 0.25);
            int var12 = -1;
            byte var13 = (byte)Class0312.u.ba;
            byte var14 = (byte)Class0312.v.ba;

            for (int var15 = 127; var15 >= 0; var15--) {
               int var16 = (var7 * 16 + var8) * 128 + var15;
               if (var15 <= 0 + this.j.nextInt(6) - 1) {
                  var3[var16] = (byte)Class0312.z.ba;
               } else {
                  byte var17 = var3[var16];
                  if (var17 == 0) {
                     var12 = -1;
                  } else if (var17 == Class0312.t.ba) {
                     if (var12 == -1) {
                        if (var11 <= 0) {
                           var13 = 0;
                           var14 = (byte)Class0312.t.ba;
                        } else if (var15 >= var4 - 4 && var15 <= var4 + 1) {
                           var13 = (byte)Class0312.u.ba;
                           var14 = (byte)Class0312.v.ba;
                           if (var10) {
                              var13 = 0;
                           }

                           if (var10) {
                              var14 = (byte)Class0312.F.ba;
                           }

                           if (var9) {
                              var13 = (byte)Class0312.E.ba;
                           }

                           if (var9) {
                              var14 = (byte)Class0312.E.ba;
                           }
                        }

                        if (var15 < var4 && var13 == 0) {
                           var13 = (byte)Class0312.B.ba;
                        }

                        var12 = var11;
                        if (var15 >= var4 - 1) {
                           var3[var16] = var13;
                        } else {
                           var3[var16] = var14;
                        }
                     } else if (var12 > 0) {
                        var12--;
                        var3[var16] = var14;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public Class0154 b(int var1, int var2) {
      this.j.setSeed(var1 * 341873128712L + var2 * 132897987541L);
      byte[] var3 = new byte[32768];
      Class0154 var4 = new Class0154(this.p, var3, var1, var2);
      this.a(var1, var2, var3);
      this.b(var1, var2, var3);
      this.c(var1, var2, var3);
      var4.c();
      return var4;
   }

   protected void a(int var1, int var2, byte[] var3, double var4, double var6, double var8) {
      this.a(var1, var2, var3, var4, var6, var8, 1.0F + this.j.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5);
   }

   protected void a(
      int var1, int var2, byte[] var3, double var4, double var6, double var8, float var10, float var11, float var12, int var13, int var14, double var15
   ) {
      double var17 = var1 * 16 + 8;
      double var19 = var2 * 16 + 8;
      float var21 = 0.0F;
      float var22 = 0.0F;
      Random var23 = new Random(this.j.nextLong());
      if (var14 <= 0) {
         byte var24 = 112;
         var14 = var24 - var23.nextInt(var24 / 4);
      }

      boolean var55 = false;
      if (var13 == -1) {
         var13 = var14 / 2;
         var55 = true;
      }

      int var25 = var23.nextInt(var14 / 2) + var14 / 4;
      boolean var26 = var23.nextInt(6) == 0;

      while (var13 < var14) {
         double var27 = 1.5 + Class0118.a(var13 * (float) Math.PI / var14) * var10 * 1.0F;
         double var29 = var27 * var15;
         float var31 = Class0118.b(var12);
         float var32 = Class0118.a(var12);
         var4 += Class0118.b(var11) * var31;
         var6 += var32;
         var8 += Class0118.a(var11) * var31;
         if (var26) {
            var12 *= 0.92F;
         } else {
            var12 *= 0.7F;
         }

         var12 += var22 * 0.1F;
         var11 += var21 * 0.1F;
         var22 *= 0.9F;
         var21 *= 0.75F;
         var22 += (var23.nextFloat() - var23.nextFloat()) * var23.nextFloat() * 2.0F;
         var21 += (var23.nextFloat() - var23.nextFloat()) * var23.nextFloat() * 4.0F;
         if (!var55 && var13 == var25 && var10 > 1.0F) {
            this.a(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 - (float) (Math.PI / 2), var12 / 3.0F, var13, var14, 1.0);
            this.a(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 + (float) (Math.PI / 2), var12 / 3.0F, var13, var14, 1.0);
            return;
         }

         if (var55 || var23.nextInt(4) != 0) {
            double var33 = var4 - var17;
            double var35 = var8 - var19;
            double var37 = var14 - var13;
            double var39 = var10 + 2.0F + 16.0F;
            if (var33 * var33 + var35 * var35 - var37 * var37 > var39 * var39) {
               return;
            }

            if (!(var4 < var17 - 16.0 - var27 * 2.0)
               && !(var8 < var19 - 16.0 - var27 * 2.0)
               && !(var4 > var17 + 16.0 + var27 * 2.0)
               && !(var8 > var19 + 16.0 + var27 * 2.0)) {
               int var56 = Class0118.b(var4 - var27) - var1 * 16 - 1;
               int var34 = Class0118.b(var4 + var27) - var1 * 16 + 1;
               int var57 = Class0118.b(var6 - var29) - 1;
               int var36 = Class0118.b(var6 + var29) + 1;
               int var58 = Class0118.b(var8 - var27) - var2 * 16 - 1;
               int var38 = Class0118.b(var8 + var27) - var2 * 16 + 1;
               if (var56 < 0) {
                  var56 = 0;
               }

               if (var34 > 16) {
                  var34 = 16;
               }

               if (var57 < 1) {
                  var57 = 1;
               }

               if (var36 > 120) {
                  var36 = 120;
               }

               if (var58 < 0) {
                  var58 = 0;
               }

               if (var38 > 16) {
                  var38 = 16;
               }

               boolean var59 = false;

               for (int var40 = var56; !var59 && var40 < var34; var40++) {
                  for (int var41 = var58; !var59 && var41 < var38; var41++) {
                     for (int var42 = var36 + 1; !var59 && var42 >= var57 - 1; var42--) {
                        int var43 = (var40 * 16 + var41) * 128 + var42;
                        if (var42 >= 0 && var42 < 128) {
                           if (var3[var43] == Class0312.A.ba || var3[var43] == Class0312.B.ba) {
                              var59 = true;
                           }

                           if (var42 != var57 - 1 && var40 != var56 && var40 != var34 - 1 && var41 != var58 && var41 != var38 - 1) {
                              var42 = var57;
                           }
                        }
                     }
                  }
               }

               if (!var59) {
                  for (int var60 = var56; var60 < var34; var60++) {
                     double var61 = (var60 + var1 * 16 + 0.5 - var4) / var27;

                     for (int var62 = var58; var62 < var38; var62++) {
                        double var44 = (var62 + var2 * 16 + 0.5 - var8) / var27;
                        int var46 = (var60 * 16 + var62) * 128 + var36;
                        boolean var47 = false;

                        for (int var48 = var36 - 1; var48 >= var57; var48--) {
                           double var49 = (var48 + 0.5 - var6) / var29;
                           if (var49 > -0.7 && var61 * var61 + var49 * var49 + var44 * var44 < 1.0) {
                              byte var51 = var3[var46];
                              if (var51 == Class0312.u.ba) {
                                 var47 = true;
                              }

                              if (var51 == Class0312.t.ba || var51 == Class0312.v.ba || var51 == Class0312.u.ba) {
                                 if (var48 < 10) {
                                    var3[var46] = (byte)Class0312.C.ba;
                                 } else {
                                    var3[var46] = 0;
                                    if (var47 && var3[var46 - 1] == Class0312.v.ba) {
                                       var3[var46 - 1] = (byte)Class0312.u.ba;
                                    }
                                 }
                              }
                           }

                           var46--;
                        }
                     }
                  }

                  if (var55) {
                     break;
                  }
               }
            }
         }

         var13++;
      }
   }

   private void c(int var1, int var2, byte[] var3) {
      byte var4 = 8;
      this.j.setSeed(this.p.r);
      long var5 = this.j.nextLong() / 2L * 2L + 1L;
      long var7 = this.j.nextLong() / 2L * 2L + 1L;

      for (int var9 = var1 - var4; var9 <= var1 + var4; var9++) {
         for (int var10 = var2 - var4; var10 <= var2 + var4; var10++) {
            this.j.setSeed(var9 * var5 + var10 * var7 ^ this.p.r);
            int var11 = this.j.nextInt(this.j.nextInt(this.j.nextInt(40) + 1) + 1);
            if (this.j.nextInt(15) != 0) {
               var11 = 0;
            }

            for (int var12 = 0; var12 < var11; var12++) {
               double var13 = var9 * 16 + this.j.nextInt(16);
               double var15 = this.j.nextInt(this.j.nextInt(120) + 8);
               double var17 = var10 * 16 + this.j.nextInt(16);
               int var19 = 1;
               if (this.j.nextInt(4) == 0) {
                  this.a(var1, var2, var3, var13, var15, var17);
                  var19 += this.j.nextInt(4);
               }

               for (int var20 = 0; var20 < var19; var20++) {
                  float var21 = this.j.nextFloat() * (float) Math.PI * 2.0F;
                  float var22 = (this.j.nextFloat() - 0.5F) * 2.0F / 8.0F;
                  float var23 = this.j.nextFloat() * 2.0F + this.j.nextFloat();
                  this.a(var1, var2, var3, var13, var15, var17, var23, var21, var22, 0, 0, 1.0);
               }
            }
         }
      }
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412;
      double var10 = 684.412;
      this.g = this.a.a(this.g, var2, var3, var4, var5, 1, var7, 1.0, 0.0, 1.0);
      this.h = this.b.a(this.h, var2, var3, var4, var5, 1, var7, 100.0, 0.0, 100.0);
      this.d = this.m.a(this.d, var2, var3, var4, var5, var6, var7, var8 / 80.0, var10 / 160.0, var8 / 80.0);
      this.e = this.k.a(this.e, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.f = this.l.a(this.f, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for (int var14 = 0; var14 < var5; var14++) {
         for (int var15 = 0; var15 < var7; var15++) {
            double var16 = (this.g[var13] + 256.0) / 512.0;
            if (var16 > 1.0) {
               var16 = 1.0;
            }

            double var18 = 0.0;
            double var20 = this.h[var13] / 8000.0;
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

               double var29 = this.e[var12] / 512.0;
               double var31 = this.f[var12] / 512.0;
               double var33 = (this.d[var12] / 10.0 + 1.0) / 2.0;
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
   public boolean a(int var1, int var2) {
      return true;
   }

   @Override
   public void a(Class0020 var1, int var2, int var3) {
      Class0085.a = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      this.j.setSeed(this.p.r);
      long var6 = this.j.nextLong() / 2L * 2L + 1L;
      long var8 = this.j.nextLong() / 2L * 2L + 1L;
      this.j.setSeed(var2 * var6 + var3 * var8 ^ this.p.r);
      double var10 = 0.25;

      for (int var12 = 0; var12 < 8; var12++) {
         int var13 = var4 + this.j.nextInt(16) + 8;
         int var14 = this.j.nextInt(128);
         int var15 = var5 + this.j.nextInt(16) + 8;
         new Class0058().a(this.p, this.j, var13, var14, var15);
      }

      for (int var19 = 0; var19 < 10; var19++) {
         int var28 = var4 + this.j.nextInt(16);
         int var37 = this.j.nextInt(128);
         int var55 = var5 + this.j.nextInt(16);
         new Class0175(32).a(this.p, this.j, var28, var37, var55);
      }

      for (int var20 = 0; var20 < 20; var20++) {
         int var29 = var4 + this.j.nextInt(16);
         int var38 = this.j.nextInt(128);
         int var56 = var5 + this.j.nextInt(16);
         new Class0072(Class0312.v.ba, 32).a(this.p, this.j, var29, var38, var56);
      }

      for (int var21 = 0; var21 < 10; var21++) {
         int var30 = var4 + this.j.nextInt(16);
         int var39 = this.j.nextInt(128);
         int var57 = var5 + this.j.nextInt(16);
         new Class0072(Class0312.F.ba, 32).a(this.p, this.j, var30, var39, var57);
      }

      for (int var22 = 0; var22 < 20; var22++) {
         int var31 = var4 + this.j.nextInt(16);
         int var40 = this.j.nextInt(128);
         int var58 = var5 + this.j.nextInt(16);
         new Class0072(Class0312.I.ba, 16).a(this.p, this.j, var31, var40, var58);
      }

      for (int var23 = 0; var23 < 20; var23++) {
         int var32 = var4 + this.j.nextInt(16);
         int var41 = this.j.nextInt(64);
         int var59 = var5 + this.j.nextInt(16);
         new Class0072(Class0312.H.ba, 8).a(this.p, this.j, var32, var41, var59);
      }

      for (int var24 = 0; var24 < 2; var24++) {
         int var33 = var4 + this.j.nextInt(16);
         int var42 = this.j.nextInt(32);
         int var60 = var5 + this.j.nextInt(16);
         new Class0072(Class0312.G.ba, 8).a(this.p, this.j, var33, var42, var60);
      }

      for (int var25 = 0; var25 < 8; var25++) {
         int var34 = var4 + this.j.nextInt(16);
         int var43 = this.j.nextInt(16);
         int var61 = var5 + this.j.nextInt(16);
         new Class0072(Class0312.aN.ba, 7).a(this.p, this.j, var34, var43, var61);
      }

      for (int var26 = 0; var26 < 1; var26++) {
         int var35 = var4 + this.j.nextInt(16);
         int var44 = this.j.nextInt(16);
         int var62 = var5 + this.j.nextInt(16);
         new Class0072(Class0312.aw.ba, 7).a(this.p, this.j, var35, var44, var62);
      }

      var10 = 0.5;
      int var27 = (int)((this.c.a(var4 * var10, var5 * var10) / 8.0 + this.j.nextDouble() * 4.0 + 4.0) / 3.0);
      if (var27 < 0) {
         var27 = 0;
      }

      if (this.j.nextInt(10) == 0) {
         var27++;
      }

      Class0218 var36 = new Class0365();
      if (this.j.nextInt(10) == 0) {
         var36 = new Class0113();
      }

      for (int var45 = 0; var45 < var27; var45++) {
         int var63 = var4 + this.j.nextInt(16) + 8;
         int var16 = var5 + this.j.nextInt(16) + 8;
         var36.a(1.0, 1.0, 1.0);
         var36.a(this.p, this.j, var63, this.p.c(var63, var16), var16);
      }

      for (int var46 = 0; var46 < 2; var46++) {
         int var64 = var4 + this.j.nextInt(16) + 8;
         int var73 = this.j.nextInt(128);
         int var17 = var5 + this.j.nextInt(16) + 8;
         new Class0004(Class0312.ad.ba).a(this.p, this.j, var64, var73, var17);
      }

      if (this.j.nextInt(2) == 0) {
         int var47 = var4 + this.j.nextInt(16) + 8;
         int var65 = this.j.nextInt(128);
         int var74 = var5 + this.j.nextInt(16) + 8;
         new Class0004(Class0312.ae.ba).a(this.p, this.j, var47, var65, var74);
      }

      if (this.j.nextInt(4) == 0) {
         int var48 = var4 + this.j.nextInt(16) + 8;
         int var66 = this.j.nextInt(128);
         int var75 = var5 + this.j.nextInt(16) + 8;
         new Class0004(Class0312.af.ba).a(this.p, this.j, var48, var66, var75);
      }

      if (this.j.nextInt(8) == 0) {
         int var49 = var4 + this.j.nextInt(16) + 8;
         int var67 = this.j.nextInt(128);
         int var76 = var5 + this.j.nextInt(16) + 8;
         new Class0004(Class0312.ag.ba).a(this.p, this.j, var49, var67, var76);
      }

      for (int var50 = 0; var50 < 10; var50++) {
         int var68 = var4 + this.j.nextInt(16) + 8;
         int var77 = this.j.nextInt(128);
         int var82 = var5 + this.j.nextInt(16) + 8;
         new Class0122().a(this.p, this.j, var68, var77, var82);
      }

      for (int var51 = 0; var51 < 1; var51++) {
         int var69 = var4 + this.j.nextInt(16) + 8;
         int var78 = this.j.nextInt(128);
         int var83 = var5 + this.j.nextInt(16) + 8;
         new Class0077().a(this.p, this.j, var69, var78, var83);
      }

      for (int var52 = 0; var52 < 50; var52++) {
         int var70 = var4 + this.j.nextInt(16) + 8;
         int var79 = this.j.nextInt(this.j.nextInt(120) + 8);
         int var84 = var5 + this.j.nextInt(16) + 8;
         new Class0353(Class0312.A.ba).a(this.p, this.j, var70, var79, var84);
      }

      for (int var53 = 0; var53 < 20; var53++) {
         int var71 = var4 + this.j.nextInt(16) + 8;
         int var80 = this.j.nextInt(this.j.nextInt(this.j.nextInt(112) + 8) + 8);
         int var85 = var5 + this.j.nextInt(16) + 8;
         new Class0353(Class0312.C.ba).a(this.p, this.j, var71, var80, var85);
      }

      if (this.p.d) {
         for (int var54 = var4 + 8 + 0; var54 < var4 + 8 + 16; var54++) {
            for (int var72 = var5 + 8 + 0; var72 < var5 + 8 + 16; var72++) {
               int var81 = this.p.d(var54, var72);
               if (var81 > 0
                  && var81 < 128
                  && this.p.a(var54, var81, var72) == 0
                  && this.p.f(var54, var81 - 1, var72).c()
                  && this.p.f(var54, var81 - 1, var72) != Class0155.r) {
                  this.p.d(var54, var81, var72, Class0312.aS.ba);
               }
            }
         }
      }

      Class0085.a = false;
   }

   @Override
   public boolean a(boolean var1, Class0360 var2) {
      return true;
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public boolean b() {
      return true;
   }
}
