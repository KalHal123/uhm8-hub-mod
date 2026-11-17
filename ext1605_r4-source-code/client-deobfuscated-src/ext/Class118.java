package ext;

import net.minecraft.client.Minecraft;

public class Class118 extends Class663 {
   private int field_407 = -1;
   private int field_1985 = -1;
   private int field_212 = -1;
   private float field_3060 = 0.0F;
   private float field_1675 = 0.0F;
   private float field_199 = 0.0F;
   private int field_551 = 0;
   private boolean field_2446 = false;
   public Class348 field_442;
   private int field_1304 = 0;

   public Class118(Minecraft var1, Class348 var2) {
      super(var1);
      this.field_442 = var2;
   }

   @Override
   public void method_1639(Class354 var1) {
      var1.field_1661 = -180.0F;
   }

   @Override
   public boolean method_1065(int var1, int var2, int var3, int var4) {
      this.field_442.method_1519(new Class380(3, var1, var2, var3, var4));
      int var5 = this.field_2987.field_2648.method_197(var1, var2, var3);
      int var6 = this.field_2987.field_2648.method_1110(var1, var2, var3);
      boolean var7 = super.method_1065(var1, var2, var3, var4);
      Class334 var8 = this.field_2987.field_2787.method_1857();
      if (var8 != null) {
         var8.method_1495(var5, var1, var2, var3);
         if (var8.field_2326 == 0) {
            var8.method_32(this.field_2987.field_2787);
            this.field_2987.field_2787.method_1625();
         }
      }

      if (var7 && this.field_2987.field_2787.method_1648(Class108.field_1221[var5])) {
         Class108.field_1221[var5].method_625(this.field_2987.field_2648, var1, var2, var3, var6);
      }

      return var7;
   }

   @Override
   public void method_823(int var1, int var2, int var3, int var4) {
      this.field_2446 = true;
      this.field_442.method_1519(new Class380(0, var1, var2, var3, var4));
      int var5 = this.field_2987.field_2648.method_197(var1, var2, var3);
      if (var5 > 0 && this.field_3060 == 0.0F) {
         Class108.field_1221[var5].method_424(this.field_2987.field_2648, var1, var2, var3, this.field_2987.field_2787);
      }

      if (var5 > 0 && Class108.field_1221[var5].method_386(this.field_2987.field_2787) >= 1.0F) {
         this.method_1065(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_988() {
      if (this.field_2446) {
         this.field_2446 = false;
         this.field_442.method_1519(new Class380(2, 0, 0, 0, 0));
         this.field_3060 = 0.0F;
         this.field_551 = 0;
      }
   }

   @Override
   public void method_1585(int var1, int var2, int var3, int var4) {
      this.field_2446 = true;
      this.method_1338();
      this.field_442.method_1519(new Class380(1, var1, var2, var3, var4));
      if (this.field_551 > 0) {
         this.field_551--;
      } else if (var1 == this.field_407 && var2 == this.field_1985 && var3 == this.field_212) {
         int var5 = this.field_2987.field_2648.method_197(var1, var2, var3);
         if (var5 == 0) {
            return;
         }

         Class108 var6 = Class108.field_1221[var5];
         this.field_3060 = this.field_3060 + var6.method_386(this.field_2987.field_2787);
         if (this.field_199 % 4.0F == 0.0F && var6 != null) {
            this.field_2987
               .field_485
               .method_68(
                  var6.field_972.method_804(),
                  var1 + 0.5F,
                  var2 + 0.5F,
                  var3 + 0.5F,
                  (var6.field_972.method_1010() + 1.0F) / 8.0F,
                  var6.field_972.method_1263() * 0.5F
               );
         }

         this.field_199++;
         if (this.field_3060 >= 1.0F) {
            this.method_1065(var1, var2, var3, var4);
            this.field_3060 = 0.0F;
            this.field_1675 = 0.0F;
            this.field_199 = 0.0F;
            this.field_551 = 5;
         }
      } else {
         this.field_3060 = 0.0F;
         this.field_1675 = 0.0F;
         this.field_199 = 0.0F;
         this.field_407 = var1;
         this.field_1985 = var2;
         this.field_212 = var3;
      }
   }

   @Override
   public void method_1601(float var1) {
      if (this.field_3060 <= 0.0F) {
         this.field_2987.field_964.field_990 = 0.0F;
         this.field_2987.field_1265.field_1014 = 0.0F;
      } else {
         float var2 = this.field_1675 + (this.field_3060 - this.field_1675) * var1;
         this.field_2987.field_964.field_990 = var2;
         this.field_2987.field_1265.field_1014 = var2;
      }
   }

   @Override
   public float method_229() {
      return 4.0F;
   }

   @Override
   public void method_820(Class454 var1) {
      super.method_820(var1);
   }

   @Override
   public void method_1177() {
      this.method_1338();
      this.field_1675 = this.field_3060;
   }

   private void method_1338() {
      Class334 var1 = this.field_2987.field_2787.field_559.method_93();
      int var2 = 0;
      if (var1 != null) {
         var2 = var1.field_1782;
      }

      if (var2 != this.field_1304) {
         this.field_1304 = var2;
         this.field_442.method_1519(new Class583(0, this.field_1304));
      }
   }

   @Override
   public boolean method_1830(Class354 var1, Class454 var2, Class334 var3, int var4, int var5, int var6, int var7) {
      this.method_1338();
      this.field_442.method_1519(new Class589(var3 != null ? var3.field_1782 : -1, var4, var5, var6, var7));
      return super.method_1830(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public Class354 method_1067(Class454 var1) {
      return new Class311(this.field_2987, var1, this.field_2987.field_2935, this.field_442);
   }
}
