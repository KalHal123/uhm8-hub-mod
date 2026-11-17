package srv;

public class Class234 extends Class21 {
   public boolean field_981 = true;
   public int field_1312;
   public int field_1431;

   public Class234(int var1, int var2, Class111 var3, boolean var4) {
      super(var1, var2, var3, var4);
      this.field_1312 = var1;
      this.field_1431 = var2;
   }

   @Override
   public int method_897(Interface351 var1, int var2, int var3, int var4, int var5) {
      return this.field_981 ? this.field_1431 : 160;
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      Class150 var6 = var5.field_783.method_40();
      if (var6 == null) {
         this.field_981 = !this.field_981;
         var1.method_226(var2, var3, var4, this.field_1312);
         return true;
      } else {
         return false;
      }
   }
}
