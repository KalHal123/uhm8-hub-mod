package ext;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class Class531 {
   private Map<Class<? extends Class359>, Class459> field_745 = new HashMap<>();
   public static Class531 field_759 = new Class531();
   private Class640 field_525;
   public static double field_998;
   public static double field_1291;
   public static double field_2192;
   public Class432 field_1814;
   public Class703 field_2458;
   public Class454 field_2143;
   public Class354 field_688;
   public float field_376;
   public float field_519;
   public Class693 field_17;
   public double field_1425;
   public double field_943;
   public double field_1599;

   private Class531() {
      this.field_745.put(Class639.class, new Class673());
      this.field_745.put(Class436.class, new Class667(new Class147(), new Class147(0.5F), 0.7F));
      this.field_745.put(Class58.class, new Class69(new Class212(), new Class386(), 0.7F));
      this.field_745.put(Class105.class, new Class620(new Class11(), 0.7F));
      this.field_745.put(Class146.class, new Class353(new Class188(), 0.3F));
      this.field_745.put(Class111.class, new Class132());
      this.field_745.put(Class716.class, new Class591(new Class557(), 0.5F));
      this.field_745.put(Class191.class, new Class591(new Class163(), 0.5F));
      this.field_745.put(Class713.class, new Class695(new Class271(16), new Class271(0), 0.25F));
      this.field_745.put(Class354.class, new Class223());
      this.field_745.put(Class143.class, new Class221(new Class163(), 0.5F, 6.0F));
      this.field_745.put(Class377.class, new Class591(new Class567(), 0.5F));
      this.field_745.put(Class359.class, new Class437());
      this.field_745.put(Class268.class, new Class87());
      this.field_745.put(Class10.class, new Class509(false));
      this.field_745.put(Class345.class, new Class509(true));
      this.field_745.put(Class565.class, new Class319());
      this.field_745.put(Class198.class, new Class627());
      this.field_745.put(Class435.class, new Class57());
      this.field_745.put(Class492.class, new Class357());
      this.field_745.put(Class527.class, new Class606());
      this.field_745.put(Class256.class, new Class543());
      this.field_745.put(Class514.class, new Class223());
      this.field_745.put(Class396.class, new Class626(new Class163(), 0.5F, 6.0F));
      this.field_745.put(Class101.class, new Class591(new Class356(), 0.5F));
      this.field_745.put(Class137.class, new Class591(new Class13(Class167.createBodyLayer()), 0.5F));
      this.field_745.put(Class144.class, new Class591(new Class13(Class691.createBodyLayer()), 0.5F));
      this.field_745.put(Class391.class, new Class591(new Class131(), 0.5F));
      this.field_745.put(Class645.class, new Class591(new Class13(Class343.createBodyLayer(), 128, 128), 0.5F));
      this.field_745.put(Class496.class, new Class509(false));
      Class3.method_1273(this.field_745);

      for (Class459 var2 : this.field_745.values()) {
         var2.method_1926(this);
      }
   }

   public Class459 method_1753(Class var1) {
      Class459 var2 = this.field_745.get(var1);
      if (var2 == null && var1 != Class359.class) {
         var2 = this.method_1753(var1.getSuperclass());
         this.field_745.put(var1, var2);
      }

      return var2;
   }

   public Class459 method_679(Class359 var1) {
      return this.method_1753(var1.getClass());
   }

   public void method_755(Class454 var1, Class432 var2, Class640 var3, Class354 var4, Class693 var5, float var6) {
      this.field_2143 = var1;
      this.field_1814 = var2;
      this.field_17 = var5;
      this.field_688 = var4;
      this.field_525 = var3;
      this.field_376 = var4.field_2772 + (var4.field_1661 - var4.field_2772) * var6;
      this.field_519 = var4.field_2984 + (var4.field_2866 - var4.field_2984) * var6;
      this.field_1425 = var4.field_2173 + (var4.field_1417 - var4.field_2173) * var6;
      this.field_943 = var4.field_2270 + (var4.field_2654 - var4.field_2270) * var6;
      this.field_1599 = var4.field_1907 + (var4.field_2013 - var4.field_1907) * var6;
      if (!Class3.field_1220) {
         Class3.method_1866(var2);
      }
   }

   public void method_1799(Class359 var1, float var2) {
      double var3 = var1.field_2173 + (var1.field_1417 - var1.field_2173) * var2;
      double var5 = var1.field_2270 + (var1.field_2654 - var1.field_2270) * var2;
      double var7 = var1.field_1907 + (var1.field_2013 - var1.field_1907) * var2;
      float var9 = var1.field_2772 + (var1.field_1661 - var1.field_2772) * var2;
      float var10 = var1.method_50(var2);
      GL11.glColor3f(var10, var10, var10);
      this.method_521(var1, var3 - field_998, var5 - field_1291, var7 - field_2192, var9, var2);
   }

   public void method_521(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      Class459 var10 = this.method_679(var1);
      if (var10 != null) {
         var10.method_524(var1, var2, var4, var6, var8, var9);
         var10.method_1360(var1, var2, var4, var6, var8, var9);
      }
   }

   public void method_151(Class454 var1) {
      this.field_2143 = var1;
   }

   public double method_381(double var1, double var3, double var5) {
      double var7 = var1 - this.field_1425;
      double var9 = var3 - this.field_943;
      double var11 = var5 - this.field_1599;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public Class640 method_831() {
      return this.field_525;
   }
}
