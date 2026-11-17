package ext;

import java.util.ArrayList;
import java.util.Random;

public class Class108 {
   public static final int field_614 = 32767;
   public static final Class358 field_702 = new Class358("stone", 1.0F, 1.0F);
   public static final Class358 field_460 = new Class358("wood", 1.0F, 1.0F);
   public static final Class358 field_615 = new Class358("gravel", 1.0F, 1.0F);
   public static final Class358 field_98 = new Class358("grass", 1.0F, 1.0F);
   public static final Class358 field_1536 = new Class358("stone", 1.0F, 1.0F);
   public static final Class358 field_1882 = new Class358("stone", 1.0F, 1.5F);
   public static final Class358 field_1666 = new Class498("glass", 1.0F, 1.0F);
   public static final Class358 field_1989 = new Class358("cloth", 1.0F, 1.0F);
   public static final Class358 field_163 = new Class449("sand", 1.0F, 1.0F);
   public static final Class358 field_1023 = new Class358("elder", 1.0F, 1.0F);
   public static final Class358 field_53 = new Class358("special", 1.0F, 1.0F);
   public static final Class108[] field_1221 = new Class108[32767];
   public static final boolean[] field_1933 = new boolean[32767];
   public static final boolean[] field_710 = new boolean[32767];
   public static final boolean[] field_1953 = new boolean[32767];
   public static final int[] field_2371 = new int[32767];
   public static final boolean[] field_476 = new boolean[32767];
   public static final int[] field_2146 = new int[32767];
   public static final Class108 field_720 = new Class536(1, 1).method_1642(1.5F).method_990(10.0F).method_1398(field_1536).method_1161(2).method_1253("Stone");
   public static final Class607 field_1970 = (Class607)new Class607(2).method_1642(0.6F).method_1398(field_98).method_1253("Grass Block").method_1161(1);
   public static final Class108 field_1047 = new Class56(3, 2).method_1642(0.5F).method_1398(field_615).method_1161(1).method_1253("Dirt");
   public static final Class108 field_2201 = new Class108(4, 16, Class160.field_68)
      .method_1642(2.0F)
      .method_990(10.0F)
      .method_1398(field_1536)
      .method_1161(1)
      .method_1253("Cobblestone");
   public static final Class108 field_3148 = new Class108(5, 4, Class160.field_265)
      .method_1642(2.0F)
      .method_990(5.0F)
      .method_1398(field_460)
      .method_1161(2)
      .method_1253("Wooden Planks");
   public static final Class108 field_968 = new Class430(6, 15).method_1642(0.0F).method_1398(field_98).method_1253("Sapling").method_1161(4);
   public static final Class108 field_2945 = new Class108(7, 17, Class160.field_68)
      .method_1642(-1.0F)
      .method_990(6000000.0F)
      .method_1398(field_1023)
      .method_1253("Elderstone")
      .method_1161(1);
   public static final Class108 field_536 = new Class510(8, Class160.field_1413).method_1642(100.0F).method_336(3).method_1253("Water").method_1161(1);
   public static final Class108 field_2883 = new Class466(9, Class160.field_1413).method_1642(100.0F).method_336(3).method_1253("Water").method_1161(1);
   public static final Class108 field_1423 = new Class510(10, Class160.field_3120)
      .method_1642(0.0F)
      .method_110(1.0F)
      .method_336(255)
      .method_1253("Lava")
      .method_1161(1);
   public static final Class108 field_146 = new Class466(11, Class160.field_3120)
      .method_1642(100.0F)
      .method_110(1.0F)
      .method_336(255)
      .method_1253("Lava")
      .method_1161(1);
   public static final Class108 field_2692 = new Class646(12, 18).method_1642(0.5F).method_1398(field_163).method_1253("Sand").method_1161(1);
   public static final Class108 field_1741 = new Class73(13, 19).method_1642(0.6F).method_1398(field_615).method_1253("Gravel").method_1161(2);
   public static final Class108 field_1887 = new Class230(14, 32)
      .method_1642(3.0F)
      .method_990(5.0F)
      .method_1398(field_1536)
      .method_1161(32)
      .method_1253("Gold Ore");
   public static final Class108 field_508 = new Class230(15, 33)
      .method_1642(3.0F)
      .method_990(5.0F)
      .method_1398(field_1536)
      .method_1161(16)
      .method_1253("Iron Ore");
   public static final Class108 field_1028 = new Class230(16, 34)
      .method_1642(3.0F)
      .method_990(5.0F)
      .method_1398(field_1536)
      .method_1253("Coal Ore")
      .method_1161(8);
   public static final Class108 field_1348 = new Class555(17).method_1642(2.0F).method_1398(field_460).method_1161(4).method_1253("Wood");
   public static final Class574 field_1128 = (Class574)new Class574(18, 52)
      .method_1642(0.2F)
      .method_336(1)
      .method_1398(field_98)
      .method_1253("Leaves")
      .method_1161(1);
   public static final Class108 field_3052 = new Class342(19).method_1642(0.6F).method_1398(field_98).method_1253("Sponge").method_1161(1);
   public static final Class108 field_2741 = new Class708(20, 49, Class160.field_2086, false)
      .method_1642(0.3F)
      .method_1398(field_1666)
      .method_1161(4)
      .method_1253("Glass");
   public static final Class108 field_2019 = null;
   public static final Class108 field_2748 = null;
   public static final Class108 field_1364 = null;
   public static final Class108 field_1134 = null;
   public static final Class108 field_2356 = null;
   public static final Class108 field_3012 = null;
   public static final Class108 field_321 = null;
   public static final Class108 field_1408 = null;
   public static final Class108 field_1821 = null;
   public static final Class108 field_385 = null;
   public static final Class108 field_995 = null;
   public static final Class108 field_1467 = null;
   public static final Class108 field_203 = null;
   public static final Class108 field_3003 = null;
   public static final Class108 field_3014 = new Class108(35, 64, Class160.field_259)
      .method_1642(0.8F)
      .method_1398(field_1989)
      .method_1161(16)
      .method_1253("Cloth");
   public static final Class108 field_540 = null;
   public static final Class666 field_1371 = (Class666)new Class666(37, 13).method_1642(0.0F).method_1398(field_98).method_1253("Rose").method_1161(4);
   public static final Class666 field_1120 = (Class666)new Class666(38, 12).method_1642(0.0F).method_1398(field_98).method_1253("Dandelion").method_1161(4);
   public static final Class666 field_3124 = (Class666)new Class684(39, 29)
      .method_1642(0.0F)
      .method_1398(field_98)
      .method_110(0.125F)
      .method_1161(10)
      .method_1253("Mushroom");
   public static final Class666 field_2060 = (Class666)new Class684(40, 28).method_1642(0.0F).method_1398(field_98).method_1161(10).method_1253("Red Mushroom");
   public static final Class108 field_2554 = new Class629(41, 39)
      .method_1642(3.0F)
      .method_990(10.0F)
      .method_1398(field_1882)
      .method_1161(432)
      .method_1253("Gold Block");
   public static final Class108 field_2938 = new Class629(42, 38)
      .method_1642(5.0F)
      .method_990(10.0F)
      .method_1398(field_1882)
      .method_1161(180)
      .method_1253("Iron Block");
   public static final Class108 field_1262 = new Class235(43, 5, true)
      .method_1642(2.0F)
      .method_990(10.0F)
      .method_1398(field_1536)
      .method_1253("Stone Slab")
      .method_1161(4);
   public static final Class108 field_2252 = new Class235(44, 5, false)
      .method_1642(2.0F)
      .method_990(10.0F)
      .method_1398(field_1536)
      .method_1253("Stone Slab")
      .method_1161(8);
   public static final Class108 field_1294 = new Class108(45, 7, Class160.field_68)
      .method_1642(2.0F)
      .method_990(10.0F)
      .method_1398(field_1536)
      .method_1253("Bricks")
      .method_1161(16);
   public static final Class108 field_2872 = new Class480(46, 8).method_1642(0.0F).method_1398(field_98).method_1253("TNT").method_1161(20);
   public static final Class108 field_2204 = new Class297(47, 35).method_1642(1.5F).method_1398(field_460).method_1253("Cloth Panel").method_1161(8);
   public static final Class108 field_492 = new Class108(48, 36, Class160.field_68)
      .method_1642(2.0F)
      .method_990(10.0F)
      .method_1398(field_1536)
      .method_1253("Lichen Cobblestone")
      .method_1161(16);
   public static final Class108 field_3085 = new Class628(49, 37)
      .method_1642(10.0F)
      .method_990(2000.0F)
      .method_1398(field_1536)
      .method_1253("Obsidian")
      .method_1161(24);
   public static final Class108 field_149 = new Class680(50, 80)
      .method_1642(0.0F)
      .method_110(0.9375F)
      .method_1398(field_460)
      .method_1253("Torch")
      .method_1161(2);
   public static final Class364 field_1781 = (Class364)((Class364)new Class364(51, 349).method_1642(0.0F).method_110(1.0F).method_1398(field_460))
      .method_1253("Fire")
      .method_1161(2);
   public static final Class108 field_288 = new Class67(52, 65).method_1642(5.0F).method_1398(field_1882).method_1253("Mob Creator").method_1161(1);
   public static final Class108 field_1900 = new Class568(53, field_3148).method_1253("Wooden Stairs").method_1161(2);
   public static final Class108 field_93 = new Class409(54).method_1642(2.5F).method_1398(field_460).method_1253("Chest").method_1161(4);
   public static final Class108 field_2512 = new Class176(55, 84).method_1642(0.0F).method_1398(field_702).method_1253("Greenstone Wire").method_1161(1);
   public static final Class108 field_564 = new Class230(56, 50)
      .method_1642(3.0F)
      .method_990(5.0F)
      .method_1398(field_1536)
      .method_1253("Diamond Ore")
      .method_1161(28);
   public static final Class108 field_2971 = new Class629(57, 40)
      .method_1642(5.0F)
      .method_990(10.0F)
      .method_1398(field_1882)
      .method_1161(504)
      .method_1253("Diamond Block");
   public static final Class108 field_2497 = new Class740(58).method_1642(2.5F).method_1398(field_460).method_1253("Workbench").method_1161(8);
   public static final Class108 field_2231 = new Class586(59, 88).method_1642(0.0F).method_1398(field_98).method_1253("Crops").method_1161(8);
   public static final Class108 field_2496 = new Class228(60).method_1642(0.6F).method_1398(field_615).method_1253("Tilled Field").method_1161(9);
   public static final Class108 field_2604 = new Class292(61, false).method_1642(3.5F).method_1398(field_1536).method_1253("Furnace").method_1161(8);
   public static final Class108 field_847 = new Class292(62, true)
      .method_1642(3.5F)
      .method_1398(field_1536)
      .method_110(0.875F)
      .method_1253("Furnace")
      .method_1161(8);
   public static final Class108 field_1115 = new Class707(63, Class243.class, true).method_1642(1.0F).method_1398(field_460).method_1253("Sign").method_1161(1);
   public static final Class108 field_1403 = new Class604(64, Class160.field_265)
      .method_1642(3.0F)
      .method_1398(field_460)
      .method_1253("Wooden Door")
      .method_1161(4);
   public static final Class108 field_2568 = new Class234(65, 83).method_1642(0.4F).method_1398(field_460).method_1253("Ladder").method_1161(1);
   public static final Class108 field_1008 = new Class689(66, 128).method_1642(0.7F).method_1398(field_1882).method_1253("Rail").method_1161(11);
   public static final Class108 field_1771 = new Class568(67, field_2201).method_1253("Cobblestone Stairs").method_1161(12);
   public static final Class108 field_762 = new Class707(68, Class243.class, false).method_1642(1.0F).method_1398(field_460).method_1253("Sign").method_1161(1);
   public static final Class108 field_1131 = new Class497(69, 96).method_1642(0.5F).method_1398(field_460).method_1253("Lever").method_1161(11);
   public static final Class108 field_1964;
   public static final Class108 field_1979 = new Class604(71, Class160.field_1806)
      .method_1642(5.0F)
      .method_1398(field_1882)
      .method_1253("Iron Door")
      .method_1161(32);
   public static final Class108 field_2810;
   public static final Class108 field_36 = new Class200(73, 51, false)
      .method_1642(3.0F)
      .method_990(5.0F)
      .method_1398(field_1536)
      .method_1253("Greenstone Ore")
      .method_1161(12);
   public static final Class108 field_305 = new Class200(74, 51, true)
      .method_110(0.625F)
      .method_1642(3.0F)
      .method_990(5.0F)
      .method_1398(field_1536)
      .method_1253("Greenstone Ore")
      .method_1161(12);
   public static final Class108 field_2479 = new Class638(75, 115, false)
      .method_1642(0.0F)
      .method_1398(field_460)
      .method_1253("Greenstone Torch")
      .method_1161(8);
   public static final Class108 field_1026 = new Class638(76, 99, true)
      .method_1642(0.0F)
      .method_110(0.5F)
      .method_1398(field_460)
      .method_1253("Greenstone Torch")
      .method_1161(8);
   public static final Class108 field_774;
   public static final Class108 field_1070 = new Class556(78, 66).method_1642(0.1F).method_1398(field_1989).method_1253("Snow").method_1161(4);
   public static final Class108 field_2441 = new Class30(79, 67).method_1642(0.5F).method_336(3).method_1398(field_1666).method_1253("Ice").method_1161(4);
   public static final Class108 field_1674 = new Class743(80, 66).method_1642(0.2F).method_1398(field_1989).method_1253("Snow Block").method_1161(2);
   public static final Class108 field_316 = new Class609(81, 70).method_1642(0.4F).method_1398(field_1989).method_1253("Cactus").method_1161(1);
   public static final Class108 field_2132 = new Class464(82, 72).method_1642(0.6F).method_1398(field_615).method_1253("Clay Block").method_1161(8);
   public static final Class108 field_764 = new Class460(83, 73).method_1642(0.0F).method_1398(field_98).method_1253("Reed").method_1161(4);
   public static final Class108 field_691 = new Class525(84, 74)
      .method_1642(2.0F)
      .method_990(10.0F)
      .method_1398(field_1536)
      .method_1253("Jukebox")
      .method_1161(32);
   public static final Class108 field_1024 = new Class255(85, 4).method_1642(2.0F).method_990(5.0F).method_1398(field_460).method_1253("Fence").method_1161(1);
   public int field_2972;
   public final int field_2151;
   protected float field_2394;
   protected float field_2784;
   public double field_1757;
   public double field_2905;
   public double field_1459;
   public double field_1078;
   public double field_84;
   public double field_1426;
   public Class358 field_972;
   public float field_1031;
   public final Class160 field_1854;
   public float field_1966;
   public boolean field_2259 = false;
   public float field_38 = 0.0F;
   public boolean field_159 = false;
   public int field_1761 = 1;
   public String field_310 = "";
   public boolean field_487 = false;
   public boolean field_1553 = false;

