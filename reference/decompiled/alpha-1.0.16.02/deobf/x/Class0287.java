package x;

import net.minecraft.client.Minecraft;

public class Class0287 extends Class0033 {
   private Class0178 bd;
   private double be;
   private double bf;
   private double bg;
   private double bh;
   private float bi;
   private float bj;

   public Class0287(Minecraft var1, Class0065 var2, Class0088 var3, Class0178 var4) {
      super(var1, var2, var3);
      this.bd = var4;
   }

   @Override
   public void e_() {
      super.e_();
      this.H();
   }

   @Override
   public void m() {
      this.H();
   }

   public void H() {
      double var1 = this.ah - this.be;
      double var3 = this.ar.b - this.bf;
      double var5 = this.ai - this.bg;
      double var7 = this.aj - this.bh;
      double var9 = this.an - this.bi;
      double var11 = this.ao - this.bj;
      boolean var13 = var3 != 0.0 || var5 != 0.0 || var1 != 0.0 || var7 != 0.0;
      boolean var14 = var9 != 0.0 || var11 != 0.0;
      if (var13 && var14) {
         this.bd.a(new Class0059(this.ah, this.ar.b, this.ai, this.aj, this.an, this.ao, this.as));
      } else if (var13) {
         this.bd.a(new Class0380(this.ah, this.ar.b, this.ai, this.aj, this.as));
      } else if (var14) {
         this.bd.a(new Class0322(this.an, this.ao, this.as));
      } else {
         this.bd.a((Class0140)(new Class0111(this.as)));
      }

      if (var13) {
         this.be = this.ah;
         this.bf = this.ar.b;
         this.bg = this.ai;
         this.bh = this.aj;
      }

      if (var14) {
         this.bi = this.an;
         this.bj = this.ao;
      }
   }

   @Override
   protected void a(Class0100 var1) {
      Class0180 var2 = new Class0180(var1);
      this.bd.a((Class0140)var2);
      var1.ah = var2.b / 32.0;
      var1.ai = var2.c / 32.0;
      var1.aj = var2.d / 32.0;
      var1.ak = var2.e / 128.0;
      var1.al = var2.f / 128.0;
      var1.am = var2.g / 128.0;
   }

   @Override
   public void a(String var1) {
      this.bd.a((Class0140)(new Class0216(var1)));
   }

   @Override
   public void u() {
      super.u();
      this.bd.a((Class0140)(new Class0185(this, 1)));
   }
}
