package srv;

import java.util.ArrayList;
import java.util.Random;

public class Class371 {
   public static final int field_36 = 32767;
   public static final Class90 field_851 = new Class90("stone", 1.0F, 1.0F);
   public static final Class90 field_966 = new Class90("wood", 1.0F, 1.0F);
   public static final Class90 field_739 = new Class90("gravel", 1.0F, 1.0F);
   public static final Class90 field_1127 = new Class90("grass", 1.0F, 1.0F);
   public static final Class90 field_211 = new Class90("stone", 1.0F, 1.0F);
   public static final Class90 field_542 = new Class90("stone", 1.0F, 1.5F);
   public static final Class90 field_664 = new Class379("stone", 1.0F, 1.0F);
   public static final Class90 field_1413 = new Class90("cloth", 1.0F, 1.0F);
   public static final Class90 field_437 = new Class48("sand", 1.0F, 1.0F);
   public static final Class371[] field_57 = new Class371[32767];
   public static final boolean[] field_1421 = new boolean[32767];
   public static final boolean[] field_380 = new boolean[32767];
   public static final boolean[] field_1478 = new boolean[32767];
   public static final int[] field_1484 = new int[32767];
   public static final boolean[] field_270 = new boolean[32767];
   public static final int[] field_1015 = new int[32767];
   public static final Class371 field_1294 = new Class98(1, 1).method_747(1.5F).method_742(10.0F).method_951(field_211);
   public static final Class266 field_1206 = (Class266)new Class266(2).method_747(0.6F).method_951(field_1127);
   public static final Class371 field_1082 = new Class378(3, 2).method_747(0.5F).method_951(field_739);
   public static final Class371 field_319 = new Class371(4, 16, Class111.field_1043).method_747(2.0F).method_742(10.0F).method_951(field_211);
   public static final Class371 field_1031 = new Class371(5, 4, Class111.field_1200).method_747(2.0F).method_742(5.0F).method_951(field_966);
   public static final Class371 field_330 = new Class113(6, 15).method_747(0.0F).method_951(field_1127);
   public static final Class371 field_536 = new Class371(7, 17, Class111.field_1043).method_747(-1.0F).method_742(6000000.0F).method_951(field_211);
   public static final Class371 field_1051 = new Class366(8, Class111.field_1394).method_747(100.0F).method_1030(3);
   public static final Class371 field_535 = new Class291(9, Class111.field_1394).method_747(100.0F).method_1030(3);
   public static final Class371 field_1103 = new Class366(10, Class111.field_306).method_747(0.0F).method_14(1.0F).method_1030(255);
   public static final Class371 field_955 = new Class291(11, Class111.field_306).method_747(100.0F).method_14(1.0F).method_1030(255);
   public static final Class371 field_378 = new Class237(12, 18).method_747(0.5F).method_951(field_437);
   public static final Class371 field_636 = new Class114(13, 19).method_747(0.6F).method_951(field_739);
   public static final Class371 field_386 = new Class279(14, 32).method_747(3.0F).method_742(5.0F).method_951(field_211);
   public static final Class371 field_1069 = new Class279(15, 33).method_747(3.0F).method_742(5.0F).method_951(field_211);
   public static final Class371 field_1296 = new Class279(16, 34).method_747(3.0F).method_742(5.0F).method_951(field_211);
   public static final Class371 field_158 = new Class37(17).method_747(2.0F).method_951(field_966);
   public static final Class278 field_831 = (Class278)new Class278(18, 52).method_747(0.2F).method_1030(1).method_951(field_1127);
   public static final Class371 field_1529 = new Class331(19).method_747(0.6F).method_951(field_1127);
   public static final Class371 field_605 = new Class21(20, 49, Class111.field_1019, false).method_747(0.3F).method_951(field_664);
   public static final Class371 field_293 = null;
   public static final Class371 field_151 = null;
   public static final Class371 field_716 = null;
   public static final Class371 field_466 = null;
   public static final Class371 field_15 = null;
   public static final Class371 field_1088 = null;
   public static final Class371 field_1176 = null;
   public static final Class371 field_1485 = null;
   public static final Class371 field_530 = null;
   public static final Class371 field_1586 = null;
   public static final Class371 field_558 = null;
   public static final Class371 field_978 = null;
   public static final Class371 field_643 = null;
   public static final Class371 field_688 = null;
   public static final Class371 field_1113 = new Class371(35, 64, Class111.field_505).method_747(0.8F).method_951(field_1413);
   public static final Class371 field_706 = null;
   public static final Class342 field_86 = (Class342)new Class342(37, 13).method_747(0.0F).method_951(field_1127);
   public static final Class342 field_527 = (Class342)new Class342(38, 12).method_747(0.0F).method_951(field_1127);
   public static final Class342 field_292 = (Class342)new Class42(39, 29).method_747(0.0F).method_951(field_1127).method_14(0.125F);
   public static final Class342 field_49 = (Class342)new Class42(40, 28).method_747(0.0F).method_951(field_1127);
   public static final Class371 field_111 = new Class231(41, 39).method_747(3.0F).method_742(10.0F).method_951(field_542);
   public static final Class371 field_1111 = new Class231(42, 38).method_747(5.0F).method_742(10.0F).method_951(field_542);
   public static final Class371 field_264 = new Class372(43, 0, true).method_747(2.0F).method_742(10.0F).method_951(field_211);
   public static final Class371 field_265 = new Class372(44, 0, false).method_747(2.0F).method_742(10.0F).method_951(field_211);
   public static final Class371 field_741 = new Class371(45, 7, Class111.field_1043).method_747(2.0F).method_742(10.0F).method_951(field_211);
   public static final Class371 field_1589 = new Class276(46, 8).method_747(0.0F).method_951(field_1127);
   public static final Class371 field_135 = new Class328(47, 35).method_747(1.5F).method_951(field_966);
   public static final Class371 field_1198 = new Class371(48, 36, Class111.field_1043).method_747(2.0F).method_742(10.0F).method_951(field_211);
   public static final Class371 field_274 = new Class72(49, 37).method_747(10.0F).method_742(2000.0F).method_951(field_211);
   public static final Class371 field_1211 = new Class23(50, 80).method_747(0.0F).method_14(0.9375F).method_951(field_966);
   public static final Class262 field_1424 = (Class262)new Class262(51, 31).method_747(0.0F).method_14(1.0F).method_951(field_966);
   public static final Class371 field_219 = new Class67(52, 65).method_747(5.0F).method_951(field_542);
   public static final Class371 field_1258 = new Class69(53, field_1031);
   public static final Class371 field_649 = new Class46(54).method_747(2.5F).method_951(field_966);
   public static final Class371 field_521 = new Class314(55, 84).method_747(0.0F).method_951(field_851);
   public static final Class371 field_666 = new Class279(56, 50).method_747(3.0F).method_742(5.0F).method_951(field_211);
   public static final Class371 field_1514 = new Class231(57, 40).method_747(5.0F).method_742(10.0F).method_951(field_542);
   public static final Class371 field_52 = new Class125(58).method_747(2.5F).method_951(field_966);
   public static final Class371 field_1510 = new Class45(59, 88).method_747(0.0F).method_951(field_1127);
   public static final Class371 field_1254 = new Class255(60).method_747(0.6F).method_951(field_739);
   public static final Class371 field_423 = new Class254(61, false).method_747(3.5F).method_951(field_211);
   public static final Class371 field_53 = new Class254(62, true).method_747(3.5F).method_951(field_211).method_14(0.875F);
   public static final Class371 field_1456 = new Class91(63, Class272.class, true).method_747(1.0F).method_951(field_966);
   public static final Class371 field_9 = new Class384(64, Class111.field_1200).method_747(3.0F).method_951(field_966);
   public static final Class371 field_83 = new Class206(65, 83).method_747(0.4F).method_951(field_966);
   public static final Class371 field_1235 = new Class9(66, 128).method_747(0.7F).method_951(field_542);
   public static final Class371 field_771 = new Class69(67, field_319);
   public static final Class371 field_1140 = new Class91(68, Class272.class, false).method_747(1.0F).method_951(field_966);
   public static final Class371 field_495 = new Class274(69, 96).method_747(0.5F).method_951(field_966);
   public static final Class371 field_1399;
   public static final Class371 field_654 = new Class384(71, Class111.field_279).method_747(5.0F).method_951(field_542);
   public static final Class371 field_724;
   public static final Class371 field_161 = new Class248(73, 51, false).method_747(3.0F).method_742(5.0F).method_951(field_211);
   public static final Class371 field_798 = new Class248(74, 51, true).method_14(0.625F).method_747(3.0F).method_742(5.0F).method_951(field_211);
   public static final Class371 field_37 = new Class280(75, 115, false).method_747(0.0F).method_951(field_966);
   public static final Class371 field_332 = new Class280(76, 99, true).method_747(0.0F).method_14(0.5F).method_951(field_966);
   public static final Class371 field_1202;
   public static final Class371 field_1595 = new Class57(78, 66).method_747(0.1F).method_951(field_1413);
   public static final Class371 field_811 = new Class122(79, 67).method_747(0.5F).method_1030(3).method_951(field_664);
   public static final Class371 field_1325 = new Class130(80, 66).method_747(0.2F).method_951(field_1413);
   public static final Class371 field_314 = new Class297(81, 70).method_747(0.4F).method_951(field_1413);
   public static final Class371 field_1183 = new Class58(82, 72).method_747(0.6F).method_951(field_739);
   public static final Class371 field_963 = new Class359(83, 73).method_747(0.0F).method_951(field_1127);
   public static final Class371 field_484 = new Class132(84, 74).method_747(2.0F).method_742(10.0F).method_951(field_211);
   public static final Class371 field_1295 = new Class319(85, 4).method_747(2.0F).method_742(5.0F).method_951(field_966);
   public static Class90 field_1360;
   public static Class90 field_1007;
   public int field_1137;
   public final int field_1379;
   protected float field_1585;
   protected float field_327;
   public double field_1182;
   public double field_364;
   public double field_39;
   public double field_926;
   public double field_1228;
   public double field_576;
   public Class90 field_1154;
   public float field_1345;
   public final Class111 field_658;
   public float field_329;
   public boolean field_142 = false;
   public int field_230 = 1;

