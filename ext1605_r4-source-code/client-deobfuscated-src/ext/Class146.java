package ext;

public class Class146 extends Class33 {
   public boolean field_2439 = false;
   public float field_568 = 0.0F;
   public float field_1107 = 0.0F;
   public float field_112;
   public float field_2025;
   public float field_807 = 1.0F;
   public int field_2684;

   public Class146(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/chicken.png";
      this.method_244(0.3F, 0.4F);
      this.field_2572 = 4;
      this.field_2684 = this.field_2850.nextInt(6000) + 6000;
   }

   @Override
   public void method_22() {
      super.method_22();
      this.field_2025 = this.field_568;
      this.field_112 = this.field_1107;
      this.field_1107 = (float)(this.field_1107 + (this.field_2669 ? -1 : 4) * 0.3);
      if (this.field_1107 < 0.0F) {
         this.field_1107 = 0.0F;
      }

      if (this.field_1107 > 1.0F) {
         this.field_1107 = 1.0F;
      }

      if (!this.field_2669 && this.field_807 < 1.0F) {
         this.field_807 = 1.0F;
      }

      this.field_807 = (float)(this.field_807 * 0.9);
      if (!this.field_2669 && this.field_2501 < 0.0) {
         this.field_2501 *= 0.6;
      }

      this.field_568 = this.field_568 + this.field_807 * 2.0F;
      if (!this.field_1468.field_2994 && --this.field_2684 <= 0) {
         this.field_1468.method_1904(this, "mob.chickenplop", 1.0F, (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F + 1.0F);
         this.method_203(Class755.field_2758.field_10, 1);
         this.field_2684 = this.field_2850.nextInt(6000) + 6000;
      }
   }

   @Override
   protected void method_1318(float var1) {
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
   protected String method_1909() {
      return "mob.chicken";
   }

   @Override
   protected String method_1682() {
      return "mob.chickenhurt";
   }

   @Override
   protected String method_1171() {
      return "mob.chickenhurt";
   }

   @Override
   protected int method_291() {
      return Class755.field_2319.field_10;
   }
}
