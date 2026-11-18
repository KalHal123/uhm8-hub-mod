package ext;

public class Class185 extends Class564 {
   final int field_3136 = 55;
   public Class377 field_67 = null;
   public long field_2130 = 0L;
   public int field_927 = 0;
   public boolean field_2616 = true;
   public Class326 field_2645 = null;

   public Class185(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/saltsven.png";
      this.method_244(1.0F, 2.0F);
      this.field_2079 = 3.0F;
   }

   protected Class354 method_1172() {
      return !this.field_1468.field_2994 ? Class119.field_1519.field_2787 : this.field_1468.method_1288(this, 64.0);
   }

   @Override
   protected Class359 method_212() {
      return null;
   }

   @Override
   public void method_863(Class686 var1) {
      var1.method_1647("ObservationTimer", this.field_2130);
      var1.method_698("CommencedAttack", this.field_2616);
      var1.method_698("HasLLoc", this.field_2645 != null);
      if (this.field_2645 != null) {
         var1.method_1647("llocx", this.field_2645.field_809);
         var1.method_1647("llocy", this.field_2645.field_805);
         var1.method_1647("llocz", this.field_2645.field_3039);
      }

      super.method_863(var1);
   }

   @Override
   public void method_1054(Class686 var1) {
      this.field_2130 = var1.method_328("ObservationTimer");
      this.field_2616 = var1.method_1336("CommencedAttack");
      boolean var2 = var1.method_1336("HasLLoc");
      if (var2) {
         this.field_2645 = new Class326(var1.method_328("llocx"), var1.method_328("llocy"), var1.method_328("llocz"));
      }

      super.method_1054(var1);
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
   protected float method_550() {
      return 0.4F;
   }

   @Override
   public boolean method_30(Class354 var1) {
      return false;
   }

   @Override
   protected boolean method_383() {
      return false;
   }

   @Override
   public float method_356() {
      return 0.0F;
   }

   @Override
   public void method_22() {
      if (this.field_67 == null) {
         this.field_67 = this.method_1172();
         this.field_2130 = 0L;
         this.field_2616 = true;
      } else {
         this.field_1487 = null;
         this.field_2130++;
         if (this.field_2130 > 550L) {
            this.field_1468.method_1904(this, "ext.obvr_attack", 1.0F, 1.0F);
         }

         if (this.field_2645 != null) {
            this.method_172(this.field_2645.field_809, this.field_2645.field_805, this.field_2645.field_3039);
         }

         double var1 = Math.atan2(this.field_1417 - this.field_67.field_1417, -(this.field_2013 - this.field_67.field_2013)) / Math.PI * 180.0;
         this.method_1835((float)var1, 0.0F);
      }

      super.method_22();
   }
}
