import java.util.ArrayList;
import java.util.Random;

public class ln {
   public static final ax e = new ax("stone", 1.0F, 1.0F);
   public static final ax f = new ax("wood", 1.0F, 1.0F);
   public static final ax g = new ax("gravel", 1.0F, 1.0F);
   public static final ax h = new ax("grass", 1.0F, 1.0F);
   public static final ax i = new ax("stone", 1.0F, 1.0F);
   public static final ax j = new ax("stone", 1.0F, 1.5F);
   public static final ax k = new t("stone", 1.0F, 1.0F);
   public static final ax l = new ax("cloth", 1.0F, 1.0F);
   public static final ax m = new s("sand", 1.0F, 1.0F);
   public static final ln[] n = new ln[256];
   public static final boolean[] o = new boolean[256];
   public static final boolean[] p = new boolean[256];
   public static final int[] q = new int[256];
   public static final boolean[] r = new boolean[256];
   public static final int[] s = new int[256];
   public static final ln t = new bz(1, 1).c(1.5F).b(10.0F).a(i);
   public static final ml u = (ml)new ml(2).c(0.6F).a(h);
   public static final ln v = new hq(3, 2).c(0.5F).a(g);
   public static final ln w = new ln(4, 16, fs.d).c(2.0F).b(10.0F).a(i);
   public static final ln x = new ln(5, 4, fs.c).c(2.0F).b(5.0F).a(f);
   public static final ln y = new do(6, 15).c(0.0F).a(h);
   public static final ln z = new ln(7, 17, fs.d).c(-1.0F).b(6000000.0F).a(i);
   public static final ln A = new hl(8, fs.f).c(100.0F).d(3);
   public static final ln B = new hd(9, fs.f).c(100.0F).d(3);
   public static final ln C = new hl(10, fs.g).c(0.0F).a(1.0F).d(255);
   public static final ln D = new hd(11, fs.g).c(100.0F).a(1.0F).d(255);
   public static final ln E = new dc(12, 18).c(0.5F).a(m);
   public static final ln F = new gp(13, 19).c(0.6F).a(g);
   public static final ln G = new gm(14, 32).c(3.0F).b(5.0F).a(i);
   public static final ln H = new gm(15, 33).c(3.0F).b(5.0F).a(i);
   public static final ln I = new gm(16, 34).c(3.0F).b(5.0F).a(i);
   public static final ln J = new lw(17).c(2.0F).a(f);
   public static final iq K = (iq)new iq(18, 52).c(0.2F).d(1).a(h);
   public static final ln L = new mt(19).c(0.6F).a(h);
   public static final ln M = new cp(20, 49, fs.o, false).c(0.3F).a(k);
   public static final ln N = null;
   public static final ln O = null;
   public static final ln P = null;
   public static final ln Q = null;
   public static final ln R = null;
   public static final ln S = null;
   public static final ln T = null;
   public static final ln U = null;
   public static final ln V = null;
   public static final ln W = null;
   public static final ln X = null;
   public static final ln Y = null;
   public static final ln Z = null;
   public static final ln aa = null;
   public static final ln ab = new ln(35, 64, fs.k).c(0.8F).a(l);
   public static final ln ac = null;
   public static final me ad = (me)new me(37, 13).c(0.0F).a(h);
   public static final me ae = (me)new me(38, 12).c(0.0F).a(h);
   public static final me af = (me)new kn(39, 29).c(0.0F).a(h).a(0.125F);
   public static final me ag = (me)new kn(40, 28).c(0.0F).a(h);
   public static final ln ah = new c(41, 39).c(3.0F).b(10.0F).a(j);
   public static final ln ai = new c(42, 38).c(5.0F).b(10.0F).a(j);
   public static final ln aj = new nu(43, true).c(2.0F).b(10.0F).a(i);
   public static final ln ak = new nu(44, false).c(2.0F).b(10.0F).a(i);
   public static final ln al = new ln(45, 7, fs.d).c(2.0F).b(10.0F).a(i);
   public static final ln am = new p(46, 8).c(0.0F).a(h);
   public static final ln an = new dn(47, 35).c(1.5F).a(f);
   public static final ln ao = new ln(48, 36, fs.d).c(2.0F).b(10.0F).a(i);
   public static final ln ap = new ci(49, 37).c(10.0F).b(2000.0F).a(i);
   public static final ln aq = new lz(50, 80).c(0.0F).a(0.9375F).a(f);
   public static final ns ar = (ns)new ns(51, 31).c(0.0F).a(1.0F).a(f);
   public static final ln as = new bf(52, 65).c(5.0F).a(j);
   public static final ln at = new kb(53, x);
   public static final ln au = new b(54).c(2.5F).a(f);
   public static final ln av = new jv(55, 84).c(0.0F).a(e);
   public static final ln aw = new gm(56, 50).c(3.0F).b(5.0F).a(i);
   public static final ln ax = new c(57, 40).c(5.0F).b(10.0F).a(j);
   public static final ln ay = new co(58).c(2.5F).a(f);
   public static final ln az = new gt(59, 88).c(0.0F).a(h);
   public static final ln aA = new ly(60).c(0.6F).a(g);
   public static final ln aB = new kj(61, false).c(3.5F).a(i);
   public static final ln aC = new kj(62, true).c(3.5F).a(i).a(0.875F);
   public static final ln aD = new lg(63, nn.class, true).c(1.0F).a(f);
   public static final ln aE = new fn(64, fs.c).c(3.0F).a(f);
   public static final ln aF = new bn(65, 83).c(0.4F).a(f);
   public static final ln aG = new hv(66, 128).c(0.7F).a(j);
   public static final ln aH = new kb(67, w);
   public static final ln aI = new lg(68, nn.class, false).c(1.0F).a(f);
   public static final ln aJ = new nb(69, 96).c(0.5F).a(f);
   public static final ln aK;
   public static final ln aL = new fn(71, fs.e).c(5.0F).a(j);
   public static final ln aM;
   public static final ln aN = new ag(73, 51, false).c(3.0F).b(5.0F).a(i);
   public static final ln aO = new ag(74, 51, true).a(0.625F).c(3.0F).b(5.0F).a(i);
   public static final ln aP = new bc(75, 115, false).c(0.0F).a(f);
   public static final ln aQ = new bc(76, 99, true).c(0.0F).a(0.5F).a(f);
   public static final ln aR;
   public static final ln aS = new ev(78, 66).c(0.1F).a(l);
   public static final ln aT = new gu(79, 67).c(0.5F).d(3).a(k);
   public static final ln aU = new o(80, 66).c(0.2F).a(l);
   public static final ln aV = new ho(81, 70).c(0.4F).a(l);
   public static final ln aW = new jl(82, 72).c(0.6F).a(g);
   public static final ln aX = new jc(83, 73).c(0.0F).a(h);
   public static final ln aY = new cr(84, 74).c(2.0F).b(10.0F).a(i);
   public int aZ;
   public final int ba;
   protected float bb;
   protected float bc;
   public double bd;
   public double be;
   public double bf;
   public double bg;
   public double bh;
   public double bi;
   public ax bj = e;
   public float bk = 1.0F;
   public final fs bl;
   public float bm = 0.6F;

