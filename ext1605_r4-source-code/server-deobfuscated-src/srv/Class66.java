package srv;

import java.util.HashMap;
import java.util.Map;

public class Class66 {
   private static Map field_852 = new HashMap();
   private static Map field_446 = new HashMap();
   public Class317 field_416;
   public int field_720;
   public int field_1400;
   public int field_454;

   private static void method_999(Class var0, String var1) {
      if (field_446.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      }

      field_852.put(var1, var0);
      field_446.put(var0, var1);
   }

   public void method_816(Class100 var1) {
      this.field_720 = var1.method_159("x");
      this.field_1400 = var1.method_159("y");
      this.field_454 = var1.method_159("z");
   }

   public void method_878(Class100 var1) {
      String var2 = (String)field_446.get(this.getClass());
      if (var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      }

      var1.method_152("id", var2);
      var1.method_32("x", this.field_720);
      var1.method_32("y", this.field_1400);
      var1.method_32("z", this.field_454);
   }

   public void method_855() {
   }

   public static Class66 method_383(Class100 var0) {
      Class66 var1 = null;

      try {
         Class var2 = (Class)field_852.get(var0.method_219("id"));
         if (var2 != null) {
            var1 = (Class66)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if (var1 != null) {
         var1.method_816(var0);
      } else {
         System.out.println("Skipping TileEntity with id " + var0.method_219("id"));
      }

      return var1;
   }

   public void method_766() {
      this.field_416.method_694(this.field_720, this.field_1400, this.field_454, this);
   }

   static {
      method_999(Class24.class, "Furnace");
      method_999(Class171.class, "Chest");
      method_999(Class272.class, "Sign");
      method_999(Class68.class, "MobSpawner");
      method_999(Class54.class, "EssenceFountain");
   }
}
