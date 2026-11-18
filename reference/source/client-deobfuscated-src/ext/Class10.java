package ext;

import java.util.List;

public class Class10 extends Class408 {
   private int field_2066 = -1;
   private int field_2538 = -1;
   private int field_2961 = -1;
   private int field_1564 = 0;
   private boolean field_2195 = false;
   public int field_3068 = 0;
   Class377 field_1942;
   private int field_637;
   private int field_1873 = 0;

   public Class10(Class454 var1) {
      super(var1);
      this.method_244(0.5F, 0.5F);
   }

   public Class10(Class454 var1, Class377 var2) {
      super(var1);
      this.field_1942 = var2;
      this.method_244(0.5F, 0.5F);
      this.method_253(var2.field_1417, var2.field_2654, var2.field_2013, var2.field_1661, var2.field_2866);
      this.field_1417 = this.field_1417 - Class469.method_255(this.field_1661 / 180.0F * (float) Math.PI) * 0.16F;
      this.field_2654 -= 0.1F;
      this.field_2013 = this.field_2013 - Class469.method_1667(this.field_1661 / 180.0F * (float) Math.PI) * 0.16F;
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
      this.field_838 = 0.0F;
      this.field_2549 = -Class469.method_1667(this.field_1661 / 180.0F * (float) Math.PI) * Class469.method_255(this.field_2866 / 180.0F * (float) Math.PI);
      this.field_489 = Class469.method_255(this.field_1661 / 180.0F * (float) Math.PI) * Class469.method_255(this.field_2866 / 180.0F * (float) Math.PI);
      this.field_2501 = -Class469.method_1667(this.field_2866 / 180.0F * (float) Math.PI);
      this.method_1271(this.field_2549, this.field_2501, this.field_489, 1.5F, 1.0F);
   }

