public class m {
   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b = new Object[][]{
      {dd.aD, ln.ar, dd.m, dd.l, dd.n},
      {dd.T, dd.X, dd.ab, dd.af, dd.aj},
      {dd.U, dd.Y, dd.ac, dd.ag, dd.ak},
      {dd.V, dd.Z, dd.ad, dd.ah, dd.al},
      {dd.W, dd.aa, dd.ae, dd.ai, dd.am}
   };

   public void a(dq var1) {
      for (int var2 = 0; var2 < this.b[0].length; var2++) {
         Object var3 = this.b[0][var2];

         for (int var4 = 0; var4 < this.b.length - 1; var4++) {
            dd var5 = (dd)this.b[var4 + 1][var2];
            var1.a(new eo(var5), this.a[var4], 'X', var3);
         }
      }
   }
}
