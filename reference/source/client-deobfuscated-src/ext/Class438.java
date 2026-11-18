package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class438 {
   private Minecraft field_65;
   private boolean field_326 = false;

   public Class438(Minecraft var1) {
      this.field_65 = var1;
   }

   public void method_1301(int var1, int var2, int var3) {
      int var4 = 32 + var1 * 32;
      GL11.glBindTexture(3553, this.field_65.field_2176.method_1545("/gui/zm_perks.png"));
      Class368.field_2696.method_186();
      Class368.field_2696.method_318(var2, var3, 0.0, var4 / 256.0F, 0.0);
      Class368.field_2696.method_318(var2, var3 + 32, 0.0, var4 / 256.0F, 0.125);
      Class368.field_2696.method_318(var2 + 32, var3 + 32, 0.0, (var4 + 32) / 256.0F, 0.125);
      Class368.field_2696.method_318(var2 + 32, var3, 0.0, (var4 + 32) / 256.0F, 0.0);
      Class368.field_2696.method_406();
   }

   public void method_886(Class273 var1, int var2, int var3) {
      GL11.glDisable(2896);
      Class640 var4 = this.field_65.field_1541;
      Class404 var5 = (Class404)Class119.field_1519.field_2787;
      String var6 = "Wave " + var5.field_979.field_2530;
      Class254.method_773(var4, var6, 10, var3 / 24 * 23, 16777215);
      Class254.method_773(var4, "Points: " + var5.field_2805.method_726(), 10, var3 / 24 * 23 - 38 - 25, 16777215);
      Class254.method_773(
         var4,
         "Zombies left: " + (((Class46)this.field_65.field_2648).field_1152 - ((Class46)this.field_65.field_2648).field_120),
         10,
         var3 / 24 * 23 - 38 - 15,
         16777215
      );
      Class301 var7 = (Class301)this.field_65.field_2787.field_559;
      if (var7.method_93() != null && (var7.method_93().field_1782 == Class50.field_41.field_10 || var7.method_93().field_1782 == Class50.field_3111.field_10)) {
         Class254.method_773(var4, "> " + var7.field_1258, var2 / 12 * 11, var3 / 24 * 23, 16777215);
      }

      byte var8 = 10;

      for (int var9 = 0; var9 != 4; var9++) {
         if (var5.field_2805.method_539(var9 + 1)) {
            this.method_1301(var9, var8, var3 / 24 * 23 - 38);
            var8 += 32;
         }
      }

      if (var5.field_3005 > 0) {
         var1.method_1491(var4, "Reviving " + this.field_65.field_2787.field_1716 + "...", var2 / 2, var3 / 4, 16777215);
         GL11.glDisable(2896);
         Class254.method_421(var2 / 2 - 100 - 1, var3 / 2 - 30 - 1, var2 / 2 - 100 + 200 + 1, var3 / 2 - 30 + 5 + 1, -14671840, -16777216);
         int var13 = 100 - var5.field_3005;
         int var10 = 16777215;
         int var11 = 12303291;
         int var12 = (int)(200.0F * (var13 / 100.0F));
         Class254.method_421(var2 / 2 - 100, var3 / 2 - 30, var2 / 2 - 100 + var12, var3 / 2 - 30 + 5, var10, -var11);
      } else if (var5.field_2587 != null) {
         var1.method_1491(var4, var5.field_2587.method_752(var5, var5.field_2801), var2 / 2, var3 / 4 * 3, 16777215);
      }

      if (this.field_326) {
         byte var14 = 40;
         int var15 = 0;

         for (Class191 var17 : ((Class46)this.field_65.field_2648).field_2027) {
            Class254.method_773(
               var4, "[" + var15++ + "] X:" + (int)var17.field_1417 + ", Y:" + (int)var17.field_2654 + ", Z:" + (int)var17.field_2013, 5, var14, 16777215
            );
            var14 += 10;
         }
      }
   }
}
