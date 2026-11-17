package ext;

import java.util.List;

public class Class377 extends Class359 {
   public int field_444 = 20;
   public float field_1113 = 0.0F;
   public float field_616 = 0.0F;
   protected float field_770;
   protected float field_1655;
   protected float field_1579;
   protected float field_2468;
   protected String field_2863 = "/char.png";
   protected String field_1043 = null;
   protected int field_361 = 0;
   public boolean field_3080 = false;
   public float field_2593;
   public float field_1507;
   public int field_2572 = 10;
   public int field_297;
   private int field_2773;
   public int field_2148;
   public int field_1322;
   public float field_523 = 0.0F;
   public int field_567 = 0;
   public int field_790 = 0;
   public float field_1758;
   public float field_32;
   protected boolean field_1662 = false;
   public float field_2980;
   public float field_937;
   public float field_1747;
   private int field_717;
   private double field_2624;
   private double field_1343;
   private double field_1874;
   private double field_2080;
   private double field_1163;
   float field_784 = 0.0F;
   protected int field_2861 = 0;
   protected float field_1818;
   protected float field_269;
   protected float field_1783;
   protected boolean field_2698 = false;
   protected float field_2463 = 0.0F;
   protected float field_2079 = 0.7F;
   private Class359 field_1091;
   private int field_3142 = 0;
   public boolean field_1999 = true;

   public Class377(Class454 var1) {
      super(var1);
      this.field_1968 = true;
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
      this.field_1661 = (float)(Math.random() * (float) Math.PI * 2.0);
      this.field_2827 = 0.5F;
   }

   protected boolean method_689(Class359 var1) {
      return this.field_1468
            .method_818(
               Class214.method_701(this.field_1417, this.field_2654 + this.method_1875(), this.field_2013),
               Class214.method_701(var1.field_1417, var1.field_2654 + var1.method_1875(), var1.field_2013)
            )
         == null;
   }

   @Override
   public String method_431() {
      return this.field_2863;
   }

   @Override
   public boolean method_243() {
      return !this.field_2642;
   }

   @Override
   public boolean method_966() {
      return !this.field_2642;
   }

   @Override
   protected float method_1875() {
      return this.field_1443 * 0.85F;
   }

   public int method_1109() {
      return 80;
   }

