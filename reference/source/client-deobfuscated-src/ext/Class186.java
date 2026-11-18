package ext;

import java.util.HashMap;
import java.util.Map;

public class Class186 {
   private static Map<String, Class<? extends Class186>> field_1885 = new HashMap<>();
   private static Map<Class<? extends Class186>, String> field_3076 = new HashMap<>();
   public Class454 field_1380;
   public int field_2878;
   public int field_883;
   public int field_921;

   private static void method_191(Class<? extends Class186> var0, String var1) {
      if (field_1885.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      }

      field_1885.put(var1, var0);
      field_3076.put(var0, var1);
   }

   public void method_434(Class686 var1) {
      this.field_2878 = var1.method_1747("x");
      this.field_883 = var1.method_1747("y");
      this.field_921 = var1.method_1747("z");
   }

   public void method_1623(Class686 var1) {
      String var2 = field_3076.get(this.getClass());
      if (var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      }

      var1.method_375("id", var2);
      var1.method_1310("x", this.field_2878);
      var1.method_1310("y", this.field_883);
      var1.method_1310("z", this.field_921);
   }

   public void method_1176() {
   }

   public static Class186 method_1515(Class686 var0) {
      Class186 var1 = null;

      try {
         Class var2 = field_1885.get(var0.method_1087("id"));
         if (var2 != null) {
            var1 = (Class186)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if (var1 != null) {
         var1.method_434(var0);
      } else {
         System.out.println("Skipping TileEntity with id " + var0.method_1087("id"));
      }

      return var1;
   }

   public int method_1664() {
      return this.field_1380.method_1110(this.field_2878, this.field_883, this.field_921);
   }

   public void method_430() {
      this.field_1380.method_299(this.field_2878, this.field_883, this.field_921, this);
   }

   public double method_1823(double var1, double var3, double var5) {
      double var7 = this.field_2878 + 0.5 - var1;
      double var9 = this.field_883 + 0.5 - var3;
      double var11 = this.field_921 + 0.5 - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public Class108 method_1438() {
      return Class108.field_1221[this.field_1380.method_197(this.field_2878, this.field_883, this.field_921)];
   }

   static {
      method_191(Class38.class, "Furnace");
      method_191(Class520.class, "Chest");
      method_191(Class243.class, "Sign");
      method_191(Class529.class, "MobSpawner");
      method_191(Class476.class, "EssenceFountain");
      method_191(Class659.class, "Freezer");
      Class3.method_1043();
   }
}
