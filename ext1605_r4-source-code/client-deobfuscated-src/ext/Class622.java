package ext;

public class Class622 extends Class110 {
   public Class264 field_1283;
   public Class264 field_1387;
   public Class264 field_1556;
   public Class264 field_215;
   public Class264 field_2295;
   public Class264 field_895;
   public Class264 field_1290;
   public Class264 field_2153;
   public Class264 field_189;
   public Class264 field_1187;
   public Class264 field_2174;

   public Class622() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.field_1283 = new Class264(32, 4);
      this.field_1283.method_541(-4.0F, -4.0F, -8.0F, 8, 8, 8, var1);
      this.field_1283.method_1541(0.0F, 0 + var2, -3.0F);
      this.field_1387 = new Class264(0, 0);
      this.field_1387.method_541(-3.0F, -3.0F, -3.0F, 6, 6, 6, var1);
      this.field_1387.method_1541(0.0F, var2, 0.0F);
      this.field_1556 = new Class264(0, 12);
      this.field_1556.method_541(-5.0F, -4.0F, -6.0F, 10, 8, 12, var1);
      this.field_1556.method_1541(0.0F, 0 + var2, 9.0F);
      this.field_215 = new Class264(18, 0);
      this.field_215.method_541(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_215.method_1541(-4.0F, 0 + var2, 2.0F);
      this.field_2295 = new Class264(18, 0);
      this.field_2295.method_541(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_2295.method_1541(4.0F, 0 + var2, 2.0F);
      this.field_895 = new Class264(18, 0);
      this.field_895.method_541(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_895.method_1541(-4.0F, 0 + var2, 1.0F);
      this.field_1290 = new Class264(18, 0);
      this.field_1290.method_541(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_1290.method_1541(4.0F, 0 + var2, 1.0F);
      this.field_2153 = new Class264(18, 0);
      this.field_2153.method_541(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_2153.method_1541(-4.0F, 0 + var2, 0.0F);
      this.field_189 = new Class264(18, 0);
      this.field_189.method_541(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_189.method_1541(4.0F, 0 + var2, 0.0F);
      this.field_1187 = new Class264(18, 0);
      this.field_1187.method_541(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_1187.method_1541(-4.0F, 0 + var2, -1.0F);
      this.field_2174 = new Class264(18, 0);
      this.field_2174.method_541(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_2174.method_1541(4.0F, 0 + var2, -1.0F);
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);
      this.field_1283.method_1022(var6);
      this.field_1387.method_1022(var6);
      this.field_1556.method_1022(var6);
      this.field_215.method_1022(var6);
      this.field_2295.method_1022(var6);
      this.field_895.method_1022(var6);
      this.field_1290.method_1022(var6);
      this.field_2153.method_1022(var6);
      this.field_189.method_1022(var6);
      this.field_1187.method_1022(var6);
      this.field_2174.method_1022(var6);
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_1283.field_2361 = var4 / (180.0F / (float)Math.PI);
      this.field_1283.field_1799 = var5 / (180.0F / (float)Math.PI);
      float var7 = (float) (Math.PI / 4);
      this.field_215.field_2528 = -var7;
      this.field_2295.field_2528 = var7;
      this.field_895.field_2528 = -var7 * 0.74F;
      this.field_1290.field_2528 = var7 * 0.74F;
      this.field_2153.field_2528 = -var7 * 0.74F;
      this.field_189.field_2528 = var7 * 0.74F;
      this.field_1187.field_2528 = -var7;
      this.field_2174.field_2528 = var7;
      float var8 = -0.0F;
      float var9 = (float) (Math.PI / 8);
      this.field_215.field_2361 = var9 * 2.0F + var8;
      this.field_2295.field_2361 = -var9 * 2.0F - var8;
      this.field_895.field_2361 = var9 * 1.0F + var8;
      this.field_1290.field_2361 = -var9 * 1.0F - var8;
      this.field_2153.field_2361 = -var9 * 1.0F + var8;
      this.field_189.field_2361 = var9 * 1.0F - var8;
      this.field_1187.field_2361 = -var9 * 2.0F + var8;
      this.field_2174.field_2361 = var9 * 2.0F - var8;
      float var10 = -(Class469.method_255(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
      float var11 = -(Class469.method_255(var1 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * var2;
      float var12 = -(Class469.method_255(var1 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * var2;
      float var13 = -(Class469.method_255(var1 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var2;
      float var14 = Math.abs(Class469.method_1667(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
      float var15 = Math.abs(Class469.method_1667(var1 * 0.6662F + (float) Math.PI) * 0.4F) * var2;
      float var16 = Math.abs(Class469.method_1667(var1 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * var2;
      float var17 = Math.abs(Class469.method_1667(var1 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var2;
      this.field_215.field_2361 += var10;
      this.field_2295.field_2361 += -var10;
      this.field_895.field_2361 += var11;
      this.field_1290.field_2361 += -var11;
      this.field_2153.field_2361 += var12;
      this.field_189.field_2361 += -var12;
      this.field_1187.field_2361 += var13;
      this.field_2174.field_2361 += -var13;
      this.field_215.field_2528 += var14;
      this.field_2295.field_2528 += -var14;
      this.field_895.field_2528 += var15;
      this.field_1290.field_2528 += -var15;
      this.field_2153.field_2528 += var16;
      this.field_189.field_2528 += -var16;
      this.field_1187.field_2528 += var17;
      this.field_2174.field_2528 += -var17;
   }
}
