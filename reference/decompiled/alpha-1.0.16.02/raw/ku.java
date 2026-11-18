public class ku {
   private Object[][] a = new Object[][]{{ln.ah, dd.n}, {ln.ai, dd.m}, {ln.ax, dd.l}};

   public void a(dq var1) {
      for (int var2 = 0; var2 < this.a.length; var2++) {
         ln var3 = (ln)this.a[var2][0];
         dd var4 = (dd)this.a[var2][1];
         var1.a(new eo(var3), "###", "###", "###", '#', var4);
         var1.a(new eo(var4, 9), "#", '#', var3);
      }
   }
}
