package ext;

import java.util.Random;

public class Class99 {
   public static double field_296 = 0.5;
   public static int field_689 = 4;
   private final Interface664[] field_2403;
   private final float field_1279;
   final Class107[] field_1785 = new Class107[field_689];
   final Class107 field_1898;

   public Class99(Random var1) {
      this.field_1898 = new Class107(var1);

      for (int var2 = 0; var2 < field_689; var2++) {
         this.field_1785[var2] = new Class107(var1);
      }

      this.field_2403 = new Interface664[]{new Class381(var1), new Class634(var1), new Class74(var1)};
      float var7 = 0.0F;

      for (Interface664 var6 : this.field_2403) {
         var7 += var6.method_1766();
      }

      this.field_1279 = var7;
   }

   public <T extends Interface664> T method_1106(Class<T> var1) {
      for (Interface664 var5 : this.field_2403) {
         if (var1.isInstance(var5)) {
            return (T)var1.cast(var5);
         }
      }

      throw new RuntimeException64();
   }

   public Interface664 method_1797(int var1, int var2) {
      if (Math.pow(Math.min(100, Math.abs(var1)), 2.0) + Math.pow(Math.min(100, Math.abs(var2)), 2.0) < 256.0) {
         return this.method_1106(Class381.class);
      }

      for (Class107 var6 : this.field_1785) {
         if (var6.method_398(var1 / 16.0, var2 / 16.0) < field_296 * 2.0 - 1.0) {
            return this.method_1106(Class381.class);
         }
      }

      double var9 = (this.field_1898.method_398(var1, var2) / 2.0 + 0.5) * this.field_1279;

      for (Interface664 var8 : this.field_2403) {
         if (var9 <= var8.method_1766()) {
            return var8;
         }

         var9 -= var8.method_1766();
      }

      return this.method_1106(Class381.class);
   }

   public boolean method_367(Class<? extends Interface664> var1, int var2, int var3) {
      Interface664 var4 = this.method_1797(var2, var3);
      return var1.isInstance(var4);
   }

   public void method_1174(Class454 var1, int var2, int var3) {
      Interface664 var4 = this.method_1797(var2, var3);
      var4.method_1166(var1, var2, var3, this);
   }
}
