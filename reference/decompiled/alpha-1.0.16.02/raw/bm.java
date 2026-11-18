import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bm {
   protected cj a;
   private List[] b = new List[4];
   private er c;
   private Random d = new Random();

   public bm(cj var1, er var2) {
      if (var1 != null) {
         this.a = var1;
      }

      this.c = var2;

      for (int var3 = 0; var3 < 4; var3++) {
         this.b[var3] = new ArrayList();
      }
   }

   public void a(nd var1) {
      int var2 = var1.c();
      this.b[var2].add(var1);
   }

   public void a() {
      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < this.b[var1].size(); var2++) {
            nd var3 = (nd)this.b[var1].get(var2);
            var3.e_();
            if (var3.ax) {
               this.b[var1].remove(var2--);
            }
         }
      }
   }

   public void a(jx var1, float var2) {
      float var3 = ei.b(var1.an * (float) Math.PI / 180.0F);
      float var4 = ei.a(var1.an * (float) Math.PI / 180.0F);
      float var5 = -var4 * ei.a(var1.ao * (float) Math.PI / 180.0F);
      float var6 = var3 * ei.a(var1.ao * (float) Math.PI / 180.0F);
      float var7 = ei.b(var1.ao * (float) Math.PI / 180.0F);
      nd.l = var1.aF + (var1.ah - var1.aF) * var2;
      nd.m = var1.aG + (var1.ai - var1.aG) * var2;
      nd.n = var1.aH + (var1.aj - var1.aH) * var2;

      for (int var8 = 0; var8 < 3; var8++) {
         if (this.b[var8].size() != 0) {
            int var9 = 0;
            if (var8 == 0) {
               var9 = this.c.a("/particles.png");
            }

            if (var8 == 1) {
               var9 = this.c.a("/terrain.png");
            }

            if (var8 == 2) {
               var9 = this.c.a("/gui/items.png");
            }

            GL11.glBindTexture(3553, var9);
            he var10 = he.a;
            var10.b();

            for (int var11 = 0; var11 < this.b[var8].size(); var11++) {
               nd var12 = (nd)this.b[var8].get(var11);
               var12.a(var10, var2, var3, var7, var4, var5, var6);
            }

            var10.a();
         }
      }
   }

   public void b(jx var1, float var2) {
      byte var3 = 3;
      if (this.b[var3].size() != 0) {
         he var4 = he.a;

         for (int var5 = 0; var5 < this.b[var3].size(); var5++) {
            nd var6 = (nd)this.b[var3].get(var5);
            var6.a(var4, var2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
         }
      }
   }

   public void a(cj var1) {
      this.a = var1;

      for (int var2 = 0; var2 < 4; var2++) {
         this.b[var2].clear();
      }
   }

   public void a(int var1, int var2, int var3) {
      int var4 = this.a.a(var1, var2, var3);
      if (var4 != 0) {
         ln var5 = ln.n[var4];
         byte var6 = 4;

         for (int var7 = 0; var7 < var6; var7++) {
            for (int var8 = 0; var8 < var6; var8++) {
               for (int var9 = 0; var9 < var6; var9++) {
                  double var10 = var1 + (var7 + 0.5) / var6;
                  double var12 = var2 + (var8 + 0.5) / var6;
                  double var14 = var3 + (var9 + 0.5) / var6;
                  this.a(new im(this.a, var10, var12, var14, var10 - var1 - 0.5, var12 - var2 - 0.5, var14 - var3 - 0.5, var5));
               }
            }
         }
      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.a.a(var1, var2, var3);
      if (var5 != 0) {
         ln var6 = ln.n[var5];
         float var7 = 0.1F;
         double var8 = var1 + this.d.nextDouble() * (var6.bg - var6.bd - var7 * 2.0F) + var7 + var6.bd;
         double var10 = var2 + this.d.nextDouble() * (var6.bh - var6.be - var7 * 2.0F) + var7 + var6.be;
         double var12 = var3 + this.d.nextDouble() * (var6.bi - var6.bf - var7 * 2.0F) + var7 + var6.bf;
         if (var4 == 0) {
            var10 = var2 + var6.be - var7;
         }

         if (var4 == 1) {
            var10 = var2 + var6.bh + var7;
         }

         if (var4 == 2) {
            var12 = var3 + var6.bf - var7;
         }

         if (var4 == 3) {
            var12 = var3 + var6.bi + var7;
         }

         if (var4 == 4) {
            var8 = var1 + var6.bd - var7;
         }

         if (var4 == 5) {
            var8 = var1 + var6.bg + var7;
         }

         this.a(new im(this.a, var8, var10, var12, 0.0, 0.0, 0.0, var6).b(0.2F).d(0.6F));
      }
   }

   public String b() {
      return "" + (this.b[0].size() + this.b[1].size() + this.b[2].size());
   }
}
