package ext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class Class348 extends Class8 {
   private boolean field_2165 = false;
   private Class126 field_975;
   public String field_1642;
   private Minecraft field_524;
   private Class192 field_2237;
   private boolean field_2819 = false;
   Random field_128 = new Random();
   public int field_131 = -1;

   public Class348(Minecraft var1, String var2, int var3) throws IOException {
      this.field_524 = var1;
      Socket var4 = new Socket(InetAddress.getByName(var2), var3);
      this.field_975 = new Class126(var4, "Client", this);
   }

   public void method_458() {
      if (!this.field_2165) {
         this.field_975.method_632();
      }
   }

   @Override
   public void method_1112(Class519 var1) {
      this.field_524.field_3103 = new Class118(this.field_524, this);
      this.field_2237 = new Class192(this);
      this.field_2237.field_2994 = true;
      this.field_131 = var1.field_197;
      this.field_524.method_1824(this.field_2237);
      this.field_524.method_1290(new Class341(this));
   }

   @Override
   public void method_624(Class276 var1) {
      double var2 = var1.field_627 / 32.0;
      double var4 = var1.field_1483 / 32.0;
      double var6 = var1.field_184 / 32.0;
      Class198 var8 = new Class198(this.field_2237, var2, var4, var6, new Class334(var1.field_989, var1.field_2768));
      var8.field_2549 = var1.field_384 / 128.0;
      var8.field_2501 = var1.field_244 / 128.0;
      var8.field_489 = var1.field_2595 / 128.0;
      var8.field_593 = var1.field_627;
      var8.field_2175 = var1.field_1483;
      var8.field_2857 = var1.field_184;
      this.field_2237.method_264(var1.field_2867, var8);
   }

   @Override
   public void method_442(Class661 var1) {
      double var2 = var1.field_2447 / 32.0;
      double var4 = var1.field_2527 / 32.0;
      double var6 = var1.field_161 / 32.0;
      Class359 var8 = null;
      if (var1.field_1848 == 10) {
         var8 = new Class527(this.field_2237, var2, var4, var6, 0);
      }

      if (var1.field_1848 == 11) {
         var8 = new Class527(this.field_2237, var2, var4, var6, 1);
      }

      if (var1.field_1848 == 12) {
         var8 = new Class527(this.field_2237, var2, var4, var6, 2);
      }

      if (var1.field_1848 == 1) {
         var8 = new Class256(this.field_2237, var2, var4, var6);
      }

      if (var8 != null) {
         var8.field_593 = var1.field_2447;
         var8.field_2175 = var1.field_2527;
         var8.field_2857 = var1.field_161;
         var8.field_1661 = 0.0F;
         var8.field_2866 = 0.0F;
         var8.field_1767 = var1.field_334;
         this.field_2237.method_264(var1.field_334, var8);
      }
   }

   @Override
   public void method_1079(Class577 var1) {
      double var2 = var1.field_2763 / 32.0;
      double var4 = var1.field_113 / 32.0;
      double var6 = var1.field_2067 / 32.0;
      float var8 = var1.field_2895 * 360 / 256.0F;
      float var9 = var1.field_335 * 360 / 256.0F;
      Class669 var10 = new Class669(this.field_524.field_2648, var1.field_434);
      if (!Class225.field_1719.containsKey(var1.field_434)) {
         this.field_975.method_993(new Class470(var1.field_434));
      }

      var10.field_593 = var1.field_2763;
      var10.field_2175 = var1.field_113;
      var10.field_2857 = var1.field_2067;
      int var11 = var1.field_1335;
      if (var11 == 0) {
         var10.field_559.field_1518[var10.field_559.field_2127] = null;
      } else {
         var10.field_559.field_1518[var10.field_559.field_2127] = new Class334(var11);
      }

      var10.method_1910(var2, var4, var6, var8, var9);
      this.field_2237.method_264(var1.field_1610, var10);
   }

   @Override
   public void method_1099(Class721 var1) {
      Class359 var2 = this.field_2237.method_1094(var1.field_2932);
      if (var2 != null) {
         var2.field_593 = var1.field_2409;
         var2.field_2175 = var1.field_2940;
         var2.field_2857 = var1.field_732;
         double var3 = var2.field_593 / 32.0;
         double var5 = var2.field_2175 / 32.0;
         double var7 = var2.field_2857 / 32.0;
         float var9 = var1.field_2847 * 360 / 256.0F;
         float var10 = var1.field_3119 * 360 / 256.0F;
         var2.method_1551(var3, var5, var7, var9, var10, 3);
      }
   }

   @Override
   public void method_72(Class333 var1) {
      Class359 var2 = this.field_2237.method_1094(var1.field_1828);
      if (var2 != null) {
         var2.field_593 = var2.field_593 + var1.field_1007;
         var2.field_2175 = var2.field_2175 + var1.field_1671;
         var2.field_2857 = var2.field_2857 + var1.field_1527;
         double var3 = var2.field_593 / 32.0;
         double var5 = var2.field_2175 / 32.0;
         double var7 = var2.field_2857 / 32.0;
         float var9 = var1.field_727 ? var1.field_2629 * 360 / 256.0F : var2.field_1661;
         float var10 = var1.field_727 ? var1.field_959 * 360 / 256.0F : var2.field_2866;
         var2.method_1551(var3, var5, var7, var9, var10, 3);
      }
   }

   @Override
   public void method_1603(Class662 var1) {
      this.field_2237.method_484(var1.field_1499);
   }

   @Override
   public void method_772(Class288 var1) {
      Class563 var2 = this.field_524.field_2787;
      double var3 = var2.field_1417;
      double var5 = var2.field_2654;
      double var7 = var2.field_2013;
      float var9 = var2.field_1661;
      float var10 = var2.field_2866;
      if (var1.field_757) {
         var3 = var1.field_2779;
         var5 = var1.field_2898;
         var7 = var1.field_257;
      }

      if (var1.field_60) {
         var9 = var1.field_1768;
         var10 = var1.field_33;
      }

      var2.field_663 = 0.0F;
      var2.field_2549 = var2.field_2501 = var2.field_489 = 0.0;
      var2.method_1910(var3, var5, var7, var9, var10);
      var1.field_2779 = var2.field_1417;
      var1.field_2898 = var2.field_235.field_946;
      var1.field_257 = var2.field_2013;
      var1.field_370 = var2.field_2654;
      this.field_975.method_993(var1);
      if (!this.field_2819) {
         this.field_524.field_2787.field_2553 = this.field_524.field_2787.field_1417;
         this.field_524.field_2787.field_2068 = this.field_524.field_2787.field_2654;
         this.field_524.field_2787.field_1780 = this.field_524.field_2787.field_2013;
         this.field_2819 = true;
         this.field_524.method_1290((Class265)null);
      }
   }

   @Override
   public void method_942(Class617 var1) {
      this.field_2237.method_1613(var1.field_1118, var1.field_2600, var1.field_2555, var1.field_2951);
   }

   @Override
   public void method_363(Class308 var1) {
      Class741 var2 = this.field_2237.method_1474(var1.field_1762, var1.field_1891);
      int var3 = var1.field_1762 * 16;
      int var4 = var1.field_1891 * 16;

      for (int var5 = 0; var5 < var1.field_2169; var5++) {
         short var6 = var1.field_782[var5];
         int var7 = var1.field_1878[var5] & 255;
         byte var8 = var1.field_1441[var5];
         int var9 = var6 >> 12 & 15;
         int var10 = var6 >> 8 & 15;
         int var11 = var6 & 255;
         var2.method_1063(var9, var11, var10, var7, var8);
         this.field_2237.method_1925(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
         this.field_2237.method_1678(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
      }
   }

   @Override
   public void method_748(Class451 var1) {
      this.field_2237
         .method_1925(
            var1.field_1266,
            var1.field_493,
            var1.field_978,
            var1.field_1266 + var1.field_367 - 1,
            var1.field_493 + var1.field_3051 - 1,
            var1.field_978 + var1.field_961 - 1
         );
      this.field_2237.method_359(var1.field_1266, var1.field_493, var1.field_978, var1.field_367, var1.field_3051, var1.field_961, var1.field_2608);
   }

   @Override
   public void method_1666(Class216 var1) {
      this.field_2237.method_733(var1.field_1715, var1.field_2918, var1.field_3074, var1.field_2522, var1.field_2835);
   }

   @Override
   public void method_1241(Class300 var1) {
      this.field_975.method_136("Got kicked");
      this.field_2165 = true;
      this.field_524.method_1824((Class454)null);
      this.field_524.method_1290(new Class384("Disconnected by server", var1.field_1503));
   }

   @Override
   public void method_223(String var1) {
      if (!this.field_2165) {
         this.field_2165 = true;
         this.field_524.method_1824((Class454)null);
         this.field_524.method_1290(new Class384("Connection lost", var1));
      }
   }

   public void method_1519(Class471 var1) {
      if (!this.field_2165) {
         this.field_975.method_993(var1);
      }
   }

   @Override
   public void method_1744(Class747 var1) {
      Class198 var2 = (Class198)this.field_2237.method_1094(var1.field_1772);
      Class377 var3 = (Class377)this.field_2237.method_1094(var1.field_2464);
      if (var3 == null) {
         var3 = this.field_524.field_2787;
      }

      if (var2 != null) {
         this.field_2237.method_1904(var2, "random.pop", 0.2F, ((this.field_128.nextFloat() - this.field_128.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         this.field_524.field_2681.method_206(new Class388(this.field_524.field_2648, var2, var3, -0.5F));
         this.field_2237.method_484(var1.field_1772);
      }
   }

   @Override
   public void method_326(Class583 var1) {
      Class359 var2 = this.field_2237.method_1094(var1.field_983);
      if (var2 != null) {
         Class354 var3 = (Class354)var2;
         int var4 = var1.field_2347;
         if (var4 == 0) {
            var3.field_559.field_1518[var3.field_559.field_2127] = null;
         } else {
            var3.field_559.field_1518[var3.field_559.field_2127] = new Class334(var4);
         }
      }
   }

   @Override
   public void method_643(Class238 var1) {
      if (var1 instanceof Class637 && !((Class637)var1).field_2928) {
         this.field_524.field_964.method_967("WARNING!");
         this.field_524.field_964.method_967("This message is not legitimate.");
      }

      this.field_524.field_964.method_967(var1.field_2363);
   }

   @Override
   public void method_410(Class266 var1) {
      Class359 var2 = this.field_2237.method_1094(var1.field_1760);
      if (var2 != null) {
         Class354 var3 = (Class354)var2;
         var3.method_1385();
      }
   }

   @Override
   public void method_811(Class502 var1) {
      this.field_524.field_2787.field_559.method_572(new Class334(var1.field_1663, var1.field_363, var1.field_3049));
   }

   @Override
   public void method_711(Class209 var1) {
      if (var1.field_1161.equals("-")) {
         if (Class278.field_1860 == null) {
            this.method_1519(new Class519(this.field_524.field_2935.field_382, "Password", 2));
         } else {
            this.method_1519(new Class397(this.field_524.field_2935.field_382, "Password", 2, Class657.field_35));
         }
      } else {
         try {
            URL var2 = new URL(
               "http://www.minecraft.net/game/joinserver.jsp?user="
                  + this.field_524.field_2935.field_382
                  + "&sessionId="
                  + this.field_524.field_2935.field_740
                  + "&serverId="
                  + var1.field_1161
            );
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
            String var4 = var3.readLine();
            var3.close();
            if (var4.equalsIgnoreCase("ok")) {
               this.method_1519(new Class519(this.field_524.field_2935.field_382, "Password", 2));
            } else {
               this.field_975.method_136("Failed to login: " + var4);
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            this.field_975.method_136("Internal client error: " + var5);
         }
      }
   }

   public void method_1742() {
      this.field_2165 = true;
      this.field_975.method_136("Closed");
   }

   @Override
   public void method_1074(Class63 var1) {
      double var2 = var1.field_2653 / 32.0;
      double var4 = var1.field_2536 / 32.0;
      double var6 = var1.field_44 / 32.0;
      float var8 = var1.field_1577 * 360 / 256.0F;
      float var9 = var1.field_827 * 360 / 256.0F;
      Class377 var10 = (Class377)Class174.method_1357(var1.field_1435, this.field_524.field_2648);
      var10.field_593 = var1.field_2653;
      var10.field_2175 = var1.field_2536;
      var10.field_2857 = var1.field_44;
      var10.method_1910(var2, var4, var6, var8, var9);
      var10.field_3080 = true;
      this.field_2237.method_264(var1.field_117, var10);
   }

   @Override
   public void method_335(Class715 var1) {
      this.field_524.field_2648.method_860(var1.field_1394);
   }

   @Override
   public void method_270(Class244 var1) {
      Class563 var2 = this.field_524.field_2787;
      if (var1.field_2671 == -1) {
         var2.field_559.field_1518 = var1.field_3145;
      }

      if (var1.field_2671 == -2) {
         var2.field_559.field_364 = var1.field_3145;
      }

      if (var1.field_2671 == -3) {
         var2.field_559.field_491 = var1.field_3145;
      }
   }

   @Override
   public void method_1630(Class152 var1) {
      Class186 var2 = this.field_2237.method_1303(var1.field_1988, var1.field_982, var1.field_1526);
      if (var2 != null) {
         var2.method_434(var1.field_2215);
         this.field_2237.method_1678(var1.field_1988, var1.field_982, var1.field_1526, var1.field_1988, var1.field_982, var1.field_1526);
      }
   }

   @Override
   public void method_628(Class697 var1) {
      this.field_2237.field_18 = var1.field_1030;
      this.field_2237.field_934 = var1.field_1660;
      this.field_2237.field_1361 = var1.field_286;
      this.field_2237.field_482 = var1.field_766;
   }

   @Override
   public void method_302(Class96 var1) {
      Class723 var2 = new Class723(var1.field_1797);
      var2.field_1532 = var1.field_2109;
      var2.field_2661 = var1.field_2306;
      var2.field_530 = var1.field_2903;
      var2.field_2969 = var1.field_2407;
      var2.field_1864 = var1.field_3140;
      this.field_2237.method_560(var2);
   }

   @Override
   public void method_428(Class603 var1) {
      Class326 var2 = var1.field_948;
      Class326 var3 = var1.field_2188;
      long var4 = Math.min(var2.field_809, var3.field_809);
      long var6 = Math.max(var2.field_809, var3.field_809);
      long var8 = Math.min(var2.field_805, var3.field_805);
      long var10 = Math.max(var2.field_805, var3.field_805);
      long var12 = Math.min(var2.field_3039, var3.field_3039);
      long var14 = Math.max(var2.field_3039, var3.field_3039);

      for (long var16 = var4; var16 <= var6; var16++) {
         for (long var18 = var8; var18 <= var10; var18++) {
            for (long var20 = var12; var20 <= var14; var20++) {
               this.field_2237.method_1481((int)var16, (int)var18, (int)var20, var1.field_1219);
            }
         }
      }
   }

   public void method_1686(Class623 var1) {
      this.field_2237.method_861(var1.field_395, var1.field_2968, var1.field_1239, var1.field_738, var1.field_351, var1.field_1338);
   }

   public void method_127(Class39 var1) {
      this.field_524.field_964.field_936.method_1305(var1.field_2832, var1.field_2713);
   }
}
