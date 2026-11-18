package srv;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public interface Interface210 {
   double method_372(int var1, int var2, Class49.Inner296 var3);

   double method_64(int var1, int var2, Class49.Inner296 var3);

   Class49 method_388(int var1, int var2, Class49.Inner296 var3);

   class Inner211 {
      private static final WeakHashMap<Interface210, Interface210.Inner211> field_562 = new WeakHashMap<>();
      private final Interface210 field_623;

      private Inner211(Interface210 var1) {
         this.field_623 = var1;
      }

      public static Interface210.Inner211 method_688(Interface210 var0) {
         Interface210.Inner211 var1 = field_562.get(var0);
         if (var1 == null) {
            var1 = new Interface210.Inner211(var0);
            field_562.put(var1.field_623, var1);
         }

         return var1;
      }

      public Class49 method_842(int var1, int var2, Class49.Inner296 var3) {
         HashMap var4 = new HashMap(16);

         for (int var5 = 0; var5 < 16; var5++) {
            for (int var6 = 0; var6 < 16; var6++) {
               Class49 var7 = this.field_623.method_388(var1 * 16 + var5, var2 * 16 + var6, var3);
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
         Class49 var11 = null;

         for (Entry var15 : var4.entrySet()) {
            if ((Integer)var15.getValue() > var10) {
               var10 = (Integer)var15.getValue();
               var11 = (Class49)var15.getKey();
            }
         }

         if (var11 == null) {
            System.err.println("!BIOME GENERATOR BUG (please report on bug tracker)!");
            System.err.println("biome list:");

            for (Entry var16 : var4.entrySet()) {
               if (var16.getKey() == null) {
                  System.out.println("null biome");
               } else {
                  System.err.println(var16.getKey() + "/" + var16.getValue());
               }
            }

            throw new IllegalArgumentException();
         } else {
            return var11;
         }
      }
   }
}
