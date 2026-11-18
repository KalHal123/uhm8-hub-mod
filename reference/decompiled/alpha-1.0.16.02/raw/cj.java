import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class cj implements mz {
   private List w = new ArrayList();
   public List a = new ArrayList();
   private List x = new ArrayList();
   private TreeSet y = new TreeSet();
   private Set z = new HashSet();
   public List b = new ArrayList();
   public long c = 0L;
   public boolean d = false;
   private long A = 8961023L;
   private long B = 12638463L;
   private long C = 16777215L;
   public int e = 0;
   protected int f = new Random().nextInt();
   protected int g = 1013904223;
   public boolean h = false;
   public static float[] i = new float[16];
   private final long D = System.currentTimeMillis();
   public List j = new ArrayList();
   public int k;
   public Object l;
   public Random m = new Random();
   public int n;
   public int o;
   public int p;
   public boolean q = false;
   private List E = new ArrayList();
   private as F;
   private File G;
   public long r = 0L;
   private hc H;
   public long s = 0L;
   public final String t;
   public boolean u;
   private ArrayList I = new ArrayList();
   private Set J = new HashSet();
   private int K = this.m.nextInt(12000);
   private List L = new ArrayList();
   public boolean v = false;

   public static hc a(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if (!var3.exists()) {
         return null;
      }

      File var4 = new File(var3, "level.dat");
      if (var4.exists()) {
         try {
            hc var5 = w.a(new FileInputStream(var4));
            return var5.k("Data");
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      return null;
   }

   public static void b(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if (var3.exists()) {
         a(var3.listFiles());
         var3.delete();
      }
   }

   private static void a(File[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1].isDirectory()) {
            a(var0[var1].listFiles());
         }

         var0[var1].delete();
      }
   }

   public cj(File var1, String var2) {
      this(var1, var2, new Random().nextLong());
   }

   public cj(String var1) {
      this.t = var1;
      this.F = this.a(this.G);
      this.f();
   }

   public cj(File var1, String var2, long var3) {
      this.t = var2;
      var1.mkdirs();
      this.G = new File(var1, var2);
      this.G.mkdirs();

      try {
         File var5 = new File(this.G, "session.lock");
         DataOutputStream var6 = new DataOutputStream(new FileOutputStream(var5));

         try {
            var6.writeLong(this.D);
         } finally {
            var6.close();
         }
      } catch (IOException var13) {
         throw new RuntimeException("Failed to check session lock, aborting");
      }

      File var14 = new File(this.G, "level.dat");
      this.q = !var14.exists();
      if (var14.exists()) {
         try {
            hc var15 = w.a(new FileInputStream(var14));
            hc var7 = var15.k("Data");
            this.r = var7.f("RandomSeed");
            this.n = var7.e("SpawnX");
            this.o = var7.e("SpawnY");
            this.p = var7.e("SpawnZ");
            this.c = var7.f("Time");
            this.s = var7.f("SizeOnDisk");
            this.d = var7.m("SnowCovered");
            if (var7.b("Player")) {
               this.H = var7.k("Player");
            }
         } catch (Exception var11) {
            var11.printStackTrace();
         }
      } else {
         this.d = this.m.nextInt(4) == 0;
      }

      boolean var16 = false;
      if (this.r == 0L) {
         this.r = var3;
         var16 = true;
      }

      this.F = this.a(this.G);
      if (var16) {
         this.u = true;
         this.n = 0;
         this.o = 64;

         for (this.p = 0; !this.f(this.n, this.p); this.p = this.p + (this.m.nextInt(64) - this.m.nextInt(64))) {
            this.n = this.n + (this.m.nextInt(64) - this.m.nextInt(64));
         }

         this.u = false;
      }

      this.f();
   }

   protected as a(File var1) {
      return new fk(this, new kt(var1, true), new nj(this, this.r));
   }

   public void a() {
      if (this.o <= 0) {
         this.o = 64;
      }

      while (this.g(this.n, this.p) == 0) {
         this.n = this.n + (this.m.nextInt(8) - this.m.nextInt(8));
         this.p = this.p + (this.m.nextInt(8) - this.m.nextInt(8));
      }
   }

   private boolean f(int var1, int var2) {
      int var3 = this.g(var1, var2);
      return var3 == ln.E.ba;
   }

   private int g(int var1, int var2) {
      int var3 = 63;

      while (this.a(var1, var3 + 1, var2) != 0) {
         var3++;
      }

      return this.a(var1, var3, var2);
   }

   public void a(dg var1) {
      try {
         if (this.H != null) {
            var1.e(this.H);
            this.H = null;
         }

         this.a((jx)var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void a(boolean var1, nh var2) {
      if (this.F.b()) {
         if (var2 != null) {
            var2.b("Saving level");
         }

         this.m();
         if (var2 != null) {
            var2.d("Saving chunks");
         }

         this.F.a(var1, var2);
      }
   }

   private void m() {
      this.l();
      hc var1 = new hc();
      var1.a("RandomSeed", this.r);
      var1.a("SpawnX", this.n);
      var1.a("SpawnY", this.o);
      var1.a("SpawnZ", this.p);
      var1.a("Time", this.c);
      var1.a("SizeOnDisk", this.s);
      var1.a("SnowCovered", this.d);
      var1.a("LastPlayed", System.currentTimeMillis());
      dg var2 = null;
      if (this.j.size() > 0) {
         var2 = (dg)this.j.get(0);
      }

      if (var2 != null) {
         hc var3 = new hc();
         var2.d(var3);
         var1.a("Player", var3);
      }

      hc var8 = new hc();
      var8.a("Data", (ef)var1);

      try {
         File var4 = new File(this.G, "level.dat_new");
         File var5 = new File(this.G, "level.dat_old");
         File var6 = new File(this.G, "level.dat");
         w.a(var8, new FileOutputStream(var4));
         if (var5.exists()) {
            var5.delete();
         }

         var6.renameTo(var5);
         if (var6.exists()) {
            var6.delete();
         }

         var4.renameTo(var6);
         if (var4.exists()) {
            var4.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   public boolean a(int var1) {
      if (!this.F.b()) {
         return true;
      }

      if (var1 == 0) {
         this.m();
      }

      return this.F.a(false, null);
   }

   @Override
   public int a(int var1, int var2, int var3) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return 0;
      } else if (var2 < 0) {
         return 0;
      } else {
         return var2 >= 128 ? 0 : this.b(var1 >> 4, var3 >> 4).a(var1 & 15, var2, var3 & 15);
      }
   }

   public boolean d(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 128 ? this.h(var1 >> 4, var3 >> 4) : false;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 128) {
         var1 >>= 4;
         var2 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var5 >>= 4;
         var6 >>= 4;

         for (int var7 = var1; var7 <= var4; var7++) {
            for (int var8 = var3; var8 <= var6; var8++) {
               if (!this.h(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean h(int var1, int var2) {
      return this.F.a(var1, var2);
   }

   public fr a(int var1, int var2) {
      return this.b(var1 >> 4, var2 >> 4);
   }

   public fr b(int var1, int var2) {
      return this.F.b(var1, var2);
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      fr var6 = this.b(var1 >> 4, var3 >> 4);
      return var6.a(var1 & 15, var2, var3 & 15, var4, var5);
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      fr var5 = this.b(var1 >> 4, var3 >> 4);
      return var5.a(var1 & 15, var2, var3 & 15, var4);
   }

   @Override
   public fs f(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0 ? fs.a : ln.n[var4].bl;
   }

   @Override
   public int e(int var1, int var2, int var3) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return 0;
      }

      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      fr var4 = this.b(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      return var4.b(var1, var2, var3);
   }

   public void b(int var1, int var2, int var3, int var4) {
      this.c(var1, var2, var3, var4);
   }

   public boolean c(int var1, int var2, int var3, int var4) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return false;
      }

      fr var5 = this.b(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      var5.b(var1, var2, var3, var4);
      return true;
   }

   public boolean d(int var1, int var2, int var3, int var4) {
      if (this.a(var1, var2, var3, var4)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5) {
      if (this.a(var1, var2, var3, var4, var5)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void h(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.E.size(); var4++) {
         ((ic)this.E.get(var4)).a(var1, var2, var3);
      }
   }

   protected void e(int var1, int var2, int var3, int var4) {
      this.h(var1, var2, var3);
      this.g(var1, var2, var3, var4);
   }

   public void f(int var1, int var2, int var3, int var4) {
      if (var3 > var4) {
         int var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      this.b(var1, var3, var2, var1, var4, var2);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = 0; var7 < this.E.size(); var7++) {
         ((ic)this.E.get(var7)).b(var1, var2, var3, var4, var5, var6);
      }
   }

   public void g(int var1, int var2, int var3, int var4) {
      this.l(var1 - 1, var2, var3, var4);
      this.l(var1 + 1, var2, var3, var4);
      this.l(var1, var2 - 1, var3, var4);
      this.l(var1, var2 + 1, var3, var4);
      this.l(var1, var2, var3 - 1, var4);
      this.l(var1, var2, var3 + 1, var4);
   }

   private void l(int var1, int var2, int var3, int var4) {
      if (!this.h && !this.v) {
         ln var5 = ln.n[this.a(var1, var2, var3)];
         if (var5 != null) {
            var5.a(this, var1, var2, var3, var4);
         }
      }
   }

   public boolean i(int var1, int var2, int var3) {
      return this.b(var1 >> 4, var3 >> 4).c(var1 & 15, var2, var3 & 15);
   }

   public int j(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if (var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if (var4) {
            int var5 = this.a(var1, var2, var3);
            if (var5 == ln.ak.ba || var5 == ln.aA.ba) {
               int var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if (var7 > var6) {
                  var6 = var7;
               }

               if (var8 > var6) {
                  var6 = var8;
               }

               if (var9 > var6) {
                  var6 = var9;
               }

               if (var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if (var2 < 0) {
            return 0;
         }

         if (var2 >= 128) {
            int var14 = 15 - this.e;
            if (var14 < 0) {
               var14 = 0;
            }

            return var14;
         } else {
            fr var13 = this.b(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var13.c(var1, var2, var3, this.e);
         }
      } else {
         return 15;
      }
   }

   public boolean k(int var1, int var2, int var3) {
      if (var1 < -32000000 || var3 < -32000000 || var1 >= 32000000 || var3 > 32000000) {
         return false;
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 >= 128) {
         return true;
      }

      if (!this.h(var1 >> 4, var3 >> 4)) {
         return false;
      }

      fr var4 = this.b(var1 >> 4, var3 >> 4);
      var1 &= 15;
      var3 &= 15;
      return var4.c(var1, var2, var3);
   }

   public int c(int var1, int var2) {
      if (var1 >= -32000000 && var2 >= -32000000 && var1 < 32000000 && var2 <= 32000000) {
         if (!this.h(var1 >> 4, var2 >> 4)) {
            return 0;
         }

         fr var3 = this.b(var1 >> 4, var2 >> 4);
         return var3.b(var1 & 15, var2 & 15);
      } else {
         return 0;
      }
   }

   public void a(bu var1, int var2, int var3, int var4, int var5) {
      if (this.d(var2, var3, var4)) {
         if (var1 == bu.a) {
            if (this.k(var2, var3, var4)) {
               var5 = 15;
            }
         } else if (var1 == bu.b) {
            int var6 = this.a(var2, var3, var4);
            if (ln.s[var6] > var5) {
               var5 = ln.s[var6];
            }
         }

         if (this.a(var1, var2, var3, var4) != var5) {
            this.a(var1, var2, var3, var4, var2, var3, var4);
         }
      }
   }

   public int a(bu var1, int var2, int var3, int var4) {
      if (var3 >= 0 && var3 < 128 && var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if (!this.h(var5, var6)) {
            return 0;
         }

         fr var7 = this.b(var5, var6);
         return var7.a(var1, var2 & 15, var3, var4 & 15);
      } else {
         return var1.c;
      }
   }

   public void b(bu var1, int var2, int var3, int var4, int var5) {
      if (var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         if (var3 >= 0) {
            if (var3 < 128) {
               if (this.h(var2 >> 4, var4 >> 4)) {
                  fr var6 = this.b(var2 >> 4, var4 >> 4);
                  var6.a(var1, var2 & 15, var3, var4 & 15, var5);

                  for (int var7 = 0; var7 < this.E.size(); var7++) {
                     ((ic)this.E.get(var7)).a(var2, var3, var4);
                  }
               }
            }
         }
      }
   }

   @Override
   public float c(int var1, int var2, int var3) {
      return i[this.j(var1, var2, var3)];
   }

   public boolean b() {
      return this.e < 4;
   }

   public lv a(ah var1, ah var2) {
      return this.a(var1, var2, false);
   }

   public lv a(ah var1, ah var2, boolean var3) {
      if (Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
         return null;
      }

      if (!Double.isNaN(var2.a) && !Double.isNaN(var2.b) && !Double.isNaN(var2.c)) {
         int var4 = ei.b(var2.a);
         int var5 = ei.b(var2.b);
         int var6 = ei.b(var2.c);
         int var7 = ei.b(var1.a);
         int var8 = ei.b(var1.b);
         int var9 = ei.b(var1.c);
         int var10 = 20;

         while (var10-- >= 0) {
            if (Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
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
            double var23 = var2.a - var1.a;
            double var25 = var2.b - var1.b;
            double var27 = var2.c - var1.c;
            if (var11 != 999.0) {
               var17 = (var11 - var1.a) / var23;
            }

            if (var13 != 999.0) {
               var19 = (var13 - var1.b) / var25;
            }

            if (var15 != 999.0) {
               var21 = (var15 - var1.c) / var27;
            }

            byte var29 = 0;
            if (var17 < var19 && var17 < var21) {
               if (var4 > var7) {
                  var29 = 4;
               } else {
                  var29 = 5;
               }

               var1.a = var11;
               var1.b += var25 * var17;
               var1.c += var27 * var17;
            } else if (var19 < var21) {
               if (var5 > var8) {
                  var29 = 0;
               } else {
                  var29 = 1;
               }

               var1.a += var23 * var19;
               var1.b = var13;
               var1.c += var27 * var19;
            } else {
               if (var6 > var9) {
                  var29 = 2;
               } else {
                  var29 = 3;
               }

               var1.a += var23 * var21;
               var1.b += var25 * var21;
               var1.c = var15;
            }

            ah var30 = ah.b(var1.a, var1.b, var1.c);
            var7 = (int)(var30.a = ei.b(var1.a));
            if (var29 == 5) {
               var7--;
               var30.a++;
            }

            var8 = (int)(var30.b = ei.b(var1.b));
            if (var29 == 1) {
               var8--;
               var30.b++;
            }

            var9 = (int)(var30.c = ei.b(var1.c));
            if (var29 == 3) {
               var9--;
               var30.c++;
            }

            int var31 = this.a(var7, var8, var9);
            int var32 = this.e(var7, var8, var9);
            ln var33 = ln.n[var31];
            if (var31 > 0 && var33.a(var32, var3)) {
               lv var34 = var33.a(this, var7, var8, var9, var1, var2);
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

   public void a(jx var1, String var2, float var3, float var4) {
      for (int var5 = 0; var5 < this.E.size(); var5++) {
         ((ic)this.E.get(var5)).a(var2, var1.ah, var1.ai - var1.ay, var1.aj, var3, var4);
      }
   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      for (int var10 = 0; var10 < this.E.size(); var10++) {
         ((ic)this.E.get(var10)).a(var7, var1, var3, var5, var8, var9);
      }
   }

   public void a(String var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.E.size(); var5++) {
         ((ic)this.E.get(var5)).a(var1, var2, var3, var4);
      }
   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for (int var14 = 0; var14 < this.E.size(); var14++) {
         ((ic)this.E.get(var14)).a(var1, var2, var4, var6, var8, var10, var12);
      }
   }

   public boolean a(jx var1) {
      int var2 = ei.b(var1.ah / 16.0);
      int var3 = ei.b(var1.aj / 16.0);
      boolean var4 = false;
      if (var1 instanceof dg) {
         var4 = true;
      }

      if (!var4 && !this.h(var2, var3)) {
         return false;
      }

      if (var1 instanceof dg) {
         this.j.add((dg)var1);
         System.out.println("Player count: " + this.j.size());
      }

      this.b(var2, var3).a(var1);
      this.a.add(var1);
      this.b(var1);
      return true;
   }

   protected void b(jx var1) {
      for (int var2 = 0; var2 < this.E.size(); var2++) {
         ((ic)this.E.get(var2)).a(var1);
      }
   }

   protected void c(jx var1) {
      for (int var2 = 0; var2 < this.E.size(); var2++) {
         ((ic)this.E.get(var2)).b(var1);
      }
   }

   public void d(jx var1) {
      var1.D();
      if (var1 instanceof dg) {
         this.j.remove((dg)var1);
         System.out.println("Player count: " + this.j.size());
      }
   }

   public void a(ic var1) {
      this.E.add(var1);
   }

   public void b(ic var1) {
      this.E.remove(var1);
   }

   public List a(jx var1, cb var2) {
      this.I.clear();
      int var3 = ei.b(var2.a);
      int var4 = ei.b(var2.d + 1.0);
      int var5 = ei.b(var2.b);
      int var6 = ei.b(var2.e + 1.0);
      int var7 = ei.b(var2.c);
      int var8 = ei.b(var2.f + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var7; var10 < var8; var10++) {
            if (this.d(var9, 64, var10)) {
               for (int var11 = var5 - 1; var11 < var6; var11++) {
                  ln var12 = ln.n[this.a(var9, var11, var10)];
                  if (var12 != null) {
                     var12.a(this, var9, var11, var10, var2, this.I);
                  }
               }
            }
         }
      }

      double var14 = 0.25;
      List var15 = this.b(var1, var2.b(var14, var14, var14));

      for (int var16 = 0; var16 < var15.size(); var16++) {
         cb var13 = ((jx)var15.get(var16)).f_();
         if (var13 != null && var13.a(var2)) {
            this.I.add(var13);
         }

         var13 = var1.b_((jx)var15.get(var16));
         if (var13 != null && var13.a(var2)) {
            this.I.add(var13);
         }
      }

      return this.I;
   }

   public int a(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (ei.b(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return (int)(var3 * 11.0F);
   }

   public ah b(float var1) {
      float var2 = this.c(var1);
      float var3 = ei.b(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.A >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.A >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.A & 255L) / 255.0F;
      var4 *= var3;
      var5 *= var3;
      var6 *= var3;
      return ah.b(var4, var5, var6);
   }

   public float c(float var1) {
      int var2 = (int)(this.c % 24000L);
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

   public ah d(float var1) {
      float var2 = this.c(var1);
      float var3 = ei.b(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.C >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.C >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.C & 255L) / 255.0F;
      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      return ah.b(var4, var5, var6);
   }

   public ah e(float var1) {
      float var2 = this.c(var1);
      float var3 = ei.b(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.B >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.B >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.B & 255L) / 255.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return ah.b(var4, var5, var6);
   }

   public int d(int var1, int var2) {
      fr var3 = this.a(var1, var2);
      int var4 = 127;
      var1 &= 15;
      var2 &= 15;

      while (var4 > 0) {
         int var5 = var3.a(var1, var4, var2);
         if (var5 != 0 && (ln.n[var5].bl.c() || ln.n[var5].bl.d())) {
            return var4 + 1;
         }

         var4--;
      }

      return -1;
   }

   public int e(int var1, int var2) {
      return this.a(var1, var2).b(var1 & 15, var2 & 15);
   }

   public float f(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (ei.b(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.75F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void h(int var1, int var2, int var3, int var4) {
      iw var5 = new iw(var1, var2, var3, var4);
      byte var6 = 8;
      if (this.a(var1 - var6, var2 - var6, var3 - var6, var1 + var6, var2 + var6, var3 + var6)) {
         if (var4 > 0) {
            var5.a(ln.n[var4].a() + this.c);
         }

         if (!this.z.contains(var5)) {
            this.z.add(var5);
            this.y.add(var5);
         }
      }
   }

   public void c() {
      this.a.removeAll(this.x);

      for (int var1 = 0; var1 < this.x.size(); var1++) {
         jx var2 = (jx)this.x.get(var1);
         int var3 = var2.aX;
         int var4 = var2.aZ;
         if (var2.aW && this.h(var3, var4)) {
            this.b(var3, var4).b(var2);
         }
      }

      for (int var5 = 0; var5 < this.x.size(); var5++) {
         this.c((jx)this.x.get(var5));
      }

      this.x.clear();

      for (int var6 = 0; var6 < this.a.size(); var6++) {
         jx var8 = (jx)this.a.get(var6);
         if (var8.ac != null) {
            if (!var8.ac.ax && var8.ac.ab == var8) {
               continue;
            }

            var8.ac.ab = null;
            var8.ac = null;
         }

         if (!var8.ax) {
            this.e(var8);
         }

         if (var8.ax) {
            int var10 = var8.aX;
            int var11 = var8.aZ;
            if (var8.aW && this.h(var10, var11)) {
               this.b(var10, var11).b(var8);
            }

            this.a.remove(var6--);
            this.c(var8);
         }
      }

      for (int var7 = 0; var7 < this.b.size(); var7++) {
         ht var9 = (ht)this.b.get(var7);
         var9.k_();
      }
   }

   protected void e(jx var1) {
      int var2 = ei.b(var1.ah);
      int var3 = ei.b(var1.aj);
      byte var4 = 16;
      if (this.a(var2 - var4, 0, var3 - var4, var2 + var4, 128, var3 + var4)) {
         var1.aF = var1.ah;
         var1.aG = var1.ai;
         var1.aH = var1.aj;
         var1.ap = var1.an;
         var1.aq = var1.ao;
         if (var1.ac != null) {
            var1.n();
         } else {
            var1.e_();
         }

         int var5 = ei.b(var1.ah / 16.0);
         int var6 = ei.b(var1.ai / 16.0);
         int var7 = ei.b(var1.aj / 16.0);
         if (!var1.aW || var1.aX != var5 || var1.aY != var6 || var1.aZ != var7) {
            if (var1.aW && this.h(var1.aX, var1.aZ)) {
               this.b(var1.aX, var1.aZ).a(var1, var1.aY);
            }

            if (this.h(var5, var7)) {
               this.b(var5, var7).a(var1);
            } else {
               var1.aW = false;
               System.out.println("Removing entity because it's not in a chunk!!");
               var1.D();
            }
         }

         if (var1.ab != null) {
            if (!var1.ab.ax && var1.ab.ac == var1) {
               this.e(var1.ab);
            } else {
               var1.ab.ac = null;
               var1.ab = null;
            }
         }

         if (Double.isNaN(var1.ah) || Double.isInfinite(var1.ah)) {
            var1.ah = var1.aF;
         }

         if (Double.isNaN(var1.ai) || Double.isInfinite(var1.ai)) {
            var1.ai = var1.aG;
         }

         if (Double.isNaN(var1.aj) || Double.isInfinite(var1.aj)) {
            var1.aj = var1.aH;
         }

         if (Double.isNaN(var1.ao) || Double.isInfinite(var1.ao)) {
            var1.ao = var1.aq;
         }

         if (Double.isNaN(var1.an) || Double.isInfinite(var1.an)) {
            var1.an = var1.ap;
         }
      }
   }

   public boolean a(cb var1) {
      List var2 = this.b(null, var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         jx var4 = (jx)var2.get(var3);
         if (!var4.ax && var4.aa) {
            return false;
         }
      }

      return true;
   }

   public boolean b(cb var1) {
      int var2 = ei.b(var1.a);
      int var3 = ei.b(var1.d + 1.0);
      int var4 = ei.b(var1.b);
      int var5 = ei.b(var1.e + 1.0);
      int var6 = ei.b(var1.c);
      int var7 = ei.b(var1.f + 1.0);
      if (var1.a < 0.0) {
         var2--;
      }

      if (var1.b < 0.0) {
         var4--;
      }

      if (var1.c < 0.0) {
         var6--;
      }

      for (int var8 = var2; var8 < var3; var8++) {
         for (int var9 = var4; var9 < var5; var9++) {
            for (int var10 = var6; var10 < var7; var10++) {
               ln var11 = ln.n[this.a(var8, var9, var10)];
               if (var11 != null && var11.bl.d()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean c(cb var1) {
      int var2 = ei.b(var1.a);
      int var3 = ei.b(var1.d + 1.0);
      int var4 = ei.b(var1.b);
      int var5 = ei.b(var1.e + 1.0);
      int var6 = ei.b(var1.c);
      int var7 = ei.b(var1.f + 1.0);

      for (int var8 = var2; var8 < var3; var8++) {
         for (int var9 = var4; var9 < var5; var9++) {
            for (int var10 = var6; var10 < var7; var10++) {
               int var11 = this.a(var8, var9, var10);
               if (var11 == ln.ar.ba || var11 == ln.C.ba || var11 == ln.D.ba) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean a(cb var1, fs var2, jx var3) {
      int var4 = ei.b(var1.a);
      int var5 = ei.b(var1.d + 1.0);
      int var6 = ei.b(var1.b);
      int var7 = ei.b(var1.e + 1.0);
      int var8 = ei.b(var1.c);
      int var9 = ei.b(var1.f + 1.0);
      boolean var10 = false;
      ah var11 = ah.b(0.0, 0.0, 0.0);

      for (int var12 = var4; var12 < var5; var12++) {
         for (int var13 = var6; var13 < var7; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               ln var15 = ln.n[this.a(var12, var13, var14)];
               if (var15 != null && var15.bl == var2) {
                  double var16 = var13 + 1 - jf.b(this.e(var12, var13, var14));
                  if (var7 >= var16) {
                     var10 = true;
                     var15.a(this, var12, var13, var14, var3, var11);
                  }
               }
            }
         }
      }

      if (var11.c() > 0.0) {
         var11 = var11.b();
         double var19 = 0.004;
         var3.ak = var3.ak + var11.a * var19;
         var3.al = var3.al + var11.b * var19;
         var3.am = var3.am + var11.c * var19;
      }

      return var10;
   }

   public boolean a(cb var1, fs var2) {
      int var3 = ei.b(var1.a);
      int var4 = ei.b(var1.d + 1.0);
      int var5 = ei.b(var1.b);
      int var6 = ei.b(var1.e + 1.0);
      int var7 = ei.b(var1.c);
      int var8 = ei.b(var1.f + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var5; var10 < var6; var10++) {
            for (int var11 = var7; var11 < var8; var11++) {
               ln var12 = ln.n[this.a(var9, var10, var11)];
               if (var12 != null && var12.bl == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean b(cb var1, fs var2) {
      int var3 = ei.b(var1.a);
      int var4 = ei.b(var1.d + 1.0);
      int var5 = ei.b(var1.b);
      int var6 = ei.b(var1.e + 1.0);
      int var7 = ei.b(var1.c);
      int var8 = ei.b(var1.f + 1.0);

      for (int var9 = var3; var9 < var4; var9++) {
         for (int var10 = var5; var10 < var6; var10++) {
            for (int var11 = var7; var11 < var8; var11++) {
               ln var12 = ln.n[this.a(var9, var10, var11)];
               if (var12 != null && var12.bl == var2) {
                  int var13 = this.e(var9, var10, var11);
                  double var14 = var10 + 1;
                  if (var13 < 8) {
                     var14 = var10 + 1 - var13 / 8.0;
                  }

                  if (var14 >= var1.b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public void a(jx var1, double var2, double var4, double var6, float var8) {
      new iv().a(this, var1, var2, var4, var6, var8);
   }

   public float a(ah var1, cb var2) {
      double var3 = 1.0 / ((var2.d - var2.a) * 2.0 + 1.0);
      double var5 = 1.0 / ((var2.e - var2.b) * 2.0 + 1.0);
      double var7 = 1.0 / ((var2.f - var2.c) * 2.0 + 1.0);
      int var9 = 0;
      int var10 = 0;

      for (float var11 = 0.0F; var11 <= 1.0F; var11 = (float)(var11 + var3)) {
         for (float var12 = 0.0F; var12 <= 1.0F; var12 = (float)(var12 + var5)) {
            for (float var13 = 0.0F; var13 <= 1.0F; var13 = (float)(var13 + var7)) {
               double var14 = var2.a + (var2.d - var2.a) * var11;
               double var16 = var2.b + (var2.e - var2.b) * var12;
               double var18 = var2.c + (var2.f - var2.c) * var13;
               if (this.a(ah.b(var14, var16, var18), var1) == null) {
                  var9++;
               }

               var10++;
            }
         }
      }

      return (float)var9 / var10;
   }

   public void i(int var1, int var2, int var3, int var4) {
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

      if (this.a(var1, var2, var3) == ln.ar.ba) {
         this.a(var1 + 0.5F, var2 + 0.5F, var3 + 0.5F, "random.fizz", 0.5F, 2.6F + (this.m.nextFloat() - this.m.nextFloat()) * 0.8F);
         this.d(var1, var2, var3, 0);
      }
   }

   public jx a(Class var1) {
      return null;
   }

   public String d() {
      return "All: " + this.a.size();
   }

   @Override
   public ht b(int var1, int var2, int var3) {
      fr var4 = this.b(var1 >> 4, var3 >> 4);
      return var4 != null ? var4.d(var1 & 15, var2, var3 & 15) : null;
   }

   public void a(int var1, int var2, int var3, ht var4) {
      fr var5 = this.b(var1 >> 4, var3 >> 4);
      if (var5 != null) {
         var5.a(var1 & 15, var2, var3 & 15, var4);
      }
   }

   public void l(int var1, int var2, int var3) {
      fr var4 = this.b(var1 >> 4, var3 >> 4);
      if (var4 != null) {
         var4.e(var1 & 15, var2, var3 & 15);
      }
   }

   @Override
   public boolean g(int var1, int var2, int var3) {
      ln var4 = ln.n[this.a(var1, var2, var3)];
      return var4 == null ? false : var4.b();
   }

   public void a(nh var1) {
      this.a(true, var1);
   }

   public boolean e() {
      int var1 = 1000;

      while (this.w.size() > 0) {
         if (--var1 <= 0) {
            return true;
         }

         ((kc)this.w.remove(this.w.size() - 1)).a(this);
      }

      return false;
   }

   public void a(bu var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.a(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void a(bu var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = (var5 + var2) / 2;
      int var10 = (var7 + var4) / 2;
      if (this.d(var9, 64, var10)) {
         int var11 = this.w.size();
         if (var8) {
            int var12 = 4;
            if (var12 > var11) {
               var12 = var11;
            }

            for (int var13 = 0; var13 < var12; var13++) {
               kc var14 = (kc)this.w.get(this.w.size() - var13 - 1);
               if (var14.a == var1 && var14.a(var2, var3, var4, var5, var6, var7)) {
                  return;
               }
            }
         }

         this.w.add(new kc(var1, var2, var3, var4, var5, var6, var7));
         if (this.w.size() > 100000) {
            while (this.w.size() > 50000) {
               this.e();
            }
         }
      }
   }

   public void f() {
      int var1 = this.a(1.0F);
      if (var1 != this.e) {
         this.e = var1;
      }
   }

   public void g() {
      this.F.a();
      int var1 = this.a(1.0F);
      if (var1 != this.e) {
         this.e = var1;

         for (int var2 = 0; var2 < this.E.size(); var2++) {
            ((ic)this.E.get(var2)).e();
         }
      }

      this.c++;
      if (this.c % 4L == 0L) {
         this.a(false, null);
      }

      this.a(false);
      this.h();
   }

   protected void h() {
      this.J.clear();

      for (int var1 = 0; var1 < this.j.size(); var1++) {
         dg var2 = (dg)this.j.get(var1);
         int var3 = ei.b(var2.ah / 16.0);
         int var4 = ei.b(var2.aj / 16.0);
         byte var5 = 9;

         for (int var6 = -var5; var6 <= var5; var6++) {
            for (int var7 = -var5; var7 <= var5; var7++) {
               this.J.add(new nx(var6 + var3, var7 + var4));
            }
         }
      }

      if (this.K > 0) {
         this.K--;
      }

      for (nx var13 : this.J) {
         int var14 = var13.a * 16;
         int var15 = var13.b * 16;
         fr var16 = this.b(var13.a, var13.b);
         if (this.K == 0) {
            this.f = this.f * 3 + this.g;
            int var17 = this.f >> 2;
            int var20 = var17 & 15;
            int var8 = var17 >> 8 & 15;
            int var9 = var17 >> 16 & 127;
            int var10 = var16.a(var20, var9, var8);
            var20 += var14;
            var8 += var15;
            if (var10 == 0 && this.j(var20, var9, var8) <= this.m.nextInt(8) && this.a(bu.a, var20, var9, var8) <= 0) {
               dg var11 = this.a(var20 + 0.5, var9 + 0.5, var8 + 0.5, 8.0);
               if (var11 != null && var11.d(var20 + 0.5, var9 + 0.5, var8 + 0.5) > 4.0) {
                  this.a(var20 + 0.5, var9 + 0.5, var8 + 0.5, "ambient.cave.cave", 0.7F, 0.8F + this.m.nextFloat() * 0.2F);
                  this.K = this.m.nextInt(12000) + 6000;
               }
            }
         }

         if (this.d && this.m.nextInt(4) == 0) {
            this.f = this.f * 3 + this.g;
            int var18 = this.f >> 2;
            int var22 = var18 & 15;
            int var25 = var18 >> 8 & 15;
            int var27 = this.d(var22 + var14, var25 + var15);
            if (var27 >= 0 && var27 < 128 && var16.a(bu.b, var22, var27, var25) < 10) {
               int var29 = var16.a(var22, var27 - 1, var25);
               if (var16.a(var22, var27, var25) == 0 && var29 != 0 && var29 != ln.aT.ba && ln.n[var29].bl.c()) {
                  this.d(var22 + var14, var27, var25 + var15, ln.aS.ba);
               }

               if (var29 == ln.B.ba && var16.b(var22, var27 - 1, var25) == 0) {
                  this.d(var22 + var14, var27 - 1, var25 + var15, ln.aT.ba);
               }
            }
         }

         for (int var19 = 0; var19 < 80; var19++) {
            this.f = this.f * 3 + this.g;
            int var23 = this.f >> 2;
            int var26 = var23 & 15;
            int var28 = var23 >> 8 & 15;
            int var30 = var23 >> 16 & 127;
            byte var31 = var16.b[var26 << 11 | var28 << 7 | var30];
            if (ln.o[var31]) {
               ln.n[var31].a(this, var26 + var14, var30, var28 + var15, this.m);
            }
         }
      }
   }

   public boolean a(boolean var1) {
      int var2 = this.y.size();
      if (var2 != this.z.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      }

      if (var2 > 1000) {
         var2 = 1000;
      }

      for (int var3 = 0; var3 < var2; var3++) {
         iw var4 = (iw)this.y.first();
         if (!var1 && var4.e > this.c) {
            break;
         }

         this.y.remove(var4);
         this.z.remove(var4);
         byte var5 = 8;
         if (this.a(var4.a - var5, var4.b - var5, var4.c - var5, var4.a + var5, var4.b + var5, var4.c + var5)) {
            int var6 = this.a(var4.a, var4.b, var4.c);
            if (var6 == var4.d && var6 > 0) {
               ln.n[var6].a(this, var4.a, var4.b, var4.c, this.m);
            }
         }
      }

      return this.y.size() != 0;
   }

   public void m(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();

      for (int var6 = 0; var6 < 1000; var6++) {
         int var7 = var1 + this.m.nextInt(var4) - this.m.nextInt(var4);
         int var8 = var2 + this.m.nextInt(var4) - this.m.nextInt(var4);
         int var9 = var3 + this.m.nextInt(var4) - this.m.nextInt(var4);
         int var10 = this.a(var7, var8, var9);
         if (var10 > 0) {
            ln.n[var10].b(this, var7, var8, var9, var5);
         }
      }
   }

   public List b(jx var1, cb var2) {
      this.L.clear();
      int var3 = ei.b((var2.a - 2.0) / 16.0);
      int var4 = ei.b((var2.d + 2.0) / 16.0);
      int var5 = ei.b((var2.c - 2.0) / 16.0);
      int var6 = ei.b((var2.f + 2.0) / 16.0);

      for (int var7 = var3; var7 <= var4; var7++) {
         for (int var8 = var5; var8 <= var6; var8++) {
            if (this.h(var7, var8)) {
               this.b(var7, var8).a(var1, var2, this.L);
            }
         }
      }

      return this.L;
   }

   public List a(Class var1, cb var2) {
      int var3 = ei.b((var2.a - 2.0) / 16.0);
      int var4 = ei.b((var2.d + 2.0) / 16.0);
      int var5 = ei.b((var2.c - 2.0) / 16.0);
      int var6 = ei.b((var2.f + 2.0) / 16.0);
      ArrayList var7 = new ArrayList();

      for (int var8 = var3; var8 <= var4; var8++) {
         for (int var9 = var5; var9 <= var6; var9++) {
            if (this.h(var8, var9)) {
               this.b(var8, var9).a(var1, var2, var7);
            }
         }
      }

      return var7;
   }

   public List i() {
      return this.a;
   }

   public void n(int var1, int var2, int var3) {
      if (this.d(var1, var2, var3)) {
         this.a(var1, var3).f();
      }
   }

   public int b(Class var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.a.size(); var3++) {
         jx var4 = (jx)this.a.get(var3);
         if (var1.isAssignableFrom(var4.getClass())) {
            var2++;
         }
      }

      return var2;
   }

   public void a(List var1) {
      this.a.addAll(var1);

      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.b((jx)var1.get(var2));
      }
   }

   public void b(List var1) {
      this.x.addAll(var1);
   }

   public void j() {
      while (this.F.a()) {
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a(var2, var3, var4);
      ln var7 = ln.n[var6];
      ln var8 = ln.n[var1];
      cb var9 = var8.d(this, var2, var3, var4);
      if (var5) {
         var9 = null;
      }

      if (var9 != null && !this.a(var9)) {
         return false;
      } else {
         return var7 == ln.A || var7 == ln.B || var7 == ln.C || var7 == ln.D || var7 == ln.ar || var7 == ln.aS
            ? true
            : var1 > 0 && var7 == null && var8.a(this, var2, var3, var4);
      }
   }

   public bh a(jx var1, jx var2, float var3) {
      int var4 = ei.b(var1.ah);
      int var5 = ei.b(var1.ai);
      int var6 = ei.b(var1.aj);
      int var7 = (int)(var3 + 16.0F);
      int var8 = var4 - var7;
      int var9 = var5 - var7;
      int var10 = var6 - var7;
      int var11 = var4 + var7;
      int var12 = var5 + var7;
      int var13 = var6 + var7;
      ce var14 = new ce(this, var8, var9, var10, var11, var12, var13);
      return new cu(var14).a(var1, var2, var3);
   }

   public bh a(jx var1, int var2, int var3, int var4, float var5) {
      int var6 = ei.b(var1.ah);
      int var7 = ei.b(var1.ai);
      int var8 = ei.b(var1.aj);
      int var9 = (int)(var5 + 8.0F);
      int var10 = var6 - var9;
      int var11 = var7 - var9;
      int var12 = var8 - var9;
      int var13 = var6 + var9;
      int var14 = var7 + var9;
      int var15 = var8 + var9;
      ce var16 = new ce(this, var10, var11, var12, var13, var14, var15);
      return new cu(var16).a(var1, var2, var3, var4, var5);
   }

   public boolean j(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      return var5 == 0 ? false : ln.n[var5].c(this, var1, var2, var3, var4);
   }

   public boolean o(int var1, int var2, int var3) {
      if (this.j(var1, var2 - 1, var3, 0)) {
         return true;
      } else if (this.j(var1, var2 + 1, var3, 1)) {
         return true;
      } else if (this.j(var1, var2, var3 - 1, 2)) {
         return true;
      } else if (this.j(var1, var2, var3 + 1, 3)) {
         return true;
      } else {
         return this.j(var1 - 1, var2, var3, 4) ? true : this.j(var1 + 1, var2, var3, 5);
      }
   }

   public boolean k(int var1, int var2, int var3, int var4) {
      if (this.g(var1, var2, var3)) {
         return this.o(var1, var2, var3);
      }

      int var5 = this.a(var1, var2, var3);
      return var5 == 0 ? false : ln.n[var5].b((mz)this, var1, var2, var3, var4);
   }

   public boolean p(int var1, int var2, int var3) {
      if (this.k(var1, var2 - 1, var3, 0)) {
         return true;
      } else if (this.k(var1, var2 + 1, var3, 1)) {
         return true;
      } else if (this.k(var1, var2, var3 - 1, 2)) {
         return true;
      } else if (this.k(var1, var2, var3 + 1, 3)) {
         return true;
      } else {
         return this.k(var1 - 1, var2, var3, 4) ? true : this.k(var1 + 1, var2, var3, 5);
      }
   }

   public dg a(jx var1, double var2) {
      return this.a(var1.ah, var1.ai, var1.aj, var2);
   }

   public dg a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0;
      dg var11 = null;

      for (int var12 = 0; var12 < this.j.size(); var12++) {
         dg var13 = (dg)this.j.get(var12);
         double var14 = var13.d(var1, var3, var5);
         if ((var7 < 0.0 || var14 < var7 * var7) && (var9 == -1.0 || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7) {
      int var8 = var1 >> 4;
      int var9 = var3 >> 4;
      int var10 = var1 + var4 - 1 >> 4;
      int var11 = var3 + var6 - 1 >> 4;
      int var12 = 0;
      int var13 = var2;
      int var14 = var2 + var5;
      if (var13 < 0) {
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

            var12 = this.b(var15, var18).a(var7, var16, var13, var19, var17, var14, var20, var12);
            this.b(var15 * 16 + var16, var13, var18 * 16 + var19, var15 * 16 + var17, var14, var18 * 16 + var20);
         }
      }
   }

   public void k() {
   }

   public void l() {
      try {
         File var1 = new File(this.G, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if (var2.readLong() != this.D) {
               throw new lm("The save is being accessed from another location, aborting");
            }
         } finally {
            var2.close();
         }
      } catch (IOException var7) {
         throw new lm("Failed to check session lock, aborting");
      }
   }

   static {
      float var0 = 0.05F;

      for (int var1 = 0; var1 <= 15; var1++) {
         float var2 = 1.0F - var1 / 15.0F;
         i[var1] = (1.0F - var2) / (var2 * 3.0F + 1.0F) * (1.0F - var0) + var0;
      }
   }
}
