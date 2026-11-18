package srv;

public class Class220 extends Class244 {
   public Class220(Class317 var1) {
      super(var1);
      this.field_543 = 0.5F;
      this.field_951 = 5;
   }

   @Override
   public void method_664() {
      if (this.field_796.method_143()) {
         float var1 = this.method_172(1.0F);
         if (var1 > 0.5F
            && this.field_796.method_338(Class380.method_502(this.field_1324), Class380.method_502(this.field_632), Class380.method_502(this.field_1321))
            && this.field_697.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.field_1034 = 300;
         }
      }

      super.method_664();
   }

   @Override
   protected String method_51() {
      return "mob.zombie";
   }

   @Override
   protected String method_47() {
      return "mob.zombiehurt";
   }

   @Override
   protected String method_483() {
      return "mob.zombiedeath";
   }

   @Override
   protected int method_735() {
      return Class350.field_526.field_473;
   }
}
