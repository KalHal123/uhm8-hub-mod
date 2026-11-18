package x;

public class Class0282 extends Class0142 {
   public Class0223 a;
   public Class0223 b;
   public Class0223 c;
   public Class0223 d;
   public Class0223 e;
   public Class0223 f;
   public Class0223 g;
   public Class0223 h;

   public Class0282() {
      byte var1 = 16;
      this.a = new Class0223(0, 0);
      this.a.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.a.a(0.0F, -1 + var1, -4.0F);
      this.g = new Class0223(14, 0);
      this.g.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.g.a(0.0F, -1 + var1, -4.0F);
      this.h = new Class0223(14, 4);
      this.h.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.h.a(0.0F, -1 + var1, -4.0F);
      this.b = new Class0223(0, 9);
      this.b.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.b.a(0.0F, 0 + var1, 0.0F);
      this.c = new Class0223(26, 0);
      this.c.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.c.a(-2.0F, 3 + var1, 1.0F);
      this.d = new Class0223(26, 0);
      this.d.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.d.a(1.0F, 3 + var1, 1.0F);
      this.e = new Class0223(24, 13);
      this.e.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.e.a(-4.0F, -3 + var1, 0.0F);
      this.f = new Class0223(24, 13);
      this.f.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.f.a(4.0F, -3 + var1, 0.0F);
   }

   @Override
   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.a.a(var6);
      this.g.a(var6);
      this.h.a(var6);
      this.b.a(var6);
      this.c.a(var6);
      this.d.a(var6);
      this.e.a(var6);
      this.f.a(var6);
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.d = -(var5 / (180.0F / (float)Math.PI));
      this.a.e = var4 / (180.0F / (float)Math.PI);
      this.g.d = this.a.d;
      this.g.e = this.a.e;
      this.h.d = this.a.d;
      this.h.e = this.a.e;
      this.b.d = (float) (Math.PI / 2);
      this.c.d = Class0118.b(var1 * 0.6662F) * 1.4F * var2;
      this.d.d = Class0118.b(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.e.f = var3;
      this.f.f = -var3;
   }
}
