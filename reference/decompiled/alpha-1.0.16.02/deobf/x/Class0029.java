package x;

public class Class0029 extends Class0210 {
   public int a = -1;
   public String b;
   public double c;
   public double d = 0.0;

   public Class0029() {
      this.b = "Pig";
      this.a = 20;
   }

   public boolean a() {
      return this.e.a(this.f + 0.5, this.g + 0.5, this.h + 0.5, 16.0) != null;
   }

   @Override
   public void k_() {
      this.d = this.c;
      if (this.a()) {
         double var1 = this.f + this.e.m.nextFloat();
         double var3 = this.g + this.e.m.nextFloat();
         double var5 = this.h + this.e.m.nextFloat();
         this.e.a("smoke", var1, var3, var5, 0.0, 0.0, 0.0);
         this.e.a("flame", var1, var3, var5, 0.0, 0.0, 0.0);

         for (this.c = this.c + 1000.0F / (this.a + 200.0F); this.c > 360.0; this.d -= 360.0) {
            this.c -= 360.0;
         }

         if (this.a == -1) {
            this.c();
         }

         if (this.a > 0) {
            this.a--;
         } else {
            byte var7 = 4;

            for (int var8 = 0; var8 < var7; var8++) {
               Class0158 var9 = (Class0158)Class0125.a(this.b, this.e);
               if (var9 == null) {
                  return;
               }

               int var10 = this.e.a(var9.getClass(), Class0057.b(this.f, this.g, this.h, this.f + 1, this.g + 1, this.h + 1).b(8.0, 4.0, 8.0)).size();
               if (var10 >= 6) {
                  this.c();
                  return;
               }

               if (var9 != null) {
                  double var11 = this.f + (this.e.m.nextDouble() - this.e.m.nextDouble()) * 4.0;
                  double var13 = this.g + this.e.m.nextInt(3) - 1;
                  double var15 = this.h + (this.e.m.nextDouble() - this.e.m.nextDouble()) * 4.0;
                  var9.c(var11, var13, var15, this.e.m.nextFloat() * 360.0F, 0.0F);
                  if (var9.a()) {
                     this.e.a(var9);

                     for (int var17 = 0; var17 < 20; var17++) {
                        var1 = this.f + 0.5 + (this.e.m.nextFloat() - 0.5) * 2.0;
                        var3 = this.g + 0.5 + (this.e.m.nextFloat() - 0.5) * 2.0;
                        var5 = this.h + 0.5 + (this.e.m.nextFloat() - 0.5) * 2.0;
                        this.e.a("smoke", var1, var3, var5, 0.0, 0.0, 0.0);
                        this.e.a("flame", var1, var3, var5, 0.0, 0.0, 0.0);
                     }

                     var9.x();
                     this.c();
                  }
               }
            }

            super.k_();
         }
      }
   }

   private void c() {
      this.a = 200 + this.e.m.nextInt(600);
   }

   @Override
   public void a(Class0193 var1) {
      super.a(var1);
      this.b = var1.i("EntityId");
      this.a = var1.d("Delay");
   }

   @Override
   public void b(Class0193 var1) {
      super.b(var1);
      var1.a("EntityId", this.b);
      var1.a("Delay", (short)this.a);
   }
}
