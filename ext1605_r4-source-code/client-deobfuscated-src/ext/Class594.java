package ext;

public class Class594 extends Class45 {
   public Class594(Class454 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_2549 *= 0.3F;
      this.field_2501 = (float)Math.random() * 0.2F + 0.1F;
      this.field_489 *= 0.3F;
      this.field_2519 = 1.0F;
      this.field_3000 = 1.0F;
      this.field_1918 = 1.0F;
      this.field_1306 = 19 + this.field_2850.nextInt(4);
      this.method_244(0.01F, 0.01F);
      this.field_810 = 0.06F;
      this.field_584 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void method_813(Class368 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.method_813(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void method_46() {
      this.field_2553 = this.field_1417;
      this.field_2068 = this.field_2654;
      this.field_1780 = this.field_2013;
      this.field_2501 = this.field_2501 - this.field_810;
      this.method_981(this.field_2549, this.field_2501, this.field_489);
      this.field_2549 *= 0.98F;
      this.field_2501 *= 0.98F;
      this.field_489 *= 0.98F;
      if (this.field_584-- <= 0) {
         this.method_1594();
      }

      if (this.field_2669) {
         if (Math.random() < 0.5) {
            this.method_1594();
         }

         this.field_2549 *= 0.7F;
         this.field_489 *= 0.7F;
      }

      Class160 var1 = this.field_1468
         .method_1286(Class469.method_468(this.field_1417), Class469.method_468(this.field_2654), Class469.method_468(this.field_2013));
      if (var1.method_743() || var1.method_1888()) {
         double var2 = Class469.method_468(this.field_2654) + 1
            - Class722.method_74(
               this.field_1468.method_1110(Class469.method_468(this.field_1417), Class469.method_468(this.field_2654), Class469.method_468(this.field_2013))
            );
         if (this.field_2654 < var2) {
            this.method_1594();
         }
      }
   }
}
