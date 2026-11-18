package ext;

public class Class706 extends Class755 {
   private int field_822;

   public Class706(int var1, int var2) {
      super(var1);
      this.field_2438 = 1;
      this.field_945 = 32 << var2;
      if (var2 == 3) {
         this.field_945 *= 4;
      }

      this.field_822 = 4 + var2 * 2;
   }

   @Override
   public float method_473(Class334 var1, Class108 var2) {
      return 1.5F;
   }

   @Override
   public void method_1935(Class334 var1, Class377 var2) {
      if (!(var2.field_1468 instanceof Class46)) {
         var1.method_1181(1);
      }
   }

   @Override
   public void method_463(Class334 var1, int var2, int var3, int var4, int var5) {
      var1.method_1181(2);
   }

   @Override
   public int method_1498(Class359 var1) {
      return this.field_822;
   }

   @Override
   public boolean method_928() {
      return true;
   }
}
