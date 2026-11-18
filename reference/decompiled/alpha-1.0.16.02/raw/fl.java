public class fl extends dd {
   public fl(int var1, int var2) {
      super(var1);
      this.aR = 1;
      this.aS = 32 << var2;
   }

   @Override
   public boolean a(eo var1, dg var2, cj var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      fs var9 = var3.f(var4, var5 + 1, var6);
      if ((var9.a() || var8 != ln.u.ba) && var8 != ln.v.ba) {
         return false;
      }

      ln var10 = ln.aA;
      var3.a(var4 + 0.5F, var5 + 0.5F, var6 + 0.5F, var10.bj.d(), (var10.bj.b() + 1.0F) / 2.0F, var10.bj.c() * 0.8F);
      var3.d(var4, var5, var6, var10.ba);
      var1.b(1);
      if (var3.m.nextInt(8) == 0 && var8 == ln.u.ba) {
         byte var11 = 1;

         for (int var12 = 0; var12 < var11; var12++) {
            float var13 = 0.7F;
            float var14 = var3.m.nextFloat() * var13 + (1.0F - var13) * 0.5F;
            float var15 = 1.2F;
            float var16 = var3.m.nextFloat() * var13 + (1.0F - var13) * 0.5F;
            dr var17 = new dr(var3, var4 + var14, var5 + var15, var6 + var16, new eo(dd.Q));
            var17.c = 10;
            var3.a(var17);
         }
      }

      return true;
   }

   @Override
   public boolean a() {
      return true;
   }
}
