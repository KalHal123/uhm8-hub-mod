package ext;

import java.util.ArrayList;
import java.util.Random;

public class Class407 {
   public static final Class358 field_410 = new Class358("stone", 1.0F, 1.0F);
   public static final Class358 field_2511 = new Class358("wood", 1.0F, 1.0F);
   public static final Class358 field_1397 = new Class358("gravel", 1.0F, 1.0F);
   public static final Class358 field_1366 = new Class358("grass", 1.0F, 1.0F);
   public static final Class358 field_620 = new Class358("stone", 1.0F, 1.0F);
   public static final Class358 field_783 = new Class358("stone", 1.0F, 1.5F);
   public static final Class358 field_2275 = new Class498("stone", 1.0F, 1.0F);
   public static final Class358 field_378 = new Class358("cloth", 1.0F, 1.0F);
   public static final Class358 field_469 = new Class449("sand", 1.0F, 1.0F);
   public static final Class407[] field_495 = new Class407[256];
   public static final boolean[] field_2790 = new boolean[256];
   public static final boolean[] field_682 = new boolean[256];
   public static final boolean[] field_1731 = new boolean[256];
   public static final int[] field_2977 = new int[256];
   public static final boolean[] field_2357 = new boolean[256];
   public static final int[] field_3072 = new int[256];
   public static final Class407 field_1673 = new Class463(1, 1).method_10(1.5F).method_100(10.0F).method_1467(field_620);
   public static final Class734 field_1875 = (Class734)new Class734(2).method_10(0.6F).method_1467(field_1366);
   public static final Class407 field_2578 = new Class503(3, 2).method_10(0.5F).method_1467(field_1397);
   public static final Class407 field_2732 = new Class407(4, 16, Class160.field_68).method_10(2.0F).method_100(10.0F).method_1467(field_620);
   public static final Class407 field_3109 = new Class407(5, 4, Class160.field_265).method_10(2.0F).method_100(5.0F).method_1467(field_2511);
   public static final Class407 field_105 = new Class701(6, 15).method_10(0.0F).method_1467(field_1366);
   public static final Class407 field_2764 = new Class407(7, 17, Class160.field_68).method_10(-1.0F).method_100(6000000.0F).method_1467(field_620);
   public static final Class407 field_1450 = new Class344(8, Class160.field_1413).method_10(100.0F).method_1062(3);
   public static final Class407 field_2384 = new Class732(9, Class160.field_1413).method_10(100.0F).method_1062(3);
   public static final Class407 field_1415 = new Class344(10, Class160.field_3120).method_10(0.0F).method_1751(1.0F).method_1062(255);
   public static final Class407 field_933 = new Class732(11, Class160.field_3120).method_10(100.0F).method_1751(1.0F).method_1062(255);
   public static final Class407 field_2265 = new Class2(12, 18).method_10(0.5F).method_1467(field_469);
   public static final Class407 field_2129 = new Class501(13, 19).method_10(0.6F).method_1467(field_1397);
   public static final Class407 field_1009 = new Class702(14, 32).method_10(3.0F).method_100(5.0F).method_1467(field_620);
   public static final Class407 field_1977 = new Class702(15, 33).method_10(3.0F).method_100(5.0F).method_1467(field_620);
   public static final Class407 field_3128 = new Class702(16, 34).method_10(3.0F).method_100(5.0F).method_1467(field_620);
   public static final Class407 field_2159 = new Class524(17).method_10(2.0F).method_1467(field_2511);
   public static final Class248 field_664 = (Class248)new Class248(18, 52).method_10(0.2F).method_1062(1).method_1467(field_1366);
   public static final Class407 field_2451 = new Class94(19).method_10(0.6F).method_1467(field_1366);
   public static final Class407 field_1984 = new Class479(20, 49, Class160.field_2086, false).method_10(0.3F).method_1467(field_2275);
   public static final Class407 field_99 = null;
   public static final Class407 field_2640 = null;
   public static final Class407 field_1839 = null;
   public static final Class407 field_721 = null;
   public static final Class407 field_1670 = null;
   public static final Class407 field_1946 = null;
   public static final Class407 field_2531 = null;
   public static final Class407 field_1923 = null;
   public static final Class407 field_3026 = null;
   public static final Class407 field_2529 = null;
   public static final Class407 field_3155 = null;
   public static final Class407 field_799 = null;
   public static final Class407 field_1627 = null;
   public static final Class407 field_665 = null;
   public static final Class407 field_2858 = new Class407(35, 64, Class160.field_259).method_10(0.8F).method_1467(field_378);
   public static final Class407 field_484 = null;
   public static final Class615 field_1684 = (Class615)new Class615(37, 13).method_10(0.0F).method_1467(field_1366);
   public static final Class615 field_703 = (Class615)new Class615(38, 12).method_10(0.0F).method_1467(field_1366);
   public static final Class615 field_1138 = (Class615)new Class431(39, 29).method_10(0.0F).method_1467(field_1366).method_1751(0.125F);
   public static final Class615 field_2565 = (Class615)new Class431(40, 28).method_10(0.0F).method_1467(field_1366);
   public static final Class407 field_2341 = new Class275(41, 39).method_10(3.0F).method_100(10.0F).method_1467(field_783);
   public static final Class407 field_1929 = new Class275(42, 38).method_10(5.0F).method_100(10.0F).method_1467(field_783);
   public static final Class407 field_1060 = new Class35(43, true).method_10(2.0F).method_100(10.0F).method_1467(field_620);
   public static final Class407 field_1530 = new Class35(44, false).method_10(2.0F).method_100(10.0F).method_1467(field_620);
   public static final Class407 field_2449 = new Class407(45, 7, Class160.field_68).method_10(2.0F).method_100(10.0F).method_1467(field_620);
   public static final Class407 field_2400 = new Class249(46, 8).method_10(0.0F).method_1467(field_1366);
   public static final Class407 field_967 = new Class425(47, 35).method_10(1.5F).method_1467(field_2511);
   public static final Class407 field_1766 = new Class407(48, 36, Class160.field_68).method_10(2.0F).method_100(10.0F).method_1467(field_620);
   public static final Class407 field_803 = new Class190(49, 37).method_10(10.0F).method_100(2000.0F).method_1467(field_620);
   public static final Class407 field_2162 = new Class551(50, 80).method_10(0.0F).method_1751(0.9375F).method_1467(field_2511);
   public static final Class164 field_1151 = (Class164)new Class164(51, 31).method_10(0.0F).method_1751(1.0F).method_1467(field_2511);
   public static final Class407 field_202 = new Class224(52, 65).method_10(5.0F).method_1467(field_783);
   public static final Class407 field_3139 = new Class652(53, field_3109);
   public static final Class407 field_2667 = new Class672(54).method_10(2.5F).method_1467(field_2511);
   public static final Class407 field_2141 = new Class561(55, 84).method_10(0.0F).method_1467(field_410);
   public static final Class407 field_1531 = new Class702(56, 50).method_10(3.0F).method_100(5.0F).method_1467(field_620);
   public static final Class407 field_2323 = new Class275(57, 40).method_10(5.0F).method_100(10.0F).method_1467(field_783);
   public static final Class407 field_1133 = new Class656(58).method_10(2.5F).method_1467(field_2511);
   public static final Class407 field_246 = new Class231(59, 88).method_10(0.0F).method_1467(field_1366);
   public static final Class407 field_342 = new Class171(60).method_10(0.6F).method_1467(field_1397);
   public static final Class407 field_170 = new Class115(61, false).method_10(3.5F).method_1467(field_620);
   public static final Class407 field_2911 = new Class115(62, true).method_10(3.5F).method_1467(field_620).method_1751(0.875F);
   public static final Class407 field_752 = new Class97(63, Class243.class, true).method_10(1.0F).method_1467(field_2511);
   public static final Class407 field_2343 = new Class483(64, Class160.field_265).method_10(3.0F).method_1467(field_2511);
   public static final Class407 field_828 = new Class259(65, 83).method_10(0.4F).method_1467(field_2511);
   public static final Class407 field_2116 = new Class229(66, 128).method_10(0.7F).method_1467(field_783);
   public static final Class407 field_2909 = new Class652(67, field_2732);
   public static final Class407 field_516 = new Class97(68, Class243.class, false).method_10(1.0F).method_1467(field_2511);
   public static final Class407 field_398 = new Class624(69, 96).method_10(0.5F).method_1467(field_2511);
   public static final Class407 field_634;
   public static final Class407 field_319 = new Class483(71, Class160.field_1806).method_10(5.0F).method_1467(field_783);
   public static final Class407 field_289;
   public static final Class407 field_2144 = new Class372(73, 51, false).method_10(3.0F).method_100(5.0F).method_1467(field_620);
   public static final Class407 field_2178 = new Class372(74, 51, true).method_1751(0.625F).method_10(3.0F).method_100(5.0F).method_1467(field_620);
   public static final Class407 field_2232 = new Class116(75, 115, false).method_10(0.0F).method_1467(field_2511);
   public static final Class407 field_157 = new Class116(76, 99, true).method_10(0.0F).method_1751(0.5F).method_1467(field_2511);
   public static final Class407 field_981;
   public static final Class407 field_2799 = new Class120(78, 66).method_10(0.1F).method_1467(field_378);
   public static final Class407 field_761 = new Class29(79, 67).method_10(0.5F).method_1062(3).method_1467(field_2275);
   public static final Class407 field_1657 = new Class352(80, 66).method_10(0.2F).method_1467(field_378);
   public static final Class407 field_237 = new Class363(81, 70).method_10(0.4F).method_1467(field_378);
   public static final Class407 field_2933 = new Class42(82, 72).method_10(0.6F).method_1467(field_1397);
   public static final Class407 field_138 = new Class95(83, 73).method_10(0.0F).method_1467(field_1366);
   public static final Class407 field_2949 = new Class512(84, 74).method_10(2.0F).method_100(10.0F).method_1467(field_620);
   public static final Class407 field_337 = new Class729(85, 4).method_10(2.0F).method_100(5.0F).method_1467(field_2511);
   public int field_2119;
   public final int field_19;
   protected float field_1549;
   protected float field_819;
   public double field_840;
   public double field_547;
   public double field_2897;
   public double field_3038;
   public double field_260;
   public double field_1568;
   public Class358 field_1496 = field_410;
   public float field_432 = 1.0F;
   public final Class160 field_1201;
   public float field_3047 = 0.6F;

