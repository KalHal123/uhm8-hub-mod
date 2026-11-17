package srv;

import java.io.IOException;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class Class124 extends Class191 implements Interface286 {
   public static Logger field_680 = Logger.getLogger("Minecraft");
   public Class363 field_1242;
   public boolean field_858 = false;
   public MinecraftServer field_163;
   private Class188 field_320;
   private int field_746 = 0;
   private double field_18;
   private double field_1536;
   private double field_679;
   private boolean field_824 = true;
   private Class150 field_1102 = null;
   public int field_286 = -1;

   public Class124(MinecraftServer var1, Class363 var2, Class188 var3) {
      this.field_163 = var1;
      this.field_1242 = var2;
      var2.method_804(this);
      this.field_320 = var3;
      var3.field_1439 = this;
   }

   public void method_30() throws IOException {
      this.field_1242.method_2();
      if (this.field_746++ % 20 == 0) {
         this.field_1242.method_287(new Class174());
      }
   }

   public void method_28(String var1) {
      this.field_1242.method_287(new Class4(var1));
      this.field_1242.method_934();
      this.field_163.field_1096.method_1009(this.field_320);
      this.field_858 = true;
   }

   @Override
   public void method_127(Class320 var1) {
      if (!this.field_824) {
         double var2 = var1.field_587 - this.field_1536;
         if (var1.field_1336 == this.field_18 && var2 * var2 < 0.01 && var1.field_847 == this.field_679) {
            this.field_824 = true;
         }
      }

      if (this.field_824) {
         this.field_18 = this.field_320.field_1324;
         this.field_1536 = this.field_320.field_632;
         this.field_679 = this.field_320.field_1321;
         double var21 = this.field_320.field_1324;
         double var4 = this.field_320.field_632;
         double var6 = this.field_320.field_1321;
         float var8 = this.field_320.field_909;
         float var9 = this.field_320.field_427;
         if (var1.field_126) {
            var21 = var1.field_1336;
            var4 = var1.field_587;
            var6 = var1.field_847;
            double var10 = var1.field_1383 - var1.field_587;
            if (var10 > 1.65 || var10 < 0.1) {
               this.method_28("Illegal stance");
               field_680.warning(this.field_320.field_1477 + " had an illegal stance: " + var10);
            }

            this.field_320.field_718 = var1.field_1383;
         }

         if (var1.field_953) {
            var8 = var1.field_787;
            var9 = var1.field_362;
         }

         this.field_320.method_874();
         this.field_320.field_458 = 0.0F;
         this.field_320.method_831(this.field_18, this.field_1536, this.field_679, var8, var9);
         double var22 = var21 - this.field_320.field_1324;
         double var12 = var4 - this.field_320.field_632;
         double var14 = var6 - this.field_320.field_1321;
         float var16 = 0.0625F;
         boolean var17 = this.field_163.field_445.method_893(this.field_320, this.field_320.field_106.method_303().method_101(var16, var16, var16)).size() == 0;
         this.field_320.method_956(var22, var12, var14);
         var22 = var21 - this.field_320.field_1324;
         var12 = var4 - this.field_320.field_632;
         if (var12 > -0.5 || var12 < 0.5) {
            var12 = 0.0;
         }

         var14 = var6 - this.field_320.field_1321;
         double var18 = var22 * var22 + var12 * var12 + var14 * var14;
         boolean var20 = false;
         this.field_320.method_831(var21, var4, var6, var8, var9);
         this.field_320.field_199 = var1.field_341;
         this.field_163.field_1096.method_204(this.field_320);
      }
   }

   public void method_93(double var1, double var3, double var5, float var7, float var8) {
      this.field_824 = false;
      this.field_18 = var1;
      this.field_1536 = var3;
      this.field_679 = var5;
      this.field_320.method_831(var1, var3, var5, var7, var8);
      this.field_320.field_1439.method_571(new Class288(var1, var3 + 1.62F, var3, var5, var7, var8, false));
   }

   @Override
   public void method_82(Class289 var1) {
      this.field_320.field_783.field_1172[this.field_320.field_783.field_435] = this.field_1102;
      boolean var2 = this.field_163.field_445.field_1512 = this.field_163.field_1096.method_841(this.field_320.field_1477);
      boolean var3 = var1.field_1009 == 0 || var1.field_1009 == 1;
      if (var3) {
         double var4 = this.field_320.field_632;
         this.field_320.field_632 = this.field_320.field_718;
         Class3 var6 = this.field_320.method_618(4.0, 1.0F);
         this.field_320.field_632 = var4;
         if (var6 == null) {
            return;
         }

         if (var6.field_870 != var1.field_1077 || var6.field_1055 != var1.field_227 || var6.field_1037 != var1.field_1543 || var6.field_273 != var1.field_1597) {
            return;
         }
      }

      int var18 = var1.field_1077;
      int var5 = var1.field_227;
      int var19 = var1.field_1543;
      int var7 = var1.field_1597;
      int var8 = (int)Class380.method_44(var18 - this.field_163.field_445.field_944);
      int var9 = (int)Class380.method_44(var19 - this.field_163.field_445.field_1535);
      if (var8 > var9) {
         var9 = var8;
      }

      if (var1.field_1009 == 0) {
         if (var9 > 16 || var2) {
            this.field_320.field_1279.method_943(var18, var5, var19);
         }
      } else if (var1.field_1009 == 2) {
         this.field_320.field_1279.method_286();
      } else if (var1.field_1009 == 1) {
         if (var9 > 16 || var2) {
            this.field_320.field_1279.method_431(var18, var5, var19, var7);
         }
      } else if (var1.field_1009 == 3) {
         double var10 = this.field_320.field_1324 - (var18 + 0.5);
         double var12 = this.field_320.field_632 - (var5 + 0.5);
         double var14 = this.field_320.field_1321 - (var19 + 0.5);
         double var16 = var10 * var10 + var12 * var12 + var14 * var14;
         if (var16 < 256.0) {
            this.field_320.field_1439.method_571(new Class352(var18, var5, var19, this.field_163.field_445));
         }
      }

      this.field_163.field_445.field_1512 = false;
   }

   @Override
   public void method_141(Class127 var1) {
      boolean var2 = this.field_163.field_445.field_1512 = this.field_163.field_1096.method_841(this.field_320.field_1477);
      int var3 = var1.field_651;
      int var4 = var1.field_132;
      int var5 = var1.field_1566;
      int var6 = var1.field_550;
      int var7 = (int)Class380.method_44(var3 - this.field_163.field_445.field_944);
      int var8 = (int)Class380.method_44(var5 - this.field_163.field_445.field_1535);
      if (var7 > var8) {
         var8 = var7;
      }

      if (var1.field_550 == 10) {
         this.field_163.field_445.method_226(var3, var4, var5, var1.field_283);
      } else if (var8 > 16 || var2) {
         Class150 var9 = var1.field_283 >= 0 ? new Class150(var1.field_283) : null;
         this.field_320.field_1279.method_741(this.field_320, this.field_163.field_445, var9, var3, var4, var5, var6);
      }

      this.field_320.field_1439.method_571(new Class352(var3, var4, var5, this.field_163.field_445));
      this.field_163.field_445.field_1512 = false;
   }

   @Override
   public void method_61(String var1) {
      if (!this.field_320.field_1477.startsWith("\u0002")) {
         field_680.info(this.field_320.field_1477 + " lost connection: " + var1);
      }

      this.field_163.field_1096.method_1009(this.field_320);
      this.field_858 = true;
   }

   @Override
   public void method_580(Class318 var1) {
      field_680.warning(this.getClass() + " wasn't prepared to deal with a " + var1.getClass());
      this.method_28("Protocol error, unexpected packet");
   }

   public void method_571(Class318 var1) {
      this.field_1242.method_287(var1);
   }

   @Override
   public void method_375(Class18 var1) {
      int var2 = var1.field_1277;
      this.field_320.field_783.field_435 = this.field_320.field_783.field_1172.length - 1;
      if (var2 == 0) {
         this.field_1102 = null;
      } else {
         this.field_1102 = new Class150(var2);
      }

      this.field_320.field_783.field_1172[this.field_320.field_783.field_435] = this.field_1102;
      this.field_163.field_1201.method_374(this.field_320, new Class18(this.field_320.field_331, var2));
   }

   @Override
   public void method_607(Class60 var1) {
      double var2 = var1.field_467 / 32.0;
      double var4 = var1.field_1164 / 32.0;
      double var6 = var1.field_592 / 32.0;
      Class39 var8 = new Class39(this.field_163.field_445, var2, var4, var6, new Class150(var1.field_477, var1.field_356));
      var8.field_607 = var1.field_703 / 128.0;
      var8.field_780 = var1.field_569 / 128.0;
      var8.field_921 = var1.field_1593 / 128.0;
      var8.field_1105 = 10;
      this.field_163.field_445.method_237(var8);
   }

   @Override
   public void method_544(Class197 var1) {
      if (this.field_286 != -1 && !(var1 instanceof Class303)) {
         this.method_28("seclogin::chat_sign FAIL");
      } else if (var1 instanceof Class303 && ((Class303)var1).field_475 != this.field_286) {
         this.method_28("seclogin::chat_verify FAIL");
      } else {
         String var2 = var1.field_1539;
         if (var2.length() > 100) {
            this.method_28("Chat message too long");
         } else {
            var2 = var2.trim();

            for (int var3 = 0; var3 < var2.length(); var3++) {
               if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
                     .indexOf(var2.charAt(var3))
                  < 0) {
                  this.method_28("Illegal characters in chat");
                  return;
               }
            }

            if (var2.startsWith("/")) {
               this.method_326(var2);
            } else {
               String var6 = "<" + this.field_320.field_1477 + "> ";
               var2 = var6 + var2;
               field_680.info(var2);
               if (var1 instanceof Class303) {
                  this.field_163.field_1096.method_676(new Class8(var2, ((Class303)var1).field_475, var6.length(), ((Class303)var1).field_1581));
               } else {
                  this.field_163.field_1096.method_676(new Class197(var2));
               }
            }
         }
      }
   }

   private void method_326(String var1) {
      if (var1.toLowerCase().startsWith("/me ")) {
         var1 = "* " + this.field_320.field_1477 + " " + var1.substring(var1.indexOf(" ")).trim();
         field_680.info(var1);
         this.field_163.field_1096.method_676(new Class197(var1));
      } else if (var1.toLowerCase().startsWith("/spawn")) {
         this.method_93(
            this.field_163.field_445.field_944,
            this.field_163.field_445.field_639,
            this.field_163.field_445.field_1535,
            this.field_320.field_427,
            this.field_320.field_909
         );
      } else if (var1.toLowerCase().startsWith("/tell ")) {
         String[] var2 = var1.split(" ");
         if (var2.length >= 3) {
            var1 = var1.substring(var1.indexOf(" ")).trim();
            var1 = var1.substring(var1.indexOf(" ")).trim();
            var1 = "§7" + this.field_320.field_1477 + " whispers " + var1;
            field_680.info(var1 + " to " + var2[1]);
            if (!this.field_163.field_1096.method_377(var2[1], new Class197(var1))) {
               this.method_571(new Class197("§cThere's no player by that name online."));
            }
         }
      } else if (var1.toLowerCase().equalsIgnoreCase("/home")) {
         field_680.info(this.field_320.field_1477 + " returned home");
         int var8 = this.field_163.field_445.method_641(this.field_163.field_445.field_944, this.field_163.field_445.field_1535);
         this.method_93(this.field_163.field_445.field_944 + 0.5, var8 + 1.5, this.field_163.field_445.field_1535 + 0.5, 0.0F, 0.0F);
      } else if (var1.toLowerCase().equalsIgnoreCase("/iron")) {
         if (MinecraftServer.field_1332.containsKey(this.field_320.field_1477)) {
            field_680.info(this.field_320.field_1477 + " failed to iron!");
            this.method_571(new Class197("§cYou can't /iron again so soon!"));
         } else {
            MinecraftServer.field_1332.put(this.field_320.field_1477, 6000);
            field_680.info(this.field_320.field_1477 + " ironed!");

            for (int var9 = 0; var9 < 4; var9++) {
               this.field_320.method_90(new Class150(Class350.field_849, 1));
            }
         }
      } else if (var1.toLowerCase().equalsIgnoreCase("/wood")) {
         if (MinecraftServer.field_1332.containsKey(this.field_320.field_1477)) {
            field_680.info(this.field_320.field_1477 + " failed to wood!");
            this.method_571(new Class197("§cYou can't /wood again so soon!"));
         } else {
            MinecraftServer.field_1332.put(this.field_320.field_1477, 6000);
            field_680.info(this.field_320.field_1477 + " wooded!");

            for (int var10 = 0; var10 < 4; var10++) {
               this.field_320.method_90(new Class150(Class371.field_330, 1));
            }
         }
      } else if (!this.field_163.field_1096.method_841(this.field_320.field_1477)
         && !this.field_320.field_1477.startsWith("\u0001")
         && !this.field_320.field_1477.startsWith("\u0002")) {
         String var11 = var1.substring(1);
         field_680.info(this.field_320.field_1477 + " tried command: " + var11);
      } else {
         String var3 = var1.substring(1);
         field_680.info(this.field_320.field_1477 + " issued server command: " + var3);
         this.field_163.method_3(var3, this);
      }
   }

   @Override
   public void method_712(Class97 var1) {
      if (var1.field_77 == 1) {
         this.field_320.method_87();
      }
   }

   @Override
   public void method_538(Class4 var1) {
      this.field_1242.method_807("Quitting");
   }

   public int method_313() {
      return this.field_1242.method_12();
   }

   @Override
   public void method_445(String var1) {
      this.method_571(new Class197("§7" + var1));
   }

   @Override
   public String method_337() {
      return this.field_320.field_1477;
   }

   @Override
   public void method_615(Class316 var1) {
      if (var1.field_1471 == -1) {
         this.field_320.field_783.field_1172 = var1.field_506;
      }

      if (var1.field_1471 == -2) {
         this.field_320.field_783.field_441 = var1.field_506;
      }

      if (var1.field_1471 == -3) {
         this.field_320.field_783.field_1319 = var1.field_506;
      }
   }

   public void method_822() {
      this.field_1242.method_287(new Class316(-1, this.field_320.field_783.field_1172));
      this.field_1242.method_287(new Class316(-2, this.field_320.field_783.field_441));
      this.field_1242.method_287(new Class316(-3, this.field_320.field_783.field_1319));
   }

   @Override
   public void method_889(Class381 var1) {
      Class66 var2 = this.field_163.field_445.method_49(var1.field_371, var1.field_864, var1.field_1189);
      if (var2 != null) {
         var2.method_816(var1.field_1489);
         var2.method_766();
      }
   }

   @Override
   public void method_837(Class222 var1) {
      Class43 var2 = var1.field_1458;
      Class43 var3 = var1.field_761;
      long var4 = var2.field_338 > var3.field_338 ? var3.field_338 : var2.field_338;
      long var6 = var2.field_338 > var3.field_338 ? var2.field_338 : var3.field_338;
      long var8 = var2.field_936 > var3.field_936 ? var3.field_936 : var2.field_936;
      long var10 = var2.field_936 > var3.field_936 ? var2.field_936 : var3.field_936;
      long var12 = var2.field_247 > var3.field_247 ? var3.field_247 : var2.field_247;
      long var14 = var2.field_247 > var3.field_247 ? var2.field_247 : var3.field_247;

      for (long var16 = var4; var16 <= var6; var16++) {
         for (long var18 = var8; var18 <= var10; var18++) {
            for (long var20 = var12; var20 <= var14; var20++) {
               this.field_163.field_445.method_226((int)var16, (int)var18, (int)var20, var1.field_625);
            }
         }
      }

      this.field_320.field_1439.method_571(new Class222(var2, var3, var1.field_625));
   }
}
