package ext;

import java.util.List;

public class Class354 extends Class377 {
   public Class267 field_559 = new Class267(this);
   public int field_3036 = 0;
   public float field_771;
   public float field_2216;
   public boolean field_2228 = false;
   public int field_264 = 0;
   public String field_1716;
   private int field_2428 = 0;
   public long field_2875 = 0L;
   public int field_2307 = 0;
   public Class736 field_3 = null;
   public boolean field_132 = false;
   boolean field_417 = false;

   public Class354(Class454 var1) {
      super(var1);
      this.field_838 = 1.62F;
      this.method_253(var1.field_18 + 0.5, var1.field_934 + 1, var1.field_1361 + 0.5, 0.0F, 0.0F);
      this.field_2572 = 20;
      this.field_1043 = "humanoid";
      this.field_734 = 20;
      this.field_2863 = "/char.png";
   }

   @Override
   public void method_85() {
      super.method_85();
      this.field_771 = this.field_2216;
      this.field_2216 = 0.0F;
   }

   @Override
   public void method_735() {
      this.field_838 = 1.62F;
      this.method_244(0.6F, 1.8F);
      super.method_735();
      this.field_2572 = 20;
      this.field_567 = 0;
   }

   @Override
   protected void method_1215() {
      if (this.field_2228) {
         this.field_264++;
         if (this.field_264 == 8) {
            this.field_264 = 0;
            this.field_2228 = false;
         }
      } else {
         this.field_264 = 0;
      }

      this.field_1507 = this.field_264 / 8.0F;
   }

   @Override
   public void method_981(double var1, double var3, double var5) {
      if (this.field_132) {
         var1 *= 4.0;
         var5 *= 4.0;
      }

      super.method_981(var1, var3, var5);
   }

   public void method_915() {
      boolean var1 = this.field_417;
      if (!this.method_482(Class160.field_1413)
         && (
            !this.field_417
               || this.field_1468.method_197((int)this.field_1417, (int)this.field_2654 - 1, (int)this.field_2013) == 0
               || this.field_1468.method_197((int)this.field_1417, (int)this.field_2654, (int)this.field_2013) == 0
         )) {
         this.method_244(0.6F, 1.8F);
         this.field_838 = 1.62F;
         this.field_417 = false;
      } else {
         this.method_244(0.6F, 0.8F);
         this.field_838 = 0.81F;
         this.field_1113 = this.field_1661;
         this.field_417 = true;
      }

      if (this.field_417 != var1) {
         this.method_172(this.field_1417, this.field_2654, this.field_2013);
      }
   }

   public void method_501() {
      super.method_22();
   }

   @Override
   public void method_22() {
      if (this.field_2875 > 0L) {
         this.field_2875--;
      }

      this.method_915();
      if (this.field_1468.field_1535 == 0
         && !this.method_482(Class160.field_1413)
         && !(this.field_1468 instanceof Class46)
         && this.field_2572 < 20
         && this.field_1399 % 20 * 4 == 0) {
         this.method_1796(1);
      }

      if (this.field_2307 > 0) {
         this.field_2307--;
      }

      this.field_559.method_1782();
      this.field_771 = this.field_2216;
      super.method_22();
      if (this.field_132) {
         this.field_2501 = 0.0;
      }

      float var1 = Class469.method_822(this.field_2549 * this.field_2549 + this.field_489 * this.field_489);
      float var2 = (float)Math.atan(-this.field_2501 * 0.2F) * 15.0F;
      if (var1 > 0.1F) {
         var1 = 0.1F;
      }

      if (!this.field_2669 || this.field_2572 <= 0) {
         var1 = 0.0F;
      }

      if (this.field_2669 || this.field_2572 <= 0) {
         var2 = 0.0F;
      }

      this.field_2216 = this.field_2216 + (var1 - this.field_2216) * 0.4F;
      this.field_32 = this.field_32 + (var2 - this.field_32) * 0.8F;
      if (this.field_2572 > 0) {
         List var3 = this.field_1468.method_1349(this, this.field_235.method_1384(1.0, 0.0, 1.0));
         if (var3 != null) {
            for (int var4 = 0; var4 < var3.size(); var4++) {
               this.method_221((Class359)var3.get(var4));
            }
         }
      }
   }

   @Override
   protected boolean method_1428() {
      Class334 var1 = this.field_559.method_93();
      return var1 == null || var1.method_801().field_10 != Class50.field_2502.field_10;
   }

   public void method_221(Class359 var1) {
      var1.method_1714(this);
   }

   public int method_592() {
      return this.field_3036;
   }

   @Override
   public void method_379(Class359 var1) {
      this.method_244(0.2F, 0.2F);
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
      this.field_2501 = 0.1F;
      if (this.field_1716.equals("Notch")) {
         this.method_1307(new Class334(Class755.field_3063, 1), true);
      }

      this.field_559.method_343();
      if (var1 != null) {
         this.field_2549 = -Class469.method_255((this.field_523 + this.field_1661) * (float) Math.PI / 180.0F) * 0.1F;
         this.field_489 = -Class469.method_1667((this.field_523 + this.field_1661) * (float) Math.PI / 180.0F) * 0.1F;
      } else {
         this.field_2549 = this.field_489 = 0.0;
      }

      this.field_838 = 0.1F;
   }

