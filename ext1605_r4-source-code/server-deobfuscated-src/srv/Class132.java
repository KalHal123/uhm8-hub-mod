package srv;

public class Class132 extends Class371 {
   protected Class132(int var1, int var2) {
      super(var1, var2, Class111.field_1200);
   }

   @Override
   public int method_310(int var1) {
      return this.field_1137 + (var1 == 1 ? 1 : 0);
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      int var6 = var1.method_929(var2, var3, var4);
      if (var6 > 0) {
         this.method_752(var1, var2, var3, var4, var6);
         return true;
      } else {
         return false;
      }
   }

   public void method_752(Class317 var1, int var2, int var3, int var4, int var5) {
      var1.method_307((String)null, var2, var3, var4);
      var1.method_489(var2, var3, var4, 0);
      int var6 = Class350.field_182.field_473 + var5 - 1;
      float var7 = 0.7F;
      double var8 = var1.field_413.nextFloat() * var7 + (1.0F - var7) * 0.5;
      double var10 = var1.field_413.nextFloat() * var7 + (1.0F - var7) * 0.2 + 0.6;
      double var12 = var1.field_413.nextFloat() * var7 + (1.0F - var7) * 0.5;
      Class39 var14 = new Class39(var1, var2 + var8, var3 + var10, var4 + var12, new Class150(var6));
      var14.field_1105 = 10;
      var1.method_237(var14);
   }

   @Override
   public void method_838(Class317 var1, int var2, int var3, int var4, int var5, float var6) {
      if (!var1.field_906) {
         if (var5 > 0) {
            this.method_752(var1, var2, var3, var4, var5);
         }

         super.method_838(var1, var2, var3, var4, var5, var6);
      }
   }
}
