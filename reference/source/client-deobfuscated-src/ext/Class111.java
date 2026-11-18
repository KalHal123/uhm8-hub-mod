package ext;

public class Class111 extends Class564 {
   int field_26;
   int field_3089;
   int field_1400 = 30;
   int field_2048 = -1;

   public Class111(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/creeper.png";
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
   protected void method_1215() {
      this.field_3089 = this.field_26;
      if (this.field_26 > 0 && this.field_2048 < 0) {
         this.field_26--;
      }

      if (this.field_2048 >= 0) {
         this.field_2048 = 2;
      }

      super.method_1215();
      if (this.field_2048 != 1) {
         this.field_2048 = -1;
      }
   }

   @Override
   protected String method_1682() {
      return "mob.creeper";
   }

   @Override
   protected String method_1171() {
      return "mob.creeperdeath";
   }

   @Override
   public void method_379(Class359 var1) {
      super.method_379(var1);
      if (var1 instanceof Class716) {
         this.method_203(Class755.field_849.field_10 + this.field_2850.nextInt(2), 1);
      }
   }

   @Override
   protected void method_1344(Class359 var1, float var2) {
      if (this.field_2048 <= 0 && var2 < 3.0F || this.field_2048 > 0 && var2 < 7.0F) {
         if (this.field_26 == 0) {
            this.field_1468.method_1904(this, "random.fuse", 1.0F, 0.5F);
         }

         this.field_2048 = 1;
         this.field_26++;
         if (this.field_26 == this.field_1400) {
            this.field_1468.method_1927(this, this.field_1417, this.field_2654, this.field_2013, 3.0F);
            this.method_1594();
         }

         this.field_2650 = true;
      }
   }

   public float method_1240(float var1) {
      return (this.field_3089 + (this.field_26 - this.field_3089) * var1) / (this.field_1400 - 2);
   }

   @Override
   protected int method_291() {
      return Class755.field_2508.field_10;
   }

   @Override
   public int method_1313() {
      return 10 + this.field_2850.nextInt(8);
   }
}
