package ext;

public class Class450 {
   public final int field_1865;
   public final int field_322;
   public final int field_2359;

   public Class450(int var1, int var2, int var3) {
      this.field_1865 = var1;
      this.field_322 = var2;
      this.field_2359 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class450)) {
         return false;
      }

      Class450 var2 = (Class450)var1;
      return var2.field_1865 == this.field_1865 && var2.field_322 == this.field_322 && var2.field_2359 == this.field_2359;
   }

   @Override
   public int hashCode() {
      return this.field_1865 * 8976890 + this.field_322 * 981131 + this.field_2359;
   }
}
