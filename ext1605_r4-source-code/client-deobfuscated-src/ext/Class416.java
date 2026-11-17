package ext;

public class Class416 extends Class428 {
   public Class322 field_2050 = new Class322(this, 3, 3);
   public Interface181 field_675 = new Class260();

   @Override
   public void method_314(Interface181 var1) {
      int[] var2 = new int[9];

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var4 = 0; var4 < 3; var4++) {
            int var5 = var3 + var4 * 3;
            Class334 var6 = this.field_2050.method_1416(var5);
            if (var6 == null) {
               var2[var5] = -1;
            } else {
               var2[var5] = var6.field_1782;
            }
         }
      }

      this.field_675.method_708(0, Class484.method_361().method_477(var2));
   }

   @Override
   public void method_1222(Class354 var1) {
      super.method_1222(var1);

      for (int var2 = 0; var2 < 9; var2++) {
         Class334 var3 = this.field_2050.method_1416(var2);
         if (var3 != null) {
            var1.method_1771(var3);
         }
      }
   }
}
