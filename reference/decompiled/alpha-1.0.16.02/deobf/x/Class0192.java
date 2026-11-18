package x;

public class Class0192 extends Class0093 {
   public Class0192(Class0065 var1) {
      super(var1);
      this.u = "/mob/zombie.png";
      this.Y = 0.5F;
      this.e = 50;
      this.D *= 10;
      this.ay *= 6.0F;
      this.a(this.az * 6.0F, this.aA * 6.0F);
   }

   @Override
   protected float a(int var1, int var2, int var3) {
      return this.ad.c(var1, var2, var3) - 0.5F;
   }
}