   protected Class108(int var1, Class160 var2) {
      this.field_972 = field_702;
      this.field_1031 = 1.0F;
      this.field_1966 = 0.6F;
      if (field_1221[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + field_1221[var1] + " when adding " + this);
      }

      this.field_1854 = var2;
      field_1221[var1] = this;
      this.field_2151 = var1;
      this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      field_710[var1] = this.method_214();
      field_2371[var1] = this.method_214() ? 255 : 0;
      field_476[var1] = this.method_1620();
      field_1953[var1] = false;
   }

   public Class108(int var1, int var2, Class160 var3) {
      this(var1, var3);
      this.field_2972 = var2;
   }

   public Class108 method_1398(Class358 var1) {
      this.field_972 = var1;
      return this;
   }

   public Class108 method_336(int var1) {
      field_2371[this.field_2151] = var1;
      return this;
   }

   public Class108 method_110(float var1) {
      field_2146[this.field_2151] = (int)(15.0F * var1);
      return this;
   }

   public Class108 method_350(float var1) {
      this.field_2259 = true;
      this.field_38 = var1;
      return this;
   }

   public Class108 method_990(float var1) {
      this.field_2784 = var1 * 3.0F;
      return this;
   }

   public Class108 method_662(boolean var1) {
      this.field_159 = var1;
      return this;
   }

