import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class dq {
   private static final dq a = new dq();
   private List b = new ArrayList();

   public static final dq a() {
      return a;
   }

   private dq() {
      new dm().a(this);
      new mq().a(this);
      new ku().a(this);
      new hh().a(this);
      new fa().a(this);
      new m().a(this);
      this.a(new eo(dd.aI, 3), "###", '#', dd.aH);
      this.a(new eo(dd.aJ, 1), "#", "#", "#", '#', dd.aI);
      this.a(new eo(ln.aY, 1), "###", "#X#", "###", '#', ln.x, 'X', dd.l);
      this.a(new eo(ln.an, 1), "###", "XXX", "###", '#', ln.x, 'X', dd.aJ);
      this.a(new eo(ln.aU, 1), "##", "##", '#', dd.aB);
      this.a(new eo(ln.aW, 1), "##", "##", '#', dd.aG);
      this.a(new eo(ln.al, 1), "##", "##", '#', dd.aF);
      this.a(new eo(ln.ab, 1), "###", "###", "###", '#', dd.I);
      this.a(new eo(ln.am, 1), "X#X", "#X#", "X#X", 'X', dd.K, '#', ln.E);
      this.a(new eo(ln.ak, 3), "###", '#', ln.w);
      this.a(new eo(ln.aF, 1), "# #", "###", "# #", '#', dd.B);
      this.a(new eo(dd.at, 1), "##", "##", "##", '#', ln.x);
      this.a(new eo(dd.az, 1), "##", "##", "##", '#', dd.m);
      this.a(new eo(dd.as, 1), "###", "###", " X ", '#', ln.x, 'X', dd.B);
      this.a(new eo(ln.x, 4), "#", '#', ln.J);
      this.a(new eo(dd.B, 4), "#", "#", '#', ln.x);
      this.a(new eo(ln.aq, 4), "X", "#", 'X', dd.k, '#', dd.B);
      this.a(new eo(dd.C, 4), "# #", " # ", '#', ln.x);
      this.a(new eo(ln.aG, 16), "X X", "X#X", "X X", 'X', dd.m, '#', dd.B);
      this.a(new eo(dd.ax, 1), "# #", "###", '#', dd.m);
      this.a(new eo(dd.aL, 1), "A", "B", 'A', ln.au, 'B', dd.ax);
      this.a(new eo(dd.aM, 1), "A", "B", 'A', ln.aB, 'B', dd.ax);
      this.a(new eo(dd.aC, 1), "# #", "###", '#', ln.x);
      this.a(new eo(dd.au, 1), "# #", " # ", '#', dd.m);
      this.a(new eo(dd.g, 1), "A ", " B", 'A', dd.m, 'B', dd.an);
      this.a(new eo(dd.S, 1), "###", '#', dd.R);
      this.a(new eo(ln.at, 4), "#  ", "## ", "###", '#', ln.x);
      this.a(new eo(ln.aH, 4), "#  ", "## ", "###", '#', ln.w);
      this.a(new eo(dd.aq, 1), "###", "#X#", "###", '#', dd.B, 'X', ln.ab);
      this.a(new eo(dd.ar, 1), "###", "#X#", "###", '#', ln.ah, 'X', dd.h);
      this.a(new eo(ln.aJ, 1), "X", "#", '#', ln.w, 'X', dd.B);
      this.a(new eo(ln.aQ, 1), "X", "#", '#', dd.B, 'X', dd.aA);
      this.a(new eo(ln.aR, 1), "#", "#", '#', ln.t);
      this.a(new eo(ln.aK, 1), "###", '#', ln.t);
      this.a(new eo(ln.aM, 1), "###", '#', ln.x);
      Collections.sort(this.b, new fj(this));
      System.out.println(this.b.size() + " recipes");
   }

   void a(eo var1, Object... var2) {
      String var3 = "";
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if (var2[var4] instanceof String[]) {
         String[] var11 = (String[])var2[var4++];

         for (int var8 = 0; var8 < var11.length; var8++) {
            String var9 = var11[var8];
            var6++;
            var5 = var9.length();
            var3 = var3 + var9;
         }
      } else {
         while (var2[var4] instanceof String) {
            String var7 = (String)var2[var4++];
            var6++;
            var5 = var7.length();
            var3 = var3 + var7;
         }
      }

      HashMap var12 = new HashMap();

      while (var4 < var2.length) {
         Character var13 = (Character)var2[var4];
         int var15 = 0;
         if (var2[var4 + 1] instanceof dd) {
            var15 = ((dd)var2[var4 + 1]).aQ;
         } else if (var2[var4 + 1] instanceof ln) {
            var15 = ((ln)var2[var4 + 1]).ba;
         }

         var12.put(var13, var15);
         var4 += 2;
      }

      int[] var14 = new int[var5 * var6];

      for (int var16 = 0; var16 < var5 * var6; var16++) {
         char var10 = var3.charAt(var16);
         if (var12.containsKey(var10)) {
            var14[var16] = (Integer)var12.get(var10);
         } else {
            var14[var16] = -1;
         }
      }

      this.b.add(new br(var5, var6, var14, var1));
   }

   public eo a(int[] var1) {
      for (int var2 = 0; var2 < this.b.size(); var2++) {
         br var3 = (br)this.b.get(var2);
         if (var3.a(var1)) {
            return var3.b(var1);
         }
      }

      return null;
   }
}