   protected ln(int var1, fs var2) {
      if (n[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + n[var1] + " when adding " + this);
      }

      this.bl = var2;
      n[var1] = this;
      this.ba = var1;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      p[var1] = this.b();
      q[var1] = this.b() ? 255 : 0;
      r[var1] = this.i();
   }

   protected ln(int var1, int var2, fs var3) {
      this(var1, var3);
      this.aZ = var2;
   }

   protected ln a(ax var1) {
      this.bj = var1;
      return this;
   }

   protected ln d(int var1) {
      q[this.ba] = var1;
      return this;
   }

   protected ln a(float var1) {
      s[this.ba] = (int)(15.0F * var1);
      return this;
   }

   protected ln b(float var1) {
      this.bc = var1 * 3.0F;
      return this;
   }

   private boolean i() {
      return false;
   }

   public boolean c() {
      return true;
   }

   public int f() {
      return 0;
   }

   protected ln c(float var1) {
      this.bb = var1;
      if (this.bc < var1 * 5.0F) {
         this.bc = var1 * 5.0F;
      }

      return this;
   }

   protected void b(boolean var1) {
      o[this.ba] = var1;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.bd = var1;
      this.be = var2;
      this.bf = var3;
      this.bg = var4;
      this.bh = var5;
      this.bi = var6;
   }

