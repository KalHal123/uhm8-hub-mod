package ext;

public class Class338 extends Class706 {
   int[] field_2419 = new int[]{3, 0, 3, 1, 2, 2, 1, 3, 0, 3, -1, 3, -2, 2, -3, 1, -3, 0, -3, -1, -2, -2, -1, -3, 0, -3, 1, -3, 2, -2, 3, -1};

   public Class338(int var1) {
      super(var1, 2);
   }

   public boolean method_25(int var1) {
      return var1 == 0 || var1 == 78;
   }

   public void method_1912(Class454 var1, int var2, int var3, int var4, int var5) {
      if (var5 != 6) {
         int var6 = var1.method_197(var2, var3, var4);
         int var7 = var1.method_197(var2, var3 - 1, var4);
         if (this.method_25(var6)) {
            if (!this.method_25(var7)) {
               Class100.method_522(var1, var2, var3, var4, Class108.field_1781.field_2151);
            } else {
               this.method_1912(var1, var2, var3 - 1, var4, var5 + 1);
            }
         } else {
            this.method_1912(var1, var2, var3 + 1, var4, var5 + 1);
         }
      }
   }

   @Override
   public Class334 method_1566(Class334 var1, Class454 var2, Class354 var3) {
      int var4 = (int)var3.field_1417;
      int var5 = (int)var3.field_2654;
      int var6 = (int)var3.field_2013;
      var2.method_861((float)var3.field_1417, (float)var3.field_2654 + 0.5F, (float)var3.field_2013, "ext.useflame", 0.4F, field_2073.nextFloat() * 0.3F + 0.7F);

      for (int var7 = 0; var7 != this.field_2419.length / 2; var7++) {
         this.method_1912(var2, var4 + this.field_2419[var7 * 2], var5, var6 + this.field_2419[var7 * 2 + 1], 0);
      }

      return var1;
   }
}
