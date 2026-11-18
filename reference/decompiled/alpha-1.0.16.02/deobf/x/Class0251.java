package x;

import java.io.File;
import net.minecraft.client.Minecraft;

public class Class0251 extends Class0032 {
   protected Class0032 a;
   protected String h = "Select world";
   private boolean i = false;

   public Class0251(Class0032 var1) {
      this.a = var1;
   }

   @Override
   public void a() {
      File var1 = Minecraft.b();

      for (int var2 = 0; var2 < 5; var2++) {
         Class0193 var3 = Class0065.a(var1, "World" + (var2 + 1));
         if (var3 == null) {
            this.e.add(new Class0138(var2, this.c / 2 - 100, this.d / 6 + 24 * var2, "- empty -"));
         } else {
            String var4 = "World " + (var2 + 1);
            long var5 = var3.f("SizeOnDisk");
            var4 = var4 + " (" + (float)(var5 / 1024L * 100L / 1024L) / 100.0F + " MB)";
            this.e.add(new Class0138(var2, this.c / 2 - 100, this.d / 6 + 24 * var2, var4));
         }
      }

      this.j();
   }

   protected String d(int var1) {
      File var2 = Minecraft.b();
      return Class0065.a(var2, "World" + var1) != null ? "World" + var1 : null;
   }

   public void j() {
      this.e.add(new Class0138(5, this.c / 2 - 100, this.d / 6 + 120 + 12, "Delete world..."));
      this.e.add(new Class0138(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
   }

   @Override
   protected void a(Class0138 var1) {
      if (var1.e) {
         if (var1.d < 5) {
            this.c(var1.d + 1);
         } else if (var1.d == 5) {
            this.b.a(new Class0208(this));
         } else if (var1.d == 6) {
            this.b.a(this.a);
         }
      }
   }

   public void c(int var1) {
      this.b.a((Class0032)null);
      if (!this.i) {
         this.i = true;
         this.b.b("World" + var1);
         this.b.a((Class0032)null);
      }
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.h, this.c / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }
}
