package srv;

import java.util.Random;

public class Class161 extends Class371 {
   private int field_1513;
   private int field_321;
   private int field_1226;
   private int field_924;

   public Class161(int var1, int var2, int var3, int var4) {
      super(var1, Class111.field_384);
      this.field_1137 = var3;
      this.method_194(true);
      this.field_1513 = var2;
      this.field_321 = var3;
      this.field_1226 = var4;
      this.field_924 = var1;
   }

   public Class161(int var1, int var2, int var3, int var4, Class111 var5) {
      super(var1, var5);
      this.field_1137 = var3;
      this.method_194(true);
      this.field_1513 = var2;
      this.field_321 = var3;
      this.field_1226 = var4;
      this.field_924 = var1;
   }

   @Override
   public int method_310(int var1) {
      if (var1 == 1) {
         return this.field_1513;
      } else {
         return var1 == 0 ? this.field_1226 : this.field_321;
      }
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
   }

   @Override
   public int method_852(int var1, Random var2) {
      return this.field_924;
   }
}