   protected Class371(int var1, Class111 var2) {
      this.field_1154 = field_851;
      this.field_1345 = 1.0F;
      this.field_329 = 0.6F;
      if (field_57[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + field_57[var1] + " when adding " + this);
      }

      this.field_658 = var2;
      field_57[var1] = this;
      this.field_1379 = var1;
      this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      field_380[var1] = this.method_491();
      field_1484[var1] = this.method_491() ? 255 : 0;
      field_270[var1] = this.method_309();
      field_1478[var1] = false;
   }

   public Class371(int var1, int var2, Class111 var3) {
      this(var1, var3);
      this.field_1137 = var2;
   }

   public Class371 method_951(Class90 var1) {
      this.field_1154 = var1;
      return this;
   }

   public Class371 method_1030(int var1) {
      field_1484[this.field_1379] = var1;
      return this;
   }

   public Class371 method_14(float var1) {
      field_1015[this.field_1379] = (int)(15.0F * var1);
      return this;
   }

   public Class371 method_742(float var1) {
      this.field_327 = var1 * 3.0F;
      return this;
   }

   public int method_897(Interface351 var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   public Class371 method_106(boolean var1) {
      this.field_142 = var1;
      return this;
   }

   public Class371 method_848(int var1) {
      this.field_230 = var1;
      return this;
   }

   private boolean method_309() {
      return false;
   }

   public boolean method_786() {
      return true;
   }

   public int method_225() {
      return 0;
   }

   public Class371 method_747(float var1) {
      this.field_1585 = var1;
      if (this.field_327 < var1 * 5.0F) {
         this.field_327 = var1 * 5.0F;
      }

      return this;
   }

   protected void method_194(boolean var1) {
      field_1421[this.field_1379] = var1;
   }

   public void method_177(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_1182 = var1;
      this.field_364 = var2;
      this.field_39 = var3;
      this.field_926 = var4;
      this.field_1228 = var5;
      this.field_576 = var6;
   }

   public boolean method_212(Interface351 var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && this.field_364 > 0.0
         ? true
         : (
            var5 == 1 && this.field_1228 < 1.0
               ? true
               : (
                  var5 == 2 && this.field_39 > 0.0
                     ? true
                     : (
                        var5 == 3 && this.field_576 < 1.0
                           ? true
                           : (var5 == 4 && this.field_1182 > 0.0 ? true : (var5 == 5 && this.field_926 < 1.0 ? true : !var1.method_604(var2, var3, var4)))
                     )
               )
         );
   }

   public int method_310(int var1) {
      return this.field_1137;
   }

   public Class94 method_930(Class317 var1, int var2, int var3, int var4) {
      return Class94.method_27(
         var2 + this.field_1182, var3 + this.field_364, var4 + this.field_39, var2 + this.field_926, var3 + this.field_1228, var4 + this.field_576
      );
   }

   public void method_840(Class317 var1, int var2, int var3, int var4, Class94 var5, ArrayList var6) {
      Class94 var7 = this.method_872(var1, var2, var3, var4);
      if (var7 != null && var5.method_75(var7)) {
         var6.add(var7);
      }
   }

   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return Class94.method_27(
         var2 + this.field_1182, var3 + this.field_364, var4 + this.field_39, var2 + this.field_926, var3 + this.field_1228, var4 + this.field_576
      );
   }

