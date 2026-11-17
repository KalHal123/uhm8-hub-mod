package ext;

import java.util.List;

public class Class565 extends Class359 {
   private int field_59 = -1;
   private int field_2194 = -1;
   private int field_2051 = -1;
   private int field_1065 = 0;
   private boolean field_1694 = false;
   public int field_73 = 0;
   private Class377 field_1940;
   private int field_440;
   private int field_2844 = 0;

   public Class565(Class454 var1) {
      super(var1);
      this.method_244(0.25F, 0.25F);
   }

   @Override
   public boolean method_306(double var1) {
      double var3 = this.field_235.method_1479() * 4.0;
      var3 *= 64.0;
      return var1 < var3 * var3;
   }

   public Class565(Class454 var1, Class377 var2) {
      super(var1);
      this.field_1940 = var2;
      this.method_244(0.25F, 0.25F);
      this.method_253(var2.field_1417, var2.field_2654, var2.field_2013, var2.field_1661, var2.field_2866);
      this.field_1417 = this.field_1417 - Class469.method_255(this.field_1661 / 180.0F * (float) Math.PI) * 0.16F;
      this.field_2654 -= 0.1F;
      this.field_2013 = this.field_2013 - Class469.method_1667(this.field_1661 / 180.0F * (float) Math.PI) * 0.16F;
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
      this.field_838 = 0.0F;
      float var3 = 0.4F;
      this.field_2549 = -Class469.method_1667(this.field_1661 / 180.0F * (float) Math.PI)
         * Class469.method_255(this.field_2866 / 180.0F * (float) Math.PI)
         * var3;
      this.field_489 = Class469.method_255(this.field_1661 / 180.0F * (float) Math.PI) * Class469.method_255(this.field_2866 / 180.0F * (float) Math.PI) * var3;
      this.field_2501 = -Class469.method_1667(this.field_2866 / 180.0F * (float) Math.PI) * var3;
      this.method_1731(this.field_2549, this.field_2501, this.field_489, 1.5F, 1.0F);
   }

   public void method_1731(double var1, double var3, double var5, float var7, float var8) {
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
      this.field_440 = 0;
   }

