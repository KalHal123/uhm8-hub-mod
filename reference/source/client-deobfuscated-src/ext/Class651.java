package ext;

public class Class651 extends Class755 {
   public int field_1637;

   public Class651(int var1, int var2) {
      super(var1);
      this.field_2438 = 1;
      this.field_1637 = var2;
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.method_197(var4, var5, var6);
      if (var8 == Class108.field_1008.field_2151) {
         var3.method_1447(new Class527(var3, var4 + 0.5F, var5 + 0.5F, var6 + 0.5F, this.field_1637));
         var1.field_2326--;
         return true;
      } else {
         return false;
      }
   }
}
