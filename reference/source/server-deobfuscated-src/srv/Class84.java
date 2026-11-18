package srv;

public class Class84 extends Class235 {
   public int field_813 = 200;
   private long field_125 = 0L;
   public long field_1282 = 0L;
   public boolean field_1065 = false;
   public boolean field_917 = false;
   public boolean field_190 = false;
   public boolean field_596 = false;

   public Class84(Class41 var1) {
      super(var1);
   }

   @Override
   public boolean method_263(Class150 var1) {
      if (var1.field_1298 == Class13.field_1491.field_473) {
         this.field_813 = this.field_813 + var1.field_1497;
         return true;
      } else {
         return super.method_263(var1);
      }
   }

   public long method_727() {
      return this.field_125;
   }

   public boolean method_23(long var1) {
      if (var1 < 0L) {
         if (this.field_125 < var1 * -1L) {
            return false;
         }
      } else {
         this.field_1282 += var1;
      }

      this.field_125 += var1;
      return true;
   }

   public boolean method_334(Enum346 var1) {
      switch (var1) {
         case field_837:
            return this.field_917;
         case field_828:
            return this.field_190;
         case field_485:
            return this.field_1065;
         case field_1438:
            return this.field_596;
         default:
            return false;
      }
   }
}
