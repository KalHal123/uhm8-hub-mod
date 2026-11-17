package ext;

import org.lwjgl.opengl.GL11;

public class Class223 extends Class591 {
   private Class567 field_224 = (Class567)this.field_2329;
   private Class567 field_507 = new Class567(1.0F);
   private Class567 field_1510 = new Class567(0.5F);
   private static final String[] field_124 = new String[]{"cloth", "chain", "iron", "diamond", "gold", "obsidian", "fashion", "stylish"};
   public Class736 field_2486 = null;

   public Class223() {
      super(new Class567(0.0F), 0.5F);
   }

   protected boolean method_1329(Class354 var1, int var2) {
      Class334 var3 = var1.field_559.method_1047(3 - var2);
      if (var3 != null) {
         Class755 var4 = var3.method_801();
         if (var4 instanceof Class725) {
            Class725 var5 = (Class725)var4;
            this.method_1261("/armor/" + field_124[var5.field_409] + "_" + (var2 == 2 ? 2 : 1) + ".png");
            Class567 var6 = var2 == 2 ? this.field_1510 : this.field_507;
            var6.field_2901.field_597 = var2 == 0;
            var6.field_2833.field_597 = var2 == 0;
            var6.field_1037.field_597 = var2 == 1 || var2 == 2;
            var6.field_909.field_597 = var2 == 1;
            var6.field_2163.field_597 = var2 == 1;
            var6.field_2781.field_597 = var2 == 2 || var2 == 3;
            var6.field_433.field_597 = var2 == 2 || var2 == 3;
            this.method_1734(var6);
            return true;
         }
      }

      return false;
   }

   @Override
   public float method_1304(Class377 var1, float var2) {
      float var3 = super.method_1304(var1, var2);
      if (var1.method_482(Class160.field_1413)) {
         var3 /= 4.0F;
      }

      return var3;
   }

   @Override
   public float method_1776(Class377 var1, float var2) {
      float var3 = super.method_1776(var1, var2);
      if (var1.method_482(Class160.field_1413)) {
         var3 /= 3.0F;
      }

      return var3;
   }

   public void method_1245(Class354 var1, double var2, double var4, double var6, float var8, float var9) {
      Class334 var10 = var1.field_559.method_93();
      this.field_507.field_1841 = this.field_1510.field_1841 = this.field_224.field_1841 = var10 != null;
      this.field_507.field_1494 = this.field_1510.field_1494 = this.field_224.field_1494 = var1.method_296();
      if (!var1.field_1716.startsWith("\u0001")) {
         super.method_1861(var1, var2, var4 - var1.field_838, var6, var8, var9);
      }

      this.field_507.field_1494 = this.field_1510.field_1494 = this.field_224.field_1494 = false;
      this.field_507.field_1841 = this.field_1510.field_1841 = this.field_224.field_1841 = false;
      this.field_224.field_1855 = this.field_1510.field_1855 = this.field_507.field_1855 = var1.method_482(Class160.field_1413) || var1.field_417;
      if (!var1.field_1716.startsWith("\u0002")) {
         Class640 var11 = this.method_1690();
         float var12 = 1.6F;
         float var13 = 0.016666668F * var12;
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + 2.3F, (float)var6);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-this.field_40.field_376, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.field_40.field_519, 1.0F, 0.0F, 0.0F);
         float var14 = var1.method_304(this.field_40.field_688);
         var13 = (float)(var13 * (Math.sqrt(var14) / 2.0));
         GL11.glScalef(-var13, -var13, var13);
         String var15 = var1.field_1716;
         GL11.glDisable(2896);
         GL11.glDepthMask(false);
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         Class368 var16 = Class368.field_2696;
         GL11.glDisable(3553);
         var16.method_1284(true);
         int var17 = var11.method_962(var15) / 2;
         var16.method_1120(0.0F, 0.0F, 0.0F, 0.25F);
         var16.method_1724(-var17 - 1, -1.0, 0.0);
         var16.method_1724(-var17 - 1, 8.0, 0.0);
         var16.method_1724(var17 + 1, 8.0, 0.0);
         var16.method_1724(var17 + 1, -1.0, 0.0);
         var16.method_406();
         GL11.glEnable(3553);
         var11.method_1870(var15, -var11.method_962(var15) / 2, 0, 553648127);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         var11.method_1870(var15, -var11.method_962(var15) / 2, 0, -1);
         GL11.glEnable(2896);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
      }
   }

   protected void method_1375(Class354 var1, float var2) {
      Class334 var3 = var1.field_559.method_93();
      if (var3 != null) {
         GL11.glPushMatrix();
         this.field_224.field_909.method_833(0.0625F, true);
         GL11.glTranslatef(this.field_224.field_177 ? 0.0F : -0.0625F, 0.4375F, 0.0625F);
         if (var3.field_1782 < 32767 && Class714.method_759(Class108.field_1221[var3.field_1782].method_1900())) {
            float var6 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var6 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
         } else if (Class755.field_2576[var3.field_1782].method_928()) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            float var5 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var5, var5, var5);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.field_40.field_2458.method_1178(var3);
         GL11.glPopMatrix();
      }
   }

   protected void method_1903(Class354 var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   public void method_159() {
      if (this.field_2486 != null) {
         this.field_224.method_17(this.field_2486.field_2482);
      }

      this.field_224.field_1345 = 0.0F;
      this.field_224.method_578(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
      this.field_224.field_909.method_1022(0.0625F);
      this.field_224.field_1205.method_1022(0.0625F);
   }

   @Override
   protected void method_1224(Class377 var1, float var2) {
      this.method_1903((Class354)var1, var2);
   }

   @Override
   protected boolean method_882(Class377 var1, int var2) {
      return this.method_1329((Class354)var1, var2);
   }

   @Override
   protected void method_567(Class377 var1, float var2) {
      this.method_1375((Class354)var1, var2);
   }

   @Override
   public void method_1197(Class377 var1) {
      if (!(var1 instanceof Class514)) {
         Class354 var2 = (Class354)var1;
         if (var2.method_482(Class160.field_1413)) {
            GL11.glRotatef(90.0F, -1.0F, 0.0F, 0.0F);
            float var3 = 1.0F - Math.abs(var1.field_2866) / 90.0F;
            float var4 = var1.field_2866 / 90.0F;
            var3 *= var3 * var3;
            GL11.glTranslatef(0.0F, -1.7F * var3, 0.5F + var4);
            if (!var1.field_2669) {
               GL11.glRotatef(var1.field_2866, -1.0F, 0.0F, 0.0F);
            }
         }
      }
   }

   @Override
   public void method_1861(Class377 var1, double var2, double var4, double var6, float var8, float var9) {
      if (((Class354)var1).field_3 != null) {
         this.field_224.method_17(((Class354)var1).field_3.field_2482);
      }

      this.method_1245((Class354)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      if (((Class354)var1).field_3 != null) {
         this.field_224.method_17(((Class354)var1).field_3.field_2482);
      }

      this.method_1245((Class354)var1, var2, var4, var6, var8, var9);
   }
}
