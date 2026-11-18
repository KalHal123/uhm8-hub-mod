package srv;

public class Class329 extends Class383 {
   private static Class371[] field_1481 = new Class371[]{
      Class371.field_319,
      Class371.field_264,
      Class371.field_265,
      Class371.field_1294,
      Class371.field_1198,
      Class371.field_1069,
      Class371.field_1111,
      Class371.field_1296,
      Class371.field_111,
      Class371.field_386,
      Class371.field_666,
      Class371.field_1514,
      Class371.field_811,
      Class323.field_1412,
      Class323.field_523,
      Class323.field_159,
      Class323.field_929,
      Class323.field_1046,
      Class323.field_784
   };
   private int field_1317;

   public Class329(int var1, int var2) {
      super(var1, 2, var2, field_1481);
      this.field_1317 = var2;
   }

   @Override
   public float method_195(Class150 var1, Class371 var2) {
      return var2.field_142 ? this.field_340 : super.method_195(var1, var2);
   }

   @Override
   public boolean method_381(Class371 var1) {
      return var1 == Class371.field_274
         ? this.field_1317 == 3
         : (
            var1 == Class371.field_1514
                  || var1 == Class371.field_666
                  || var1 == Class323.field_523
                  || var1 == Class323.field_159
                  || var1 == Class371.field_161
                  || var1 == Class371.field_798
                  || var1 == Class371.field_111
                  || var1 == Class371.field_386
               ? this.field_1317 >= 2
               : (
                  var1 != Class371.field_1111 && var1 != Class371.field_1069 && var1 != Class323.field_784
                     ? var1.field_658 == Class111.field_1043 || var1.field_658 == Class111.field_279
                     : this.field_1317 >= 1
               )
         );
   }
}
