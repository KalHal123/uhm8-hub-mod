import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class fq {
   private Map m = new HashMap();
   public static fq a = new fq();
   private jt n;
   public static double b;
   public static double c;
   public static double d;
   public er e;
   public cj f;
   public dg g;
   public float h;
   public float i;
   public double j;
   public double k;
   public double l;

   private fq() {
      this.m.put(nn.class, new id());
      this.m.put(ba.class, new q());

      for (eq var2 : this.m.values()) {
         var2.a(this);
      }
   }

   public eq a(Class var1) {
      eq var2 = (eq)this.m.get(var1);
      if (var2 == null && var1 != ht.class) {
         var2 = this.a(var1.getSuperclass());
         this.m.put(var1, var2);
      }

      return var2;
   }

   public boolean a(ht var1) {
      return this.b(var1) != null;
   }

   public eq b(ht var1) {
      return this.a(var1.getClass());
   }

   public void a(cj var1, er var2, jt var3, dg var4, float var5) {
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

   public void a(ht var1, float var2) {
      if (var1.a(this.j, this.k, this.l) < 4096.0) {
         float var3 = this.f.c(var1.f, var1.g, var1.h);
         GL11.glColor3f(var3, var3, var3);
         this.a(var1, var1.f - b, var1.g - c, var1.h - d, var2);
      }
   }

   public void a(ht var1, double var2, double var4, double var6, float var8) {
      eq var9 = this.b(var1);
      if (var9 != null) {
         var9.a(var1, var2, var4, var6, var8);
      }
   }

   public jt a() {
      return this.n;
   }
}
