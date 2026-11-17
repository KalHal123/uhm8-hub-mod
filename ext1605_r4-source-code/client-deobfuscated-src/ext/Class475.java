package ext;

import java.util.Objects;

public class Class475 {
   public int field_2785;
   public int field_256;

   public Class475(Class475 var1) {
      this(var1.field_2785, var1.field_256);
   }

   public Class475(int var1, int var2) {
      this.field_2785 = var1;
      this.field_256 = var2;
   }

   public int method_1091() {
      return this.field_2785;
   }

   public int method_814() {
      return this.field_256;
   }

   public Class475 method_579(int var1) {
      return new Class475(this.field_2785 * var1, this.field_256 * var1);
   }

   public void method_173(int var1, int var2) {
      this.field_2785 += var1;
      this.field_256 += var2;
   }

   public Class475 method_794(int var1, int var2) {
      return new Class475(this.field_2785 + var1, this.field_256 + var2);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof Class475)) {
         return false;
      }

      Class475 var2 = (Class475)var1;
      return this.field_2785 == var2.field_2785 && this.field_256 == var2.field_256;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_2785, this.field_256);
   }
}
