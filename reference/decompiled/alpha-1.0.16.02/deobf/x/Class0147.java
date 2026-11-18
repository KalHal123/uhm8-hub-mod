package x;

import java.io.IOException;

public class Class0147 implements Class0020 {
   private Class0154 c;
   private Class0020 d;
   private Class0005 e;
   private Class0154[] f = new Class0154[1024];
   private Class0065 g;
   int a = -999999999;
   int b = -999999999;
   private Class0154 h;

   public Class0147(Class0065 var1, Class0005 var2, Class0020 var3) {
      this.c = new Class0154(var1, new byte[32768], 0, 0);
      this.c.q = true;
      this.c.p = true;
      this.g = var1;
      this.e = var2;
      this.d = var3;
   }

   @Override
   public boolean a(int var1, int var2) {
      if (var1 == this.a && var2 == this.b && this.h != null) {
         return true;
      }

      int var3 = var1 & 31;
      int var4 = var2 & 31;
      int var5 = var3 + var4 * 32;
      return this.f[var5] != null && (this.f[var5] == this.c || this.f[var5].a(var1, var2));
   }

   @Override
   public Class0154 b(int var1, int var2) {
      if (var1 == this.a && var2 == this.b && this.h != null) {
         return this.h;
      }

      int var3 = var1 & 31;
      int var4 = var2 & 31;
      int var5 = var3 + var4 * 32;
      if (!this.a(var1, var2)) {
         if (this.f[var5] != null) {
            this.f[var5].e();
            this.b(this.f[var5]);
            this.a(this.f[var5]);
         }

         Class0154 var6 = this.c(var1, var2);
         if (var6 == null) {
            if (this.d == null) {
               var6 = this.c;
            } else {
               var6 = this.d.b(var1, var2);
            }
         }

         this.f[var5] = var6;
         if (this.f[var5] != null) {
            this.f[var5].d();
         }

         if (!this.f[var5].n && this.a(var1 + 1, var2 + 1) && this.a(var1, var2 + 1) && this.a(var1 + 1, var2)) {
            this.a(this, var1, var2);
         }

         if (this.a(var1 - 1, var2) && !this.b(var1 - 1, var2).n && this.a(var1 - 1, var2 + 1) && this.a(var1, var2 + 1) && this.a(var1 - 1, var2)) {
            this.a(this, var1 - 1, var2);
         }

         if (this.a(var1, var2 - 1) && !this.b(var1, var2 - 1).n && this.a(var1 + 1, var2 - 1) && this.a(var1, var2 - 1) && this.a(var1 + 1, var2)) {
            this.a(this, var1, var2 - 1);
         }

         if (this.a(var1 - 1, var2 - 1) && !this.b(var1 - 1, var2 - 1).n && this.a(var1 - 1, var2 - 1) && this.a(var1, var2 - 1) && this.a(var1 - 1, var2)) {
            this.a(this, var1 - 1, var2 - 1);
         }
      }

      this.a = var1;
      this.b = var2;
      this.h = this.f[var5];
      return this.f[var5];
   }

   private Class0154 c(int var1, int var2) {
      if (this.e == null) {
         return null;
      }

      try {
         Class0154 var3 = this.e.a(this.g, var1, var2);
         if (var3 != null) {
            var3.s = this.g.c;
         }

         return var3;
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private void a(Class0154 var1) {
      if (this.e != null) {
         try {
            this.e.b(this.g, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }

   private void b(Class0154 var1) {
      if (this.e != null) {
         try {
            var1.s = this.g.c;
            this.e.a(this.g, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   @Override
   public void a(Class0020 var1, int var2, int var3) {
      Class0154 var4 = this.b(var2, var3);
      if (!var4.n) {
         var4.n = true;
         if (this.d != null) {
            this.d.a(var1, var2, var3);
            var4.f();
         }
      }
   }

   @Override
   public boolean a(boolean var1, Class0360 var2) {
      int var3 = 0;
      int var4 = 0;
      if (var2 != null) {
         for (int var5 = 0; var5 < this.f.length; var5++) {
            if (this.f[var5] != null && this.f[var5].a(var1)) {
               var4++;
            }
         }
      }

      int var7 = 0;

      for (int var6 = 0; var6 < this.f.length; var6++) {
         if (this.f[var6] != null) {
            if (var1 && !this.f[var6].p) {
               this.a(this.f[var6]);
            }

            if (this.f[var6].a(var1)) {
               this.b(this.f[var6]);
               this.f[var6].o = false;
               if (++var3 == 2 && !var1) {
                  return false;
               }

               if (var2 != null) {
                  if (++var7 % 10 == 0) {
                     var2.a(var7 * 100 / var4);
                  }
               }
            }
         }
      }

      if (var1) {
         if (this.e == null) {
            return true;
         }

         this.e.b();
      }

      return true;
   }

   @Override
   public boolean a() {
      if (this.e != null) {
         this.e.a();
      }

      return this.d.a();
   }

   @Override
   public boolean b() {
      return true;
   }
}
