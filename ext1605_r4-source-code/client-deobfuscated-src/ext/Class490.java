package ext;

public class Class490 extends Class350 {
   private static Class108[] field_1598 = new Class108[]{
      Class108.field_2201,
      Class108.field_1262,
      Class108.field_2252,
      Class108.field_720,
      Class108.field_492,
      Class108.field_508,
      Class108.field_2938,
      Class108.field_1028,
      Class108.field_2554,
      Class108.field_1887,
      Class108.field_564,
      Class108.field_2971,
      Class108.field_2441,
      Class390.field_2682,
      Class390.field_1436,
      Class390.field_91,
      Class390.field_962,
      Class390.field_2588,
      Class390.field_2480
   };
   private int field_2782;

   public Class490(int var1, int var2) {
      super(var1, 2, var2, field_1598);
      this.field_2782 = var2;
   }

   @Override
   public float method_473(Class334 var1, Class108 var2) {
      return var2.field_159 ? this.field_3107 : super.method_473(var1, var2);
   }

   @Override
   public boolean method_725(Class108 var1) {
      return var1 == Class108.field_3085
         ? this.field_2782 >= 3
         : (
            var1 == Class108.field_2971
                  || var1 == Class108.field_564
                  || var1 == Class390.field_1436
                  || var1 == Class390.field_91
                  || var1 == Class108.field_36
                  || var1 == Class108.field_305
                  || var1 == Class108.field_2554
                  || var1 == Class108.field_1887
                  || var1 == Class390.field_178
                  || var1 == Class390.field_1735
                  || var1 == Class390.field_2414
                  || var1 == Class390.field_1943
               ? this.field_2782 >= 2
               : (
                  var1 != Class108.field_2938 && var1 != Class108.field_508 && var1 != Class390.field_2480
                     ? var1.field_1854 == Class160.field_68 || var1.field_1854 == Class160.field_1806
                     : this.field_2782 >= 1
               )
         );
   }
}
