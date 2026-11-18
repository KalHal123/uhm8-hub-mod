package x;

import net.minecraft.client.Minecraft;

public class Class0328 extends Class0032 {
   private Class0178 a;
   private boolean h = false;

   public Class0328(Minecraft var1, String var2, int var3) {
      var1.a((Class0065)null);
      new Class0341(this, var1, var2, var3).start();
   }

   @Override
   public void g() {
      if (this.a != null) {
         this.a.a();
      }
   }

   @Override
   protected void a(char var1, int var2) {
   }

   @Override
   public void a() {
      this.e.clear();
      this.e.add(new Class0138(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Cancel"));
   }

   @Override
   protected void a(Class0138 var1) {
      if (var1.d == 0) {
         this.h = true;
         if (this.a != null) {
            this.a.b();
         }

         this.b.a(new Class0075());
      }
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      if (this.a == null) {
         this.a(this.g, "Connecting to the server...", this.c / 2, this.d / 2 - 50, 16777215);
         this.a(this.g, "", this.c / 2, this.d / 2 - 10, 16777215);
      } else {
         this.a(this.g, "Logging in...", this.c / 2, this.d / 2 - 50, 16777215);
         this.a(this.g, this.a.a, this.c / 2, this.d / 2 - 10, 16777215);
      }

      super.a(var1, var2, var3);
   }
}
