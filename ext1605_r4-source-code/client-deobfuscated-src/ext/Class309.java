package ext;

public class Class309 extends Class110 {
   public Class264[] field_292 = new Class264[7];

   public Class309() {
      this.field_292[0] = new Class264(0, 10);
      this.field_292[1] = new Class264(0, 0);
      this.field_292[2] = new Class264(0, 0);
      this.field_292[3] = new Class264(0, 0);
      this.field_292[4] = new Class264(0, 0);
      this.field_292[5] = new Class264(44, 10);
      byte var1 = 20;
      byte var2 = 8;
      byte var3 = 16;
      byte var4 = 4;
      this.field_292[0].method_541(-var1 / 2, -var3 / 2, -1.0F, var1, var3, 2, 0.0F);
      this.field_292[0].method_1541(0.0F, 0 + var4, 0.0F);
      this.field_292[5].method_541(-var1 / 2 + 1, -var3 / 2 + 1, -1.0F, var1 - 2, var3 - 2, 1, 0.0F);
      this.field_292[5].method_1541(0.0F, 0 + var4, 0.0F);
      this.field_292[1].method_541(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_292[1].method_1541(-var1 / 2 + 1, 0 + var4, 0.0F);
      this.field_292[2].method_541(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_292[2].method_1541(var1 / 2 - 1, 0 + var4, 0.0F);
      this.field_292[3].method_541(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_292[3].method_1541(0.0F, 0 + var4, -var3 / 2 + 1);
      this.field_292[4].method_541(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_292[4].method_1541(0.0F, 0 + var4, var3 / 2 - 1);
      this.field_292[0].field_1799 = (float) (Math.PI / 2);
      this.field_292[1].field_2361 = (float) (Math.PI * 3.0 / 2.0);
      this.field_292[2].field_2361 = (float) (Math.PI / 2);
      this.field_292[3].field_2361 = (float) Math.PI;
      this.field_292[5].field_1799 = (float) (-Math.PI / 2);
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_292[5].field_1156 = 4.0F - var3;

      for (int var7 = 0; var7 < 6; var7++) {
         this.field_292[var7].method_1022(var6);
      }
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
   }
}
