package srv;

import java.util.Objects;

public class Class312 {
   public int field_197;
   public int field_492;

   public Class312(Class312 var1) {
      this(var1.field_197, var1.field_492);
   }

   public Class312(int var1, int var2) {
      this.field_197 = var1;
      this.field_492 = var2;
   }

   public int method_877() {
      return this.field_197;
   }

   public int method_215() {
      return this.field_492;
   }

   public Class312 method_871(int var1) {
      return new Class312(this.field_197 * var1, this.field_492 * var1);
   }

   public void method_781(int var1, int var2) {
      this.field_197 += var1;
      this.field_492 += var2;
   }

   public Class312 method_692(int var1, int var2) {
      return new Class312(this.field_197 + var1, this.field_492 + var2);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof Class312)) {
         return false;
      }

      Class312 var2 = (Class312)var1;
      return this.field_197 == var2.field_197 && this.field_492 == var2.field_492;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_197, this.field_492);
   }
}
