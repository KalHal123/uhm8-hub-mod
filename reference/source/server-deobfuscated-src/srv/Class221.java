package srv;

public class Class221 extends Class92 implements Interface349 {
   public float field_791;
   public float field_830;
   private int field_1155 = 0;
   public int field_764 = 1;

   public Class221(Class317 var1) {
      super(var1);
      this.field_764 = 1 << this.field_697.nextInt(3);
      this.field_855 = 0.0F;
      this.field_1155 = this.field_697.nextInt(20) + 10;
      this.method_935(this.field_764);
   }

   public void method_935(int var1) {
      this.field_764 = var1;
      this.method_273(0.6F * var1, 0.6F * var1);
      this.field_1090 = var1 * var1;
      this.method_732(this.field_1324, this.field_632, this.field_1321);
   }

   @Override
   public void method_422(Class100 var1) {
      super.method_422(var1);
      var1.method_32("Size", this.field_764 - 1);
   }

   @Override
   public void method_134(Class100 var1) {
      super.method_134(var1);
      this.field_764 = var1.method_159("Size") + 1;
   }

   @Override
   public void method_439() {
      this.field_830 = this.field_791;
      boolean var1 = this.field_199;
      super.method_439();
      if (this.field_199 && !var1) {
         for (int var2 = 0; var2 < this.field_764 * 8; var2++) {
            float var3 = this.field_697.nextFloat() * (float) Math.PI * 2.0F;
            float var4 = this.field_697.nextFloat() * 0.5F + 0.5F;
            float var5 = Class380.method_241(var3) * this.field_764 * 0.5F * var4;
            float var6 = Class380.method_520(var3) * this.field_764 * 0.5F * var4;
            this.field_796.method_140("slime", this.field_1324 + var5, this.field_106.field_817, this.field_1321 + var6, 0.0, 0.0, 0.0);
         }

         if (this.field_764 > 2) {
            this.field_796.method_38(this, "mob.slime", this.method_535(), ((this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.field_791 = -0.5F;
      }

      this.field_791 *= 0.6F;
   }

   @Override
   protected void method_530() {
      Class41 var1 = this.field_796.method_176(this, 16.0);
      if (var1 != null) {
         this.method_1008(var1, 10.0F);
      }

      if (this.field_199 && this.field_1155-- <= 0) {
         this.field_1155 = this.field_697.nextInt(20) + 10;
         if (var1 != null) {
            this.field_1155 /= 3;
         }

         this.field_63 = true;
         if (this.field_764 > 1) {
            this.field_796.method_38(this, "mob.slime", this.method_535(), ((this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.field_791 = 1.0F;
         this.field_1135 = 1.0F - this.field_697.nextFloat() * 2.0F;
         this.field_311 = 1 * this.field_764;
      } else {
         this.field_63 = false;
         if (this.field_199) {
            this.field_1135 = this.field_311 = 0.0F;
         }
      }
   }

   @Override
   public void method_715() {
      if (this.field_764 > 1 && this.field_1090 == 0) {
         for (int var1 = 0; var1 < 4; var1++) {
            float var2 = (var1 % 2 - 0.5F) * this.field_764 / 4.0F;
            float var3 = (var1 / 2 - 0.5F) * this.field_764 / 4.0F;
            Class221 var4 = new Class221(this.field_796);
            var4.method_935(this.field_764 / 2);
            var4.method_885(this.field_1324 + var2, this.field_632 + 0.5, this.field_1321 + var3, this.field_697.nextFloat() * 360.0F, 0.0F);
            this.field_796.method_237(var4);
         }
      }

      super.method_715();
   }

   @Override
   public void method_644(Class41 var1) {
      if (this.field_764 > 1 && this.method_18(var1) && this.method_272(var1) < 0.6 * this.field_764 && var1.method_671(this, this.field_764)) {
         this.field_796.method_38(this, "mob.slimeattack", 1.0F, (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F + 1.0F);
      }
   }

   @Override
   protected String method_47() {
      return "mob.slime";
   }

   @Override
   protected String method_483() {
      return "mob.slime";
   }

   @Override
   protected int method_735() {
      return this.field_764 == 1 ? Class350.field_324.field_473 : 0;
   }

   @Override
   public boolean method_53() {
      Class166 var1 = this.field_796.method_389(Class380.method_502(this.field_1324), Class380.method_502(this.field_632));
      return (this.field_764 == 1 || this.field_796.field_1549 > 0)
         && this.field_697.nextInt(10) == 0
         && var1.method_602(987234911L).nextInt(10) == 0
         && this.field_632 < 16.0;
   }

   @Override
   protected float method_535() {
      return 0.6F;
   }
}
