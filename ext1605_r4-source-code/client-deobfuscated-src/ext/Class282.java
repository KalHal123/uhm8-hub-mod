package ext;

public class Class282 extends Class110 {
   public Class264[] field_503 = new Class264[5];

   public Class282() {
      this.field_503[0] = new Class264(0, 8);
      this.field_503[1] = new Class264(0, 0);
      this.field_503[2] = new Class264(0, 0);
      this.field_503[3] = new Class264(0, 0);
      this.field_503[4] = new Class264(0, 0);
      byte var1 = 24;
      byte var2 = 6;
      byte var3 = 20;
      byte var4 = 4;
      this.field_503[0].method_541(-var1 / 2, -var3 / 2 + 2, -3.0F, var1, var3 - 4, 4, 0.0F);
      this.field_503[0].method_1541(0.0F, 0 + var4, 0.0F);
      this.field_503[1].method_541(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_503[1].method_1541(-var1 / 2 + 1, 0 + var4, 0.0F);
      this.field_503[2].method_541(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_503[2].method_1541(var1 / 2 - 1, 0 + var4, 0.0F);
      this.field_503[3].method_541(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_503[3].method_1541(0.0F, 0 + var4, -var3 / 2 + 1);
      this.field_503[4].method_541(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_503[4].method_1541(0.0F, 0 + var4, var3 / 2 - 1);
      this.field_503[0].field_1799 = (float) (Math.PI / 2);
      this.field_503[1].field_2361 = (float) (Math.PI * 3.0 / 2.0);
      this.field_503[2].field_2361 = (float) (Math.PI / 2);
      this.field_503[3].field_2361 = (float) Math.PI;
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < 5; var7++) {
         this.field_503[var7].method_1022(var6);
      }
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
   }
}
