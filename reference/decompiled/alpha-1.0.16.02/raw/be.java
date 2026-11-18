import net.minecraft.client.Minecraft;

public class be extends dg {
   public li a;
   private Minecraft bd;

   public be(Minecraft var1, cj var2, df var3) {
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
   public void a(hc var1) {
      super.a(var1);
      var1.a("Score", this.d);
      var1.a("Inventory", this.b.a(new jy()));
   }

   @Override
   public void b(hc var1) {
      super.b(var1);
      this.d = var1.e("Score");
      jy var2 = var1.l("Inventory");
      this.b.b(var2);
   }

   @Override
   public void a(fy var1) {
      this.bd.a(new du(this.b, var1));
   }

   @Override
   public void a(nn var1) {
      this.bd.a(new ni(var1));
   }

   @Override
   public void k() {
      this.bd.a(new hn(this.b));
   }

   @Override
   public void a(ju var1) {
      this.bd.a(new hs(this.b, var1));
   }

   public void a(jx var1) {
      int var2 = this.b.a(var1);
      if (var2 > 0) {
         var1.a(this, var2);
         eo var3 = this.r();
         if (var3 != null && var1 instanceof fv) {
            var3.a((fv)var1);
            if (var3.a <= 0) {
               var3.a(this);
               this.s();
            }
         }
      }
   }

   @Override
   public void a_(jx var1, int var2) {
      this.bd.h.a(new ca(this.bd.e, var1, this, -0.5F));
   }

   public int l() {
      return this.b.g();
   }

   @Override
   public void a_(jx var1) {
      if (!var1.a(this)) {
         eo var2 = this.r();
         if (var2 != null && var1 instanceof fv) {
            var2.b((fv)var1);
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
