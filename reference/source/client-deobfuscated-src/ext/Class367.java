package ext;

import java.io.File;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class Class367 extends Class265 {
   protected Class265 field_2852;
   private int field_66 = 0;
   private int field_332 = 32;
   private int field_1959 = this.field_562 - 55 + 4;
   private int field_2397 = 0;
   private int field_1915 = this.field_2345;
   private int field_167 = -2;
   private int field_3002 = -1;
   private String field_2172 = "";
   public Class154 field_1692;

   public Class367(Class265 var1) {
      this.field_2852 = var1;
      this.field_1692 = new Class154(var1.field_3013, "/pack-cover.png", 700.0F);
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class331(5, this.field_2345 / 2 - 154, this.field_562 - 48, "Open Visuals directory"));
      this.field_577.add(new Class331(6, this.field_2345 / 2 + 4, this.field_562 - 48, "Done"));
      this.field_3013.field_1421.method_192();
      this.field_2172 = new File(this.field_3013.field_2093, "texturepacks").getAbsolutePath();
      this.field_332 = 32;
      this.field_1959 = this.field_562 - 58 + 4;
      this.field_2397 = 0;
      this.field_1915 = this.field_2345;
   }

   private void method_49() {
      this.field_3013.field_2176.method_1759();
      Minecraft.field_1677 = true;
      this.field_3013.field_1421.field_602.field_1774.method_909(this.field_3013);
      this.field_3013.field_1541 = new Class640(this.field_3013.field_1754, "/default.png", this.field_3013.field_2176);
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 == 5) {
            Sys.openURL("file://" + this.field_2172);
         }

         if (var1.field_2254 == 6) {
            this.method_49();
            this.field_3013.method_1290(this.field_2852);
         }
      }
   }

   @Override
   protected void method_316(int var1, int var2, int var3) {
      super.method_316(var1, var2, var3);
   }

   @Override
   protected void method_1269(int var1, int var2, int var3) {
      super.method_1269(var1, var2, var3);
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      if (this.field_3002 <= 0) {
         this.field_3013.field_1421.method_192();
         this.field_3002 += 20;
      }

      List var4 = this.field_3013.field_1421.method_887();
      if (Mouse.isButtonDown(0)) {
         if (this.field_167 == -1) {
            if (var2 >= this.field_332 && var2 <= this.field_1959) {
               int var5 = this.field_2345 / 16;
               int var6 = this.field_2345 / 16 + 260;
               int var7 = (var2 - this.field_332 + this.field_66 - 2) / 36;
               if (var1 >= var5 && var1 <= var6 && var7 >= 0 && var7 < var4.size() && this.field_3013.field_1421.method_1194((Class280)var4.get(var7))) {
                  this.field_1692.method_1006("/pack-cover.png");
                  this.method_49();
               }

               this.field_167 = var2;
            } else {
               this.field_167 = -2;
            }
         } else if (this.field_167 >= 0) {
            this.field_66 = this.field_66 - (var2 - this.field_167);
            this.field_167 = var2;
         }
      } else {
         if (this.field_167 >= 0 && this.field_167 == var2) {
         }

         this.field_167 = -1;
      }

      int var15 = var4.size() * 36 - (this.field_1959 - this.field_332 - 4);
      if (var15 < 0) {
         var15 /= 2;
      }

      if (this.field_66 < 0) {
         this.field_66 = 0;
      }

      if (this.field_66 > var15) {
         this.field_66 = var15;
      }

      if (this.field_3013.field_2648 == null) {
         this.field_1692.method_609(this.field_2345, this.field_562);
      }

      GL11.glDisable(2896);
      GL11.glDisable(2912);
      Class368 var16 = Class368.field_2696;

      for (int var17 = 0; var17 < var4.size(); var17++) {
         Class280 var8 = (Class280)var4.get(var17);
         int var9 = this.field_2345 / 16;
         int var10 = 36 + var17 * 36 - this.field_66;
         byte var11 = 32;
         byte var12 = 32;
         if (var8 == this.field_3013.field_1421.field_602) {
            int var13 = var9 - 1;
            int var14 = var13 + 260;
            Class254.method_421(var13 - 2, var10 - 2, var14 + 2, var10 + var11 + 2, -2130706433, 452984831);
            Class254.method_421(var13, var10, var14, var10 + var11, -16777216, -1610612209);
         }

         var8.method_1463(this.field_3013);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var16.method_186();
         var16.method_1748(16777215);
         var16.method_318(var9, var10 + var11, 0.0, 0.0, 1.0);
         var16.method_318(var9 + var12, var10 + var11, 0.0, 1.0, 1.0);
         var16.method_318(var9 + var12, var10, 0.0, 1.0, 0.0);
         var16.method_318(var9, var10, 0.0, 0.0, 0.0);
         var16.method_406();
         Class254.method_773(this.field_1683, var8.field_220, var9 + var12 + 2, var10 + 1, 16777215);
         Class254.method_773(this.field_1683, var8.field_2200, var9 + var12 + 2, var10 + 12, 8421504);
         Class254.method_773(this.field_1683, var8.field_1097, var9 + var12 + 2, var10 + 12 + 10, 8421504);
      }

      byte var18 = 4;
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      GL11.glEnable(3553);
      GL11.glShadeModel(7424);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
      this.method_1491(this.field_1683, "Choose Visuals", this.field_2345 / 2, 16, 16777215);
      this.method_1491(this.field_1683, "(Place Visuals content here)", this.field_2345 / 2 - 77, this.field_562 - 26, 8421504);
      super.method_1938(var1, var2, var3);
   }

   @Override
   public void method_1414() {
      super.method_1414();
      this.field_3002--;
   }

   public void method_305(int var1, int var2, int var3, int var4) {
      Class368 var5 = Class368.field_2696;
      GL11.glBindTexture(3553, this.field_3013.field_2176.method_1545("/dirt.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.method_186();
      var5.method_1880(4210752, var4);
      var5.method_318(0.0, var2, 0.0, 0.0, var2 / var6);
      var5.method_318(this.field_2345, var2, 0.0, this.field_2345 / var6, var2 / var6);
      var5.method_1880(4210752, var3);
      var5.method_318(this.field_2345, var1, 0.0, this.field_2345 / var6, var1 / var6);
      var5.method_318(0.0, var1, 0.0, 0.0, var1 / var6);
      var5.method_406();
   }
}
