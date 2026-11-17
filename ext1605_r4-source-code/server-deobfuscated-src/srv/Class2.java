package srv;

public class Class2 implements Interface351 {
   private int field_994;
   private int field_73;
   private Class166[][] field_892;
   private Class317 field_1574;

   public Class2(Class317 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_1574 = var1;
      this.field_994 = var2 >> 4;
      this.field_73 = var4 >> 4;
      int var8 = var5 >> 4;
      int var9 = var7 >> 4;
      this.field_892 = new Class166[var8 - this.field_994 + 1][var9 - this.field_73 + 1];

      for (int var10 = this.field_994; var10 <= var8; var10++) {
         for (int var11 = this.field_73; var11 <= var9; var11++) {
            this.field_892[var10 - this.field_994][var11 - this.field_73] = var1.method_695(var10, var11);
         }
      }
   }

   @Override
   public int method_813(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      int var4 = (var1 >> 4) - this.field_994;
      int var5 = (var3 >> 4) - this.field_73;
      return this.field_892[var4][var5].method_218(var1 & 15, var2, var3 & 15);
   }

   @Override
   public int method_929(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      int var4 = (var1 >> 4) - this.field_994;
      int var5 = (var3 >> 4) - this.field_73;
      return this.field_892[var4][var5].method_126(var1 & 15, var2, var3 & 15);
   }

   @Override
   public Class111 method_149(int var1, int var2, int var3) {
      int var4 = this.method_813(var1, var2, var3);
      return var4 == 0 ? Class111.field_54 : Class371.field_57[var4].field_658;
   }

   @Override
   public boolean method_604(int var1, int var2, int var3) {
      Class371 var4 = Class371.field_57[this.method_813(var1, var2, var3)];
      return var4 == null ? false : var4.method_491();
   }

   @Override
   public Interface210 method_642() {
      return this.field_1574.method_642();
   }
}
