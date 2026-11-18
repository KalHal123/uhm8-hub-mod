package ext;

import java.util.ArrayList;
import java.util.List;

public class Class13 extends Class110 {
   public Class340<?> field_1272;
   List<Class264> field_436 = new ArrayList<>();

   public Class13(Class124 var1) {
      this(var1, 64, 64);
   }

   public Class13(Class124 var1, int var2, int var3) {
      for (Class625 var5 : var1.field_2111.field_1359.field_2545) {
         for (Class139 var8 : var5.field_2456.field_1656) {
            Class264 var9 = new Class264(var8.field_1504, var8.field_2223);
            var9.method_703(
               var5.field_1866.field_1562 + var8.field_2561,
               var5.field_1866.field_1859 + var8.field_1358,
               var5.field_1866.field_955 + var8.field_2105,
               var8.field_2303,
               var8.field_1978,
               var8.field_797,
               0.0F,
               var2,
               var3
            );
            var9.method_1541(0.0F, 0.0F, 0.0F);
            if (var8.field_843) {
               var9.field_1192 = true;
            }

            this.field_436.add(var9);
         }
      }
   }

   @Override
   public void method_837(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_578(var1, var2, var3, var4, var5, var6);

      for (Class264 var8 : this.field_436) {
         var8.method_1022(var6);
      }
   }
}
