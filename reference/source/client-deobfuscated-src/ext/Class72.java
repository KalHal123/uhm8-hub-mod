package ext;

import java.util.Random;

public class Class72 extends Class405 {
   Class581 field_1727;
   Random field_2313;

   public Class72(Class581 var1) {
      super(var1, var1.field_482);
      this.field_1727 = var1;
      this.field_2313 = new Random(this.field_1727.field_482);
   }

   @Override
   public Class741 method_1337(int var1, int var2) {
      Class741 var3 = new Class741(this.field_1727, new byte[32768], var1, var2);
      var3.field_347 = true;

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            var3.field_2711[Class100.method_1663(var4, 0, var5)] = (byte)Class390.field_1931.field_2151;
         }
      }

      var3.method_1475();
      return var3;
   }

   @Override
   public void method_1834(Interface752 var1, int var2, int var3) {
      Thread227.method_233(new Class169(this, var1, var2, var3), this);
   }

   @Override
   public void method_744(Interface752 var1, int var2, int var3) {
   }
}