   public void method_1271(double var1, double var3, double var5, float var7, float var8) {
      float var9 = Class469.method_822(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= var9;
      var3 /= var9;
      var5 /= var9;
      var1 += this.field_2850.nextGaussian() * 0.0075F * var8;
      var3 += this.field_2850.nextGaussian() * 0.0075F * var8;
      var5 += this.field_2850.nextGaussian() * 0.0075F * var8;
      var1 *= var7;
      var3 *= var7;
      var5 *= var7;
      this.field_2549 = var1;
      this.field_2501 = var3;
      this.field_489 = var5;
      float var10 = Class469.method_822(var1 * var1 + var5 * var5);
      this.field_2772 = this.field_1661 = (float)(Math.atan2(var1, var5) * 180.0 / (float) Math.PI);
      this.field_2984 = this.field_2866 = (float)(Math.atan2(var3, var10) * 180.0 / (float) Math.PI);
      this.field_637 = 0;
   }

   @Override
   public void method_46() {
      super.method_46();
      if (this.field_3068 > 0) {
         this.field_3068--;
      }

      if (this.field_2195) {
         int var1 = this.field_1468.method_197(this.field_2066, this.field_2538, this.field_2961);
         if (var1 == this.field_1564) {
            this.field_637++;
            if (this.field_637 == 1200) {
               this.method_1594();
            }

            return;
         }

         this.field_2195 = false;
         this.field_2549 = this.field_2549 * (this.field_2850.nextFloat() * 0.2F);
         this.field_2501 = this.field_2501 * (this.field_2850.nextFloat() * 0.2F);
         this.field_489 = this.field_489 * (this.field_2850.nextFloat() * 0.2F);
         this.field_637 = 0;
         this.field_1873 = 0;
      } else {
         this.field_1873++;
      }

      Class214 var15 = Class214.method_701(this.field_1417, this.field_2654, this.field_2013);
      Class214 var2 = Class214.method_701(this.field_1417 + this.field_2549, this.field_2654 + this.field_2501, this.field_2013 + this.field_489);
      Class366 var3 = this.field_1468.method_818(var15, var2);
      var15 = Class214.method_701(this.field_1417, this.field_2654, this.field_2013);
      var2 = Class214.method_701(this.field_1417 + this.field_2549, this.field_2654 + this.field_2501, this.field_2013 + this.field_489);
      if (var3 != null) {
         var2 = Class214.method_701(var3.field_393.field_882, var3.field_393.field_1911, var3.field_393.field_3045);
      }

      Class359 var4 = null;
      List var5 = this.field_1468.method_1349(this, this.field_235.method_1669(this.field_2549, this.field_2501, this.field_489).method_1384(1.0, 1.0, 1.0));
      double var6 = 0.0;

      for (int var9 = 0; var9 < var5.size(); var9++) {
         Class359 var10 = (Class359)var5.get(var9);
         if (var10.method_243() && (var10 != this.field_1942 || this.field_1873 >= 5)) {
            float var8 = 0.3F;
            Class630 var11 = var10.field_235.method_1384(var8, var8, var8);
            Class366 var12 = var11.method_64(var15, var2);
            if (var12 != null) {
               double var13 = var15.method_562(var12.field_393);
               if (var13 < var6 || var6 == 0.0) {
                  var4 = var10;
                  var6 = var13;
               }
            }
         }
      }

      if (var4 != null) {
         var3 = new Class366(var4);
      }

      if (var3 != null) {
         if (var3.field_541 != null) {
            if (var3.field_541.method_308(this.field_1942, 4)) {
               this.field_1468.method_1904(this, "random.drr", 1.0F, 1.2F / (this.field_2850.nextFloat() * 0.2F + 0.9F));
               this.method_1594();
            } else {
               this.field_2549 *= -0.1F;
               this.field_2501 *= -0.1F;
               this.field_489 *= -0.1F;
               this.field_1661 += 180.0F;
               this.field_2772 += 180.0F;
               this.field_1873 = 0;
            }
         } else {
            this.field_2066 = var3.field_1129;
            this.field_2538 = var3.field_1756;
            this.field_2961 = var3.field_513;
            this.field_1564 = this.field_1468.method_197(this.field_2066, this.field_2538, this.field_2961);
            this.field_2549 = (float)(var3.field_393.field_882 - this.field_1417);
            this.field_2501 = (float)(var3.field_393.field_1911 - this.field_2654);
            this.field_489 = (float)(var3.field_393.field_3045 - this.field_2013);
            float var19 = Class469.method_822(this.field_2549 * this.field_2549 + this.field_2501 * this.field_2501 + this.field_489 * this.field_489);
            this.field_1417 = this.field_1417 - this.field_2549 / var19 * 0.05F;
            this.field_2654 = this.field_2654 - this.field_2501 / var19 * 0.05F;
            this.field_2013 = this.field_2013 - this.field_489 / var19 * 0.05F;
            this.field_1468.method_1904(this, "random.drr", 1.0F, 1.2F / (this.field_2850.nextFloat() * 0.2F + 0.9F));
            this.field_2195 = true;
            this.field_3068 = 7;
         }
      }

      this.field_1417 = this.field_1417 + this.field_2549;
      this.field_2654 = this.field_2654 + this.field_2501;
      this.field_2013 = this.field_2013 + this.field_489;
      float var20 = Class469.method_822(this.field_2549 * this.field_2549 + this.field_489 * this.field_489);
      this.field_1661 = (float)(Math.atan2(this.field_2549, this.field_489) * 180.0 / (float) Math.PI);
      this.field_2866 = (float)(Math.atan2(this.field_2501, var20) * 180.0 / (float) Math.PI);

      while (this.field_2866 - this.field_2984 < -180.0F) {
         this.field_2984 -= 360.0F;
      }

      while (this.field_2866 - this.field_2984 >= 180.0F) {
         this.field_2984 += 360.0F;
      }

      while (this.field_1661 - this.field_2772 < -180.0F) {
         this.field_2772 -= 360.0F;
      }

      while (this.field_1661 - this.field_2772 >= 180.0F) {
         this.field_2772 += 360.0F;
      }

      this.field_2866 = this.field_2984 + (this.field_2866 - this.field_2984) * 0.2F;
      this.field_1661 = this.field_2772 + (this.field_1661 - this.field_2772) * 0.2F;
      float var21 = 0.99F;
      float var18 = 0.03F;
      if (this.method_36()) {
         for (int var22 = 0; var22 < 4; var22++) {
            float var23 = 0.25F;
            this.field_1468
               .method_1347(
                  "bubble",
                  this.field_1417 - this.field_2549 * var23,
                  this.field_2654 - this.field_2501 * var23,
                  this.field_2013 - this.field_489 * var23,
                  this.field_2549,
                  this.field_2501,
                  this.field_489
               );
         }

         var21 = 0.8F;
      }

      this.field_2549 *= var21;
      this.field_2501 *= var21;
      this.field_489 *= var21;
      this.field_2501 -= var18;
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
   }

   @Override
   public void method_863(Class686 var1) {
      var1.method_777("xTile", (short)this.field_2066);
      var1.method_777("yTile", (short)this.field_2538);
      var1.method_777("zTile", (short)this.field_2961);
      var1.method_1567("inTile", (byte)this.field_1564);
      var1.method_1567("shake", (byte)this.field_3068);
      var1.method_1567("inGround", (byte)(this.field_2195 ? 1 : 0));
   }

   @Override
   public void method_1054(Class686 var1) {
      this.field_2066 = var1.method_1321("xTile");
      this.field_2538 = var1.method_1321("yTile");
      this.field_2961 = var1.method_1321("zTile");
      this.field_1564 = var1.method_1913("inTile") & 255;
      this.field_3068 = var1.method_1913("shake") & 255;
      this.field_2195 = var1.method_1913("inGround") == 1;
   }

   @Override
   public void method_1714(Class354 var1) {
      if (this.field_2195 && this.field_1942 == var1 && this.field_3068 <= 0 && var1.field_559.method_572(new Class334(Class755.field_1344.field_10, 1))) {
         this.field_1468.method_1904(this, "random.pop", 0.2F, ((this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         var1.method_1132(this, 1);
         this.method_1594();
      }
   }

   @Override
   public float method_1140() {
      return 0.0F;
   }
}