   public Class108 method_1161(int var1) {
      this.field_1761 = var1;
      return this;
   }

   private boolean method_1620() {
      return false;
   }

   public boolean method_636() {
      return true;
   }

   public int method_1900() {
      return 0;
   }

   public Class108 method_1642(float var1) {
      this.field_2394 = var1;
      if (this.field_2784 < var1 * 5.0F) {
         this.field_2784 = var1 * 5.0F;
      }

      return this;
   }

   protected void method_1646(boolean var1) {
      field_1933[this.field_2151] = var1;
   }

   public void method_1618(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_1757 = var1;
      this.field_2905 = var2;
      this.field_1459 = var3;
      this.field_1078 = var4;
      this.field_84 = var5;
      this.field_1426 = var6;
   }

   public float method_1320(Interface698 var1, int var2, int var3, int var4) {
      return this.field_2259 ? this.field_38 : var1.method_1394(var2, var3, var4);
   }

   public float method_876(Interface698 var1, int var2, int var3, int var4) {
      return var1.method_1154(var2, var3, var4);
   }

   public boolean method_991(Interface698 var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && this.field_2905 > 0.0
         ? true
         : (
            var5 == 1 && this.field_84 < 1.0
               ? true
               : (
                  var5 == 2 && this.field_1459 > 0.0
                     ? true
                     : (
                        var5 == 3 && this.field_1426 < 1.0
                           ? true
                           : (var5 == 4 && this.field_1757 > 0.0 ? true : (var5 == 5 && this.field_1078 < 1.0 ? true : !var1.method_768(var2, var3, var4)))
                     )
               )
         );
   }

