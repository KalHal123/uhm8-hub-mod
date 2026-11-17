package srv;

public class Class39 extends Class252 {
   public Class150 field_1199;
   private int field_1285;
   public int field_941 = 0;
   public int field_1105;
   private int field_676 = 5;
   public float field_1463 = (float)(Math.random() * Math.PI * 2.0);

   public Class39(Class317 var1, double var2, double var4, double var6, Class150 var8) {
      super(var1);
      this.method_273(0.25F, 0.25F);
      this.field_855 = this.field_907 / 2.0F;
      this.method_732(var2, var4, var6);
      this.field_1199 = var8;
      this.field_909 = (float)(Math.random() * 360.0);
      this.field_607 = (float)(Math.random() * 0.2F - 0.1F);
      this.field_780 = 0.2F;
      this.field_921 = (float)(Math.random() * 0.2F - 0.1F);
      this.field_288 = false;
   }

   public Class39(Class317 var1) {
      super(var1);
      this.method_273(0.25F, 0.25F);
      this.field_855 = this.field_907 / 2.0F;
   }

   @Override
   public void method_439() {
      super.method_439();
      if (this.field_1105 > 0) {
         this.field_1105--;
      }

      this.field_146 = this.field_1324;
      this.field_732 = this.field_632;
      this.field_271 = this.field_1321;
      this.field_780 -= 0.04F;
      if (this.field_796.method_149(Class380.method_502(this.field_1324), Class380.method_502(this.field_632), Class380.method_502(this.field_1321))
         == Class111.field_306) {
         this.field_780 = 0.2F;
         this.field_607 = (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F;
         this.field_921 = (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F;
         this.field_796.method_38(this, "random.fizz", 0.4F, 2.0F + this.field_697.nextFloat() * 0.4F);
      }

      this.method_623(this.field_1324, this.field_632, this.field_1321);
      this.method_643();
      this.method_956(this.field_607, this.field_780, this.field_921);
      float var1 = 0.98F;
      if (this.field_199) {
         var1 = 0.58800006F;
         int var2 = this.field_796
            .method_813(Class380.method_502(this.field_1324), Class380.method_502(this.field_106.field_817) - 1, Class380.method_502(this.field_1321));
         if (var2 > 0) {
            var1 = Class371.field_57[var2].field_329 * 0.98F;
         }
      }

      this.field_607 *= var1;
      this.field_780 *= 0.98F;
      this.field_921 *= var1;
      if (this.field_199) {
         this.field_780 *= -0.5;
      }

      this.field_1285++;
      this.field_941++;
      if (this.field_941 >= 6000) {
         this.method_715();
      }
   }

   @Override
   public boolean method_643() {
      return this.field_796.method_60(this.field_106, Class111.field_1394, this);
   }

   private boolean method_623(double var1, double var3, double var5) {
      int var7 = Class380.method_502(var1);
      int var8 = Class380.method_502(var3);
      int var9 = Class380.method_502(var5);
      double var10 = var1 - var7;
      double var12 = var3 - var8;
      double var14 = var5 - var9;
      if (Class371.field_380[this.field_796.method_813(var7, var8, var9)]) {
         boolean var16 = !Class371.field_380[this.field_796.method_813(var7 - 1, var8, var9)];
         boolean var17 = !Class371.field_380[this.field_796.method_813(var7 + 1, var8, var9)];
         boolean var18 = !Class371.field_380[this.field_796.method_813(var7, var8 - 1, var9)];
         boolean var19 = !Class371.field_380[this.field_796.method_813(var7, var8 + 1, var9)];
         boolean var20 = !Class371.field_380[this.field_796.method_813(var7, var8, var9 - 1)];
         boolean var21 = !Class371.field_380[this.field_796.method_813(var7, var8, var9 + 1)];
         byte var22 = -1;
         double var23 = 9999.0;
         if (var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if (var17 && 1.0 - var10 < var23) {
            var23 = 1.0 - var10;
            var22 = 1;
         }

         if (var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if (var19 && 1.0 - var12 < var23) {
            var23 = 1.0 - var12;
            var22 = 3;
         }

         if (var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if (var21 && 1.0 - var14 < var23) {
            var23 = 1.0 - var14;
            var22 = 5;
         }

         float var25 = this.field_697.nextFloat() * 0.2F + 0.1F;
         if (var22 == 0) {
            this.field_607 = -var25;
         }

         if (var22 == 1) {
            this.field_607 = var25;
         }

         if (var22 == 2) {
            this.field_780 = -var25;
         }

         if (var22 == 3) {
            this.field_780 = var25;
         }

         if (var22 == 4) {
            this.field_921 = -var25;
         }

         if (var22 == 5) {
            this.field_921 = var25;
         }
      }

      return false;
   }

   @Override
   protected void method_357(int var1) {
      this.method_671((Class252)null, var1);
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      this.field_676 -= var2;
      if (this.field_676 <= 0) {
         this.method_715();
      }

      return false;
   }

   @Override
   public void method_422(Class100 var1) {
      var1.method_761("Health", (byte)this.field_676);
      var1.method_761("Age", (short)this.field_941);
      var1.method_487("Item", this.field_1199.method_110(new Class100()));
   }

   @Override
   public void method_134(Class100 var1) {
      this.field_676 = var1.method_799("Health") & 255;
      this.field_941 = var1.method_799("Age");
      Class100 var2 = var1.method_984("Item");
      this.field_1199 = new Class150(var2);
   }

   @Override
   public void method_644(Class41 var1) {
      if (!this.field_796.field_906) {
         int var2 = this.field_1199.field_1497;
         if (this.field_1105 == 0 && var1.field_783.method_263(this.field_1199)) {
            this.field_796.method_38(this, "random.pop", 0.2F, ((this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.method_648(this, var2);
            this.method_715();
         }
      }
   }
}
