package ext;

public class Class353 extends Class591 {
   public Class353(Class110 var1, float var2) {
      super(var1, var2);
   }

   public void method_793(Class146 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_1861(var1, var2, var4, var6, var8, var9);
   }

   protected float method_1148(Class146 var1, float var2) {
      float var3 = var1.field_2025 + (var1.field_568 - var1.field_2025) * var2;
      float var4 = var1.field_112 + (var1.field_1107 - var1.field_112) * var2;
      return (Class469.method_1667(var3) + 1.0F) * var4;
   }

   @Override
   protected float method_176(Class377 var1, float var2) {
      return this.method_1148((Class146)var1, var2);
   }

   @Override
   public void method_1861(Class377 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_793((Class146)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_793((Class146)var1, var2, var4, var6, var8, var9);
   }
}
