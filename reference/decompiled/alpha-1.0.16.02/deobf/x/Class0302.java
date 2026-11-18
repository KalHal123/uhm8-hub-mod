package x;

import org.lwjgl.opengl.GL11;

public class Class0302 extends Class0107 {
   private Class0217 k;
   private Class0161 l = new Class0313();
   private float m;
   private float n;

   public Class0302(Class0161 var1, Class0124[] var2) {
      this.f = true;
      this.k = new Class0217(this, var2);
      this.i.add(new Class0232(this, this.k, this.l, 0, 144, 36));

      for (int var3 = 0; var3 < 2; var3++) {
         for (int var4 = 0; var4 < 2; var4++) {
            this.i.add(new Class0094(this, this.k, var4 + var3 * 2, 88 + var4 * 18, 26 + var3 * 18));
         }
      }

      for (int var5 = 0; var5 < 4; var5++) {
         int var8 = var5;
         this.i.add(new Class0296(this, this, var1, var1.a() - 1 - var5, 8, 8 + var5 * 18, var8));
      }

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var9 = 0; var9 < 9; var9++) {
            this.i.add(new Class0094(this, var1, var9 + (var6 + 1) * 9, 8 + var9 * 18, 84 + var6 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.i.add(new Class0094(this, var1, var7, 8 + var7 * 18, 142));
      }

      this.a(this.k);
   }

   @Override
   public void a(Class0161 var1) {
      int[] var2 = new int[9];

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var4 = 0; var4 < 3; var4++) {
            int var5 = -1;
            if (var3 < 2 && var4 < 2) {
               Class0124 var6 = this.k.a_(var3 + var4 * 2);
               if (var6 != null) {
                  var5 = var6.c;
               }
            }

            var2[var3 + var4 * 3] = var5;
         }
      }

      this.l.a(0, Class0099.a().a(var2));
   }

   @Override
   protected void j() {
      this.g.b("Crafting", 86, 16, 4210752);
   }

   @Override
   public void a(int var1, int var2, float var3) {
      super.a(var1, var2, var3);
      this.m = var1;
      this.n = var2;
   }

   @Override
   protected void a(float var1) {
      int var2 = this.b.n.a("/gui/inventory.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.n.b(var2);
      int var3 = (this.c - this.a) / 2;
      int var4 = (this.d - this.h) / 2;
      this.b(var3, var4, 0, 0, this.a, this.h);
      GL11.glEnable(32826);
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef(var3 + 51, var4 + 75, 50.0F);
      float var5 = 30.0F;
      GL11.glScalef(-var5, var5, var5);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var6 = this.b.g.n;
      float var7 = this.b.g.an;
      float var8 = this.b.g.ao;
      float var9 = var3 + 51 - this.m;
      float var10 = var4 + 75 - 50 - this.n;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      Class0244.b();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan(var10 / 40.0F)) * 20.0F, 1.0F, 0.0F, 0.0F);
      this.b.g.n = (float)Math.atan(var9 / 40.0F) * 20.0F;
      this.b.g.an = (float)Math.atan(var9 / 40.0F) * 40.0F;
      this.b.g.ao = -((float)Math.atan(var10 / 40.0F)) * 20.0F;
      GL11.glTranslatef(0.0F, this.b.g.ay, 0.0F);
      Class0284.a.a(this.b.g, 0.0, 0.0, 0.0, 0.0F, 1.0F);
      this.b.g.n = var6;
      this.b.g.an = var7;
      this.b.g.ao = var8;
      GL11.glPopMatrix();
      Class0244.a();
      GL11.glDisable(32826);
   }
}
