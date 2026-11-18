package ext;

public class Class406 extends Class45 {
   public Class406(Class454 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_2519 = 1.0F;
      this.field_3000 = 1.0F;
      this.field_1918 = 1.0F;
      this.field_1306 = 32;
      this.method_244(0.02F, 0.02F);
      this.field_2367 = this.field_2367 * (this.field_2850.nextFloat() * 0.6F + 0.2F);
      this.field_2549 = var8 * 0.2F + (float)(Math.random() * 2.0 - 1.0) * 0.02F;
      this.field_2501 = var10 * 0.2F + (float)(Math.random() * 2.0 - 1.0) * 0.02F;
      this.field_489 = var12 * 0.2F + (float)(Math.random() * 2.0 - 1.0) * 0.02F;
      this.field_584 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void method_46() {
      this.field_2553 = this.field_1417;
      this.field_2068 = this.field_2654;
      this.field_1780 = this.field_2013;
      this.field_2501 += 0.002;
      this.method_981(this.field_2549, this.field_2501, this.field_489);
      this.field_2549 *= 0.85F;
      this.field_2501 *= 0.85F;
      this.field_489 *= 0.85F;
      if (this.field_1468.method_1286(Class469.method_468(this.field_1417), Class469.method_468(this.field_2654), Class469.method_468(this.field_2013))
         != Class160.field_1413) {
         this.method_1594();
      }

      if (this.field_584-- <= 0) {
         this.method_1594();
      }
   }
}
