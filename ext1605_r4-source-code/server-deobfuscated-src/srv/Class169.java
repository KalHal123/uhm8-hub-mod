package srv;

import java.util.List;

public class Class169 extends Class252 {
   public int field_1161 = 0;
   public int field_1057 = 0;
   public int field_1451 = 1;

   public Class169(Class317 var1) {
      super(var1);
      this.field_1240 = true;
      this.method_273(1.5F, 0.6F);
      this.field_855 = this.field_907 / 2.0F;
      this.field_288 = false;
   }

   @Override
   public Class94 method_782(Class252 var1) {
      return var1.field_106;
   }

   @Override
   public Class94 method_190() {
      return this.field_106;
   }

   @Override
   public boolean method_318() {
      return true;
   }

   @Override
   public double method_760() {
      return this.field_907 * 0.0 - 0.3F;
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      this.field_1451 = -this.field_1451;
      this.field_1057 = 10;
      this.field_1161 += var2 * 10;
      if (this.field_1161 > 40) {
         for (int var3 = 0; var3 < 3; var3++) {
            this.method_355(Class371.field_1031.field_1379, 1, 0.0F);
         }

         for (int var4 = 0; var4 < 2; var4++) {
            this.method_355(Class350.field_1186.field_473, 1, 0.0F);
         }

         this.method_715();
      }

      return true;
   }

   @Override
   public boolean method_947() {
      return !this.field_120;
   }

   @Override
   public void method_439() {
      super.method_439();
      if (this.field_1057 > 0) {
         this.field_1057--;
      }

      if (this.field_1161 > 0) {
         this.field_1161--;
      }

      this.field_146 = this.field_1324;
      this.field_732 = this.field_632;
      this.field_271 = this.field_1321;
      byte var1 = 5;
      double var2 = 0.0;

      for (int var4 = 0; var4 < var1; var4++) {
         double var5 = this.field_106.field_817 + (this.field_106.field_1448 - this.field_106.field_817) * (var4 + 0) / var1 - 0.125;
         double var7 = this.field_106.field_817 + (this.field_106.field_1448 - this.field_106.field_817) * (var4 + 1) / var1 - 0.125;
         Class94 var9 = Class94.method_27(this.field_106.field_1397, var5, this.field_106.field_601, this.field_106.field_346, var7, this.field_106.field_854);
         if (this.field_796.method_850(var9, Class111.field_1394)) {
            var2 += 1.0 / var1;
         }
      }

      double var23 = var2 * 2.0 - 1.0;
      this.field_780 += 0.04F * var23;
      if (this.field_826 != null) {
         this.field_607 = this.field_607 + this.field_826.field_607 * 0.2;
         this.field_921 = this.field_921 + this.field_826.field_921 * 0.2;
      }

      double var6 = 0.4;
      if (this.field_607 < -var6) {
         this.field_607 = -var6;
      }

      if (this.field_607 > var6) {
         this.field_607 = var6;
      }

      if (this.field_921 < -var6) {
         this.field_921 = -var6;
      }

      if (this.field_921 > var6) {
         this.field_921 = var6;
      }

      if (this.field_199) {
         this.field_607 *= 0.5;
         this.field_780 *= 0.5;
         this.field_921 *= 0.5;
      }

      this.method_956(this.field_607, this.field_780, this.field_921);
      double var8 = Math.sqrt(this.field_607 * this.field_607 + this.field_921 * this.field_921);
      if (var8 > 0.15) {
         double var10 = Math.cos(this.field_909 * Math.PI / 180.0);
         double var12 = Math.sin(this.field_909 * Math.PI / 180.0);

         for (int var14 = 0; var14 < 1.0 + var8 * 60.0; var14++) {
            double var15 = this.field_697.nextFloat() * 2.0F - 1.0F;
            double var17 = (this.field_697.nextInt(2) * 2 - 1) * 0.7;
            if (this.field_697.nextBoolean()) {
               double var19 = this.field_1324 - var10 * var15 * 0.8 + var12 * var17;
               double var21 = this.field_1321 - var12 * var15 * 0.8 - var10 * var17;
               this.field_796.method_140("splash", var19, this.field_632 - 0.125, var21, this.field_607, this.field_780, this.field_921);
            } else {
               double var29 = this.field_1324 + var10 + var12 * var15 * 0.7;
               double var31 = this.field_1321 + var12 - var10 * var15 * 0.7;
               this.field_796.method_140("splash", var29, this.field_632 - 0.125, var31, this.field_607, this.field_780, this.field_921);
            }
         }
      }

      if (this.field_857 && var8 > 0.15) {
         this.method_715();

         for (int var26 = 0; var26 < 3; var26++) {
            this.method_355(Class371.field_1031.field_1379, 1, 0.0F);
         }

         for (int var27 = 0; var27 < 2; var27++) {
            this.method_355(Class350.field_1186.field_473, 1, 0.0F);
         }
      } else {
         this.field_607 *= 0.99F;
         this.field_780 *= 0.95F;
         this.field_921 *= 0.99F;
      }

      this.field_427 = 0.0F;
      double var24 = this.field_909;
      double var25 = this.field_146 - this.field_1324;
      double var28 = this.field_271 - this.field_1321;
      if (var25 * var25 + var28 * var28 > 0.001) {
         var24 = (float)(Math.atan2(var28, var25) * 180.0 / Math.PI);
      }

      double var16 = var24 - this.field_909;

      while (var16 >= 180.0) {
         var16 -= 360.0;
      }

      while (var16 < -180.0) {
         var16 += 360.0;
      }

      if (var16 > 20.0) {
         var16 = 20.0;
      }

      if (var16 < -20.0) {
         var16 = -20.0;
      }

      this.field_909 = (float)(this.field_909 + var16);
      this.method_254(this.field_909, this.field_427);
      List var18 = this.field_796.method_362(this, this.field_106.method_99(0.2F, 0.0, 0.2F));
      if (var18 != null && var18.size() > 0) {
         for (int var30 = 0; var30 < var18.size(); var30++) {
            Class252 var20 = (Class252)var18.get(var30);
            if (var20 != this.field_826 && var20.method_318() && var20 instanceof Class169) {
               var20.method_384(this);
            }
         }
      }

      if (this.field_826 != null && this.field_826.field_120) {
         this.field_826 = null;
      }
   }

   @Override
   protected void method_829() {
      double var1 = Math.cos(this.field_909 * Math.PI / 180.0) * 0.4;
      double var3 = Math.sin(this.field_909 * Math.PI / 180.0) * 0.4;
      this.field_826.method_732(this.field_1324 + var1, this.field_632 + this.method_760() + this.field_826.method_89(), this.field_1321 + var3);
   }

   @Override
   protected void method_422(Class100 var1) {
   }

   @Override
   protected void method_134(Class100 var1) {
   }
}
