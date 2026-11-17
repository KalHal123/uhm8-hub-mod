package ext;

public class Class564 extends Class481 implements Interface753 {
   protected int field_498 = 2;

   public Class564(Class454 var1) {
      super(var1);
      this.field_2572 = 20;
   }

   @Override
   public void method_22() {
      float var1 = this.method_50(1.0F);
      if (var1 > 0.5F) {
         this.field_2861 += 2;
      }

      super.method_22();
   }

   @Override
   public void method_46() {
      super.method_46();
      if (this.field_1468.field_1535 == 0 && !(this.field_1468 instanceof Class46)) {
         this.method_1594();
      }
   }

   @Override
   protected Class359 method_212() {
      Class354 var1 = this.field_1468.method_1288(this, 16.0);
      return var1 != null && this.method_689(var1) ? var1 : null;
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      if (super.method_308(var1, var2)) {
         if (this.field_1512 != var1 && this.field_2322 != var1) {
            if (var1 != this) {
               this.field_1487 = var1;
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
   protected void method_1344(Class359 var1, float var2) {
      if (var2 < 2.5 && var1.field_235.field_3132 > this.field_235.field_946 && var1.field_235.field_946 < this.field_235.field_3132) {
         this.field_790 = 20;
         var1.method_308(this, this.field_498);
      }
   }

   @Override
   protected float method_723(int var1, int var2, int var3) {
      return 0.5F - this.field_1468.method_1154(var1, var2, var3);
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
   public boolean method_713() {
      int var1 = Class469.method_468(this.field_1417);
      int var2 = Class469.method_468(this.field_235.field_946);
      int var3 = Class469.method_468(this.field_2013);
      if (this.field_1468.method_1763(Enum621.field_1792, var1, var2, var3) > this.field_2850.nextInt(32)) {
         return false;
      }

      int var4 = this.field_1468.method_1676(var1, var2, var3);
      return var4 <= this.field_2850.nextInt(8) && super.method_713();
   }

   @Override
   public void method_379(Class359 var1) {
      super.method_379(var1);
      int var2 = this.method_1313();
      if (var2 > 0) {
         this.method_203(Class50.field_2952.field_10, var2);
      }
   }

   public int method_1313() {
      return 1;
   }
}
