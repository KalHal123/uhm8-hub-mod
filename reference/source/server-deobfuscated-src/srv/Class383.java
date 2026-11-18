package srv;

public class Class383 extends Class350 {
   private Class371[] field_731;
   protected float field_340 = 4.0F;
   private int field_307;
   protected int field_829;

   public Class383(int var1, int var2, int var3, Class371[] var4) {
      super(var1);
      this.field_829 = var3;
      this.field_731 = var4;
      this.field_275 = 1;
      this.field_1038 = 32 << var3;
      if (var3 == 3) {
         this.field_1038 *= 4;
      }

      this.field_340 = (var3 + 1) * 2;
      this.field_307 = var2 + var3;
   }

   @Override
   public float method_195(Class150 var1, Class371 var2) {
      for (int var3 = 0; var3 < this.field_731.length; var3++) {
         if (this.field_731[var3] == var2) {
            return this.field_340;
         }
      }

      return 1.0F;
   }

   @Override
   public void method_236(Class150 var1, int var2, int var3, int var4, int var5) {
      var1.method_698(1);
   }
}
