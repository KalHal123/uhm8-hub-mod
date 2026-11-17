package ext;

public class Class435 extends Class359 {
   public int field_386 = 0;

   public Class435(Class454 var1) {
      super(var1);
      this.field_1968 = true;
      this.method_244(0.98F, 0.98F);
      this.field_838 = this.field_1443 / 2.0F;
   }

   public Class435(Class454 var1, float var2, float var3, float var4) {
      this(var1);
      this.method_172(var2, var3, var4);
      float var5 = (float)(Math.random() * (float) Math.PI * 2.0);
      this.field_2549 = -Class469.method_1667(var5 * (float) Math.PI / 180.0F) * 0.02F;
      this.field_2501 = 0.2F;
      this.field_489 = -Class469.method_255(var5 * (float) Math.PI / 180.0F) * 0.02F;
      this.field_1522 = false;
      this.field_386 = 80;
      this.field_2553 = var2;
      this.field_2068 = var3;
      this.field_1780 = var4;
   }

   @Override
   public boolean method_243() {
      return !this.field_2642;
   }

   @Override
   public void method_46() {
      this.field_2553 = this.field_1417;
      this.field_2068 = this.field_2654;
      this.field_1780 = this.field_2013;
      this.field_2501 -= 0.04F;
      this.method_981(this.field_2549, this.field_2501, this.field_489);
      this.field_2549 *= 0.98F;
      this.field_2501 *= 0.98F;
      this.field_489 *= 0.98F;
      if (this.field_2669) {
         this.field_2549 *= 0.7F;
         this.field_489 *= 0.7F;
         this.field_2501 *= -0.5;
      }

      if (this.field_386-- <= 0) {
         this.method_1594();
         this.method_1933();
      } else {
         this.field_1468.method_1347("smoke", this.field_1417, this.field_2654 + 0.5, this.field_2013, 0.0, 0.0, 0.0);
      }
   }

   private void method_1933() {
      float var1 = 4.0F;
      this.field_1468.method_1927((Class359)null, this.field_1417, this.field_2654, this.field_2013, var1);
   }

   @Override
   protected void method_863(Class686 var1) {
      var1.method_1567("Fuse", (byte)this.field_386);
   }

   @Override
   protected void method_1054(Class686 var1) {
      this.field_386 = var1.method_1913("Fuse");
   }

   @Override
   public float method_1140() {
      return 0.0F;
   }
}
