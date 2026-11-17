package ext;

public class Class11 extends Class371 {
   Class264 field_1181;
   Class264 field_140;
   Class264 field_2360;

   public Class11() {
      super(12, 0.0F);
      this.field_110 = new Class264(0, 0);
      this.field_110.method_541(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
      this.field_110.method_1541(0.0F, 4.0F, -8.0F);
      this.field_140 = new Class264(22, 0);
      this.field_140.method_541(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
      this.field_140.method_1541(0.0F, 3.0F, -7.0F);
      this.field_2360 = new Class264(22, 0);
      this.field_2360.method_541(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
      this.field_2360.method_1541(0.0F, 3.0F, -7.0F);
      this.field_1181 = new Class264(52, 0);
      this.field_1181.method_541(-2.0F, -3.0F, 0.0F, 4, 6, 2, 0.0F);
      this.field_1181.method_1541(0.0F, 14.0F, 6.0F);
      this.field_1181.field_1799 = (float) (Math.PI / 2);
      this.field_180 = new Class264(18, 4);
      this.field_180.method_541(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
      this.field_180.method_1541(0.0F, 5.0F, 2.0F);
      this.field_1722.field_2462--;
      this.field_550.field_2462++;
      this.field_1722.field_2738 += 0.0F;
      this.field_550.field_2738 += 0.0F;
      this.field_394.field_2462--;
      this.field_2245.field_2462++;
      this.field_394.field_2738--;
      this.field_2245.field_2738--;
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_837(var1, var2, var3, var4, var5, var6);
      this.field_140.method_1022(var6);
      this.field_2360.method_1022(var6);
      this.field_1181.method_1022(var6);
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_578(var1, var2, var3, var4, var5, var6);
      this.field_140.field_2361 = this.field_110.field_2361;
      this.field_140.field_1799 = this.field_110.field_1799;
      this.field_2360.field_2361 = this.field_110.field_2361;
      this.field_2360.field_1799 = this.field_110.field_1799;
   }
}
