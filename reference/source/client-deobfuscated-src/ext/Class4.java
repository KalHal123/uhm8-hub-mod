package ext;

public class Class4 extends Class666 {
   int field_3152;

   public Class4(int var1, int var2, int var3) {
      super(var1, var2);
      this.field_3152 = var3;
   }

   @Override
   public int method_1005(Interface698 var1, int var2, int var3, double var4, double var6, double var8) {
      if (!Class310.field_2660) {
         if (var1 == null) {
            return this.field_2972;
         }

         Class457 var10 = var1.method_1805().method_1497((int)var4, (int)var8, Class457.Inner598.field_2556);
         if (var10 != null) {
            switch (var10.method_1691()) {
               case 1:
               case 2:
                  return this.field_3152;
               default:
                  return this.field_2972;
            }
         } else {
            return this.field_2972;
         }
      } else {
         return this.field_2972;
      }
   }
}
