package ext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Class553 {
   public static HashMap<String, Class553> field_748 = new HashMap<>();
   public String field_1926;
   public byte[] field_2813;
   public int field_2239 = 1024;
   public int field_1653;
   public int field_1609 = 0;
   public List<Integer> field_2034 = new ArrayList<>();

   public Class553(String var1, int var2) {
      this.field_1926 = var1;
      this.field_2813 = new byte[var2];
      this.field_1653 = var2;
   }

   public static Class553 method_263(String var0, int var1) {
      if (!field_748.containsKey(var0)) {
         field_748.put(var0, new Class553(var0, var1));
      }

      return field_748.get(var0);
   }

   public void method_1884(byte[] var1, int var2) {
      if (var2 >= 0 && var2 <= this.field_1653 / this.field_2239) {
         if (!this.field_2034.contains(var2)) {
            Class597.method_883("Received data chunk n" + var2);
            int var3 = var2 * this.field_2239;
            int var4 = 1024;
            if (var3 + this.field_2239 > this.field_1653) {
               var4 = this.field_1653 - var3;
            }

            System.arraycopy(var1, 0, this.field_2813, var2 * this.field_2239, var4);
            this.field_1609 += var1.length;
         }
      } else {
         Class597.method_195("Received invalid data chunk n" + var2);
      }
   }

   public boolean method_1851() {
      return this.field_1609 >= this.field_1653;
   }
}
