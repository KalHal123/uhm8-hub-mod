package ext;

import org.lwjgl.opengl.GL11;

public class Class388 extends Class45 {
   private Class359 field_313;
   private Class359 field_1971;
   private int field_1317 = 0;
   private int field_915 = 0;
   private float field_2392;

   public Class388(Class454 var1, Class359 var2, Class359 var3, float var4) {
      super(var1, var2.field_1417, var2.field_2654, var2.field_2013, var2.field_2549, var2.field_2501, var2.field_489);
      this.field_313 = var2;
      this.field_1971 = var3;
      this.field_915 = 3;
      this.field_2392 = var4;
   }

   @Override
   public void method_813(Class368 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.field_1317 + var2) / this.field_915;
      var8 *= var8;
      double var9 = this.field_313.field_1417;
      double var11 = this.field_313.field_2654;
      double var13 = this.field_313.field_2013;
      double var15 = this.field_1971.field_2173 + (this.field_1971.field_1417 - this.field_1971.field_2173) * var2;
      double var17 = this.field_1971.field_2270 + (this.field_1971.field_2654 - this.field_1971.field_2270) * var2 + this.field_2392;
      double var19 = this.field_1971.field_1907 + (this.field_1971.field_2013 - this.field_1971.field_1907) * var2;
      double var21 = var9 + (var15 - var9) * var8;
      double var23 = var11 + (var17 - var11) * var8;
      double var25 = var13 + (var19 - var13) * var8;
      int var27 = Class469.method_468(var21);
      int var28 = Class469.method_468(var23 + this.field_838 / 2.0F);
      int var29 = Class469.method_468(var25);
      float var30 = this.field_1468.method_1154(var27, var28, var29);
      var21 -= field_2725;
      var23 -= field_1939;
      var25 -= field_1993;
      GL11.glColor4f(var30, var30, var30, 1.0F);
      Class531.field_759.method_521(this.field_313, (float)var21, (float)var23, (float)var25, this.field_313.field_1661, var2);
   }

   @Override
   public void method_46() {
      this.field_1317++;
      if (this.field_1317 == this.field_915) {
         this.method_1594();
      }
   }

   @Override
   public int method_1506() {
      return 3;
   }
}
