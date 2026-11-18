package srv;

public class Class129 extends Class252 {
   public int field_1045;
   public int field_1219 = 0;

   public Class129(Class317 var1) {
      super(var1);
   }

   public Class129(Class317 var1, float var2, float var3, float var4, int var5) {
      super(var1);
      this.field_1045 = var5;
      this.field_1240 = true;
      this.method_273(0.98F, 0.98F);
      this.field_855 = this.field_907 / 2.0F;
      this.method_732(var2, var3, var4);
      this.field_607 = 0.0;
      this.field_780 = 0.0;
      this.field_921 = 0.0;
      this.field_288 = false;
      this.field_146 = var2;
      this.field_732 = var3;
      this.field_271 = var4;
   }

   @Override
   public boolean method_947() {
      return !this.field_120;
   }

   @Override
   public void method_439() {
      if (this.field_1045 == 0) {
         this.method_715();
      } else {
         this.field_146 = this.field_1324;
         this.field_732 = this.field_632;
         this.field_271 = this.field_1321;
         this.field_1219++;
         this.field_780 -= 0.04F;
         this.method_956(this.field_607, this.field_780, this.field_921);
         this.field_607 *= 0.98F;
         this.field_780 *= 0.98F;
         this.field_921 *= 0.98F;
         int var1 = Class380.method_502(this.field_1324);
         int var2 = Class380.method_502(this.field_632);
         int var3 = Class380.method_502(this.field_1321);
         if (this.field_796.method_813(var1, var2, var3) == this.field_1045) {
            this.field_796.method_226(var1, var2, var3, 0);
         }

         if (this.field_199) {
            this.field_607 *= 0.7F;
            this.field_921 *= 0.7F;
            this.field_780 *= -0.5;
            this.method_715();
            if (!this.field_796.method_361(this.field_1045, var1, var2, var3, true) || !this.field_796.method_226(var1, var2, var3, this.field_1045)) {
               this.method_585(this.field_1045, 1);
            }
         } else if (this.field_1219 > 100) {
            this.method_585(this.field_1045, 1);
            this.method_715();
         }
      }
   }

   @Override
   protected void method_422(Class100 var1) {
      var1.method_1003("Tile", (byte)this.field_1045);
   }

   @Override
   protected void method_134(Class100 var1) {
      this.field_1045 = var1.method_561("Tile") & 255;
   }
}
