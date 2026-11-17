package ext;

public class Class6 extends Class428 {
   public Class322 field_2285;
   public Interface181 field_2483 = new Class260();

   public Class6(Class334[] var1) {
      this.field_2285 = new Class322(this, var1);
      this.method_314(this.field_2285);
   }

   @Override
   public void method_314(Interface181 var1) {
      int[] var2 = new int[9];

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var4 = 0; var4 < 3; var4++) {
            int var5 = -1;
            if (var3 < 2 && var4 < 2) {
               Class334 var6 = this.field_2285.method_1416(var3 + var4 * 2);
               if (var6 != null) {
                  var5 = var6.field_1782;
               }
            }

            var2[var3 + var4 * 3] = var5;
         }
      }

      this.field_2483.method_708(0, Class484.method_361().method_477(var2));
   }

   @Override
   public void method_1222(Class354 var1) {
      super.method_1222(var1);

      for (int var2 = 0; var2 < 9; var2++) {
         Class334 var3 = this.field_2285.method_1416(var2);
         if (var3 != null) {
            var1.method_1771(var3);
         }
      }
   }
}
