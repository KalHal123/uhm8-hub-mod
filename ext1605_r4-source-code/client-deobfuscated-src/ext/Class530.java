package ext;

public class Class530 {
   private Class709[] field_317 = new Class709[1024];
   private int field_2516 = 0;

   public Class709 method_1561(Class709 var1) {
      if (var1.field_320 >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      }

      if (this.field_2516 == this.field_317.length) {
         Class709[] var2 = new Class709[this.field_2516 << 1];
         System.arraycopy(this.field_317, 0, var2, 0, this.field_2516);
         this.field_317 = var2;
      }

      this.field_317[this.field_2516] = var1;
      var1.field_320 = this.field_2516;
      this.method_554(this.field_2516++);
      return var1;
   }

   public void method_111() {
      this.field_2516 = 0;
   }

   public Class709 method_803() {
      Class709 var1 = this.field_317[0];
      this.field_317[0] = this.field_317[--this.field_2516];
      this.field_317[this.field_2516] = null;
      if (this.field_2516 > 0) {
         this.method_1130(0);
      }

      var1.field_320 = -1;
      return var1;
   }

   public void method_653(Class709 var1, float var2) {
      float var3 = var1.field_2221;
      var1.field_2221 = var2;
      if (var2 < var3) {
         this.method_554(var1.field_320);
      } else {
         this.method_1130(var1.field_320);
      }
   }

   private void method_554(int var1) {
      Class709 var2 = this.field_317[var1];
      float var4 = var2.field_2221;

      while (var1 > 0) {
         int var3 = var1 - 1 >> 1;
         Class709 var5 = this.field_317[var3];
         if (var4 >= var5.field_2221) {
            break;
         }

         this.field_317[var1] = var5;
         var5.field_320 = var1;
         var1 = var3;
      }

      this.field_317[var1] = var2;
      var2.field_320 = var1;
   }

   private void method_1130(int var1) {
      Class709 var2 = this.field_317[var1];
      float var3 = var2.field_2221;

      while (true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if (var4 >= this.field_2516) {
            break;
         }

         Class709 var6 = this.field_317[var4];
         float var7 = var6.field_2221;
         Class709 var8;
         float var9;
         if (var5 >= this.field_2516) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.field_317[var5];
            var9 = var8.field_2221;
         }

         if (var7 < var9) {
            if (var7 >= var3) {
               break;
            }

            this.field_317[var1] = var6;
            var6.field_320 = var1;
            var1 = var4;
         } else {
            if (var9 >= var3) {
               break;
            }

            this.field_317[var1] = var8;
            var8.field_320 = var1;
            var1 = var5;
         }
      }

      this.field_317[var1] = var2;
      var2.field_320 = var1;
   }

   public boolean method_466() {
      return this.field_2516 == 0;
   }
}