   protected Class407(int var1, Class160 var2) {
      if (field_495[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + field_495[var1] + " when adding " + this);
      }

      this.field_1201 = var2;
      field_495[var1] = this;
      this.field_19 = var1;
      this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      field_682[var1] = this.method_143();
      field_2977[var1] = this.method_143() ? 255 : 0;
      field_2357[var1] = this.method_1484();
      field_1731[var1] = false;
   }

   protected Class407(int var1, int var2, Class160 var3) {
      this(var1, var3);
      this.field_2119 = var2;
   }

   protected Class407 method_1467(Class358 var1) {
      this.field_1496 = var1;
      return this;
   }

   protected Class407 method_1062(int var1) {
      field_2977[this.field_19] = var1;
      return this;
   }

   protected Class407 method_1751(float var1) {
      field_3072[this.field_19] = (int)(15.0F * var1);
      return this;
   }

   protected Class407 method_100(float var1) {
      this.field_819 = var1 * 3.0F;
      return this;
   }

   private boolean method_1484() {
      return false;
   }

   public boolean method_607() {
      return true;
   }

   public int method_178() {
      return 0;
   }

   protected Class407 method_10(float var1) {
      this.field_1549 = var1;
      if (this.field_819 < var1 * 5.0F) {
         this.field_819 = var1 * 5.0F;
      }

      return this;
   }

