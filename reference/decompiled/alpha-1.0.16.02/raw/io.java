class io extends dl {
   private final fy e;

   public io(dy var1, fy var2, fy var3, int var4, int var5, int var6) {
      super(var1, var3, var4, var5, var6);
      this.e = var2;
   }

   @Override
   public boolean a(eo var1) {
      return false;
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < this.e.a(); var1++) {
         if (this.e.a_(var1) != null) {
            this.e.a(var1, 1);
         }
      }
   }
}
