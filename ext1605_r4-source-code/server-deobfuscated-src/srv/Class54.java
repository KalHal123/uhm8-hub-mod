package srv;

public class Class54 extends Class66 implements Interface327 {
   Class150 field_1420;
   public int field_1094 = 0;

   public Class54() {
      this.field_1420 = new Class150(Class13.field_1491, 0);
   }

   @Override
   public int method_214() {
      return 1;
   }

   @Override
   public Class150 method_908(int var1) {
      return this.field_1420;
   }

   public Class150 method_420(int var1, int var2) {
      if (var2 > this.field_1420.field_1497) {
         this.field_1420 = new Class150(Class13.field_1491, 0);
      } else {
         this.field_1420.field_1497 -= var2;
      }

      return this.field_1420;
   }

   public void method_34(int var1, Class150 var2) {
      this.field_1420 = var2;
   }

   public String method_232() {
      return "unused";
   }

   public int method_301() {
      return 64;
   }

   @Override
   public void method_878(Class100 var1) {
      var1.method_32("counter", this.field_1094);
      var1.method_32("count", this.field_1420.field_1497);
      super.method_878(var1);
   }

   @Override
   public void method_816(Class100 var1) {
      this.field_1094 = var1.method_159("counter");
      this.field_1420 = new Class150(Class13.field_1491, var1.method_159("count"));
      super.method_816(var1);
   }
}
