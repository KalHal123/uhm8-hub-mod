package ext;

import org.lwjgl.opengl.GL11;

public class Class392 extends Class355 {
   private Class6 field_233;
   private float field_1210;
   private float field_3058;

   public Class392(Interface181 var1, Class334[] var2) {
      this.field_2868 = true;
      this.field_233 = new Class6(var2);
      this.field_2443.add(new Class44(this, this.field_233.field_2285, this.field_233.field_2483, 0, 144, 36));

      for (int var3 = 0; var3 < 2; var3++) {
         for (int var4 = 0; var4 < 2; var4++) {
            this.field_2443.add(new Class719(this, this.field_233.field_2285, var4 + var3 * 2, 88 + var4 * 18, 26 + var3 * 18));
         }
      }

      for (int var5 = 0; var5 < 4; var5++) {
         this.field_2443.add(new Class576(this, this, var1, var1.method_1574() - 1 - var5, 8, 8 + var5 * 18, var5));
      }

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.field_2443.add(new Class719(this, var1, var8 + (var6 + 1) * 9, 8 + var8 * 18, 84 + var6 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.field_2443.add(new Class719(this, var1, var7, 8 + var7 * 18, 142));
      }
   }

   @Override
   protected void method_98() {
      this.field_1683.method_1870("Crafting", 86, 16, 16777215);
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      super.method_1938(var1, var2, var3);
      this.field_1210 = var1;
      this.field_3058 = var2;
   }

   @Override
   protected void method_542(float var1) {
      int var2 = this.field_3013.field_2176.method_1545("/gui/inventory.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_3013.field_2176.method_462(var2);
      int var3 = (this.field_2345 - this.field_2320) / 2;
      int var4 = (this.field_562 - this.field_2029) / 2;
      this.method_1219(var3, var4, 0, 0, this.field_2320, this.field_2029);
      GL11.glEnable(32826);
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef(var3 + 51, var4 + 75, 50.0F);
      float var5 = 30.0F;
      GL11.glScalef(-var5, var5, var5);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var6 = this.field_3013.field_2787.field_1113;
      float var7 = this.field_3013.field_2787.field_1661;
      float var8 = this.field_3013.field_2787.field_2866;
      float var9 = var3 + 51 - this.field_1210;
      float var10 = var4 + 75 - 50 - this.field_3058;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      Class584.method_331();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan(var10 / 40.0F)) * 20.0F, 1.0F, 0.0F, 0.0F);
      this.field_3013.field_2787.field_1113 = (float)Math.atan(var9 / 40.0F) * 20.0F;
      this.field_3013.field_2787.field_1661 = (float)Math.atan(var9 / 40.0F) * 40.0F;
      this.field_3013.field_2787.field_2866 = -((float)Math.atan(var10 / 40.0F)) * 20.0F;
      GL11.glTranslatef(0.0F, this.field_3013.field_2787.field_838, 0.0F);
      Class531.field_759.method_521(this.field_3013.field_2787, 0.0, 0.0, 0.0, 0.0F, 1.0F);
      this.field_3013.field_2787.field_1113 = var6;
      this.field_3013.field_2787.field_1661 = var7;
      this.field_3013.field_2787.field_2866 = var8;
      GL11.glPopMatrix();
      Class584.method_62();
      GL11.glDisable(32826);
   }
}
