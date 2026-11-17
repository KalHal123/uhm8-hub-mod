package ext;

public class Class105 extends Class33 {
   public boolean field_2659 = false;

   public Class105(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/cow.png";
      this.method_244(0.9F, 1.3F);
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
      return "mob.cow";
   }

   @Override
   protected String method_1682() {
      return "mob.cowhurt";
   }

   @Override
   protected String method_1171() {
      return "mob.cowhurt";
   }

   @Override
   protected float method_550() {
      return 0.4F;
   }

   @Override
   protected int method_291() {
      return Class755.field_506.field_10;
   }

   @Override
   public boolean method_30(Class354 var1) {
      Class334 var2 = var1.field_559.method_93();
      if (var2 != null && var2.field_1782 == Class755.field_2962.field_10) {
         var1.field_559.method_708(var1.field_559.field_2127, new Class334(Class755.field_913));
         return true;
      } else {
         return false;
      }
   }
}
