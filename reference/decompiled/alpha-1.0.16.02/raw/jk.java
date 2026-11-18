public abstract class jk extends ln {
   protected jk(int var1, fs var2) {
      super(var1, var2);
   }

   protected jk(int var1, int var2, fs var3) {
      super(var1, var2, var3);
   }

   @Override
   public void e(cj var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      var1.a(var2, var3, var4, this.a_());
   }

   @Override
   public void b(cj var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      var1.l(var2, var3, var4);
   }

   protected abstract ht a_();
}
