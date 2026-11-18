import net.minecraft.client.Minecraft;

public class ib extends hg {
   public ib(Minecraft var1) {
      super(var1);
      this.b = true;
   }

   @Override
   public void a() {
   }

   @Override
   public void b(dg var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.b.a[var2] == null) {
            this.a.g.b.a[var2] = new eo(((ln)df.a.get(var2)).ba);
         } else {
            this.a.g.b.a[var2].a = 1;
         }
      }
   }

   @Override
   public boolean e() {
      return false;
   }

   @Override
   public void a(cj var1) {
      super.a(var1);
   }

   @Override
   public void d() {
   }
}