   public int method_213(Interface698 var1, int var2, int var3, int var4, int var5) {
      return this.method_774(var5, var1.method_1110(var2, var3, var4));
   }

   public int method_1005(Interface698 var1, int var2, int var3, double var4, double var6, double var8) {
      return this.method_1735(var2);
   }

   public int method_774(int var1, int var2) {
      return this.method_1735(var1);
   }

   public int method_1735(int var1) {
      return this.field_2972;
   }

   public Class630 method_366(Class454 var1, int var2, int var3, int var4) {
      return Class630.method_969(
         var2 + this.field_1757, var3 + this.field_2905, var4 + this.field_1459, var2 + this.field_1078, var3 + this.field_84, var4 + this.field_1426
      );
   }

   public void method_1368(Class454 var1, int var2, int var3, int var4, Class630 var5, ArrayList<Class630> var6, Class359 var7) {
      Class630 var8 = this.method_720(var1, var2, var3, var4);
      if (var8 != null && var5.method_1328(var8)) {
         var6.add(var8);
      }
   }

   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return Class630.method_969(
         var2 + this.field_1757, var3 + this.field_2905, var4 + this.field_1459, var2 + this.field_1078, var3 + this.field_84, var4 + this.field_1426
      );
   }

   public boolean method_214() {
      return true;
   }

   public boolean method_1380(int var1, boolean var2) {
      return this.method_916();
   }

   public boolean method_916() {
      return true;
   }

   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
   }

   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
   }

   public void method_493(Class454 var1, int var2, int var3, int var4, int var5) {
   }

   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
   }

   public int method_1427() {
      return 10;
   }

   public void method_1937(Class454 var1, int var2, int var3, int var4) {
   }

   public void method_1736(Class454 var1, int var2, int var3, int var4) {
   }

   public int method_1257(Random var1) {
      return 1;
   }

   public int method_1901(int var1, Random var2) {
      return this.field_2151;
   }

   public float method_386(Class354 var1) {
      if (!(this.field_2394 < 0.0F)) {
         return !var1.method_1648(this) ? 1.0F / this.field_2394 / 100.0F : var1.method_240(this) / this.field_2394 / 30.0F;
      } else {
         return var1.field_559.method_93() == null
               || var1.field_559.method_93().method_801() != Class50.field_2078 && var1.field_559.method_93().method_801() != Class50.field_947
            ? 0.0F
            : var1.method_240(this) / 2.0F / 30.0F;
      }
   }

   public void method_625(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_944(var1, var2, var3, var4, var5, 1.0F);
   }

   public void method_944(Class454 var1, int var2, int var3, int var4, int var5, float var6) {
      if (!var1.field_2994) {
         int var7 = this.method_1257(var1.field_2150);

         for (int var8 = 0; var8 < var7; var8++) {
            if (var1.field_2150.nextFloat() <= var6) {
               int var9 = this.method_1901(var5, var1.field_2150);
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

   public float method_1443(Class359 var1) {
      return this.field_2784 / 5.0F;
   }

   public Class366 method_739(Class454 var1, int var2, int var3, int var4, Class214 var5, Class214 var6) {
      this.method_1433(var1, var2, var3, var4);
      var5 = var5.method_1750(-var2, -var3, -var4);
      var6 = var6.method_1750(-var2, -var3, -var4);
      Class214 var7 = var5.method_320(var6, this.field_1757);
      Class214 var8 = var5.method_320(var6, this.field_1078);
      Class214 var9 = var5.method_29(var6, this.field_2905);
      Class214 var10 = var5.method_29(var6, this.field_84);
      Class214 var11 = var5.method_965(var6, this.field_1459);
      Class214 var12 = var5.method_965(var6, this.field_1426);
      if (!this.method_1082(var7)) {
         var7 = null;
      }

      if (!this.method_1082(var8)) {
         var8 = null;
      }

      if (!this.method_538(var9)) {
         var9 = null;
      }

      if (!this.method_538(var10)) {
         var10 = null;
      }

      if (!this.method_694(var11)) {
         var11 = null;
      }

      if (!this.method_694(var12)) {
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

   private boolean method_1082(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_1911 >= this.field_2905 && var1.field_1911 <= this.field_84 && var1.field_3045 >= this.field_1459 && var1.field_3045 <= this.field_1426;
   }

   private boolean method_538(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_882 >= this.field_1757 && var1.field_882 <= this.field_1078 && var1.field_3045 >= this.field_1459 && var1.field_3045 <= this.field_1426;
   }

   private boolean method_694(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_882 >= this.field_1757 && var1.field_882 <= this.field_1078 && var1.field_1911 >= this.field_2905 && var1.field_1911 <= this.field_84;
   }

   public void method_298(Class454 var1, int var2, int var3, int var4) {
   }

   public int method_287() {
      return 0;
   }

   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4);
      return var5 == 0 || field_1221[var5].field_1854.method_743();
   }

   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      return false;
   }

   public void method_1507(Class454 var1, int var2, int var3, int var4, Class359 var5) {
   }

   public void method_1886(Class454 var1, int var2, int var3, int var4, int var5) {
   }

   public void method_424(Class454 var1, int var2, int var3, int var4, Class354 var5) {
   }

   public void method_1332(Class454 var1, int var2, int var3, int var4, Class359 var5, Class214 var6) {
   }

   public void method_1433(Interface698 var1, int var2, int var3, int var4) {
   }

   public int method_606(Interface698 var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean method_16(Interface698 var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean method_40() {
      return false;
   }

   public void method_1220(Class454 var1, int var2, int var3, int var4, Class359 var5) {
   }

   public boolean method_926(Class454 var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void method_1035() {
   }

   public void method_209(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_625(var1, var2, var3, var4, var5);
   }

   public boolean method_1674(Class454 var1, int var2, int var3, int var4) {
      return true;
   }

   public Class108 method_1319(boolean var1) {
      this.field_1553 = var1;
      return this;
   }

   public Class108 method_1253(String var1) {
      this.field_310 = var1;
      return this;
   }

   static {
      field_1964 = new Class704(70, field_720.field_2972, Enum631.field_1179)
         .method_1642(0.5F)
         .method_1398(field_1536)
         .method_1253("Stone Pressure Plate")
         .method_1161(11);
      field_2810 = new Class704(72, field_1348.field_2972, Enum631.field_1845)
         .method_1642(0.5F)
         .method_1398(field_460)
         .method_1253("Wooden Pressure Plate")
         .method_1161(1);
      field_774 = new Class375(77, field_720.field_2972).method_1642(0.5F).method_1398(field_1536).method_1253("Stone Button").method_1161(2);
      Class390.method_922();

      for (int var0 = 0; var0 < 32767; var0++) {
         if (field_1221[var0] != null) {
            Class755.field_2576[var0] = new Class55(var0 - 32767);
         }
      }
   }
}