   @Override
   public void method_46() {
      super.method_46();
      if (this.field_73 > 0) {
         this.field_73--;
      }

      if (this.field_1694) {
         int var1 = this.field_1468.method_197(this.field_59, this.field_2194, this.field_2051);
         if (var1 == this.field_1065) {
            this.field_440++;
            if (this.field_440 == 1200) {
               this.method_1594();
            }

            if (var1 == Class390.field_2305.field_2151) {
               Class334 var2 = new Class334(Class390.field_2305, 1);
               Class198 var3 = new Class198(this.field_1468, this.field_59 + 0.5, this.field_2194 + 0.5, this.field_2051 + 0.5, var2);
               var3.field_2549 = this.field_2850.nextDouble() - 0.5;
               var3.field_2501 = this.field_2850.nextDouble() - 0.5;
               var3.field_489 = this.field_2850.nextDouble() - 0.5;
               var3.field_2549 /= 8.0;
               var3.field_2501 /= 8.0;
               var3.field_489 /= 8.0;
               this.field_1468.method_1347("smoke", this.field_59 + 0.5, this.field_2194 + 0.5, this.field_2051 + 0.5, 0.0, 0.0, 0.0);
               this.field_1468.method_1447(var3);
               this.field_1468.method_1481(this.field_59, this.field_2194, this.field_2051, 0);
               this.field_1468.method_1678(this.field_59, this.field_2194, this.field_2051, this.field_59, this.field_2194, this.field_2051);
            }

            return;
         }

         this.field_1694 = false;
         this.field_2549 = this.field_2549 * (this.field_2850.nextFloat() * 0.2F);
         this.field_2501 = this.field_2501 * (this.field_2850.nextFloat() * 0.2F);
         this.field_489 = this.field_489 * (this.field_2850.nextFloat() * 0.2F);
         this.field_440 = 0;
         this.field_2844 = 0;
      } else {
         this.field_2844++;
      }

      Class214 var15 = Class214.method_701(this.field_1417, this.field_2654, this.field_2013);
      Class214 var17 = Class214.method_701(this.field_1417 + this.field_2549, this.field_2654 + this.field_2501, this.field_2013 + this.field_489);
      Class366 var19 = this.field_1468.method_818(var15, var17);
      var15 = Class214.method_701(this.field_1417, this.field_2654, this.field_2013);
      var17 = Class214.method_701(this.field_1417 + this.field_2549, this.field_2654 + this.field_2501, this.field_2013 + this.field_489);
      if (var19 != null) {
         var17 = Class214.method_701(var19.field_393.field_882, var19.field_393.field_1911, var19.field_393.field_3045);
      }

      Class359 var4 = null;
      List var5 = this.field_1468.method_1349(this, this.field_235.method_1669(this.field_2549, this.field_2501, this.field_489).method_1384(1.0, 1.0, 1.0));
      double var6 = 0.0;

      for (int var8 = 0; var8 < var5.size(); var8++) {
         Class359 var10 = (Class359)var5.get(var8);
         if (var10.method_243() && (var10 != this.field_1940 || this.field_2844 >= 5)) {
            float var9 = 0.3F;
            Class630 var11 = var10.field_235.method_1384(var9, var9, var9);
            Class366 var12 = var11.method_64(var15, var17);
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
         var19 = new Class366(var4);
      }

      if (var19 != null) {
         if (var19.field_541 != null && var19.field_541.method_308(this.field_1940, 0)) {
         }

         for (int var20 = 0; var20 < 8; var20++) {
            this.field_1468.method_1347("snowballpoof", this.field_1417, this.field_2654, this.field_2013, 0.0, 0.0, 0.0);
         }

         this.method_1594();
      }

      this.field_1417 = this.field_1417 + this.field_2549;
      this.field_2654 = this.field_2654 + this.field_2501;
      this.field_2013 = this.field_2013 + this.field_489;
      float var22 = Class469.method_822(this.field_2549 * this.field_2549 + this.field_489 * this.field_489);
      this.field_1661 = (float)(Math.atan2(this.field_2549, this.field_489) * 180.0 / (float) Math.PI);
      this.field_2866 = (float)(Math.atan2(this.field_2501, var22) * 180.0 / (float) Math.PI);

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
      float var23 = 0.99F;
      float var21 = 0.03F;
      if (this.method_36()) {
         for (int var24 = 0; var24 < 4; var24++) {
            float var25 = 0.25F;
            this.field_1468
               .method_1347(
                  "bubble",
                  this.field_1417 - this.field_2549 * var25,
                  this.field_2654 - this.field_2501 * var25,
                  this.field_2013 - this.field_489 * var25,
                  this.field_2549,
                  this.field_2501,
                  this.field_489
               );
         }

         var23 = 0.8F;
      }

      this.field_2549 *= var23;
      this.field_2501 *= var23;
      this.field_489 *= var23;
      this.field_2501 -= var21;
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
   }

   @Override
   public void method_863(Class686 var1) {
      var1.method_777("xTile", (short)this.field_59);
      var1.method_777("yTile", (short)this.field_2194);
      var1.method_777("zTile", (short)this.field_2051);
      var1.method_1567("inTile", (byte)this.field_1065);
      var1.method_1567("shake", (byte)this.field_73);
      var1.method_1567("inGround", (byte)(this.field_1694 ? 1 : 0));
   }

   @Override
   public void method_1054(Class686 var1) {
      this.field_59 = var1.method_1321("xTile");
      this.field_2194 = var1.method_1321("yTile");
      this.field_2051 = var1.method_1321("zTile");
      this.field_1065 = var1.method_1913("inTile") & 255;
      this.field_73 = var1.method_1913("shake") & 255;
      this.field_1694 = var1.method_1913("inGround") == 1;
   }

   @Override
   public void method_1714(Class354 var1) {
      if (this.field_1694 && this.field_1940 == var1 && this.field_73 <= 0 && var1.field_559.method_572(new Class334(Class755.field_1344.field_10, 1))) {
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
