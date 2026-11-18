public class dm {
   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b = new Object[][]{
      {ln.x, ln.w, dd.m, dd.l, dd.n},
      {dd.r, dd.v, dd.e, dd.z, dd.G},
      {dd.q, dd.u, dd.d, dd.y, dd.F},
      {dd.s, dd.w, dd.f, dd.A, dd.H},
      {dd.L, dd.M, dd.N, dd.O, dd.P}
   };

   public void a(dq var1) {
      for (int var2 = 0; var2 < this.b[0].length; var2++) {
         Object var3 = this.b[0][var2];

         for (int var4 = 0; var4 < this.b.length - 1; var4++) {
            dd var5 = (dd)this.b[var4 + 1][var2];
            var1.a(new eo(var5), this.a[var4], '#', dd.B, 'X', var3);
         }
      }
   }
}
