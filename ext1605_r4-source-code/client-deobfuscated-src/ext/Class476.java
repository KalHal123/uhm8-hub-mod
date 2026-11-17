package ext;

public class Class476 extends Class186 implements Interface181 {
   Class334 field_2241 = new Class334(Class50.field_2952, 0);
   public int field_3117 = 0;

   @Override
   public int method_1574() {
      return 1;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_2241;
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (var2 > this.field_2241.field_2326) {
         this.field_2241 = new Class334(Class50.field_2952, 0);
      } else {
         this.field_2241.field_2326 -= var2;
      }

      return this.field_2241;
   }

   @Override
   public void method_1831() {
      super.method_430();
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.field_2241 = var2;
   }

   @Override
   public String method_18() {
      return "unused";
   }

   @Override
   public int method_1387() {
      return 64;
   }

   @Override
   public void method_1623(Class686 var1) {
      var1.method_1310("counter", this.field_3117);
      var1.method_1310("count", this.field_2241.field_2326);
      super.method_1623(var1);
   }

   @Override
   public void method_434(Class686 var1) {
      this.field_3117 = var1.method_1747("counter");
      this.field_2241 = new Class334(Class50.field_2952, var1.method_1747("count"));
      super.method_434(var1);
   }
}
