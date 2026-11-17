package ext;

import java.util.Random;

public class Class137 extends Class564 {
   public boolean field_1908 = false;
   final int field_624 = 55;
   public Class377 field_2675 = null;
   public long field_1540 = 0L;
   public int field_2362 = 0;
   public boolean field_1360 = true;
   public Class326 field_1463 = null;

   public Class137(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/observer.png";
      this.method_244(1.0F, 2.0F);
      this.field_2079 = 3.0F;
   }

   protected Class354 method_1596() {
      return !this.field_1468.field_2994 ? Class119.field_1519.field_2787 : this.field_1468.method_1288(this, 64.0);
   }

   @Override
   protected void method_1344(Class359 var1, float var2) {
      this.field_498 = this.field_1360 ? 0 : 2;
      this.field_1360 = false;
      super.method_1344(var1, var2);
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      if (var1 != null && var1 != this.field_2675 && var1 instanceof Class377) {
         this.field_2675 = (Class377)var1;
         this.field_1540 = 550L;
      }

      boolean var3 = super.method_308(var1, var2);
      if (this.field_1662 && var1 instanceof Class354) {
         ((Class354)var1).field_2875 -= 2000L;
      }

      return var3;
   }

   @Override
   protected Class359 method_212() {
      return null;
   }

   @Override
   public void method_863(Class686 var1) {
      var1.method_1647("ObservationTimer", this.field_1540);
      var1.method_698("CommencedAttack", this.field_1360);
      var1.method_698("HasLLoc", this.field_1463 != null);
      if (this.field_1463 != null) {
         var1.method_1647("llocx", this.field_1463.field_809);
         var1.method_1647("llocy", this.field_1463.field_805);
         var1.method_1647("llocz", this.field_1463.field_3039);
      }

      super.method_863(var1);
   }

   @Override
   public void method_1054(Class686 var1) {
      this.field_1540 = var1.method_328("ObservationTimer");
      this.field_1360 = var1.method_1336("CommencedAttack");
      boolean var2 = var1.method_1336("HasLLoc");
      if (var2) {
         this.field_1463 = new Class326(var1.method_328("llocx"), var1.method_328("llocy"), var1.method_328("llocz"));
      }

      super.method_1054(var1);
   }

   @Override
   protected String method_1682() {
      return "mob.skeletonhurt";
   }

   @Override
   protected String method_1171() {
      return "mob.skeletonhurt";
   }

   @Override
   protected float method_550() {
      return 0.4F;
   }

   @Override
   public boolean method_30(Class354 var1) {
      return false;
   }

   public void method_1090(int var1) {
      Class377 var2 = this.field_2675 == null ? this : this.field_2675;
      Random var3 = new Random();
      int var4 = (int)var2.field_1417 + var1 * (var3.nextInt(3) - 1);
      int var5 = (int)var2.field_2013 + var1 * (var3.nextInt(3) - 1);
      if (var4 == (int)var2.field_1417 && var5 == var2.field_2013) {
         var5 += 8;
      }

      int var6 = (int)var2.field_2654;

      while (Class100.method_815(this.field_1468.method_197(var4, var6, var5)) && var6 != 0) {
         var6--;
      }

      while (!Class100.method_815(this.field_1468.method_197(var4, var6, var5)) && var6 != 128) {
         var6++;
      }

      this.field_1463 = new Class326(var4, var6, var5);
      this.method_172(var4, var6, var5);
   }

   @Override
   protected boolean method_383() {
      return false;
   }

   @Override
   public float method_356() {
      return 64.0F;
   }

   @Override
   public void method_22() {
      if (this.field_2675 == null) {
         this.field_2675 = this.method_1596();
         this.field_1540 = 0L;
         this.field_1360 = true;
      } else {
         if (this.field_1540 > 550L) {
            this.field_1487 = this.field_2675;
         } else {
            this.field_1487 = null;
            this.field_1540++;
            if (this.field_1540 > 550L) {
               this.field_1468.method_1904(this, "ext.obvr_attack", 1.0F, 1.0F);
            }

            if (this.method_304(this.field_2675) < 4.0F) {
               this.field_1540 += 55L;
               this.method_1090(8 * (11 - this.field_2362));
            }

            int var1 = this.field_2362;
            this.field_2362 = 1 + (int)(this.field_1540 / 55L);
            if (var1 != this.field_2362) {
               this.method_1090(5 + 3 * (11 - this.field_2362));
            }

            if (this.field_1463 != null) {
               this.method_172(this.field_1463.field_809, this.field_1463.field_805, this.field_1463.field_3039);
            }
         }

         double var3 = Math.atan2(this.field_1417 - this.field_2675.field_1417, -(this.field_2013 - this.field_2675.field_2013)) / Math.PI * 180.0;
         this.method_1835((float)var3, 0.0F);
      }

      super.method_22();
   }

   @Override
   protected int method_291() {
      return Class50.field_466.field_10;
   }

   @Override
   public int method_1313() {
      return 19 + this.field_2850.nextInt(5);
   }
}
