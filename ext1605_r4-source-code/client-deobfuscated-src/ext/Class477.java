package ext;

import java.util.HashMap;
import java.util.Map.Entry;

public class Class477 implements Interface127 {
   private final HashMap<Class475, float[]> field_290 = new HashMap<>();

   public void method_1546(Class475 var1, float[] var2) {
      if (var2.length != 1536) {
         throw new IllegalArgumentException("Invalid biome map");
      }

      this.field_290.put(var1, var2);
   }

   public void method_664(Class475 var1) {
      this.field_290.remove(var1);
   }

   @Override
   public double method_660(int var1, int var2, Class457.Inner598 var3) {
      int var4 = var1 % 16;
      if (var4 < 0) {
         var4 += 15;
      }

      int var5 = var2 % 16;
      if (var5 < 0) {
         var5 += 15;
      }

      for (Entry var7 : this.field_290.entrySet()) {
         if (((Class475)var7.getKey()).field_2785 == var1 / 16 && ((Class475)var7.getKey()).field_256 == var2 / 16) {
            return ((float[])var7.getValue())[var3.ordinal() * 16 * 16 * 2 + var4 * 2 + var5 * 16 * 2];
         }
      }

      return 0.0;
   }

   @Override
   public double method_919(int var1, int var2, Class457.Inner598 var3) {
      int var4 = var1 % 16;
      if (var4 < 0) {
         var4 += 16;
      }

      int var5 = var2 % 16;
      if (var5 < 0) {
         var5 += 16;
      }

      for (Entry var7 : this.field_290.entrySet()) {
         if (((Class475)var7.getKey()).field_2785 == var1 / 16 && ((Class475)var7.getKey()).field_256 == var2 / 16) {
            return ((float[])var7.getValue())[var3.ordinal() * 16 * 16 * 2 + var4 * 2 + var5 * 16 * 2 + 1];
         }
      }

      return 0.0;
   }

   @Override
   public Class457 method_1497(int var1, int var2, Class457.Inner598 var3) {
      return Class457.method_525(this.method_660(var1, var2, var3), this.method_919(var1, var2, var3), var3);
   }
}
