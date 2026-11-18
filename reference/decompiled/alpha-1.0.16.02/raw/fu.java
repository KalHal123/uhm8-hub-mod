public class fu extends li {
   private boolean[] e = new boolean[10];
   private fi f;

   public fu(fi var1) {
      this.f = var1;
   }

   @Override
   public void a(int var1, boolean var2) {
      byte var3 = -1;
      if (var1 == this.f.j.b) {
         var3 = 0;
      }

      if (var1 == this.f.l.b) {
         var3 = 1;
      }

      if (var1 == this.f.k.b) {
         var3 = 2;
      }

      if (var1 == this.f.m.b) {
         var3 = 3;
      }

      if (var1 == this.f.n.b) {
         var3 = 4;
      }

      if (var3 >= 0) {
         this.e[var3] = var2;
      }
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < 10; var1++) {
         this.e[var1] = false;
      }
   }

   @Override
   public void a(dg var1) {
      this.a = 0.0F;
      this.b = 0.0F;
      if (this.e[0]) {
         this.b++;
      }

      if (this.e[1]) {
         this.b--;
      }

      if (this.e[2]) {
         this.a++;
      }

      if (this.e[3]) {
         this.a--;
      }

      this.d = this.e[4];
   }
}
