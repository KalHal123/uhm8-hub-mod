public class lu extends dd {
   public lu(int var1) {
      super(var1);
      this.aR = 1;
   }

   @Override
   public eo a(eo var1, cj var2, dg var3) {
      float var4 = 1.0F;
      float var5 = var3.aq + (var3.ao - var3.aq) * var4;
      float var6 = var3.ap + (var3.an - var3.ap) * var4;
      double var7 = var3.ae + (var3.ah - var3.ae) * var4;
      double var9 = var3.af + (var3.ai - var3.af) * var4;
      double var11 = var3.ag + (var3.aj - var3.ag) * var4;
      ah var13 = ah.b(var7, var9, var11);
      float var14 = ei.b(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var15 = ei.a(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var16 = -ei.b(-var5 * (float) (Math.PI / 180.0));
      float var17 = ei.a(-var5 * (float) (Math.PI / 180.0));
      float var18 = var15 * var16;
      float var19 = var17;
      float var20 = var14 * var16;
      double var21 = 5.0;
      ah var23 = var13.c(var18 * var21, var19 * var21, var20 * var21);
      lv var24 = var2.a(var13, var23, true);
      if (var24 == null) {
         return var1;
      }

      if (var24.a == 0) {
         int var25 = var24.b;
         int var26 = var24.c;
         int var27 = var24.d;
         var2.a(new cx(var2, var25 + 0.5F, var26 + 1.5F, var27 + 0.5F));
         var1.a--;
      }

      return var1;
   }
}
