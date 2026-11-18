package x;

import net.minecraft.client.Minecraft;

public class Class0206 extends Class0197 {
   private int c = -1;
   private int d = -1;
   private int e = -1;
   private float f = 0.0F;
   private float g = 0.0F;
   private float h = 0.0F;
   private int i = 0;
   private Class0023 j = new Class0298(
      this, 200, Class0066.class, new Class[]{Class0316.class, Class0074.class, Class0080.class, Class0021.class, Class0315.class}
   );
   private Class0023 k = new Class0023(20, Class0006.class, new Class[]{Class0039.class, Class0335.class, Class0012.class, Class0338.class});

   public Class0206(Minecraft var1) {
      super(var1);
   }

   @Override
   public void a(Class0089 var1) {
      var1.an = -180.0F;
   }

   @Override
   public void a() {
   }

   @Override
   public boolean b(int var1, int var2, int var3, int var4) {
      int var5 = this.a.e.a(var1, var2, var3);
      int var6 = this.a.e.e(var1, var2, var3);
      boolean var7 = super.b(var1, var2, var3, var4);
      Class0124 var8 = this.a.g.r();
      boolean var9 = this.a.g.b(Class0312.n[var5]);
      if (var8 != null) {
         var8.a(var5, var1, var2, var3);
         if (var8.a == 0) {
            var8.a(this.a.g);
            this.a.g.s();
         }
      }

      if (var7 && var9) {
         Class0312.n[var5].a_(this.a.e, var1, var2, var3, var6);
      }

      return var7;
   }

   @Override
   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.a.e.a(var1, var2, var3);
      if (var5 > 0 && this.f == 0.0F) {
         Class0312.n[var5].b(this.a.e, var1, var2, var3, this.a.g);
      }

      if (var5 > 0 && Class0312.n[var5].a(this.a.g) >= 1.0F) {
         this.b(var1, var2, var3, var4);
      }
   }

   @Override
   public void b() {
      this.f = 0.0F;
      this.i = 0;
   }

   @Override
   public void c(int var1, int var2, int var3, int var4) {
      if (this.i > 0) {
         this.i--;
      } else {
         if (var1 == this.c && var2 == this.d && var3 == this.e) {
            int var5 = this.a.e.a(var1, var2, var3);
            if (var5 == 0) {
               return;
            }

            Class0312 var6 = Class0312.n[var5];
            this.f = this.f + var6.a(this.a.g);
            if (this.h % 4.0F == 0.0F && var6 != null) {
               this.a.A.b(var6.bj.d(), var1 + 0.5F, var2 + 0.5F, var3 + 0.5F, (var6.bj.b() + 1.0F) / 8.0F, var6.bj.c() * 0.5F);
            }

            this.h++;
            if (this.f >= 1.0F) {
               this.b(var1, var2, var3, var4);
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 0.0F;
               this.i = 5;
            }
         } else {
            this.f = 0.0F;
            this.g = 0.0F;
            this.h = 0.0F;
            this.c = var1;
            this.d = var2;
            this.e = var3;
         }
      }
   }

   @Override
   public void a(float var1) {
      if (this.f <= 0.0F) {
         this.a.u.b = 0.0F;
         this.a.f.i = 0.0F;
      } else {
         float var2 = this.g + (this.f - this.g) * var1;
         this.a.u.b = var2;
         this.a.f.i = var2;
      }
   }

   @Override
   public float c() {
      return 4.0F;
   }

   @Override
   public void a(Class0065 var1) {
      super.a(var1);
   }

   @Override
   public void d() {
      this.g = this.f;
      this.j.a(this.a.e);
      this.k.a(this.a.e);
      this.a.A.c();
   }
}
