package ext;

public class Class301 extends Class267 {
   public int field_1258 = 200;
   private long field_3157 = 1000L;
   public long field_2953 = 1000L;
   public boolean field_1658 = false;
   public boolean field_2134 = false;
   public boolean field_3041 = false;
   public boolean field_2806 = false;

   public Class301(Class354 var1) {
      super(var1);
   }

   @Override
   public boolean method_572(Class334 var1) {
      if (var1.field_1782 == Class50.field_2952.field_10) {
         this.field_1258 = this.field_1258 + var1.field_2326;
         return true;
      } else {
         return super.method_572(var1);
      }
   }

   @Override
   public void method_1191(int var1) {
      this.field_2127 -= var1;
      this.field_2127 = Class100.method_465(this.field_2127, 0, 1);
   }

   @Override
   public void method_1004(int var1, boolean var2) {
      if (var1 >= 0 && var1 < 2) {
         super.method_1004(var1, var2);
      }
   }

   public long method_726() {
      return this.field_3157;
   }

   public boolean method_1230(long var1) {
      if (var1 < 0L) {
         if (this.field_3157 < var1 * -1L) {
            return false;
         }
      } else {
         this.field_2953 += var1;
      }

      this.field_3157 += var1;
      return true;
   }

   public boolean method_11(Enum90 var1) {
      switch (var1) {
         case field_791:
            return this.field_2134;
         case field_1800:
            return this.field_3041;
         case field_2125:
            return this.field_1658;
         case field_396:
            return this.field_2806;
         default:
            return false;
      }
   }

   public boolean method_539(int var1) {
      switch (var1) {
         case 1:
            return this.field_1658;
         case 2:
            return this.field_2134;
         case 3:
            return this.field_3041;
         case 4:
            return this.field_2806;
         default:
            return false;
      }
   }
}