   public boolean method_491() {
      return true;
   }

   public boolean method_573(int var1, boolean var2) {
      return this.method_138();
   }

   public boolean method_138() {
      return true;
   }

   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
   }

   public void method_496(Class317 var1, int var2, int var3, int var4, Random var5) {
   }

   public void method_43(Class317 var1, int var2, int var3, int var4, int var5) {
   }

   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
   }

   public int method_796() {
      return 10;
   }

   public void method_1013(Class317 var1, int var2, int var3, int var4) {
   }

   public void method_650(Class317 var1, int var2, int var3, int var4) {
   }

   public int method_757(Random var1) {
      return 1;
   }

   public int method_852(int var1, Random var2) {
      return this.field_1379;
   }

   public float method_826(Class41 var1) {
      if (!(this.field_1585 < 0.0F)) {
         return !var1.method_11(this) ? 1.0F / this.field_1585 / 100.0F : var1.method_128(this) / this.field_1585 / 30.0F;
      } else {
         return var1.field_783.method_40() == null
               || var1.field_783.method_40().method_458() != Class13.field_684 && var1.field_783.method_40().method_458() != Class13.field_1428
            ? 0.0F
            : var1.method_128(this) / 2.0F / 30.0F;
      }
   }

   public void method_363(Class317 var1, int var2, int var3, int var4, int var5) {
      this.method_838(var1, var2, var3, var4, var5, 1.0F);
   }

   public void method_838(Class317 var1, int var2, int var3, int var4, int var5, float var6) {
      if (!var1.field_906) {
         int var7 = this.method_757(var1.field_413);

         for (int var8 = 0; var8 < var7; var8++) {
            if (var1.field_413.nextFloat() <= var6) {
               int var9 = this.method_852(var5, var1.field_413);
               if (var9 > 0) {
                  float var10 = 0.7F;
                  double var11 = var1.field_413.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  double var13 = var1.field_413.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  double var15 = var1.field_413.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  Class39 var17 = new Class39(var1, var2 + var11, var3 + var13, var4 + var15, new Class150(var9));
                  var17.field_1105 = 10;
                  var1.method_237(var17);
               }
            }
         }
      }
   }

   public float method_399(Class252 var1) {
      return this.field_327 / 5.0F;
   }

   public Class3 method_393(Class317 var1, int var2, int var3, int var4, Class47 var5, Class47 var6) {
      this.method_15(var1, var2, var3, var4);
      var5 = var5.method_203(-var2, -var3, -var4);
      var6 = var6.method_203(-var2, -var3, -var4);
      Class47 var7 = var5.method_693(var6, this.field_1182);
      Class47 var8 = var5.method_693(var6, this.field_926);
      Class47 var9 = var5.method_697(var6, this.field_364);
      Class47 var10 = var5.method_697(var6, this.field_1228);
      Class47 var11 = var5.method_992(var6, this.field_39);
      Class47 var12 = var5.method_992(var6, this.field_576);
      if (!this.method_157(var7)) {
         var7 = null;
      }

      if (!this.method_157(var8)) {
         var8 = null;
      }

      if (!this.method_415(var9)) {
         var9 = null;
      }

      if (!this.method_415(var10)) {
         var10 = null;
      }

      if (!this.method_868(var11)) {
         var11 = null;
      }

      if (!this.method_868(var12)) {
         var12 = null;
      }

      Class47 var13 = null;
      if (var7 != null && (var13 == null || var5.method_797(var7) < var5.method_797(var13))) {
         var13 = var7;
      }

      if (var8 != null && (var13 == null || var5.method_797(var8) < var5.method_797(var13))) {
         var13 = var8;
      }

      if (var9 != null && (var13 == null || var5.method_797(var9) < var5.method_797(var13))) {
         var13 = var9;
      }

      if (var10 != null && (var13 == null || var5.method_797(var10) < var5.method_797(var13))) {
         var13 = var10;
      }

      if (var11 != null && (var13 == null || var5.method_797(var11) < var5.method_797(var13))) {
         var13 = var11;
      }

      if (var12 != null && (var13 == null || var5.method_797(var12) < var5.method_797(var13))) {
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

      return new Class3(var2, var3, var4, var14, var13.method_203(var2, var3, var4));
   }

   private boolean method_157(Class47 var1) {
      return var1 == null
         ? false
         : var1.field_173 >= this.field_364 && var1.field_173 <= this.field_1228 && var1.field_510 >= this.field_39 && var1.field_510 <= this.field_576;
   }

   private boolean method_415(Class47 var1) {
      return var1 == null
         ? false
         : var1.field_13 >= this.field_1182 && var1.field_13 <= this.field_926 && var1.field_510 >= this.field_39 && var1.field_510 <= this.field_576;
   }

   private boolean method_868(Class47 var1) {
      return var1 == null
         ? false
         : var1.field_13 >= this.field_1182 && var1.field_13 <= this.field_926 && var1.field_173 >= this.field_364 && var1.field_173 <= this.field_1228;
   }

   public void method_480(Class317 var1, int var2, int var3, int var4) {
   }

   public int method_396() {
      return 0;
   }

   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3, var4);
      return var5 == 0 || field_57[var5].field_658.method_210();
   }

   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      return false;
   }

   public void method_220(Class317 var1, int var2, int var3, int var4, Class252 var5) {
   }

   public void method_202(Class317 var1, int var2, int var3, int var4, int var5) {
   }

   public void method_130(Class317 var1, int var2, int var3, int var4, Class41 var5) {
   }

   public void method_536(Class317 var1, int var2, int var3, int var4, Class252 var5, Class47 var6) {
   }

   public void method_15(Interface351 var1, int var2, int var3, int var4) {
   }

   public int method_274(Interface351 var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean method_743(Interface351 var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean method_507() {
      return false;
   }

   public void method_762(Class317 var1, int var2, int var3, int var4, Class252 var5) {
   }

   public boolean method_391(Class317 var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void method_547() {
   }

   public void method_234(Class317 var1, int var2, int var3, int var4, int var5) {
      this.method_363(var1, var2, var3, var4, var5);
   }

   public boolean method_645(Class317 var1, int var2, int var3, int var4) {
      return true;
   }

   public Class371 method_365(String var1) {
      return this;
   }

   public Class371 method_209(boolean var1) {
      return this;
   }

   public Class371 method_914(int var1) {
      return this;
   }

   static {
      field_1399 = new Class5(70, field_1294.field_1137, Enum196.field_1326).method_747(0.5F).method_951(field_211);
      field_724 = new Class5(72, field_1031.field_1137, Enum196.field_357).method_747(0.5F).method_951(field_966);
      field_1202 = new Class354(77, field_1294.field_1137).method_747(0.5F).method_951(field_211);
      Class323.method_29();

      for (int var0 = 0; var0 < 256; var0++) {
         if (field_57[var0] != null) {
            Class350.field_218[var0] = new Class181(var0 - 256);
         }
      }
   }
}
