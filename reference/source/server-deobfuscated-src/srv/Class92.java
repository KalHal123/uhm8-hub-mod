package srv;

import java.util.List;

public class Class92 extends Class252 {
   public int field_431 = 20;
   public float field_350;
   public float field_383;
   public float field_588;
   public float field_1577 = 0.0F;
   public float field_186 = 0.0F;
   protected float field_1372;
   protected float field_738;
   protected float field_368;
   protected float field_832;
   protected boolean field_1519 = true;
   protected boolean field_141 = true;
   protected float field_882 = 0.0F;
   protected String field_1152 = null;
   protected float field_1299 = 1.0F;
   protected int field_67 = 0;
   protected float field_1404 = 0.0F;
   public boolean field_752 = false;
   public float field_1255;
   public float field_1064;
   public int field_1090 = 10;
   public int field_1033;
   private int field_753;
   public int field_1368;
   public int field_79;
   public float field_165 = 0.0F;
   public int field_1540 = 0;
   public int field_1550 = 0;
   public float field_911;
   public float field_789;
   protected boolean field_756 = false;
   public int field_1474 = -1;
   public float field_428 = (float)(Math.random() * 0.9F + 0.1F);
   public float field_1017;
   public float field_900;
   public float field_1371;
   private int field_702;
   private double field_872;
   private double field_499;
   private double field_290;
   private double field_977;
   private double field_597;
   float field_1403 = 0.0F;
   protected int field_554 = 0;
   protected float field_1135;
   protected float field_311;
   protected float field_833;
   protected boolean field_63 = false;
   protected float field_1177 = 0.0F;
   protected float field_543 = 0.7F;
   private Class252 field_615;
   private int field_268 = 0;

   public Class92(Class317 var1) {
      super(var1);
      this.field_1240 = true;
      this.field_588 = (float)(Math.random() + 1.0) * 0.01F;
      this.method_732(this.field_1324, this.field_632, this.field_1321);
      this.field_350 = (float)Math.random() * 12398.0F;
      this.field_909 = (float)(Math.random() * (float) Math.PI * 2.0);
      this.field_383 = 1.0F;
      this.field_1093 = 0.5F;
   }

   protected boolean method_18(Class252 var1) {
      return this.field_796
            .method_505(
               Class47.method_875(this.field_1324, this.field_632 + this.method_181(), this.field_1321),
               Class47.method_875(var1.field_1324, var1.field_632 + var1.method_181(), var1.field_1321)
            )
         == null;
   }

   @Override
   public boolean method_947() {
      return !this.field_120;
   }

   @Override
   public boolean method_318() {
      return !this.field_120;
   }

   @Override
   protected float method_181() {
      return this.field_907 * 0.85F;
   }

   public int method_921() {
      return 80;
   }

