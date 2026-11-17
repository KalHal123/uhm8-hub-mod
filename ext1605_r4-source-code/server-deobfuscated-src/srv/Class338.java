package srv;

public class Class338 {
   public int field_572;
   public int field_1174;

   public Class338(int var1, int var2) {
      this.field_572 = var1;
      this.field_1174 = var2;
   }

   @Override
   public int hashCode() {
      return this.field_572 << 8 | this.field_1174;
   }

   @Override
   public boolean equals(Object var1) {
      Class338 var2 = (Class338)var1;
      return var2.field_572 == this.field_572 && var2.field_1174 == this.field_1174;
   }

   public double method_342(Class252 var1) {
      double var2 = this.field_572 * 16 + 8;
      double var4 = this.field_1174 * 16 + 8;
      double var6 = var2 - var1.field_1324;
      double var8 = var4 - var1.field_1321;
      return var6 * var6 + var8 * var8;
   }
}
