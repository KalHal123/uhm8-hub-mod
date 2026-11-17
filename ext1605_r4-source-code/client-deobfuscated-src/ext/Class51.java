package ext;

public class Class51 extends Class110 {
   public Class264 field_1689;
   public Class264 field_1446;
   public Class264 field_1830;
   public Class264 field_420;
   public Class264 field_1699;
   public Class264 field_1824;
   public Class264 field_2709;

   public Class51() {
      float var1 = 0.0F;
      byte var2 = 4;
      this.field_1689 = new Class264(0, 0);
      this.field_1689.method_541(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.field_1689.method_1541(0.0F, var2, 0.0F);
      this.field_1446 = new Class264(32, 0);
      this.field_1446.method_541(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.field_1446.method_1541(0.0F, var2, 0.0F);
      this.field_1830 = new Class264(16, 16);
      this.field_1830.method_541(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.field_1830.method_1541(0.0F, var2, 0.0F);
      this.field_420 = new Class264(0, 16);
      this.field_420.method_541(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_420.method_1541(-2.0F, 12 + var2, 4.0F);
      this.field_1699 = new Class264(0, 16);
      this.field_1699.method_541(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_1699.method_1541(2.0F, 12 + var2, 4.0F);
      this.field_1824 = new Class264(0, 16);
      this.field_1824.method_541(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_1824.method_1541(-2.0F, 12 + var2, -4.0F);
      this.field_2709 = new Class264(0, 16);
      this.field_2709.method_541(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_2709.method_1541(2.0F, 12 + var2, -4.0F);
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);
      this.field_1689.method_1022(var6);
      this.field_1830.method_1022(var6);
      this.field_420.method_1022(var6);
      this.field_1699.method_1022(var6);
      this.field_1824.method_1022(var6);
      this.field_2709.method_1022(var6);
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_1689.field_2361 = var4 / (180.0F / (float)Math.PI);
      this.field_1689.field_1799 = var5 / (180.0F / (float)Math.PI);
      this.field_420.field_1799 = Class469.method_255(var1 * 0.6662F) * 1.4F * var2;
      this.field_1699.field_1799 = Class469.method_255(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.field_1824.field_1799 = Class469.method_255(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.field_2709.field_1799 = Class469.method_255(var1 * 0.6662F) * 1.4F * var2;
   }
}
