package x;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class Class0212 {
   private static final WeakHashMap<Class0214, Class0212> 3TP37UB4P23Sfk54xe174Y22EVYQrR44o8QR4c422UpKu86qv9dAZ4hv03qG = new WeakHashMap<>();
   private final Class0214 3wqiDB0Br9mxtXo6hsFCIa33m3jtY6MWy12bt3ipyFSP4RGR811UEqMVPmn6;

   private Class0212(Class0214 var1) {
      this.3wqiDB0Br9mxtXo6hsFCIa33m3jtY6MWy12bt3ipyFSP4RGR811UEqMVPmn6 = var1;
   }

   public static Class0212 _eoIT0F2pQe4A56YL8B07HvC6yMDml8s5Hvu214208q3eG0ibKdP3ab4Jwrt/* $VF was: 6eoIT0F2pQe4A56YL8B07HvC6yMDml8s5Hvu214208q3eG0ibKdP3ab4Jwrt */(
      Class0214 var0
   ) {
      Class0212 var1 = 3TP37UB4P23Sfk54xe174Y22EVYQrR44o8QR4c422UpKu86qv9dAZ4hv03qG.get(var0);
      if (var1 == null) {
         var1 = new Class0212(var0);
         3TP37UB4P23Sfk54xe174Y22EVYQrR44o8QR4c422UpKu86qv9dAZ4hv03qG.put(var1.3wqiDB0Br9mxtXo6hsFCIa33m3jtY6MWy12bt3ipyFSP4RGR811UEqMVPmn6, var1);
      }

      return var1;
   }

   public Class0048 _6G7qeg6J4gyyZLl06wPTw8w8PEzJ2S0jk6zSveM1R7dJHl056Vhge5m9Hew/* $VF was: 86G7qeg6J4gyyZLl06wPTw8w8PEzJ2S0jk6zSveM1R7dJHl056Vhge5m9Hew */(
      int var1, int var2, Class0299 var3
   ) {
      HashMap var4 = new HashMap(16);

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            Class0048 var7 = this.3wqiDB0Br9mxtXo6hsFCIa33m3jtY6MWy12bt3ipyFSP4RGR811UEqMVPmn6
               ._p0BQzmK4Mr6H1J26hjJ42W7ny9waN9zTOZAf655888Q468O9Gr48qka17hw/* $VF was: 3p0BQzmK4Mr6H1J26hjJ42W7ny9waN9zTOZAf655888Q468O9Gr48qka17hw */(
                  var1 * 16 + var5, var2 * 16 + var6, var3
               );
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
      Class0048 var11 = null;

      for (Entry var15 : var4.entrySet()) {
         if ((Integer)var15.getValue() > var10) {
            var10 = (Integer)var15.getValue();
            var11 = (Class0048)var15.getKey();
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
