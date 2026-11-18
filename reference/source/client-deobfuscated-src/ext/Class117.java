package ext;

public class Class117 extends Class755 {
   private int field_2103 = 803;

   public Class117(int var1) {
      super(var1);
      this.field_2438 = 1;
   }

   @Override
   public Class334 method_1566(Class334 var1, Class454 var2, Class354 var3) {
      var2.method_1904(var3, "ext.notif", 1.0F, 1.0F / (field_2073.nextFloat() * 0.4F + 0.8F));
      Class360 var4 = Class119.field_1519.field_964.field_936.field_2435.peek();
      if (var4 == null || var4.field_249 != this.field_2103) {
         Class119.field_1519
            .field_964
            .field_936
            .method_1155(
               "Hours Long Past III \nCities of stone and glass wrought as a mindless fascimile of an\n unknowable land. Cubes of steel forged from ancient beasts littering seas.\nUnder the sun - and the newborn blood-stars -\n a new world rests, pristine, without history.",
               20000,
               this.field_2103
            );
      }

      return var1;
   }
}
