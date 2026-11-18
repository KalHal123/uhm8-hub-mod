package ext;

public class Class135 extends Class755 {
   private int field_2142 = 804;

   public Class135(int var1) {
      super(var1);
      this.field_2438 = 1;
   }

   @Override
   public Class334 method_1566(Class334 var1, Class454 var2, Class354 var3) {
      var2.method_1904(var3, "ext.notif", 1.0F, 1.0F / (field_2073.nextFloat() * 0.4F + 0.8F));
      Class360 var4 = Class119.field_1519.field_964.field_936.field_2435.peek();
      if (var4 == null || var4.field_249 != this.field_2142) {
         Class119.field_1519
            .field_964
            .field_936
            .method_1155(
               "Hours Long Past IV \nBut far down below, the Old World still lives. Flowers bloom\n with a light stolen from them so long ago\n Moss and fungi grow as trees - just like they would before.\nAnd they will, too, be seen again one day.",
               20000,
               this.field_2142
            );
      }

      return var1;
   }
}
