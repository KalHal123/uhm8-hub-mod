package ext;

public class Class585 {
   private final Class709[] field_1048;
   public final int field_2712;
   private int field_2617;

   public Class585(Class709[] var1) {
      this.field_1048 = var1;
      this.field_2712 = var1.length;
   }

   public void method_1614() {
      this.field_2617++;
   }

   public boolean method_1537() {
      return this.field_2617 >= this.field_1048.length;
   }

   public Class214 method_51(Class359 var1) {
      double var2 = this.field_1048[this.field_2617].field_2460 + (int)(var1.field_811 + 1.0F) * 0.5;
      double var4 = this.field_1048[this.field_2617].field_2742;
      double var6 = this.field_1048[this.field_2617].field_2997 + (int)(var1.field_811 + 1.0F) * 0.5;
      return Class214.method_701(var2, var4, var6);
   }
}
