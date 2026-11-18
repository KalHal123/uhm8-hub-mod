package ext;

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
import net.minecraft.client.Minecraft;

public class Class454 implements Interface698 {
   private Minecraft field_401;
   private List<Class647> field_1284;
   public List<Class359> field_582;
   private List<Class359> field_1172;
   private Set<Comparable726> field_3024;
   private Set<Comparable726> field_1245;
   public List<Class186> field_1982;
   public long field_2075;
   public boolean field_743;
   public boolean field_2807;
   public long field_949;
   public long field_2136;
   public long field_439;
   public long field_1537;
   public int field_2704;
   protected int field_2636;
   protected int field_2686;
   public boolean field_2771;
   public static float[] field_1340 = new float[16];
   private final long field_51;
   protected int field_1379;
   public List<Class354> field_70;
   public int field_1535;
   public Object field_2406;
   public Random field_2150;
   public int field_18;
   public int field_934;
   public int field_1361;
   public boolean field_1419;
   protected List<Interface134> field_1339;
   public Interface752 field_2450;
   public File field_2724;
   public long field_482;
   private Class686 field_1858;
   public long field_1711;
   public final String field_2737;
   public boolean field_2718;
   private ArrayList<Class630> field_21;
   private Set<Class346> field_2099;
   private int field_2365;
   private List<Class359> field_3075;
   public boolean field_2994;
   protected Interface127 field_453;
   public boolean field_1012 = true;
   public List<Class694> field_1986 = new ArrayList<>();
   public boolean field_381 = false;
   int field_2121 = 0;

   public long method_1377() {
      return this.field_2075 / 23000L;
   }

   public static Class686 method_763(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if (!var3.exists()) {
         return null;
      }

      File var4 = new File(var3, "level.dat");
      if (var4.exists()) {
         try {
            Class686 var5 = Class679.method_157(new FileInputStream(var4));
            return var5.method_508("Data");
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      return null;
   }

   public static void method_1650(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if (var3.exists()) {
         method_1755(var3.listFiles());
         var3.delete();
      }
   }

   private static void method_1755(File[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1].isDirectory()) {
            method_1755(var0[var1].listFiles());
         }

         var0[var1].delete();
      }
   }

   public boolean method_1131() {
      return true;
   }

   public Class454(File var1, String var2) {
      this(var1, var2, new Random().nextLong());
   }

   public Class454(String var1) {
      this.field_1284 = new ArrayList<>();
      this.field_582 = new ArrayList<>();
      this.field_1172 = new ArrayList<>();
      this.field_3024 = Collections.synchronizedSet(new TreeSet<>());
      this.field_1245 = Collections.synchronizedSet(new HashSet<>());
      this.field_1982 = new ArrayList<>();
      this.field_2075 = 0L;
      this.field_743 = false;
      this.field_2807 = false;
      this.field_949 = Class119.field_1519.field_1421.field_602.field_1774.field_2947;
      this.field_2136 = Class119.field_1519.field_1421.field_602.field_1774.field_1330;
      this.field_439 = 12638463L;
      this.field_1537 = 16777215L;
      this.field_2704 = 0;
      this.field_2636 = new Random().nextInt();
      this.field_2686 = 1013904223;
      this.field_2771 = false;
      this.field_51 = System.currentTimeMillis();
      this.field_1379 = 40;
      this.field_70 = new ArrayList<>();
      this.field_2150 = new Random();
      this.field_453 = new Class68();
      this.field_1419 = false;
      this.field_1339 = new ArrayList<>();
      this.field_482 = 0L;
      this.field_1711 = 0L;
      this.field_21 = new ArrayList<>();
      this.field_2099 = new HashSet<>();
      this.field_2365 = this.field_2150.nextInt(12000);
      this.field_3075 = new ArrayList<>();
      this.field_2994 = false;
      this.field_2737 = var1;
      this.field_2450 = this.method_1226(this.field_2724);
      this.method_1605();
   }

   public Class454(File var1, String var2, long var3) {
      this.field_1284 = new ArrayList<>();
      this.field_582 = new ArrayList<>();
      this.field_1172 = new ArrayList<>();
      this.field_3024 = Collections.synchronizedSet(new TreeSet<>());
      this.field_1245 = Collections.synchronizedSet(new HashSet<>());
      this.field_1982 = new ArrayList<>();
      this.field_2075 = 0L;
      this.field_743 = false;
      this.field_2807 = false;
      this.field_949 = Class119.field_1519.field_1421.field_602.field_1774.field_2947;
      this.field_2136 = Class119.field_1519.field_1421.field_602.field_1774.field_1330;
      this.field_439 = 12638463L;
      this.field_1537 = 16777215L;
      this.field_2704 = 0;
      this.field_2636 = new Random().nextInt();
      this.field_2686 = 1013904223;
      this.field_2771 = false;
      this.field_51 = System.currentTimeMillis();
      this.field_1379 = 40;
      this.field_70 = new ArrayList<>();
      this.field_2150 = new Random();
      this.field_453 = new Class68();
      this.field_1419 = false;
      this.field_1339 = new ArrayList<>();
      this.field_482 = 0L;
      this.field_1711 = 0L;
      this.field_21 = new ArrayList<>();
      this.field_2099 = new HashSet<>();
      this.field_2365 = this.field_2150.nextInt(12000);
      this.field_3075 = new ArrayList<>();
      this.field_2994 = false;
      this.field_2737 = var2;
      var1.mkdirs();
      this.field_2724 = new File(var1, var2);
      this.field_2724.mkdirs();

      try {
         File var5 = new File(this.field_2724, "session.lock");
         DataOutputStream var6 = new DataOutputStream(new FileOutputStream(var5));

         try {
            var6.writeLong(this.field_51);
         } finally {
            var6.close();
         }
      } catch (IOException var16) {
         throw new RuntimeException("Failed to check session lock, aborting");
      }

      File var18 = new File(this.field_2724, "level.dat");
      this.field_1419 = !var18.exists();
      if (var18.exists()) {
         try {
            Class686 var19 = Class679.method_157(new FileInputStream(var18));
            Class686 var7 = var19.method_508("Data");
            this.field_482 = var7.method_328("RandomSeed");
            this.field_18 = var7.method_1747("SpawnX");
            this.field_934 = var7.method_1747("SpawnY");
            this.field_1361 = var7.method_1747("SpawnZ");
            this.field_2075 = var7.method_328("Time");
            this.field_1711 = var7.method_328("SizeOnDisk");
            this.field_743 = var7.method_1336("SnowCovered");
            this.field_2807 = var7.method_1336("SandCovered");
            this.field_1012 = var7.method_1336("ExclusivelyFrail");
            if (var7.method_1838("PortalZones")) {
               Class686 var8 = var7.method_508("PortalZones");

               for (Class16 var10 : var8.method_1442()) {
                  if (var10.method_758() == 10) {
                     Class686 var11 = (Class686)var10;
                     this.field_1986.add(Class694.method_1235(var11, var10.method_352()));
                  }
               }
            }

            if (this.method_1131() && var7.method_1838("Player")) {
               this.field_1858 = var7.method_508("Player");
            }
         } catch (Exception var17) {
            var17.printStackTrace();
         }
      } else {
         this.field_2807 = Class119.method_696(54) ? false : this.field_2150.nextInt(4) == 1;
      }

      boolean var20 = false;
      if (this.field_482 == 0L) {
         this.field_482 = var3;
         var20 = true;
      }

      this.field_453 = new Class569(new Random(this.field_482)).method_1898();
      this.field_2450 = this.method_1226(this.field_2724);
      if (var20) {
         this.field_2718 = true;
         this.field_18 = 0;
         this.field_934 = 64;

         for (this.field_1361 = 0;
            !this.method_1706(this.field_18, this.field_1361);
            this.field_1361 = this.field_1361 + (this.field_2150.nextInt(64) - this.field_2150.nextInt(64))
         ) {
            this.field_18 = this.field_18 + (this.field_2150.nextInt(64) - this.field_2150.nextInt(64));
         }

         this.field_2718 = false;
      }

      this.method_1605();
   }

