package x;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Class0173 extends Class0065 {
   private LinkedList w = new LinkedList();
   private Class0178 x;
   private Class0314 y;
   private Class0135 z = new Class0135();
   private Set A = new HashSet();
   private Set B = new HashSet();

   public Class0173(Class0178 var1) {
      super("MpServer");
      this.x = var1;
      this.n = 8;
      this.o = 64;
      this.p = 8;
   }

   @Override
   public void g() {
      for (int var1 = 0; var1 < 10 && !this.B.isEmpty(); var1++) {
         Class0268 var2 = (Class0268)this.B.iterator().next();
         this.a(var2);
      }

      this.x.a();

      for (int var3 = 0; var3 < this.w.size(); var3++) {
         Class0289 var4 = (Class0289)this.w.get(var3);
         if (--var4.d == 0) {
            super.a(var4.a, var4.b, var4.c, var4.e, var4.f);
            super.h(var4.a, var4.b, var4.c);
            this.w.remove(var3--);
         }
      }
   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = 0; var7 < this.w.size(); var7++) {
         Class0289 var8 = (Class0289)this.w.get(var7);
         if (var8.a >= var1 && var8.b >= var2 && var8.c >= var3 && var8.a <= var4 && var8.b <= var5 && var8.c <= var6) {
            this.w.remove(var7--);
         }
      }
   }

   @Override
   protected Class0020 a(File var1) {
      this.y = new Class0314(this);
      return this.y;
   }

   @Override
   public void a() {
      this.n = 8;
      this.o = 64;
      this.p = 8;
   }

   @Override
   protected void h() {
   }

   @Override
   public void h(int var1, int var2, int var3, int var4) {
   }

   @Override
   public boolean a(boolean var1) {
      return false;
   }

   public void a(int var1, int var2, boolean var3) {
      if (var3) {
         this.y.d(var1, var2);
      } else {
         this.y.c(var1, var2);
      }

      if (!var3) {
         this.b(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 128, var2 * 16 + 15);
      }
   }

   @Override
   public boolean a(Class0268 var1) {
      boolean var2 = super.a(var1);
      if (var1 instanceof Class0033) {
         this.A.add(var1);
      }

      return var2;
   }

   @Override
   public void d(Class0268 var1) {
      super.d(var1);
      if (var1 instanceof Class0033) {
         this.A.remove(var1);
      }
   }

   @Override
   protected void b(Class0268 var1) {
      super.b(var1);
      if (this.B.contains(var1)) {
         this.B.remove(var1);
      }
   }

   @Override
   protected void c(Class0268 var1) {
      super.c(var1);
      if (this.A.contains(var1)) {
         this.B.add(var1);
      }
   }

   public void a(int var1, Class0268 var2) {
      this.A.add(var2);
      if (!this.a(var2)) {
         this.B.add(var2);
      }

      this.z.a(var1, var2);
   }

   public Class0268 b(int var1) {
      return (Class0268)this.z.a(var1);
   }

   public Class0268 c(int var1) {
      Class0268 var2 = (Class0268)this.z.b(var1);
      if (var2 != null) {
         this.A.remove(var2);
         this.d(var2);
      }

      return var2;
   }

   @Override
   public boolean c(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      int var6 = this.e(var1, var2, var3);
      if (super.c(var1, var2, var3, var4)) {
         this.w.add(new Class0289(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a(var1, var2, var3);
      int var7 = this.e(var1, var2, var3);
      if (super.a(var1, var2, var3, var4, var5)) {
         this.w.add(new Class0289(this, var1, var2, var3, var6, var7));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      int var6 = this.e(var1, var2, var3);
      if (super.a(var1, var2, var3, var4)) {
         this.w.add(new Class0289(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   public boolean c(int var1, int var2, int var3, int var4, int var5) {
      this.c(var1, var2, var3, var1, var2, var3);
      if (super.a(var1, var2, var3, var4, var5)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void k() {
      this.x.a((Class0140)(new Class0372("Quitting")));
   }
}
