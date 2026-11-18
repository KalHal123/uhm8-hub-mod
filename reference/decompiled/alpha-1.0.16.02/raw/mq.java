public class mq {
   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b = new Object[][]{{ln.x, ln.w, dd.m, dd.l, dd.n}, {dd.p, dd.t, dd.o, dd.x, dd.E}};

   public void a(dq var1) {
      for (int var2 = 0; var2 < this.b[0].length; var2++) {
         Object var3 = this.b[0][var2];

         for (int var4 = 0; var4 < this.b.length - 1; var4++) {
            dd var5 = (dd)this.b[var4 + 1][var2];
            var1.a(new eo(var5), this.a[var4], '#', dd.B, 'X', var3);
         }
      }

      var1.a(new eo(dd.i, 1), " #X", "# X", " #X", 'X', dd.I, '#', dd.B);
      var1.a(new eo(dd.j, 4), "X", "#", "Y", 'Y', dd.J, 'X', dd.an, '#', dd.B);
   }
}