   protected Interface752 method_1226(File var1) {
      return new Class421(this, new Class660(var1, true), new Class405(this, this.field_482));
   }

   public void method_1657() {
      if (this.field_934 <= 0) {
         this.field_934 = 64;
      }

      while (this.method_1391(this.field_18, this.field_1361) == 0) {
         this.field_18 = this.field_18 + (this.field_2150.nextInt(8) - this.field_2150.nextInt(8));
         this.field_1361 = this.field_1361 + (this.field_2150.nextInt(8) - this.field_2150.nextInt(8));
      }
   }

   protected boolean method_1706(int var1, int var2) {
      int var3 = this.method_1391(var1, var2);
      return var3 == Class108.field_2692.field_2151;
   }

   private int method_1391(int var1, int var2) {
      int var3 = 63;

      while (this.method_197(var1, var3 + 1, var2) != 0) {
         var3++;
      }

      return this.method_197(var1, var3, var2);
   }

   public void method_982(Class354 var1) {
      try {
         if (this.field_1858 != null) {
            var1.method_783(this.field_1858);
            this.field_1858 = null;
         }

         this.method_1447(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void method_345(boolean var1, Interface608 var2) {
      if (this.field_2450.method_1354()) {
         if (var2 != null) {
            var2.method_128("Saving level");
         }

         this.method_912();
         if (var2 != null) {
            var2.method_825("Saving chunks");
         }

         this.field_2450.method_762(var1, var2);
      }
   }

   private void method_912() {
      this.method_1863();
      Class686 var1 = new Class686();
      var1.method_1647("RandomSeed", this.field_482);
      var1.method_1310("SpawnX", this.field_18);
      var1.method_1310("SpawnY", this.field_934);
      var1.method_1310("SpawnZ", this.field_1361);
      var1.method_1647("Time", this.field_2075);
      var1.method_1647("SizeOnDisk", this.field_1711);
      var1.method_698("SnowCovered", this.field_743);
      var1.method_698("SandCovered", this.field_2807);
      var1.method_1647("LastPlayed", System.currentTimeMillis());
      var1.method_1647("Milestone", this.method_1377());
      var1.method_698("ExclusivelyFrail", this.field_1012);
      Class354 var2 = null;
      if (this.field_70.size() > 0) {
         var2 = this.field_70.get(0);
      }

      File var3 = new File(this.field_2724, "excl_frail");
      if (this.field_1012 && !var3.exists()) {
         try {
            var3.createNewFile();
         } catch (IOException var10) {
            var10.printStackTrace();
         }
      } else if (!this.field_1012 && var3.exists()) {
         Class597.method_883("Deleting excl. frail file");
         var3.delete();
      }

      if (var2 != null) {
         Class686 var4 = new Class686();
         var2.method_374(var4);
         if (this.method_1131()) {
            var1.method_257("Player", var4);
         }

         if (this.field_1986 != null && this.field_1986.size() > 0) {
            Class686 var5 = new Class686();
            var1.method_257("PortalZones", var5);
            int var6 = 0;

            for (Class694 var8 : this.field_1986) {
               var5.method_257("pzone" + var6, var8.method_389());
               var6++;
            }
         }
      }

      Class686 var11 = new Class686();
      var11.method_936("Data", var1);

      try {
         File var12 = new File(this.field_2724, "level.dat_new");
         File var13 = new File(this.field_2724, "level.dat_old");
         File var14 = new File(this.field_2724, "level.dat");
         Class679.method_1635(var11, new FileOutputStream(var12));
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

   public boolean method_1246(int var1) {
      if (!this.field_2450.method_1354()) {
         return true;
      }

      if (var1 == 0) {
         this.method_912();
      }

      return this.field_2450.method_762(false, (Interface608)null);
   }

   @Override
   public int method_197(int var1, int var2, int var3) {
      return var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000
         ? 0
         : (var2 < 0 ? 0 : (var2 >= 128 ? 0 : this.method_1474(var1 >> 4, var3 >> 4).method_1323(var1 & 15, var2, var3 & 15)));
   }

   public boolean method_1372(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 128 ? this.method_1817(var1 >> 4, var3 >> 4) : false;
   }

   public boolean method_1846(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 128) {
         var1 >>= 4;
         var2 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var5 >>= 4;
         var6 >>= 4;

         for (int var7 = var1; var7 <= var4; var7++) {
            for (int var8 = var3; var8 <= var6; var8++) {
               if (!this.method_1817(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean method_1817(int var1, int var2) {
      return this.field_2450.method_972(var1, var2);
   }

   public Class741 method_964(int var1, int var2) {
      return this.method_1474(var1 >> 4, var2 >> 4);
   }

   public Class741 method_1474(int var1, int var2) {
      return this.field_2450.method_1337(var1, var2);
   }

   public boolean method_307(int var1, int var2, int var3, int var4, int var5) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      Class741 var6 = this.method_1474(var1 >> 4, var3 >> 4);
      return var6.method_1063(var1 & 15, var2, var3 & 15, var4, var5);
   }

   public boolean method_470(int var1, int var2, int var3, int var4) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      Class741 var5 = this.method_1474(var1 >> 4, var3 >> 4);
      return var5.method_865(var1 & 15, var2, var3 & 15, var4);
   }

   @Override
   public Class160 method_1286(int var1, int var2, int var3) {
      int var4 = this.method_197(var1, var2, var3);
      return var4 == 0 ? Class160.field_1255 : Class108.field_1221[var4].field_1854;
   }

   @Override
   public int method_1110(int var1, int var2, int var3) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return 0;
      }

      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      Class741 var4 = this.method_1474(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      return var4.method_954(var1, var2, var3);
   }

   public void method_518(int var1, int var2, int var3, int var4) {
      this.method_1342(var1, var2, var3, var4);
   }

   public boolean method_1342(int var1, int var2, int var3, int var4) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      Class741 var5 = this.method_1474(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      var5.method_339(var1, var2, var3, var4);
      return true;
   }

   public boolean method_1481(int var1, int var2, int var3, int var4) {
      if (this.method_470(var1, var2, var3, var4)) {
         this.method_1890(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean method_1193(int var1, int var2, int var3, int var4, int var5) {
      if (this.method_307(var1, var2, var3, var4, var5)) {
         this.method_1890(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void method_892(int var1, int var2, int var3) {
      if (var2 >= 0) {
         for (int var4 = 0; var4 < this.field_1339.size(); var4++) {
            this.field_1339.get(var4).method_158(var1, var2, var3);
         }
      }
   }

   protected void method_1890(int var1, int var2, int var3, int var4) {
      this.method_892(var1, var2, var3);
      this.method_558(var1, var2, var3, var4);
   }

   public void method_635(int var1, int var2, int var3, int var4) {
      if (var3 > var4) {
         int var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      this.method_1678(var1, var3, var2, var1, var4, var2);
   }

   public void method_1678(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = 0; var7 < this.field_1339.size(); var7++) {
         this.field_1339.get(var7).method_1703(var1, var2, var3, var4, var5, var6);
      }
   }

   public void method_558(int var1, int var2, int var3, int var4) {
      this.method_1042(var1 - 1, var2, var3, var4);
      this.method_1042(var1 + 1, var2, var3, var4);
      this.method_1042(var1, var2 - 1, var3, var4);
      this.method_1042(var1, var2 + 1, var3, var4);
      this.method_1042(var1, var2, var3 - 1, var4);
      this.method_1042(var1, var2, var3 + 1, var4);
   }

   private void method_1042(int var1, int var2, int var3, int var4) {
      if (!this.field_2771 && !this.field_2994) {
         Class108 var5 = Class108.field_1221[this.method_197(var1, var2, var3)];
         if (var5 != null) {
            var5.method_1464(this, var1, var2, var3, var4);
         }
      }
   }

   public boolean method_1733(int var1, int var2, int var3) {
      return this.method_1474(var1 >> 4, var3 >> 4).method_1098(var1 & 15, var2, var3 & 15);
   }

   public int method_1676(int var1, int var2, int var3) {
      return this.method_184(var1, var2, var3, true);
   }

   public int method_535(int var1, int var2, int var3, boolean var4) {
      return this.method_569(var1, var2, var3, true, var4);
   }

   public int method_184(int var1, int var2, int var3, boolean var4) {
      return this.method_569(var1, var2, var3, var4, false);
   }

   public int method_569(int var1, int var2, int var3, boolean var4, boolean var5) {
      int var6 = this.field_2704;
      if (var5 && Class119.field_1519.field_1754.field_2733 == 5) {
         var6 = Math.max(12, var6);
      }

      if (var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if (var4) {
            int var7 = this.method_197(var1, var2, var3);
            if (var7 == Class108.field_2252.field_2151 || var7 == Class108.field_2496.field_2151) {
               int var16 = this.method_184(var1, var2 + 1, var3, false);
               int var9 = this.method_184(var1 + 1, var2, var3, false);
               int var10 = this.method_184(var1 - 1, var2, var3, false);
               int var11 = this.method_184(var1, var2, var3 + 1, false);
               int var12 = this.method_184(var1, var2, var3 - 1, false);
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
            Class741 var8 = this.method_1474(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var8.method_140(var1, var2, var3, var6);
         }
      } else {
         return 15;
      }
   }

   public boolean method_1624(int var1, int var2, int var3) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return true;
      }

      if (!this.method_1817(var1 >> 4, var3 >> 4)) {
         return false;
      }

      Class741 var4 = this.method_1474(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      return var4.method_1098(var1, var2, var3);
   }

   public int method_718(int var1, int var2) {
      if (var1 >= -32000000 && var2 >= -32000000 && var1 < 32000000 && var2 <= 32000000) {
         if (!this.method_1817(var1 >> 4, var2 >> 4)) {
            return 0;
         }

         Class741 var3 = this.method_1474(var1 >> 4, var2 >> 4);
         return var3.method_1274(var1 & 15, var2 & 15);
      } else {
         return 0;
      }
   }

   public void method_589(Enum621 var1, int var2, int var3, int var4, int var5) {
      if (this.method_1372(var2, var3, var4)) {
         if (var1 == Enum621.field_1792) {
            if (this.method_1624(var2, var3, var4)) {
               var5 = 15;
            }
         } else if (var1 == Enum621.field_2016) {
            int var6 = this.method_197(var2, var3, var4);
            if (Class108.field_2146[var6] > var5) {
               var5 = Class108.field_2146[var6];
            }
         }

         if (this.method_1763(var1, var2, var3, var4) != var5) {
            this.method_1929(var1, var2, var3, var4, var2, var3, var4);
         }
      }
   }

   public int method_1763(Enum621 var1, int var2, int var3, int var4) {
      if (var3 >= 0 && var3 < 128 && var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if (!this.method_1817(var5, var6)) {
            return 0;
         }

         Class741 var7 = this.method_1474(var5, var6);

         try {
            return var7.method_180(var1, var2 & 15, var3, var4 & 15);
         } catch (StackOverflowError var9) {
            return 0;
         }
      } else {
         return var1.field_1274;
      }
   }

   public void method_1777(Enum621 var1, int var2, int var3, int var4, int var5) {
      if (var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000 && var3 >= 0 && var3 < 128 && this.method_1817(var2 >> 4, var4 >> 4)) {
         Class741 var6 = this.method_1474(var2 >> 4, var4 >> 4);
         var6.method_130(var1, var2 & 15, var3, var4 & 15, var5);

         for (int var7 = 0; var7 < this.field_1339.size(); var7++) {
            this.field_1339.get(var7).method_158(var2, var3, var4);
         }
      }
   }

   @Override
   public float method_1394(int var1, int var2, int var3) {
      return field_1340[this.method_535(var1, var2, var3, true)];
   }

   @Override
   public float method_1154(int var1, int var2, int var3) {
      return field_1340[this.method_1676(var1, var2, var3)];
   }

   public boolean method_19() {
      return this.field_2704 < 4;
   }

   public Class366 method_818(Class214 var1, Class214 var2) {
      return this.method_1030(var1, var2, false);
   }

   public Class366 method_1030(Class214 var1, Class214 var2, boolean var3) {
      if (Double.isNaN(var1.field_882) || Double.isNaN(var1.field_1911) || Double.isNaN(var1.field_3045)) {
         return null;
      }

      if (!Double.isNaN(var2.field_882) && !Double.isNaN(var2.field_1911) && !Double.isNaN(var2.field_3045)) {
         int var4 = Class469.method_468(var2.field_882);
         int var5 = Class469.method_468(var2.field_1911);
         int var6 = Class469.method_468(var2.field_3045);
         int var7 = Class469.method_468(var1.field_882);
         int var8 = Class469.method_468(var1.field_1911);
         int var9 = Class469.method_468(var1.field_3045);
         int var10 = 20;

         while (var10-- >= 0) {
            if (Double.isNaN(var1.field_882) || Double.isNaN(var1.field_1911) || Double.isNaN(var1.field_3045)) {
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
            double var23 = var2.field_882 - var1.field_882;
            double var25 = var2.field_1911 - var1.field_1911;
            double var27 = var2.field_3045 - var1.field_3045;
            if (var11 != 999.0) {
               var17 = (var11 - var1.field_882) / var23;
            }

            if (var13 != 999.0) {
               var19 = (var13 - var1.field_1911) / var25;
            }

            if (var15 != 999.0) {
               var21 = (var15 - var1.field_3045) / var27;
            }

            byte var29;
            if (var17 < var19 && var17 < var21) {
               if (var4 > var7) {
                  var29 = 4;
               } else {
                  var29 = 5;
               }

               var1.field_882 = var11;
               var1.field_1911 += var25 * var17;
               var1.field_3045 += var27 * var17;
            } else if (var19 < var21) {
               if (var5 > var8) {
                  var29 = 0;
               } else {
                  var29 = 1;
               }

               var1.field_882 += var23 * var19;
               var1.field_1911 = var13;
               var1.field_3045 += var27 * var19;
            } else {
               if (var6 > var9) {
                  var29 = 2;
               } else {
                  var29 = 3;
               }

               var1.field_882 += var23 * var21;
               var1.field_1911 += var25 * var21;
               var1.field_3045 = var15;
            }

            Class214 var30 = Class214.method_701(var1.field_882, var1.field_1911, var1.field_3045);
            var7 = (int)(var30.field_882 = Class469.method_468(var1.field_882));
            if (var29 == 5) {
               var7--;
               var30.field_882++;
            }

            var8 = (int)(var30.field_1911 = Class469.method_468(var1.field_1911));
            if (var29 == 1) {
               var8--;
               var30.field_1911++;
            }

            var9 = (int)(var30.field_3045 = Class469.method_468(var1.field_3045));
            if (var29 == 3) {
               var9--;
               var30.field_3045++;
            }

            int var31 = this.method_197(var7, var8, var9);
            int var32 = this.method_1110(var7, var8, var9);
            Class108 var33 = Class108.field_1221[var31];
            if (var31 > 0 && var33.method_1380(var32, var3)) {
               Class366 var34 = var33.method_739(this, var7, var8, var9, var1, var2);
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

   public void method_1904(Class359 var1, String var2, float var3, float var4) {
      for (int var5 = 0; var5 < this.field_1339.size(); var5++) {
         this.field_1339.get(var5).method_1573(var2, var1.field_1417, var1.field_2654 - var1.field_838, var1.field_2013, var3, var4);
      }
   }

   public void method_861(double var1, double var3, double var5, String var7, float var8, float var9) {
      for (int var10 = 0; var10 < this.field_1339.size(); var10++) {
         this.field_1339.get(var10).method_1573(var7, var1, var3, var5, var8, var9);
      }
   }

   public void method_686(String var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.field_1339.size(); var5++) {
         this.field_1339.get(var5).method_1441(var1, var2, var3, var4);
      }
   }

   public void method_1347(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for (int var14 = 0; var14 < this.field_1339.size(); var14++) {
         this.field_1339.get(var14).method_1165(var1, var2, var4, var6, var8, var10, var12);
      }
   }

   public boolean method_1447(Class359 var1) {
      int var2 = Class469.method_468(var1.field_1417 / 16.0);
      int var3 = Class469.method_468(var1.field_2013 / 16.0);
      boolean var4 = false;
      if (var1 instanceof Class354 && !(var1 instanceof Class514)) {
         var4 = true;
      }

      if (!var4 && !this.method_1817(var2, var3)) {
         return false;
      }

      if (var1 instanceof Class354 && !(var1 instanceof Class514)) {
         this.field_70.add((Class354)var1);
         System.out.println("Player count: " + this.field_70.size());
      }

      this.method_1474(var2, var3).method_76(var1);
      this.field_582.add(var1);
      this.method_1503(var1);
      return true;
   }

   protected void method_1503(Class359 var1) {
      for (int var2 = 0; var2 < this.field_1339.size(); var2++) {
         this.field_1339.get(var2).method_709(var1);
      }
   }

   protected void method_1432(Class359 var1) {
      for (int var2 = 0; var2 < this.field_1339.size(); var2++) {
         this.field_1339.get(var2).method_13(var1);
      }
   }

   public void method_623(Class359 var1) {
      var1.method_1594();
      if (var1 instanceof Class354) {
         this.field_70.remove((Class354)var1);
         System.out.println("Player count: " + this.field_70.size());
      }
   }

   public void method_494(Interface134 var1) {
      this.field_1339.add(var1);
   }

   public void method_378(Interface134 var1) {
      this.field_1339.remove(var1);
   }

   public List<Class630> method_1325(Class359 var1, Class630 var2) {
      this.field_21.clear();
      int var3 = Class469.method_468(var2.field_2118);
      int var4 = Class469.method_468(var2.field_1702 + 1.0);
      int var5 = Class469.method_468(var2.field_946);
      int var6 = Class469.method_468(var2.field_3132 + 1.0);
      int var7 = Class469.method_468(var2.field_1714);
      int var8 = Class469.method_468(var2.field_858 + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var7; var10 < var8; var10++) {
            if (this.method_1372(var9, 64, var10)) {
               for (int var11 = var5 - 1; var11 < var6; var11++) {
                  Class108 var12 = Class108.field_1221[this.method_197(var9, var11, var10)];
                  if (var12 != null) {
                     var12.method_1368(this, var9, var11, var10, var2, this.field_21, var1);
                  }
               }
            }
         }
      }

      double var14 = 0.25;
      List var15 = this.method_1349(var1, var2.method_1384(var14, var14, var14));

      for (int var16 = 0; var16 < var15.size(); var16++) {
         Class630 var13 = ((Class359)var15.get(var16)).method_611();
         if (var13 != null && var13.method_1328(var2)) {
            this.field_21.add(var13);
         }

         var13 = var1.method_1056((Class359)var15.get(var16));
         if (var13 != null && var13.method_1328(var2)) {
            this.field_21.add(var13);
         }
      }

      return this.field_21;
   }

   public int method_235(float var1) {
      float var2 = this.method_420(var1);
      float var3 = 1.0F - (Class469.method_255(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      boolean var4 = Class310.field_1551 || this.method_1377() % 10L == 0L && this.method_1377() > 0L;
      return var4 ? 8 + (int)(var3 * 3.0F) : (int)(var3 * 11.0F);
   }

   public Class214 method_1631(float var1) {
      float var2 = this.method_420(var1);
      float var3 = Class469.method_255(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.field_949 >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.field_949 >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.field_949 & 255L) / 255.0F;
      float var7 = (float)(this.field_2136 >> 16 & 255L) / 255.0F;
      float var8 = (float)(this.field_2136 >> 8 & 255L) / 255.0F;
      float var9 = (float)(this.field_2136 & 255L) / 255.0F;
      float[] var10 = Class100.method_1493(var3, var4, var5, var6, var7, var8, var9);
      return Class214.method_701(var10[0], var10[1], var10[2]);
   }

   public float method_420(float var1) {
      int var2 = (int)(this.field_2075 % 24000L);
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

   public Class214 method_1716(float var1) {
      float var2 = this.method_420(var1);
      float var3 = Class469.method_255(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.field_1537 >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.field_1537 >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.field_1537 & 255L) / 255.0F;
      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      return Class214.method_701(var4, var5, var6);
   }

   public Class214 method_238(float var1) {
      float var2 = this.method_420(var1);
      float var3 = Class469.method_255(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.field_439 >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.field_439 >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.field_439 & 255L) / 255.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return Class214.method_701(var4, var5, var6);
   }

   public int method_451(int var1, int var2) {
      Class741 var3 = this.method_964(var1, var2);
      int var4 = 127;
      var1 &= 15;
      var2 &= 15;

      while (var4 > 0) {
         int var5 = var3.method_1323(var1, var4, var2);
         if (var5 != 0 && (Class108.field_1221[var5].field_1854.method_1552() || Class108.field_1221[var5].field_1854.method_743())) {
            return var4 + 1;
         }

         var4--;
      }

      return -1;
   }

   public int method_1879(int var1, int var2) {
      return this.method_964(var1, var2).method_1274(var1 & 15, var2 & 15);
   }

   public float method_1374(float var1) {
      float var2 = this.method_420(var1);
      float var3 = 1.0F - (Class469.method_255(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.75F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void method_600(int var1, int var2, int var3, int var4) {
      Comparable726 var5 = new Comparable726(var1, var2, var3, var4);
      byte var6 = 8;
      if (this.method_1846(var1 - var6, var2 - var6, var3 - var6, var1 + var6, var2 + var6, var3 + var6)) {
         if (var4 > 0) {
            var5.method_1791(Class108.field_1221[var4].method_1427() + this.field_2075);
         }

         this.field_381 = true;
         if (!this.field_1245.contains(var5)) {
            this.field_1245.add(var5);
            this.field_3024.add(var5);
         }

         this.field_381 = false;
      }
   }

   public void method_1812() {
      this.field_582.removeAll(this.field_1172);

      for (int var1 = 0; var1 < this.field_1172.size(); var1++) {
         Class359 var2 = this.field_1172.get(var1);
         int var3 = var2.field_3078;
         int var4 = var2.field_2552;
         if (var2.field_374 && this.method_1817(var3, var4)) {
            this.method_1474(var3, var4).method_1728(var2);
         }
      }

      for (int var6 = 0; var6 < this.field_1172.size(); var6++) {
         this.method_1432(this.field_1172.get(var6));
      }

      this.field_1172.clear();

      for (int var7 = 0; var7 < this.field_582.size(); var7++) {
         Class359 var9 = this.field_582.get(var7);
         if (var9.field_2322 != null) {
            if (!var9.field_2322.field_2642 && var9.field_2322.field_1512 == var9) {
               continue;
            }

            var9.field_2322.field_1512 = null;
            var9.field_2322 = null;
         }

         if (!var9.field_2642) {
            this.method_855(var9);
         }

         if (var9.field_2642) {
            int var10 = var9.field_3078;
            int var11 = var9.field_2552;
            if (var9.field_374 && this.method_1817(var10, var11)) {
               this.method_1474(var10, var11).method_1728(var9);
            }

            this.field_582.remove(var7--);
            this.method_1432(var9);
         }
      }

      for (int var8 = 0; var8 < this.field_1982.size(); var8++) {
         Class186 var5 = this.field_1982.get(var8);
         var5.method_1176();
      }
   }

   protected void method_855(Class359 var1) {
      int var2 = Class469.method_468(var1.field_1417);
      int var3 = Class469.method_468(var1.field_2013);
      byte var4 = 16;
      if (this.method_1846(var2 - var4, 0, var3 - var4, var2 + var4, 128, var3 + var4)) {
         var1.field_2173 = var1.field_1417;
         var1.field_2270 = var1.field_2654;
         var1.field_1907 = var1.field_2013;
         var1.field_2772 = var1.field_1661;
         var1.field_2984 = var1.field_2866;
         if (var1.field_2322 != null) {
            var1.method_85();
         } else {
            var1.method_46();
         }

         int var5 = Class469.method_468(var1.field_1417 / 16.0);
         int var6 = Class469.method_468(var1.field_2654 / 16.0);
         int var7 = Class469.method_468(var1.field_2013 / 16.0);
         if (!var1.field_374 || var1.field_3078 != var5 || var1.field_255 != var6 || var1.field_2552 != var7) {
            if (var1.field_374 && this.method_1817(var1.field_3078, var1.field_2552)) {
               this.method_1474(var1.field_3078, var1.field_2552).method_595(var1, var1.field_255);
            }

            if (this.method_1817(var5, var7)) {
               this.method_1474(var5, var7).method_76(var1);
            } else {
               var1.field_374 = false;
               System.out.println("Removing entity because it's not in a chunk!!");
               var1.method_1594();
            }
         }

         if (var1.field_1512 != null) {
            if (!var1.field_1512.field_2642 && var1.field_1512.field_2322 == var1) {
               this.method_855(var1.field_1512);
            } else {
               var1.field_1512.field_2322 = null;
               var1.field_1512 = null;
            }
         }

         if (Double.isNaN(var1.field_1417) || Double.isInfinite(var1.field_1417)) {
            var1.field_1417 = var1.field_2173;
         }

         if (Double.isNaN(var1.field_2654) || Double.isInfinite(var1.field_2654)) {
            var1.field_2654 = var1.field_2270;
         }

         if (Double.isNaN(var1.field_2013) || Double.isInfinite(var1.field_2013)) {
            var1.field_2013 = var1.field_1907;
         }

         if (Double.isNaN(var1.field_2866) || Double.isInfinite(var1.field_2866)) {
            var1.field_2866 = var1.field_2984;
         }

         if (Double.isNaN(var1.field_1661) || Double.isInfinite(var1.field_1661)) {
            var1.field_1661 = var1.field_2772;
         }
      }
   }

   public boolean method_56(Class630 var1) {
      List var2 = this.method_1349((Class359)null, var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         Class359 var4 = (Class359)var2.get(var3);
         if (!var4.field_2642 && var4.field_1968) {
            return false;
         }
      }

      return true;
   }

   public boolean method_1781(Class630 var1) {
      int var2 = Class469.method_468(var1.field_2118);
      int var3 = Class469.method_468(var1.field_1702 + 1.0);
      int var4 = Class469.method_468(var1.field_946);
      int var5 = Class469.method_468(var1.field_3132 + 1.0);
      int var6 = Class469.method_468(var1.field_1714);
      int var7 = Class469.method_468(var1.field_858 + 1.0);
      if (var1.field_2118 < 0.0) {
         var2--;
      }

      if (var1.field_946 < 0.0) {
         var4--;
      }

      if (var1.field_1714 < 0.0) {
         var6--;
      }

      for (int var8 = var2; var8 < var3; var8++) {
         for (int var9 = var4; var9 < var5; var9++) {
            for (int var10 = var6; var10 < var7; var10++) {
               Class108 var11 = Class108.field_1221[this.method_197(var8, var9, var10)];
               if (var11 != null && var11.field_1854.method_743()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean method_449(Class630 var1) {
      int var2 = Class469.method_468(var1.field_2118);
      int var3 = Class469.method_468(var1.field_1702 + 1.0);
      int var4 = Class469.method_468(var1.field_946);
      int var5 = Class469.method_468(var1.field_3132 + 1.0);
      int var6 = Class469.method_468(var1.field_1714);
      int var7 = Class469.method_468(var1.field_858 + 1.0);

      for (int var8 = var2; var8 < var3; var8++) {
         for (int var9 = var4; var9 < var5; var9++) {
            for (int var10 = var6; var10 < var7; var10++) {
               int var11 = this.method_197(var8, var9, var10);
               if (var11 == Class108.field_1781.field_2151 || var11 == Class108.field_1423.field_2151 || var11 == Class108.field_146.field_2151) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean method_461(Class630 var1, Class160 var2, Class359 var3) {
      int var4 = Class469.method_468(var1.field_2118);
      int var5 = Class469.method_468(var1.field_1702 + 1.0);
      int var6 = Class469.method_468(var1.field_946);
      int var7 = Class469.method_468(var1.field_3132 + 1.0);
      int var8 = Class469.method_468(var1.field_1714);
      int var9 = Class469.method_468(var1.field_858 + 1.0);
      boolean var10 = false;
      Class214 var11 = Class214.method_701(0.0, 0.0, 0.0);

      for (int var12 = var4; var12 < var5; var12++) {
         for (int var13 = var6; var13 < var7; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               Class108 var15 = Class108.field_1221[this.method_197(var12, var13, var14)];
               if (var15 != null && var15.field_1854 == var2) {
                  double var16 = var13 + 1 - Class722.method_74(this.method_1110(var12, var13, var14));
                  if (var7 >= var16) {
                     var10 = true;
                     var15.method_1332(this, var12, var13, var14, var3, var11);
                  }
               }
            }
         }
      }

      if (var11.method_1891() > 0.0) {
         var11 = var11.method_341();
         double var19 = 0.004;
         var3.field_2549 = var3.field_2549 + var11.field_882 * var19;
         var3.field_2501 = var3.field_2501 + var11.field_1911 * var19;
         var3.field_489 = var3.field_489 + var11.field_3045 * var19;
      }

      return var10;
   }

   public boolean method_1608(Class630 var1, Class160 var2) {
      int var3 = Class469.method_468(var1.field_2118);
      int var4 = Class469.method_468(var1.field_1702 + 1.0);
      int var5 = Class469.method_468(var1.field_946);
      int var6 = Class469.method_468(var1.field_3132 + 1.0);
      int var7 = Class469.method_468(var1.field_1714);
      int var8 = Class469.method_468(var1.field_858 + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var5; var10 < var6; var10++) {
            for (int var11 = var7; var11 < var8; var11++) {
               Class108 var12 = Class108.field_1221[this.method_197(var9, var10, var11)];
               if (var12 != null && var12.field_1854 == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean method_684(Class630 var1, Class160 var2) {
      int var3 = Class469.method_468(var1.field_2118);
      int var4 = Class469.method_468(var1.field_1702 + 1.0);
      int var5 = Class469.method_468(var1.field_946);
      int var6 = Class469.method_468(var1.field_3132 + 1.0);
      int var7 = Class469.method_468(var1.field_1714);
      int var8 = Class469.method_468(var1.field_858 + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var5; var10 < var6; var10++) {
            for (int var11 = var7; var11 < var8; var11++) {
               Class108 var12 = Class108.field_1221[this.method_197(var9, var10, var11)];
               if (var12 != null && var12.field_1854 == var2) {
                  int var13 = this.method_1110(var9, var10, var11);
                  double var14 = var10 + 1;
                  if (var13 < 8) {
                     var14 = var10 + 1 - var13 / 8.0;
                  }

                  if (var14 >= var1.field_946) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public void method_1927(Class359 var1, double var2, double var4, double var6, float var8) {
      new Class88().method_1707(this, var1, var2, var4, var6, var8);
   }

   public float method_1124(Class214 var1, Class630 var2) {
      double var3 = 1.0 / ((var2.field_1702 - var2.field_2118) * 2.0 + 1.0);
      double var5 = 1.0 / ((var2.field_3132 - var2.field_946) * 2.0 + 1.0);
      double var7 = 1.0 / ((var2.field_858 - var2.field_1714) * 2.0 + 1.0);
      int var9 = 0;
      int var10 = 0;

      for (float var11 = 0.0F; var11 <= 1.0F; var11 = (float)(var11 + var3)) {
         for (float var12 = 0.0F; var12 <= 1.0F; var12 = (float)(var12 + var5)) {
            for (float var13 = 0.0F; var13 <= 1.0F; var13 = (float)(var13 + var7)) {
               double var14 = var2.field_2118 + (var2.field_1702 - var2.field_2118) * var11;
               double var16 = var2.field_946 + (var2.field_3132 - var2.field_946) * var12;
               double var18 = var2.field_1714 + (var2.field_858 - var2.field_1714) * var13;
               if (this.method_818(Class214.method_701(var14, var16, var18), var1) == null) {
                  var9++;
               }

               var10++;
            }
         }
      }

      return (float)var9 / var10;
   }

   public void method_1852(int var1, int var2, int var3, int var4) {
      if (var4 == 0) {
         var2--;
      }

      if (var4 == 1) {
         var2++;
      }

      if (var4 == 2) {
         var3--;
      }

      if (var4 == 3) {
         var3++;
      }

      if (var4 == 4) {
         var1--;
      }

      if (var4 == 5) {
         var1++;
      }

      if (this.method_197(var1, var2, var3) == Class108.field_1781.field_2151) {
         this.method_861(var1 + 0.5F, var2 + 0.5F, var3 + 0.5F, "random.fizz", 0.5F, 2.6F + (this.field_2150.nextFloat() - this.field_2150.nextFloat()) * 0.8F);
         this.method_1481(var1, var2, var3, 0);
      }
   }

   public Class359 method_1673(Class<? extends Class354> var1) {
      return null;
   }

   public String method_1139() {
      return "All: " + this.field_582.size();
   }

   @Override
   public Class186 method_1303(int var1, int var2, int var3) {
      Class741 var4 = this.method_1474(var1 >> 4, var3 >> 4);
      return var4 != null ? var4.method_399(var1 & 15, var2, var3 & 15) : null;
   }

   public void method_1516(int var1, int var2, int var3, Class186 var4) {
      Class741 var5 = this.method_1474(var1 >> 4, var3 >> 4);
      if (var5 != null) {
         var5.method_187(var1 & 15, var2, var3 & 15, var4);
      }
   }

   public void method_995(int var1, int var2, int var3) {
      Class741 var4 = this.method_1474(var1 >> 4, var3 >> 4);
      if (var4 != null) {
         var4.method_1738(var1 & 15, var2, var3 & 15);
      }
   }

   @Override
   public boolean method_768(int var1, int var2, int var3) {
      Class108 var4 = Class108.field_1221[this.method_197(var1, var2, var3)];
      return var4 == null ? false : var4.method_214();
   }

   @Override
   public Interface127 method_1805() {
      return this.field_453;
   }

   public void method_1928(Interface608 var1) {
      this.method_345(true, var1);
   }

   public boolean method_1696() {
      int var1 = 1000;

      while (this.field_1284.size() > 0) {
         if (--var1 <= 0) {
            return true;
         }

         Class647 var2 = this.field_1284.remove(this.field_1284.size() - 1);
         if (var2 != null) {
            var2.method_543(this);
         }
      }

      return false;
   }

   public void method_1929(Enum621 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method_745(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void method_745(Enum621 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = (var5 + var2) / 2;
      int var10 = (var7 + var4) / 2;
      if (this.method_1372(var9, 64, var10)) {
         int var11 = this.field_1284.size();
         if (var8) {
            int var12 = 4;
            if (var12 > var11) {
               var12 = var11;
            }

            for (int var13 = 0; var13 < var12; var13++) {
               Class647 var14 = this.field_1284.get(this.field_1284.size() - var13 - 1);
               if (var14 != null && var14.field_127 == var1 && var14.method_1514(var2, var3, var4, var5, var6, var7)) {
                  return;
               }
            }
         }

         this.field_1284.add(new Class647(var1, var2, var3, var4, var5, var6, var7));
      }
   }

   public void method_1605() {
      int var1 = this.method_235(1.0F);
      if (var1 != this.field_2704) {
         this.field_2704 = var1;
      }
   }

   public void method_505() {
      this.field_2121++;
      if ((this.field_2121 & 5) == 5) {
         this.method_892(
            (int)Class119.field_1519.field_2787.field_1417, (int)Class119.field_1519.field_2787.field_2654 - 1, (int)Class119.field_1519.field_2787.field_2013
         );
         this.method_892(
            (int)Class119.field_1519.field_2787.field_1417, (int)Class119.field_1519.field_2787.field_2654 - 8, (int)Class119.field_1519.field_2787.field_2013
         );
         this.method_892(
            (int)Class119.field_1519.field_2787.field_1417 + 16,
            (int)Class119.field_1519.field_2787.field_2654 - 1,
            (int)Class119.field_1519.field_2787.field_2013
         );
         this.method_892(
            (int)Class119.field_1519.field_2787.field_1417 - 16,
            (int)Class119.field_1519.field_2787.field_2654 - 1,
            (int)Class119.field_1519.field_2787.field_2013
         );
         this.method_892(
            (int)Class119.field_1519.field_2787.field_1417,
            (int)Class119.field_1519.field_2787.field_2654 - 1,
            (int)Class119.field_1519.field_2787.field_2013 + 16
         );
         this.method_892(
            (int)Class119.field_1519.field_2787.field_1417,
            (int)Class119.field_1519.field_2787.field_2654 - 1,
            (int)Class119.field_1519.field_2787.field_2013 - 16
         );
      }
   }

   public void method_1832() {
      this.field_2450.method_1225();
      if (this.field_582.size() >= 4096) {
         System.out.println("Entity overflow!");
         this.field_582.retainAll(this.field_70);
      }

      int var1 = this.method_235(1.0F);
      if (var1 != this.field_2704) {
         this.field_2704 = var1;

         for (int var2 = 0; var2 < this.field_1339.size(); var2++) {
            this.field_1339.get(var2).method_1693();
         }
      }

      this.method_505();
      Class119.field_139.method_1533();
      boolean var3 = Class310.field_1551 || this.method_1377() % 10L == 0L && this.method_1377() > 0L;
      if (var3) {
         this.field_949 = 6976L;
      } else {
         this.field_949 = Class119.field_1519.field_1421.field_602.field_1774.field_2947;
      }

      if (this.field_2075 % 23000L == 0L) {
         System.out.println("Milestone " + this.field_2075 / 23000L + " reached");
      }

      if (this.field_1012 && Class119.field_1519.field_1754.field_2564 != 4) {
         this.field_1012 = false;
         System.out.println("World has been changed from Frail mode");
      }

      this.field_2075 = this.field_2075 + (Class119.method_696(199) ? 16 : 1);
      Class730.method_83(this);
      if (this.field_2075 % (Class119.field_1519.field_1754.field_2733 == 0 ? this.field_1379 * 10 : this.field_1379) == 0L) {
         this.method_345(false, (Interface608)null);
      }

      this.method_742(false);
      this.method_478();
   }

   protected void method_478() {
      this.field_2099.clear();

      for (int var5 = 0; var5 < this.field_70.size(); var5++) {
         Class354 var6 = this.field_70.get(var5);
         int var1 = Class469.method_468(var6.field_1417 / 16.0);
         int var2 = Class469.method_468(var6.field_2013 / 16.0);
         byte var7 = 9;

         for (int var3 = -var7; var3 <= var7; var3++) {
            for (int var4 = -var7; var4 <= var7; var4++) {
               this.field_2099.add(new Class346(var3 + var1, var4 + var2));
            }
         }
      }

      if (this.field_2365 > 0) {
         this.field_2365--;
      }

      for (Class346 var26 : this.field_2099) {
         int var12 = var26.field_2263 * 16;
         int var13 = var26.field_1976 * 16;
         Class741 var27 = this.method_1474(var26.field_2263, var26.field_1976);
         if (this.field_2365 == 0) {
            this.field_2636 = this.field_2636 * 3 + this.field_2686;
            int var14 = this.field_2636 >> 2;
            int var19 = var14 & 15;
            int var8 = var14 >> 8 & 15;
            int var9 = var14 >> 16 & 127;
            int var10 = var27.method_1323(var19, var9, var8);
            var19 += var12;
            var8 += var13;
            if (var10 == 0 && this.method_1676(var19, var9, var8) <= this.field_2150.nextInt(8) && this.method_1763(Enum621.field_1792, var19, var9, var8) <= 0
               )
             {
               Class354 var11 = this.method_230(var19 + 0.5, var9 + 0.5, var8 + 0.5, 8.0);
               if (var11 != null && var11.method_645(var19 + 0.5, var9 + 0.5, var8 + 0.5) > 4.0) {
                  this.method_861(var19 + 0.5, var9 + 0.5, var8 + 0.5, "ambient.cave.cave", 0.7F, 0.8F + this.field_2150.nextFloat() * 0.2F);
                  this.field_2365 = this.field_2150.nextInt(12000) + 6000;
               }
            }
         }

         if (this.field_743 && this.field_2150.nextInt(4) == 0) {
            this.field_2636 = this.field_2636 * 3 + this.field_2686;
            int var15 = this.field_2636 >> 2;
            int var21 = var15 & 15;
            int var29 = var15 >> 8 & 15;
            int var33 = this.method_451(var21 + var12, var29 + var13);
            if (var33 >= 0 && var33 < 128 && var27.method_180(Enum621.field_2016, var21, var33, var29) < 10) {
               int var37 = var27.method_1323(var21, var33 - 1, var29);
               if (var27.method_1323(var21, var33, var29) == 0 && Class108.field_1070.method_432(this, var21 + var12, var33, var29 + var13)) {
                  this.method_1481(var21 + var12, var33, var29 + var13, Class108.field_1070.field_2151);
               }

               if (var37 == Class108.field_2883.field_2151 && var27.method_954(var21, var33 - 1, var29) == 0) {
                  this.method_1481(var21 + var12, var33 - 1, var29 + var13, Class108.field_2441.field_2151);
               }
            }
         }

         if (this.field_2807 && this.field_2150.nextInt(4) == 1) {
            this.field_2636 = this.field_2636 * 3 + this.field_2686;
            int var16 = this.field_2636 >> 2;
            int var22 = var16 & 15;
            int var30 = var16 >> 8 & 15;
            int var34 = this.method_451(var22 + var12, var30 + var13);
            if (var34 >= 0 && var34 < 128 && var27.method_180(Enum621.field_2016, var22, var34, var30) < 10) {
               int var38 = var27.method_1323(var22, var34 - 1, var30);
               if (var38 == Class108.field_2883.field_2151 && var27.method_954(var22, var34 - 1, var30) == 0 && this.field_2150.nextInt(16) == 0) {
                  this.method_1481(var22 + var12, var34 - 1, var30 + var13, Class108.field_2132.field_2151);
               }
            }
         }

         if (Class119.field_1519.field_1310) {
            this.field_2636 = this.field_2636 * 3 + this.field_2686;
            int var17 = this.field_2636 >> 2;
            int var23 = var17 & 15;
            int var31 = var17 >> 8 & 15;
            int var35 = this.method_451(var23 + var12, var31 + var13);
            if (var35 >= 0 && var35 < 128 && var27.method_180(Enum621.field_2016, var23, var35, var31) < 8) {
               int var39 = var27.method_1323(var23, var35 - 1, var31);
               if (var27.method_1323(var23, var35, var31) == 0 && var35 < 66) {
                  this.method_1481(var23 + var12, var35, var31 + var13, Class108.field_2883.field_2151);
               }
            }
         }

         for (int var18 = 0; var18 < 80; var18++) {
            this.field_2636 = this.field_2636 * 3 + this.field_2686;
            int var24 = this.field_2636 >> 2;
            int var32 = var24 & 15;
            int var36 = var24 >> 8 & 15;
            int var40 = var24 >> 16 & 127;
            int var41 = var27.field_2711[var32 << 11 | var36 << 7 | var40] & 255;
            if (Class108.field_1933[var41]) {
               Class108.field_1221[var41].method_766(this, var32 + var12, var40, var36 + var13, this.field_2150);
            }
         }
      }
   }

   public boolean method_742(boolean var1) {
      int var2 = this.field_3024.size();
      int var3 = Math.min(var2, this.field_1245.size());
      if (Math.abs(var2 - this.field_1245.size()) > 3) {
         return true;
      }

      if (var2 > 1000) {
         var2 = 1000;
      }

      for (int var4 = 0; var4 < var3; var4++) {
         var3 = Math.min(var2, this.field_1245.size());
         Comparable726 var5;
         synchronized (this.field_3024) {
            var5 = this.field_3024.iterator().next();
         }

         if (!var1 && var5.field_1211 > this.field_2075) {
            break;
         }

         this.field_381 = true;
         this.field_3024.remove(var5);
         this.field_1245.remove(var5);
         this.field_381 = false;
         byte var9 = 8;
         if (this.method_1846(
            var5.field_2478 - var9, var5.field_2818 - var9, var5.field_3006 - var9, var5.field_2478 + var9, var5.field_2818 + var9, var5.field_3006 + var9
         )) {
            int var7 = this.method_197(var5.field_2478, var5.field_2818, var5.field_3006);
            if (var7 == var5.field_2760 && var7 > 0) {
               Class108.field_1221[var7].method_766(this, var5.field_2478, var5.field_2818, var5.field_3006, this.field_2150);
            }
         }
      }

      return this.field_3024.size() != 0;
   }

   public void method_682(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();

      for (int var6 = 0; var6 < 1000; var6++) {
         int var7 = var1 + this.field_2150.nextInt(var4) - this.field_2150.nextInt(var4);
         int var8 = var2 + this.field_2150.nextInt(var4) - this.field_2150.nextInt(var4);
         int var9 = var3 + this.field_2150.nextInt(var4) - this.field_2150.nextInt(var4);
         int var10 = this.method_197(var7, var8, var9);
         if (var10 > 0) {
            Class108.field_1221[var10].method_1500(this, var7, var8, var9, var5);
         }
      }
   }

   public List<Class359> method_1349(Class359 var1, Class630 var2) {
      this.field_3075.clear();
      int var3 = Class469.method_468((var2.field_2118 - 2.0) / 16.0);
      int var4 = Class469.method_468((var2.field_1702 + 2.0) / 16.0);
      int var5 = Class469.method_468((var2.field_1714 - 2.0) / 16.0);
      int var6 = Class469.method_468((var2.field_858 + 2.0) / 16.0);

      for (int var7 = var3; var7 <= var4; var7++) {
         for (int var8 = var5; var8 <= var6; var8++) {
            if (this.method_1817(var7, var8)) {
               this.method_1474(var7, var8).method_614(var1, var2, this.field_3075);
            }
         }
      }

      return this.field_3075;
   }

   public List<Class359> method_288(Class<? extends Class359> var1, Class630 var2) {
      int var3 = Class469.method_468((var2.field_2118 - 2.0) / 16.0);
      int var4 = Class469.method_468((var2.field_1702 + 2.0) / 16.0);
      int var5 = Class469.method_468((var2.field_1714 - 2.0) / 16.0);
      int var6 = Class469.method_468((var2.field_858 + 2.0) / 16.0);
      ArrayList var7 = new ArrayList();

      for (int var8 = var3; var8 <= var4; var8++) {
         for (int var9 = var5; var9 <= var6; var9++) {
            if (this.method_1817(var8, var9)) {
               this.method_1474(var8, var9).method_1169(var1, var2, var7);
            }
         }
      }

      return var7;
   }

   public List<Class359> method_471() {
      return this.field_582;
   }

   public void method_299(int var1, int var2, int var3, Class186 var4) {
      if (this.method_1372(var1, var2, var3)) {
         this.method_964(var1, var3).method_659();
      }

      for (int var5 = 0; var5 < this.field_1339.size(); var5++) {
         this.field_1339.get(var5).method_511(var1, var2, var3, var4);
      }
   }

   public int method_1694(Class<? extends Class359> var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.field_582.size(); var3++) {
         Class359 var4 = this.field_582.get(var3);
         if (var1.isAssignableFrom(var4.getClass())) {
            var2++;
         }
      }

      return var2;
   }

   public void method_807(List<Class359> var1) {
      this.field_582.addAll(var1);

      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.method_1503((Class359)var1.get(var2));
      }
   }

   public void method_1343(List<Class359> var1) {
      this.field_1172.addAll(var1);
   }

   public void method_96() {
      while (this.field_2450.method_1225()) {
      }
   }

   public boolean method_1892(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.method_197(var2, var3, var4);
      Class108 var7 = Class108.field_1221[var6];
      Class108 var8 = Class108.field_1221[var1];
      Class630 var9 = var8.method_720(this, var2, var3, var4);
      if (var5) {
         var9 = null;
      }

      return var9 != null && !this.method_56(var9)
         ? false
         : (
            var7 != Class108.field_536
                  && var7 != Class108.field_2883
                  && var7 != Class108.field_1423
                  && var7 != Class108.field_146
                  && var7 != Class108.field_1781
                  && var7 != Class108.field_1070
               ? var1 > 0 && var7 == null && var8.method_432(this, var2, var3, var4)
               : true
         );
   }

   public Class585 method_637(Class359 var1, Class359 var2, float var3) {
      int var4 = Class469.method_468(var1.field_1417);
      int var5 = Class469.method_468(var1.field_2654);
      int var6 = Class469.method_468(var1.field_2013);
      int var7 = (int)(var3 + 16.0F);
      int var8 = var4 - var7;
      int var9 = var5 - var7;
      int var10 = var6 - var7;
      int var11 = var4 + var7;
      int var12 = var5 + var7;
      int var13 = var6 + var7;
      Class370 var14 = new Class370(this, var8, var9, var10, var11, var12, var13);
      return new Class349(var14).method_1134(var1, var2, var3);
   }

   public Class585 method_486(Class359 var1, int var2, int var3, int var4, float var5) {
      int var6 = Class469.method_468(var1.field_1417);
      int var7 = Class469.method_468(var1.field_2654);
      int var8 = Class469.method_468(var1.field_2013);
      int var9 = (int)(var5 + 8.0F);
      int var10 = var6 - var9;
      int var11 = var7 - var9;
      int var12 = var8 - var9;
      int var13 = var6 + var9;
      int var14 = var7 + var9;
      int var15 = var8 + var9;
      Class370 var16 = new Class370(this, var10, var11, var12, var13, var14, var15);
      return new Class349(var16).method_921(var1, var2, var3, var4, var5);
   }

   public boolean method_78(int var1, int var2, int var3, int var4) {
      int var5 = this.method_197(var1, var2, var3);
      return var5 == 0 ? false : Class108.field_1221[var5].method_926(this, var1, var2, var3, var4);
   }

   public boolean method_321(int var1, int var2, int var3) {
      return this.method_78(var1, var2 - 1, var3, 0)
         ? true
         : (
            this.method_78(var1, var2 + 1, var3, 1)
               ? true
               : (
                  this.method_78(var1, var2, var3 - 1, 2)
                     ? true
                     : (
                        this.method_78(var1, var2, var3 + 1, 3)
                           ? true
                           : (this.method_78(var1 - 1, var2, var3, 4) ? true : this.method_78(var1 + 1, var2, var3, 5))
                     )
               )
         );
   }

   public boolean method_242(int var1, int var2, int var3, int var4) {
      if (this.method_768(var1, var2, var3)) {
         return this.method_321(var1, var2, var3);
      }

      int var5 = this.method_197(var1, var2, var3);
      return var5 == 0 ? false : Class108.field_1221[var5].method_16(this, var1, var2, var3, var4);
   }

   public boolean method_266(int var1, int var2, int var3) {
      return this.method_242(var1, var2 - 1, var3, 0)
         ? true
         : (
            this.method_242(var1, var2 + 1, var3, 1)
               ? true
               : (
                  this.method_242(var1, var2, var3 - 1, 2)
                     ? true
                     : (
                        this.method_242(var1, var2, var3 + 1, 3)
                           ? true
                           : (this.method_242(var1 - 1, var2, var3, 4) ? true : this.method_242(var1 + 1, var2, var3, 5))
                     )
               )
         );
   }

   public Class354 method_1288(Class359 var1, double var2) {
      return this.method_230(var1.field_1417, var1.field_2654, var1.field_2013, var2);
   }

   public Class354 method_230(double var1, double var3, double var5, double var7) {
      double var9 = -1.0;
      Class354 var11 = null;

      for (int var12 = 0; var12 < this.field_70.size(); var12++) {
         Class354 var13 = this.field_70.get(var12);
         double var14 = var13.method_645(var1, var3, var5);
         if ((var7 < 0.0 || var14 < var7 * var7) && (var9 == -1.0 || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public void method_359(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7) {
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

            var12 = this.method_1474(var15, var18).method_210(var7, var16, var13, var19, var17, var14, var20, var12);
            this.method_1678(var15 * 16 + var16, var13, var18 * 16 + var19, var15 * 16 + var17, var14, var18 * 16 + var20);
         }
      }
   }

   public void method_1133() {
   }

   public void method_1863() {
      try {
         File var1 = new File(this.field_2724, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if (var2.readLong() != this.field_51) {
               Class119.field_1519.method_515((Class454)null, "", false);
               Class119.field_1519.method_1290(new Class373());
               Class119.field_1519.method_1290(new Class384("", "This save is being accessed from another location."));
            }
         } finally {
            var2.close();
         }
      } catch (IOException var7) {
         Class119.field_1519.method_515((Class454)null, "", false);
         Class119.field_1519.method_1290(new Class373());
         Class119.field_1519.method_1290(new Class384("", "Failed to check session lock."));
      }
   }

   public void method_860(long var1) {
      this.field_2075 = var1;
   }

   public void method_666(Class359 var1) {
      int var2 = Class469.method_468(var1.field_1417 / 16.0);
      int var3 = Class469.method_468(var1.field_2013 / 16.0);
      byte var4 = 2;

      for (int var5 = var2 - var4; var5 <= var2 + var4; var5++) {
         for (int var6 = var3 - var4; var6 <= var3 + var4; var6++) {
            this.method_1474(var5, var6);
         }
      }

      if (!this.field_582.contains(var1)) {
         System.out.println("REINSERTING PLAYER! " + ((Class354)var1).field_1716);
         this.field_582.add(var1);
      }
   }

   static {
      float var0 = 0.05F;

      for (int var1 = 0; var1 <= 15; var1++) {
         float var2 = 1.0F - var1 / 15.0F;
         field_1340[var1] = (1.0F - var2) / (var2 * 3.0F + 1.0F) * (1.0F - var0) + var0;
      }
   }
}
