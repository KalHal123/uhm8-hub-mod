package ext;

import java.io.File;

public class Class581 extends Class454 {
   public Class581(File var1, long var2) {
      super(var1, "hub", var2);
      this.field_934 = 1;
      this.field_743 = false;
      this.field_439 = 1567L;
   }

   @Override
   protected Interface752 method_1226(File var1) {
      return new Class261(this, new Class660(var1, true), new Class72(this));
   }

   @Override
   protected boolean method_1706(int var1, int var2) {
      boolean var3 = false;

      for (int var4 = 0; var4 < 128; var4++) {
         var3 = this.method_197(var1, var4, var2) != 0;
      }

      return var3;
   }

   @Override
   public void method_982(Class354 var1) {
      super.method_982(var1);
   }

   public boolean method_1705(Class581 var1, int var2, int var3, int var4, Class270 var5) {
      return var1.method_1193(var2, var3, var4, Class390.field_2563.field_2151, var5.method_492().method_580());
   }
}
