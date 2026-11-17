package ext;

public class Class709 {
   public final int field_2460;
   public final int field_2742;
   public final int field_2997;
   public final int field_3070;
   int field_320 = -1;
   float field_2998;
   float field_327;
   float field_2221;
   Class709 field_1458;
   public boolean field_2332 = false;

   public Class709(int var1, int var2, int var3) {
      this.field_2460 = var1;
      this.field_2742 = var2;
      this.field_2997 = var3;
      this.field_3070 = var1 | var2 << 10 | var3 << 20;
   }

   public float method_246(Class709 var1) {
      float var2 = var1.field_2460 - this.field_2460;
      float var3 = var1.field_2742 - this.field_2742;
      float var4 = var1.field_2997 - this.field_2997;
      return Class469.method_254(var2 * var2 + var3 * var3 + var4 * var4);
   }

   @Override
   public boolean equals(Object var1) {
      return ((Class709)var1).field_3070 == this.field_3070;
   }

   @Override
   public int hashCode() {
      return this.field_3070;
   }

   public boolean method_1071() {
      return this.field_320 >= 0;
   }

   @Override
   public String toString() {
      return this.field_2460 + ", " + this.field_2742 + ", " + this.field_2997;
   }
}
