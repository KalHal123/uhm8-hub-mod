package x;

import java.io.File;
import net.minecraft.client.Minecraft;

public class Class0208 extends Class0251 {
   public Class0208(Class0032 var1) {
      super(var1);
      this.h = "Delete world";
   }

   @Override
   public void j() {
      this.e.add(new Class0138(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
   }

   @Override
   public void c(int var1) {
      String var2 = this.d(var1);
      if (var2 != null) {
         this.b.a(new Class0235(this, "Are you sure you want to delete this world?", "'" + var2 + "' will be lost forever!", var1));
      }
   }

   @Override
   public void a(boolean var1, int var2) {
      if (var1) {
         File var3 = Minecraft.b();
         Class0065.b(var3, this.d(var2));
      }

      this.b.a(this.a);
   }
}
