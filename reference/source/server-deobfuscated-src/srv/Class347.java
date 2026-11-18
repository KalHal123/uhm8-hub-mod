package srv;

import java.util.Random;

public class Class347 extends Class371 {
   private int field_1054;
   private int field_908;
   private int field_884;
   private int field_433;

   public Class347(int var1, int var2, int var3, int var4) {
      super(var1, Class111.field_384);
      this.field_1137 = var3;
      this.method_194(true);
      this.field_1054 = var2;
      this.field_908 = var3;
      this.field_884 = var4;
      this.field_433 = var1;
   }

   public Class347(int var1, int var2, int var3, int var4, Class111 var5) {
      super(var1, var5);
      this.field_1137 = var3;
      this.method_194(true);
      this.field_1054 = var2;
      this.field_908 = var3;
      this.field_884 = var4;
      this.field_433 = var1;
   }

   @Override
   public int method_310(int var1) {
      if (var1 == 1) {
         return this.field_1054;
      } else {
         return var1 == 0 ? this.field_884 : this.field_908;
      }
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
   }

   @Override
   public int method_852(int var1, Random var2) {
      return this.field_433;
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      var5.method_892();
      return true;
   }
}
