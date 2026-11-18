import java.io.IOException;

public class cg implements as {
   private fr[] b = new fr[256];
   private cj c;
   private ad d;
   byte[] a = new byte[32768];

   public cg(cj var1, ad var2) {
      this.c = var1;
      this.d = var2;
   }

   @Override
   public boolean a(int var1, int var2) {
      int var3 = var1 & 15 | (var2 & 15) * 16;
      return this.b[var3] != null && this.b[var3].a(var1, var2);
   }

   @Override
   public fr b(int var1, int var2) {
      int var3 = var1 & 15 | (var2 & 15) * 16;

      try {
         if (!this.a(var1, var2)) {
            fr var4 = this.c(var1, var2);
            if (var4 == null) {
               var4 = new fr(this.c, this.a, var1, var2);
               var4.q = true;
               var4.p = true;
            }

            this.b[var3] = var4;
         }

         return this.b[var3];
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private synchronized fr c(int var1, int var2) {
      try {
         return this.d.a(this.c, var1, var2);
      } catch (IOException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @Override
   public void a(as var1, int var2, int var3) {
   }

   @Override
   public boolean a(boolean var1, nh var2) {
      return true;
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public boolean b() {
      return false;
   }
}
