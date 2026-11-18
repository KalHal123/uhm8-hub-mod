package x;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Class0099 {
   private static final Class0099 a = new Class0099();
   private List b = new ArrayList();

   public static final Class0099 a() {
      return a;
   }

   private Class0099() {
      new Class0095().a(this);
      new Class0342().a(this);
      new Class0292().a(this);
      new Class0198().a(this);
      new Class0137().a(this);
      new Class0325().a(this);
      this.a(new Class0124(Class0086.aI, 3), "###", '#', Class0086.aH);
      this.a(new Class0124(Class0086.aJ, 1), "#", "#", "#", '#', Class0086.aI);
      this.a(new Class0124(Class0312.aY, 1), "###", "#X#", "###", '#', Class0312.x, 'X', Class0086.l);
      this.a(new Class0124(Class0312.an, 1), "###", "XXX", "###", '#', Class0312.x, 'X', Class0086.aJ);
      this.a(new Class0124(Class0312.aU, 1), "##", "##", '#', Class0086.aB);
      this.a(new Class0124(Class0312.aW, 1), "##", "##", '#', Class0086.aG);
      this.a(new Class0124(Class0312.al, 1), "##", "##", '#', Class0086.aF);
      this.a(new Class0124(Class0312.ab, 1), "###", "###", "###", '#', Class0086.I);
      this.a(new Class0124(Class0312.am, 1), "X#X", "#X#", "X#X", 'X', Class0086.K, '#', Class0312.E);
      this.a(new Class0124(Class0312.ak, 3), "###", '#', Class0312.w);
      this.a(new Class0124(Class0312.aF, 1), "# #", "###", "# #", '#', Class0086.B);
      this.a(new Class0124(Class0086.at, 1), "##", "##", "##", '#', Class0312.x);
      this.a(new Class0124(Class0086.az, 1), "##", "##", "##", '#', Class0086.m);
      this.a(new Class0124(Class0086.as, 1), "###", "###", " X ", '#', Class0312.x, 'X', Class0086.B);
      this.a(new Class0124(Class0312.x, 4), "#", '#', Class0312.J);
      this.a(new Class0124(Class0086.B, 4), "#", "#", '#', Class0312.x);
      this.a(new Class0124(Class0312.aq, 4), "X", "#", 'X', Class0086.k, '#', Class0086.B);
      this.a(new Class0124(Class0086.C, 4), "# #", " # ", '#', Class0312.x);
      this.a(new Class0124(Class0312.aG, 16), "X X", "X#X", "X X", 'X', Class0086.m, '#', Class0086.B);
      this.a(new Class0124(Class0086.ax, 1), "# #", "###", '#', Class0086.m);
      this.a(new Class0124(Class0086.aL, 1), "A", "B", 'A', Class0312.au, 'B', Class0086.ax);
      this.a(new Class0124(Class0086.aM, 1), "A", "B", 'A', Class0312.aB, 'B', Class0086.ax);
      this.a(new Class0124(Class0086.aC, 1), "# #", "###", '#', Class0312.x);
      this.a(new Class0124(Class0086.au, 1), "# #", " # ", '#', Class0086.m);
      this.a(new Class0124(Class0086.g, 1), "A ", " B", 'A', Class0086.m, 'B', Class0086.an);
      this.a(new Class0124(Class0086.S, 1), "###", '#', Class0086.R);
      this.a(new Class0124(Class0312.at, 4), "#  ", "## ", "###", '#', Class0312.x);
      this.a(new Class0124(Class0312.aH, 4), "#  ", "## ", "###", '#', Class0312.w);
      this.a(new Class0124(Class0086.aq, 1), "###", "#X#", "###", '#', Class0086.B, 'X', Class0312.ab);
      this.a(new Class0124(Class0086.ar, 1), "###", "#X#", "###", '#', Class0312.ah, 'X', Class0086.h);
      this.a(new Class0124(Class0312.aJ, 1), "X", "#", '#', Class0312.w, 'X', Class0086.B);
      this.a(new Class0124(Class0312.aQ, 1), "X", "#", '#', Class0086.B, 'X', Class0086.aA);
      this.a(new Class0124(Class0312.aR, 1), "#", "#", '#', Class0312.t);
      this.a(new Class0124(Class0312.aK, 1), "###", '#', Class0312.t);
      this.a(new Class0124(Class0312.aM, 1), "###", '#', Class0312.x);
      Collections.sort(this.b, new Class0146(this));
      System.out.println(this.b.size() + " recipes");
   }

   void a(Class0124 var1, Object... var2) {
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
         if (var2[var4 + 1] instanceof Class0086) {
            var15 = ((Class0086)var2[var4 + 1]).aQ;
         } else if (var2[var4 + 1] instanceof Class0312) {
            var15 = ((Class0312)var2[var4 + 1]).ba;
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

      this.b.add(new Class0046(var5, var6, var14, var1));
   }

   public Class0124 a(int[] var1) {
      for (int var2 = 0; var2 < this.b.size(); var2++) {
         Class0046 var3 = (Class0046)this.b.get(var2);
         if (var3.a(var1)) {
            return var3.b(var1);
         }
      }

      return null;
   }
}
