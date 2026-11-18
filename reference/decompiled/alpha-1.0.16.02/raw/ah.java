import java.util.ArrayList;
import java.util.List;

public class ah {
   private static List d = new ArrayList();
   private static int e = 0;
   public double a;
   public double b;
   public double c;

   public static ah a(double var0, double var2, double var4) {
      return new ah(var0, var2, var4);
   }

   public static void a() {
      e = 0;
   }

   public static ah b(double var0, double var2, double var4) {
      if (e >= d.size()) {
         d.add(a(0.0, 0.0, 0.0));
      }

      return ((ah)d.get(e++)).e(var0, var2, var4);
   }

   private ah(double var1, double var3, double var5) {
      if (var1 == -0.0) {
         var1 = 0.0;
      }

      if (var3 == -0.0) {
         var3 = 0.0;
      }

      if (var5 == -0.0) {
         var5 = 0.0;
      }

      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   private ah e(double var1, double var3, double var5) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      return this;
   }

   public ah a(ah var1) {
      return b(var1.a - this.a, var1.b - this.b, var1.c - this.c);
   }

   public ah b() {
      double var1 = ei.a(this.a * this.a + this.b * this.b + this.c * this.c);
      return var1 < 1.0E-4 ? b(0.0, 0.0, 0.0) : b(this.a / var1, this.b / var1, this.c / var1);
   }

   public ah b(ah var1) {
      return b(this.b * var1.c - this.c * var1.b, this.c * var1.a - this.a * var1.c, this.a * var1.b - this.b * var1.a);
   }

   public ah c(double var1, double var3, double var5) {
      return b(this.a + var1, this.b + var3, this.c + var5);
   }

   public double c(ah var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return ei.a(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double d(ah var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double d(double var1, double var3, double var5) {
      double var7 = var1 - this.a;
      double var9 = var3 - this.b;
      double var11 = var5 - this.c;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double c() {
      return ei.a(this.a * this.a + this.b * this.b + this.c * this.c);
   }

   public ah a(ah var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var4 * var4 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.a) / var4;
      return !(var10 < 0.0) && !(var10 > 1.0) ? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
   }

   public ah b(ah var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var6 * var6 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.b) / var6;
      return !(var10 < 0.0) && !(var10 > 1.0) ? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
   }

   public ah c(ah var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var8 * var8 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.c) / var8;
      return !(var10 < 0.0) && !(var10 > 1.0) ? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
   }

   @Override
   public String toString() {
      return "(" + this.a + ", " + this.b + ", " + this.c + ")";
   }

   public void a(float var1) {
      float var2 = ei.b(var1);
      float var3 = ei.a(var1);
      double var4 = this.a;
      double var6 = this.b * var2 + this.c * var3;
      double var8 = this.c * var2 - this.b * var3;
      this.a = var4;
      this.b = var6;
      this.c = var8;
   }

   public void b(float var1) {
      float var2 = ei.b(var1);
      float var3 = ei.a(var1);
      double var4 = this.a * var2 + this.c * var3;
      double var6 = this.b;
      double var8 = this.c * var2 - this.a * var3;
      this.a = var4;
      this.b = var6;
      this.c = var8;
   }
}
