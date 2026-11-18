package x;

import java.util.ArrayList;
import java.util.List;

public class Class0237 extends Class0268 {
   private int c = 0;
   public int a = 0;
   private int d;
   private int e;
   private int f;
   public Class0121 b;

   public Class0237(Class0065 var1) {
      super(var1);
      this.ay = 0.0F;
      this.a(0.5F, 0.5F);
   }

   public Class0237(Class0065 var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.d = var2;
      this.e = var3;
      this.f = var4;
      ArrayList var6 = new ArrayList();

      for (Class0121 var10 : Class0121.values()) {
         this.b = var10;
         this.b(var5);
         if (this.i()) {
            var6.add(var10);
         }
      }

      if (var6.size() > 0) {
         this.b = (Class0121)var6.get(this.aN.nextInt(var6.size()));
      }

      this.b(var5);
   }

   public void b(int var1) {
      this.a = var1;
      this.ap = this.an = var1 * 90;
      float var2 = this.b.u;
      float var3 = this.b.v;
      float var4 = this.b.u;
      if (var1 != 0 && var1 != 2) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = this.d + 0.5F;
      float var6 = this.e + 0.5F;
      float var7 = this.f + 0.5F;
      float var8 = 0.5625F;
      if (var1 == 0) {
         var7 -= var8;
      }

      if (var1 == 1) {
         var5 -= var8;
      }

      if (var1 == 2) {
         var7 += var8;
      }

      if (var1 == 3) {
         var5 += var8;
      }

      if (var1 == 0) {
         var5 -= this.c(this.b.u);
      }

      if (var1 == 1) {
         var7 += this.c(this.b.u);
      }

      if (var1 == 2) {
         var5 += this.c(this.b.u);
      }

      if (var1 == 3) {
         var7 -= this.c(this.b.u);
      }

      var6 += this.c(this.b.v);
      this.a((double)var5, (double)var6, (double)var7);
      float var9 = -0.00625F;
      this.ar.c(var5 - var2 - var9, var6 - var3 - var9, var7 - var4 - var9, var5 + var2 + var9, var6 + var3 + var9, var7 + var4 + var9);
   }

   private float c(int var1) {
      if (var1 == 32) {
         return 0.5F;
      } else {
         return var1 == 64 ? 0.5F : 0.0F;
      }
   }

   @Override
   public void e_() {
      if (this.c++ == 100 && !this.i()) {
         this.c = 0;
         this.D();
         this.ad.a(new Class0100(this.ad, this.ah, this.ai, this.aj, new Class0124(Class0086.aq)));
      }
   }

   public boolean i() {
      if (this.ad.a(this, this.ar).size() > 0) {
         return false;
      }

      int var1 = this.b.u / 16;
      int var2 = this.b.v / 16;
      int var3 = this.d;
      int var4 = this.e;
      int var5 = this.f;
      if (this.a == 0) {
         var3 = Class0118.b(this.ah - this.b.u / 32.0F);
      }

      if (this.a == 1) {
         var5 = Class0118.b(this.aj - this.b.u / 32.0F);
      }

      if (this.a == 2) {
         var3 = Class0118.b(this.ah - this.b.u / 32.0F);
      }

      if (this.a == 3) {
         var5 = Class0118.b(this.aj - this.b.u / 32.0F);
      }

      var4 = Class0118.b(this.ai - this.b.v / 32.0F);

      for (int var6 = 0; var6 < var1; var6++) {
         for (int var7 = 0; var7 < var2; var7++) {
            Class0155 var8;
            if (this.a != 0 && this.a != 2) {
               var8 = this.ad.f(this.d, var4 + var7, var5 + var6);
            } else {
               var8 = this.ad.f(var3 + var6, var4 + var7, this.f);
            }

            if (!var8.a()) {
               return false;
            }
         }
      }

      List var10 = this.ad.b(this, this.ar);

      for (int var11 = 0; var11 < var10.size(); var11++) {
         if (var10.get(var11) instanceof Class0237) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean c_() {
      return true;
   }

   @Override
   public boolean a(Class0268 var1, int var2) {
      this.D();
      this.ad.a(new Class0100(this.ad, this.ah, this.ai, this.aj, new Class0124(Class0086.aq)));
      return true;
   }

   @Override
   public void a(Class0193 var1) {
      var1.a("Dir", (byte)this.a);
      var1.a("Motive", this.b.t);
      var1.a("TileX", this.d);
      var1.a("TileY", this.e);
      var1.a("TileZ", this.f);
   }

   @Override
   public void b(Class0193 var1) {
      this.a = var1.c("Dir");
      this.d = var1.e("TileX");
      this.e = var1.e("TileY");
      this.f = var1.e("TileZ");
      String var2 = var1.i("Motive");

      for (Class0121 var6 : Class0121.values()) {
         if (var6.t.equals(var2)) {
            this.b = var6;
         }
      }

      if (this.b == null) {
         this.b = Class0121.a;
      }

      this.b(this.a);
   }
}
