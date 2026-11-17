package ext;

public class Class271 extends Class110 {
   Class264 field_1625;
   Class264 field_43;
   Class264 field_904;
   Class264 field_137;

   public Class271(int var1) {
      this.field_1625 = new Class264(0, var1);
      this.field_1625.method_746(-4.0F, 16.0F, -4.0F, 8, 8, 8);
      if (var1 > 0) {
         this.field_1625 = new Class264(0, var1);
         this.field_1625.method_746(-3.0F, 17.0F, -3.0F, 6, 6, 6);
         this.field_43 = new Class264(32, 0);
         this.field_43.method_746(-3.25F, 18.0F, -3.5F, 2, 2, 2);
         this.field_904 = new Class264(32, 4);
         this.field_904.method_746(1.25F, 18.0F, -3.5F, 2, 2, 2);
         this.field_137 = new Class264(32, 8);
         this.field_137.method_746(0.0F, 21.0F, -3.5F, 1, 1, 1);
      }
   }

   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);
      this.field_1625.method_1022(var6);
      if (this.field_43 != null) {
         this.field_43.method_1022(var6);
         this.field_904.method_1022(var6);
         this.field_137.method_1022(var6);
      }
   }
}
