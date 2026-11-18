package x;

import java.util.Random;

public class Class0330 extends Class0312 {
   protected Class0330(int var1, int var2) {
      super(var1, Class0155.i);
      this.aZ = var2;
      this.b(true);
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
   }

   @Override
   public boolean a(Class0065 var1, int var2, int var3, int var4) {
      return this.b(var1.a(var2, var3 - 1, var4));
   }

   protected boolean b(int var1) {
      return var1 == Class0312.u.ba || var1 == Class0312.v.ba || var1 == Class0312.aA.ba;
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      this.h(var1, var2, var3, var4);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   protected final void h(Class0065 var1, int var2, int var3, int var4) {
      if (!this.g(var1, var2, var3, var4)) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean g(Class0065 var1, int var2, int var3, int var4) {
      return (var1.j(var2, var3, var4) >= 8 || var1.i(var2, var3, var4)) && this.b(var1.a(var2, var3 - 1, var4));
   }

   @Override
   public Class0057 d(Class0065 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public int f() {
      return 1;
   }
}
