package x;

class Class0296 extends Class0094 {
   Class0296(Class0302 var1, Class0107 var2, Class0161 var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6);
      this.f = var1;
      this.e = var7;
   }

   @Override
   public boolean a(Class0124 var1) {
      return var1.a() instanceof Class0331 ? ((Class0331)var1.a()).aV == this.e : false;
   }

   @Override
   public int c() {
      return 15 + this.e * 16;
   }
}