   public float c(mz var1, int var2, int var3, int var4) {
      return var1.c(var2, var3, var4);
   }

   public boolean c(mz var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0 && this.be > 0.0) {
         return true;
      } else if (var5 == 1 && this.bh < 1.0) {
         return true;
      } else if (var5 == 2 && this.bf > 0.0) {
         return true;
      } else if (var5 == 3 && this.bi < 1.0) {
         return true;
      } else if (var5 == 4 && this.bd > 0.0) {
         return true;
      } else {
         return var5 == 5 && this.bg < 1.0 ? true : !var1.g(var2, var3, var4);
      }
   }

   public int a(mz var1, int var2, int var3, int var4, int var5) {
      return this.a(var5, var1.e(var2, var3, var4));
   }

   public int a(int var1, int var2) {
      return this.a(var1);
   }

   public int a(int var1) {
      return this.aZ;
   }

   public cb f(cj var1, int var2, int var3, int var4) {
      return cb.b(var2 + this.bd, var3 + this.be, var4 + this.bf, var2 + this.bg, var3 + this.bh, var4 + this.bi);
   }

   public void a(cj var1, int var2, int var3, int var4, cb var5, ArrayList var6) {
      cb var7 = this.d(var1, var2, var3, var4);
      if (var7 != null && var5.a(var7)) {
         var6.add(var7);
      }
   }

   public cb d(cj var1, int var2, int var3, int var4) {
      return cb.b(var2 + this.bd, var3 + this.be, var4 + this.bf, var2 + this.bg, var3 + this.bh, var4 + this.bi);
   }

   public boolean b() {
      return true;
   }

   public boolean a(int var1, boolean var2) {
      return this.h();
   }

   public boolean h() {
      return true;
   }

   public void a(cj var1, int var2, int var3, int var4, Random var5) {
   }

   public void b(cj var1, int var2, int var3, int var4, Random var5) {
   }

   public void b(cj var1, int var2, int var3, int var4, int var5) {
   }

   public void a(cj var1, int var2, int var3, int var4, int var5) {
   }

   public int a() {
      return 10;
   }

   public void e(cj var1, int var2, int var3, int var4) {
   }

   public void b(cj var1, int var2, int var3, int var4) {
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2) {
      return this.ba;
   }

   public float a(dg var1) {
      if (this.bb < 0.0F) {
         return 0.0F;
      } else {
         return !var1.b(this) ? 1.0F / this.bb / 100.0F : var1.a(this) / this.bb / 30.0F;
      }
   }

   public void b_(cj var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 1.0F);
   }

   public void a(cj var1, int var2, int var3, int var4, int var5, float var6) {
      if (!var1.v) {
         int var7 = this.a(var1.m);

         for (int var8 = 0; var8 < var7; var8++) {
            if (!(var1.m.nextFloat() > var6)) {
               int var9 = this.a(var5, var1.m);
               if (var9 > 0) {
                  float var10 = 0.7F;
                  double var11 = var1.m.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  double var13 = var1.m.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  double var15 = var1.m.nextFloat() * var10 + (1.0F - var10) * 0.5;
                  dr var17 = new dr(var1, var2 + var11, var3 + var13, var4 + var15, new eo(var9));
                  var17.c = 10;
                  var1.a(var17);
               }
            }
         }
      }
   }

   public float a(jx var1) {
      return this.bc / 5.0F;
   }

   public lv a(cj var1, int var2, int var3, int var4, ah var5, ah var6) {
      this.a((mz)var1, var2, var3, var4);
      var5 = var5.c(-var2, -var3, -var4);
      var6 = var6.c(-var2, -var3, -var4);
      ah var7 = var5.a(var6, this.bd);
      ah var8 = var5.a(var6, this.bg);
      ah var9 = var5.b(var6, this.be);
      ah var10 = var5.b(var6, this.bh);
      ah var11 = var5.c(var6, this.bf);
      ah var12 = var5.c(var6, this.bi);
      if (!this.a(var7)) {
         var7 = null;
      }

      if (!this.a(var8)) {
         var8 = null;
      }

      if (!this.b(var9)) {
         var9 = null;
      }

      if (!this.b(var10)) {
         var10 = null;
      }

      if (!this.c(var11)) {
         var11 = null;
      }

      if (!this.c(var12)) {
         var12 = null;
      }

      ah var13 = null;
      if (var7 != null && (var13 == null || var5.c(var7) < var5.c(var13))) {
         var13 = var7;
      }

      if (var8 != null && (var13 == null || var5.c(var8) < var5.c(var13))) {
         var13 = var8;
      }

      if (var9 != null && (var13 == null || var5.c(var9) < var5.c(var13))) {
         var13 = var9;
      }

      if (var10 != null && (var13 == null || var5.c(var10) < var5.c(var13))) {
         var13 = var10;
      }

      if (var11 != null && (var13 == null || var5.c(var11) < var5.c(var13))) {
         var13 = var11;
      }

      if (var12 != null && (var13 == null || var5.c(var12) < var5.c(var13))) {
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

      return new lv(var2, var3, var4, var14, var13.c(var2, var3, var4));
   }

   private boolean a(ah var1) {
      return var1 == null ? false : var1.b >= this.be && var1.b <= this.bh && var1.c >= this.bf && var1.c <= this.bi;
   }

   private boolean b(ah var1) {
      return var1 == null ? false : var1.a >= this.bd && var1.a <= this.bg && var1.c >= this.bf && var1.c <= this.bi;
   }

   private boolean c(ah var1) {
      return var1 == null ? false : var1.a >= this.bd && var1.a <= this.bg && var1.b >= this.be && var1.b <= this.bh;
   }

   public void c(cj var1, int var2, int var3, int var4) {
   }

   public int g() {
      return 0;
   }

   public boolean a(cj var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0 || n[var5].bl.d();
   }

   public boolean a(cj var1, int var2, int var3, int var4, dg var5) {
      return false;
   }

   public void a(cj var1, int var2, int var3, int var4, jx var5) {
   }

   public void d(cj var1, int var2, int var3, int var4, int var5) {
   }

   public void b(cj var1, int var2, int var3, int var4, dg var5) {
   }

   public void a(cj var1, int var2, int var3, int var4, jx var5, ah var6) {
   }

   public void a(mz var1, int var2, int var3, int var4) {
   }

   public int d(mz var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean b(mz var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean d() {
      return false;
   }

   public void b(cj var1, int var2, int var3, int var4, jx var5) {
   }

   public boolean c(cj var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void e() {
   }

   public void a_(cj var1, int var2, int var3, int var4, int var5) {
      this.b_(var1, var2, var3, var4, var5);
   }

   public boolean g(cj var1, int var2, int var3, int var4) {
      return true;
   }

   static {
      aK = new aj(70, t.aZ, ji.b).c(0.5F).a(i);
      aM = new aj(72, x.aZ, ji.a).c(0.5F).a(f);
      aR = new hk(77, t.aZ).c(0.5F).a(i);

      for (int var0 = 0; var0 < 256; var0++) {
         if (n[var0] != null) {
            dd.c[var0] = new ar(var0 - 256);
         }
      }
   }
}
