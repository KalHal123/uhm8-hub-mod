package srv;

public class Class368 {
   private Class317 field_11;
   public Class41 field_1188;
   private float field_203;
   private float field_825 = 0.0F;
   private int field_361 = 0;
   private float field_32 = 0.0F;
   private int field_114;
   private int field_200;
   private int field_590;

   public Class368(Class317 var1) {
      this.field_11 = var1;
   }

   public void method_943(int var1, int var2, int var3) {
      int var4 = this.field_11.method_813(var1, var2, var3);
      if (var4 > 0 && this.field_825 == 0.0F) {
         Class371.field_57[var4].method_130(this.field_11, var1, var2, var3, this.field_1188);
      }

      if (var4 > 0 && Class371.field_57[var4].method_826(this.field_1188) >= 1.0F) {
         this.method_39(var1, var2, var3);
      }
   }

   public void method_286() {
      this.field_825 = 0.0F;
      this.field_361 = 0;
   }

   public void method_431(int var1, int var2, int var3, int var4) {
      if (this.field_361 > 0) {
         this.field_361--;
      } else if (var1 == this.field_114 && var2 == this.field_200 && var3 == this.field_590) {
         int var5 = this.field_11.method_813(var1, var2, var3);
         if (var5 == 0) {
            return;
         }

         Class371 var6 = Class371.field_57[var5];
         this.field_825 = this.field_825 + var6.method_826(this.field_1188);
         this.field_32++;
         if (this.field_825 >= 1.0F) {
            this.method_39(var1, var2, var3);
            this.field_825 = 0.0F;
            this.field_203 = 0.0F;
            this.field_32 = 0.0F;
            this.field_361 = 5;
         }
      } else {
         this.field_825 = 0.0F;
         this.field_203 = 0.0F;
         this.field_32 = 0.0F;
         this.field_114 = var1;
         this.field_200 = var2;
         this.field_590 = var3;
      }
   }

   public boolean method_658(int var1, int var2, int var3) {
      Class371 var4 = Class371.field_57[this.field_11.method_813(var1, var2, var3)];
      int var5 = this.field_11.method_929(var1, var2, var3);
      boolean var6 = this.field_11.method_226(var1, var2, var3, 0);
      if (var4 != null && var6) {
         var4.method_43(this.field_11, var1, var2, var3, var5);
      }

      return var6;
   }

   public boolean method_39(int var1, int var2, int var3) {
      int var4 = this.field_11.method_813(var1, var2, var3);
      int var5 = this.field_11.method_929(var1, var2, var3);
      boolean var6 = this.method_658(var1, var2, var3);
      Class150 var7 = this.field_1188.method_941();
      if (var7 != null) {
         var7.method_629(var4, var1, var2, var3);
         if (var7.field_1497 == 0) {
            var7.method_537(this.field_1188);
            this.field_1188.method_118();
         }
      }

      if (var6 && this.field_1188.method_11(Class371.field_57[var4])) {
         Class371.field_57[var4].method_363(this.field_11, var1, var2, var3, var5);
      }

      return var6;
   }

   public boolean method_741(Class41 var1, Class317 var2, Class150 var3, int var4, int var5, int var6, int var7) {
      int var8 = var2.method_813(var4, var5, var6);
      return var8 > 0 && Class371.field_57[var8].method_265(var2, var4, var5, var6, var1)
         ? true
         : (var3 == null ? false : var3.method_481(var1, var2, var4, var5, var6, var7));
   }
}
