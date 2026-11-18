package srv;

public class Class64 extends Class350 {
   private int field_20;

   public Class64(int var1, int var2) {
      super(var1);
      this.field_275 = 1;
      this.field_1038 = 32 << var2;
      if (var2 == 3) {
         this.field_1038 *= 4;
      }

      this.field_20 = 4 + var2 * 2;
   }

   @Override
   public float method_195(Class150 var1, Class371 var2) {
      return 1.5F;
   }

   @Override
   public void method_236(Class150 var1, int var2, int var3, int var4, int var5) {
      var1.method_698(2);
   }
}
