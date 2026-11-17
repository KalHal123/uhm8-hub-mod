package ext;

public class Class143 extends Class564 {
   public Class143(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/zombie.png";
      this.field_2079 = 0.5F;
      this.field_498 = 50;
      this.field_2572 *= 10;
      this.field_838 *= 6.0F;
      this.method_244(this.field_811 * 6.0F, this.field_1443 * 6.0F);
   }

   @Override
   protected float method_723(int var1, int var2, int var3) {
      return this.field_1468.method_1154(var1, var2, var3) - 0.5F;
   }
}
