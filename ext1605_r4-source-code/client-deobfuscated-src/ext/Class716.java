package ext;

public class Class716 extends Class564 {
   public Class716(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/skeleton.png";
   }

   @Override
   protected String method_1909() {
      return "mob.skeleton";
   }

   @Override
   protected String method_1682() {
      return "mob.skeletonhurt";
   }

   @Override
   protected String method_1171() {
      return "mob.skeletonhurt";
   }

   @Override
   public void method_22() {
      if (this.field_1468.method_19()) {
         float var1 = this.method_50(1.0F);
         if (var1 > 0.5F
            && this.field_1468.method_1733(Class469.method_468(this.field_1417), Class469.method_468(this.field_2654), Class469.method_468(this.field_2013))
            && this.field_2850.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.field_1439 = 300;
         }
      }

      super.method_22();
   }

   @Override
   protected void method_1344(Class359 var1, float var2) {
      if (var2 < 10.0F) {
         double var3 = var1.field_1417 - this.field_1417;
         double var5 = var1.field_2013 - this.field_2013;
         if (this.field_790 == 0) {
            Class10 var7 = new Class10(this.field_1468, this);
            var7.field_2654++;
            double var8 = var1.field_2654 - 0.2F - var7.field_2654;
            float var10 = Class469.method_822(var3 * var3 + var5 * var5) * 0.2F;
            this.field_1468.method_1904(this, "random.bow", 1.0F, 1.0F / (this.field_2850.nextFloat() * 0.4F + 0.8F));
            this.field_1468.method_1447(var7);
            var7.method_1271(var3, var8 + var10, var5, 0.6F, 12.0F);
            this.field_790 = 30;
         }

         this.field_1661 = (float)(Math.atan2(var5, var3) * 180.0 / (float) Math.PI) - 90.0F;
         this.field_2650 = true;
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
      return Class755.field_1344.field_10;
   }

   @Override
   public int method_1313() {
      return 12 + this.field_2850.nextInt(6);
   }
}
