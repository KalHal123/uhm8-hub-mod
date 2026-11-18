public class iw implements Comparable {
   private static long f = 0L;
   public int a;
   public int b;
   public int c;
   public int d;
   public long e;
   private long g = f++;

   public iw(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof iw)) {
         return false;
      }

      iw var2 = (iw)var1;
      return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d;
   }

   @Override
   public int hashCode() {
      return (this.a * 128 * 1024 + this.c * 128 + this.b) * 256 + this.d;
   }

   public iw a(long var1) {
      this.e = var1;
      return this;
   }

   public int a(iw var1) {
      if (this.e < var1.e) {
         return -1;
      } else if (this.e > var1.e) {
         return 1;
      } else if (this.g < var1.g) {
         return -1;
      } else {
         return this.g > var1.g ? 1 : 0;
      }
   }
}
