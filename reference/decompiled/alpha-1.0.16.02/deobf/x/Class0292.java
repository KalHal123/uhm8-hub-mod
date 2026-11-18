package x;

public class Class0292 {
   private Object[][] a = new Object[][]{{Class0312.ah, Class0086.n}, {Class0312.ai, Class0086.m}, {Class0312.ax, Class0086.l}};

   public void a(Class0099 var1) {
      for (int var2 = 0; var2 < this.a.length; var2++) {
         Class0312 var3 = (Class0312)this.a[var2][0];
         Class0086 var4 = (Class0086)this.a[var2][1];
         var1.a(new Class0124(var3), "###", "###", "###", '#', var4);
         var1.a(new Class0124(var4, 9), "#", '#', var3);
      }
   }
}
