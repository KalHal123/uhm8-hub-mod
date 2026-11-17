package ext;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

public class Class542 {
   private float[] field_3122 = new float[768];
   private int[] field_1928 = new int[5120];
   private int[] field_2957 = new int[5120];
   private int[] field_786 = new int[5120];
   private int[] field_2777 = new int[5120];
   private int[] field_293 = new int[34];
   private int[] field_705 = new int[768];

   public Class542() {
      try {
         BufferedImage var1 = ImageIO.read(Class100.method_1854(Minecraft.field_1094));
         int[] var2 = new int[65536];
         var1.getRGB(0, 0, 256, 256, var2, 0, 256);

         for (int var3 = 0; var3 < 512; var3++) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = var3 % 16 * 16;
            int var8 = var3 / 16 * 32;
            int var9 = 0;

            for (int var10 = 0; var10 < 16; var10++) {
               for (int var11 = 0; var11 < 16; var11++) {
                  int var12 = var2[var11 + var7 + (var10 + var8) * 256];
                  int var13 = var12 >> 24 & 0xFF;
                  if (var13 > 128) {
                     var4 += var12 >> 16 & 0xFF;
                     var5 += var12 >> 8 & 0xFF;
                     var6 += var12 & 0xFF;
                     var9++;
                  }
               }

               if (var9 == 0) {
                  var9++;
               }

               this.field_3122[var3 * 3 + 0] = var4 / var9;
               this.field_3122[var3 * 3 + 1] = var5 / var9;
               this.field_3122[var3 * 3 + 2] = var6 / var9;
            }
         }
      } catch (IOException var14) {
         var14.printStackTrace();
      }

