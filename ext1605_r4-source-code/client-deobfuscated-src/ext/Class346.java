package ext;

public class Class346 {
   public int field_2263;
   public int field_1976;

   public Class346(int var1, int var2) {
      this.field_2263 = var1;
      this.field_1976 = var2;
   }

   @Override
   public int hashCode() {
      return this.field_2263 << 8 | this.field_1976;
   }

   @Override
   public boolean equals(Object var1) {
      Class346 var2 = (Class346)var1;
      return var2.field_2263 == this.field_2263 && var2.field_1976 == this.field_1976;
   }
}