   @Override
   public void method_1607() {
      this.field_2593 = this.field_1507;
      super.method_1607();
      if (this.field_2850.nextInt(1000) < this.field_2773++) {
         this.field_2773 = -this.method_1109();
         String var1 = this.method_1909();
         if (var1 != null) {
            this.field_1468.method_1904(this, var1, this.method_550(), (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F + 1.0F);
         }
      }

      if (this.method_1251() && this.method_905()) {
         this.method_308((Class359)null, 1);
      }

      if (this.method_1251() && this.method_482(Class160.field_1413)) {
         if (this instanceof Class354 && ((Class354)this).method_296()) {
            if (this.field_1468.field_2075 % 2L == 0L) {
               this.field_1804--;
            }
         } else {
            this.field_1804--;
         }

         if (this.field_1804 == -20) {
            this.field_1804 = 0;

            for (int var8 = 0; var8 < 8; var8++) {
               float var2 = this.field_2850.nextFloat() - this.field_2850.nextFloat();
               float var3 = this.field_2850.nextFloat() - this.field_2850.nextFloat();
               float var4 = this.field_2850.nextFloat() - this.field_2850.nextFloat();
               this.field_1468
                  .method_1347(
                     "bubble", this.field_1417 + var2, this.field_2654 + var3, this.field_2013 + var4, this.field_2549, this.field_2501, this.field_489
                  );
            }

            this.method_308((Class359)null, 2);
         }

         this.field_1439 = 0;
      } else {
         this.field_1804 = this.field_2004;
      }

      this.field_1758 = this.field_32;
      if (this.field_790 > 0) {
         this.field_790--;
      }

      if (this.field_2148 > 0) {
         this.field_2148--;
      }

      if (this.field_1659 > 0) {
         this.field_1659--;
      }

      if (this.field_2572 <= 0) {
         this.field_567++;
         if (this.field_567 > 20) {
            this.method_1199();
            this.method_1594();

            for (int var9 = 0; var9 < 20; var9++) {
               double var10 = this.field_2850.nextGaussian() * 0.02;
               double var11 = this.field_2850.nextGaussian() * 0.02;
               double var6 = this.field_2850.nextGaussian() * 0.02;
               this.field_1468
                  .method_1347(
                     "explode",
                     this.field_1417 + this.field_2850.nextFloat() * this.field_811 * 2.0F - this.field_811,
                     this.field_2654 + this.field_2850.nextFloat() * this.field_1443,
                     this.field_2013 + this.field_2850.nextFloat() * this.field_811 * 2.0F - this.field_811,
                     var10,
                     var11,
                     var6
                  );
            }
         }
      }

      this.field_2468 = this.field_1579;
      this.field_616 = this.field_1113;
      this.field_2772 = this.field_1661;
      this.field_2984 = this.field_2866;
   }

   public void method_1455() {
      for (int var1 = 0; var1 < 20; var1++) {
         double var2 = this.field_2850.nextGaussian() * 0.02;
         double var4 = this.field_2850.nextGaussian() * 0.02;
         double var6 = this.field_2850.nextGaussian() * 0.02;
         double var8 = 10.0;
         this.field_1468
            .method_1347(
               "explode",
               this.field_1417 + this.field_2850.nextFloat() * this.field_811 * 2.0F - this.field_811 - var2 * var8,
               this.field_2654 + this.field_2850.nextFloat() * this.field_1443 - var4 * var8,
               this.field_2013 + this.field_2850.nextFloat() * this.field_811 * 2.0F - this.field_811 - var6 * var8,
               var2,
               var4,
               var6
            );
      }
   }

   @Override
   public void method_85() {
      super.method_85();
      this.field_770 = this.field_1655;
      this.field_1655 = 0.0F;
   }

   @Override
   public void method_1551(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_838 = 0.0F;
      this.field_2624 = var1;
      this.field_1343 = var3;
      this.field_1874 = var5;
      this.field_2080 = var7;
      this.field_1163 = var8;
      this.field_717 = var9;
   }

   @Override
   public void method_46() {
      super.method_46();
      this.method_22();
      double var1 = this.field_1417 - this.field_2553;
      double var3 = this.field_2013 - this.field_1780;
      float var5 = Class469.method_822(var1 * var1 + var3 * var3);
      float var6 = this.field_1113;
      float var7 = 0.0F;
      this.field_770 = this.field_1655;
      float var8 = 0.0F;
      if (var5 > 0.05F) {
         var8 = 1.0F;
         var7 = var5 * 3.0F;
         var6 = (float)Math.atan2(var3, var1) * 180.0F / (float) Math.PI - 90.0F;
      }

      if (this.field_1507 > 0.0F) {
         var6 = this.field_1661;
      }

      if (!this.field_2669) {
         var8 = 0.0F;
      }

      this.field_1655 = this.field_1655 + (var8 - this.field_1655) * 0.3F;
      float var9 = var6 - this.field_1113;

      while (var9 < -180.0F) {
         var9 += 360.0F;
      }

      while (var9 >= 180.0F) {
         var9 -= 360.0F;
      }

      this.field_1113 += var9 * 0.3F;
      float var10 = this.field_1661 - this.field_1113;

      while (var10 < -180.0F) {
         var10 += 360.0F;
      }

      while (var10 >= 180.0F) {
         var10 -= 360.0F;
      }

      boolean var11 = var10 < -90.0F || var10 >= 90.0F;
      if (var10 < -75.0F) {
         var10 = -75.0F;
      }

      if (var10 >= 75.0F) {
         var10 = 75.0F;
      }

      this.field_1113 = this.field_1661 - var10;
      if (var10 * var10 > 2500.0F) {
         this.field_1113 += var10 * 0.2F;
      }

      if (var11) {
         var7 *= -1.0F;
      }

      while (this.field_1661 - this.field_2772 < -180.0F) {
         this.field_2772 -= 360.0F;
      }

      while (this.field_1661 - this.field_2772 >= 180.0F) {
         this.field_2772 += 360.0F;
      }

      while (this.field_1113 - this.field_616 < -180.0F) {
         this.field_616 -= 360.0F;
      }

      while (this.field_1113 - this.field_616 >= 180.0F) {
         this.field_616 += 360.0F;
      }

      while (this.field_2866 - this.field_2984 < -180.0F) {
         this.field_2984 -= 360.0F;
      }

      while (this.field_2866 - this.field_2984 >= 180.0F) {
         this.field_2984 += 360.0F;
      }

      this.field_1579 += var7;
   }

   @Override
   protected void method_244(float var1, float var2) {
      super.method_244(var1, var2);
   }

   public void method_1796(int var1) {
      if (this.field_2572 > 0) {
         this.field_2572 += var1;
         if (this.field_2572 > 20) {
            this.field_2572 = 20;
         }

         this.field_1659 = this.field_444 / 2;
      }
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      if (this.field_1468.field_2994) {
         var2 = 0;
      }

      this.field_2861 = 0;
      if (this.field_2572 <= 0) {
         return false;
      }

      this.field_937 = 1.5F;
      if (this.field_1659 > this.field_444 / 2.0F) {
         if (this.field_297 - var2 >= this.field_2572) {
            return false;
         }

         this.field_2572 = this.field_297 - var2;
      } else {
         this.field_297 = this.field_2572;
         this.field_1659 = this.field_444;
         this.field_2572 -= var2;
         this.field_2148 = this.field_1322 = 10;
      }

      this.field_523 = 0.0F;
      if (var1 != null) {
         double var3 = var1.field_1417 - this.field_1417;

         double var5;
         for (var5 = var1.field_2013 - this.field_2013; var3 * var3 + var5 * var5 < 1.0E-4; var5 = (Math.random() - Math.random()) * 0.01) {
            var3 = (Math.random() - Math.random()) * 0.01;
         }

         this.field_523 = (float)(Math.atan2(var5, var3) * 180.0 / (float) Math.PI) - this.field_1661;
         this.method_824(var1, var2, var3, var5);
      } else {
         this.field_523 = (int)(Math.random() * 2.0) * 180;
      }

      if (this.field_2572 <= 0) {
         this.field_1468.method_1904(this, this.method_1171(), this.method_550(), (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F + 1.0F);
         this.method_379(var1);
      } else {
         this.field_1468.method_1904(this, this.method_1682(), this.method_550(), (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F + 1.0F);
      }

      return true;
   }

   protected float method_550() {
      return 1.0F;
   }

   protected String method_1909() {
      return null;
   }

   protected String method_1682() {
      return "random.hurt";
   }

   protected String method_1171() {
      return "random.hurt";
   }

   public void method_824(Class359 var1, int var2, double var3, double var5) {
      float var7 = Class469.method_822(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.field_2549 /= 2.0;
      this.field_2501 /= 2.0;
      this.field_489 /= 2.0;
      this.field_2549 -= var3 / var7 * var8;
      this.field_2501 += 0.4F;
      this.field_489 -= var5 / var7 * var8;
      if (this.field_2501 > 0.4F) {
         this.field_2501 = 0.4F;
      }
   }

   public void method_379(Class359 var1) {
      if (this.field_361 > 0 && var1 != null) {
         var1.method_395(this, this.field_361);
      }

      this.field_1662 = true;
      int var2 = this.method_291();
      if (var2 > 0) {
         int var3 = this.field_2850.nextInt(3);

         for (int var4 = 0; var4 < var3; var4++) {
            this.method_203(var2, 1);
         }
      }
   }

   protected int method_291() {
      return 0;
   }

   @Override
   protected void method_1318(float var1) {
      if (this.field_1999) {
         int var2 = (int)Math.ceil(var1 - 3.0F);
         if (var2 > 0) {
            this.method_308((Class359)null, var2);
            int var3 = this.field_1468
               .method_197(
                  Class469.method_468(this.field_1417), Class469.method_468(this.field_2654 - 0.2F - this.field_838), Class469.method_468(this.field_2013)
               );
            if (var3 > 0) {
               Class358 var4 = Class108.field_1221[var3].field_972;
               this.field_1468.method_1904(this, var4.method_804(), var4.method_1010() * 0.5F, var4.method_1263() * 0.75F);
            }
         }
      }
   }

   public void method_596(float var1, float var2) {
      this.method_97(var1, var2, 0.0F);
   }

   public void method_97(float var1, float var2, float var3) {
      if (this.method_36()) {
         double var4 = this.field_2654;
         this.method_1023(var1, var2, 0.02F, this.method_482(Class160.field_1413) ? (var2 > 0.0F ? -1 : 1) * (var3 / 8.0F) : 0.0F);
         this.method_981(this.field_2549, this.field_2501, this.field_489);
         if (this.method_482(Class160.field_1413)) {
            this.field_2549 *= 0.95F;
            this.field_2501 *= 0.8F;
            this.field_489 *= 0.95F;
         } else {
            this.field_2549 *= 0.8F;
            this.field_2501 *= 0.8F;
            this.field_489 *= 0.8F;
            this.field_2501 -= 0.02;
            if (this.field_1271 && this.method_1412(this.field_2549, this.field_2501 + 0.6F - this.field_2654 + var4, this.field_489)) {
               this.field_2501 = 0.3F;
            }
         }
      } else if (this.method_1059()) {
         double var9 = this.field_2654;
         this.method_871(var1, var2, 0.02F);
         this.method_981(this.field_2549, this.field_2501, this.field_489);
         this.field_2549 *= 0.5;
         this.field_2501 *= 0.5;
         this.field_489 *= 0.5;
         this.field_2501 -= 0.02;
         if (this.field_1271 && this.method_1412(this.field_2549, this.field_2501 + 0.6F - this.field_2654 + var9, this.field_489)) {
            this.field_2501 = 0.3F;
         }
      } else {
         float var6 = 0.91F;
         if (this.field_2669) {
            var6 = 0.54600006F;
            int var7 = this.field_1468
               .method_197(Class469.method_468(this.field_1417), Class469.method_468(this.field_235.field_946) - 1, Class469.method_468(this.field_2013));
            if (var7 > 0) {
               var6 = Class108.field_1221[var7].field_1966 * 0.91F;
            }
         }

         float var13 = 0.16277136F / (var6 * var6 * var6);
         this.method_871(var1, var2, this.field_2669 ? 0.1F * var13 : 0.02F);
         var6 = 0.91F;
         if (this.field_2669) {
            var6 = 0.54600006F;
            int var8 = this.field_1468
               .method_197(Class469.method_468(this.field_1417), Class469.method_468(this.field_235.field_946) - 1, Class469.method_468(this.field_2013));
            if (var8 > 0) {
               var6 = Class108.field_1221[var8].field_1966 * 0.91F;
            }
         }

         if (this.method_747()) {
            this.field_1313 = 0.0F;
            if (this.field_2501 < -0.15) {
               this.field_2501 = -0.15;
            }
         }

         this.method_981(this.field_2549, this.field_2501, this.field_489);
         if (this.field_1271 && this.method_747()) {
            this.field_2501 = 0.2;
         }

         this.field_2501 -= 0.08;
         this.field_2501 *= 0.98F;
         this.field_2549 *= var6;
         this.field_489 *= var6;
      }

      this.field_2980 = this.field_937;
      double var10 = this.field_1417 - this.field_2553;
      double var12 = this.field_2013 - this.field_1780;
      float var14 = Class469.method_822(var10 * var10 + var12 * var12) * 4.0F;
      if (var14 > 1.0F) {
         var14 = 1.0F;
      }

      this.field_937 = this.field_937 + (var14 - this.field_937) * 0.4F;
      this.field_1747 = this.field_1747 + this.field_937;
   }

   public boolean method_747() {
      int var1 = Class469.method_468(this.field_1417);
      int var2 = Class469.method_468(this.field_235.field_946);
      int var3 = Class469.method_468(this.field_2013);
      return this.field_1468.method_197(var1, var2, var3) == Class108.field_2568.field_2151
         || this.field_1468.method_197(var1, var2 + 1, var3) == Class108.field_2568.field_2151;
   }

   @Override
   public void method_863(Class686 var1) {
      var1.method_777("Health", (short)this.field_2572);
      var1.method_777("HurtTime", (short)this.field_2148);
      var1.method_777("DeathTime", (short)this.field_567);
      var1.method_777("AttackTime", (short)this.field_790);
   }

   @Override
   public void method_1054(Class686 var1) {
      this.field_2572 = var1.method_1321("Health");
      if (!var1.method_1838("Health")) {
         this.field_2572 = 10;
      }

      this.field_2148 = var1.method_1321("HurtTime");
      this.field_567 = var1.method_1321("DeathTime");
      this.field_790 = var1.method_1321("AttackTime");
   }

   @Override
   public boolean method_1251() {
      return !this.field_2642 && this.field_2572 > 0;
   }

   public void method_22() {
      if (this.field_717 > 0) {
         double var1 = this.field_1417 + (this.field_2624 - this.field_1417) / this.field_717;
         double var3 = this.field_2654 + (this.field_1343 - this.field_2654) / this.field_717;
         double var5 = this.field_2013 + (this.field_1874 - this.field_2013) / this.field_717;
         double var7 = this.field_2080 - this.field_1661;

         while (var7 < -180.0) {
            var7 += 360.0;
         }

         while (var7 >= 180.0) {
            var7 -= 360.0;
         }

         this.field_1661 = (float)(this.field_1661 + var7 / this.field_717);
         this.field_2866 = (float)(this.field_2866 + (this.field_1163 - this.field_2866) / this.field_717);
         this.field_717--;
         this.method_172(var1, var3, var5);
         this.method_1835(this.field_1661, this.field_2866);
      }

      if (this.field_2572 <= 0) {
         this.field_2698 = false;
         this.field_1818 = 0.0F;
         this.field_269 = 0.0F;
         this.field_1783 = 0.0F;
      } else if (!this.field_3080) {
         this.method_1215();
      }

      boolean var9 = this.method_36();
      boolean var2 = this.method_1059();
      if (this.field_2698) {
         if (var9) {
            this.field_2501 += 0.04F;
         } else if (var2) {
            this.field_2501 += 0.04F;
         } else if (this.field_2669) {
            this.method_1889();
         }
      }

      this.field_1818 *= 0.98F;
      this.field_269 *= 0.98F;
      this.field_1783 *= 0.9F;
      this.method_97(this.field_1818, this.field_269, this.field_2866 / 90.0F);
      List var10 = this.field_1468.method_1349(this, this.field_235.method_1384(0.2F, 0.0, 0.2F));
      if (var10 != null && var10.size() > 0) {
         for (int var4 = 0; var4 < var10.size(); var4++) {
            Class359 var11 = (Class359)var10.get(var4);
            if (var11.method_966()) {
               var11.method_1765(this);
            }
         }
      }
   }

   protected void method_1889() {
      this.field_2501 = 0.42F;
   }

   protected void method_1215() {
      this.field_2861++;
      Class354 var1 = this.field_1468.method_1288(this, -1.0);
      if (var1 != null) {
         double var2 = var1.field_1417 - this.field_1417;
         double var4 = var1.field_2654 - this.field_2654;
         double var6 = var1.field_2013 - this.field_2013;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if (var8 > 16384.0) {
            this.method_1594();
         }

         if (this.field_2861 > 600 && this.field_2850.nextInt(800) == 0) {
            if (var8 < 1024.0) {
               this.field_2861 = 0;
            } else {
               this.method_1594();
            }
         }
      }

      this.field_1818 = 0.0F;
      this.field_269 = 0.0F;
      float var11 = 8.0F;
      if (this.field_2850.nextFloat() < 0.02F) {
         var1 = this.field_1468.method_1288(this, var11);
         if (var1 != null) {
            this.field_1091 = var1;
            this.field_3142 = 10 + this.field_2850.nextInt(20);
         } else {
            this.field_1783 = (this.field_2850.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if (this.field_1091 != null) {
         this.method_537(this.field_1091, 10.0F);
         if (this.field_3142-- <= 0 || this.field_1091.field_2642 || this.field_1091.method_727(this) > var11 * var11) {
            this.field_1091 = null;
         }
      } else {
         if (this.field_2850.nextFloat() < 0.05F) {
            this.field_1783 = (this.field_2850.nextFloat() - 0.5F) * 20.0F;
         }

         this.field_1661 = this.field_1661 + this.field_1783;
         this.field_2866 = this.field_2463;
      }

      boolean var3 = this.method_36();
      boolean var12 = this.method_1059();
      if (var3 || var12) {
         this.field_2698 = this.field_2850.nextFloat() < 0.8F;
      }
   }

   public void method_537(Class359 var1, float var2) {
      double var3 = var1.field_1417 - this.field_1417;
      double var5 = var1.field_2013 - this.field_2013;
      double var7;
      if (var1 instanceof Class377) {
         Class377 var9 = (Class377)var1;
         var7 = var9.field_2654 + var9.method_1875() - (this.field_2654 + this.method_1875());
      } else {
         var7 = (var1.field_235.field_946 + var1.field_235.field_3132) / 2.0 - (this.field_2654 + this.method_1875());
      }

      double var13 = Class469.method_822(var3 * var3 + var5 * var5);
      float var11 = (float)(Math.atan2(var5, var3) * 180.0 / (float) Math.PI) - 90.0F;
      float var12 = (float)(Math.atan2(var7, var13) * 180.0 / (float) Math.PI);
      this.field_2866 = this.method_1606(this.field_2866, var12, var2);
      this.field_1661 = this.method_1606(this.field_1661, var11, var2);
   }

   private float method_1606(float var1, float var2, float var3) {
      float var4 = var2 - var1;

      while (var4 < -180.0F) {
         var4 += 360.0F;
      }

      while (var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public void method_1199() {
   }

   public boolean method_713() {
      return this.field_1468.method_56(this.field_235)
         && this.field_1468.method_1325(this, this.field_235).size() == 0
         && !this.field_1468.method_1781(this.field_235);
   }

   @Override
   protected void method_656() {
      this.method_308((Class359)null, 4);
   }

   public float method_1848(float var1) {
      float var2 = this.field_1507 - this.field_2593;
      if (var2 < 0.0F) {
         var2++;
      }

      return this.field_2593 + var2 * var1;
   }

   public Class214 method_371(float var1) {
      if (var1 == 1.0F) {
         return Class214.method_701(this.field_1417, this.field_2654, this.field_2013);
      }

      double var2 = this.field_2553 + (this.field_1417 - this.field_2553) * var1;
      double var4 = this.field_2068 + (this.field_2654 - this.field_2068) * var1;
      double var6 = this.field_1780 + (this.field_2013 - this.field_1780) * var1;
      return Class214.method_701(var2, var4, var6);
   }

   public Class214 method_1570(float var1) {
      if (var1 == 1.0F) {
         float var8 = Class469.method_255(-this.field_1661 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var9 = Class469.method_1667(-this.field_1661 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var10 = -Class469.method_255(-this.field_2866 * (float) (Math.PI / 180.0));
         float var11 = Class469.method_1667(-this.field_2866 * (float) (Math.PI / 180.0));
         return Class214.method_701(var9 * var10, var11, var8 * var10);
      } else {
         float var2 = this.field_2984 + (this.field_2866 - this.field_2984) * var1;
         float var3 = this.field_2772 + (this.field_1661 - this.field_2772) * var1;
         float var4 = Class469.method_255(-var3 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var5 = Class469.method_1667(-var3 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var6 = -Class469.method_255(-var2 * (float) (Math.PI / 180.0));
         float var7 = Class469.method_1667(-var2 * (float) (Math.PI / 180.0));
         return Class214.method_701(var5 * var6, var7, var4 * var6);
      }
   }

   public Class366 method_1195(double var1, float var3) {
      Class214 var4 = this.method_371(var3);
      Class214 var5 = this.method_1570(var3);
      Class214 var6 = var4.method_1750(var5.field_882 * var1, var5.field_1911 * var1, var5.field_3045 * var1);
      return this.field_1468.method_818(var4, var6);
   }
}
