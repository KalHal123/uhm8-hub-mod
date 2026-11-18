package x;

import java.util.Random;

public class Class0378 extends Class0312 {
   public Class0378(int var1, int var2) {
      super(var1, var2, Class0155.p);
   }

   @Override
   public int a(int var1) {
      if (var1 == 0) {
         return this.aZ + 2;
      } else {
         return var1 == 1 ? this.aZ + 1 : this.aZ;
      }
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      if (var5 > 0 && Class0312.n[var5].d() && var1.p(var2, var3, var4)) {
         this.b(var1, var2, var3, var4, 0);
         var1.d(var2, var3, var4, 0);
      }
   }

   @Override
   public int a(Random var1) {
      return 0;
   }

   @Override
   public void c(Class0065 var1, int var2, int var3, int var4) {
      Class0238 var5 = new Class0238(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F);
      var5.a = var1.m.nextInt(var5.a / 4) + var5.a / 8;
      var1.a(var5);
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, int var5) {
      Class0238 var6 = new Class0238(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F);
      var1.a(var6);
      var1.a(var6, "random.fuse", 1.0F, 1.0F);
   }
}
