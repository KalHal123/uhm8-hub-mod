package srv;

class Class304 extends Class170 {
   final Class325 field_553;

   Class304(Class325 var1, int var2, Class var3, Class[] var4) {
      super(var2, var3, var4);
      this.field_553 = var1;
   }

   @Override
   protected Class89 method_403(Class317 var1, int var2, int var3) {
      int var4 = var2 + var1.field_413.nextInt(16);
      int var5 = var1.field_413.nextInt(var1.field_413.nextInt(120) + 8);
      int var6 = var3 + var1.field_413.nextInt(16);
      return new Class89(var4, var5, var6);
   }
}
