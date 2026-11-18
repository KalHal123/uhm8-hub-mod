package ext;

public class Class439 extends Class564 {
   public Class439(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/spearmaster.png";
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
            this.field_1439 = 150;
         }
      }

      super.method_22();
   }

   @Override
   protected void method_1344(Class359 var1, float var2) {
      if (var2 < 12.0F) {
         double var3 = var1.field_1417;
         double var5 = var1.field_2013;
         double var7 = var1.field_2654;
         if (this.field_790 == 0) {
            Class496 var9 = new Class496(this.field_1468, this);
            var9.field_2654++;
            double var10 = var1.field_2654 - 0.2F - var9.field_2654;
            float var12 = Class469.method_822(var3 * var3 + var5 * var5) * 0.2F;
            this.field_1468.method_1904(this, "random.bow", 1.0F, 1.0F / (this.field_2850.nextFloat() * 0.4F + 0.8F));
            this.field_1468.method_1447(var9);
            var9.method_1173(var3, var10 + var12, var5, 0.6F, 12.0F);
            this.field_1468.method_1447(var9);
            var9.method_1173(var3, var10 + var12, var5, 0.8F, 15.0F);
            this.field_790 = 25;
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
      return Class50.field_1990.field_10;
   }

   @Override
   public int method_1313() {
      return 12 + this.field_2850.nextInt(6);
   }
}
