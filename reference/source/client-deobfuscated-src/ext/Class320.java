package ext;

public class Class320 extends Class755 {
   private int field_303 = 805;

   public Class320(int var1) {
      super(var1);
      this.field_2438 = 1;
   }

   @Override
   public Class334 method_1566(Class334 var1, Class454 var2, Class354 var3) {
      var2.method_1904(var3, "ext.notif", 1.0F, 1.0F / (field_2073.nextFloat() * 0.4F + 0.8F));
      Class360 var4 = Class119.field_1519.field_964.field_936.field_2435.peek();
      if (var4 == null || var4.field_249 != this.field_303) {
         Class119.field_1519
            .field_964
            .field_936
            .method_1155(
               "The One True Book \nIn the end, this world was for you, and when you shall turn away\nIt will remember. Its past. Your present.\nAnd both will rest, knowing that they will inspire each other\n carrying pieces further forth.\nSo that all shall be well, and all matter of thing shall be well, in the end.\nAgainst all odds, just you wait. ",
               20000,
               this.field_303
            );
      }

      return var1;
   }
}
