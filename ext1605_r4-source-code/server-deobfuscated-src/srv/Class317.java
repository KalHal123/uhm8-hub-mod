package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Class317 implements Interface351 {
   private List<Class1> field_396;
   public List<Class252> field_1564;
   private List<Class252> field_561;
   private Set<Comparable184> field_1430;
   private Set<Comparable184> field_453;
   public List<Class66> field_839;
   public long field_301;
   public boolean field_1136;
   public boolean field_871;
   public long field_1281;
   public long field_1398;
   public long field_75;
   public long field_303;
   public int field_1569;
   protected int field_1555;
   protected int field_1429;
   public boolean field_565;
   public static float[] field_375 = new float[16];
   private final long field_296;
   protected int field_344;
   public List<Class41> field_469;
   public int field_1549;
   public Object field_1533;
   public Random field_413;
   public int field_944;
   public int field_639;
   public int field_1535;
   public boolean field_312;
   protected List<Interface61> field_1139;
   public Interface103 field_129;
   public File field_194;
   public long field_68;
   private Class100 field_823;
   public long field_1275;
   public final String field_560;
   public boolean field_1006;
   private ArrayList<Class94> field_653;
   private Set<Class338> field_707;
   private int field_305;
   private List<Class252> field_1303;
   public boolean field_906;
   protected Interface210 field_845;
   public boolean field_228 = false;
   public List<Class361> field_420 = new ArrayList<>();
   public boolean field_1121 = false;
   int field_657 = 0;

   public long method_498() {
      return this.field_301 / 23000L;
   }

   public static Class100 method_397(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if (!var3.exists()) {
         return null;
      }

      File var4 = new File(var3, "level.dat");
      if (var4.exists()) {
         try {
            Class100 var5 = Class165.method_562(new FileInputStream(var4));
            return var5.method_984("Data");
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      return null;
   }

   public static void method_606(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if (var3.exists()) {
         method_525(var3.listFiles());
         var3.delete();
      }
   }

   private static void method_525(File[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1].isDirectory()) {
            method_525(var0[var1].listFiles());
         }

         var0[var1].delete();
      }
   }

   public boolean method_684() {
      return true;
   }

   public Class317(File var1, String var2) {
      this(var1, var2, new Random().nextLong());
   }

   public Class317(String var1) {
      this.field_396 = new ArrayList<>();
      this.field_1564 = new ArrayList<>();
      this.field_561 = new ArrayList<>();
      this.field_1430 = Collections.synchronizedSet(new TreeSet<>());
      this.field_453 = Collections.synchronizedSet(new HashSet<>());
      this.field_839 = new ArrayList<>();
      this.field_301 = 0L;
      this.field_1136 = false;
      this.field_871 = false;
      this.field_1281 = 8961023L;
      this.field_75 = 12638463L;
      this.field_303 = 16777215L;
      this.field_1569 = 0;
      this.field_1555 = new Random().nextInt();
      this.field_1429 = 1013904223;
      this.field_565 = false;
      this.field_296 = System.currentTimeMillis();
      this.field_344 = 40;
      this.field_469 = new ArrayList<>();
      this.field_413 = new Random();
      this.field_845 = new Class242();
      this.field_312 = false;
      this.field_1139 = new ArrayList<>();
      this.field_68 = 0L;
      this.field_1275 = 0L;
      this.field_653 = new ArrayList<>();
      this.field_707 = new HashSet<>();
      this.field_305 = this.field_413.nextInt(12000);
      this.field_1303 = new ArrayList<>();
      this.field_906 = false;
      this.field_560 = var1;
      this.field_129 = this.method_791(this.field_194);
      this.method_66();
   }

   public Class317(File var1, String var2, long var3) {
      this.field_396 = new ArrayList<>();
      this.field_1564 = new ArrayList<>();
      this.field_561 = new ArrayList<>();
      this.field_1430 = Collections.synchronizedSet(new TreeSet<>());
      this.field_453 = Collections.synchronizedSet(new HashSet<>());
      this.field_839 = new ArrayList<>();
      this.field_301 = 0L;
      this.field_1136 = false;
      this.field_871 = false;
      this.field_1281 = 8961023L;
      this.field_75 = 12638463L;
      this.field_303 = 16777215L;
      this.field_1569 = 0;
      this.field_1555 = new Random().nextInt();
      this.field_1429 = 1013904223;
      this.field_565 = false;
      this.field_296 = System.currentTimeMillis();
      this.field_344 = 40;
      this.field_469 = new ArrayList<>();
      this.field_413 = new Random();
      this.field_845 = new Class242();
      this.field_312 = false;
      this.field_1139 = new ArrayList<>();
      this.field_68 = 0L;
      this.field_1275 = 0L;
      this.field_653 = new ArrayList<>();
      this.field_707 = new HashSet<>();
      this.field_305 = this.field_413.nextInt(12000);
      this.field_1303 = new ArrayList<>();
      this.field_906 = false;
      this.field_560 = var2;
      var1.mkdirs();
      this.field_194 = new File(var1, var2);
      this.field_194.mkdirs();

      try {
         File var5 = new File(this.field_194, "session.lock");
         DataOutputStream var6 = new DataOutputStream(new FileOutputStream(var5));

         try {
            var6.writeLong(this.field_296);
         } finally {
            var6.close();
         }
      } catch (IOException var16) {
         throw new RuntimeException("Failed to check session lock, aborting");
      }

      File var18 = new File(this.field_194, "level.dat");
      this.field_312 = !var18.exists();
      if (var18.exists()) {
         try {
            Class100 var19 = Class165.method_562(new FileInputStream(var18));
            Class100 var7 = var19.method_984("Data");
            this.field_68 = var7.method_895("RandomSeed");
            this.field_944 = var7.method_159("SpawnX");
            this.field_639 = var7.method_159("SpawnY");
            this.field_1535 = var7.method_159("SpawnZ");
            this.field_301 = var7.method_895("Time");
            this.field_1275 = var7.method_895("SizeOnDisk");
            this.field_1136 = var7.method_1004("SnowCovered");
            this.field_871 = var7.method_1004("SandCovered");
            this.field_228 = var7.method_1004("ExclusivelyFrail");
            if (var7.method_717("PortalZones")) {
               Class100 var8 = var7.method_984("PortalZones");

               for (Class335 var10 : var8.method_931()) {
                  if (var10.method_996() == 10) {
                     Class100 var11 = (Class100)var10;
                     this.field_420.add(Class361.method_980(var11, var10.method_1025()));
                  }
               }
            }

            if (this.method_684() && var7.method_717("Player")) {
               this.field_823 = var7.method_984("Player");
            }
         } catch (Exception var17) {
            var17.printStackTrace();
         }
      } else {
         this.field_871 = this.field_413.nextInt(4) == 1;
      }

      boolean var20 = false;
      if (this.field_68 == 0L) {
         this.field_68 = var3;
         var20 = true;
      }

      this.field_845 = new Class154(new Random(this.field_68)).method_975();
      this.field_129 = this.method_791(this.field_194);
      if (var20) {
         this.field_1006 = true;
         this.field_944 = 0;
         this.field_639 = 64;

         for (this.field_1535 = 0;
            !this.method_554(this.field_944, this.field_1535);
            this.field_1535 = this.field_1535 + (this.field_413.nextInt(64) - this.field_413.nextInt(64))
         ) {
            this.field_944 = this.field_944 + (this.field_413.nextInt(64) - this.field_413.nextInt(64));
         }

         this.field_1006 = false;
      }

      this.method_66();
   }

   protected Interface103 method_791(File var1) {
      return new Class106(this, new Class287(var1, true), new Class343(this, this.field_68));
   }

   protected boolean method_554(int var1, int var2) {
      int var3 = this.method_777(var1, var2);
      return var3 == Class371.field_378.field_1379;
   }

   private int method_777(int var1, int var2) {
      int var3 = 63;

      while (this.method_813(var1, var3 + 1, var2) != 0) {
         var3++;
      }

      return this.method_813(var1, var3, var2);
   }

   public void method_332(boolean var1, Interface282 var2) {
      if (this.field_129.method_845()) {
         if (var2 != null) {
            var2.method_344("Saving level");
         }

         this.method_932();
         if (var2 != null) {
            var2.method_217("Saving chunks");
         }

         this.field_129.method_541(var1, var2);
      }
   }

   private void method_932() {
      this.method_73();
      Class100 var1 = new Class100();
      var1.method_426("RandomSeed", this.field_68);
      var1.method_32("SpawnX", this.field_944);
      var1.method_32("SpawnY", this.field_639);
      var1.method_32("SpawnZ", this.field_1535);
      var1.method_426("Time", this.field_301);
      var1.method_426("SizeOnDisk", this.field_1275);
      var1.method_430("SnowCovered", this.field_1136);
      var1.method_430("SandCovered", this.field_871);
      var1.method_426("LastPlayed", System.currentTimeMillis());
      var1.method_426("Milestone", this.method_498());
      var1.method_430("ExclusivelyFrail", this.field_228);
      Class41 var2 = null;
      if (this.field_469.size() > 0) {
         var2 = this.field_469.get(0);
      }

      File var3 = new File(this.field_194, "excl_frail");
      if (this.field_228 && !var3.exists()) {
         try {
            var3.createNewFile();
         } catch (IOException var10) {
            var10.printStackTrace();
         }
      } else if (!this.field_228 && var3.exists()) {
         Class273.method_579("Deleting excl. frail file");
         var3.delete();
      }

      if (var2 != null) {
         Class100 var4 = new Class100();
         var2.method_582(var4);
         if (this.method_684()) {
            var1.method_487("Player", var4);
         }

         if (this.field_420 != null && this.field_420.size() > 0) {
            Class100 var5 = new Class100();
            var1.method_487("PortalZones", var5);
            int var6 = 0;

            for (Class361 var8 : this.field_420) {
               var5.method_487("pzone" + var6, var8.method_22());
               var6++;
            }
         }
      }

      Class100 var11 = new Class100();
      var11.method_280("Data", var1);

      try {
         File var12 = new File(this.field_194, "level.dat_new");
         File var13 = new File(this.field_194, "level.dat_old");
         File var14 = new File(this.field_194, "level.dat");
         Class165.method_734(var11, new FileOutputStream(var12));
         if (var13.exists()) {
            var13.delete();
         }

         var14.renameTo(var13);
         if (var14.exists()) {
            var14.delete();
         }

         var12.renameTo(var14);
         if (var12.exists()) {
            var12.delete();
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   public boolean method_754(int var1) {
      if (!this.field_129.method_845()) {
         return true;
      }

      if (var1 == 0) {
         this.method_932();
      }

      return this.field_129.method_541(false, (Interface282)null);
   }

   @Override
   public int method_813(int var1, int var2, int var3) {
      return var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000
         ? 0
         : (var2 < 0 ? 0 : (var2 >= 128 ? 0 : this.method_695(var1 >> 4, var3 >> 4).method_218(var1 & 15, var2, var3 & 15)));
   }

   public boolean method_833(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 128 ? this.method_570(var1 >> 4, var3 >> 4) : false;
   }

   public boolean method_960(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 128) {
         var1 >>= 4;
         var2 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var5 >>= 4;
         var6 >>= 4;

         for (int var7 = var1; var7 <= var4; var7++) {
            for (int var8 = var3; var8 <= var6; var8++) {
               if (!this.method_570(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method_570(int var1, int var2) {
      return this.field_129.method_161(var1, var2);
   }

   public Class166 method_389(int var1, int var2) {
      return this.method_695(var1 >> 4, var2 >> 4);
   }

   public Class166 method_695(int var1, int var2) {
      return this.field_129.method_986(var1, var2);
   }

   public boolean method_662(int var1, int var2, int var3, int var4, int var5) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      Class166 var6 = this.method_695(var1 >> 4, var3 >> 4);
      return var6.method_584(var1 & 15, var2, var3 & 15, var4, var5);
   }

   public boolean method_260(int var1, int var2, int var3, int var4) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      Class166 var5 = this.method_695(var1 >> 4, var3 >> 4);
      return var5.method_45(var1 & 15, var2, var3 & 15, var4);
   }

   @Override
   public Class111 method_149(int var1, int var2, int var3) {
      int var4 = this.method_813(var1, var2, var3);
      return var4 == 0 ? Class111.field_54 : Class371.field_57[var4].field_658;
   }

   @Override
   public int method_929(int var1, int var2, int var3) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return 0;
      }

      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      Class166 var4 = this.method_695(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      return var4.method_126(var1, var2, var3);
   }

   public void method_489(int var1, int var2, int var3, int var4) {
      this.method_549(var1, var2, var3, var4);
   }

   public boolean method_549(int var1, int var2, int var3, int var4) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      Class166 var5 = this.method_695(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      var5.method_969(var1, var2, var3, var4);
      return true;
   }

   public boolean method_226(int var1, int var2, int var3, int var4) {
      if (this.method_260(var1, var2, var3, var4)) {
         this.method_988(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean method_86(int var1, int var2, int var3, int var4, int var5) {
      if (this.method_662(var1, var2, var3, var4, var5)) {
         this.method_988(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void method_473(int var1, int var2, int var3) {
      if (var2 >= 0) {
         for (int var4 = 0; var4 < this.field_1139.size(); var4++) {
            this.field_1139.get(var4).method_129(var1, var2, var3);
         }
      }
   }

   protected void method_988(int var1, int var2, int var3, int var4) {
      this.method_473(var1, var2, var3);
      this.method_922(var1, var2, var3, var4);
   }

   public void method_163(int var1, int var2, int var3, int var4) {
      if (var3 > var4) {
         int var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      this.method_674(var1, var3, var2, var1, var4, var2);
   }

   public void method_674(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = 0; var7 < this.field_1139.size(); var7++) {
         this.field_1139.get(var7).method_187(var1, var2, var3, var4, var5, var6);
      }
   }

   public void method_922(int var1, int var2, int var3, int var4) {
      this.method_1031(var1 - 1, var2, var3, var4);
      this.method_1031(var1 + 1, var2, var3, var4);
      this.method_1031(var1, var2 - 1, var3, var4);
      this.method_1031(var1, var2 + 1, var3, var4);
      this.method_1031(var1, var2, var3 - 1, var4);
      this.method_1031(var1, var2, var3 + 1, var4);
   }

   private void method_1031(int var1, int var2, int var3, int var4) {
      if (!this.field_565 && !this.field_906) {
         Class371 var5 = Class371.field_57[this.method_813(var1, var2, var3)];
         if (var5 != null) {
            var5.method_721(this, var1, var2, var3, var4);
         }
      }
   }

   public boolean method_338(int var1, int var2, int var3) {
      return this.method_695(var1 >> 4, var3 >> 4).method_88(var1 & 15, var2, var3 & 15);
   }

   public int method_339(int var1, int var2, int var3) {
      return this.method_406(var1, var2, var3, true);
   }

   public int method_566(int var1, int var2, int var3, boolean var4) {
      return this.method_386(var1, var2, var3, true, var4);
   }

   public int method_406(int var1, int var2, int var3, boolean var4) {
      return this.method_386(var1, var2, var3, var4, false);
   }

   public int method_386(int var1, int var2, int var3, boolean var4, boolean var5) {
      int var6 = this.field_1569;
      if (var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if (var4) {
            int var7 = this.method_813(var1, var2, var3);
            if (var7 == Class371.field_265.field_1379 || var7 == Class371.field_1254.field_1379) {
               int var16 = this.method_406(var1, var2 + 1, var3, false);
               int var9 = this.method_406(var1 + 1, var2, var3, false);
               int var10 = this.method_406(var1 - 1, var2, var3, false);
               int var11 = this.method_406(var1, var2, var3 + 1, false);
               int var12 = this.method_406(var1, var2, var3 - 1, false);
               if (var9 > var16) {
                  var16 = var9;
               }

               if (var10 > var16) {
                  var16 = var10;
               }

               if (var11 > var16) {
                  var16 = var11;
               }

               if (var12 > var16) {
                  var16 = var12;
               }

               return var16;
            }
         }

         if (var2 < 0) {
            return 0;
         }

         if (var2 >= 128) {
            int var15 = 15 - var6;
            if (var15 < 0) {
               var15 = 0;
            }

            return var15;
         } else {
            Class166 var8 = this.method_695(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var8.method_963(var1, var2, var3, var6);
         }
      } else {
         return 15;
      }
   }

   public boolean method_843(int var1, int var2, int var3) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return true;
      }

      if (!this.method_570(var1 >> 4, var3 >> 4)) {
         return false;
      }

      Class166 var4 = this.method_695(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      return var4.method_88(var1, var2, var3);
   }

   public int method_713(int var1, int var2) {
      if (var1 >= -32000000 && var2 >= -32000000 && var1 < 32000000 && var2 <= 32000000) {
         if (!this.method_570(var1 >> 4, var2 >> 4)) {
            return 0;
         }

         Class166 var3 = this.method_695(var1 >> 4, var2 >> 4);
         return var3.method_555(var1 & 15, var2 & 15);
      } else {
         return 0;
      }
   }

   public void method_380(Enum336 var1, int var2, int var3, int var4, int var5) {
      if (this.method_833(var2, var3, var4)) {
         if (var1 == Enum336.field_50) {
            if (this.method_843(var2, var3, var4)) {
               var5 = 15;
            }
         } else if (var1 == Enum336.field_1434) {
            int var6 = this.method_813(var2, var3, var4);
            if (Class371.field_1015[var6] > var5) {
               var5 = Class371.field_1015[var6];
            }
         }

         if (this.method_347(var1, var2, var3, var4) != var5) {
            this.method_455(var1, var2, var3, var4, var2, var3, var4);
         }
      }
   }

   public int method_347(Enum336 var1, int var2, int var3, int var4) {
      if (var3 >= 0 && var3 < 128 && var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if (!this.method_570(var5, var6)) {
            return 0;
         }

         Class166 var7 = this.method_695(var5, var6);

         try {
            return var7.method_711(var1, var2 & 15, var3, var4 & 15);
         } catch (StackOverflowError var9) {
            System.out.println("StckError at " + var2 + "," + var3 + "," + var4);
            return 0;
         }
      } else {
         return var1.field_225;
      }
   }

   public void method_823(Enum336 var1, int var2, int var3, int var4, int var5) {
      if (var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000 && var3 >= 0 && var3 < 128 && this.method_570(var2 >> 4, var4 >> 4)) {
         Class166 var6 = this.method_695(var2 >> 4, var4 >> 4);
         var6.method_59(var1, var2 & 15, var3, var4 & 15, var5);

         for (int var7 = 0; var7 < this.field_1139.size(); var7++) {
            this.field_1139.get(var7).method_129(var2, var3, var4);
         }
      }
   }

   public float method_6(int var1, int var2, int var3) {
      return field_375[this.method_566(var1, var2, var3, true)];
   }

   public float method_170(int var1, int var2, int var3) {
      return field_375[this.method_339(var1, var2, var3)];
   }

   public boolean method_143() {
      return this.field_1569 < 4;
   }

   public Class3 method_505(Class47 var1, Class47 var2) {
      return this.method_208(var1, var2, false);
   }

   public Class3 method_208(Class47 var1, Class47 var2, boolean var3) {
      if (Double.isNaN(var1.field_13) || Double.isNaN(var1.field_173) || Double.isNaN(var1.field_510)) {
         return null;
      }

      if (!Double.isNaN(var2.field_13) && !Double.isNaN(var2.field_173) && !Double.isNaN(var2.field_510)) {
         int var4 = Class380.method_502(var2.field_13);
         int var5 = Class380.method_502(var2.field_173);
         int var6 = Class380.method_502(var2.field_510);
         int var7 = Class380.method_502(var1.field_13);
         int var8 = Class380.method_502(var1.field_173);
         int var9 = Class380.method_502(var1.field_510);
         int var10 = 20;

         while (var10-- >= 0) {
            if (Double.isNaN(var1.field_13) || Double.isNaN(var1.field_173) || Double.isNaN(var1.field_510)) {
               return null;
            }

            if (var7 == var4 && var8 == var5 && var9 == var6) {
               return null;
            }

            double var11 = 999.0;
            double var13 = 999.0;
            double var15 = 999.0;
            if (var4 > var7) {
               var11 = var7 + 1.0;
            }

            if (var4 < var7) {
               var11 = var7 + 0.0;
            }

            if (var5 > var8) {
               var13 = var8 + 1.0;
            }

            if (var5 < var8) {
               var13 = var8 + 0.0;
            }

            if (var6 > var9) {
               var15 = var9 + 1.0;
            }

            if (var6 < var9) {
               var15 = var9 + 0.0;
            }

            double var17 = 999.0;
            double var19 = 999.0;
            double var21 = 999.0;
            double var23 = var2.field_13 - var1.field_13;
            double var25 = var2.field_173 - var1.field_173;
            double var27 = var2.field_510 - var1.field_510;
            if (var11 != 999.0) {
               var17 = (var11 - var1.field_13) / var23;
            }

            if (var13 != 999.0) {
               var19 = (var13 - var1.field_173) / var25;
            }

            if (var15 != 999.0) {
               var21 = (var15 - var1.field_510) / var27;
            }

            byte var29;
            if (var17 < var19 && var17 < var21) {
               if (var4 > var7) {
                  var29 = 4;
               } else {
                  var29 = 5;
               }

               var1.field_13 = var11;
               var1.field_173 += var25 * var17;
               var1.field_510 += var27 * var17;
            } else if (var19 < var21) {
               if (var5 > var8) {
                  var29 = 0;
               } else {
                  var29 = 1;
               }

               var1.field_13 += var23 * var19;
               var1.field_173 = var13;
               var1.field_510 += var27 * var19;
            } else {
               if (var6 > var9) {
                  var29 = 2;
               } else {
                  var29 = 3;
               }

               var1.field_13 += var23 * var21;
               var1.field_173 += var25 * var21;
               var1.field_510 = var15;
            }

            Class47 var30 = Class47.method_875(var1.field_13, var1.field_173, var1.field_510);
            var7 = (int)(var30.field_13 = Class380.method_502(var1.field_13));
            if (var29 == 5) {
               var7--;
               var30.field_13++;
            }

            var8 = (int)(var30.field_173 = Class380.method_502(var1.field_173));
            if (var29 == 1) {
               var8--;
               var30.field_173++;
            }

            var9 = (int)(var30.field_510 = Class380.method_502(var1.field_510));
            if (var29 == 3) {
               var9--;
               var30.field_510++;
            }

            int var31 = this.method_813(var7, var8, var9);
            int var32 = this.method_929(var7, var8, var9);
            Class371 var33 = Class371.field_57[var31];
            if (var31 > 0 && var33.method_573(var32, var3)) {
               Class3 var34 = var33.method_393(this, var7, var8, var9, var1, var2);
               if (var34 != null) {
                  return var34;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public void method_38(Class252 var1, String var2, float var3, float var4) {
      for (int var5 = 0; var5 < this.field_1139.size(); var5++) {
         this.field_1139.get(var5).method_1023(var2, var1.field_1324, var1.field_632 - var1.field_855, var1.field_1321, var3, var4);
      }
   }

   public void method_621(double var1, double var3, double var5, String var7, float var8, float var9) {
      for (int var10 = 0; var10 < this.field_1139.size(); var10++) {
         this.field_1139.get(var10).method_1023(var7, var1, var3, var5, var8, var9);
      }
   }

   public void method_307(String var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.field_1139.size(); var5++) {
         this.field_1139.get(var5).method_959(var1, var2, var3, var4);
      }
   }

   public void method_140(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for (int var14 = 0; var14 < this.field_1139.size(); var14++) {
         this.field_1139.get(var14).method_316(var1, var2, var4, var6, var8, var10, var12);
      }
   }

   public boolean method_237(Class252 var1) {
      int var2 = Class380.method_502(var1.field_1324 / 16.0);
      int var3 = Class380.method_502(var1.field_1321 / 16.0);
      boolean var4 = false;
      if (var1 instanceof Class41 && !(var1 instanceof Class199)) {
         var4 = true;
      }

      if (!var4 && !this.method_570(var2, var3)) {
         return false;
      }

      if (var1 instanceof Class41 && !(var1 instanceof Class199)) {
         this.field_469.add((Class41)var1);
         System.out.println("Player count: " + this.field_469.size());
      }

      this.method_695(var2, var3).method_155(var1);
      this.field_1564.add(var1);
      this.method_378(var1);
      return true;
   }

   protected void method_378(Class252 var1) {
      for (int var2 = 0; var2 < this.field_1139.size(); var2++) {
         this.field_1139.get(var2).method_665(var1);
      }
   }

   protected void method_613(Class252 var1) {
      for (int var2 = 0; var2 < this.field_1139.size(); var2++) {
         this.field_1139.get(var2).method_546(var1);
      }
   }

   public void method_649(Class252 var1) {
      var1.method_715();
      if (var1 instanceof Class41) {
         this.field_469.remove((Class41)var1);
         System.out.println("Player count: " + this.field_469.size());
      }
   }

   public void method_681(Interface61 var1) {
      this.field_1139.add(var1);
   }

   public void method_423(Interface61 var1) {
      this.field_1139.remove(var1);
   }

   public List<Class94> method_893(Class252 var1, Class94 var2) {
      this.field_653.clear();
      int var3 = Class380.method_502(var2.field_1397);
      int var4 = Class380.method_502(var2.field_346 + 1.0);
      int var5 = Class380.method_502(var2.field_817);
      int var6 = Class380.method_502(var2.field_1448 + 1.0);
      int var7 = Class380.method_502(var2.field_601);
      int var8 = Class380.method_502(var2.field_854 + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var7; var10 < var8; var10++) {
            if (this.method_833(var9, 64, var10)) {
               for (int var11 = var5 - 1; var11 < var6; var11++) {
                  Class371 var12 = Class371.field_57[this.method_813(var9, var11, var10)];
                  if (var12 != null) {
                     var12.method_840(this, var9, var11, var10, var2, this.field_653);
                  }
               }
            }
         }
      }

      double var14 = 0.25;
      List var15 = this.method_362(var1, var2.method_99(var14, var14, var14));

      for (int var16 = 0; var16 < var15.size(); var16++) {
         Class94 var13 = ((Class252)var15.get(var16)).method_190();
         if (var13 != null && var13.method_75(var2)) {
            this.field_653.add(var13);
         }

         var13 = var1.method_782((Class252)var15.get(var16));
         if (var13 != null && var13.method_75(var2)) {
            this.field_653.add(var13);
         }
      }

      return this.field_653;
   }

   public int method_1027(float var1) {
      float var2 = this.method_109(var1);
      float var3 = 1.0F - (Class380.method_520(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      boolean var4 = this.method_498() % 10L == 0L && this.method_498() > 0L;
      return var4 ? 8 + (int)(var3 * 3.0F) : (int)(var3 * 11.0F);
   }

   public float method_109(float var1) {
      int var2 = (int)(this.field_301 % 24000L);
      float var3 = (var2 + var1) / 24000.0F - 0.25F;
      if (var3 < 0.0F) {
         var3++;
      }

      if (var3 > 1.0F) {
         var3--;
      }

      float var4 = var3;
      var3 = 1.0F - (float)((Math.cos(var3 * Math.PI) + 1.0) / 2.0);
      return var4 + (var3 - var4) / 3.0F;
   }

   public int method_641(int var1, int var2) {
      Class166 var3 = this.method_389(var1, var2);
      int var4 = 127;
      var1 &= 15;
      var2 &= 15;

      while (var4 > 0) {
         int var5 = var3.method_218(var1, var4, var2);
         if (var5 != 0 && (Class371.field_57[var5].field_658.method_330() || Class371.field_57[var5].field_658.method_210())) {
            return var4 + 1;
         }

         var4--;
      }

      return -1;
   }

   public int method_354(int var1, int var2) {
      return this.method_389(var1, var2).method_555(var1 & 15, var2 & 15);
   }

   public float method_227(float var1) {
      float var2 = this.method_109(var1);
      float var3 = 1.0F - (Class380.method_520(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.75F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void method_809(int var1, int var2, int var3, int var4) {
      Comparable184 var5 = new Comparable184(var1, var2, var3, var4);
      byte var6 = 8;
      if (this.method_960(var1 - var6, var2 - var6, var3 - var6, var1 + var6, var2 + var6, var3 + var6)) {
         if (var4 > 0) {
            var5.method_55(Class371.field_57[var4].method_796() + this.field_301);
         }

         this.field_1121 = true;
         if (!this.field_453.contains(var5)) {
            this.field_453.add(var5);
            this.field_1430.add(var5);
         }

         this.field_1121 = false;
      }
   }

   public void method_569() {
      this.field_1564.removeAll(this.field_561);

      for (int var1 = 0; var1 < this.field_561.size(); var1++) {
         Class252 var2 = this.field_561.get(var1);
         int var3 = var2.field_809;
         int var4 = var2.field_41;
         if (var2.field_519 && this.method_570(var3, var4)) {
            this.method_695(var3, var4).method_873(var2);
         }
      }

      for (int var6 = 0; var6 < this.field_561.size(); var6++) {
         this.method_613(this.field_561.get(var6));
      }

      this.field_561.clear();

      for (int var7 = 0; var7 < this.field_1564.size(); var7++) {
         Class252 var9 = this.field_1564.get(var7);
         if (var9.field_915 != null) {
            if (!var9.field_915.field_120 && var9.field_915.field_826 == var9) {
               continue;
            }

            var9.field_915.field_826 = null;
            var9.field_915 = null;
         }

         if (!var9.field_120) {
            this.method_370(var9);
         }

         if (var9.field_120) {
            int var10 = var9.field_809;
            int var11 = var9.field_41;
            if (var9.field_519 && this.method_570(var10, var11)) {
               this.method_695(var10, var11).method_873(var9);
            }

            this.field_1564.remove(var7--);
            this.method_613(var9);
         }
      }

      for (int var8 = 0; var8 < this.field_839.size(); var8++) {
         Class66 var5 = this.field_839.get(var8);
         var5.method_855();
      }
   }

   protected void method_370(Class252 var1) {
      int var2 = Class380.method_502(var1.field_1324);
      int var3 = Class380.method_502(var1.field_1321);
      byte var4 = 16;
      if (this.method_960(var2 - var4, 0, var3 - var4, var2 + var4, 128, var3 + var4)) {
         var1.field_1415 = var1.field_1324;
         var1.field_1422 = var1.field_632;
         var1.field_875 = var1.field_1321;
         var1.field_90 = var1.field_909;
         var1.field_253 = var1.field_427;
         if (var1.field_915 != null) {
            var1.method_447();
         } else {
            var1.method_439();
         }

         int var5 = Class380.method_502(var1.field_1324 / 16.0);
         int var6 = Class380.method_502(var1.field_632 / 16.0);
         int var7 = Class380.method_502(var1.field_1321 / 16.0);
         if (!var1.field_519 || var1.field_809 != var5 || var1.field_737 != var6 || var1.field_41 != var7) {
            if (var1.field_519 && this.method_570(var1.field_809, var1.field_41)) {
               this.method_695(var1.field_809, var1.field_41).method_367(var1, var1.field_737);
            }

            if (this.method_570(var5, var7)) {
               this.method_695(var5, var7).method_155(var1);
            } else {
               var1.field_519 = false;
               System.out.println("Removing entity because it's not in a chunk!!");
               var1.method_715();
            }
         }

         if (var1.field_826 != null) {
            if (!var1.field_826.field_120 && var1.field_826.field_915 == var1) {
               this.method_370(var1.field_826);
            } else {
               var1.field_826.field_915 = null;
               var1.field_826 = null;
            }
         }

         if (Double.isNaN(var1.field_1324) || Double.isInfinite(var1.field_1324)) {
            var1.field_1324 = var1.field_1415;
         }

         if (Double.isNaN(var1.field_632) || Double.isInfinite(var1.field_632)) {
            var1.field_632 = var1.field_1422;
         }

         if (Double.isNaN(var1.field_1321) || Double.isInfinite(var1.field_1321)) {
            var1.field_1321 = var1.field_875;
         }

         if (Double.isNaN(var1.field_427) || Double.isInfinite(var1.field_427)) {
            var1.field_427 = var1.field_253;
         }

         if (Double.isNaN(var1.field_909) || Double.isInfinite(var1.field_909)) {
            var1.field_909 = var1.field_90;
         }
      }
   }

   public boolean method_31(Class94 var1) {
      List var2 = this.method_362((Class252)null, var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         Class252 var4 = (Class252)var2.get(var3);
         if (!var4.field_120 && var4.field_1240) {
            return false;
         }
      }

      return true;
   }

   public boolean method_730(Class94 var1) {
      int var2 = Class380.method_502(var1.field_1397);
      int var3 = Class380.method_502(var1.field_346 + 1.0);
      int var4 = Class380.method_502(var1.field_817);
      int var5 = Class380.method_502(var1.field_1448 + 1.0);
      int var6 = Class380.method_502(var1.field_601);
      int var7 = Class380.method_502(var1.field_854 + 1.0);
      if (var1.field_1397 < 0.0) {
         var2--;
      }

      if (var1.field_817 < 0.0) {
         var4--;
      }

      if (var1.field_601 < 0.0) {
         var6--;
      }

      for (int var8 = var2; var8 < var3; var8++) {
         for (int var9 = var4; var9 < var5; var9++) {
            for (int var10 = var6; var10 < var7; var10++) {
               Class371 var11 = Class371.field_57[this.method_813(var8, var9, var10)];
               if (var11 != null && var11.field_658.method_210()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean method_180(Class94 var1) {
      int var2 = Class380.method_502(var1.field_1397);
      int var3 = Class380.method_502(var1.field_346 + 1.0);
      int var4 = Class380.method_502(var1.field_817);
      int var5 = Class380.method_502(var1.field_1448 + 1.0);
      int var6 = Class380.method_502(var1.field_601);
      int var7 = Class380.method_502(var1.field_854 + 1.0);

      for (int var8 = var2; var8 < var3; var8++) {
         for (int var9 = var4; var9 < var5; var9++) {
            for (int var10 = var6; var10 < var7; var10++) {
               int var11 = this.method_813(var8, var9, var10);
               if (var11 == Class371.field_1424.field_1379 || var11 == Class371.field_1103.field_1379 || var11 == Class371.field_955.field_1379) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean method_60(Class94 var1, Class111 var2, Class252 var3) {
      int var4 = Class380.method_502(var1.field_1397);
      int var5 = Class380.method_502(var1.field_346 + 1.0);
      int var6 = Class380.method_502(var1.field_817);
      int var7 = Class380.method_502(var1.field_1448 + 1.0);
      int var8 = Class380.method_502(var1.field_601);
      int var9 = Class380.method_502(var1.field_854 + 1.0);
      boolean var10 = false;
      Class47 var11 = Class47.method_875(0.0, 0.0, 0.0);

      for (int var12 = var4; var12 < var5; var12++) {
         for (int var13 = var6; var13 < var7; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               Class371 var15 = Class371.field_57[this.method_813(var12, var13, var14)];
               if (var15 != null && var15.field_658 == var2) {
                  double var16 = var13 + 1 - Class195.method_230(this.method_929(var12, var13, var14));
                  if (var7 >= var16) {
                     var10 = true;
                     var15.method_536(this, var12, var13, var14, var3, var11);
                  }
               }
            }
         }
      }

      if (var11.method_906() > 0.0) {
         var11 = var11.method_37();
         double var19 = 0.004;
         var3.field_607 = var3.field_607 + var11.field_13 * var19;
         var3.field_780 = var3.field_780 + var11.field_173 * var19;
         var3.field_921 = var3.field_921 + var11.field_510 * var19;
      }

      return var10;
   }

   public boolean method_261(Class94 var1, Class111 var2) {
      int var3 = Class380.method_502(var1.field_1397);
      int var4 = Class380.method_502(var1.field_346 + 1.0);
      int var5 = Class380.method_502(var1.field_817);
      int var6 = Class380.method_502(var1.field_1448 + 1.0);
      int var7 = Class380.method_502(var1.field_601);
      int var8 = Class380.method_502(var1.field_854 + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var5; var10 < var6; var10++) {
            for (int var11 = var7; var11 < var8; var11++) {
               Class371 var12 = Class371.field_57[this.method_813(var9, var10, var11)];
               if (var12 != null && var12.field_658 == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean method_850(Class94 var1, Class111 var2) {
      int var3 = Class380.method_502(var1.field_1397);
      int var4 = Class380.method_502(var1.field_346 + 1.0);
      int var5 = Class380.method_502(var1.field_817);
      int var6 = Class380.method_502(var1.field_1448 + 1.0);
      int var7 = Class380.method_502(var1.field_601);
      int var8 = Class380.method_502(var1.field_854 + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var5; var10 < var6; var10++) {
            for (int var11 = var7; var11 < var8; var11++) {
               Class371 var12 = Class371.field_57[this.method_813(var9, var10, var11)];
               if (var12 != null && var12.field_658 == var2) {
                  int var13 = this.method_929(var9, var10, var11);
                  double var14 = var10 + 1;
                  if (var13 < 8) {
                     var14 = var10 + 1 - var13 / 8.0;
                  }

                  if (var14 >= var1.field_817) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public void method_701(Class252 var1, double var2, double var4, double var6, float var8) {
      new Class175().method_905(this, var1, var2, var4, var6, var8);
   }

   public float method_772(Class47 var1, Class94 var2) {
      double var3 = 1.0 / ((var2.field_346 - var2.field_1397) * 2.0 + 1.0);
      double var5 = 1.0 / ((var2.field_1448 - var2.field_817) * 2.0 + 1.0);
      double var7 = 1.0 / ((var2.field_854 - var2.field_601) * 2.0 + 1.0);
      int var9 = 0;
      int var10 = 0;

      for (float var11 = 0.0F; var11 <= 1.0F; var11 = (float)(var11 + var3)) {
         for (float var12 = 0.0F; var12 <= 1.0F; var12 = (float)(var12 + var5)) {
            for (float var13 = 0.0F; var13 <= 1.0F; var13 = (float)(var13 + var7)) {
               double var14 = var2.field_1397 + (var2.field_346 - var2.field_1397) * var11;
               double var16 = var2.field_817 + (var2.field_1448 - var2.field_817) * var12;
               double var18 = var2.field_601 + (var2.field_854 - var2.field_601) * var13;
               if (this.method_505(Class47.method_875(var14, var16, var18), var1) == null) {
                  var9++;
               }

               var10++;
            }
         }
      }

      return (float)var9 / var10;
   }

   public Class66 method_49(int var1, int var2, int var3) {
      Class166 var4 = this.method_695(var1 >> 4, var3 >> 4);
      return var4 != null ? var4.method_703(var1 & 15, var2, var3 & 15) : null;
   }

   public void method_563(int var1, int var2, int var3, Class66 var4) {
      Class166 var5 = this.method_695(var1 >> 4, var3 >> 4);
      if (var5 != null) {
         var5.method_58(var1 & 15, var2, var3 & 15, var4);
      }
   }

   public void method_945(int var1, int var2, int var3) {
      Class166 var4 = this.method_695(var1 >> 4, var3 >> 4);
      if (var4 != null) {
         var4.method_920(var1 & 15, var2, var3 & 15);
      }
   }

   @Override
   public boolean method_604(int var1, int var2, int var3) {
      Class371 var4 = Class371.field_57[this.method_813(var1, var2, var3)];
      return var4 == null ? false : var4.method_491();
   }

   @Override
   public Interface210 method_642() {
      return this.field_845;
   }

   public void method_1(Interface282 var1) {
      this.method_332(true, var1);
   }

   public boolean method_25() {
      int var1 = 1000;

      while (this.field_396.size() > 0) {
         if (--var1 <= 0) {
            return true;
         }

         Class1 var2 = this.field_396.remove(this.field_396.size() - 1);
         if (var2 != null) {
            var2.method_784(this);
         }
      }

      return false;
   }

   public void method_455(Enum336 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method_514(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void method_514(Enum336 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = (var5 + var2) / 2;
      int var10 = (var7 + var4) / 2;
      if (this.method_833(var9, 64, var10)) {
         int var11 = this.field_396.size();
         if (var8) {
            int var12 = 4;
            if (var12 > var11) {
               var12 = var11;
            }

            for (int var13 = 0; var13 < var12; var13++) {
               Class1 var14 = this.field_396.get(this.field_396.size() - var13 - 1);
               if (var14 != null && var14.field_318 == var1 && var14.method_556(var2, var3, var4, var5, var6, var7)) {
                  return;
               }
            }
         }

         this.field_396.add(new Class1(var1, var2, var3, var4, var5, var6, var7));
      }
   }

   public void method_66() {
      int var1 = this.method_1027(1.0F);
      if (var1 != this.field_1569) {
         this.field_1569 = var1;
      }
   }

   public void method_70() {
      this.field_129.method_756();
      if (this.field_1564.size() >= 4096) {
         System.out.println("Entity overflow!");
         this.field_1564.retainAll(this.field_469);
      }

      int var1 = this.method_1027(1.0F);
      if (var1 != this.field_1569) {
         this.field_1569 = var1;

         for (int var2 = 0; var2 < this.field_1139.size(); var2++) {
            this.field_1139.get(var2).method_637();
         }
      }

      boolean var3 = this.method_498() % 10L == 0L && this.method_498() > 0L;
      if (var3) {
         this.field_1281 = 6976L;
      }

      if (this.field_301 % 23000L == 0L) {
         System.out.println("Milestone " + this.field_301 / 23000L + " reached");
      }

      this.field_301++;
      Class31.method_448(this);
      if (this.field_301 % this.field_344 == 0L) {
         this.method_332(false, (Interface282)null);
      }

      this.method_117(false);
      this.method_493();
   }

   protected void method_493() {
      this.field_707.clear();

      for (int var5 = 0; var5 < this.field_469.size(); var5++) {
         Class41 var6 = this.field_469.get(var5);
         int var1 = Class380.method_502(var6.field_1324 / 16.0);
         int var2 = Class380.method_502(var6.field_1321 / 16.0);
         byte var7 = 9;

         for (int var3 = -var7; var3 <= var7; var3++) {
            for (int var4 = -var7; var4 <= var7; var4++) {
               this.field_707.add(new Class338(var3 + var1, var4 + var2));
            }
         }
      }

      if (this.field_305 > 0) {
         this.field_305--;
      }

      for (Class338 var24 : this.field_707) {
         int var12 = var24.field_572 * 16;
         int var13 = var24.field_1174 * 16;
         Class166 var25 = this.method_695(var24.field_572, var24.field_1174);
         if (this.field_305 == 0) {
            this.field_1555 = this.field_1555 * 3 + this.field_1429;
            int var14 = this.field_1555 >> 2;
            int var18 = var14 & 15;
            int var8 = var14 >> 8 & 15;
            int var9 = var14 >> 16 & 127;
            int var10 = var25.method_218(var18, var9, var8);
            var18 += var12;
            var8 += var13;
            if (var10 == 0 && this.method_339(var18, var9, var8) <= this.field_413.nextInt(8) && this.method_347(Enum336.field_50, var18, var9, var8) <= 0) {
               Class41 var11 = this.method_818(var18 + 0.5, var9 + 0.5, var8 + 0.5, 8.0);
               if (var11 != null && var11.method_124(var18 + 0.5, var9 + 0.5, var8 + 0.5) > 4.0) {
                  this.method_621(var18 + 0.5, var9 + 0.5, var8 + 0.5, "ambient.cave.cave", 0.7F, 0.8F + this.field_413.nextFloat() * 0.2F);
                  this.field_305 = this.field_413.nextInt(12000) + 6000;
               }
            }
         }

         if (this.field_1136 && this.field_413.nextInt(4) == 0) {
            this.field_1555 = this.field_1555 * 3 + this.field_1429;
            int var15 = this.field_1555 >> 2;
            int var20 = var15 & 15;
            int var27 = var15 >> 8 & 15;
            int var30 = this.method_641(var20 + var12, var27 + var13);
            if (var30 >= 0 && var30 < 128 && var25.method_711(Enum336.field_1434, var20, var30, var27) < 10) {
               int var33 = var25.method_218(var20, var30 - 1, var27);
               if (var25.method_218(var20, var30, var27) == 0 && Class371.field_1595.method_769(this, var20 + var12, var30, var27 + var13)) {
                  this.method_226(var20 + var12, var30, var27 + var13, Class371.field_1595.field_1379);
               }

               if (var33 == Class371.field_535.field_1379 && var25.method_126(var20, var30 - 1, var27) == 0) {
                  this.method_226(var20 + var12, var30 - 1, var27 + var13, Class371.field_811.field_1379);
               }
            }
         }

         if (this.field_871 && this.field_413.nextInt(4) == 1) {
            this.field_1555 = this.field_1555 * 3 + this.field_1429;
            int var16 = this.field_1555 >> 2;
            int var21 = var16 & 15;
            int var28 = var16 >> 8 & 15;
            int var31 = this.method_641(var21 + var12, var28 + var13);
            if (var31 >= 0 && var31 < 128 && var25.method_711(Enum336.field_1434, var21, var31, var28) < 10) {
               int var34 = var25.method_218(var21, var31 - 1, var28);
               if (var34 == Class371.field_535.field_1379 && var25.method_126(var21, var31 - 1, var28) == 0 && this.field_413.nextInt(16) == 0) {
                  this.method_226(var21 + var12, var31 - 1, var28 + var13, Class371.field_1183.field_1379);
               }
            }
         }

         for (int var17 = 0; var17 < 80; var17++) {
            this.field_1555 = this.field_1555 * 3 + this.field_1429;
            int var22 = this.field_1555 >> 2;
            int var29 = var22 & 15;
            int var32 = var22 >> 8 & 15;
            int var35 = var22 >> 16 & 127;
            int var36 = var25.field_663[var29 << 11 | var32 << 7 | var35] & 255;
            if (Class371.field_1421[var36]) {
               Class371.field_57[var36].method_373(this, var29 + var12, var35, var32 + var13, this.field_413);
            }
         }
      }
   }

   public boolean method_117(boolean var1) {
      int var2 = this.field_1430.size();
      int var3 = Math.min(var2, this.field_453.size());
      if (Math.abs(var2 - this.field_453.size()) > 3) {
         return true;
      }

      if (var2 > 1000) {
         var2 = 1000;
      }

      for (int var4 = 0; var4 < var3; var4++) {
         var3 = Math.min(var2, this.field_453.size());
         Comparable184 var5;
         synchronized (this.field_1430) {
            var5 = this.field_1430.iterator().next();
         }

         if (!var1 && var5.field_751 > this.field_301) {
            break;
         }

         this.field_1121 = true;
         this.field_1430.remove(var5);
         this.field_453.remove(var5);
         this.field_1121 = false;
         byte var9 = 8;
         if (this.method_960(
            var5.field_1191 - var9, var5.field_414 - var9, var5.field_1573 - var9, var5.field_1191 + var9, var5.field_414 + var9, var5.field_1573 + var9
         )) {
            int var7 = this.method_813(var5.field_1191, var5.field_414, var5.field_1573);
            if (var7 == var5.field_1027 && var7 > 0) {
               Class371.field_57[var7].method_373(this, var5.field_1191, var5.field_414, var5.field_1573, this.field_413);
            }
         }
      }

      return this.field_1430.size() != 0;
   }

   public void method_358(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();

      for (int var6 = 0; var6 < 1000; var6++) {
         int var7 = var1 + this.field_413.nextInt(var4) - this.field_413.nextInt(var4);
         int var8 = var2 + this.field_413.nextInt(var4) - this.field_413.nextInt(var4);
         int var9 = var3 + this.field_413.nextInt(var4) - this.field_413.nextInt(var4);
         int var10 = this.method_813(var7, var8, var9);
         if (var10 > 0) {
            Class371.field_57[var10].method_496(this, var7, var8, var9, var5);
         }
      }
   }

   public List<Class252> method_362(Class252 var1, Class94 var2) {
      this.field_1303.clear();
      int var3 = Class380.method_502((var2.field_1397 - 2.0) / 16.0);
      int var4 = Class380.method_502((var2.field_346 + 2.0) / 16.0);
      int var5 = Class380.method_502((var2.field_601 - 2.0) / 16.0);
      int var6 = Class380.method_502((var2.field_854 + 2.0) / 16.0);

      for (int var7 = var3; var7 <= var4; var7++) {
         for (int var8 = var5; var8 <= var6; var8++) {
            if (this.method_570(var7, var8)) {
               this.method_695(var7, var8).method_678(var1, var2, this.field_1303);
            }
         }
      }

      return this.field_1303;
   }

   public <R extends Class252> List<R> method_494(Class<R> var1, Class94 var2) {
      int var3 = Class380.method_502((var2.field_1397 - 2.0) / 16.0);
      int var4 = Class380.method_502((var2.field_346 + 2.0) / 16.0);
      int var5 = Class380.method_502((var2.field_601 - 2.0) / 16.0);
      int var6 = Class380.method_502((var2.field_854 + 2.0) / 16.0);
      ArrayList var7 = new ArrayList();

      for (int var8 = var3; var8 <= var4; var8++) {
         for (int var9 = var5; var9 <= var6; var9++) {
            if (this.method_570(var8, var9)) {
               this.method_695(var8, var9).method_899(var1, var2, var7);
            }
         }
      }

      return var7;
   }

   public List<Class252> method_459() {
      return this.field_1564;
   }

   public void method_694(int var1, int var2, int var3, Class66 var4) {
      if (this.method_833(var1, var2, var3)) {
         this.method_389(var1, var3).method_745();
      }

      for (int var5 = 0; var5 < this.field_1139.size(); var5++) {
         this.field_1139.get(var5).method_628(var1, var2, var3, var4);
      }
   }

   public int method_630(Class<? extends Class252> var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.field_1564.size(); var3++) {
         Class252 var4 = this.field_1564.get(var3);
         if (var1.isAssignableFrom(var4.getClass())) {
            var2++;
         }
      }

      return var2;
   }

   public void method_188(List<Class252> var1) {
      this.field_1564.addAll(var1);

      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.method_378((Class252)var1.get(var2));
      }
   }

   public void method_660(List<Class252> var1) {
      this.field_561.addAll(var1);
   }

   public void method_262() {
      while (this.field_129.method_756()) {
      }
   }

   public boolean method_361(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.method_813(var2, var3, var4);
      Class371 var7 = Class371.field_57[var6];
      Class371 var8 = Class371.field_57[var1];
      Class94 var9 = var8.method_872(this, var2, var3, var4);
      if (var5) {
         var9 = null;
      }

      return var9 != null && !this.method_31(var9)
         ? false
         : (
            var7 != Class371.field_1051
                  && var7 != Class371.field_535
                  && var7 != Class371.field_1103
                  && var7 != Class371.field_955
                  && var7 != Class371.field_1424
                  && var7 != Class371.field_1595
               ? var1 > 0 && var7 == null && var8.method_769(this, var2, var3, var4)
               : true
         );
   }

   public Class16 method_758(Class252 var1, Class252 var2, float var3) {
      int var4 = Class380.method_502(var1.field_1324);
      int var5 = Class380.method_502(var1.field_632);
      int var6 = Class380.method_502(var1.field_1321);
      int var7 = (int)(var3 + 16.0F);
      int var8 = var4 - var7;
      int var9 = var5 - var7;
      int var10 = var6 - var7;
      int var11 = var4 + var7;
      int var12 = var5 + var7;
      int var13 = var6 + var7;
      Class2 var14 = new Class2(this, var8, var9, var10, var11, var12, var13);
      return new Class128(var14).method_903(var1, var2, var3);
   }

   public Class16 method_472(Class252 var1, int var2, int var3, int var4, float var5) {
      int var6 = Class380.method_502(var1.field_1324);
      int var7 = Class380.method_502(var1.field_632);
      int var8 = Class380.method_502(var1.field_1321);
      int var9 = (int)(var5 + 8.0F);
      int var10 = var6 - var9;
      int var11 = var7 - var9;
      int var12 = var8 - var9;
      int var13 = var6 + var9;
      int var14 = var7 + var9;
      int var15 = var8 + var9;
      Class2 var16 = new Class2(this, var10, var11, var12, var13, var14, var15);
      return new Class128(var16).method_81(var1, var2, var3, var4, var5);
   }

   public boolean method_1032(int var1, int var2, int var3, int var4) {
      int var5 = this.method_813(var1, var2, var3);
      return var5 == 0 ? false : Class371.field_57[var5].method_391(this, var1, var2, var3, var4);
   }

   public boolean method_248(int var1, int var2, int var3) {
      return this.method_1032(var1, var2 - 1, var3, 0)
         ? true
         : (
            this.method_1032(var1, var2 + 1, var3, 1)
               ? true
               : (
                  this.method_1032(var1, var2, var3 - 1, 2)
                     ? true
                     : (
                        this.method_1032(var1, var2, var3 + 1, 3)
                           ? true
                           : (this.method_1032(var1 - 1, var2, var3, 4) ? true : this.method_1032(var1 + 1, var2, var3, 5))
                     )
               )
         );
   }

   public boolean method_594(int var1, int var2, int var3, int var4) {
      if (this.method_604(var1, var2, var3)) {
         return this.method_248(var1, var2, var3);
      }

      int var5 = this.method_813(var1, var2, var3);
      return var5 == 0 ? false : Class371.field_57[var5].method_743(this, var1, var2, var3, var4);
   }

   public boolean method_249(int var1, int var2, int var3) {
      return this.method_594(var1, var2 - 1, var3, 0)
         ? true
         : (
            this.method_594(var1, var2 + 1, var3, 1)
               ? true
               : (
                  this.method_594(var1, var2, var3 - 1, 2)
                     ? true
                     : (
                        this.method_594(var1, var2, var3 + 1, 3)
                           ? true
                           : (this.method_594(var1 - 1, var2, var3, 4) ? true : this.method_594(var1 + 1, var2, var3, 5))
                     )
               )
         );
   }

   public Class41 method_176(Class252 var1, double var2) {
      return this.method_818(var1.field_1324, var1.field_632, var1.field_1321, var2);
   }

   public Class41 method_818(double var1, double var3, double var5, double var7) {
      double var9 = -1.0;
      Class41 var11 = null;

      for (int var12 = 0; var12 < this.field_469.size(); var12++) {
         Class41 var13 = this.field_469.get(var12);
         double var14 = var13.method_124(var1, var3, var5);
         if ((var7 < 0.0 || var14 < var7 * var7) && (var9 == -1.0 || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public byte[] method_376(int var1, int var2, int var3, int var4, int var5, int var6) {
      byte[] var7 = new byte[var4 * var5 * var6 * 5 / 2];
      int var8 = var1 >> 4;
      int var9 = var3 >> 4;
      int var10 = var1 + var4 - 1 >> 4;
      int var11 = var3 + var6 - 1 >> 4;
      int var12 = 0;
      int var13 = var2;
      int var14 = var2 + var5;
      if (var2 < 0) {
         var13 = 0;
      }

      if (var14 > 128) {
         var14 = 128;
      }

      for (int var15 = var8; var15 <= var10; var15++) {
         int var16 = var1 - var15 * 16;
         int var17 = var1 + var4 - var15 * 16;
         if (var16 < 0) {
            var16 = 0;
         }

         if (var17 > 16) {
            var17 = 16;
         }

         for (int var18 = var9; var18 <= var11; var18++) {
            int var19 = var3 - var18 * 16;
            int var20 = var3 + var6 - var18 * 16;
            if (var19 < 0) {
               var19 = 0;
            }

            if (var20 > 16) {
               var20 = 16;
            }

            var12 = this.method_695(var15, var18).method_882(var7, var16, var13, var19, var17, var14, var20, var12);
            this.method_674(var15 * 16 + var16, var13, var18 * 16 + var19, var15 * 16 + var17, var14, var18 * 16 + var20);
         }
      }

      return var7;
   }

   public void method_927() {
   }

   public void method_73() {
      try {
         File var1 = new File(this.field_194, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if (var2.readLong() != this.field_296) {
               throw new RuntimeException365("The save is being accessed from another location, aborting");
            }
         } finally {
            var2.close();
         }
      } catch (IOException var7) {
         throw new RuntimeException365("Failed to check session lock, aborting");
      }
   }

   public void method_382(long var1) {
      this.field_301 = var1;
   }

   public void method_224(Class252 var1) {
      int var2 = Class380.method_502(var1.field_1324 / 16.0);
      int var3 = Class380.method_502(var1.field_1321 / 16.0);
      byte var4 = 2;

      for (int var5 = var2 - var4; var5 <= var2 + var4; var5++) {
         for (int var6 = var3 - var4; var6 <= var3 + var4; var6++) {
            this.method_695(var5, var6);
         }
      }

      if (!this.field_1564.contains(var1)) {
         System.out.println("REINSERTING PLAYER! " + ((Class41)var1).field_1477);
         this.field_1564.add(var1);
      }
   }

   static {
      float var0 = 0.05F;

      for (int var1 = 0; var1 <= 15; var1++) {
         float var2 = 1.0F - var1 / 15.0F;
         field_375[var1] = (1.0F - var2) / (var2 * 3.0F + 1.0F) * (1.0F - var0) + var0;
      }
   }
}
