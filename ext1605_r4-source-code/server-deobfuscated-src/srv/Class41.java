package srv;

import java.util.List;

public class Class41 extends Class92 {
   public Class235 field_783 = new Class235(this);
   public byte field_455 = 0;
   public int field_491 = 0;
   public float field_342;
   public float field_25;
   public boolean field_742 = false;
   public int field_575 = 0;
   public String field_1477;
   private int field_1260 = 0;
   public int field_399 = 0;

   public Class41(Class317 var1) {
      super(var1);
      this.field_855 = 1.62F;
      this.method_885(var1.field_944 + 0.5, var1.field_639 + 1, var1.field_1535 + 0.5, 0.0F, 0.0F);
      this.field_1090 = 20;
      this.field_1152 = "humanoid";
      this.field_882 = 180.0F;
      this.field_392 = 20;
   }

   public String method_8() {
      return this.field_1477.replaceAll("[^a-zA-Z0-9]", "_");
   }

   @Override
   public void method_447() {
      super.method_447();
      this.field_342 = this.field_25;
      this.field_25 = 0.0F;
   }

   @Override
   protected void method_530() {
      if (this.field_742) {
         this.field_575++;
         if (this.field_575 == 8) {
            this.field_575 = 0;
            this.field_742 = false;
         }
      } else {
         this.field_575 = 0;
      }

      this.field_1064 = this.field_575 / 8.0F;
   }

   @Override
   public void method_664() {
      if (this.field_796.field_1549 == 0 && this.field_1090 < 20 && this.field_251 % 20 * 4 == 0) {
         this.method_228(1);
      }

      this.field_783.method_74();
      this.field_342 = this.field_25;
      super.method_664();
      float var1 = Class380.method_164(this.field_607 * this.field_607 + this.field_921 * this.field_921);
      float var2 = (float)Math.atan(-this.field_780 * 0.2F) * 15.0F;
      if (var1 > 0.1F) {
         var1 = 0.1F;
      }

      if (!this.field_199 || this.field_1090 <= 0) {
         var1 = 0.0F;
      }

      if (this.field_199 || this.field_1090 <= 0) {
         var2 = 0.0F;
      }

      this.field_25 = this.field_25 + (var1 - this.field_25) * 0.4F;
      this.field_789 = this.field_789 + (var2 - this.field_789) * 0.8F;
      if (this.field_1090 > 0) {
         List var3 = this.field_796.method_362(this, this.field_106.method_99(1.0, 0.0, 1.0));
         if (var3 != null) {
            for (int var4 = 0; var4 < var3.size(); var4++) {
               this.method_135((Class252)var3.get(var4));
            }
         }
      }
   }

   private void method_135(Class252 var1) {
      var1.method_644(this);
   }

   @Override
   public void method_577(Class252 var1) {
      this.method_273(0.2F, 0.2F);
      this.method_732(this.field_1324, this.field_632, this.field_1321);
      this.field_780 = 0.1F;
      if (this.field_1477.equals("Notch")) {
         this.method_814(new Class150(Class350.field_1526, 1), true);
      }

      this.field_783.method_913();
      if (var1 != null) {
         this.field_607 = -Class380.method_520((this.field_165 + this.field_909) * (float) Math.PI / 180.0F) * 0.1F;
         this.field_921 = -Class380.method_241((this.field_165 + this.field_909) * (float) Math.PI / 180.0F) * 0.1F;
      } else {
         this.field_607 = this.field_921 = 0.0;
      }

      this.field_855 = 0.1F;
   }

   @Override
   public void method_1012(Class252 var1, int var2) {
      this.field_491 += var2;
   }

   public void method_90(Class150 var1) {
      this.method_814(var1, false);
   }

   public void method_814(Class150 var1, boolean var2) {
      if (var1 != null) {
         Class39 var3 = new Class39(this.field_796, this.field_1324, this.field_632 - 0.3F + this.method_181(), this.field_1321, var1);
         var3.field_1105 = 40;
         float var4 = 0.1F;
         if (var2) {
            float var5 = this.field_697.nextFloat() * 0.5F;
            float var6 = this.field_697.nextFloat() * (float) Math.PI * 2.0F;
            var3.field_607 = -Class380.method_241(var6) * var5;
            var3.field_921 = Class380.method_520(var6) * var5;
            var3.field_780 = 0.2F;
         } else {
            var4 = 0.3F;
            var3.field_607 = -Class380.method_241(this.field_909 / 180.0F * (float) Math.PI)
               * Class380.method_520(this.field_427 / 180.0F * (float) Math.PI)
               * var4;
            var3.field_921 = Class380.method_520(this.field_909 / 180.0F * (float) Math.PI)
               * Class380.method_520(this.field_427 / 180.0F * (float) Math.PI)
               * var4;
            var3.field_780 = -Class380.method_241(this.field_427 / 180.0F * (float) Math.PI) * var4 + 0.1F;
            var4 = 0.02F;
            float var10 = this.field_697.nextFloat() * (float) Math.PI * 2.0F;
            var4 *= this.field_697.nextFloat();
            var3.field_607 = var3.field_607 + Math.cos(var10) * var4;
            var3.field_780 = var3.field_780 + (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.1F;
            var3.field_921 = var3.field_921 + Math.sin(var10) * var4;
         }

         this.method_965(var3);
      }
   }

   protected void method_965(Class39 var1) {
      this.field_796.method_237(var1);
   }

   public float method_128(Class371 var1) {
      float var2 = this.field_783.method_653(var1);
      if (this.method_609(Class111.field_1394)) {
         var2 /= 5.0F;
      }

      if (!this.field_199) {
         var2 /= 5.0F;
      }

      return var2;
   }

   public boolean method_11(Class371 var1) {
      return this.field_783.method_24(var1);
   }

   @Override
   public void method_134(Class100 var1) {
      super.method_134(var1);
      Class310 var2 = var1.method_836("Inventory");
      this.field_783.method_184(var2);
   }

   @Override
   public void method_422(Class100 var1) {
      super.method_422(var1);
      var1.method_280("Inventory", this.field_783.method_657(new Class310()));
   }

   public void method_983(Interface327 var1) {
   }

   public void method_892() {
   }

   public void method_648(Class252 var1, int var2) {
   }

   @Override
   protected float method_181() {
      return 0.12F;
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      this.field_554 = 0;
      if (this.field_1090 <= 0) {
         return false;
      }

      if (this.field_840 > this.field_431 / 2.0F) {
         return false;
      }

      if (var1 instanceof Class244 || var1 instanceof Class158) {
         if (this.field_796.field_1549 == 0) {
            var2 = 0;
         }

         if (this.field_796.field_1549 == 1) {
            var2 = var2 / 3 + 1;
         }

         if (this.field_796.field_1549 == 3) {
            var2 = var2 * 3 / 2;
         }
      }

      int var3 = 25 - this.field_783.method_413();
      int var4 = var2 * var3 + this.field_1260;
      this.field_783.method_478(var2);
      var2 = var4 / 25;
      this.field_1260 = var4 % 25;
      return var2 == 0 ? false : super.method_671(var1, var2);
   }

   public void method_595(Class24 var1) {
   }

   public void method_343(Class272 var1) {
   }

   public Class150 method_941() {
      return this.field_783.method_40();
   }

   public void method_118() {
      this.field_783.method_255(this.field_783.field_435, (Class150)null);
   }

   @Override
   public double method_89() {
      return this.field_855 - 0.5F;
   }

   public void method_87() {
      this.field_575 = -1;
      this.field_742 = true;
   }

   public void method_368() {
   }

   public void method_341() {
   }
}
