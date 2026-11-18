package srv;

public class Class244 extends Class167 implements Interface349 {
   protected int field_951 = 2;

   public Class244(Class317 var1) {
      super(var1);
      this.field_1090 = 20;
   }

   @Override
   public void method_664() {
      float var1 = this.method_172(1.0F);
      if (var1 > 0.5F) {
         this.field_554 += 2;
      }

      super.method_664();
   }

   @Override
   public void method_439() {
      super.method_439();
      if (this.field_796.field_1549 == 0) {
         this.method_715();
      }
   }

   @Override
   protected Class252 method_335() {
      Class41 var1 = this.field_796.method_176(this, 16.0);
      return var1 != null && this.method_18(var1) ? var1 : null;
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      if (super.method_671(var1, var2)) {
         if (this.field_826 != var1 && this.field_915 != var1) {
            if (var1 != this) {
               this.field_948 = var1;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   protected void method_964(Class252 var1, float var2) {
      if (var2 < 2.5 && var1.field_106.field_1448 > this.field_106.field_817 && var1.field_106.field_817 < this.field_106.field_1448) {
         this.field_1550 = 20;
         var1.method_671(this, this.field_951);
      }
   }

   @Override
   protected float method_568(int var1, int var2, int var3) {
      return 0.5F - this.field_796.method_170(var1, var2, var3);
   }

   @Override
   public void method_422(Class100 var1) {
      super.method_422(var1);
   }

   @Override
   public void method_134(Class100 var1) {
      super.method_134(var1);
   }

   @Override
   public boolean method_53() {
      int var1 = Class380.method_502(this.field_1324);
      int var2 = Class380.method_502(this.field_106.field_817);
      int var3 = Class380.method_502(this.field_1321);
      if (this.field_796.method_347(Enum336.field_50, var1, var2, var3) > this.field_697.nextInt(32)) {
         return false;
      }

      int var4 = this.field_796.method_339(var1, var2, var3);
      return var4 <= this.field_697.nextInt(8) && super.method_53();
   }

   public int method_669() {
      return 1;
   }
}