      for (int var15 = 0; var15 < 256; var15++) {
         if (Class108.field_1221[var15] != null) {
            this.field_705[var15 * 3 + 0] = Class108.field_1221[var15].method_1735(1);
            this.field_705[var15 * 3 + 1] = Class108.field_1221[var15].method_1735(2);
            this.field_705[var15 * 3 + 2] = Class108.field_1221[var15].method_1735(3);
         }
      }
   }

   public void method_1627(Class448 var1) {
      Class454 var2 = var1.field_2391;
      if (var2 != null && var2.field_2450.method_972(var1.field_528, var1.field_2238)) {
         int var3 = var1.field_528 * 16;
         int var4 = var1.field_2238 * 16;
         int var5 = var3 + 16;
         int var6 = var4 + 16;
         Class741 var7 = var2.method_1474(var1.field_528, var1.field_2238);
         if (var7.field_347) {
            var1.field_886 = true;
            var1.field_1315 = true;
         } else {
            var1.field_886 = false;
            Arrays.fill(this.field_2957, 0);
            Arrays.fill(this.field_786, 0);
            Arrays.fill(this.field_293, 160);

            for (int var8 = var6 - 1; var8 >= var4; var8--) {
               for (int var9 = var5 - 1; var9 >= var3; var9--) {
                  int var10 = var9 - var3;
                  int var11 = var8 - var4;
                  int var12 = var10 + var11;
                  boolean var13 = true;

                  for (int var14 = 0; var14 < 128; var14++) {
                     int var15 = var11 - var10 - var14 + 160 - 16;
                     if (var15 < this.field_293[var12] || var15 < this.field_293[var12 + 1]) {
                        Class108 var16 = Class108.field_1221[var2.method_197(var9, var14, var8)];
                        if (var16 == null) {
                           var13 = false;
                        } else if (var16.field_1854 == Class160.field_1413) {
                           int var17 = var2.method_197(var9, var14 + 1, var8);
                           if (var17 == 0 || Class108.field_1221[var17].field_1854 != Class160.field_1413) {
                              float var18 = var14 / 127.0F * 0.6F + 0.4F;
                              float var19 = var2.method_1154(var9, var14 + 1, var8) * var18;
                              if (var15 >= 0 && var15 < 160) {
                                 int var20 = var12 + var15 * 32;
                                 if (var12 >= 0 && var12 <= 32 && this.field_786[var20] <= var14) {
                                    this.field_786[var20] = var14;
                                    this.field_2777[var20] = (int)(var19 * 127.0F);
                                 }

                                 if (var12 >= -1 && var12 <= 31 && this.field_786[var20 + 1] <= var14) {
                                    this.field_786[var20 + 1] = var14;
                                    this.field_2777[var20 + 1] = (int)(var19 * 127.0F);
                                 }

                                 var13 = false;
                              }
                           }
                        } else {
                           if (var13) {
                              if (var15 < this.field_293[var12]) {
                                 this.field_293[var12] = var15;
                              }

                              if (var15 < this.field_293[var12 + 1]) {
                                 this.field_293[var12 + 1] = var15;
                              }
                           }

                           float var24 = var14 / 127.0F * 0.6F + 0.4F;
                           if (var15 >= 0 && var15 < 160) {
                              int var25 = var12 + var15 * 32;
                              int var27 = this.field_705[var16.field_2151 * 3 + 0];
                              float var29 = (var2.method_1154(var9, var14 + 1, var8) * 0.8F + 0.2F) * var24;
                              if (var12 >= 0 && this.field_2957[var25] <= var14) {
                                 this.field_2957[var25] = var14;
                                 this.field_1928[var25] = 0xFF000000
                                    | (int)(this.field_3122[var27 * 3 + 0] * var29) << 16
                                    | (int)(this.field_3122[var27 * 3 + 1] * var29) << 8
                                    | (int)(this.field_3122[var27 * 3 + 2] * var29);
                              }

                              if (var12 < 31) {
                                 float var21 = var29 * 0.9F;
                                 if (this.field_2957[var25 + 1] <= var14) {
                                    this.field_2957[var25 + 1] = var14;
                                    this.field_1928[var25 + 1] = 0xFF000000
                                       | (int)(this.field_3122[var27 * 3 + 0] * var21) << 16
                                       | (int)(this.field_3122[var27 * 3 + 1] * var21) << 8
                                       | (int)(this.field_3122[var27 * 3 + 2] * var21);
                                 }
                              }
                           }

                           if (var15 >= -1 && var15 < 159) {
                              int var26 = var12 + (var15 + 1) * 32;
                              int var28 = this.field_705[var16.field_2151 * 3 + 1];
                              float var30 = var2.method_1154(var9 - 1, var14, var8) * 0.8F + 0.2F;
                              int var22 = this.field_705[var16.field_2151 * 3 + 2];
                              float var31 = var2.method_1154(var9, var14, var8 + 1) * 0.8F + 0.2F;
                              if (var12 >= 0) {
                                 float var23 = var30 * var24 * 0.6F;
                                 if (this.field_2957[var26] <= var14 - 1) {
                                    this.field_2957[var26] = var14 - 1;
                                    this.field_1928[var26] = 0xFF000000
                                       | (int)(this.field_3122[var28 * 3 + 0] * var23) << 16
                                       | (int)(this.field_3122[var28 * 3 + 1] * var23) << 8
                                       | (int)(this.field_3122[var28 * 3 + 2] * var23);
                                 }
                              }

                              if (var12 < 31) {
                                 float var32 = var31 * 0.9F * var24 * 0.4F;
                                 if (this.field_2957[var26 + 1] <= var14 - 1) {
                                    this.field_2957[var26 + 1] = var14 - 1;
                                    this.field_1928[var26 + 1] = 0xFF000000
                                       | (int)(this.field_3122[var22 * 3 + 0] * var32) << 16
                                       | (int)(this.field_3122[var22 * 3 + 1] * var32) << 8
                                       | (int)(this.field_3122[var22 * 3 + 2] * var32);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            this.method_971();
            if (var1.field_891 == null) {
               var1.field_891 = new BufferedImage(32, 160, 2);
            }

            var1.field_891.setRGB(0, 0, 32, 160, this.field_1928, 0, 32);
            var1.field_1315 = true;
         }
      } else {
         var1.field_886 = true;
         var1.field_1315 = true;
      }
   }

   private void method_971() {
      for (int var1 = 0; var1 < 32; var1++) {
         for (int var2 = 0; var2 < 160; var2++) {
            int var3 = var1 + var2 * 32;
            if (this.field_2957[var3] == 0) {
               this.field_1928[var3] = 0;
            }

            if (this.field_786[var3] > this.field_2957[var3]) {
               int var4 = this.field_1928[var3] >> 24 & 0xFF;
               this.field_1928[var3] = ((this.field_1928[var3] & 16711422) >> 1) + this.field_2777[var3];
               if (var4 < 128) {
                  this.field_1928[var3] = Integer.MIN_VALUE + this.field_2777[var3] * 2;
               } else {
                  this.field_1928[var3] = this.field_1928[var3] | 0xFF000000;
               }
            }
         }
      }
   }
}
