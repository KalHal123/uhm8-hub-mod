package ext;

public class Class58 extends Class33 {
   public boolean field_2687 = false;

   public Class58(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/sheep.png";
      this.method_244(0.9F, 1.3F);
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      if (!this.field_2687 && var1 instanceof Class377) {
         this.field_2687 = true;
         int var3 = 1 + this.field_2850.nextInt(3);

         for (int var4 = 0; var4 < var3; var4++) {
            Class198 var5 = this.method_978(Class108.field_3014.field_2151, 1, 1.0F);
            var5.field_2501 = var5.field_2501 + this.field_2850.nextFloat() * 0.05F;
            var5.field_2549 = var5.field_2549 + (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.1F;
            var5.field_489 = var5.field_489 + (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.1F;
         }
      }

      return super.method_308(var1, var2);
   }

   @Override
   public void method_863(Class686 var1) {
      super.method_863(var1);
      var1.method_698("Sheared", this.field_2687);
   }

   @Override
   public void method_1054(Class686 var1) {
      super.method_1054(var1);
      this.field_2687 = var1.method_1336("Sheared");
   }

   @Override
   protected String method_1909() {
      return "mob.sheep";
   }

   @Override
   protected String method_1682() {
      return "mob.sheep";
   }

   @Override
   protected String method_1171() {
      return "mob.sheep";
   }
}
