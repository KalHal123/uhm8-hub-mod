package srv;

public class Class133 extends Class35 {
   private final Class312 field_868;

   public Class133(Class312 var1) {
      this.field_868 = var1;
   }

   @Override
   public Class312 method_612() {
      return new Class312(1, 1);
   }

   @Override
   public Class312 method_240() {
      return this.field_868;
   }

   @Override
   public boolean method_779(Class317 var1, int var2, int var3) {
      if (Class322.method_123(var2, var3, this.field_868.field_197 + 1, this.field_868.field_492 + 1)) {
         for (int var4 = 128; var4 > 0; var4--) {
            var1.method_260(this.field_868.field_197 + 1, var4, this.field_868.field_492 + 1, Class371.field_1113.field_1379);
         }
      }

      if (Class322.method_123(var2, var3, this.field_868.field_197 + 14, this.field_868.field_492 + 1)) {
         for (int var5 = 128; var5 > 0; var5--) {
            var1.method_260(this.field_868.field_197 + 14, var5, this.field_868.field_492 + 1, Class371.field_1113.field_1379);
         }
      }

      if (Class322.method_123(var2, var3, this.field_868.field_197 + 1, this.field_868.field_492 + 14)) {
         for (int var6 = 128; var6 > 0; var6--) {
            var1.method_260(this.field_868.field_197 + 1, var6, this.field_868.field_492 + 14, Class371.field_1113.field_1379);
         }
      }

      if (Class322.method_123(var2, var3, this.field_868.field_197 + 14, this.field_868.field_492 + 14)) {
         for (int var7 = 128; var7 > 0; var7--) {
            var1.method_260(this.field_868.field_197 + 14, var7, this.field_868.field_492 + 14, Class371.field_1113.field_1379);
         }
      }

      return false;
   }
}
