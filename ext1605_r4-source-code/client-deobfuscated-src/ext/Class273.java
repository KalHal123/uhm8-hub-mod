package ext;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class Class273 extends Class254 {
   public static String field_2028 = "Minecraft Alpha v1.0.16.05_20 Cypress";
   private static Class627 field_1292 = new Class627();
   private List<Class289> field_1733 = new ArrayList<>();
   private Random field_3105 = new Random();
   public Minecraft field_2506;
   public String field_2626 = null;
   private int field_1664 = 0;
   private String field_239 = "";
   private int field_1000 = 0;
   public float field_990;
   float field_2137 = 1.0F;
   private int field_969;
   private int field_1214;
   public String field_2812 = "";
   public long field_1050 = 0L;
   private static final String[] field_2864 = new String[]{
      "SIE",
      "LOH",
      "KII",
      "HUR",
      "MIS",
      "RUU",
      "VY",
      "KA",
      "TAV",
      "OLE",
      "PAH",
      "MUI",
      "MAT",
      "JA",
      "SAU",
      "NIN",
      "UD",
      "MU",
      "NGI",
      "BAR",
      "LUG",
      "MAH",
      "GIR",
      "AK",
      "USU",
      "ESE",
      "IRU",
      "UUN",
      "AMTU",
      "AGAS",
      "HI",
      "TOOI",
      "YORU",
      "NEN",
      "PON",
      "ONNA",
      "TSU",
      "YA",
      "AO",
      "ONI",
      "AN",
      "KO",
      "SHI",
      "YUME",
      "YARI",
      "NIM",
      "GYEONG",
      "KKOT",
      "ISA",
      "MI",
      "OI",
      "YS",
      "LES",
      "OUX",
      "IA",
      "CHA",
      "NIDA",
      "JEO",
      "SANA",
      "KOLI",
      "LOHI",
      "KAAR",
      "ME",
      "KISSA",
      "TEST"
   };
   private boolean field_245 = false;
   private long field_658;
   public Class149 field_2247;
   public Class165 field_1209;
   public Class438 field_546;
   public Class14 field_1238;
   public Class429 field_936;
   public Class418 field_1169;
   public Class495 field_1086;

   public Class273(Minecraft var1) {
      this.field_2506 = var1;
      this.field_2247 = new Class149(var1);
      this.field_1209 = new Class165(var1);
      this.field_546 = new Class438(var1);
      this.field_1238 = new Class14(var1);
      this.field_1169 = new Class418(var1);
      this.field_1086 = new Class495();
      this.field_936 = new Class429();
   }

   public static String method_1021(long var0, int var2, int var3) {
      long var4 = var2 + 392214;
      long var6 = var3 + 392214;
      long var8 = var6 * 784428L + var4;
      var8 ^= var0;
      var8 &= 2147483647L;
      int var10 = (int)Math.sqrt(var2 * var2 + var3 * var3);
      int var11 = 0;
      byte var12 = 3;

      for (int var13 = var10; var13 / var12 > 0; var12 *= 4) {
         var11++;
      }

      String var14 = "";
      if (var11 > 0) {
         for (int var15 = 0; var15 != var11; var15++) {
            var14 = var14 + field_2864[(int)((var10 + var11 + var12 + var8 * (2 + var15)) % 64L)];
         }

         var14 = var14 + "-";
      }

      var14 = var14 + field_2864[(int)((var8 * 2L + var10) % 64L)];
      var14 = var14 + field_2864[(int)((var8 * 3L + var10) % 64L)];
      return var14 + field_2864[(int)((var8 * 4L + var10) % 64L)];
   }

   public void method_961() {
      this.field_969 = (int)(this.field_2506.field_2787.field_1417 / 32.0);
      this.field_1214 = (int)(this.field_2506.field_2787.field_2013 / 32.0);
      this.field_658 = this.field_2506.field_2648.field_482;
      this.field_245 = true;
      this.field_2812 = method_1021(this.field_658, this.field_969, this.field_1214);
      Class597.method_883("Name at " + (int)this.field_2506.field_2787.field_1417 + " " + (int)this.field_2506.field_2787.field_2013 + ": " + this.field_2812);
      this.field_1050 = System.currentTimeMillis();
   }

   public boolean method_573() {
      int var1 = (int)(this.field_2506.field_2787.field_1417 / 32.0);
      int var2 = (int)(this.field_2506.field_2787.field_2013 / 32.0);
      return !this.field_245 || this.field_658 != this.field_2506.field_2648.field_482 || var1 != this.field_969 || var2 != this.field_1214;
   }

   public void method_101(float var1, boolean var2, int var3, int var4) {
      if (!Class119.method_696(59)) {
         Class187 var5 = new Class187(this.field_2506.field_2517, this.field_2506.field_2477);
         int var6 = var5.method_884();
         int var7 = var5.method_351();
         Class640 var8 = this.field_2506.field_1541;
         this.field_2506.field_1455.method_808();
         if (!Class310.field_2389) {
            GL11.glEnable(3042);
            if (this.field_2506.field_1754.field_674 == 1) {
               this.method_688(this.field_2506.field_2787.method_50(var1), var6, var7);
            }

            Class334 var9 = this.field_2506.field_2787.field_559.method_1047(3);
            if (var9 != null && var9.method_801() instanceof Class725 && ((Class725)var9.method_801()).field_409 == 6) {
               GL11.glDisable(2929);
               GL11.glDepthMask(false);
               GL11.glBlendFunc(0, 769);
               Class254.method_421(0, 0, var6, var7, -1602191232, -1608507360);
               GL11.glDepthMask(true);
               GL11.glEnable(2929);
            }

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.field_2506.field_2176.method_1545("/gui/gui.png"));
            Class267 var10 = this.field_2506.field_2787.field_559;
            this.field_1275 = -90.0F;
            if (this.field_2506.field_3103 instanceof Class493) {
               int var11 = var6 / 12 * 11 - 91;
               int var12 = var7 - 32 - 3;
               this.method_1219(var11, var12, 0, 0, 22, 22);
               this.method_1219(var11 + 22, var12, 162, 0, 22, 22);
               this.method_1219(var11 + var10.field_2127 * 20 - 1, var12 - 1, 0, 22, 24, 24);
            } else {
               this.method_1219(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
               this.method_1219(var6 / 2 - 91 - 1 + var10.field_2127 * 20, var7 - 22 - 1, 0, 22, 24, 22);
            }

            GL11.glBindTexture(3553, this.field_2506.field_2176.method_1545("/gui/icons.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            this.method_1219(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            boolean var27 = this.field_2506.field_2787.field_1659 / 3 % 2 == 1;
            if (this.field_2506.field_2787.field_1659 < 10) {
               var27 = false;
            }

            int var28 = this.field_2506.field_2787.field_2572;
            int var13 = this.field_2506.field_2787.field_297;
            this.field_3105.setSeed(this.field_1664 * 312871);
            if (this.field_2506.field_3103.method_1746()) {
               int var14 = this.field_2506.field_2787.method_1572();
               int var17 = var6 / 2 + 19;
               int var18 = var7 - (this.field_2506.field_1754.field_2564 == 4 ? 32 : 41);

               for (int var19 = 0; var19 != 4; var19++) {
                  Class334 var20 = this.field_2506.field_2787.field_559.method_1047(var19);
                  if (var20 != null && var20.method_801() instanceof Class725) {
                     int var21 = var20.method_1365();
                     int var22 = var21 - var20.field_1862;
                     float var23 = (float)var22 / var21;
                     this.method_1219(var17 + 18 * var19, var18, 52, 9, 9, 9);
                     this.method_1219(var17 + 9 + 18 * var19, var18, 52, 9, 9, 9);
                     if (var23 >= 0.75F) {
                        this.method_1219(var17 + 18 * var19, var18, 88, 9, 9, 9);
                        this.method_1219(var17 + 9 + 18 * var19, var18, 88, 9, 9, 9);
                     } else if (var23 >= 0.5F) {
                        this.method_1219(var17 + 18 * var19, var18, 97, 9, 9, 9);
                        this.method_1219(var17 + 9 + 18 * var19, var18, 88, 9, 9, 9);
                     } else if (var23 >= 0.25F) {
                        this.method_1219(var17 + 9 + 18 * var19, var18, 88, 9, 9, 9);
                     } else {
                        this.method_1219(var17 + 9 + 18 * var19, var18, 97, 9, 9, 9);
                     }
                  }
               }

               if (this.field_2506.field_2787.field_1796 != 0) {
                  Class254.method_421(var6 / 2 - 50 - 1, var7 - 90 - 1, var6 / 2 - 50 + 100 + 1, var7 - 90 + 5 + 1, -14671840, -16777216);
                  int var45 = this.field_2506.field_2787.field_1796;
                  int var51 = -3584;
                  int var57 = -13893888;
                  if (var45 < 15) {
                     var51 = -16735489;
                     var57 = -16759637;
                  }

                  Class254.method_421(var6 / 2 - 50, var7 - 90, var6 / 2 - 50 + (int)(100.0F * (1.0F - var45 / 30.0F)), var7 - 90 + 5, var51, var57);
               }

               if (Class730.field_2746) {
                  Class254.method_421(var6 / 2 - 150 - 1, 59, var6 / 2 - 150 + 301, 66, -14671840, -16777216);
                  Class254.method_421(
                     var6 / 2 - 150,
                     60,
                     var6 / 2 - 150 + (int)(300.0F * ((float)Class730.field_7.field_2572 / Class730.field_7.field_2005)),
                     65,
                     -3070185,
                     -786683
                  );
                  var8.method_1444(Class730.field_2045, var6 / 2 - 150 - 1, 65, 16777215);
                  GL11.glBindTexture(3553, this.field_2506.field_2176.method_1545("/gui/icons.png"));
               }

               if (this.field_2506.field_1754.field_2564 == 4) {
                  if (this.field_2506.field_2787.field_2572 != 0) {
                     int var48 = var6 / 2 - 91;
                     int var53 = var7 - 32;
                     this.method_1219(var48, var53, 0, 16, 9, 9);
                  }
               } else {
                  for (int var15 = 0; var15 < 10; var15++) {
                     int var16 = var7 - 32;
                     if (var14 > 0) {
                        int var46 = var6 / 2 + 91 - var15 * 8 - 9;
                        if (var15 * 2 + 1 < var14) {
                           this.method_1219(var46, var16, 34, 9, 9, 9);
                        }

                        if (var15 * 2 + 1 == var14) {
                           this.method_1219(var46, var16, 25, 9, 9, 9);
                        }

                        if (var15 * 2 + 1 > var14) {
                           this.method_1219(var46, var16, 16, 9, 9, 9);
                        }
                     }

                     byte var47 = 0;
                     if (var27) {
                        var47 = 1;
                     }

                     int var52 = var6 / 2 - 91 + var15 * 8;
                     if (this.field_2506.field_3103 instanceof Class493) {
                        var52 += 45;
                     }

                     if (var28 <= 4) {
                        var16 += this.field_3105.nextInt(2);
                     }

                     this.method_1219(var52, var16, 16 + var47 * 9, 0, 9, 9);
                     if (var27) {
                        if (var15 * 2 + 1 < var13) {
                           this.method_1219(var52, var16, 70, 0, 9, 9);
                        }

                        if (var15 * 2 + 1 == var13) {
                           this.method_1219(var52, var16, 79, 0, 9, 9);
                        }
                     }

                     if (var15 * 2 + 1 < var28) {
                        this.method_1219(var52, var16, 52, 0, 9, 9);
                     }

                     if (var15 * 2 + 1 == var28) {
                        this.method_1219(var52, var16, 61, 0, 9, 9);
                     }
                  }
               }

               if (this.field_2506.field_2787.method_482(Class160.field_1413)) {
                  int var30 = (int)Math.ceil((this.field_2506.field_2787.field_1804 - 2) * 10.0 / 300.0);
                  int var34 = (int)Math.ceil(this.field_2506.field_2787.field_1804 * 10.0 / 300.0) - var30;

                  for (int var49 = 0; var49 < var30 + var34; var49++) {
                     if (var49 < var30) {
                        this.method_1219(var6 / 2 - 91 + var49 * 8, var7 - 32 - 9, 16, 18, 9, 9);
                     } else {
                        this.method_1219(var6 / 2 - 91 + var49 * 8, var7 - 32 - 9, 25, 18, 9, 9);
                     }
                  }
               }
            }

            GL11.glDisable(3042);
            GL11.glEnable(32826);
            GL11.glPushMatrix();
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            Class584.method_331();
            GL11.glPopMatrix();
            if (!(this.field_2506.field_3103 instanceof Class493)) {
               for (int var29 = 0; var29 < 9; var29++) {
                  int var31 = var6 / 2 - 90 + var29 * 20 + 2;
                  int var35 = var7 - 16 - 3;
                  this.method_826(var29, var31, var35, var1);
               }
            } else {
               for (int var39 = 0; var39 < 2; var39++) {
                  int var32 = var6 / 12 * 11 - 90 + var39 * 20 + 2;
                  int var36 = var7 - 30 - 3;
                  this.method_826(var39, var32, var36, var1);
               }
            }

            this.field_1238.method_1847(this, var6, var7);
            this.field_2247.method_1057(this, var6, var7);
            if (Class119.field_1519.field_2787 instanceof Class213) {
               this.field_1209.method_1649(this, var6, var7);
            } else if (Class119.field_1519.field_2787 instanceof Class404) {
               this.field_546.method_886(this, var6, var7);
            }

            Class584.method_62();
            GL11.glDisable(32826);
            Class3.method_1783(this.field_2506);
            if (!Keyboard.isKeyDown(61) && !Class310.field_2337) {
               var8.method_1444(field_2028, 2, 2, 16777215);
               var8.method_1444(this.field_2506.field_71, 2, 12, 16777215);
               var8.method_1444(
                  "x:"
                     + (int)this.field_2506.field_2787.field_1417
                     + " y:"
                     + (int)this.field_2506.field_2787.field_2654
                     + " z:"
                     + (int)this.field_2506.field_2787.field_2013,
                  2,
                  22,
                  16777215
               );
            } else {
               var8.method_1444(field_2028, 2, 2, 16777215);
               var8.method_1444(this.field_2506.field_71, 2, 12, 16777215);
               var8.method_1444(this.field_2506.method_1324(), 2, 22, 16777215);
               var8.method_1444(this.field_2506.method_644(), 2, 32, 16777215);
               var8.method_1444(this.field_2506.method_1505(), 2, 42, 16777215);
               var8.method_1444("WSd:" + this.field_2506.field_2648.field_482 + ";t:" + this.field_2506.field_2648.field_2075 % 24000L, 2, 52, 16777215);
               var8.method_1444("ChnkPath:" + method_1211(this.field_2506), 2, 62, 16777215);
               var8.method_1444(
                  "LL:" + this.field_2506.field_2648.method_1154((int)Class119.field_243, (int)Class119.field_39, (int)Class119.field_777), 2, 72, 16777215
               );
               var8.method_1444("ObvT:" + this.field_2506.field_2787.field_2875, 2, 82, 16777215);
               long var43 = Runtime.getRuntime().maxMemory();
               long var54 = Runtime.getRuntime().totalMemory();
               long var59 = Runtime.getRuntime().freeMemory();
               long var24 = var54 - var59;
               String var40 = "Used memory: " + var24 * 100L / var43 + "% (" + var24 / 1024L / 1024L + "MB) of " + var43 / 1024L / 1024L + "MB";
               Class254.method_773(var8, var40, var6 - var8.method_962(var40) - 2, 2, 14737632);
               var40 = "Allocated memory: " + var54 * 100L / var43 + "% (" + var54 / 1024L / 1024L + "MB)";
               Class254.method_773(var8, var40, var6 - var8.method_962(var40) - 2, 12, 14737632);
               String var26 = Class119.field_1519.method_457();
               Class254.method_773(var8, var26, var6 - var8.method_962(var26) - 2, 22, -1);
            }

            this.field_936.method_1198(this, var6, var7);
            GL11.glPushMatrix();
            float var44 = (float)Math.pow(0.5, this.field_2812.length() / 10);
            GL11.glScalef(1.0F + var44, 1.0F + var44, 1.0F + var44);
            int var50 = (int)(255.0F * Math.max(1.0F - (float)Math.min(System.currentTimeMillis() - this.field_1050, 5000L) / 5000.0F, 0.3F));
            if (var50 != 0) {
               var8.method_1444(this.field_2812, (int)(var6 / (1.0F + var44) - var8.method_962(this.field_2812) - 10.0F), 20, 16777215 + var50 * 16777216);
            }

            GL11.glPopMatrix();
            GL11.glBindTexture(3553, this.field_2506.field_2176.method_1545("/gui/icons.png"));
            if (this.field_1000 > 0) {
               float var55 = this.field_1000 - var1;
               int var33 = (int)(var55 * 256.0F / 20.0F);
               if (var33 > 255) {
                  var33 = 255;
               }

               if (var33 > 0) {
                  GL11.glPushMatrix();
                  GL11.glTranslatef(var6 / 2, var7 - 48, 0.0F);
                  GL11.glEnable(3042);
                  GL11.glBlendFunc(770, 771);
                  int var37 = Color.HSBtoRGB(var55 / 50.0F, 0.7F, 0.6F) & 16777215;
                  var8.method_1870(this.field_239, -var8.method_962(this.field_239) / 2, -4, var37 + (var33 << 24));
                  GL11.glDisable(3042);
                  GL11.glPopMatrix();
               }
            }

            byte var56 = 10;
            boolean var58 = false;
            if (this.field_2506.field_1883 instanceof Class573) {
               var56 = 20;
               var58 = true;
            }

            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDisable(3008);
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, var7 - 48, 0.0F);

            for (int var38 = 0; var38 < this.field_1733.size() && var38 < var56; var38++) {
               if (this.field_1733.get(var38).field_3116 < 200 || var58) {
                  double var60 = this.field_1733.get(var38).field_3116 / 200.0;
                  var60 = 1.0 - var60;
                  var60 *= 10.0;
                  if (var60 < 0.0) {
                     var60 = 0.0;
                  }

                  if (var60 > 1.0) {
                     var60 = 1.0;
                  }

                  var60 *= var60;
                  int var64 = (int)(255.0 * var60);
                  if (var58) {
                     var64 = 255;
                  }

                  if (var64 > 0) {
                     byte var25 = 2;
                     int var65 = -var38 * 9;
                     String var42 = this.field_1733.get(var38).field_3029;
                     Class254.method_194(var25, var65 - 1, var25 + 320, var65 + 8, var64 / 2 << 24);
                     GL11.glEnable(3042);
                     var8.method_1444(var42, var25, var65, 16777215 + (var64 << 24));
                  }
               }
            }

            GL11.glPopMatrix();
            GL11.glEnable(3008);
            GL11.glDisable(3042);
         }
      }
   }

   private void method_688(float var1, int var2, int var3) {
      var1 = 1.0F - var1;
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.field_2137 = (float)(this.field_2137 + (var1 - this.field_2137) * 0.01);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(0, 769);
      GL11.glColor4f(this.field_2137, this.field_2137, this.field_2137, 1.0F);
      GL11.glBindTexture(3553, this.field_2506.field_2176.method_1545("/misc/vignette.png"));
      Class368 var4 = Class368.field_2696;
      var4.method_186();
      var4.method_318(0.0, var3, -90.0, 0.0, 1.0);
      var4.method_318(var2, var3, -90.0, 1.0, 1.0);
      var4.method_318(var2, 0.0, -90.0, 1.0, 0.0);
      var4.method_318(0.0, 0.0, -90.0, 0.0, 0.0);
      var4.method_406();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBlendFunc(770, 771);
   }

   private void method_826(int var1, int var2, int var3, float var4) {
      Class334 var5 = this.field_2506.field_2787.field_559.field_1518[var1];
      if (var5 != null) {
         float var6 = var5.field_2426 - var4;
         if (var6 > 0.0F) {
            GL11.glPushMatrix();
            float var7 = 1.0F + var6 / 5.0F;
            GL11.glTranslatef(var2 + 8, var3 + 12, 0.0F);
            GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef(-(var2 + 8), -(var3 + 12), 0.0F);
         }

         field_1292.method_1104(this.field_2506.field_1541, this.field_2506.field_2176, var5, var2, var3);
         if (var6 > 0.0F) {
            GL11.glPopMatrix();
         }

         field_1292.method_1758(this.field_2506.field_1541, this.field_2506.field_2176, var5, var2, var3);
      }
   }

   public void method_166() {
      if (this.field_1000 > 0) {
         this.field_1000--;
      }

      this.field_1664++;

      for (Class289 var2 : this.field_1733) {
         var2.field_3116++;
      }
   }

   public void method_967(String var1) {
      while (this.field_2506.field_1541.method_962(var1) > 320) {
         int var2 = 1;

         while (var2 < var1.length() && this.field_2506.field_1541.method_962(var1.substring(0, var2 + 1)) <= 320) {
            var2++;
         }

         this.method_967(var1.substring(0, var2));
         var1 = var1.substring(var2);
      }

      this.field_1733.add(0, new Class289(var1));

      while (this.field_1733.size() > 50) {
         this.field_1733.remove(this.field_1733.size() - 1);
      }
   }

   public void method_620(String var1) {
      this.field_239 = "Now playing: " + var1;
      this.field_1000 = 60;
   }

   public static String method_1211(Minecraft var0) {
      int var1 = (int)Math.floor(var0.field_2787.field_1417 / 16.0);
      int var2 = (int)Math.floor(var0.field_2787.field_2013 / 16.0);
      return Integer.toString(var1 & 63, 36)
         + "/"
         + Integer.toString(var2 & 63, 36)
         + "/c."
         + Integer.toString(var1, 36)
         + "."
         + Integer.toString(var2, 36)
         + ".dat";
   }
}
