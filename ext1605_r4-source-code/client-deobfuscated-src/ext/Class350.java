package ext;

public class Class350 extends Class755 {
   private Class108[] field_1587;
   public float field_3107 = 4.0F;
   private int field_2924;
   protected int field_2309;

   public Class350(int var1, int var2, int var3, Class108[] var4) {
      super(var1);
      this.field_2309 = var3;
      this.field_1587 = var4;
      this.field_2438 = 1;
      this.field_945 = 32 << var3;
      if (var3 == 3) {
         this.field_945 *= 4;
      }

      this.field_3107 = (var3 + 1) * 2;
      this.field_2924 = var2 + var3;
   }

   @Override
   public float method_473(Class334 var1, Class108 var2) {
      for (int var3 = 0; var3 < this.field_1587.length; var3++) {
         if (this.field_1587[var3] == var2) {
            return this.field_3107;
         }
      }

      return 1.0F;
   }

   @Override
   public void method_1935(Class334 var1, Class377 var2) {
      var1.method_1181(2);
   }

   @Override
   public void method_463(Class334 var1, int var2, int var3, int var4, int var5) {
      var1.method_1181(1);
   }

   @Override
   public int method_1498(Class359 var1) {
      return this.field_2924;
   }

   @Override
   public boolean method_928() {
      return true;
   }
}
