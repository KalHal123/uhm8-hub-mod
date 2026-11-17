package ext;

public class Class79 {
   public Class424[] field_718;
   public int field_238 = 0;
   private boolean field_89 = false;

   public Class79(Class424[] var1) {
      this.field_718 = var1;
      this.field_238 = var1.length;
   }

   public Class79(Class424[] var1, int var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 64, 32);
   }

   public Class79(Class424[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this(var1);
      float var8 = 0.0015625F;
      float var9 = 0.003125F;
      var1[0] = var1[0].method_571((float)var4 / var6 - var8, (float)var3 / var7 + var9);
      var1[1] = var1[1].method_571((float)var2 / var6 + var8, (float)var3 / var7 + var9);
      var1[2] = var1[2].method_571((float)var2 / var6 + var8, (float)var5 / var7 - var9);
      var1[3] = var1[3].method_571((float)var4 / var6 - var8, (float)var5 / var7 - var9);
   }

   public void method_900() {
      Class424[] var1 = new Class424[this.field_718.length];

      for (int var2 = 0; var2 < this.field_718.length; var2++) {
         var1[var2] = this.field_718[this.field_718.length - var2 - 1];
      }

      this.field_718 = var1;
   }

   public void method_185(Class368 var1, float var2) {
      this.method_1842(var1, var2, false);
   }

   public void method_1842(Class368 var1, float var2, boolean var3) {
      Class214 var4 = this.field_718[1].field_1227.method_779(this.field_718[0].field_1227);
      Class214 var5 = this.field_718[1].field_1227.method_779(this.field_718[2].field_1227);
      Class214 var6 = var5.method_1150(var4).method_341();
      var1.method_1284(var3);
      if (this.field_89) {
         var1.method_548(-((float)var6.field_882), -((float)var6.field_1911), -((float)var6.field_3045));
      } else {
         var1.method_548((float)var6.field_882, (float)var6.field_1911, (float)var6.field_3045);
      }

      for (int var7 = 0; var7 < 4; var7++) {
         Class424 var8 = this.field_718[var7];
         var1.method_318(
            (float)var8.field_1227.field_882 * var2,
            (float)var8.field_1227.field_1911 * var2,
            (float)var8.field_1227.field_3045 * var2,
            var8.field_2607,
            var8.field_390
         );
      }

      var1.method_406();
   }
}
