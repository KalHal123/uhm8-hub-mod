package srv;

import java.util.List;

public class Class179 extends Class252 {
   private int field_1382 = -1;
   private int field_353 = -1;
   private int field_1373 = -1;
   private int field_1534 = 0;
   private boolean field_359 = false;
   public int field_841 = 0;
   private Class92 field_759;
   private int field_950;
   private int field_1185 = 0;

   public Class179(Class317 var1) {
      super(var1);
      this.method_273(0.25F, 0.25F);
   }

   @Override
   public void method_439() {
      super.method_439();
      if (this.field_841 > 0) {
         this.field_841--;
      }

      if (this.field_359) {
         int var1 = this.field_796.method_813(this.field_1382, this.field_353, this.field_1373);
         if (var1 == this.field_1534) {
            this.field_950++;
            if (this.field_950 == 1200) {
               this.method_715();
            }

            return;
         }

         this.field_359 = false;
         this.field_607 = this.field_607 * (this.field_697.nextFloat() * 0.2F);
         this.field_780 = this.field_780 * (this.field_697.nextFloat() * 0.2F);
         this.field_921 = this.field_921 * (this.field_697.nextFloat() * 0.2F);
         this.field_950 = 0;
         this.field_1185 = 0;
      } else {
         this.field_1185++;
      }

      Class47 var15 = Class47.method_875(this.field_1324, this.field_632, this.field_1321);
      Class47 var2 = Class47.method_875(this.field_1324 + this.field_607, this.field_632 + this.field_780, this.field_1321 + this.field_921);
      Class3 var3 = this.field_796.method_505(var15, var2);
      var15 = Class47.method_875(this.field_1324, this.field_632, this.field_1321);
      var2 = Class47.method_875(this.field_1324 + this.field_607, this.field_632 + this.field_780, this.field_1321 + this.field_921);
      if (var3 != null) {
         var2 = Class47.method_875(var3.field_1022.field_13, var3.field_1022.field_173, var3.field_1022.field_510);
      }

      Class252 var4 = null;
      List var5 = this.field_796.method_362(this, this.field_106.method_949(this.field_607, this.field_780, this.field_921).method_99(1.0, 1.0, 1.0));
      double var6 = 0.0;

      for (int var8 = 0; var8 < var5.size(); var8++) {
         Class252 var10 = (Class252)var5.get(var8);
         if (var10.method_947() && (var10 != this.field_759 || this.field_1185 >= 5)) {
            float var9 = 0.3F;
            Class94 var11 = var10.field_106.method_99(var9, var9, var9);
            Class3 var12 = var11.method_560(var15, var2);
            if (var12 != null) {
               double var13 = var15.method_797(var12.field_1022);
               if (var13 < var6 || var6 == 0.0) {
                  var4 = var10;
                  var6 = var13;
               }
            }
         }
      }

      if (var4 != null) {
         var3 = new Class3(var4);
      }

      if (var3 != null) {
         if (var3.field_1570 != null && var3.field_1570.method_671(this.field_759, 0)) {
         }

         for (int var18 = 0; var18 < 8; var18++) {
            this.field_796.method_140("snowballpoof", this.field_1324, this.field_632, this.field_1321, 0.0, 0.0, 0.0);
         }

         this.method_715();
      }

      this.field_1324 = this.field_1324 + this.field_607;
      this.field_632 = this.field_632 + this.field_780;
      this.field_1321 = this.field_1321 + this.field_921;
      float var20 = Class380.method_164(this.field_607 * this.field_607 + this.field_921 * this.field_921);
      this.field_909 = (float)(Math.atan2(this.field_607, this.field_921) * 180.0 / (float) Math.PI);
      this.field_427 = (float)(Math.atan2(this.field_780, var20) * 180.0 / (float) Math.PI);

      while (this.field_427 - this.field_253 < -180.0F) {
         this.field_253 -= 360.0F;
      }

      while (this.field_427 - this.field_253 >= 180.0F) {
         this.field_253 += 360.0F;
      }

      while (this.field_909 - this.field_90 < -180.0F) {
         this.field_90 -= 360.0F;
      }

      while (this.field_909 - this.field_90 >= 180.0F) {
         this.field_90 += 360.0F;
      }

      this.field_427 = this.field_253 + (this.field_427 - this.field_253) * 0.2F;
      this.field_909 = this.field_90 + (this.field_909 - this.field_90) * 0.2F;
      float var21 = 0.99F;
      float var19 = 0.03F;
      if (this.method_643()) {
         for (int var22 = 0; var22 < 4; var22++) {
            float var23 = 0.25F;
            this.field_796
               .method_140(
                  "bubble",
                  this.field_1324 - this.field_607 * var23,
                  this.field_632 - this.field_780 * var23,
                  this.field_1321 - this.field_921 * var23,
                  this.field_607,
                  this.field_780,
                  this.field_921
               );
         }

         var21 = 0.8F;
      }

      this.field_607 *= var21;
      this.field_780 *= var21;
      this.field_921 *= var21;
      this.field_780 -= var19;
      this.method_732(this.field_1324, this.field_632, this.field_1321);
   }

   @Override
   public void method_422(Class100 var1) {
      var1.method_761("xTile", (short)this.field_1382);
      var1.method_761("yTile", (short)this.field_353);
      var1.method_761("zTile", (short)this.field_1373);
      var1.method_1003("inTile", (byte)this.field_1534);
      var1.method_1003("shake", (byte)this.field_841);
      var1.method_1003("inGround", (byte)(this.field_359 ? 1 : 0));
   }

   @Override
   public void method_134(Class100 var1) {
      this.field_1382 = var1.method_799("xTile");
      this.field_353 = var1.method_799("yTile");
      this.field_1373 = var1.method_799("zTile");
      this.field_1534 = var1.method_561("inTile") & 255;
      this.field_841 = var1.method_561("shake") & 255;
      this.field_359 = var1.method_561("inGround") == 1;
   }

   @Override
   public void method_644(Class41 var1) {
      if (this.field_359 && this.field_759 == var1 && this.field_841 <= 0 && var1.field_783.method_263(new Class150(Class350.field_1257.field_473, 1))) {
         this.field_796.method_38(this, "random.pop", 0.2F, ((this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         var1.method_648(this, 1);
         this.method_715();
      }
   }
}
