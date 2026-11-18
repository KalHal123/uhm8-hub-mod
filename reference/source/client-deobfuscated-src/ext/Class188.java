package ext;

public class Class188 extends Class110 {
   public Class264 field_2038;
   public Class264 field_1144;
   public Class264 field_1378;
   public Class264 field_248;
   public Class264 field_1691;
   public Class264 field_1730;
   public Class264 field_1632;
   public Class264 field_2253;

   public Class188() {
      byte var1 = 16;
      this.field_2038 = new Class264(0, 0);
      this.field_2038.method_541(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.field_2038.method_1541(0.0F, -1 + var1, -4.0F);
      this.field_1632 = new Class264(14, 0);
      this.field_1632.method_541(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.field_1632.method_1541(0.0F, -1 + var1, -4.0F);
      this.field_2253 = new Class264(14, 4);
      this.field_2253.method_541(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.field_2253.method_1541(0.0F, -1 + var1, -4.0F);
      this.field_1144 = new Class264(0, 9);
      this.field_1144.method_541(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.field_1144.method_1541(0.0F, 0 + var1, 0.0F);
      this.field_1378 = new Class264(26, 0);
      this.field_1378.method_746(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.field_1378.method_1541(-2.0F, 3 + var1, 1.0F);
      this.field_248 = new Class264(26, 0);
      this.field_248.method_746(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.field_248.method_1541(1.0F, 3 + var1, 1.0F);
      this.field_1691 = new Class264(24, 13);
      this.field_1691.method_746(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.field_1691.method_1541(-4.0F, -3 + var1, 0.0F);
      this.field_1730 = new Class264(24, 13);
      this.field_1730.method_746(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.field_1730.method_1541(4.0F, -3 + var1, 0.0F);
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);
      this.field_2038.method_1022(var6);
      this.field_1632.method_1022(var6);
      this.field_2253.method_1022(var6);
      this.field_1144.method_1022(var6);
      this.field_1378.method_1022(var6);
      this.field_248.method_1022(var6);
      this.field_1691.method_1022(var6);
      this.field_1730.method_1022(var6);
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_2038.field_1799 = -(var5 / (180.0F / (float)Math.PI));
      this.field_2038.field_2361 = var4 / (180.0F / (float)Math.PI);
      this.field_1632.field_1799 = this.field_2038.field_1799;
      this.field_1632.field_2361 = this.field_2038.field_2361;
      this.field_2253.field_1799 = this.field_2038.field_1799;
      this.field_2253.field_2361 = this.field_2038.field_2361;
      this.field_1144.field_1799 = (float) (Math.PI / 2);
      this.field_1378.field_1799 = Class469.method_255(var1 * 0.6662F) * 1.4F * var2;
      this.field_248.field_1799 = Class469.method_255(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.field_1691.field_2528 = var3;
      this.field_1730.field_2528 = -var3;
   }
}
