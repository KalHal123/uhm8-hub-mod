import java.util.Random;

public class fn extends ln {
   protected fn(int var1, fs var2) {
      super(var1, var2);
      this.aZ = 97;
      if (var2 == fs.e) {
         this.aZ++;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   @Override
   public int a(int var1, int var2) {
      if (var1 != 0 && var1 != 1) {
         int var3 = this.c(var2);
         if ((var3 == 0 || var3 == 2) ^ var1 <= 3) {
            return this.aZ;
         }

         int var4 = var3 / 2 + (var1 & 1 ^ var3);
         var4 += (var2 & 4) / 4;
         int var5 = this.aZ - (var2 & 8) * 2;
         if ((var4 & 1) != 0) {
            var5 = -var5;
         }

         return var5;
      } else {
         return this.aZ;
      }
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public int f() {
      return 7;
   }

   @Override
   public cb f(cj var1, int var2, int var3, int var4) {
      this.a((mz)var1, var2, var3, var4);
      return super.f(var1, var2, var3, var4);
   }

   @Override
   public cb d(cj var1, int var2, int var3, int var4) {
      this.a((mz)var1, var2, var3, var4);
      return super.d(var1, var2, var3, var4);
   }

   @Override
   public void a(mz var1, int var2, int var3, int var4) {
      this.b(this.c(var1.e(var2, var3, var4)));
   }

   public void b(int var1) {
      float var2 = 0.1875F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      if (var1 == 0) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
      }

      if (var1 == 1) {
         this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 3) {
         this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
      }
   }

   @Override
   public void b(cj var1, int var2, int var3, int var4, dg var5) {
      this.a(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4, dg var5) {
      if (this.bl == fs.e) {
         return true;
      }

      int var6 = var1.e(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.a(var2, var3 - 1, var4) == this.ba) {
            this.a(var1, var2, var3 - 1, var4, var5);
         }

         return true;
      } else {
         if (var1.a(var2, var3 + 1, var4) == this.ba) {
            var1.b(var2, var3 + 1, var4, (var6 ^ 4) + 8);
         }

         var1.b(var2, var3, var4, var6 ^ 4);
         var1.b(var2, var3 - 1, var4, var2, var3, var4);
         if (Math.random() < 0.5) {
            var1.a(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_open", 1.0F, var1.m.nextFloat() * 0.1F + 0.9F);
         } else {
            var1.a(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_close", 1.0F, var1.m.nextFloat() * 0.1F + 0.9F);
         }

         return true;
      }
   }

   public void a(cj var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.e(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.a(var2, var3 - 1, var4) == this.ba) {
            this.a(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = (var1.e(var2, var3, var4) & 4) > 0;
         if (var7 != var5) {
            if (var1.a(var2, var3 + 1, var4) == this.ba) {
               var1.b(var2, var3 + 1, var4, (var6 ^ 4) + 8);
            }

            var1.b(var2, var3, var4, var6 ^ 4);
            var1.b(var2, var3 - 1, var4, var2, var3, var4);
            if (Math.random() < 0.5) {
               var1.a(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_open", 1.0F, var1.m.nextFloat() * 0.1F + 0.9F);
            } else {
               var1.a(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_close", 1.0F, var1.m.nextFloat() * 0.1F + 0.9F);
            }
         }
      }
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.a(var2, var3 - 1, var4) != this.ba) {
            var1.d(var2, var3, var4, 0);
         }

         if (var5 > 0 && ln.n[var5].d()) {
            this.a(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = false;
         if (var1.a(var2, var3 + 1, var4) != this.ba) {
            var1.d(var2, var3, var4, 0);
            var7 = true;
         }

         if (!var1.g(var2, var3 - 1, var4)) {
            var1.d(var2, var3, var4, 0);
            var7 = true;
            if (var1.a(var2, var3 + 1, var4) == this.ba) {
               var1.d(var2, var3 + 1, var4, 0);
            }
         }

         if (var7) {
            this.b_(var1, var2, var3, var4, var6);
         } else if (var5 > 0 && ln.n[var5].d()) {
            boolean var8 = var1.p(var2, var3, var4) || var1.p(var2, var3 + 1, var4);
            this.a(var1, var2, var3, var4, var8);
         }
      }
   }

   @Override
   public int a(int var1, Random var2) {
      if ((var1 & 8) != 0) {
         return 0;
      } else {
         return this.bl == fs.e ? dd.az.aQ : dd.at.aQ;
      }
   }

   @Override
   public lv a(cj var1, int var2, int var3, int var4, ah var5, ah var6) {
      this.a((mz)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public int c(int var1) {
      return (var1 & 4) == 0 ? var1 - 1 & 3 : var1 & 3;
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4) {
      return var3 >= 127 ? false : var1.g(var2, var3 - 1, var4) && super.a(var1, var2, var3, var4) && super.a(var1, var2, var3 + 1, var4);
   }
}
