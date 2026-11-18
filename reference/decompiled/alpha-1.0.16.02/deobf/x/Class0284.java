package x;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class Class0284 {
   private Map o = new HashMap();
   public static Class0284 a = new Class0284();
   private Class0264 p;
   public static double b;
   public static double c;
   public static double d;
   public Class0127 e;
   public Class0242 f;
   public Class0065 g;
   public Class0089 h;
   public float i;
   public float j;
   public Class0145 k;
   public double l;
   public double m;
   public double n;

   private Class0284() {
      this.o.put(Class0021.class, new Class0375());
      this.o.put(Class0335.class, new Class0167(new Class0051(), new Class0051(0.5F), 0.7F));
      this.o.put(Class0039.class, new Class0358(new Class0177(), new Class0048(), 0.7F));
      this.o.put(Class0012.class, new Class0317(new Class0098(), 0.7F));
      this.o.put(Class0338.class, new Class0120(new Class0282(), 0.3F));
      this.o.put(Class0080.class, new Class0082());
      this.o.put(Class0074.class, new Class0090(new Class0149(), 0.5F));
      this.o.put(Class0316.class, new Class0090(new Class0052(), 0.5F));
      this.o.put(Class0315.class, new Class0171(new Class0187(16), new Class0187(0), 0.25F));
      this.o.put(Class0089.class, new Class0045());
      this.o.put(Class0192.class, new Class0364(new Class0052(), 0.5F, 6.0F));
      this.o.put(Class0158.class, new Class0090(new Class0069(), 0.5F));
      this.o.put(Class0268.class, new Class0164());
      this.o.put(Class0237.class, new Class0047());
      this.o.put(Class0267.class, new Class0165());
      this.o.put(Class0013.class, new Class0112());
      this.o.put(Class0100.class, new Class0388());
      this.o.put(Class0238.class, new Class0203());
      this.o.put(Class0133.class, new Class0087());
      this.o.put(Class0367.class, new Class0280());
      this.o.put(Class0079.class, new Class0067());

      for (Class0010 var2 : this.o.values()) {
         var2.a(this);
      }
   }

   public Class0010 a(Class var1) {
      Class0010 var2 = (Class0010)this.o.get(var1);
      if (var2 == null && var1 != Class0268.class) {
         var2 = this.a(var1.getSuperclass());
         this.o.put(var1, var2);
      }

      return var2;
   }

   public Class0010 a(Class0268 var1) {
      return this.a(var1.getClass());
   }

   public void a(Class0065 var1, Class0127 var2, Class0264 var3, Class0089 var4, Class0145 var5, float var6) {
      this.g = var1;
      this.e = var2;
      this.k = var5;
      this.h = var4;
      this.p = var3;
      this.i = var4.ap + (var4.an - var4.ap) * var6;
      this.j = var4.aq + (var4.ao - var4.aq) * var6;
      this.l = var4.aF + (var4.ah - var4.aF) * var6;
      this.m = var4.aG + (var4.ai - var4.aG) * var6;
      this.n = var4.aH + (var4.aj - var4.aH) * var6;
   }

   public void a(Class0268 var1, float var2) {
      double var3 = var1.aF + (var1.ah - var1.aF) * var2;
      double var5 = var1.aG + (var1.ai - var1.aG) * var2;
      double var7 = var1.aH + (var1.aj - var1.aH) * var2;
      float var9 = var1.ap + (var1.an - var1.ap) * var2;
      float var10 = var1.a(var2);
      GL11.glColor3f(var10, var10, var10);
      this.a(var1, var3 - b, var5 - c, var7 - d, var9, var2);
   }

   public void a(Class0268 var1, double var2, double var4, double var6, float var8, float var9) {
      Class0010 var10 = this.a(var1);
      if (var10 != null) {
         var10.a(var1, var2, var4, var6, var8, var9);
         var10.b(var1, var2, var4, var6, var8, var9);
      }
   }

   public void a(Class0065 var1) {
      this.g = var1;
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 - this.l;
      double var9 = var3 - this.m;
      double var11 = var5 - this.n;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public Class0264 a() {
      return this.p;
   }
}
