package srv;

public class Class27 extends Class21 {
   public Class27(int var1, int var2, Class111 var3) {
      super(var1, var2, var3, false);
   }

   public void method_1029(Class302 var1, Class43 var2) {
      var1.method_260((int)var2.field_338, (int)var2.field_936, (int)var2.field_247, 0);

      for (byte var3 = -1; var3 <= 1; var3 += 2) {
         if (var1.method_813((int)var2.field_338 + var3, (int)var2.field_936, (int)var2.field_247) == this.field_1379) {
            this.method_1029(var1, var2.method_288(var3, 0L, 0L));
         }
      }

      for (byte var4 = -1; var4 <= 1; var4 += 2) {
         if (var1.method_813((int)var2.field_338, (int)var2.field_936 + var4, (int)var2.field_247) == this.field_1379) {
            this.method_1029(var1, var2.method_288(0L, var4, 0L));
         }
      }

      for (byte var5 = -1; var5 <= 1; var5 += 2) {
         if (var1.method_813((int)var2.field_338, (int)var2.field_936, (int)var2.field_247 + var5) == this.field_1379) {
            this.method_1029(var1, var2.method_288(0L, 0L, var5));
         }
      }
   }
}
