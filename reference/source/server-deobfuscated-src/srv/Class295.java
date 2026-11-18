package srv;

public class Class295 {
   private Class93[] field_678 = new Class93[1024];
   private int field_345 = 0;

   public Class93 method_655(Class93 var1) {
      if (var1.field_782 >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      }

      if (this.field_345 == this.field_678.length) {
         Class93[] var2 = new Class93[this.field_345 << 1];
         System.arraycopy(this.field_678, 0, var2, 0, this.field_345);
         this.field_678 = var2;
      }

      this.field_678[this.field_345] = var1;
      var1.field_782 = this.field_345;
      this.method_488(this.field_345++);
      return var1;
   }

   public void method_465() {
      this.field_345 = 0;
   }

   public Class93 method_820() {
      Class93 var1 = this.field_678[0];
      this.field_678[0] = this.field_678[--this.field_345];
      this.field_678[this.field_345] = null;
      if (this.field_345 > 0) {
         this.method_185(0);
      }

      var1.field_782 = -1;
      return var1;
   }

   public void method_409(Class93 var1, float var2) {
      float var3 = var1.field_343;
      var1.field_343 = var2;
      if (var2 < var3) {
         this.method_488(var1.field_782);
      } else {
         this.method_185(var1.field_782);
      }
   }

   private void method_488(int var1) {
      Class93 var2 = this.field_678[var1];
      float var4 = var2.field_343;

      while (var1 > 0) {
         int var3 = var1 - 1 >> 1;
         Class93 var5 = this.field_678[var3];
         if (var4 >= var5.field_343) {
            break;
         }

         this.field_678[var1] = var5;
         var5.field_782 = var1;
         var1 = var3;
      }

      this.field_678[var1] = var2;
      var2.field_782 = var1;
   }

   private void method_185(int var1) {
      Class93 var2 = this.field_678[var1];
      float var3 = var2.field_343;

      while (true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if (var4 >= this.field_345) {
            break;
         }

         Class93 var6 = this.field_678[var4];
         float var7 = var6.field_343;
         Class93 var8;
         float var9;
         if (var5 >= this.field_345) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.field_678[var5];
            var9 = var8.field_343;
         }

         if (var7 < var9) {
            if (var7 >= var3) {
               break;
            }

            this.field_678[var1] = var6;
            var6.field_782 = var1;
            var1 = var4;
         } else {
            if (var9 >= var3) {
               break;
            }

            this.field_678[var1] = var8;
            var8.field_782 = var1;
            var1 = var5;
         }
      }

      this.field_678[var1] = var2;
      var2.field_782 = var1;
   }

   public boolean method_753() {
      return this.field_345 == 0;
   }
}
