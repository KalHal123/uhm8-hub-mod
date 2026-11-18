package x;

import org.lwjgl.opengl.GL11;

public class Class0103 extends Class0107 {
   private Class0161 k;
   private Class0161 l;
   private int m = 0;

   public Class0103(Class0161 var1, Class0161 var2) {
      this.k = var1;
      this.l = var2;
      this.f = false;
      short var3 = 222;
      int var4 = var3 - 108;
      this.m = var2.a() / 9;
      this.h = var4 + this.m * 18;
      int var5 = (this.m - 4) * 18;

      for (int var6 = 0; var6 < this.m; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.i.add(new Class0094(this, var2, var7 + var6 * 9, 8 + var7 * 18, 18 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.i.add(new Class0094(this, var1, var10 + (var8 + 1) * 9, 8 + var10 * 18, 103 + var8 * 18 + var5));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.i.add(new Class0094(this, var1, var9, 8 + var9 * 18, 161 + var5));
      }
   }

   @Override
   protected void j() {
      this.g.b(this.l.b(), 8, 6, 4210752);
      this.g.b(this.k.b(), 8, this.h - 96 + 2, 4210752);
   }

   @Override
   protected void a(float var1) {
      int var2 = this.b.n.a("/gui/container.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.n.b(var2);
      int var3 = (this.c - this.a) / 2;
      int var4 = (this.d - this.h) / 2;
      this.b(var3, var4, 0, 0, this.a, this.m * 18 + 17);
      this.b(var3, var4 + this.m * 18 + 17, 0, 126, this.a, 96);
   }
}
