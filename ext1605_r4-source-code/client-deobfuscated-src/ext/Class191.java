package ext;

public class Class191 extends Class564 {
   public boolean field_480 = false;
   public Class447 field_1591;
   public boolean field_2965 = false;
   public int field_2562 = 0;

   public Class191(Class454 var1, Class447 var2) {
      this(var1);
      this.field_1591 = var2;
   }

   public Class191(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/zombie.png";
      this.field_2079 = 0.5F;
      this.field_498 = 5;
   }

   @Override
   public void method_22() {
      if (this.field_1468.method_19()) {
         float var1 = this.method_50(1.0F);
         if (var1 > 0.5F
            && this.field_1468.method_1733(Class469.method_468(this.field_1417), Class469.method_468(this.field_2654), Class469.method_468(this.field_2013))
            && this.field_2850.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.field_1439 = 300;
         }
      }

      if (this.field_1468 instanceof Class46) {
         if (this.field_2654 < (this.field_1468 instanceof Class412 ? 64 : (this.field_1468 instanceof Class24 ? 71 : 64))) {
            ((Class46)this.field_1468).method_87(this);
         }

         if (this.field_1591 != null && !this.field_2965) {
            this.field_2965 = this.field_1591.method_1402(this.field_1417, this.field_2013) < 3.0;
            if (!this.field_2965) {
               this.field_2562++;
               if (this.field_2562 > 120 && ((Class46)this.field_1468).method_87(this)) {
                  this.field_2562 = 0;
               }
            }
         }
      }

      super.method_22();
   }

   @Override
   protected String method_1909() {
      return "mob.zombie";
   }

   @Override
   protected String method_1682() {
      return "mob.zombiehurt";
   }

   @Override
   protected String method_1171() {
      return "mob.zombiedeath";
   }

   @Override
   protected int method_291() {
      return this.field_1468 instanceof Class46 ? -1 : Class755.field_2319.field_10;
   }

   @Override
   public int method_1313() {
      return 4 + this.field_2850.nextInt(6);
   }

   @Override
   public float method_356() {
      return this.field_1468 instanceof Class46 ? 64.0F : 16.0F;
   }

   @Override
   protected Class359 method_212() {
      Class354 var1 = this.field_1468.method_1288(this, 18.0);
      return var1 != null && this.method_689(var1) ? var1 : null;
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      int var3 = this.field_2572;
      boolean var4 = super.method_308(var1, var2);
      if (var3 > 0 && this.field_2572 <= 0 && this.field_1468 instanceof Class46) {
         this.field_480 = true;
         if (var1 instanceof Class404) {
            ((Class301)((Class404)var1).field_559).method_1230(120L);
         }

         ((Class46)this.field_1468).method_28(this);
      }

      return super.method_308(var1, var2);
   }

   @Override
   protected void method_1344(Class359 var1, float var2) {
      if (var2 < 2.5 && var1.field_235.field_3132 > this.field_235.field_946 && var1.field_235.field_946 < this.field_235.field_3132) {
         this.field_790 = 20;
         this.method_615(var1, var2);
         var1.method_308(this, this.field_498);
      }
   }

   void method_615(Class359 var1, float var2) {
      if (this.field_2669) {
         if (var2 > 2.0F && var2 < 12.0F && this.field_2850.nextInt(50) == 0 && this.field_2669) {
            double var3 = var1.field_1417 - this.field_1417;
            double var5 = var1.field_2013 - this.field_2013;
            float var7 = Class469.method_822(var3 * var3 + var5 * var5);
            this.field_2549 = var3 / var7 * 0.5 * 0.8F + this.field_2549 * 0.2F;
            this.field_489 = var5 / var7 * 0.5 * 0.8F + this.field_489 * 0.2F;
         }

         if (var2 > 2.0F && var2 < 6.0F && this.field_2850.nextInt(35) == 0 && this.field_2669) {
            double var8 = var1.field_1417 - this.field_1417;
            double var11 = var1.field_2013 + this.field_2013;
            float var14 = Class469.method_822(var8 * var8 + var11 * var11);
            this.field_2549 = var8 / var14 * 0.5 * 0.8F + this.field_2549 * 0.2F;
            this.field_489 = var11 / var14 * 0.5 * 0.8F + this.field_489 * 0.2F;
            this.field_2501 = 0.2F;
         }

         if (var2 > 2.0F && var2 < 6.0F && this.field_2850.nextInt(35) == 0 && this.field_2669) {
            double var9 = var1.field_1417 + this.field_1417;
            double var12 = var1.field_2013 - this.field_2013;
            float var15 = Class469.method_822(var9 * var9 + var12 * var12);
            this.field_2549 = var9 / var15 * 0.5 * 0.8F + this.field_2549 * 0.2F;
            this.field_489 = var12 / var15 * 0.5 * 0.8F + this.field_489 * 0.2F;
            this.field_2501 = 0.2F;
         }

         if (var2 == 6.0F && this.field_2850.nextInt(70) == 0 && this.field_2669) {
            double var10 = var1.field_1417 + this.field_1417;
            double var13 = var1.field_2013 + this.field_2013;
            float var16 = Class469.method_822(var10 * var10 + var13 * var13);
            this.field_2549 = var10 / var16 * 0.5 * 0.8F + this.field_2549 * 0.2F;
            this.field_489 = var13 / var16 * 0.5 * 0.8F + this.field_489 * 0.2F;
            this.field_2501 = 0.4F;
         }
      } else {
         super.method_1344(var1, var2);
      }
   }
}
