package ext;

public class Class742 extends Class708 {
   public boolean field_413 = true;
   public int field_2269;
   public int field_291;

   public Class742(int var1, int var2, Class160 var3, boolean var4) {
      super(var1, var2, var3, var4);
      this.field_2269 = var1;
      this.field_291 = var2;
   }

   @Override
   public int method_213(Interface698 var1, int var2, int var3, int var4, int var5) {
      return this.field_413 ? this.field_291 : 160;
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      if (!(var1 instanceof Class262) && !(var1 instanceof Class46)) {
         Class334 var6 = var5.field_559.method_93();
         if (var6 == null) {
            this.field_413 = !this.field_413;
            var1.method_1481(var2, var3, var4, this.field_2269);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
