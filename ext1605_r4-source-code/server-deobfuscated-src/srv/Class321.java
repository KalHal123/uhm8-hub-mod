package srv;

public class Class321 extends Class64 {
   int[] field_594 = new int[]{3, 0, 3, 1, 2, 2, 1, 3, 0, 3, -1, 3, -2, 2, -3, 1, -3, 0, -3, -1, -2, -2, -1, -3, 0, -3, 1, -3, 2, -2, 3, -1};

   public Class321(int var1) {
      super(var1, 2);
   }

   public boolean method_484(int var1) {
      return var1 == 0 || var1 == 78;
   }

   public void method_509(Class317 var1, int var2, int var3, int var4, int var5) {
      if (var5 != 6) {
         int var6 = var1.method_813(var2, var3, var4);
         int var7 = var1.method_813(var2, var3 - 1, var4);
         if (this.method_484(var6)) {
            if (this.method_484(var7)) {
               this.method_509(var1, var2, var3 - 1, var4, var5 + 1);
            }
         } else {
            this.method_509(var1, var2, var3 + 1, var4, var5 + 1);
         }
      }
   }

   @Override
   public Class150 method_475(Class150 var1, Class317 var2, Class41 var3) {
      int var4 = (int)var3.field_1324;
      int var5 = (int)var3.field_632;
      int var6 = (int)var3.field_1321;
      var2.method_621((float)var3.field_1324, (float)var3.field_632 + 0.5F, (float)var3.field_1321, "ext.useflame", 0.4F, field_1108.nextFloat() * 0.3F + 0.7F);

      for (int var7 = 0; var7 != this.field_594.length / 2; var7++) {
         this.method_509(var2, var4 + this.field_594[var7 * 2], var5, var6 + this.field_594[var7 * 2 + 1], 0);
      }

      return var1;
   }
}
