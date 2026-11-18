public class gw extends ff {
   public if d = new if(0, 0);
   public if e;
   public if f;
   public if g;
   public if h;
   public if i;

   public gw(int var1, float var2) {
      this.d.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.d.a(0.0F, 18 - var1, -6.0F);
      this.e = new if(28, 8);
      this.e.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.e.a(0.0F, 17 - var1, 2.0F);
      this.f = new if(0, 16);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.f.a(-3.0F, 24 - var1, 7.0F);
      this.g = new if(0, 16);
      this.g.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.g.a(3.0F, 24 - var1, 7.0F);
      this.h = new if(0, 16);
      this.h.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.h.a(-3.0F, 24 - var1, -5.0F);
      this.i = new if(0, 16);
      this.i.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.i.a(3.0F, 24 - var1, -5.0F);
   }

   @Override
   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.d.a(var6);
      this.e.a(var6);
      this.f.a(var6);
      this.g.a(var6);
      this.h.a(var6);
      this.i.a(var6);
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.d.d = -(var5 / (180.0F / (float)Math.PI));
      this.d.e = var4 / (180.0F / (float)Math.PI);
      this.e.d = (float) (Math.PI / 2);
      this.f.d = ei.b(var1 * 0.6662F) * 1.4F * var2;
      this.g.d = ei.b(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.h.d = ei.b(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.i.d = ei.b(var1 * 0.6662F) * 1.4F * var2;
   }
}
