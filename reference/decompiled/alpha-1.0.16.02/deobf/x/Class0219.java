package x;

import net.minecraft.client.Minecraft;

public class Class0219 extends Class0197 {
   public Class0219(Minecraft var1) {
      super(var1);
      this.b = true;
   }

   @Override
   public void a() {
   }

   @Override
   public void b(Class0089 var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.b.a[var2] == null) {
            this.a.g.b.a[var2] = new Class0124(((Class0312)Class0088.a.get(var2)).ba);
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
   public void a(Class0065 var1) {
      super.a(var1);
   }

   @Override
   public void d() {
   }
}
