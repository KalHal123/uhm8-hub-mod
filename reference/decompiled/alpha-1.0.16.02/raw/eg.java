public class eg extends ff {
   public if a;
   public if b;
   public if c;
   public if d;
   public if e;
   public if f;
   public if g;

   public eg() {
      float var1 = 0.0F;
      byte var2 = 4;
      this.a = new if(0, 0);
      this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.a.a(0.0F, var2, 0.0F);
      this.b = new if(32, 0);
      this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.b.a(0.0F, var2, 0.0F);
      this.c = new if(16, 16);
      this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.c.a(0.0F, var2, 0.0F);
      this.d = new if(0, 16);
      this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.d.a(-2.0F, 12 + var2, 4.0F);
      this.e = new if(0, 16);
      this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.e.a(2.0F, 12 + var2, 4.0F);
      this.f = new if(0, 16);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.f.a(-2.0F, 12 + var2, -4.0F);
      this.g = new if(0, 16);
      this.g.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.g.a(2.0F, 12 + var2, -4.0F);
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
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.e = var4 / (180.0F / (float)Math.PI);
      this.a.d = var5 / (180.0F / (float)Math.PI);
      this.d.d = ei.b(var1 * 0.6662F) * 1.4F * var2;
      this.e.d = ei.b(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.f.d = ei.b(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.g.d = ei.b(var1 * 0.6662F) * 1.4F * var2;
   }
}
