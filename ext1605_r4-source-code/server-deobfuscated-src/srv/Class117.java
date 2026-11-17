package srv;

import java.util.List;

public class Class117 extends Class283 {
   private int field_1500 = -1;
   private int field_487 = -1;
   private int field_213 = -1;
   private int field_962 = 0;
   private boolean field_1515 = false;
   public int field_1243 = 0;
   private Class92 field_1012;
   private int field_933;
   private int field_696 = 0;

   public Class117(Class317 var1) {
      super(var1);
      this.method_273(0.5F, 0.5F);
   }

   public Class117(Class317 var1, Class92 var2) {
      super(var1);
      this.field_1012 = var2;
      this.method_273(0.5F, 0.5F);
      this.method_885(var2.field_1324, var2.field_632, var2.field_1321, var2.field_909, var2.field_427);
      this.field_1324 = this.field_1324 - Class380.method_520(this.field_909 / 180.0F * (float) Math.PI) * 0.16F;
      this.field_632 -= 0.1F;
      this.field_1321 = this.field_1321 - Class380.method_241(this.field_909 / 180.0F * (float) Math.PI) * 0.16F;
      this.method_732(this.field_1324, this.field_632, this.field_1321);
      this.field_855 = 0.0F;
      this.field_607 = -Class380.method_241(this.field_909 / 180.0F * (float) Math.PI) * Class380.method_520(this.field_427 / 180.0F * (float) Math.PI);
      this.field_921 = Class380.method_520(this.field_909 / 180.0F * (float) Math.PI) * Class380.method_520(this.field_427 / 180.0F * (float) Math.PI);
      this.field_780 = -Class380.method_241(this.field_427 / 180.0F * (float) Math.PI);
      this.method_812(this.field_607, this.field_780, this.field_921, 3.5F, 1.0F);
   }

