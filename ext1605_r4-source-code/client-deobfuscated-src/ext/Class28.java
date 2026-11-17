package ext;

public class Class28 {
   public float field_3150;
   private double field_2415;
   public int field_456;
   public float field_2499;
   public float field_119 = 1.0F;
   public float field_2685 = 0.0F;
   private long field_2321;
   private long field_2966;
   private double field_595 = 1.0;

   public Class28(float var1) {
      this.field_3150 = var1;
      this.field_2321 = System.currentTimeMillis();
      this.field_2966 = System.nanoTime() / 1000000L;
   }

   public void method_311() {
      long var1 = System.currentTimeMillis();
      long var3 = var1 - this.field_2321;
      long var5 = System.nanoTime() / 1000000L;
      if (var3 > 1000L) {
         long var9 = var5 - this.field_2966;
         double var7 = (double)var3 / var9;
         this.field_595 = this.field_595 + (var7 - this.field_595) * 0.2F;
         this.field_2321 = var1;
         this.field_2966 = var5;
      }

      if (var3 < 0L) {
         this.field_2321 = var1;
         this.field_2966 = var5;
      }

      double var12 = var5 / 1000.0;
      double var11 = (var12 - this.field_2415) * this.field_595;
      this.field_2415 = var12;
      if (var11 < 0.0) {
         var11 = 0.0;
      }

      if (var11 > 1.0) {
         var11 = 1.0;
      }

      this.field_2685 = (float)(this.field_2685 + var11 * this.field_119 * this.field_3150);
      this.field_456 = (int)this.field_2685;
      this.field_2685 = this.field_2685 - this.field_456;
      if (this.field_456 > 10) {
         this.field_456 = 10;
      }

      this.field_2499 = this.field_2685;
   }
}
