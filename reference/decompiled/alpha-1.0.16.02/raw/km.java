import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class km {
   private Map o = new HashMap();
   public static km a = new km();
   private jt p;
   public static double b;
   public static double c;
   public static double d;
   public er e;
   public iy f;
   public cj g;
   public dg h;
   public float i;
   public float j;
   public fi k;
   public double l;
   public double m;
   public double n;

   private km() {
      this.o.put(at.class, new nw());
      this.o.put(mj.class, new gd(new bw(), new bw(0.5F), 0.7F));
      this.o.put(bk.class, new nf(new gn(), new bt(), 0.7F));
      this.o.put(ak.class, new ls(new dp(), 0.7F));
      this.o.put(mm.class, new ek(new kk(), 0.3F));
      this.o.put(cy.class, new d());
      this.o.put(cs.class, new dh(new fm(), 0.5F));
      this.o.put(lr.class, new dh(new bx(), 0.5F));
      this.o.put(lq.class, new gh(new gx(16), new gx(0), 0.25F));
      this.o.put(dg.class, new bq());
      this.o.put(hb.class, new nl(new bx(), 0.5F, 6.0F));
      this.o.put(fv.class, new dh(new cn(), 0.5F));
      this.o.put(jx.class, new ga());
      this.o.put(it.class, new bs());
      this.o.put(jw.class, new gb());
      this.o.put(al.class, new ec());
      this.o.put(dr.class, new z());
      this.o.put(iu.class, new hm());
      this.o.put(ex.class, new de());
      this.o.put(no.class, new ki());
      this.o.put(cx.class, new cl());

      for (ai var2 : this.o.values()) {
         var2.a(this);
      }
   }

   public ai a(Class var1) {
      ai var2 = (ai)this.o.get(var1);
      if (var2 == null && var1 != jx.class) {
         var2 = this.a(var1.getSuperclass());
         this.o.put(var1, var2);
      }

      return var2;
   }

   public ai a(jx var1) {
      return this.a(var1.getClass());
   }

   public void a(cj var1, er var2, jt var3, dg var4, fi var5, float var6) {
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

   public void a(jx var1, float var2) {
      double var3 = var1.aF + (var1.ah - var1.aF) * var2;
      double var5 = var1.aG + (var1.ai - var1.aG) * var2;
      double var7 = var1.aH + (var1.aj - var1.aH) * var2;
      float var9 = var1.ap + (var1.an - var1.ap) * var2;
      float var10 = var1.a(var2);
      GL11.glColor3f(var10, var10, var10);
      this.a(var1, var3 - b, var5 - c, var7 - d, var9, var2);
   }

   public void a(jx var1, double var2, double var4, double var6, float var8, float var9) {
      ai var10 = this.a(var1);
      if (var10 != null) {
         var10.a(var1, var2, var4, var6, var8, var9);
         var10.b(var1, var2, var4, var6, var8, var9);
      }
   }

   public void a(cj var1) {
      this.g = var1;
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 - this.l;
      double var9 = var3 - this.m;
      double var11 = var5 - this.n;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public jt a() {
      return this.p;
   }
}