   public void method_812(double var1, double var3, double var5, float var7, float var8) {
      float var9 = Class380.method_164(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= var9;
      var3 /= var9;
      var5 /= var9;
      var1 += this.field_697.nextGaussian() * 0.0075F * var8;
      var3 += this.field_697.nextGaussian() * 0.0075F * var8;
      var5 += this.field_697.nextGaussian() * 0.0075F * var8;
      var1 *= var7;
      var3 *= var7;
      var5 *= var7;
      this.field_607 = var1;
      this.field_780 = var3;
      this.field_921 = var5;
      float var10 = Class380.method_164(var1 * var1 + var5 * var5);
      this.field_90 = this.field_909 = (float)(Math.atan2(var1, var5) * 180.0 / (float) Math.PI);
      this.field_253 = this.field_427 = (float)(Math.atan2(var3, var10) * 180.0 / (float) Math.PI);
      this.field_933 = 0;
   }

   @Override
   public void method_439() {
      super.method_439();
      if (this.field_1243 > 0) {
         this.field_1243--;
      }

      if (this.field_1515) {
         int var1 = this.field_796.method_813(this.field_1500, this.field_487, this.field_213);
         if (var1 == this.field_962) {
            this.field_933++;
            if (this.field_933 == 1200) {
               this.method_715();
            }

            if (var1 == Class323.field_853.field_1379) {
               Class150 var2 = new Class150(Class323.field_853, 1);
               Class39 var3 = new Class39(this.field_796, this.field_1500 + 0.5, this.field_487 + 0.5, this.field_213 + 0.5, var2);
               var3.field_607 = this.field_697.nextDouble() - 0.5;
               var3.field_780 = this.field_697.nextDouble() - 0.5;
               var3.field_921 = this.field_697.nextDouble() - 0.5;
               var3.field_607 /= 8.0;
               var3.field_780 /= 8.0;
               var3.field_921 /= 8.0;
               this.field_796.method_140("smoke", this.field_1500 + 0.5, this.field_487 + 0.5, this.field_213 + 0.5, 0.0, 0.0, 0.0);
               this.field_796.method_237(var3);
               this.field_796.method_226(this.field_1500, this.field_487, this.field_213, 0);
               this.field_796.method_674(this.field_1500, this.field_487, this.field_213, this.field_1500, this.field_487, this.field_213);
            }

            return;
         }

         this.field_1515 = false;
         this.field_607 = this.field_607 * (this.field_697.nextFloat() * 0.2F);
         this.field_780 = this.field_780 * (this.field_697.nextFloat() * 0.2F);
         this.field_921 = this.field_921 * (this.field_697.nextFloat() * 0.2F);
         this.field_933 = 0;
         this.field_696 = 0;
      } else {
         this.field_696++;
      }

      Class47 var15 = Class47.method_875(this.field_1324, this.field_632, this.field_1321);
      Class47 var17 = Class47.method_875(this.field_1324 + this.field_607, this.field_632 + this.field_780, this.field_1321 + this.field_921);
      Class3 var19 = this.field_796.method_505(var15, var17);
      var15 = Class47.method_875(this.field_1324, this.field_632, this.field_1321);
      var17 = Class47.method_875(this.field_1324 + this.field_607, this.field_632 + this.field_780, this.field_1321 + this.field_921);
      if (var19 != null) {
         var17 = Class47.method_875(var19.field_1022.field_13, var19.field_1022.field_173, var19.field_1022.field_510);
      }

      Class252 var4 = null;
      List var5 = this.field_796.method_362(this, this.field_106.method_949(this.field_607, this.field_780, this.field_921).method_99(1.0, 1.0, 1.0));
      double var6 = 0.0;

      for (int var9 = 0; var9 < var5.size(); var9++) {
         Class252 var10 = (Class252)var5.get(var9);
         if (var10.method_947() && (var10 != this.field_1012 || this.field_696 >= 5)) {
            float var8 = 0.3F;
            Class94 var11 = var10.field_106.method_99(var8, var8, var8);
            Class3 var12 = var11.method_560(var15, var17);
            if (var12 != null) {
               double var13 = var15.method_797(var12.field_1022);
               if (var13 < var6 || var6 == 0.0) {
                  var4 = var10;
                  var6 = var13;
               }
            }
         }
      }

      if (var4 != null) {
         var19 = new Class3(var4);
      }

      if (var19 != null) {
         if (var19.field_1570 != null) {
            if (var19.field_1570.method_671(this.field_1012, 4)) {
               this.field_796.method_38(this, "random.drr", 1.0F, 1.2F / (this.field_697.nextFloat() * 0.2F + 0.9F));
               this.method_715();
            } else {
               this.field_607 *= -0.1F;
               this.field_780 *= -0.1F;
               this.field_921 *= -0.1F;
               this.field_909 += 180.0F;
               this.field_90 += 180.0F;
               this.field_696 = 0;
            }
         } else {
            this.field_1500 = var19.field_870;
            this.field_487 = var19.field_1055;
            this.field_213 = var19.field_1037;
            this.field_962 = this.field_796.method_813(this.field_1500, this.field_487, this.field_213);
            this.field_607 = (float)(var19.field_1022.field_13 - this.field_1324);
            this.field_780 = (float)(var19.field_1022.field_173 - this.field_632);
            this.field_921 = (float)(var19.field_1022.field_510 - this.field_1321);
            float var21 = Class380.method_164(this.field_607 * this.field_607 + this.field_780 * this.field_780 + this.field_921 * this.field_921);
            this.field_1324 = this.field_1324 - this.field_607 / var21 * 0.05F;
            this.field_632 = this.field_632 - this.field_780 / var21 * 0.05F;
            this.field_1321 = this.field_1321 - this.field_921 / var21 * 0.05F;
            this.field_796.method_38(this, "random.drr", 1.0F, 1.2F / (this.field_697.nextFloat() * 0.2F + 0.9F));
            this.field_1515 = true;
            this.field_1243 = 7;
         }
      }

      this.field_1324 = this.field_1324 + this.field_607;
      this.field_632 = this.field_632 + this.field_780;
      this.field_1321 = this.field_1321 + this.field_921;
      float var22 = Class380.method_164(this.field_607 * this.field_607 + this.field_921 * this.field_921);
      this.field_909 = (float)(Math.atan2(this.field_607, this.field_921) * 180.0 / (float) Math.PI);
      this.field_427 = (float)(Math.atan2(this.field_780, var22) * 180.0 / (float) Math.PI);

      while (this.field_427 - this.field_253 < -180.0F) {
         this.field_253 -= 360.0F;
      }

      while (this.field_427 - this.field_253 >= 180.0F) {
         this.field_253 += 360.0F;
      }

      while (this.field_909 - this.field_90 < -180.0F) {
         this.field_90 -= 360.0F;
      }

      while (this.field_909 - this.field_90 >= 180.0F) {
         this.field_90 += 360.0F;
      }

      this.field_427 = this.field_253 + (this.field_427 - this.field_253) * 0.2F;
      this.field_909 = this.field_90 + (this.field_909 - this.field_90) * 0.2F;
      float var23 = 0.99F;
      float var20 = 0.03F;
      if (this.method_643()) {
         for (int var24 = 0; var24 < 4; var24++) {
            float var25 = 0.25F;
            this.field_796
               .method_140(
                  "bubble",
                  this.field_1324 - this.field_607 * var25,
                  this.field_632 - this.field_780 * var25,
                  this.field_1321 - this.field_921 * var25,
                  this.field_607,
                  this.field_780,
                  this.field_921
               );
         }

         var23 = 0.8F;
      }

      this.field_607 *= var23;
      this.field_780 *= var23;
      this.field_921 *= var23;
      this.field_780 -= var20;
      this.method_732(this.field_1324, this.field_632, this.field_1321);
   }

   @Override
   public void method_422(Class100 var1) {
      var1.method_761("xTile", (short)this.field_1500);
      var1.method_761("yTile", (short)this.field_487);
      var1.method_761("zTile", (short)this.field_213);
      var1.method_1003("inTile", (byte)this.field_962);
      var1.method_1003("shake", (byte)this.field_1243);
      var1.method_1003("inGround", (byte)(this.field_1515 ? 1 : 0));
   }

   @Override
   public void method_134(Class100 var1) {
      this.field_1500 = var1.method_799("xTile");
      this.field_487 = var1.method_799("yTile");
      this.field_213 = var1.method_799("zTile");
      this.field_962 = var1.method_561("inTile") & 255;
      this.field_1243 = var1.method_561("shake") & 255;
      this.field_1515 = var1.method_561("inGround") == 1;
   }

   @Override
   public void method_644(Class41 var1) {
      if (this.field_1515 && this.field_1012 == var1 && this.field_1243 <= 0 && var1.field_783.method_263(new Class150(Class13.field_1061.field_473, 1))) {
         this.field_796.method_38(this, "random.pop", 0.2F, ((this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         var1.method_648(this, 1);
         this.method_715();
      }
   }

   public float method_175() {
      return 0.0F;
   }
}
