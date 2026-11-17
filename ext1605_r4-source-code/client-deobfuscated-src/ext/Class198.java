package ext;

public class Class198 extends Class359 {
   public Class334 field_1296;
   public int field_1457 = 0;
   public int field_2283;
   private int field_2291 = 5;
   public float field_2081 = (float)(Math.random() * Math.PI * 2.0);
   private int field_502 = Integer.MAX_VALUE;
   private int field_775 = Integer.MAX_VALUE;
   private int field_1869 = Integer.MAX_VALUE;
   private int field_662 = 0;

   public Class198(Class454 var1, double var2, double var4, double var6, Class334 var8) {
      super(var1);
      this.method_244(0.25F, 0.25F);
      this.field_838 = this.field_1443 / 2.0F;
      this.method_172(var2, var4, var6);
      this.field_1296 = var8;
      this.field_1661 = (float)(Math.random() * 360.0);
      this.field_2549 = (float)(Math.random() * 0.2F - 0.1F);
      this.field_2501 = 0.2F;
      this.field_489 = (float)(Math.random() * 0.2F - 0.1F);
      this.field_1522 = false;
   }

   public Class198(Class454 var1) {
      super(var1);
      this.method_244(0.25F, 0.25F);
      this.field_838 = this.field_1443 / 2.0F;
   }

