public class en implements fy {
   public eo[] a = new eo[36];
   public eo[] b = new eo[4];
   public eo[] c = new eo[4];
   public int d = 0;
   private dg e;

   public en(dg var1) {
      this.e = var1;
   }

   public eo e() {
      return this.a[this.d];
   }

   private int f(int var1) {
      for (int var2 = 0; var2 < this.a.length; var2++) {
         if (this.a[var2] != null && this.a[var2].c == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int g(int var1) {
      for (int var2 = 0; var2 < this.a.length; var2++) {
         if (this.a[var2] != null && this.a[var2].c == var1 && this.a[var2].a < this.a[var2].c() && this.a[var2].a < this.c()) {
            return var2;
         }
      }

      return -1;
   }

   private int i() {
      for (int var1 = 0; var1 < this.a.length; var1++) {
         if (this.a[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   public void a(int var1, boolean var2) {
      int var3 = this.f(var1);
      if (var3 >= 0 && var3 < 9) {
         this.d = var3;
      }
   }

   public void b(int var1) {
      if (var1 > 0) {
         var1 = 1;
      }

      if (var1 < 0) {
         var1 = -1;
      }

      this.d -= var1;

      while (this.d < 0) {
         this.d += 9;
      }

      while (this.d >= 9) {
         this.d -= 9;
      }
   }

   private int b(int var1, int var2) {
      int var3 = this.g(var1);
      if (var3 < 0) {
         var3 = this.i();
      }

      if (var3 < 0) {
         return var2;
      }

      if (this.a[var3] == null) {
         this.a[var3] = new eo(var1, 0);
      }

      int var4 = var2;
      if (var4 > this.a[var3].c() - this.a[var3].a) {
         var4 = this.a[var3].c() - this.a[var3].a;
      }

      if (var4 > this.c() - this.a[var3].a) {
         var4 = this.c() - this.a[var3].a;
      }

      if (var4 == 0) {
         return var2;
      }

      var2 -= var4;
      this.a[var3].a += var4;
      this.a[var3].b = 5;
      return var2;
   }

   public void f() {
      for (int var1 = 0; var1 < this.a.length; var1++) {
         if (this.a[var1] != null && this.a[var1].b > 0) {
            this.a[var1].b--;
         }
      }
   }

   public boolean c(int var1) {
      int var2 = this.f(var1);
      if (var2 < 0) {
         return false;
      }

      if (--this.a[var2].a <= 0) {
         this.a[var2] = null;
      }

      return true;
   }

   public boolean a(eo var1) {
      if (var1.d == 0) {
         var1.a = this.b(var1.c, var1.a);
         if (var1.a == 0) {
            return true;
         }
      }

      int var2 = this.i();
      if (var2 >= 0) {
         this.a[var2] = var1;
         this.a[var2].b = 5;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public eo a(int var1, int var2) {
      eo[] var3 = this.a;
      if (var1 >= this.a.length) {
         var3 = this.b;
         var1 -= this.a.length;
      }

      if (var3[var1] != null) {
         if (var3[var1].a <= var2) {
            eo var5 = var3[var1];
            var3[var1] = null;
            return var5;
         }

         eo var4 = var3[var1].a(var2);
         if (var3[var1].a == 0) {
            var3[var1] = null;
         }

         return var4;
      } else {
         return null;
      }
   }

   @Override
   public void a(int var1, eo var2) {
      eo[] var3 = this.a;
      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.b;
      }

      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.c;
      }

      var3[var1] = var2;
   }

   public float a(ln var1) {
      float var2 = 1.0F;
      if (this.a[this.d] != null) {
         var2 *= this.a[this.d].a(var1);
      }

      return var2;
   }

   public jy a(jy var1) {
      for (int var2 = 0; var2 < this.a.length; var2++) {
         if (this.a[var2] != null) {
            hc var3 = new hc();
            var3.a("Slot", (byte)var2);
            this.a[var2].a(var3);
            var1.a(var3);
         }
      }

      for (int var4 = 0; var4 < this.b.length; var4++) {
         if (this.b[var4] != null) {
            hc var6 = new hc();
            var6.a("Slot", (byte)(var4 + 100));
            this.b[var4].a(var6);
            var1.a(var6);
         }
      }

      for (int var5 = 0; var5 < this.c.length; var5++) {
         if (this.c[var5] != null) {
            hc var7 = new hc();
            var7.a("Slot", (byte)(var5 + 80));
            this.c[var5].a(var7);
            var1.a(var7);
         }
      }

      return var1;
   }

   public void b(jy var1) {
      this.a = new eo[36];
      this.b = new eo[4];
      this.c = new eo[4];

      for (int var2 = 0; var2 < var1.c(); var2++) {
         hc var3 = (hc)var1.a(var2);
         int var4 = var3.c("Slot") & 255;
         if (var4 >= 0 && var4 < this.a.length) {
            this.a[var4] = new eo(var3);
         }

         if (var4 >= 80 && var4 < this.c.length + 80) {
            this.c[var4 - 80] = new eo(var3);
         }

         if (var4 >= 100 && var4 < this.b.length + 100) {
            this.b[var4 - 100] = new eo(var3);
         }
      }
   }

   @Override
   public int a() {
      return this.a.length + 4;
   }

   @Override
   public eo a_(int var1) {
      eo[] var2 = this.a;
      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.b;
      }

      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.c;
      }

      return var2[var1];
   }

   @Override
   public String b() {
      return "Inventory";
   }

   @Override
   public int c() {
      return 64;
   }

   public int a(jx var1) {
      eo var2 = this.a_(this.d);
      return var2 != null ? var2.a(var1) : 1;
   }

   public boolean b(ln var1) {
      if (var1.bl != fs.d && var1.bl != fs.e && var1.bl != fs.t && var1.bl != fs.s) {
         return true;
      }

      eo var2 = this.a_(this.d);
      return var2 != null ? var2.b(var1) : false;
   }

   public eo d(int var1) {
      return this.b[var1];
   }

   public int g() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;

      for (int var4 = 0; var4 < this.b.length; var4++) {
         if (this.b[var4] != null && this.b[var4].a() instanceof mf) {
            int var5 = this.b[var4].d();
            int var6 = this.b[var4].d;
            int var7 = var5 - var6;
            var2 += var7;
            var3 += var5;
            int var8 = ((mf)this.b[var4].a()).aW;
            var1 += var8;
         }
      }

      return var3 == 0 ? 0 : (var1 - 1) * var2 / var3 + 1;
   }

   public void e(int var1) {
      for (int var2 = 0; var2 < this.b.length; var2++) {
         if (this.b[var2] != null && this.b[var2].a() instanceof mf) {
            this.b[var2].b(var1);
            if (this.b[var2].a == 0) {
               this.b[var2].a(this.e);
               this.b[var2] = null;
            }
         }
      }
   }

   public void h() {
      for (int var1 = 0; var1 < this.a.length; var1++) {
         if (this.a[var1] != null) {
            this.e.a(this.a[var1], true);
            this.a[var1] = null;
         }
      }

      for (int var2 = 0; var2 < this.b.length; var2++) {
         if (this.b[var2] != null) {
            this.e.a(this.b[var2], true);
            this.b[var2] = null;
         }
      }
   }

   @Override
   public void d() {
   }
}
