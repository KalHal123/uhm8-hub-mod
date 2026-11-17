package ext;

public class Class669 extends Class354 {
   private int field_2317;
   private double field_2277;
   private double field_1555;
   private double field_873;
   private double field_877;
   private double field_2959;
   float field_569 = 0.0F;

   public Class669(Class454 var1, String var2) {
      super(var1);
      this.field_1716 = var2;
      this.field_838 = 0.0F;
      this.field_2827 = 0.0F;
      if (var2 != null && var2.length() > 0) {
         this.field_1795 = var2;
         System.out.println("Loading texture " + this.field_1795);
      }

      this.field_236 = true;
      this.field_2054 = 10.0;
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      return true;
   }

   @Override
   public void method_1551(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_838 = 0.0F;
      this.field_2277 = var1;
      this.field_1555 = var3;
      this.field_873 = var5;
      this.field_877 = var7;
      this.field_2959 = var8;
      this.field_2317 = var9;
   }

   @Override
   public void method_46() {
      super.method_46();
      this.field_2980 = this.field_937;
      double var1 = this.field_1417 - this.field_2553;
      double var3 = this.field_2013 - this.field_1780;
      float var5 = Class469.method_822(var1 * var1 + var3 * var3) * 4.0F;
      if (var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.field_937 = this.field_937 + (var5 - this.field_937) * 0.4F;
      this.field_1747 = this.field_1747 + this.field_937;
   }

   @Override
   public float method_1140() {
      return 0.0F;
   }

   @Override
   public void method_22() {
      super.method_1215();
      if (this.field_2317 > 0) {
         double var1 = this.field_1417 + (this.field_2277 - this.field_1417) / this.field_2317;
         double var3 = this.field_2654 + (this.field_1555 - this.field_2654) / this.field_2317;
         double var5 = this.field_2013 + (this.field_873 - this.field_2013) / this.field_2317;
         double var7 = this.field_877 - this.field_1661;

         while (var7 < -180.0) {
            var7 += 360.0;
         }

         while (var7 >= 180.0) {
            var7 -= 360.0;
         }

         this.field_1661 = (float)(this.field_1661 + var7 / this.field_2317);
         this.field_2866 = (float)(this.field_2866 + (this.field_2959 - this.field_2866) / this.field_2317);
         this.field_2317--;
         this.method_172(var1, var3, var5);
         this.method_1835(this.field_1661, this.field_2866);
      }

      this.field_771 = this.field_2216;
      float var9 = Class469.method_822(this.field_2549 * this.field_2549 + this.field_489 * this.field_489);
      float var2 = (float)Math.atan(-this.field_2501 * 0.2F) * 15.0F;
      if (var9 > 0.1F) {
         var9 = 0.1F;
      }

      if (!this.field_2669 || this.field_2572 <= 0) {
         var9 = 0.0F;
      }

      if (this.field_2669 || this.field_2572 <= 0) {
         var2 = 0.0F;
      }

      this.field_2216 = this.field_2216 + (var9 - this.field_2216) * 0.4F;
      this.field_32 = this.field_32 + (var2 - this.field_32) * 0.8F;
   }
}
