package ext;

class Class576 extends Class719 {
   final int field_2442;
   final Class392 field_844;

   Class576(Class392 var1, Class355 var2, Interface181 var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6);
      this.field_844 = var1;
      this.field_2442 = var7;
   }

   @Override
   public boolean method_324(Class334 var1) {
      return var1.method_801() instanceof Class725 ? ((Class725)var1.method_801()).field_3044 == this.field_2442 : false;
   }

   @Override
   public int method_149() {
      return 15 + this.field_2442 * 16;
   }
}
