package ext;

import net.minecraft.client.Minecraft;

public class Class420 extends Class663 {
   private int field_151 = -1;
   private int field_1846 = -1;
   private int field_1950 = -1;
   private float field_1141 = 0.0F;
   private float field_2386 = 0.0F;
   private float field_1260 = 0.0F;
   private int field_2190 = 0;
   private Class82 field_2846 = new Class572(
      this, 200, Interface753.class, new Class[]{Class191.class, Class716.class, Class111.class, Class639.class, Class713.class}
   );
   private Class82 field_2298 = new Class82(15, Class33.class, new Class[]{Class58.class, Class436.class, Class105.class, Class146.class});

   public Class420(Minecraft var1) {
      super(var1);
   }

   @Override
   public void method_1639(Class354 var1) {
      var1.field_1661 = -180.0F;
   }

   @Override
   public boolean method_1065(int var1, int var2, int var3, int var4) {
      int var5 = this.field_2987.field_2648.method_197(var1, var2, var3);
      int var6 = this.field_2987.field_2648.method_1110(var1, var2, var3);
      boolean var7 = super.method_1065(var1, var2, var3, var4);
      Class334 var8 = this.field_2987.field_2787.method_1857();
      boolean var9 = this.field_2987.field_2787.method_1648(Class108.field_1221[var5]);
      if (var8 != null) {
         var8.method_1495(var5, var1, var2, var3);
         if (var8.field_2326 == 0) {
            var8.method_32(this.field_2987.field_2787);
            this.field_2987.field_2787.method_1625();
         }
      }

      if (var7 && var9) {
         Class108.field_1221[var5].method_209(this.field_2987.field_2648, var1, var2, var3, var6);
      }

      return var7;
   }

   @Override
   public void method_823(int var1, int var2, int var3, int var4) {
      int var5 = this.field_2987.field_2648.method_197(var1, var2, var3);
      if (var5 > 0 && this.field_1141 == 0.0F) {
         Class108.field_1221[var5].method_424(this.field_2987.field_2648, var1, var2, var3, this.field_2987.field_2787);
      }

      if (var5 > 0 && Class108.field_1221[var5].method_386(this.field_2987.field_2787) >= 1.0F) {
         this.method_1065(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_988() {
      this.field_1141 = 0.0F;
      this.field_2190 = 0;
   }

   @Override
   public void method_1585(int var1, int var2, int var3, int var4) {
      if (this.field_2190 > 0) {
         this.field_2190--;
      } else if (var1 == this.field_151 && var2 == this.field_1846 && var3 == this.field_1950) {
         int var5 = this.field_2987.field_2648.method_197(var1, var2, var3);
         if (var5 == 0) {
            return;
         }

         Class108 var6 = Class108.field_1221[var5];
         this.field_1141 = this.field_1141 + var6.method_386(this.field_2987.field_2787);
         if (this.field_1260 % 4.0F == 0.0F && var6 != null) {
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

         this.field_1260++;
         if (this.field_1141 >= 1.0F) {
            this.method_1065(var1, var2, var3, var4);
            this.field_1141 = 0.0F;
            this.field_2386 = 0.0F;
            this.field_1260 = 0.0F;
            this.field_2190 = 5;
         }
      } else {
         this.field_1141 = 0.0F;
         this.field_2386 = 0.0F;
         this.field_1260 = 0.0F;
         this.field_151 = var1;
         this.field_1846 = var2;
         this.field_1950 = var3;
      }
   }

   @Override
   public void method_1601(float var1) {
      if (this.field_1141 <= 0.0F) {
         this.field_2987.field_964.field_990 = 0.0F;
         this.field_2987.field_1265.field_1014 = 0.0F;
      } else {
         float var2 = this.field_2386 + (this.field_1141 - this.field_2386) * var1;
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
      this.field_2386 = this.field_1141;
      if (this.field_2987.field_2787.getClass() == Class563.class) {
         this.field_2846.method_59(this.field_2987.field_2648);
         this.field_2298.method_59(this.field_2987.field_2648);
         this.field_2987.field_485.method_931();
      }
   }
}
