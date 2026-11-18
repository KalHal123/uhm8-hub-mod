import java.util.Random;

public class dd {
   protected static Random b = new Random();
   public static dd[] c = new dd[32000];
   public static dd d = new mg(0, 2).a(82);
   public static dd e = new x(1, 2).a(98);
   public static dd f = new kh(2, 2).a(114);
   public static dd g = new nk(3).a(5);
   public static dd h = new nv(4, 4).a(10);
   public static dd i = new ix(5).a(21);
   public static dd j = new dd(6).a(37);
   public static dd k = new dd(7).a(7);
   public static dd l = new dd(8).a(55);
   public static dd m = new dd(9).a(23);
   public static dd n = new dd(10).a(39);
   public static dd o = new ik(11, 2).a(66);
   public static dd p = new ik(12, 0).a(64);
   public static dd q = new mg(13, 0).a(80);
   public static dd r = new x(14, 0).a(96);
   public static dd s = new kh(15, 0).a(112);
   public static dd t = new ik(16, 1).a(65);
   public static dd u = new mg(17, 1).a(81);
   public static dd v = new x(18, 1).a(97);
   public static dd w = new kh(19, 1).a(113);
   public static dd x = new ik(20, 3).a(67);
   public static dd y = new mg(21, 3).a(83);
   public static dd z = new x(22, 3).a(99);
   public static dd A = new kh(23, 3).a(115);
   public static dd B = new dd(24).a(53).d();
   public static dd C = new dd(25).a(71);
   public static dd D = new am(26, 10).a(72);
   public static dd E = new ik(27, 0).a(68);
   public static dd F = new mg(28, 0).a(84);
   public static dd G = new x(29, 0).a(100);
   public static dd H = new kh(30, 0).a(116);
   public static dd I = new dd(31).a(8);
   public static dd J = new dd(32).a(24);
   public static dd K = new dd(33).a(40);
   public static dd L = new fl(34, 0).a(128);
   public static dd M = new fl(35, 1).a(129);
   public static dd N = new fl(36, 2).a(130);
   public static dd O = new fl(37, 3).a(131);
   public static dd P = new fl(38, 4).a(132);
   public static dd Q = new jd(39, ln.az.ba).a(9);
   public static dd R = new dd(40).a(25);
   public static dd S = new nv(41, 5).a(41);
   public static dd T = new mf(42, 0, 0, 0).a(0);
   public static dd U = new mf(43, 0, 0, 1).a(16);
   public static dd V = new mf(44, 0, 0, 2).a(32);
   public static dd W = new mf(45, 0, 0, 3).a(48);
   public static dd X = new mf(46, 1, 1, 0).a(1);
   public static dd Y = new mf(47, 1, 1, 1).a(17);
   public static dd Z = new mf(48, 1, 1, 2).a(33);
   public static dd aa = new mf(49, 1, 1, 3).a(49);
   public static dd ab = new mf(50, 2, 2, 0).a(2);
   public static dd ac = new mf(51, 2, 2, 1).a(18);
   public static dd ad = new mf(52, 2, 2, 2).a(34);
   public static dd ae = new mf(53, 2, 2, 3).a(50);
   public static dd af = new mf(54, 3, 3, 0).a(3);
   public static dd ag = new mf(55, 3, 3, 1).a(19);
   public static dd ah = new mf(56, 3, 3, 2).a(35);
   public static dd ai = new mf(57, 3, 3, 3).a(51);
   public static dd aj = new mf(58, 1, 4, 0).a(4);
   public static dd ak = new mf(59, 1, 4, 1).a(20);
   public static dd al = new mf(60, 1, 4, 2).a(36);
   public static dd am = new mf(61, 1, 4, 3).a(52);
   public static dd an = new dd(62).a(6);
   public static dd ao = new nv(63, 3).a(87);
   public static dd ap = new nv(64, 8).a(88);
   public static dd aq = new np(65).a(26);
   public static dd ar = new nv(66, 42).a(11);
   public static dd as = new lt(67).a(42);
   public static dd at = new dw(68, fs.c).a(43);
   public static dd au = new aa(69, 0).a(74);
   public static dd av = new aa(70, ln.A.ba).a(75);
   public static dd aw = new aa(71, ln.C.ba).a(76);
   public static dd ax = new je(72, 0).a(135);
   public static dd ay = new jm(73).a(104);
   public static dd az = new dw(74, fs.e).a(44);
   public static dd aA = new dz(75).a(56);
   public static dd aB = new bl(76).a(14);
   public static dd aC = new lu(77).a(136);
   public static dd aD = new dd(78).a(103);
   public static dd aE = new dd(79).a(77);
   public static dd aF = new dd(80).a(22);
   public static dd aG = new dd(81).a(57);
   public static dd aH = new fw(82, ln.aX).a(27);
   public static dd aI = new dd(83).a(58);
   public static dd aJ = new dd(84).a(59);
   public static dd aK = new dd(85).a(30);
   public static dd aL = new je(86, 1).a(151);
   public static dd aM = new je(87, 2).a(167);
   public static dd aN = new dd(88).a(12);
   public static dd aO = new kv(2000, "13").a(240);
   public static dd aP = new kv(2001, "cat").a(241);
   public final int aQ;
   protected int aR = 64;
   protected int aS = 32;
   protected int aT;
   protected boolean aU = false;

   protected dd(int var1) {
      this.aQ = 256 + var1;
      if (c[256 + var1] != null) {
         System.out.println("CONFLICT @ " + var1);
      }

      c[256 + var1] = this;
   }

   public dd a(int var1) {
      this.aT = var1;
      return this;
   }

   public int a(eo var1) {
      return this.aT;
   }

   public boolean a(eo var1, dg var2, cj var3, int var4, int var5, int var6, int var7) {
      return false;
   }

   public float a(eo var1, ln var2) {
      return 1.0F;
   }

   public eo a(eo var1, cj var2, dg var3) {
      return var1;
   }

   public int b() {
      return this.aR;
   }

   public int c() {
      return this.aS;
   }

   public void a(eo var1, fv var2) {
   }

   public void a(eo var1, int var2, int var3, int var4, int var5) {
   }

   public int a(jx var1) {
      return 1;
   }

   public boolean a(ln var1) {
      return false;
   }

   public void b(eo var1, fv var2) {
   }

   public dd d() {
      this.aU = true;
      return this;
   }

   public boolean a() {
      return this.aU;
   }
}
