package ext;

public class Class371 extends Class110 {
   public Class264 field_110 = new Class264(0, 0);
   public Class264 field_180;
   public Class264 field_1722;
   public Class264 field_550;
   public Class264 field_394;
   public Class264 field_2245;

   public Class371(int var1, float var2) {
      this.field_110.method_541(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.field_110.method_1541(0.0F, 18 - var1, -6.0F);
      this.field_180 = new Class264(28, 8);
      this.field_180.method_541(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.field_180.method_1541(0.0F, 17 - var1, 2.0F);
      this.field_1722 = new Class264(0, 16);
      this.field_1722.method_541(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_1722.method_1541(-3.0F, 24 - var1, 7.0F);
      this.field_550 = new Class264(0, 16);
      this.field_550.method_541(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_550.method_1541(3.0F, 24 - var1, 7.0F);
      this.field_394 = new Class264(0, 16);
      this.field_394.method_541(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_394.method_1541(-3.0F, 24 - var1, -5.0F);
      this.field_2245 = new Class264(0, 16);
      this.field_2245.method_541(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_2245.method_1541(3.0F, 24 - var1, -5.0F);
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);
      this.field_110.method_1022(var6);
      this.field_180.method_1022(var6);
      this.field_1722.method_1022(var6);
      this.field_550.method_1022(var6);
      this.field_394.method_1022(var6);
      this.field_2245.method_1022(var6);
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_110.field_1799 = -(var5 / (180.0F / (float)Math.PI));
      this.field_110.field_2361 = var4 / (180.0F / (float)Math.PI);
      this.field_180.field_1799 = (float) (Math.PI / 2);
      this.field_1722.field_1799 = Class469.method_255(var1 * 0.6662F) * 1.4F * var2;
      this.field_550.field_1799 = Class469.method_255(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.field_394.field_1799 = Class469.method_255(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.field_2245.field_1799 = Class469.method_255(var1 * 0.6662F) * 1.4F * var2;
   }
}
