package ext;

public class Class567 extends Class110 {
   public Class264 field_2901;
   public Class264 field_2833;
   public Class264 field_1037;
   public Class264 field_909;
   public Class264 field_2163;
   public Class264 field_1205;
   public Class264 field_2618;
   public Class264 field_2781;
   public Class264 field_433;
   public boolean field_1847;
   public boolean field_1841;
   public boolean field_1494;
   public boolean field_1855;
   public boolean field_177 = false;

   public Class567() {
      this(0.0F);
   }

   public Class567(float var1) {
      this(var1, 0.0F);
   }

   public Class567(float var1, float var2) {
      this.field_1847 = false;
      this.field_1841 = false;
      this.field_1494 = false;
      this.field_1855 = false;
      this.field_2901 = new Class264(0, 0);
      this.field_2901.method_541(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.field_2901.method_1541(0.0F, 0.0F + var2, 0.0F);
      this.field_2833 = new Class264(32, 0);
      this.field_2833.method_541(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.field_2833.method_1541(0.0F, 0.0F + var2, 0.0F);
      this.field_1037 = new Class264(16, 16);
      this.field_1037.method_541(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.field_1037.method_1541(0.0F, 0.0F + var2, 0.0F);
      this.field_909 = new Class264(40, 16);
      this.field_909.method_541(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.field_909.method_1541(-5.0F, 2.0F + var2, 0.0F);
      this.field_2163 = new Class264(40, 16);
      this.field_2163.field_1192 = true;
      this.field_2163.method_541(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.field_2163.method_1541(5.0F, 2.0F + var2, 0.0F);
      this.field_1205 = new Class264(40, 16);
      this.field_1205.method_541(-2.0F, -2.0F, -2.0F, 3, 12, 4, var1);
      this.field_1205.method_1541(-5.0F, 2.0F + var2, 0.0F);
      this.field_2618 = new Class264(40, 16);
      this.field_2618.field_1192 = true;
      this.field_2618.method_541(-1.0F, -2.0F, -2.0F, 3, 12, 4, var1);
      this.field_2618.method_1541(5.0F, 2.0F + var2, 0.0F);
      this.field_1205.field_2882 = true;
      this.field_2618.field_2882 = true;
      this.field_2781 = new Class264(0, 16);
      this.field_2781.method_541(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.field_2781.method_1541(-2.0F, 12.0F + var2, 0.0F);
      this.field_433 = new Class264(0, 16);
      this.field_433.field_1192 = true;
      this.field_433.method_541(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.field_433.method_1541(2.0F, 12.0F + var2, 0.0F);
   }

   public void method_17(boolean var1) {
      this.field_177 = var1;
      this.field_909.field_2882 = var1;
      this.field_2163.field_2882 = var1;
      this.field_1205.field_2882 = !var1;
      this.field_2618.field_2882 = !var1;
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);
      this.field_2901.method_1022(var6);
      this.field_1037.method_1022(var6);
      this.field_909.method_1022(var6);
      this.field_2163.method_1022(var6);
      this.field_1205.method_1022(var6);
      this.field_2618.method_1022(var6);
      this.field_2781.method_1022(var6);
      this.field_433.method_1022(var6);
      this.field_2833.method_1022(var6);
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_2901.field_2361 = var4 / (180.0F / (float)Math.PI);
      this.field_2901.field_1799 = var5 / (180.0F / (float)Math.PI);
      this.field_2833.field_2361 = this.field_2901.field_2361;
      this.field_2833.field_1799 = this.field_2901.field_1799;
      this.field_909.field_1799 = this.field_1205.field_1799 = Class469.method_255(var1 * 0.6662F + (float) Math.PI) * 2.0F * var2 * 0.5F;
      this.field_2163.field_1799 = this.field_2618.field_1799 = Class469.method_255(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.field_909.field_2528 = 0.0F;
      this.field_2163.field_2528 = 0.0F;
      this.field_2781.field_1799 = Class469.method_255(var1 * 0.6662F) * 1.4F * var2;
      this.field_433.field_1799 = Class469.method_255(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.field_2781.field_2361 = 0.0F;
      this.field_433.field_2361 = 0.0F;
      if (this.field_441) {
         this.field_909.field_1799 += (float) (-Math.PI / 5);
         this.field_1205.field_1799 += (float) (-Math.PI / 5);
         this.field_2163.field_1799 += (float) (-Math.PI / 5);
         this.field_2618.field_1799 += (float) (-Math.PI / 5);
         this.field_2781.field_1799 = (float) (-Math.PI * 2.0 / 5.0);
         this.field_433.field_1799 = (float) (-Math.PI * 2.0 / 5.0);
         this.field_2781.field_2361 = (float) (Math.PI / 10);
         this.field_433.field_2361 = (float) (-Math.PI / 10);
      }

      if (this.field_1847) {
         this.field_2163.field_1799 = this.field_2618.field_1799 = this.field_2163.field_1799 * 0.5F - (float) (Math.PI / 10);
      }

      if (this.field_1841) {
         this.field_909.field_1799 = this.field_1205.field_1799 = this.field_909.field_1799 * 0.5F - (float) (Math.PI / 10);
      }

      this.field_909.field_2361 = this.field_1205.field_2361 = 0.0F;
      this.field_2163.field_2361 = this.field_2618.field_2361 = 0.0F;
      if (this.field_1345 > -9990.0F) {
         float var7 = this.field_1345;
         this.field_1037.field_2361 = Class469.method_1667(Class469.method_254(var7) * (float) Math.PI * 2.0F) * 0.2F;
         this.field_909.field_2738 = Class469.method_1667(this.field_1037.field_2361) * 5.0F;
         this.field_909.field_2462 = -Class469.method_255(this.field_1037.field_2361) * 5.0F;
         this.field_2163.field_2738 = -Class469.method_1667(this.field_1037.field_2361) * 5.0F;
         this.field_2163.field_2462 = Class469.method_255(this.field_1037.field_2361) * 5.0F;
         this.field_909.field_2361 = this.field_909.field_2361 + this.field_1037.field_2361;
         this.field_2163.field_2361 = this.field_2163.field_2361 + this.field_1037.field_2361;
         this.field_2163.field_1799 = this.field_2163.field_1799 + this.field_1037.field_2361;
         var7 = 1.0F - this.field_1345;
         var7 *= var7;
         var7 *= var7;
         var7 = 1.0F - var7;
         float var8 = Class469.method_1667(var7 * (float) Math.PI);
         float var9 = Class469.method_1667(this.field_1345 * (float) Math.PI) * -(this.field_2901.field_1799 - 0.7F) * 0.75F;
         this.field_909.field_1799 = (float)(this.field_909.field_1799 - (var8 * 1.2 + var9));
         this.field_909.field_2361 = this.field_909.field_2361 + this.field_1037.field_2361 * 2.0F;
         this.field_909.field_2528 = Class469.method_1667(this.field_1345 * (float) Math.PI) * -0.4F;
      }

      if (this.field_1494) {
         this.field_1037.field_1799 = 0.5F;
         this.field_2781.field_1799 -= 0.0F;
         this.field_433.field_1799 -= 0.0F;
         this.field_909.field_1799 += 0.4F;
         this.field_1205.field_1799 += 0.4F;
         this.field_2163.field_1799 += 0.4F;
         this.field_2618.field_1799 += 0.4F;
         this.field_2781.field_2738 = 4.0F;
         this.field_433.field_2738 = 4.0F;
         this.field_2781.field_1156 = 9.0F;
         this.field_433.field_1156 = 9.0F;
         this.field_2901.field_1156 = 1.0F;
      } else {
         this.field_1037.field_1799 = 0.0F;
         this.field_2781.field_2738 = 0.0F;
         this.field_433.field_2738 = 0.0F;
         this.field_2781.field_1156 = 12.0F;
         this.field_433.field_1156 = 12.0F;
         this.field_2901.field_1156 = 0.0F;
      }

      if (this.field_1855) {
         this.field_2901.field_1799 -= 1.4F;
         this.field_2833.field_1799 -= 1.4F;
      }

      this.field_909.field_2528 = this.field_909.field_2528 + (Class469.method_255(var3 * 0.09F) * 0.05F + 0.05F);
      this.field_2163.field_2528 = this.field_2163.field_2528 - (Class469.method_255(var3 * 0.09F) * 0.05F + 0.05F);
      this.field_909.field_1799 = this.field_909.field_1799 + Class469.method_1667(var3 * 0.067F) * 0.05F;
      this.field_2163.field_1799 = this.field_2163.field_1799 - Class469.method_1667(var3 * 0.067F) * 0.05F;
      this.field_2618.field_2462 = this.field_2163.field_2462;
      this.field_2618.field_1156 = this.field_2163.field_1156;
      this.field_2618.field_2738 = this.field_2163.field_2738;
      this.field_2618.field_1799 = this.field_2163.field_1799;
      this.field_2618.field_2361 = this.field_2163.field_2361;
      this.field_2618.field_2528 = this.field_2163.field_2528;
      this.field_1205.field_2462 = this.field_909.field_2462;
      this.field_1205.field_1156 = this.field_909.field_1156;
      this.field_1205.field_2738 = this.field_909.field_2738;
      this.field_1205.field_1799 = this.field_909.field_1799;
      this.field_1205.field_2361 = this.field_909.field_2361;
      this.field_1205.field_2528 = this.field_909.field_2528;
   }
}
