package x;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class Class0153 {
   private Map m = new HashMap();
   public static Class0153 a = new Class0153();
   private Class0264 n;
   public static double b;
   public static double c;
   public static double d;
   public Class0127 e;
   public Class0065 f;
   public Class0089 g;
   public float h;
   public float i;
   public double j;
   public double k;
   public double l;

   private Class0153() {
      this.m.put(Class0366.class, new Class0221());
      this.m.put(Class0029.class, new Class0379());

      for (Class0126 var2 : this.m.values()) {
         var2.a(this);
      }
   }

   public Class0126 a(Class var1) {
      Class0126 var2 = (Class0126)this.m.get(var1);
      if (var2 == null && var1 != Class0210.class) {
         var2 = this.a(var1.getSuperclass());
         this.m.put(var1, var2);
      }

      return var2;
   }

   public boolean a(Class0210 var1) {
      return this.b(var1) != null;
   }

   public Class0126 b(Class0210 var1) {
      return this.a(var1.getClass());
   }

   public void a(Class0065 var1, Class0127 var2, Class0264 var3, Class0089 var4, float var5) {
      this.f = var1;
      this.e = var2;
      this.g = var4;
      this.n = var3;
      this.h = var4.ap + (var4.an - var4.ap) * var5;
      this.i = var4.aq + (var4.ao - var4.aq) * var5;
      this.j = var4.aF + (var4.ah - var4.aF) * var5;
      this.k = var4.aG + (var4.ai - var4.aG) * var5;
      this.l = var4.aH + (var4.aj - var4.aH) * var5;
   }

   public void a(Class0210 var1, float var2) {
      if (var1.a(this.j, this.k, this.l) < 4096.0) {
         float var3 = this.f.c(var1.f, var1.g, var1.h);
         GL11.glColor3f(var3, var3, var3);
         this.a(var1, var1.f - b, var1.g - c, var1.h - d, var2);
      }
   }

   public void a(Class0210 var1, double var2, double var4, double var6, float var8) {
      Class0126 var9 = this.b(var1);
      if (var9 != null) {
         var9.a(var1, var2, var4, var6, var8);
      }
   }

   public Class0264 a() {
      return this.n;
   }
}