   @Override
   public void method_518() {
      this.field_1255 = this.field_1064;
      super.method_518();
      if (this.field_697.nextInt(1000) < this.field_753++) {
         this.field_753 = -this.method_921();
         String var1 = this.method_51();
         if (var1 != null) {
            this.field_796.method_38(this, var1, this.method_535(), (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F + 1.0F);
         }
      }

      if (this.method_974() && this.method_890()) {
         this.method_671((Class252)null, 1);
      }

      if (this.method_974() && this.method_609(Class111.field_1394)) {
         this.field_1441--;
         if (this.field_1441 == -20) {
            this.field_1441 = 0;

            for (int var8 = 0; var8 < 8; var8++) {
               float var2 = this.field_697.nextFloat() - this.field_697.nextFloat();
               float var3 = this.field_697.nextFloat() - this.field_697.nextFloat();
               float var4 = this.field_697.nextFloat() - this.field_697.nextFloat();
               this.field_796
                  .method_140("bubble", this.field_1324 + var2, this.field_632 + var3, this.field_1321 + var4, this.field_607, this.field_780, this.field_921);
            }

            this.method_671((Class252)null, 2);
         }

         this.field_1034 = 0;
      } else {
         this.field_1441 = this.field_447;
      }

      this.field_911 = this.field_789;
      if (this.field_1550 > 0) {
         this.field_1550--;
      }

      if (this.field_1368 > 0) {
         this.field_1368--;
      }

      if (this.field_840 > 0) {
         this.field_840--;
      }

      if (this.field_1090 <= 0) {
         this.field_1540++;
         if (this.field_1540 > 20) {
            this.method_290();
            this.method_715();

            for (int var9 = 0; var9 < 20; var9++) {
               double var10 = this.field_697.nextGaussian() * 0.02;
               double var11 = this.field_697.nextGaussian() * 0.02;
               double var6 = this.field_697.nextGaussian() * 0.02;
               this.field_796
                  .method_140(
                     "explode",
                     this.field_1324 + this.field_697.nextFloat() * this.field_595 * 2.0F - this.field_595,
                     this.field_632 + this.field_697.nextFloat() * this.field_907,
                     this.field_1321 + this.field_697.nextFloat() * this.field_595 * 2.0F - this.field_595,
                     var10,
                     var11,
                     var6
                  );
            }
         }
      }

      this.field_832 = this.field_368;
      this.field_186 = this.field_1577;
      this.field_90 = this.field_909;
      this.field_253 = this.field_427;
   }

   public void method_792() {
      for (int var1 = 0; var1 < 20; var1++) {
         double var2 = this.field_697.nextGaussian() * 0.02;
         double var4 = this.field_697.nextGaussian() * 0.02;
         double var6 = this.field_697.nextGaussian() * 0.02;
         double var8 = 10.0;
         this.field_796
            .method_140(
               "explode",
               this.field_1324 + this.field_697.nextFloat() * this.field_595 * 2.0F - this.field_595 - var2 * var8,
               this.field_632 + this.field_697.nextFloat() * this.field_907 - var4 * var8,
               this.field_1321 + this.field_697.nextFloat() * this.field_595 * 2.0F - this.field_595 - var6 * var8,
               var2,
               var4,
               var6
            );
      }
   }

   @Override
   public void method_447() {
      super.method_447();
      this.field_1372 = this.field_738;
      this.field_738 = 0.0F;
   }

   @Override
   public void method_439() {
      super.method_439();
      this.method_664();
      double var1 = this.field_1324 - this.field_146;
      double var3 = this.field_1321 - this.field_271;
      float var5 = Class380.method_164(var1 * var1 + var3 * var3);
      float var6 = this.field_1577;
      float var7 = 0.0F;
      this.field_1372 = this.field_738;
      float var8 = 0.0F;
      if (var5 > 0.05F) {
         var8 = 1.0F;
         var7 = var5 * 3.0F;
         var6 = (float)Math.atan2(var3, var1) * 180.0F / (float) Math.PI - 90.0F;
      }

      if (this.field_1064 > 0.0F) {
         var6 = this.field_909;
      }

      if (!this.field_199) {
         var8 = 0.0F;
      }

      this.field_738 = this.field_738 + (var8 - this.field_738) * 0.3F;
      float var9 = var6 - this.field_1577;

      while (var9 < -180.0F) {
         var9 += 360.0F;
      }

      while (var9 >= 180.0F) {
         var9 -= 360.0F;
      }

      this.field_1577 += var9 * 0.3F;
      float var10 = this.field_909 - this.field_1577;

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

      this.field_1577 = this.field_909 - var10;
      if (var10 * var10 > 2500.0F) {
         this.field_1577 += var10 * 0.2F;
      }

      if (var11) {
         var7 *= -1.0F;
      }

      while (this.field_909 - this.field_90 < -180.0F) {
         this.field_90 -= 360.0F;
      }

      while (this.field_909 - this.field_90 >= 180.0F) {
         this.field_90 += 360.0F;
      }

      while (this.field_1577 - this.field_186 < -180.0F) {
         this.field_186 -= 360.0F;
      }

      while (this.field_1577 - this.field_186 >= 180.0F) {
         this.field_186 += 360.0F;
      }

      while (this.field_427 - this.field_253 < -180.0F) {
         this.field_253 -= 360.0F;
      }

      while (this.field_427 - this.field_253 >= 180.0F) {
         this.field_253 += 360.0F;
      }

      this.field_368 += var7;
   }

   @Override
   protected void method_273(float var1, float var2) {
      super.method_273(var1, var2);
   }

   public void method_228(int var1) {
      if (this.field_1090 > 0) {
         this.field_1090 += var1;
         if (this.field_1090 > 20) {
            this.field_1090 = 20;
         }

         this.field_840 = this.field_431 / 2;
      }
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      if (this.field_796.field_906) {
         var2 = 0;
      }

      this.field_554 = 0;
      if (this.field_1090 <= 0) {
         return false;
      }

      this.field_900 = 1.5F;
      if (this.field_840 > this.field_431 / 2.0F) {
         if (this.field_1033 - var2 >= this.field_1090) {
            return false;
         }

         this.field_1090 = this.field_1033 - var2;
      } else {
         this.field_1033 = this.field_1090;
         this.field_840 = this.field_431;
         this.field_1090 -= var2;
         this.field_1368 = this.field_79 = 10;
      }

      this.field_165 = 0.0F;
      if (var1 != null) {
         double var3 = var1.field_1324 - this.field_1324;

         double var5;
         for (var5 = var1.field_1321 - this.field_1321; var3 * var3 + var5 * var5 < 1.0E-4; var5 = (Math.random() - Math.random()) * 0.01) {
            var3 = (Math.random() - Math.random()) * 0.01;
         }

         this.field_165 = (float)(Math.atan2(var5, var3) * 180.0 / (float) Math.PI) - this.field_909;
         this.method_1017(var1, var2, var3, var5);
      } else {
         this.field_165 = (int)(Math.random() * 2.0) * 180;
      }

      if (this.field_1090 <= 0) {
         this.field_796.method_38(this, this.method_483(), this.method_535(), (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F + 1.0F);
         this.method_577(var1);
      } else {
         this.field_796.method_38(this, this.method_47(), this.method_535(), (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F + 1.0F);
      }

      return true;
   }

   protected float method_535() {
      return 1.0F;
   }

   protected String method_51() {
      return null;
   }

   protected String method_47() {
      return "random.hurt";
   }

   protected String method_483() {
      return "random.hurt";
   }

   public void method_1017(Class252 var1, int var2, double var3, double var5) {
      float var7 = Class380.method_164(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.field_607 /= 2.0;
      this.field_780 /= 2.0;
      this.field_921 /= 2.0;
      this.field_607 -= var3 / var7 * var8;
      this.field_780 += 0.4F;
      this.field_921 -= var5 / var7 * var8;
      if (this.field_780 > 0.4F) {
         this.field_780 = 0.4F;
      }
   }

   public void method_577(Class252 var1) {
      if (this.field_67 > 0 && var1 != null) {
         var1.method_1012(this, this.field_67);
      }

      this.field_756 = true;
      int var2 = this.method_735();
      if (var2 > 0) {
         int var3 = this.field_697.nextInt(3);

         for (int var4 = 0; var4 < var3; var4++) {
            this.method_585(var2, 1);
         }
      }
   }

   protected int method_735() {
      return 0;
   }

   @Override
   protected void method_324(float var1) {
      int var2 = (int)Math.ceil(var1 - 3.0F);
      if (var2 > 0) {
         this.method_671((Class252)null, var2);
         int var3 = this.field_796
            .method_813(Class380.method_502(this.field_1324), Class380.method_502(this.field_632 - 0.2F - this.field_855), Class380.method_502(this.field_1321));
         if (var3 > 0) {
            Class90 var4 = Class371.field_57[var3].field_1154;
            this.field_796.method_38(this, var4.method_534(), var4.method_625() * 0.5F, var4.method_952() * 0.75F);
         }
      }
   }

   public void method_599(float var1, float var2) {
      if (this.method_643()) {
         double var3 = this.field_632;
         this.method_835(var1, var2, 0.02F);
         this.method_956(this.field_607, this.field_780, this.field_921);
         this.field_607 *= 0.8F;
         this.field_780 *= 0.8F;
         this.field_921 *= 0.8F;
         this.field_780 -= 0.02;
         if (this.field_857 && this.method_565(this.field_607, this.field_780 + 0.6F - this.field_632 + var3, this.field_921)) {
            this.field_780 = 0.3F;
         }
      } else if (this.method_417()) {
         double var8 = this.field_632;
         this.method_835(var1, var2, 0.02F);
         this.method_956(this.field_607, this.field_780, this.field_921);
         this.field_607 *= 0.5;
         this.field_780 *= 0.5;
         this.field_921 *= 0.5;
         this.field_780 -= 0.02;
         if (this.field_857 && this.method_565(this.field_607, this.field_780 + 0.6F - this.field_632 + var8, this.field_921)) {
            this.field_780 = 0.3F;
         }
      } else {
         float var5 = 0.91F;
         if (this.field_199) {
            var5 = 0.54600006F;
            int var6 = this.field_796
               .method_813(Class380.method_502(this.field_1324), Class380.method_502(this.field_106.field_817) - 1, Class380.method_502(this.field_1321));
            if (var6 > 0) {
               var5 = Class371.field_57[var6].field_329 * 0.91F;
            }
         }

         float var12 = 0.16277136F / (var5 * var5 * var5);
         this.method_835(var1, var2, this.field_199 ? 0.1F * var12 : 0.02F);
         var5 = 0.91F;
         if (this.field_199) {
            var5 = 0.54600006F;
            int var7 = this.field_796
               .method_813(Class380.method_502(this.field_1324), Class380.method_502(this.field_106.field_817) - 1, Class380.method_502(this.field_1321));
            if (var7 > 0) {
               var5 = Class371.field_57[var7].field_329 * 0.91F;
            }
         }

         if (this.method_919()) {
            this.field_22 = 0.0F;
            if (this.field_780 < -0.15) {
               this.field_780 = -0.15;
            }
         }

         this.method_956(this.field_607, this.field_780, this.field_921);
         if (this.field_857 && this.method_919()) {
            this.field_780 = 0.2;
         }

         this.field_780 -= 0.08;
         this.field_780 *= 0.98F;
         this.field_607 *= var5;
         this.field_921 *= var5;
      }

      this.field_1017 = this.field_900;
      double var9 = this.field_1324 - this.field_146;
      double var11 = this.field_1321 - this.field_271;
      float var13 = Class380.method_164(var9 * var9 + var11 * var11) * 4.0F;
      if (var13 > 1.0F) {
         var13 = 1.0F;
      }

      this.field_900 = this.field_900 + (var13 - this.field_900) * 0.4F;
      this.field_1371 = this.field_1371 + this.field_900;
   }

   public boolean method_919() {
      int var1 = Class380.method_502(this.field_1324);
      int var2 = Class380.method_502(this.field_106.field_817);
      int var3 = Class380.method_502(this.field_1321);
      return this.field_796.method_813(var1, var2, var3) == Class371.field_83.field_1379
         || this.field_796.method_813(var1, var2 + 1, var3) == Class371.field_83.field_1379;
   }

   @Override
   public void method_422(Class100 var1) {
      var1.method_761("Health", (short)this.field_1090);
      var1.method_761("HurtTime", (short)this.field_1368);
      var1.method_761("DeathTime", (short)this.field_1540);
      var1.method_761("AttackTime", (short)this.field_1550);
   }

   @Override
   public void method_134(Class100 var1) {
      this.field_1090 = var1.method_799("Health");
      if (!var1.method_717("Health")) {
         this.field_1090 = 10;
      }

      this.field_1368 = var1.method_799("HurtTime");
      this.field_1540 = var1.method_799("DeathTime");
      this.field_1550 = var1.method_799("AttackTime");
   }

   @Override
   public boolean method_974() {
      return !this.field_120 && this.field_1090 > 0;
   }

   public void method_664() {
      if (this.field_702 > 0) {
         double var1 = this.field_1324 + (this.field_872 - this.field_1324) / this.field_702;
         double var3 = this.field_632 + (this.field_499 - this.field_632) / this.field_702;
         double var5 = this.field_1321 + (this.field_290 - this.field_1321) / this.field_702;
         double var7 = this.field_977 - this.field_909;

         while (var7 < -180.0) {
            var7 += 360.0;
         }

         while (var7 >= 180.0) {
            var7 -= 360.0;
         }

         this.field_909 = (float)(this.field_909 + var7 / this.field_702);
         this.field_427 = (float)(this.field_427 + (this.field_597 - this.field_427) / this.field_702);
         this.field_702--;
         this.method_732(var1, var3, var5);
         this.method_254(this.field_909, this.field_427);
      }

      if (this.field_1090 <= 0) {
         this.field_63 = false;
         this.field_1135 = 0.0F;
         this.field_311 = 0.0F;
         this.field_833 = 0.0F;
      } else if (!this.field_752) {
         this.method_530();
      }

      boolean var9 = this.method_643();
      boolean var2 = this.method_417();
      if (this.field_63) {
         if (var9) {
            this.field_780 += 0.04F;
         } else if (var2) {
            this.field_780 += 0.04F;
         } else if (this.field_199) {
            this.method_506();
         }
      }

      this.field_1135 *= 0.98F;
      this.field_311 *= 0.98F;
      this.field_833 *= 0.9F;
      this.method_599(this.field_1135, this.field_311);
      List var10 = this.field_796.method_362(this, this.field_106.method_99(0.2F, 0.0, 0.2F));
      if (var10 != null && var10.size() > 0) {
         for (int var4 = 0; var4 < var10.size(); var4++) {
            Class252 var11 = (Class252)var10.get(var4);
            if (var11.method_318()) {
               var11.method_384(this);
            }
         }
      }
   }

   protected void method_506() {
      this.field_780 = 0.42F;
   }

   protected void method_530() {
      this.field_554++;
      Class41 var1 = this.field_796.method_176(this, -1.0);
      if (var1 != null) {
         double var2 = var1.field_1324 - this.field_1324;
         double var4 = var1.field_632 - this.field_632;
         double var6 = var1.field_1321 - this.field_1321;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if (var8 > 16384.0) {
            this.method_715();
         }

         if (this.field_554 > 600 && this.field_697.nextInt(800) == 0) {
            if (var8 < 1024.0) {
               this.field_554 = 0;
            } else {
               this.method_715();
            }
         }
      }

      this.field_1135 = 0.0F;
      this.field_311 = 0.0F;
      float var11 = 8.0F;
      if (this.field_697.nextFloat() < 0.02F) {
         var1 = this.field_796.method_176(this, var11);
         if (var1 != null) {
            this.field_615 = var1;
            this.field_268 = 10 + this.field_697.nextInt(20);
         } else {
            this.field_833 = (this.field_697.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if (this.field_615 != null) {
         this.method_1008(this.field_615, 10.0F);
         if (this.field_268-- <= 0 || this.field_615.field_120 || this.field_615.method_186(this) > var11 * var11) {
            this.field_615 = null;
         }
      } else {
         if (this.field_697.nextFloat() < 0.05F) {
            this.field_833 = (this.field_697.nextFloat() - 0.5F) * 20.0F;
         }

         this.field_909 = this.field_909 + this.field_833;
         this.field_427 = this.field_1177;
      }

      boolean var3 = this.method_643();
      boolean var12 = this.method_417();
      if (var3 || var12) {
         this.field_63 = this.field_697.nextFloat() < 0.8F;
      }
   }

   public void method_1008(Class252 var1, float var2) {
      double var3 = var1.field_1324 - this.field_1324;
      double var5 = var1.field_1321 - this.field_1321;
      double var7;
      if (var1 instanceof Class92) {
         Class92 var9 = (Class92)var1;
         var7 = var9.field_632 + var9.method_181() - (this.field_632 + this.method_181());
      } else {
         var7 = (var1.field_106.field_817 + var1.field_106.field_1448) / 2.0 - (this.field_632 + this.method_181());
      }

      double var13 = Class380.method_164(var3 * var3 + var5 * var5);
      float var11 = (float)(Math.atan2(var5, var3) * 180.0 / (float) Math.PI) - 90.0F;
      float var12 = (float)(Math.atan2(var7, var13) * 180.0 / (float) Math.PI);
      this.field_427 = this.method_793(this.field_427, var12, var2);
      this.field_909 = this.method_793(this.field_909, var11, var2);
   }

   private float method_793(float var1, float var2, float var3) {
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

   public void method_290() {
   }

   public boolean method_53() {
      return this.field_796.method_31(this.field_106)
         && this.field_796.method_893(this, this.field_106).size() == 0
         && !this.field_796.method_730(this.field_106);
   }

   @Override
   protected void method_590() {
      this.method_671((Class252)null, 4);
   }

   public Class47 method_910(float var1) {
      if (var1 == 1.0F) {
         return Class47.method_875(this.field_1324, this.field_632, this.field_1321);
      }

      double var2 = this.field_146 + (this.field_1324 - this.field_146) * var1;
      double var4 = this.field_732 + (this.field_632 - this.field_732) * var1;
      double var6 = this.field_271 + (this.field_1321 - this.field_271) * var1;
      return Class47.method_875(var2, var4, var6);
   }

   public Class47 method_229(float var1) {
      if (var1 == 1.0F) {
         float var8 = Class380.method_520(-this.field_909 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var9 = Class380.method_241(-this.field_909 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var10 = -Class380.method_520(-this.field_427 * (float) (Math.PI / 180.0));
         float var11 = Class380.method_241(-this.field_427 * (float) (Math.PI / 180.0));
         return Class47.method_875(var9 * var10, var11, var8 * var10);
      } else {
         float var2 = this.field_253 + (this.field_427 - this.field_253) * var1;
         float var3 = this.field_90 + (this.field_909 - this.field_90) * var1;
         float var4 = Class380.method_520(-var3 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var5 = Class380.method_241(-var3 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var6 = -Class380.method_520(-var2 * (float) (Math.PI / 180.0));
         float var7 = Class380.method_241(-var2 * (float) (Math.PI / 180.0));
         return Class47.method_875(var5 * var6, var7, var4 * var6);
      }
   }

   public Class3 method_618(double var1, float var3) {
      Class47 var4 = this.method_910(var3);
      Class47 var5 = this.method_229(var3);
      Class47 var6 = var4.method_203(var5.field_13 * var1, var5.field_173 * var1, var5.field_510 * var1);
      return this.field_796.method_505(var4, var6);
   }
}