   @Override
   public void method_46() {
      super.method_46();
      if (this.field_2283 > 0) {
         this.field_2283--;
      }

      this.field_2553 = this.field_1417;
      this.field_2068 = this.field_2654;
      this.field_1780 = this.field_2013;
      if (this.field_662 > 0) {
         this.field_2501 += 0.2F;
      } else {
         this.field_2501 -= 0.04F;
      }

      if (this.field_1468.method_1286(Class469.method_468(this.field_1417), Class469.method_468(this.field_2654), Class469.method_468(this.field_2013))
         == Class160.field_3120) {
         this.field_2501 = 0.2F;
         this.field_2549 = (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F;
         this.field_489 = (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F;
         this.field_1468.method_1904(this, "random.fizz", 0.4F, 2.0F + this.field_2850.nextFloat() * 0.4F);
      }

      this.method_722(this.field_1417, this.field_2654, this.field_2013);
      this.method_36();
      this.method_981(this.field_2549, this.field_2501, this.field_489);
      float var1 = 0.98F;
      if (this.field_2669 && this.field_662 == 0) {
         var1 = 0.58800006F;
         int var2 = this.field_1468
            .method_197(Class469.method_468(this.field_1417), Class469.method_468(this.field_235.field_946) - 1, Class469.method_468(this.field_2013));
         if (var2 > 0) {
            var1 = Class108.field_1221[var2].field_1966 * 0.98F;
         }
      }

      this.field_2549 *= var1;
      this.field_2501 *= 0.98F;
      this.field_489 *= var1;
      if (this.field_2669 && this.field_662 == 0) {
         this.field_2501 *= -0.5;
      }

      this.field_1457++;
      if (this.field_1457 >= 6000) {
         this.method_1594();
      }

      int var15 = (int)Math.round(Math.floor(this.field_1417));
      int var3 = (int)Math.round(Math.floor(this.field_2654));
      int var4 = (int)Math.round(Math.floor(this.field_2013));
      if (var15 != this.field_502 || var3 != this.field_775 || var4 != this.field_1869) {
         this.field_662 = 0;
         if (var3 < 0) {
            this.field_502 = var15;
            this.field_775 = var3;
            this.field_1869 = var4;
         } else {
            byte var5 = 0;

            label198:
            for (int var6 = Math.min(var3, 128); var6 >= 0; var6--) {
               int var7 = this.field_1468.method_197(var15, var6, var4);
               if (var7 == Class390.field_2597.field_2151) {
                  Class476 var8 = (Class476)this.field_1468.method_1303(var15, var6, var4);
                  boolean var9 = false;
                  boolean var10 = var8.method_1416(0).field_2326 > 0;
                  if (this.field_1296.field_1782 == Class50.field_2952.field_10 && var8.method_1416(0).field_2326 < 64 && var6 == var3) {
                     if (!var10) {
                        this.field_1468.method_1678(var15, var6, var4, var15, var6, var4);
                     }

                     var10 = true;
                     if (this.field_1296.field_2326 <= 64 - var8.method_1416(0).field_2326) {
                        Class334 var10000 = var8.method_1416(0);
                        var10000.field_2326 = var10000.field_2326 + this.field_1296.field_2326;
                        if (var8.method_1416(0).field_2326 == 64) {
                           this.field_1468.method_1678(var15, var3, var4, var15, var3, var4);
                        }

                        this.method_1594();
                        break;
                     }

                     int var11 = 64 - var8.method_1416(0).field_2326;
                     var8.method_1416(0).field_2326 = 64;
                     var9 = true;
                     this.field_1296.field_2326 -= var11;
                  }

                  if (var9) {
                     this.field_1468.method_1678(var15, var3, var4, var15, var3, var4);
                  }

                  if (!var10) {
                     break;
                  }

                  if (var6 > 0) {
                     int var16 = this.field_1468.method_197(var15, var6 - 1, var4);
                     if (var16 == Class390.field_3040.field_2151) {
                        var5 = 1;
                     }

                     if (var16 == Class390.field_1075.field_2151) {
                        var5 = 6;
                     }

                     if (var16 == Class108.field_93.field_2151) {
                        var5 = 2;
                     }

                     if (var16 == Class108.field_2604.field_2151 || var16 == Class108.field_847.field_2151) {
                        if (var8.method_1416(0).field_2326 == 64) {
                           var5 = 4;
                        } else {
                           var5 = 3;
                        }
                     }

                     if (var16 == Class108.field_2441.field_2151) {
                        var5 = 5;
                     }
                  }

                  switch (var5) {
                     case 0:
                        this.field_662 = var8.method_1416(0).field_2326 - (var3 - var6);
                        break label198;
                     case 1:
                        if (var6 != var3 || var8.method_1416(0).field_2326 != 64 || this.field_1296.method_801() == Class50.field_2952) {
                           break label198;
                        }

                        int var19;
                        for (var19 = this.field_1296.method_1798() * this.field_1296.field_2326; var19 > 64; var19 -= 64) {
                           Class334 var21 = new Class334(Class50.field_2952, 64);
                           Class198 var22 = new Class198(this.field_1468, this.field_1417, this.field_2654, this.field_2013, var21);
                           var22.field_2549 = this.field_2549;
                           var22.field_2501 = this.field_2501;
                           var22.field_489 = this.field_489;
                           this.field_1468.method_1447(var22);
                        }

                        this.field_1296 = new Class334(Class50.field_2952, var19);
                        break label198;
                     case 2:
                        if (var6 == var3 && var8.method_1416(0).field_2326 == 64) {
                           Class520 var18 = (Class520)this.field_1468.method_1303(var15, var6 - 1, var4);
                           int var20 = var18.method_1574();

                           for (int var13 = 0; var13 < var20; var13++) {
                              Class334 var14 = var18.method_1416(var13);
                              if (var14 == null) {
                                 var14 = new Class334(0, 0);
                              }

                              if (var14.field_1782 != 0) {
                                 if (var14.field_1782 != this.field_1296.field_1782
                                    || var14.field_1862 != this.field_1296.field_1862
                                    || var14.method_930() <= var14.field_2326) {
                                    continue;
                                 }
                              } else {
                                 var14.field_1782 = this.field_1296.field_1782;
                                 var14.field_2326 = 0;
                              }

                              if (var14.field_2326 == 0) {
                                 var14.field_2326 = this.field_1296.field_2326;
                                 this.field_1296.field_2326 = 0;
                                 this.method_1594();
                              } else if (var14.method_930() - var14.field_2326 >= this.field_1296.field_2326) {
                                 var14.field_2326 = var14.field_2326 + this.field_1296.field_2326;
                                 this.field_1296.field_2326 = 0;
                                 this.method_1594();
                              } else {
                                 this.field_1296.field_2326 = this.field_1296.field_2326 - (var14.method_930() - var14.field_2326);
                                 var14.field_2326 = var14.method_930();
                              }

                              var18.method_708(var13, var14);
                              if (this.field_1296.field_2326 <= 0) {
                                 break label198;
                              }
                           }
                        }
                     case 3:
                     case 4:
                     default:
                        break label198;
                     case 5:
                        if (var6 == var3) {
                           this.field_2549 *= 2.3F;
                           this.field_489 *= 2.3F;
                        }
                        break label198;
                     case 6:
                        if (var6 == var3
                           && var8.method_1416(0).field_2326 == 64
                           && this.field_1296.method_801() == Class50.field_2952
                           && this.field_1296.field_2326 >= 9) {
                           if (this.field_1296.field_2326 % 9 == 0) {
                              this.field_1296 = new Class334(Class390.field_801, this.field_1296.field_2326 / 9);
                           } else {
                              Class334 var17 = new Class334(Class390.field_801, this.field_1296.field_2326 / 9);
                              Class198 var12 = new Class198(this.field_1468, this.field_1417, this.field_2654, this.field_2013, var17);
                              var12.field_2549 = this.field_2549;
                              var12.field_2501 = this.field_2501;
                              var12.field_489 = this.field_489;
                              this.field_1468.method_1447(var12);
                              this.field_1296.field_2326 %= 9;
                           }
                        }
                        break label198;
                  }
               }

               if (var7 != 0) {
                  break;
               }
            }

            this.field_502 = var15;
            this.field_775 = var3;
            this.field_1869 = var4;
         }
      }

      if (this.field_662 > 0) {
         this.field_2501 = this.field_662 * 0.015;
      }
   }

   @Override
   public boolean method_36() {
      return this.field_1468.method_461(this.field_235, Class160.field_1413, this);
   }

   private boolean method_722(double var1, double var3, double var5) {
      int var7 = Class469.method_468(var1);
      int var8 = Class469.method_468(var3);
      int var9 = Class469.method_468(var5);
      double var10 = var1 - var7;
      double var12 = var3 - var8;
      double var14 = var5 - var9;
      if (Class108.field_710[this.field_1468.method_197(var7, var8, var9)]) {
         boolean var16 = !Class108.field_710[this.field_1468.method_197(var7 - 1, var8, var9)];
         boolean var17 = !Class108.field_710[this.field_1468.method_197(var7 + 1, var8, var9)];
         boolean var18 = !Class108.field_710[this.field_1468.method_197(var7, var8 - 1, var9)];
         boolean var19 = !Class108.field_710[this.field_1468.method_197(var7, var8 + 1, var9)];
         boolean var20 = !Class108.field_710[this.field_1468.method_197(var7, var8, var9 - 1)];
         boolean var21 = !Class108.field_710[this.field_1468.method_197(var7, var8, var9 + 1)];
         byte var22 = -1;
         double var23 = 9999.0;
         if (var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if (var17 && 1.0 - var10 < var23) {
            var23 = 1.0 - var10;
            var22 = 1;
         }

         if (var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if (var19 && 1.0 - var12 < var23) {
            var23 = 1.0 - var12;
            var22 = 3;
         }

         if (var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if (var21 && 1.0 - var14 < var23) {
            var23 = 1.0 - var14;
            var22 = 5;
         }

         float var25 = this.field_2850.nextFloat() * 0.2F + 0.1F;
         if (var22 == 0) {
            this.field_2549 = -var25;
         }

         if (var22 == 1) {
            this.field_2549 = var25;
         }

         if (var22 == 2) {
            this.field_2501 = -var25;
         }

         if (var22 == 3) {
            this.field_2501 = var25;
         }

         if (var22 == 4) {
            this.field_489 = -var25;
         }

         if (var22 == 5) {
            this.field_489 = var25;
         }
      }

      return false;
   }

   @Override
   protected void method_211(int var1) {
      this.method_308((Class359)null, var1);
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      this.field_2291 -= var2;
      if (this.field_2291 <= 0) {
         this.method_1594();
      }

      return false;
   }

   @Override
   public void method_863(Class686 var1) {
      var1.method_777("Health", (byte)this.field_2291);
      var1.method_777("Age", (short)this.field_1457);
      var1.method_257("Item", this.field_1296.method_1589(new Class686()));
   }

   @Override
   public void method_1054(Class686 var1) {
      this.field_2291 = var1.method_1321("Health") & 255;
      this.field_1457 = var1.method_1321("Age");
      Class686 var2 = var1.method_508("Item");
      this.field_1296 = new Class334(var2);
   }

   @Override
   public void method_1714(Class354 var1) {
      if (!this.field_1468.field_2994) {
         int var2 = this.field_1296.field_2326;
         if (this.field_2283 == 0 && var1.field_559.method_572(this.field_1296)) {
            this.field_1468.method_1904(this, "random.pop", 0.2F, ((this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.method_1132(this, var2);
            this.method_1594();
         }
      }
   }
}
