package x;

public class Class0069 extends Class0142 {
   public Class0223 a;
   public Class0223 b;
   public Class0223 c;
   public Class0223 d;
   public Class0223 e;
   public Class0223 f;
   public Class0223 g;
   public boolean h = false;
   public boolean i = false;

   public Class0069() {
      this(0.0F);
   }

   public Class0069(float var1) {
      this(var1, 0.0F);
   }

   public Class0069(float var1, float var2) {
      this.a = new Class0223(0, 0);
      this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.a.a(0.0F, 0.0F + var2, 0.0F);
      this.b = new Class0223(32, 0);
      this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.b.a(0.0F, 0.0F + var2, 0.0F);
      this.c = new Class0223(16, 16);
      this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.c.a(0.0F, 0.0F + var2, 0.0F);
      this.d = new Class0223(40, 16);
      this.d.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.d.a(-5.0F, 2.0F + var2, 0.0F);
      this.e = new Class0223(40, 16);
      this.e.g = true;
      this.e.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.e.a(5.0F, 2.0F + var2, 0.0F);
      this.f = new Class0223(0, 16);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.f.a(-2.0F, 12.0F + var2, 0.0F);
      this.g = new Class0223(0, 16);
      this.g.g = true;
      this.g.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.g.a(2.0F, 12.0F + var2, 0.0F);
   }

   @Override
   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.a.a(var6);
      this.c.a(var6);
      this.d.a(var6);
      this.e.a(var6);
      this.f.a(var6);
      this.g.a(var6);
      this.b.a(var6);
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.e = var4 / (180.0F / (float)Math.PI);
      this.a.d = var5 / (180.0F / (float)Math.PI);
      this.b.e = this.a.e;
      this.b.d = this.a.d;
      this.d.d = Class0118.b(var1 * 0.6662F + (float) Math.PI) * 2.0F * var2 * 0.5F;
      this.e.d = Class0118.b(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.d.f = 0.0F;
      this.e.f = 0.0F;
      this.f.d = Class0118.b(var1 * 0.6662F) * 1.4F * var2;
      this.g.d = Class0118.b(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.f.e = 0.0F;
      this.g.e = 0.0F;
      if (this.k) {
         this.d.d += (float) (-Math.PI / 5);
         this.e.d += (float) (-Math.PI / 5);
         this.f.d = (float) (-Math.PI * 2.0 / 5.0);
         this.g.d = (float) (-Math.PI * 2.0 / 5.0);
         this.f.e = (float) (Math.PI / 10);
         this.g.e = (float) (-Math.PI / 10);
      }

      if (this.h) {
         this.e.d = this.e.d * 0.5F - (float) (Math.PI / 10);
      }

      if (this.i) {
         this.d.d = this.d.d * 0.5F - (float) (Math.PI / 10);
      }

      this.d.e = 0.0F;
      this.e.e = 0.0F;
      if (this.j > -9990.0F) {
         float var7 = this.j;
         this.c.e = Class0118.a(Class0118.c(var7) * (float) Math.PI * 2.0F) * 0.2F;
         this.d.c = Class0118.a(this.c.e) * 5.0F;
         this.d.a = -Class0118.b(this.c.e) * 5.0F;
         this.e.c = -Class0118.a(this.c.e) * 5.0F;
         this.e.a = Class0118.b(this.c.e) * 5.0F;
         this.d.e = this.d.e + this.c.e;
         this.e.e = this.e.e + this.c.e;
         this.e.d = this.e.d + this.c.e;
         var7 = 1.0F - this.j;
         var7 *= var7;
         var7 *= var7;
         var7 = 1.0F - var7;
         float var8 = Class0118.a(var7 * (float) Math.PI);
         float var9 = Class0118.a(this.j * (float) Math.PI) * -(this.a.d - 0.7F) * 0.75F;
         this.d.d = (float)(this.d.d - (var8 * 1.2 + var9));
         this.d.e = this.d.e + this.c.e * 2.0F;
         this.d.f = Class0118.a(this.j * (float) Math.PI) * -0.4F;
      }

      this.d.f = this.d.f + (Class0118.b(var3 * 0.09F) * 0.05F + 0.05F);
      this.e.f = this.e.f - (Class0118.b(var3 * 0.09F) * 0.05F + 0.05F);
      this.d.d = this.d.d + Class0118.a(var3 * 0.067F) * 0.05F;
      this.e.d = this.e.d - Class0118.a(var3 * 0.067F) * 0.05F;
   }
}