   @Override
   public void method_395(Class359 var1, int var2) {
      this.field_3036 += var2;
   }

   public void method_1771(Class334 var1) {
      this.method_1307(var1, false);
   }

   public void method_1307(Class334 var1, boolean var2) {
      if (var1 != null) {
         Class198 var3 = new Class198(this.field_1468, this.field_1417, this.field_2654 - 0.3F + this.method_1875(), this.field_2013, var1);
         var3.field_2283 = 40;
         float var4 = 0.1F;
         if (var2) {
            float var5 = this.field_2850.nextFloat() * 0.5F;
            float var6 = this.field_2850.nextFloat() * (float) Math.PI * 2.0F;
            var3.field_2549 = -Class469.method_1667(var6) * var5;
            var3.field_489 = Class469.method_255(var6) * var5;
            var3.field_2501 = 0.2F;
         } else {
            var4 = 0.3F;
            var3.field_2549 = -Class469.method_1667(this.field_1661 / 180.0F * (float) Math.PI)
               * Class469.method_255(this.field_2866 / 180.0F * (float) Math.PI)
               * var4;
            var3.field_489 = Class469.method_255(this.field_1661 / 180.0F * (float) Math.PI)
               * Class469.method_255(this.field_2866 / 180.0F * (float) Math.PI)
               * var4;
            var3.field_2501 = -Class469.method_1667(this.field_2866 / 180.0F * (float) Math.PI) * var4 + 0.1F;
            var4 = 0.02F;
            float var10 = this.field_2850.nextFloat() * (float) Math.PI * 2.0F;
            var4 *= this.field_2850.nextFloat();
            var3.field_2549 = var3.field_2549 + Math.cos(var10) * var4;
            var3.field_2501 = var3.field_2501 + (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.1F;
            var3.field_489 = var3.field_489 + Math.sin(var10) * var4;
         }

         this.method_847(var3);
      }
   }

   protected void method_847(Class198 var1) {
      this.field_1468.method_1447(var1);
   }

   public float method_240(Class108 var1) {
      float var2 = this.field_559.method_651(var1);
      if (this.method_482(Class160.field_1413)) {
         var2 /= 4.0F;
      }

      if (!this.field_2669 && !this.field_132) {
         var2 /= 4.0F;
      }

      return var2;
   }

   public boolean method_1648(Class108 var1) {
      return this.field_559.method_182(var1);
   }

   @Override
   public void method_1054(Class686 var1) {
      super.method_1054(var1);
      Class378 var2 = var1.method_1609("Inventory");
      this.field_559.method_639(var2);
      this.field_2875 = var1.method_328("ObvCDTimer");
   }

   @Override
   public void method_863(Class686 var1) {
      super.method_863(var1);
      var1.method_1647("ObvCDTimer", this.field_2875);
      var1.method_1310("FlowerHealTimer", this.field_2307);
      var1.method_936("Inventory", this.field_559.method_977(new Class378()));
   }

   public void method_1725() {
   }

   public void method_1217(Interface181 var1) {
   }

   public void method_1070() {
   }

   public void method_1132(Class359 var1, int var2) {
   }

   @Override
   protected float method_1875() {
      return this.field_417 ? -0.1F : 0.12F;
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      this.field_2861 = 0;
      if (this.field_2572 <= 0) {
         return false;
      }

      if (this.field_1659 > this.field_444 / 2.0F) {
         return false;
      }

      if (var1 instanceof Class564 || var1 instanceof Class10) {
         if (this.field_1468.field_1535 == 0 && !(this.field_1468 instanceof Class46)) {
            var2 = 0;
         }

         if (this.field_1468.field_1535 == 1) {
            var2 = var2 / 3 + 1;
         }

         if (this.field_1468.field_1535 == 3) {
            var2 = var2 * 3 / 2;
         }
      }

      int var3 = 25 - this.field_559.method_239();
      int var4 = var2 * var3 + this.field_2428;
      this.field_559.method_1595(var2);
      var2 = var4 / 25;
      this.field_2428 = var4 % 25;
      return var2 == 0 ? false : super.method_308(var1, var2);
   }

   public void method_1790(Class38 var1) {
   }

   public void method_1083(Class243 var1) {
   }

   public void method_699() {
   }

   public void method_1492(Class359 var1) {
   }

   public Class334 method_1857() {
      return this.field_559.method_93();
   }

   public void method_1625() {
      this.field_559.method_708(this.field_559.field_2127, (Class334)null);
   }

   @Override
   public double method_658() {
      return this.field_838 - 0.5F;
   }

   public void method_1385() {
      this.field_264 = -1;
      this.field_2228 = true;
   }

   public void method_472() {
   }

   public void method_1011(Class659 var1) {
   }
}
