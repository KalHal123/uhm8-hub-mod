package srv;

public class Class105 extends Class252 {
   public int field_974 = 0;

   public Class105(Class317 var1) {
      super(var1);
      this.field_1240 = true;
      this.method_273(0.98F, 0.98F);
      this.field_855 = this.field_907 / 2.0F;
   }

   public Class105(Class317 var1, float var2, float var3, float var4) {
      this(var1);
      this.method_732(var2, var3, var4);
      float var5 = (float)(Math.random() * (float) Math.PI * 2.0);
      this.field_607 = -Class380.method_241(var5 * (float) Math.PI / 180.0F) * 0.02F;
      this.field_780 = 0.2F;
      this.field_921 = -Class380.method_520(var5 * (float) Math.PI / 180.0F) * 0.02F;
      this.field_288 = false;
      this.field_974 = 80;
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
      this.field_146 = this.field_1324;
      this.field_732 = this.field_632;
      this.field_271 = this.field_1321;
      this.field_780 -= 0.04F;
      this.method_956(this.field_607, this.field_780, this.field_921);
      this.field_607 *= 0.98F;
      this.field_780 *= 0.98F;
      this.field_921 *= 0.98F;
      if (this.field_199) {
         this.field_607 *= 0.7F;
         this.field_921 *= 0.7F;
         this.field_780 *= -0.5;
      }

      if (this.field_974-- <= 0) {
         this.method_715();
         this.method_803();
      } else {
         this.field_796.method_140("smoke", this.field_1324, this.field_632 + 0.5, this.field_1321, 0.0, 0.0, 0.0);
      }
   }

   private void method_803() {
      float var1 = 4.0F;
      this.field_796.method_701((Class252)null, this.field_1324, this.field_632, this.field_1321, var1);
   }

   @Override
   protected void method_422(Class100 var1) {
      var1.method_1003("Fuse", (byte)this.field_974);
   }

   @Override
   protected void method_134(Class100 var1) {
      this.field_974 = var1.method_561("Fuse");
   }
}
