package ext;

import org.lwjgl.opengl.GL11;

public class Class264 {
   private Class424[] field_2691;
   private Class79[] field_1073;
   private int field_1956;
   private int field_2467;
   public float field_2462;
   public float field_1156;
   public float field_2738;
   public float field_1799;
   public float field_2361;
   public float field_2528;
   private boolean field_2829 = false;
   private int field_1975 = 0;
   public boolean field_1192 = false;
   public boolean field_597 = true;
   public boolean field_2882 = false;

   public Class264(int var1, int var2) {
      this.field_1956 = var1;
      this.field_2467 = var2;
   }

   public void method_541(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.method_703(var1, var2, var3, var4, var5, var6, var7, 64, 32);
   }

   public void method_746(float var1, float var2, float var3, int var4, int var5, int var6) {
      this.method_703(var1, var2, var3, var4, var5, var6, 0.0F, 64, 32);
   }

   public void method_703(float var1, float var2, float var3, int var4, int var5, int var6, float var7, int var8, int var9) {
      float var10 = var1;
      float var11 = var2;
      float var12 = var3;
      float var13 = var7;
      this.field_2691 = new Class424[8];
      this.field_1073 = new Class79[6];
      int var14 = var4;
      int var15 = var5;
      int var16 = var6;
      float var17 = var10 + var14;
      float var18 = var11 + var15;
      float var19 = var12 + var16;
      var10 -= var13;
      var11 -= var13;
      var12 -= var13;
      var17 += var13;
      var18 += var13;
      var19 += var13;
      if (this.field_1192) {
         float var20 = var17;
         var17 = var10;
         var10 = var20;
      }

      Class424 var35 = new Class424(var10, var11, var12, 0.0F, 0.0F);
      Class424 var21 = new Class424(var17, var11, var12, 0.0F, 8.0F);
      Class424 var22 = new Class424(var17, var18, var12, 8.0F, 8.0F);
      Class424 var23 = new Class424(var10, var18, var12, 8.0F, 0.0F);
      Class424 var24 = new Class424(var10, var11, var19, 0.0F, 0.0F);
      Class424 var25 = new Class424(var17, var11, var19, 0.0F, 8.0F);
      Class424 var26 = new Class424(var17, var18, var19, 8.0F, 8.0F);
      Class424 var27 = new Class424(var10, var18, var19, 8.0F, 0.0F);
      this.field_2691[0] = var35;
      this.field_2691[1] = var21;
      this.field_2691[2] = var22;
      this.field_2691[3] = var23;
      this.field_2691[4] = var24;
      this.field_2691[5] = var25;
      this.field_2691[6] = var26;
      this.field_2691[7] = var27;
      this.field_1073[0] = new Class79(
         new Class424[]{var25, var21, var22, var26},
         this.field_1956 + var16 + var14,
         this.field_2467 + var16,
         this.field_1956 + var16 + var14 + var16,
         this.field_2467 + var16 + var15,
         var8,
         var9
      );
      this.field_1073[1] = new Class79(
         new Class424[]{var35, var24, var27, var23},
         this.field_1956 + 0,
         this.field_2467 + var16,
         this.field_1956 + var16,
         this.field_2467 + var16 + var15,
         var8,
         var9
      );
      this.field_1073[2] = new Class79(
         new Class424[]{var25, var24, var35, var21},
         this.field_1956 + var16,
         this.field_2467 + 0,
         this.field_1956 + var16 + var14,
         this.field_2467 + var16,
         var8,
         var9
      );
      this.field_1073[3] = new Class79(
         new Class424[]{var22, var23, var27, var26},
         this.field_1956 + var16 + var14,
         this.field_2467 + 0,
         this.field_1956 + var16 + var14 + var14,
         this.field_2467 + var16,
         var8,
         var9
      );
      this.field_1073[4] = new Class79(
         new Class424[]{var21, var35, var23, var22},
         this.field_1956 + var16,
         this.field_2467 + var16,
         this.field_1956 + var16 + var14,
         this.field_2467 + var16 + var15,
         var8,
         var9
      );
      this.field_1073[5] = new Class79(
         new Class424[]{var24, var25, var26, var27},
         this.field_1956 + var16 + var14 + var16,
         this.field_2467 + var16,
         this.field_1956 + var16 + var14 + var16 + var14,
         this.field_2467 + var16 + var15,
         var8,
         var9
      );
      if (this.field_1192) {
         for (int var28 = 0; var28 < this.field_1073.length; var28++) {
            this.field_1073[var28].method_900();
         }
      }
   }

   public void method_1541(float var1, float var2, float var3) {
      this.field_2462 = var1;
      this.field_1156 = var2;
      this.field_2738 = var3;
   }

   public void method_1022(float var1) {
      if (!this.field_2882 && this.field_597) {
         if (!this.field_2829) {
            this.method_1788(var1);
         }

         if (this.field_1799 != 0.0F || this.field_2361 != 0.0F || this.field_2528 != 0.0F) {
            GL11.glPushMatrix();
            GL11.glTranslatef(this.field_2462 * var1, this.field_1156 * var1, this.field_2738 * var1);
            if (this.field_2528 != 0.0F) {
               GL11.glRotatef(this.field_2528 * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
            }

            if (this.field_2361 != 0.0F) {
               GL11.glRotatef(this.field_2361 * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
            }

            if (this.field_1799 != 0.0F) {
               GL11.glRotatef(this.field_1799 * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
            }

            GL11.glCallList(this.field_1975);
            GL11.glPopMatrix();
         } else if (this.field_2462 == 0.0F && this.field_1156 == 0.0F && this.field_2738 == 0.0F) {
            GL11.glCallList(this.field_1975);
         } else {
            GL11.glTranslatef(this.field_2462 * var1, this.field_1156 * var1, this.field_2738 * var1);
            GL11.glCallList(this.field_1975);
            GL11.glTranslatef(-this.field_2462 * var1, -this.field_1156 * var1, -this.field_2738 * var1);
         }
      }
   }

   public void method_108(float var1) {
      this.method_833(var1, false);
   }

   public void method_833(float var1, boolean var2) {
      if (!this.field_2882 && this.field_597 || var2) {
         if (!this.field_2829 && !this.field_2882 && this.field_597) {
            this.method_1788(var1);
         }

         if (this.field_1799 != 0.0F || this.field_2361 != 0.0F || this.field_2528 != 0.0F) {
            GL11.glTranslatef(this.field_2462 * var1, this.field_1156 * var1, this.field_2738 * var1);
            if (this.field_2528 != 0.0F) {
               GL11.glRotatef(this.field_2528 * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
            }

            if (this.field_2361 != 0.0F) {
               GL11.glRotatef(this.field_2361 * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
            }

            if (this.field_1799 != 0.0F) {
               GL11.glRotatef(this.field_1799 * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
            }
         } else if (this.field_2462 != 0.0F || this.field_1156 != 0.0F || this.field_2738 != 0.0F) {
            GL11.glTranslatef(this.field_2462 * var1, this.field_1156 * var1, this.field_2738 * var1);
         }
      }
   }

   private void method_1788(float var1) {
      this.field_1975 = Class504.method_225(1);
      GL11.glNewList(this.field_1975, 4864);
      Class368 var2 = Class368.field_2696;

      for (int var3 = 0; var3 < this.field_1073.length; var3++) {
         this.field_1073[var3].method_1842(var2, var1, true);
      }

      GL11.glEndList();
      this.field_2829 = true;
   }
}
