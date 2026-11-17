package ext;

import org.lwjgl.input.Keyboard;

public class Class573 extends Class265 {
   private String field_1222 = "";
   private int field_538 = 0;

   @Override
   public void method_836() {
      Keyboard.enableRepeatEvents(true);
   }

   @Override
   public void method_796() {
      Keyboard.enableRepeatEvents(false);
   }

   @Override
   public void method_1414() {
      this.field_538++;
   }

   @Override
   protected void method_437(char var1, int var2) {
      if (var2 == 1) {
         this.field_3013.method_1290((Class265)null);
      } else if (var2 == 28) {
         String var3 = this.field_1222.trim();
         if (var3.length() > 0) {
            this.field_3013.field_2787.method_413(this.field_1222.trim());
            Class119.field_139.method_1672("dc:" + this.field_1222);
         }

         this.field_3013.method_1290((Class265)null);
      } else {
         if (var2 == 14 && this.field_1222.length() > 0) {
            this.field_1222 = this.field_1222.substring(0, this.field_1222.length() - 1);
         }

         if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
                  .indexOf(var1)
               >= 0
            && this.field_1222.length() < 100) {
            this.field_1222 = this.field_1222 + var1;
         }
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      method_194(2, this.field_562 - 14, this.field_2345 - 2, this.field_562 - 2, Integer.MIN_VALUE);
      method_773(this.field_1683, "> " + this.field_1222 + (this.field_538 / 6 % 2 == 0 ? "_" : ""), 4, this.field_562 - 12, 14737632);
   }

   @Override
   protected void method_316(int var1, int var2, int var3) {
      if (var3 == 0 && this.field_3013.field_964.field_2626 != null) {
         if (this.field_1222.length() > 0 && !this.field_1222.endsWith(" ")) {
            this.field_1222 = this.field_1222 + " ";
         }

         this.field_1222 = this.field_1222 + this.field_3013.field_964.field_2626;
         byte var4 = 100;
         if (this.field_1222.length() > var4) {
            this.field_1222 = this.field_1222.substring(0, var4);
         }
      }
   }
}
