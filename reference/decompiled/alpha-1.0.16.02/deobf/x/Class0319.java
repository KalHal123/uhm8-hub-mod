package x;

public class Class0319 extends Class0086 {
   public Class0319(int var1) {
      super(var1);
      this.aR = 1;
   }

   @Override
   public Class0124 a(Class0124 var1, Class0065 var2, Class0089 var3) {
      float var4 = 1.0F;
      float var5 = var3.aq + (var3.ao - var3.aq) * var4;
      float var6 = var3.ap + (var3.an - var3.ap) * var4;
      double var7 = var3.ae + (var3.ah - var3.ae) * var4;
      double var9 = var3.af + (var3.ai - var3.af) * var4;
      double var11 = var3.ag + (var3.aj - var3.ag) * var4;
      Class0009 var13 = Class0009.b(var7, var9, var11);
      float var14 = Class0118.b(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var15 = Class0118.a(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var16 = -Class0118.b(-var5 * (float) (Math.PI / 180.0));
      float var17 = Class0118.a(-var5 * (float) (Math.PI / 180.0));
      float var18 = var15 * var16;
      float var19 = var17;
      float var20 = var14 * var16;
      double var21 = 5.0;
      Class0009 var23 = var13.c(var18 * var21, var19 * var21, var20 * var21);
      Class0320 var24 = var2.a(var13, var23, true);
      if (var24 == null) {
         return var1;
      }

      if (var24.a == 0) {
         int var25 = var24.b;
         int var26 = var24.c;
         int var27 = var24.d;
         var2.a(new Class0079(var2, var25 + 0.5F, var26 + 1.5F, var27 + 0.5F));
         var1.a--;
      }

      return var1;
   }
}
