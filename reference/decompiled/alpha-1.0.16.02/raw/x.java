public class x extends bo {
   private static ln[] aV = new ln[]{ln.w, ln.aj, ln.ak, ln.t, ln.ao, ln.H, ln.ai, ln.I, ln.ah, ln.G, ln.aw, ln.ax, ln.aT};
   private int aW;

   public x(int var1, int var2) {
      super(var1, 2, var2, aV);
      this.aW = var2;
   }

   @Override
   public boolean a(ln var1) {
      if (var1 == ln.ap) {
         return this.aW == 3;
      } else if (var1 == ln.ax || var1 == ln.aw) {
         return this.aW >= 2;
      } else if (var1 == ln.ah || var1 == ln.G) {
         return this.aW >= 2;
      } else if (var1 == ln.ai || var1 == ln.H) {
         return this.aW >= 1;
      } else if (var1 == ln.aN || var1 == ln.aO) {
         return this.aW >= 2;
      } else {
         return var1.bl == fs.d ? true : var1.bl == fs.e;
      }
   }
}
