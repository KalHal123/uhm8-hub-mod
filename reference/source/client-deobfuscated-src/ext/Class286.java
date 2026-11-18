package ext;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class Class286 extends Class265 {
   protected String field_1102 = "Edit sign message:";
   private Class243 field_928;
   private int field_174;
   private int field_2643 = 0;

   public Class286(Class243 var1) {
      this.field_928 = var1;
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      Keyboard.enableRepeatEvents(true);
      this.field_577.add(new Class423(0, this.field_2345 / 2 - 100, this.field_562 / 4 + 120, "Done"));
   }

   @Override
   public void method_796() {
      Keyboard.enableRepeatEvents(false);
   }

   @Override
   public void method_1414() {
      this.field_174++;
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143 && var1.field_2254 == 0) {
         this.field_928.method_430();
         this.field_3013.method_1290((Class265)null);
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
      if (var2 == 200) {
         this.field_2643 = this.field_2643 - 1 & 3;
      }

      if (var2 == 208 || var2 == 28) {
         this.field_2643 = this.field_2643 + 1 & 3;
      }

      if (var2 == 14 && this.field_928.field_585[this.field_2643].length() > 0) {
         this.field_928.field_585[this.field_2643] = this.field_928.field_585[this.field_2643]
            .substring(0, this.field_928.field_585[this.field_2643].length() - 1);
      }

      if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
               .indexOf(var1)
            >= 0
         && this.field_928.field_585[this.field_2643].length() < 15) {
         this.field_928.field_585[this.field_2643] = this.field_928.field_585[this.field_2643] + var1;
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, this.field_1102, this.field_2345 / 2, 40, 16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef(this.field_2345 / 2, this.field_562 / 2, 50.0F);
      float var4 = 93.75F;
      GL11.glScalef(-var4, -var4, -var4);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      Class108 var5 = this.field_928.method_1438();
      if (var5 == Class108.field_1115) {
         float var6 = this.field_928.method_1664() * 360 / 16.0F;
         GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
      } else {
         int var8 = this.field_928.method_1664();
         float var7 = 0.0F;
         if (var8 == 2) {
            var7 = 180.0F;
         }

         if (var8 == 4) {
            var7 = 90.0F;
         }

         if (var8 == 5) {
            var7 = -90.0F;
         }

         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
      }

      if (this.field_174 / 6 % 2 == 0) {
         this.field_928.field_2581 = this.field_2643;
      }

      Class402.field_1178.method_1126(this.field_928, -0.5, -0.75, -0.5, 0.0F);
      this.field_928.field_2581 = -1;
      GL11.glPopMatrix();
      super.method_1938(var1, var2, var3);
   }
}
