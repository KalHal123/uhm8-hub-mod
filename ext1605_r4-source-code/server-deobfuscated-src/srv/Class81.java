package srv;

import java.util.Random;

public class Class81 {
   public static double field_610 = 0.5;
   public static int field_1181 = 4;
   private final Interface14[] field_726;
   private final float field_374;
   final Class345[] field_939 = new Class345[field_1181];
   final Class345 field_85;

   public Class81(Random var1) {
      this.field_85 = new Class345(var1);

      for (int var2 = 0; var2 < field_1181; var2++) {
         this.field_939[var2] = new Class345(var1);
      }

      this.field_726 = new Interface14[]{new Class348(var1), new Class212(var1), new Class65(var1)};
      float var7 = 0.0F;

      for (Interface14 var6 : this.field_726) {
         var7 += var6.method_449();
      }

      this.field_374 = var7;
   }

   public <T extends Interface14> T method_281(Class<T> var1) {
      for (Interface14 var5 : this.field_726) {
         if (var1.isInstance(var5)) {
            return (T)var1.cast(var5);
         }
      }

      throw new RuntimeException();
   }

   public Interface14 method_156(int var1, int var2) {
      if (Math.pow(Math.min(100, Math.abs(var1)), 2.0) + Math.pow(Math.min(100, Math.abs(var2)), 2.0) < 256.0) {
         return this.method_281(Class348.class);
      }

      for (Class345 var6 : this.field_939) {
         if (var6.method_78(var1 / 16.0, var2 / 16.0) < field_610 * 2.0 - 1.0) {
            return this.method_281(Class348.class);
         }
      }

      double var9 = (this.field_85.method_78(var1, var2) / 2.0 + 0.5) * this.field_374;

      for (Interface14 var8 : this.field_726) {
         if (var9 <= var8.method_449()) {
            return var8;
         }

         var9 -= var8.method_449();
      }

      return this.method_281(Class348.class);
   }

   public boolean method_722(Class<? extends Interface14> var1, int var2, int var3) {
      Interface14 var4 = this.method_156(var2, var3);
      return var1.isInstance(var4);
   }

   public void method_233(Class317 var1, int var2, int var3) {
      Interface14 var4 = this.method_156(var2, var3);
      var4.method_1024(var1, var2, var3, this);
   }
}