   protected void method_1936(boolean var1) {
      field_2790[this.field_19] = var1;
   }

   public void method_1930(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_840 = var1;
      this.field_547 = var2;
      this.field_2897 = var3;
      this.field_3038 = var4;
      this.field_260 = var5;
      this.field_1568 = var6;
   }

   public float method_736(Interface698 var1, int var2, int var3, int var4) {
      return var1.method_1154(var2, var3, var4);
   }

   public boolean method_1794(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0 && this.field_547 > 0.0) {
         return true;
      } else if (var5 == 1 && this.field_260 < 1.0) {
         return true;
      } else if (var5 == 2 && this.field_2897 > 0.0) {
         return true;
      } else if (var5 == 3 && this.field_1568 < 1.0) {
         return true;
      } else if (var5 == 4 && this.field_840 > 0.0) {
         return true;
      } else {
         return var5 == 5 && this.field_3038 < 1.0 ? true : !var1.method_768(var2, var3, var4);
      }
   }

   public int method_1278(Interface698 var1, int var2, int var3, int var4, int var5) {
      return this.method_1411(var5, var1.method_1110(var2, var3, var4));
   }

   public int method_1411(int var1, int var2) {
      return this.method_519(var1);
   }

   public int method_519(int var1) {
      return this.field_2119;
   }

   public Class630 method_1331(Class454 var1, int var2, int var3, int var4) {
      return Class630.method_969(
         var2 + this.field_840, var3 + this.field_547, var4 + this.field_2897, var2 + this.field_3038, var3 + this.field_260, var4 + this.field_1568
      );
   }

   public void method_1689(Class454 var1, int var2, int var3, int var4, Class630 var5, ArrayList var6) {
      Class630 var7 = this.method_1250(var1, var2, var3, var4);
      if (var7 != null && var5.method_1328(var7)) {
         var6.add(var7);
      }
   }

   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return Class630.method_969(
         var2 + this.field_840, var3 + this.field_547, var4 + this.field_2897, var2 + this.field_3038, var3 + this.field_260, var4 + this.field_1568
      );
   }

   public boolean method_143() {
      return true;
   }

   public boolean method_646(int var1, boolean var2) {
      return this.method_469();
   }

   public boolean method_469() {
      return true;
   }

   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
   }

   public void method_453(Class454 var1, int var2, int var3, int var4, Random var5) {
   }

   public void method_1000(Class454 var1, int var2, int var3, int var4, int var5) {
   }

   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
   }

   public int method_1520() {
      return 10;
   }

   public void method_1592(Class454 var1, int var2, int var3, int var4) {
   }

   public void method_1617(Class454 var1, int var2, int var3, int var4) {
   }

   public int method_806(Random var1) {
      return 1;
   }

   public int method_1651(int var1, Random var2) {
      return this.field_19;
   }

   public float method_1684(Class354 var1) {
      if (this.field_1549 < 0.0F) {
         return 0.0F;
      } else {
         return !var1.b(this) ? 1.0F / this.field_1549 / 100.0F : var1.a(this) / this.field_1549 / 30.0F;
      }
   }

   public void method_1227(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_997(var1, var2, var3, var4, var5, 1.0F);
   }

   public void method_997(Class454 var1, int var2, int var3, int var4, int var5, float var6) {
      if (!var1.field_2994) {
         int var7 = this.method_806(var1.field_2150);

         for (int var8 = 0; var8 < var7; var8++) {
            if (!(var1.field_2150.nextFloat() > var6)) {
               int var9 = this.method_1651(var5, var1.field_2150);
               if (var9 > 0) {
                  float var10 = 0.7F;
                  double var11 = var1.field_2150.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  double var13 = var1.field_2150.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  double var15 = var1.field_2150.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  Class198 var17 = new Class198(var1, var2 + var11, var3 + var13, var4 + var15, new Class334(var9));
                  var17.field_2283 = 10;
                  var1.method_1447(var17);
               }
            }
         }
      }
   }

   public float method_1228(Class359 var1) {
      return this.field_819 / 5.0F;
   }

   public Class366 method_489(Class454 var1, int var2, int var3, int var4, Class214 var5, Class214 var6) {
      this.method_547(var1, var2, var3, var4);
      var5 = var5.method_1750(-var2, -var3, -var4);
      var6 = var6.method_1750(-var2, -var3, -var4);
      Class214 var7 = var5.method_320(var6, this.field_840);
      Class214 var8 = var5.method_320(var6, this.field_3038);
      Class214 var9 = var5.method_29(var6, this.field_547);
      Class214 var10 = var5.method_29(var6, this.field_260);
      Class214 var11 = var5.method_965(var6, this.field_2897);
      Class214 var12 = var5.method_965(var6, this.field_1568);
      if (!this.method_1527(var7)) {
         var7 = null;
      }

      if (!this.method_1527(var8)) {
         var8 = null;
      }

      if (!this.method_1915(var9)) {
         var9 = null;
      }

      if (!this.method_1915(var10)) {
         var10 = null;
      }

      if (!this.method_955(var11)) {
         var11 = null;
      }

      if (!this.method_955(var12)) {
         var12 = null;
      }

      Class214 var13 = null;
      if (var7 != null && (var13 == null || var5.method_562(var7) < var5.method_562(var13))) {
         var13 = var7;
      }

      if (var8 != null && (var13 == null || var5.method_562(var8) < var5.method_562(var13))) {
         var13 = var8;
      }

      if (var9 != null && (var13 == null || var5.method_562(var9) < var5.method_562(var13))) {
         var13 = var9;
      }

      if (var10 != null && (var13 == null || var5.method_562(var10) < var5.method_562(var13))) {
         var13 = var10;
      }

      if (var11 != null && (var13 == null || var5.method_562(var11) < var5.method_562(var13))) {
         var13 = var11;
      }

      if (var12 != null && (var13 == null || var5.method_562(var12) < var5.method_562(var13))) {
         var13 = var12;
      }

      if (var13 == null) {
         return null;
      }

      byte var14 = -1;
      if (var13 == var7) {
         var14 = 4;
      }

      if (var13 == var8) {
         var14 = 5;
      }

      if (var13 == var9) {
         var14 = 0;
      }

      if (var13 == var10) {
         var14 = 1;
      }

      if (var13 == var11) {
         var14 = 2;
      }

      if (var13 == var12) {
         var14 = 3;
      }

      return new Class366(var2, var3, var4, var14, var13.method_1750(var2, var3, var4));
   }

   private boolean method_1527(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_1911 >= this.field_547 && var1.field_1911 <= this.field_260 && var1.field_3045 >= this.field_2897 && var1.field_3045 <= this.field_1568;
   }

   private boolean method_1915(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_882 >= this.field_840 && var1.field_882 <= this.field_3038 && var1.field_3045 >= this.field_2897 && var1.field_3045 <= this.field_1568;
   }

   private boolean method_955(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_882 >= this.field_840 && var1.field_882 <= this.field_3038 && var1.field_1911 >= this.field_547 && var1.field_1911 <= this.field_260;
   }

   public void method_38(Class454 var1, int var2, int var3, int var4) {
   }

   public int method_691() {
      return 0;
   }

   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4);
      return var5 == 0 || field_495[var5].field_1201.method_743();
   }

   public boolean method_676(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      return false;
   }

   public void method_1677(Class454 var1, int var2, int var3, int var4, Class359 var5) {
   }

   public void method_198(Class454 var1, int var2, int var3, int var4, int var5) {
   }

   public void method_1202(Class454 var1, int var2, int var3, int var4, Class354 var5) {
   }

   public void method_105(Class454 var1, int var2, int var3, int var4, Class359 var5, Class214 var6) {
   }

   public void method_547(Interface698 var1, int var2, int var3, int var4) {
   }

   public int method_1774(Interface698 var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean method_866(Interface698 var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean method_3() {
      return false;
   }

   public void method_667(Class454 var1, int var2, int var3, int var4, Class359 var5) {
   }

   public boolean method_1031(Class454 var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void method_1695() {
   }

   public void method_1548(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_1227(var1, var2, var3, var4, var5);
   }

   public boolean method_853(Class454 var1, int var2, int var3, int var4) {
      return true;
   }

   static {
      field_634 = new Class86(70, field_1673.field_2119, Enum631.field_1179).method_10(0.5F).method_1467(field_620);
      field_289 = new Class86(72, field_3109.field_2119, Enum631.field_1845).method_10(0.5F).method_1467(field_2511);
      field_981 = new Class60(77, field_1673.field_2119).method_10(0.5F).method_1467(field_620);

      for (int var0 = 0; var0 < 256; var0++) {
         if (field_495[var0] != null) {
            Class755.field_2576[var0] = new Class55(var0 - 256);
         }
      }
   }
}
