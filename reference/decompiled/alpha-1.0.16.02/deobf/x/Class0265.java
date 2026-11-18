package x;

public class Class0265 extends Class0210 implements Class0161 {
   private Class0124[] a = new Class0124[3];
   private int b = 0;
   private int c = 0;
   private int d = 0;

   @Override
   public int a() {
      return this.a.length;
   }

   @Override
   public Class0124 a_(int var1) {
      return this.a[var1];
   }

   @Override
   public Class0124 a(int var1, int var2) {
      if (this.a[var1] != null) {
         if (this.a[var1].a <= var2) {
            Class0124 var4 = this.a[var1];
            this.a[var1] = null;
            return var4;
         }

         Class0124 var3 = this.a[var1].a(var2);
         if (this.a[var1].a == 0) {
            this.a[var1] = null;
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void a(int var1, Class0124 var2) {
      this.a[var1] = var2;
      if (var2 != null && var2.a > this.c()) {
         var2.a = this.c();
      }
   }

   @Override
   public String b() {
      return "Chest";
   }

   @Override
   public void a(Class0193 var1) {
      super.a(var1);
      Class0269 var2 = var1.l("Items");
      this.a = new Class0124[this.a()];

      for (int var3 = 0; var3 < var2.c(); var3++) {
         Class0193 var4 = (Class0193)var2.a(var3);
         byte var5 = var4.c("Slot");
         if (var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = new Class0124(var4);
         }
      }

      this.b = var1.d("BurnTime");
      this.d = var1.d("CookTime");
      this.c = this.a(this.a[1]);
   }

   @Override
   public void b(Class0193 var1) {
      super.b(var1);
      var1.a("BurnTime", (short)this.b);
      var1.a("CookTime", (short)this.d);
      Class0269 var2 = new Class0269();

      for (int var3 = 0; var3 < this.a.length; var3++) {
         if (this.a[var3] != null) {
            Class0193 var4 = new Class0193();
            var4.a("Slot", (byte)var3);
            this.a[var3].a(var4);
            var2.a(var4);
         }
      }

      var1.a("Items", var2);
   }

   @Override
   public int c() {
      return 64;
   }

   public int b(int var1) {
      return this.d * var1 / 200;
   }

   public int c(int var1) {
      if (this.c == 0) {
         this.c = 200;
      }

      return this.b * var1 / this.c;
   }

   public boolean g() {
      return this.b > 0;
   }

   @Override
   public void k_() {
      boolean var1 = this.b > 0;
      boolean var2 = false;
      if (this.b > 0) {
         this.b--;
         var2 = true;
      }

      if (this.b == 0 && this.i()) {
         this.c = this.b = this.a(this.a[1]);
         if (this.b > 0) {
            var2 = true;
            if (this.a[1] != null) {
               this.a[1].a--;
               if (this.a[1].a == 0) {
                  this.a[1] = null;
               }
            }
         }
      }

      if (this.g() && this.i()) {
         this.d++;
         if (this.d == 200) {
            this.d = 0;
            this.h();
            var2 = true;
         }
      } else {
         this.d = 0;
      }

      if (var1 != this.b > 0) {
         var2 = true;
         Class0281.a(this.b > 0, this.e, this.f, this.g, this.h);
      }

      if (var2) {
         this.e.n(this.f, this.g, this.h);
      }
   }

   private boolean i() {
      if (this.a[0] == null) {
         return false;
      } else {
         int var1 = this.d(this.a[0].a().aQ);
         if (var1 < 0) {
            return false;
         } else if (this.a[2] == null) {
            return true;
         } else if (this.a[2].c != var1) {
            return false;
         } else {
            return this.a[2].a < this.c() && this.a[2].a < this.a[2].c() ? true : this.a[2].a < Class0086.c[var1].b();
         }
      }
   }

   public void h() {
      if (this.i()) {
         int var1 = this.d(this.a[0].a().aQ);
         if (this.a[2] == null) {
            this.a[2] = new Class0124(var1, 1);
         } else if (this.a[2].c == var1) {
            this.a[2].a++;
         }

         this.a[0].a--;
         if (this.a[0].a <= 0) {
            this.a[0] = null;
         }
      }
   }

   private int d(int var1) {
      if (var1 == Class0312.H.ba) {
         return Class0086.m.aQ;
      } else if (var1 == Class0312.G.ba) {
         return Class0086.n.aQ;
      } else if (var1 == Class0312.aw.ba) {
         return Class0086.l.aQ;
      } else if (var1 == Class0312.E.ba) {
         return Class0312.M.ba;
      } else if (var1 == Class0086.ao.aQ) {
         return Class0086.ap.aQ;
      } else if (var1 == Class0312.w.ba) {
         return Class0312.t.ba;
      } else {
         return var1 == Class0086.aG.aQ ? Class0086.aF.aQ : -1;
      }
   }

   private int a(Class0124 var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = var1.a().aQ;
         if (var2 < 256 && Class0312.n[var2].bl == Class0155.c) {
            return 300;
         } else if (var2 == Class0086.B.aQ) {
            return 100;
         } else {
            return var2 == Class0086.k.aQ ? 1600 : 0;
         }
      }
   }

   @Override
   public void d() {
      this.e.n(this.f, this.g, this.h);
   }
}
