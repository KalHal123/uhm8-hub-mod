package x;

import org.lwjgl.opengl.GL11;

public class Class0204 extends Class0107 {
   private Class0217 k = new Class0217(this, 3, 3);
   private Class0161 l = new Class0313();

   public Class0204(Class0123 var1) {
      this.i.add(new Class0232(this, this.k, this.l, 0, 124, 35));

      for (int var2 = 0; var2 < 3; var2++) {
         for (int var3 = 0; var3 < 3; var3++) {
            this.i.add(new Class0094(this, this.k, var3 + var2 * 3, 30 + var3 * 18, 17 + var2 * 18));
         }
      }

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.i.add(new Class0094(this, var1, var6 + (var4 + 1) * 9, 8 + var6 * 18, 84 + var4 * 18));
         }
      }

      for (int var5 = 0; var5 < 9; var5++) {
         this.i.add(new Class0094(this, var1, var5, 8 + var5 * 18, 142));
      }
   }

   @Override
   public void h() {
      super.h();

      for (int var1 = 0; var1 < 9; var1++) {
         Class0124 var2 = this.k.a_(var1);
         if (var2 != null) {
            this.b.g.a(var2);
         }
      }
   }

   @Override
   public void a(Class0161 var1) {
      int[] var2 = new int[9];

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var4 = 0; var4 < 3; var4++) {
            int var5 = var3 + var4 * 3;
            Class0124 var6 = this.k.a_(var5);
            if (var6 == null) {
               var2[var5] = -1;
            } else {
               var2[var5] = var6.c;
            }
         }
      }

      this.l.a(0, Class0099.a().a(var2));
   }

   @Override
   protected void j() {
      this.g.b("Crafting", 28, 6, 4210752);
      this.g.b("Inventory", 8, this.h - 96 + 2, 4210752);
   }

   @Override
   protected void a(float var1) {
      int var2 = this.b.n.a("/gui/crafting.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.n.b(var2);
      int var3 = (this.c - this.a) / 2;
      int var4 = (this.d - this.h) / 2;
      this.b(var3, var4, 0, 0, this.a, this.h);
   }
}
