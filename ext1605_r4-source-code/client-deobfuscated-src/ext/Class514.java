package ext;

public class Class514 extends Class354 {
   public int field_1616 = 0;
   public boolean field_1045 = false;
   public boolean field_2834 = false;

   public Class514(Class454 var1) {
      super(var1);
      this.field_838 = 1.62F;
      this.method_253(var1.field_18 + 0.5, var1.field_934 + 1, var1.field_1361 + 0.5, 0.0F, 0.0F);
      this.field_2572 = 20;
      this.field_1043 = "humanoid";
      this.field_734 = 20;
      this.field_2863 = "/char.png";
      this.field_1716 = "";
      this.field_1795 = "@@";
   }

   public void method_1560() {
      this.field_2642 = true;
      this.field_1662 = true;
      this.method_379(this);
   }

   @Override
   public void method_22() {
      float var1 = this.method_304(Class119.field_1519.field_2787);
      if (!Class310.field_2783 || var1 < 19.0F && !Class310.field_973) {
         this.method_1560();
      }

      if (Class119.field_1519.field_2787 != null) {
         double var2 = Math.atan2(this.field_1417 - Class119.field_1519.field_2787.field_1417, -(this.field_2013 - Class119.field_1519.field_2787.field_2013))
            / Math.PI
            * 180.0;
         this.method_1835((float)var2, 0.0F);
         double var4 = Class100.method_1136(Class119.field_1519.field_2787.field_1661, this.field_1661) - 180.0;
         boolean var6 = !Class100.method_1792(
            this.field_1468,
            128,
            this.field_1417,
            this.field_2654 + 1.0,
            this.field_2013,
            Class119.field_1519.field_2787.field_1417,
            Class119.field_1519.field_2787.field_2654 + 1.0,
            Class119.field_1519.field_2787.field_2013
         );
         if (var4 > -10.0 && var4 < 10.0 && var6 && !Class310.field_973) {
            this.field_1616++;
            if (this.field_1616 > 70) {
               this.field_1045 = true;
               this.method_1560();
            }
         }
      }

      if (!this.field_2834) {
         this.method_1560();
      }

      super.method_22();
   }
}
