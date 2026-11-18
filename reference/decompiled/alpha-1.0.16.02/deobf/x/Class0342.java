package x;

public class Class0342 {
   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b = new Object[][]{
      {Class0312.x, Class0312.w, Class0086.m, Class0086.l, Class0086.n}, {Class0086.p, Class0086.t, Class0086.o, Class0086.x, Class0086.E}
   };

   public void a(Class0099 var1) {
      for (int var2 = 0; var2 < this.b[0].length; var2++) {
         Object var3 = this.b[0][var2];

         for (int var4 = 0; var4 < this.b.length - 1; var4++) {
            Class0086 var5 = (Class0086)this.b[var4 + 1][var2];
            var1.a(new Class0124(var5), this.a[var4], '#', Class0086.B, 'X', var3);
         }
      }

      var1.a(new Class0124(Class0086.i, 1), " #X", "# X", " #X", 'X', Class0086.I, '#', Class0086.B);
      var1.a(new Class0124(Class0086.j, 4), "X", "#", "Y", 'Y', Class0086.J, 'X', Class0086.an, '#', Class0086.B);
   }
}
