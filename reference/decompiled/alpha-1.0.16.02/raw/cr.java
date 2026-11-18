public class cr extends ln {
   protected cr(int var1, int var2) {
      super(var1, var2, fs.c);
   }

   @Override
   public int a(int var1) {
      return this.aZ + (var1 == 1 ? 1 : 0);
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4, dg var5) {
      int var6 = var1.e(var2, var3, var4);
      if (var6 > 0) {
         this.e(var1, var2, var3, var4, var6);
         return true;
      } else {
         return false;
      }
   }

   public void e(cj var1, int var2, int var3, int var4, int var5) {
      var1.a((String)null, var2, var3, var4);
      var1.b(var2, var3, var4, 0);
      int var6 = dd.aO.aQ + var5 - 1;
      float var7 = 0.7F;
      double var8 = var1.m.nextFloat() * var7 + (1.0F - var7) * 0.5;
      double var10 = var1.m.nextFloat() * var7 + (1.0F - var7) * 0.2 + 0.6;
      double var12 = var1.m.nextFloat() * var7 + (1.0F - var7) * 0.5;
      dr var14 = new dr(var1, var2 + var8, var3 + var10, var4 + var12, new eo(var6));
      var14.c = 10;
      var1.a(var14);
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, int var5, float var6) {
      if (!var1.v) {
         if (var5 > 0) {
            this.e(var1, var2, var3, var4, var5);
         }

         super.a(var1, var2, var3, var4, var5, var6);
      }
   }
}
