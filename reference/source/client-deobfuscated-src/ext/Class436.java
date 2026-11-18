package ext;

public class Class436 extends Class33 {
   public boolean field_1095 = false;

   public Class436(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/pig.png";
      this.method_244(0.9F, 0.9F);
      this.field_1095 = false;
   }

   @Override
   public void method_863(Class686 var1) {
      super.method_863(var1);
      var1.method_698("Saddle", this.field_1095);
   }

   @Override
   public void method_1054(Class686 var1) {
      super.method_1054(var1);
      this.field_1095 = var1.method_1336("Saddle");
   }

   @Override
   protected String method_1909() {
      return "mob.pig";
   }

   @Override
   protected String method_1682() {
      return "mob.pig";
   }

   @Override
   protected String method_1171() {
      return "mob.pigdeath";
   }

   @Override
   public boolean method_30(Class354 var1) {
      if (this.field_1095) {
         var1.method_1050(this);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected int method_291() {
      return this.field_1439 > 0 ? Class755.field_1357.field_10 : Class755.field_391.field_10;
   }
}
