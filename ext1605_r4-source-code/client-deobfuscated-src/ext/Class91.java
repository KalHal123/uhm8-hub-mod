package ext;

public class Class91 extends Class755 {
   private int field_2560 = 802;

   public Class91(int var1) {
      super(var1);
      this.field_2438 = 1;
   }

   @Override
   public Class334 method_1566(Class334 var1, Class454 var2, Class354 var3) {
      var2.method_1904(var3, "ext.notif", 1.0F, 1.0F / (field_2073.nextFloat() * 0.4F + 0.8F));
      Class360 var4 = Class119.field_1519.field_964.field_936.field_2435.peek();
      if (var4 == null || var4.field_249 != this.field_2560) {
         Class119.field_1519
            .field_964
            .field_936
            .method_1155(
               "Hours Long Past II \nThen, in a darkness so bright it blinded all who saw it - the world changed.\nWhat once was its surface now lay deep below\nsmothered by ever-young stone and with skies bleeding light far above.\nThe world changed in an instant. A vast new unknown.",
               20000,
               this.field_2560
            );
      }

      return var1;
   }
}
