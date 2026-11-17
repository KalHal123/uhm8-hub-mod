package ext;

public class Class492 extends Class359 {
   public int field_1021;
   public int field_425 = 0;

   public Class492(Class454 var1) {
      super(var1);
   }

   public Class492(Class454 var1, float var2, float var3, float var4, int var5) {
      super(var1);
      this.field_1021 = var5;
      this.field_1968 = true;
      this.method_244(0.98F, 0.98F);
      this.field_838 = this.field_1443 / 2.0F;
      this.method_172(var2, var3, var4);
      this.field_2549 = 0.0;
      this.field_2501 = 0.0;
      this.field_489 = 0.0;
      this.field_1522 = false;
      this.field_2553 = var2;
      this.field_2068 = var3;
      this.field_1780 = var4;
   }

   @Override
   public boolean method_243() {
      return !this.field_2642;
   }

   @Override
   public void method_46() {
      if (this.field_1021 == 0) {
         this.method_1594();
      } else {
         this.field_2553 = this.field_1417;
         this.field_2068 = this.field_2654;
         this.field_1780 = this.field_2013;
         this.field_425++;
         this.field_2501 -= 0.04F;
         this.method_981(this.field_2549, this.field_2501, this.field_489);
         this.field_2549 *= 0.98F;
         this.field_2501 *= 0.98F;
         this.field_489 *= 0.98F;
         int var1 = Class469.method_468(this.field_1417);
         int var2 = Class469.method_468(this.field_2654);
         int var3 = Class469.method_468(this.field_2013);
         if (this.field_1468.method_197(var1, var2, var3) == this.field_1021) {
            this.field_1468.method_1481(var1, var2, var3, 0);
         }

         if (this.field_2669) {
            this.field_2549 *= 0.7F;
            this.field_489 *= 0.7F;
            this.field_2501 *= -0.5;
            this.method_1594();
            if (!this.field_1468.method_1892(this.field_1021, var1, var2, var3, true) || !this.field_1468.method_1481(var1, var2, var3, this.field_1021)) {
               this.method_203(this.field_1021, 1);
            }
         } else if (this.field_425 > 100) {
            this.method_203(this.field_1021, 1);
            this.method_1594();
         }
      }
   }

   @Override
   protected void method_863(Class686 var1) {
      var1.method_1567("Tile", (byte)this.field_1021);
   }

   @Override
   protected void method_1054(Class686 var1) {
      this.field_1021 = var1.method_1913("Tile") & 255;
   }

   @Override
   public float method_1140() {
      return 0.0F;
   }

   public Class454 method_199() {
      return this.field_1468;
   }
}
