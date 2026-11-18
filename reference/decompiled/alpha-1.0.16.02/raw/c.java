public class c extends ln {
   public c(int var1, int var2) {
      super(var1, fs.e);
      this.aZ = var2;
   }

   @Override
   public int a(int var1) {
      if (var1 == 1) {
         return this.aZ - 16;
      } else {
         return var1 == 0 ? this.aZ + 16 : this.aZ;
      }
   }
}
