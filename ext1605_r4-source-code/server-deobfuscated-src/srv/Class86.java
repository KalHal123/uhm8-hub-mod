package srv;

public class Class86 extends Class66 implements Interface327 {
   private Class150[] field_1356 = new Class150[3];
   private int field_1214 = 0;
   private int field_1131 = 0;
   private int field_616 = 0;
   private boolean field_1511 = false;

   @Override
   public int method_214() {
      return this.field_1356.length;
   }

   @Override
   public Class150 method_908(int var1) {
      return this.field_1356[var1];
   }

   public int method_193(int var1) {
      return this.field_616 * var1 / 200;
   }

   public int method_970(int var1) {
      if (this.field_1131 == 0) {
         this.field_1131 = 200;
      }

      return this.field_1214 * var1 / this.field_1131;
   }

   public boolean method_131() {
      return this.field_1214 > 0;
   }
}
