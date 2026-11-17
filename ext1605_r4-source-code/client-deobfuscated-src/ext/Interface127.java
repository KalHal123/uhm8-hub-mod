package ext;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public interface Interface127 {
   double method_660(int var1, int var2, Class457.Inner598 var3);

   double method_919(int var1, int var2, Class457.Inner598 var3);

   Class457 method_1497(int var1, int var2, Class457.Inner598 var3);

   class Inner128 {
      private static final WeakHashMap<Interface127, Interface127.Inner128> field_912 = new WeakHashMap<>();
      private final Interface127 field_2065;

      private Inner128(Interface127 var1) {
         this.field_2065 = var1;
      }

      public static Interface127.Inner128 method_555(Interface127 var0) {
         Interface127.Inner128 var1 = field_912.get(var0);
         if (var1 == null) {
            var1 = new Interface127.Inner128(var0);
            field_912.put(var1.field_2065, var1);
         }

         return var1;
      }

      public Class457 method_476(int var1, int var2, Class457.Inner598 var3) {
         HashMap var4 = new HashMap(16);

         for (int var5 = 0; var5 < 16; var5++) {
            for (int var6 = 0; var6 < 16; var6++) {
               Class457 var7 = this.field_2065.method_1497(var1 * 16 + var5, var2 * 16 + var6, var3);
               Integer var8 = (Integer)var4.get(var7);
               if (var8 == null) {
                  var8 = 1;
               } else {
                  var8 = var8 + 1;
               }

               var4.put(var7, var8);
            }
         }

         int var10 = 0;
         Class457 var11 = null;

         for (Entry var15 : var4.entrySet()) {
            if ((Integer)var15.getValue() > var10) {
               var10 = (Integer)var15.getValue();
               var11 = (Class457)var15.getKey();
            }
         }

         if (var11 != null) {
            return var11;
         }

         System.err.println("!BIOME GENERATOR BUG (please report on bug tracker)!");
         System.err.println("biome list:");

         for (Entry var16 : var4.entrySet()) {
            System.err.println(((Class457)var16.getKey()).toString() + "/" + var16.getValue());
         }

         throw new RuntimeException64();
      }
   }
}
