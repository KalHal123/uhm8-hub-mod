package ext;

public class Class481 extends Class377 {
   private Class585 field_566;
   public Class359 field_1487;
   protected boolean field_2650 = false;
   public Class326 field_1213;

   public Class481(Class454 var1) {
      super(var1);
   }

   protected boolean method_383() {
      return true;
   }

   public float method_356() {
      return 16.0F;
   }

   @Override
   protected void method_1215() {
      this.field_2650 = false;
      float var1 = this.method_356();
      if (this.field_1487 == null) {
         this.field_1487 = this.method_212();
         if (this.field_1487 != null) {
            this.field_566 = this.field_1468.method_637(this, this.field_1487, var1);
         }
      } else if (!this.field_1487.method_1251()) {
         this.field_1487 = null;
      } else {
         float var2 = this.field_1487.method_304(this);
         if (this.method_689(this.field_1487)) {
            this.method_1344(this.field_1487, var2);
         }
      }

      if (this.field_2650 || this.field_1487 == null || this.field_566 != null && this.field_2850.nextInt(20) != 0) {
         if (this.field_566 == null && this.field_2850.nextInt(80) == 0 || this.field_2850.nextInt(80) == 0) {
            boolean var21 = false;
            int var3 = -1;
            int var4 = -1;
            int var5 = -1;
            float var6 = -99999.0F;

            for (int var7 = 0; var7 < 10; var7++) {
               int var8 = Class469.method_468(this.field_1417 + this.field_2850.nextInt(13) - 6.0);
               int var9 = Class469.method_468(this.field_2654 + this.field_2850.nextInt(7) - 3.0);
               int var10 = Class469.method_468(this.field_2013 + this.field_2850.nextInt(13) - 6.0);
               float var11 = this.method_723(var8, var9, var10);
               if (var11 > var6) {
                  var6 = var11;
                  var3 = var8;
                  var4 = var9;
                  var5 = var10;
                  var21 = true;
               }
            }

            if (var21) {
               this.field_566 = this.field_1468.method_486(this, var3, var4, var5, 10.0F);
            }
         }
      } else {
         this.field_566 = this.field_1468.method_637(this, this.field_1487, var1);
      }

      if (this.field_1213 != null && (this.field_1487 == null || this.field_1487.method_304(this) > 8.0F)) {
         this.field_566 = this.field_1468
            .method_486(this, (int)this.field_1213.field_809, (int)this.field_1213.field_805, (int)this.field_1213.field_3039, 16.0F);
      }

      int var22 = Class469.method_468(this.field_235.field_946);
      boolean var23 = this.method_36();
      boolean var24 = this.method_1059();
      this.field_2866 = 0.0F;
      if (this.field_566 != null && this.field_2850.nextInt(100) != 0) {
         Class214 var25 = this.field_566.method_51(this);
         double var26 = this.field_811 * 2.0F;

         while (var25 != null && var25.method_169(this.field_1417, var25.field_1911, this.field_2013) < var26 * var26) {
            this.field_566.method_1614();
            if (this.field_566.method_1537()) {
               var25 = null;
               this.field_566 = null;
            } else {
               var25 = this.field_566.method_51(this);
            }
         }

         this.field_2698 = false;
         if (var25 != null) {
            double var27 = var25.field_882 - this.field_1417;
            double var28 = var25.field_3045 - this.field_2013;
            double var12 = var25.field_1911 - var22;
            float var14 = (float)(Math.atan2(var28, var27) * 180.0 / (float) Math.PI) - 90.0F;
            float var15 = var14 - this.field_1661;
            this.field_269 = this.field_2079;

            while (var15 < -180.0F) {
               var15 += 360.0F;
            }

            while (var15 >= 180.0F) {
               var15 -= 360.0F;
            }

            if (var15 > 30.0F) {
               var15 = 30.0F;
            }

            if (var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.field_1661 += var15;
            if (this.field_2650 && this.field_1487 != null) {
               double var16 = this.field_1487.field_1417 - this.field_1417;
               double var18 = this.field_1487.field_2013 - this.field_2013;
               float var20 = this.field_1661;
               this.field_1661 = (float)(Math.atan2(var18, var16) * 180.0 / (float) Math.PI) - 90.0F;
               var15 = (var20 - this.field_1661 + 90.0F) * (float) Math.PI / 180.0F;
               this.field_1818 = -Class469.method_1667(var15) * this.field_269 * 1.0F;
               this.field_269 = Class469.method_255(var15) * this.field_269 * 1.0F;
            }

            if (var12 > 0.0) {
               this.field_2698 = true;
            }
         }

         if (this.field_1487 != null) {
            this.method_537(this.field_1487, 30.0F);
         }

         if (this.field_1271) {
            this.field_2698 = true;
         }

         if (this.field_2850.nextFloat() < 0.8F && (var23 || var24)) {
            this.field_2698 = true;
         }
      } else if (this.method_383()) {
         super.method_1215();
         this.field_566 = null;
      }
   }

   protected void method_1344(Class359 var1, float var2) {
   }

   protected float method_723(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected Class359 method_212() {
      return null;
   }

   @Override
   public boolean method_713() {
      int var1 = Class469.method_468(this.field_1417);
      int var2 = Class469.method_468(this.field_235.field_946);
      int var3 = Class469.method_468(this.field_2013);
      return super.method_713() && this.method_723(var1, var2, var3) >= 0.0F;
   }
}
