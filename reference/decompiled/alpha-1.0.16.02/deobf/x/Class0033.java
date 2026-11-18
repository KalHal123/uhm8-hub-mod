package x;

import net.minecraft.client.Minecraft;

public class Class0033 extends Class0089 {
   public Class0307 a;
   private Minecraft bd;

   public Class0033(Minecraft var1, Class0065 var2, Class0088 var3) {
      super(var2);
      this.bd = var1;
      if (var3 != null && var3.b != null && var3.b.length() > 0) {
         this.aV = "http://www.minecraft.net/skin/" + var3.b + ".png";
         System.out.println("Loading texture " + this.aV);
      }

      this.i = var3.b;
   }

   @Override
   public void b_() {
      super.b_();
      this.T = this.a.a;
      this.U = this.a.b;
      this.W = this.a.d;
   }

   @Override
   public void i() {
      this.a.a(this);
      super.i();
   }

   public void j() {
      this.a.a();
   }

   public void a(int var1, boolean var2) {
      this.a.a(var1, var2);
   }

   @Override
   public void a(Class0193 var1) {
      super.a(var1);
      var1.a("Score", this.d);
      var1.a("Inventory", this.b.a(new Class0269()));
   }

   @Override
   public void b(Class0193 var1) {
      super.b(var1);
      this.d = var1.e("Score");
      Class0269 var2 = var1.l("Inventory");
      this.b.b(var2);
   }

   @Override
   public void a(Class0161 var1) {
      this.bd.a(new Class0103(this.b, var1));
   }

   @Override
   public void a(Class0366 var1) {
      this.bd.a(new Class0361(var1));
   }

   @Override
   public void k() {
      this.bd.a(new Class0204(this.b));
   }

   @Override
   public void a(Class0265 var1) {
      this.bd.a(new Class0209(this.b, var1));
   }

   public void a(Class0268 var1) {
      int var2 = this.b.a(var1);
      if (var2 > 0) {
         var1.a(this, var2);
         Class0124 var3 = this.r();
         if (var3 != null && var1 instanceof Class0158) {
            var3.a((Class0158)var1);
            if (var3.a <= 0) {
               var3.a(this);
               this.s();
            }
         }
      }
   }

   @Override
   public void a_(Class0268 var1, int var2) {
      this.bd.h.a(new Class0056(this.bd.e, var1, this, -0.5F));
   }

   public int l() {
      return this.b.g();
   }

   @Override
   public void a_(Class0268 var1) {
      if (!var1.a(this)) {
         Class0124 var2 = this.r();
         if (var2 != null && var1 instanceof Class0158) {
            var2.b((Class0158)var1);
            if (var2.a <= 0) {
               var2.a(this);
               this.s();
            }
         }
      }
   }

   public void a(String var1) {
   }

   public void m() {
   }
}
