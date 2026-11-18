class l extends av {
   l(hp var1, int var2, Class var3, Class[] var4) {
      super(var2, var3, var4);
      this.a = var1;
   }

   @Override
   protected mh a(cj var1, int var2, int var3) {
      int var4 = var2 + var1.m.nextInt(16);
      int var5 = var1.m.nextInt(var1.m.nextInt(120) + 8);
      int var6 = var3 + var1.m.nextInt(16);
      return new mh(var4, var5, var6);
   }
}
