package ext;

public class Class356 extends Class110 {
   public Class264[] field_186 = new Class264[5];

   public Class356() {
      byte var1 = 18;
      byte var2 = 0;
      this.field_186[0] = new Class264(0, 0);
      this.field_186[0].method_746(-5.0F, -12.0F + var2, -5.0F, 10, 13, 9);
      this.field_186[0].method_1541(0.0F, var1, 0.0F);
      this.field_186[1] = new Class264(29, 0);
      this.field_186[1].method_746(-4.0F, -11.0F + var2, -6.0F, 8, 6, 1);
      this.field_186[1].method_1541(0.0F, var1, 0.0F);
      this.field_186[2] = new Class264(46, 20);
      this.field_186[2].method_746(1.0F, 0.0F + var2, -3.0F, 4, 6, 5);
      this.field_186[2].method_1541(0.0F, var1, 0.0F);
      this.field_186[3] = new Class264(46, 20);
      this.field_186[3].method_746(-5.0F, 0.0F + var2, -3.0F, 4, 6, 5);
      this.field_186[3].method_1541(0.0F, var1, 0.0F);
      this.field_186[3].field_1192 = true;
      this.field_186[4] = new Class264(38, 7);
      this.field_186[4].method_746(-4.0F, -10.0F + var2, 4.0F, 8, 10, 3);
      this.field_186[4].method_1541(0.0F, var1, 0.0F);
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);
      this.field_186[2].field_1799 = Class469.method_255(var1 * 0.6662F) * 1.4F * var2;
      this.field_186[3].field_1799 = Class469.method_255(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;

      for (Class264 var10 : this.field_186) {
         var10.method_1022(var6);
      }
   }
}
