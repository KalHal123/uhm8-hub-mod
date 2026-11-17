package ext;

public class Class719 extends Class540 {
   private final Class355 field_3090;
   public final int field_130;
   public final int field_1798;

   public Class719(Class355 var1, Interface181 var2, int var3, int var4, int var5) {
      super(var2, var3);
      this.field_3090 = var1;
      this.field_130 = var4;
      this.field_1798 = var5;
   }

   public boolean method_1556(int var1, int var2) {
      int var3 = (this.field_3090.field_2345 - this.field_3090.field_2320) / 2;
      int var4 = (this.field_3090.field_562 - this.field_3090.field_2029) / 2;
      var1 -= var3;
      var2 -= var4;
      return var1 >= this.field_130 - 1 && var1 < this.field_130 + 16 + 1 && var2 >= this.field_1798 - 1 && var2 < this.field_1798 + 16 + 1;
   }
}
