package srv;

public class Class93 {
   public final int field_44;
   public final int field_249;
   public final int field_470;
   public final int field_1596;
   int field_782 = -1;
   float field_1081;
   float field_133;
   float field_343;
   Class93 field_1210;
   public boolean field_48 = false;

   public Class93(int var1, int var2, int var3) {
      this.field_44 = var1;
      this.field_249 = var2;
      this.field_470 = var3;
      this.field_1596 = var1 | var2 << 10 | var3 << 20;
   }

   public float method_533(Class93 var1) {
      float var2 = var1.field_44 - this.field_44;
      float var3 = var1.field_249 - this.field_249;
      float var4 = var1.field_470 - this.field_470;
      return Class380.method_557(var2 * var2 + var3 * var3 + var4 * var4);
   }

   @Override
   public boolean equals(Object var1) {
      return ((Class93)var1).field_1596 == this.field_1596;
   }

   @Override
   public int hashCode() {
      return this.field_1596;
   }

   public boolean method_183() {
      return this.field_782 >= 0;
   }

   @Override
   public String toString() {
      return this.field_44 + ", " + this.field_249 + ", " + this.field_470;
   }
}
