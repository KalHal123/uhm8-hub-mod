import java.util.Random;

public class dc extends ln {
   public static boolean a = false;

   public dc(int var1, int var2) {
      super(var1, var2, fs.m);
   }

   @Override
   public void e(cj var1, int var2, int var3, int var4) {
      var1.h(var2, var3, var4, this.ba);
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, int var5) {
      var1.h(var2, var3, var4, this.ba);
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   private void h(cj var1, int var2, int var3, int var4) {
      int var5 = var2;
      int var6 = var3;
      int var7 = var4;
      if (a_(var1, var5, var6 - 1, var7) && var6 >= 0) {
         ex var8 = new ex(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, this.ba);
         if (a) {
            while (!var8.ax) {
               var8.e_();
            }
         } else {
            var1.a(var8);
         }
      }
   }

   @Override
   public int a() {
      return 3;
   }

   public static boolean a_(cj var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if (var4 == 0) {
         return true;
      }

      if (var4 == ln.ar.ba) {
         return true;
      }

      fs var5 = ln.n[var4].bl;
      return var5 == fs.f ? true : var5 == fs.g;
   }
}
