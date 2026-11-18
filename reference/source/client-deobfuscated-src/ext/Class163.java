package ext;

public class Class163 extends Class567 {
   @Override
   public void method_578(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_578(var1, var2, var3, var4, var5, var6);
      float var7 = Class469.method_1667(this.field_1345 * (float) Math.PI);
      float var8 = Class469.method_1667((1.0F - (1.0F - this.field_1345) * (1.0F - this.field_1345)) * (float) Math.PI);
      this.field_909.field_2528 = 0.0F;
      this.field_2163.field_2528 = 0.0F;
      this.field_909.field_2361 = -(0.1F - var7 * 0.6F);
      this.field_2163.field_2361 = 0.1F - var7 * 0.6F;
      this.field_909.field_1799 = (float) (-Math.PI / 2);
      this.field_2163.field_1799 = (float) (-Math.PI / 2);
      this.field_909.field_1799 -= var7 * 1.2F - var8 * 0.4F;
      this.field_2163.field_1799 -= var7 * 1.2F - var8 * 0.4F;
      this.field_909.field_2528 = this.field_909.field_2528 + (Class469.method_255(var3 * 0.09F) * 0.05F + 0.05F);
      this.field_2163.field_2528 = this.field_2163.field_2528 - (Class469.method_255(var3 * 0.09F) * 0.05F + 0.05F);
      this.field_909.field_1799 = this.field_909.field_1799 + Class469.method_1667(var3 * 0.067F) * 0.05F;
      this.field_2163.field_1799 = this.field_2163.field_1799 - Class469.method_1667(var3 * 0.067F) * 0.05F;
   }
}
