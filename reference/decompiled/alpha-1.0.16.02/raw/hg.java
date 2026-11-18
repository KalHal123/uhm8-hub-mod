import net.minecraft.client.Minecraft;

public class hg {
   protected final Minecraft a;
   public boolean b = false;

   public hg(Minecraft var1) {
      this.a = var1;
   }

   public void a() {
   }

   public void a(cj var1) {
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4);
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      this.a.h.a(var1, var2, var3);
      cj var5 = this.a.e;
      ln var6 = ln.n[var5.a(var1, var2, var3)];
      int var7 = var5.e(var1, var2, var3);
      boolean var8 = var5.d(var1, var2, var3, 0);
      if (var6 != null && var8) {
         this.a.A.b(var6.bj.a(), var1 + 0.5F, var2 + 0.5F, var3 + 0.5F, (var6.bj.b() + 1.0F) / 2.0F, var6.bj.c() * 0.8F);
         var6.b(var5, var1, var2, var3, var7);
      }

      return var8;
   }

   public void c(int var1, int var2, int var3, int var4) {
   }

   public void b() {
   }

   public void a(float var1) {
   }

   public float c() {
      return 5.0F;
   }

   public void a(dg var1) {
   }

   public void d() {
   }

   public boolean e() {
      return true;
   }

   public void b(dg var1) {
   }

   public boolean a(dg var1, cj var2, eo var3, int var4, int var5, int var6, int var7) {
      return var3.a(var1, var2, var4, var5, var6, var7);
   }

   public dg b(cj var1) {
      return new be(this.a, var1, this.a.i);
   }
}
