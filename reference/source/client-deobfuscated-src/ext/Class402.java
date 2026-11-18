package ext;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class Class402 {
   private Map<Class<? extends Class186>, Class600> field_1813 = new HashMap<>();
   public static Class402 field_1178 = new Class402();
   private Class640 field_863;
   public static double field_2518;
   public static double field_604;
   public static double field_2255;
   public Class432 field_1600;
   public Class454 field_2179;
   public Class354 field_2989;
   public float field_387;
   public float field_501;
   public double field_1114;
   public double field_1639;
   public double field_261;

   private Class402() {
      this.field_1813.put(Class243.class, new Class528());
      this.field_1813.put(Class529.class, new Class206());

      for (Class600 var2 : this.field_1813.values()) {
         var2.method_943(this);
      }
   }

   public Class600 method_959(Class var1) {
      Class600 var2 = this.field_1813.get(var1);
      if (var2 == null && var1 != Class186.class) {
         var2 = this.method_959(var1.getSuperclass());
         this.field_1813.put(var1, var2);
      }

      return var2;
   }

   public boolean method_975(Class186 var1) {
      return this.method_322(var1) != null;
   }

   public Class600 method_322(Class186 var1) {
      return this.method_959(var1.getClass());
   }

   public void method_1204(Class454 var1, Class432 var2, Class640 var3, Class354 var4, float var5) {
      this.field_2179 = var1;
      this.field_1600 = var2;
      this.field_2989 = var4;
      this.field_863 = var3;
      this.field_387 = var4.field_2772 + (var4.field_1661 - var4.field_2772) * var5;
      this.field_501 = var4.field_2984 + (var4.field_2866 - var4.field_2984) * var5;
      this.field_1114 = var4.field_2173 + (var4.field_1417 - var4.field_2173) * var5;
      this.field_1639 = var4.field_2270 + (var4.field_2654 - var4.field_2270) * var5;
      this.field_261 = var4.field_1907 + (var4.field_2013 - var4.field_1907) * var5;
   }

   public void method_983(Class186 var1, float var2) {
      if (var1.method_1823(this.field_1114, this.field_1639, this.field_261) < 4096.0) {
         float var3 = this.field_2179.method_1154(var1.field_2878, var1.field_883, var1.field_921);
         GL11.glColor3f(var3, var3, var3);
         this.method_1126(var1, var1.field_2878 - field_2518, var1.field_883 - field_604, var1.field_921 - field_2255, var2);
      }
   }

   public void method_1126(Class186 var1, double var2, double var4, double var6, float var8) {
      Class600 var9 = this.method_322(var1);
      if (var9 != null) {
         var9.method_945(var1, var2, var4, var6, var8);
      }
   }

   public Class640 method_1390() {
      return this.field_863;
   }
}
