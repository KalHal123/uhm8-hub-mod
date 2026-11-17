package srv;

public class Class89 {
   public final int field_339;
   public final int field_613;
   public final int field_1218;

   public Class89(int var1, int var2, int var3) {
      this.field_339 = var1;
      this.field_613 = var2;
      this.field_1218 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class89)) {
         return false;
      }

      Class89 var2 = (Class89)var1;
      return var2.field_339 == this.field_339 && var2.field_613 == this.field_613 && var2.field_1218 == this.field_1218;
   }

   @Override
   public int hashCode() {
      return this.field_339 * 8976890 + this.field_613 * 981131 + this.field_1218;
   }
}
