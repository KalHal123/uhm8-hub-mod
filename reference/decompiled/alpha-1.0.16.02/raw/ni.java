import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class ni extends bd {
   protected String a = "Edit sign message:";
   private nn h;
   private int i;
   private int k = 0;

   public ni(nn var1) {
      this.h = var1;
   }

   @Override
   public void a() {
      this.e.clear();
      Keyboard.enableRepeatEvents(true);
      this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 120, "Done"));
   }

   @Override
   public void h() {
      Keyboard.enableRepeatEvents(false);
   }

   @Override
   public void g() {
      this.i++;
   }

   @Override
   protected void a(fb var1) {
      if (var1.e) {
         if (var1.d == 0) {
            this.h.d();
            this.b.a((bd)null);
         }
      }
   }

   @Override
   protected void a(char var1, int var2) {
      if (var2 == 200) {
         this.k = this.k - 1 & 3;
      }

      if (var2 == 208 || var2 == 28) {
         this.k = this.k + 1 & 3;
      }

      if (var2 == 14 && this.h.a[this.k].length() > 0) {
         this.h.a[this.k] = this.h.a[this.k].substring(0, this.h.a[this.k].length() - 1);
      }

      if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
               .indexOf(var1)
            >= 0
         && this.h.a[this.k].length() < 15) {
         this.h.a[this.k] = this.h.a[this.k] + var1;
      }
   }

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.a, this.c / 2, 40, 16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef(this.c / 2, this.d / 2, 50.0F);
      float var4 = 93.75F;
      GL11.glScalef(-var4, -var4, -var4);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      ln var5 = this.h.f();
      if (var5 == ln.aD) {
         float var6 = this.h.e() * 360 / 16.0F;
         GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
      } else {
         int var8 = this.h.e();
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

      if (this.i / 6 % 2 == 0) {
         this.h.b = this.k;
      }

      fq.a.a(this.h, -0.5, -0.75, -0.5, 0.0F);
      this.h.b = -1;
      GL11.glPopMatrix();
      super.a(var1, var2, var3);
   }
}
