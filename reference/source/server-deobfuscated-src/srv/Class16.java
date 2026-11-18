package srv;

public class Class16 {
   private final Class93[] field_298;
   public final int field_188;
   private int field_419;

   public Class16(Class93[] var1) {
      this.field_298 = var1;
      this.field_188 = var1.length;
   }

   public void method_169() {
      this.field_419++;
   }

   public boolean method_85() {
      return this.field_419 >= this.field_298.length;
   }

   public Class47 method_1014(Class252 var1) {
      double var2 = this.field_298[this.field_419].field_44 + (int)(var1.field_595 + 1.0F) * 0.5;
      double var4 = this.field_298[this.field_419].field_249;
      double var6 = this.field_298[this.field_419].field_470 + (int)(var1.field_595 + 1.0F) * 0.5;
      return Class47.method_875(var2, var4, var6);
   }
}
