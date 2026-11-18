public class co extends ln {
   protected co(int var1) {
      super(var1, fs.c);
      this.aZ = 59;
   }

   @Override
   public int a(int var1) {
      if (var1 == 1) {
         return this.aZ - 16;
      } else if (var1 == 0) {
         return ln.x.a(0);
      } else {
         return var1 != 2 && var1 != 4 ? this.aZ : this.aZ + 1;
      }
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4, dg var5) {
      var5.k();
      return true;
   }
}
