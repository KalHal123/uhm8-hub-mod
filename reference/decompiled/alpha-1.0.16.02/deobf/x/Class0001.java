package x;

public class Class0001 {
   public final int a;
   public final int b;
   public final int c;
   public final int d;
   int e = -1;
   float f;
   float g;
   float h;
   Class0001 i;
   public boolean j = false;

   public Class0001(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var1 | var2 << 10 | var3 << 20;
   }

   public float a(Class0001 var1) {
      float var2 = var1.a - this.a;
      float var3 = var1.b - this.b;
      float var4 = var1.c - this.c;
      return Class0118.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   @Override
   public boolean equals(Object var1) {
      return ((Class0001)var1).d == this.d;
   }

   @Override
   public int hashCode() {
      return this.d;
   }

   public boolean a() {
      return this.e >= 0;
   }

   @Override
   public String toString() {
      return this.a + ", " + this.b + ", " + this.c;
   }
}
