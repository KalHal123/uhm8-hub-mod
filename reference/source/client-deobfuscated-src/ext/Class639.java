package ext;

public class Class639 extends Class564 {
   public Class639(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/spider.png";
      this.method_244(1.4F, 0.9F);
      this.field_2079 = 0.8F;
   }

   @Override
   public double method_1612() {
      return this.field_1443 * 0.75 - 0.5;
   }

   @Override
   protected Class359 method_212() {
      float var1 = this.method_50(1.0F);
      if (var1 < 0.5F) {
         double var2 = 16.0;
         return this.field_1468.method_1288(this, var2);
      } else {
         return null;
      }
   }

   @Override
   protected String method_1909() {
      return "mob.spider";
   }

   @Override
   protected String method_1682() {
      return "mob.spider";
   }

   @Override
   protected String method_1171() {
      return "mob.spiderdeath";
   }

   @Override
   protected void method_1344(Class359 var1, float var2) {
      float var3 = this.method_50(1.0F);
      if (var3 > 0.5F && this.field_2850.nextInt(100) == 0) {
         this.field_1487 = null;
      } else if (!(var2 > 2.0F) || !(var2 < 6.0F) || this.field_2850.nextInt(10) != 0) {
         super.method_1344(var1, var2);
      } else if (this.field_2669) {
         double var4 = var1.field_1417 - this.field_1417;
         double var6 = var1.field_2013 - this.field_2013;
         float var8 = Class469.method_822(var4 * var4 + var6 * var6);
         this.field_2549 = var4 / var8 * 0.5 * 0.8F + this.field_2549 * 0.2F;
         this.field_489 = var6 / var8 * 0.5 * 0.8F + this.field_489 * 0.2F;
         this.field_2501 = 0.4F;
      }
   }

   @Override
   public void method_863(Class686 var1) {
      super.method_863(var1);
   }

   @Override
   public void method_1054(Class686 var1) {
      super.method_1054(var1);
   }

   @Override
   protected int method_291() {
      return Class755.field_2930.field_10;
   }

   @Override
   public int method_1313() {
      return 8 + this.field_2850.nextInt(4);
   }
}
