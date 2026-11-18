package srv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class Class160 {
   private List field_291 = new ArrayList();
   private Class232 field_773 = new Class232();
   private List field_985 = new ArrayList();
   private MinecraftServer field_400;

   public Class160(MinecraftServer var1) {
      this.field_400 = var1;
   }

   public void method_724() throws IOException {
      for (int var1 = 0; var1 < this.field_985.size(); var1++) {
         ((Class355)this.field_985.get(var1)).method_91();
      }

      this.field_985.clear();
   }

   private Class355 method_4(int var1, int var2, boolean var3) {
      long var4 = var1 + 2147483647L | var2 + 2147483647L << 32;
      Class355 var6 = (Class355)this.field_773.method_679(var4);
      if (var6 == null && var3) {
         var6 = new Class355(this, var1, var2);
         this.field_773.method_614(var4, var6);
      }

      return var6;
   }

   public void method_115(Class318 var1, int var2, int var3, int var4) {
      int var5 = var2 >> 4;
      int var6 = var4 >> 4;
      Class355 var7 = this.method_4(var5, var6, false);
      if (var7 != null) {
         var7.method_936(var1);
      }
   }

   public void method_432(int var1, int var2, int var3) {
      int var4 = var1 >> 4;
      int var5 = var3 >> 4;
      Class355 var6 = this.method_4(var4, var5, false);
      if (var6 != null) {
         var6.method_651(var1 & 15, var2, var3 & 15);
      }
   }

   public void method_687(Class188 var1) {
      if (!var1.field_1477.startsWith("\u0002")) {
         if (var1.field_1477.startsWith("\u0001")) {
            this.field_400.field_1096.method_676(new Class197("§eConnection from unknown client [\\###.###.###.###]"));
         } else {
            this.field_400.field_1096.method_676(new Class197("§e" + var1.field_1477 + " joined the game."));
         }
      }

      int var2 = (int)var1.field_1324 >> 4;
      int var3 = (int)var1.field_1321 >> 4;
      var1.field_1445 = var1.field_1324;
      var1.field_548 = var1.field_1321;

      for (int var4 = var2 - 10; var4 <= var2 + 10; var4++) {
         for (int var5 = var3 - 10; var5 <= var3 + 10; var5++) {
            this.method_4(var4, var5, true).method_267(var1);
         }
      }

      this.field_291.add(var1);
   }

   public void method_596(Class188 var1) {
      if (!var1.field_1477.startsWith("\u0002")) {
         if (var1.field_1477.startsWith("\u0001")) {
            this.field_400.field_1096.method_676(new Class197("§eleft"));
         } else {
            this.field_400.field_1096.method_676(new Class197("§e" + var1.field_1477 + " left the game."));
         }
      }

      int var2 = (int)var1.field_1324 >> 4;
      int var3 = (int)var1.field_1321 >> 4;

      for (int var4 = var2 - 10; var4 <= var2 + 10; var4++) {
         for (int var5 = var3 - 10; var5 <= var3 + 10; var5++) {
            Class355 var6 = this.method_4(var4, var5, false);
            if (var6 != null) {
               var6.method_860(var1);
            }
         }
      }

      this.field_291.remove(var1);
   }

   private boolean method_306(int var1, int var2, int var3, int var4) {
      int var5 = var1 - var3;
      int var6 = var2 - var4;
      return var5 >= -10 && var5 <= 10 ? var6 >= -10 && var6 <= 10 : false;
   }

   public void method_456(Class188 var1) {
      int var2 = (int)var1.field_1324 >> 4;
      int var3 = (int)var1.field_1321 >> 4;
      double var4 = var1.field_1445 - var1.field_1324;
      double var6 = var1.field_548 - var1.field_1321;
      double var8 = var4 * var4 + var6 * var6;
      if (var8 >= 64.0) {
         int var10 = (int)var1.field_1445 >> 4;
         int var11 = (int)var1.field_548 >> 4;
         int var12 = var2 - var10;
         int var13 = var3 - var11;
         if (var12 != 0 || var13 != 0) {
            for (int var14 = var2 - 10; var14 <= var2 + 10; var14++) {
               for (int var15 = var3 - 10; var15 <= var3 + 10; var15++) {
                  if (!this.method_306(var14, var15, var10, var11)) {
                     this.method_4(var14, var15, true).method_267(var1);
                  }

                  if (!this.method_306(var14 - var12, var15 - var13, var2, var3)) {
                     Class355 var16 = this.method_4(var14 - var12, var15 - var13, false);
                     if (var16 != null) {
                        var16.method_860(var1);
                     }
                  }
               }
            }

            var1.field_1445 = var1.field_1324;
            var1.field_548 = var1.field_1321;
         }
      }
   }

   public int method_308() {
      return 144;
   }

   static MinecraftServer method_196(Class160 var0) {
      return var0.field_400;
   }

   static Class232 method_80(Class160 var0) {
      return var0.field_773;
   }

   static List method_97(Class160 var0) {
      return var0.field_985;
   }
}
