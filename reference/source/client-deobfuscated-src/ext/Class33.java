package ext;

public abstract class Class33 extends Class481 {
   public Class33(Class454 var1) {
      super(var1);
   }

   @Override
   protected float method_723(int var1, int var2, int var3) {
      return this.field_1468.method_197(var1, var2 - 1, var3) == Class108.field_1970.field_2151 ? 10.0F : this.field_1468.method_1154(var1, var2, var3) - 0.5F;
   }

   @Override
   public void method_863(Class686 var1) {
      super.method_863(var1);
   }

   @Override
   public void method_1054(Class686 var1) {
      super.method_1054(var1);
   }

   @Override
   public boolean method_713() {
      int var1 = Class469.method_468(this.field_1417);
      int var2 = Class469.method_468(this.field_235.field_946);
      int var3 = Class469.method_468(this.field_2013);
      return this.field_1468.method_197(var1, var2 - 1, var3) == Class108.field_1970.field_2151
         && this.field_1468.method_1676(var1, var2, var3) > 8
         && super.method_713();
   }

   @Override
   public int method_1109() {
      return 120;
   }
}
