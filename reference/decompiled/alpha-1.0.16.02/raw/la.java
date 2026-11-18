public class la {
   public dx[] a;
   public int b = 0;
   private boolean c = false;

   public la(dx[] var1) {
      this.a = var1;
      this.b = var1.length;
   }

   public la(dx[] var1, int var2, int var3, int var4, int var5) {
      this(var1);
      float var6 = 0.0015625F;
      float var7 = 0.003125F;
      var1[0] = var1[0].a(var4 / 64.0F - var6, var3 / 32.0F + var7);
      var1[1] = var1[1].a(var2 / 64.0F + var6, var3 / 32.0F + var7);
      var1[2] = var1[2].a(var2 / 64.0F + var6, var5 / 32.0F - var7);
      var1[3] = var1[3].a(var4 / 64.0F - var6, var5 / 32.0F - var7);
   }

   public void a() {
      dx[] var1 = new dx[this.a.length];

      for (int var2 = 0; var2 < this.a.length; var2++) {
         var1[var2] = this.a[this.a.length - var2 - 1];
      }

      this.a = var1;
   }

   public void a(he var1, float var2) {
      ah var3 = this.a[1].a.a(this.a[0].a);
      ah var4 = this.a[1].a.a(this.a[2].a);
      ah var5 = var4.b(var3).b();
      var1.b();
      if (this.c) {
         var1.b(-((float)var5.a), -((float)var5.b), -((float)var5.c));
      } else {
         var1.b((float)var5.a, (float)var5.b, (float)var5.c);
      }

      for (int var6 = 0; var6 < 4; var6++) {
         dx var7 = this.a[var6];
         var1.a((float)var7.a.a * var2, (float)var7.a.b * var2, (float)var7.a.c * var2, var7.b, var7.c);
      }

      var1.a();
   }
}
