package ext;

public class Class131 extends Class110 {
   public Class264[] field_20 = new Class264[11];

   public Class131() {
      byte var1 = 24;
      this.field_20[0] = method_1803(0, 0, -6.0F, var1 + -37, -6.0F, 12, 18, 12, false);
      this.field_20[1] = method_1803(12, 30, -9.0F, var1 + -37, -2.0F, 3, 11, 3, false);
      this.field_20[2] = method_1803(0, 30, 6.0F, var1 + -37, -2.0F, 3, 11, 3, false);
      this.field_20[3] = method_1803(24, 30, -3.0F, var1 + -19, -5.0F, 2, 15, 2, false);
      this.field_20[4] = method_1803(32, 30, 3.0F, var1 + -19, -2.0F, 2, 14, 2, true);
      this.field_20[5] = method_1803(24, 30, 1.0F, var1 + -19, -5.0F, 2, 15, 2, true);
      this.field_20[6] = method_1803(32, 30, -5.0F, var1 + -19, -2.0F, 2, 14, 2, false);
      this.field_20[7] = method_1803(32, 30, 3.0F, var1 + -19, 1.0F, 2, 14, 2, true);
      this.field_20[8] = method_1803(32, 30, -5.0F, var1 + -19, 1.0F, 2, 14, 2, false);
      this.field_20[9] = method_1803(24, 30, -3.0F, var1 + -19, 4.0F, 2, 15, 2, false);
      this.field_20[10] = method_1803(24, 30, 1.0F, var1 + -19, 4.0F, 2, 15, 2, true);
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);

      for (Class264 var10 : this.field_20) {
         var10.method_1022(var6);
      }
   }
}
