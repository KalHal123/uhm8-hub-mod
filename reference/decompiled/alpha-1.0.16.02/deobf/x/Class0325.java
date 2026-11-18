package x;

public class Class0325 {
   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b = new Object[][]{
      {Class0086.aD, Class0312.ar, Class0086.m, Class0086.l, Class0086.n},
      {Class0086.T, Class0086.X, Class0086.ab, Class0086.af, Class0086.aj},
      {Class0086.U, Class0086.Y, Class0086.ac, Class0086.ag, Class0086.ak},
      {Class0086.V, Class0086.Z, Class0086.ad, Class0086.ah, Class0086.al},
      {Class0086.W, Class0086.aa, Class0086.ae, Class0086.ai, Class0086.am}
   };

   public void a(Class0099 var1) {
      for (int var2 = 0; var2 < this.b[0].length; var2++) {
         Object var3 = this.b[0][var2];

         for (int var4 = 0; var4 < this.b.length - 1; var4++) {
            Class0086 var5 = (Class0086)this.b[var4 + 1][var2];
            var1.a(new Class0124(var5), this.a[var4], 'X', var3);
         }
      }
   }
}
