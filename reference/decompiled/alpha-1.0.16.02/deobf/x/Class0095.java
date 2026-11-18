package x;

public class Class0095 {
   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b = new Object[][]{
      {Class0312.x, Class0312.w, Class0086.m, Class0086.l, Class0086.n},
      {Class0086.r, Class0086.v, Class0086.e, Class0086.z, Class0086.G},
      {Class0086.q, Class0086.u, Class0086.d, Class0086.y, Class0086.F},
      {Class0086.s, Class0086.w, Class0086.f, Class0086.A, Class0086.H},
      {Class0086.L, Class0086.M, Class0086.N, Class0086.O, Class0086.P}
   };

   public void a(Class0099 var1) {
      for (int var2 = 0; var2 < this.b[0].length; var2++) {
         Object var3 = this.b[0][var2];

         for (int var4 = 0; var4 < this.b.length - 1; var4++) {
            Class0086 var5 = (Class0086)this.b[var4 + 1][var2];
            var1.a(new Class0124(var5), this.a[var4], '#', Class0086.B, 'X', var3);
         }
      }
   }
}
