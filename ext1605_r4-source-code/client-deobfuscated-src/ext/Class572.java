package ext;

class Class572 extends Class82 {
   final Class420 field_2715;

   Class572(Class420 var1, int var2, Class var3, Class<? extends Class377>[] var4) {
      super(var2, var3, var4);
      this.field_2715 = var1;
   }

   @Override
   protected Class450 method_278(Class454 var1, int var2, int var3) {
      int var4 = var2 + var1.field_2150.nextInt(16);
      int var5 = var1.field_2150.nextInt(var1.field_2150.nextInt(120) + 8);
      int var6 = var3 + var1.field_2150.nextInt(16);
      return new Class450(var4, var5, var6);
   }
}
