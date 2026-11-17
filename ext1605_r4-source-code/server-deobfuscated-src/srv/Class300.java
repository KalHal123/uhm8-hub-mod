package srv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class Class300 {
   public static Logger field_136 = Logger.getLogger("Minecraft");
   public List<Class188> field_1197 = new ArrayList<>();
   private MinecraftServer field_886;
   private Class160 field_888;
   private int field_630;
   private Set<String> field_1594 = new HashSet<>();
   private Set<String> field_873 = new HashSet<>();
   private Set<String> field_179 = new HashSet<>();
   private File field_243;
   private File field_226;
   private File field_1052;
   private Class186 field_1366;

   public Class300(MinecraftServer var1) {
      this.field_886 = var1;
      this.field_243 = var1.method_915("banned-players.txt");
      this.field_226 = var1.method_915("banned-ips.txt");
      this.field_1052 = var1.method_915("ops.txt");
      this.field_888 = new Class160(var1);
      this.field_630 = var1.field_573.method_296("max-players", 20);
      this.method_832();
      this.method_768();
      this.method_33();
      this.method_670();
      this.method_35();
      this.method_667();
   }

   public void method_588(Class325 var1) {
      this.field_1366 = new Class186(new File(var1.field_194, "players"));
   }

   public int method_200() {
      return this.field_888.method_308();
   }

   public void method_673(Class188 var1) {
      this.field_1197.add(var1);
      this.field_1366.method_634(var1);
      this.field_886.field_445.field_326.method_783((int)var1.field_1324 >> 4, (int)var1.field_1321 >> 4);

      while (this.field_886.field_445.method_893(var1, var1.field_106).size() != 0) {
         var1.method_732(var1.field_1324, var1.field_632 + 1.0, var1.field_1321);
      }

      this.field_886.field_445.method_237(var1);
      this.field_888.method_687(var1);
   }

   public void method_204(Class188 var1) {
      this.field_888.method_456(var1);
   }

   public void method_1009(Class188 var1) {
      this.field_888.method_596(var1);
      this.field_1366.method_702(var1);
      this.field_886.field_445.method_649(var1);
      this.field_1197.remove(var1);
   }

   public Class188 method_987(Class75 var1, String var2, String var3) {
      if (this.field_1594.contains(var2.trim().toLowerCase())) {
         var1.method_858("You are banned from this server!");
         return null;
      }

      String var4 = var1.field_781.method_778().toString();
      var4 = var4.substring(var4.indexOf("/") + 1);
      var4 = var4.substring(0, var4.indexOf(":"));
      if (this.field_873.contains(var4)) {
         var1.method_858("Your IP address is banned from this server!");
         return null;
      }

      if (this.field_1197.size() >= this.field_630) {
         var1.method_858("The server is full!");
         return null;
      }

      for (int var5 = 0; var5 < this.field_1197.size(); var5++) {
         Class188 var6 = this.field_1197.get(var5);
         if (var6.field_1477.equalsIgnoreCase(var2)) {
            var6.field_1439.method_28("You logged in from another location");
         }
      }

      return new Class188(this.field_886, this.field_886.field_445, var2, new Class368(this.field_886.field_445));
   }

   public void method_926() throws IOException {
      this.field_888.method_724();
   }

   public void method_213(int var1, int var2, int var3) {
      this.field_888.method_432(var1, var2, var3);
   }

   public void method_676(Class318 var1) {
      for (int var2 = 0; var2 < this.field_1197.size(); var2++) {
         Class188 var3 = this.field_1197.get(var2);
         var3.field_1439.method_571(var1);
      }
   }

   public String method_436() {
      String var1 = "";

      for (int var2 = 0; var2 < this.field_1197.size(); var2++) {
         if (var2 > 0) {
            var1 = var1 + ", ";
         }

         var1 = var1 + this.field_1197.get(var2).field_1477;
      }

      return var1;
   }

   public void method_98(String var1) {
      this.field_1594.add(var1.toLowerCase());
      this.method_670();
   }

   public void method_750(String var1) {
      this.field_1594.remove(var1.toLowerCase());
      this.method_670();
   }

   private void method_832() {
      try {
         this.field_1594.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.field_243));
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            this.field_1594.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         field_136.warning("Failed to load ban list: " + var3);
      }
   }

   private void method_670() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.field_243, false));

         for (String var3 : this.field_1594) {
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         field_136.warning("Failed to save ban list: " + var4);
      }
   }

   public void method_92(String var1) {
      this.field_873.add(var1.toLowerCase());
      this.method_35();
   }

   public void method_751(String var1) {
      this.field_873.remove(var1.toLowerCase());
      this.method_35();
   }

   private void method_768() {
      try {
         this.field_873.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.field_226));
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            this.field_873.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         field_136.warning("Failed to load ip ban list: " + var3);
      }
   }

   private void method_35() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.field_226, false));

         for (String var3 : this.field_873) {
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         field_136.warning("Failed to save ip ban list: " + var4);
      }
   }

   public void method_94(String var1) {
      this.field_179.add(var1.toLowerCase());
      this.method_667();
   }

   public void method_392(String var1) {
      this.field_179.remove(var1.toLowerCase());
      this.method_667();
   }

   private void method_33() {
      try {
         this.field_179.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.field_1052));
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            this.field_179.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         field_136.warning("Failed to load ip ban list: " + var3);
      }
   }

   private void method_667() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.field_1052, false));

         for (String var3 : this.field_179) {
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         field_136.warning("Failed to save ip ban list: " + var4);
      }
   }

   public boolean method_841(String var1) {
      return this.field_179.contains(var1.trim().toLowerCase());
   }

   public Class188 method_410(String var1) {
      for (int var2 = 0; var2 < this.field_1197.size(); var2++) {
         Class188 var3 = this.field_1197.get(var2);
         if (var3.field_1477.equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void method_616(String var1, String var2) {
      Class188 var3 = this.method_410(var1);
      if (var3 != null) {
         var3.field_1439.method_571(new Class197(var2));
      }
   }

   public void method_904(String var1) {
      Class197 var2 = new Class197(var1);

      for (int var3 = 0; var3 < this.field_1197.size(); var3++) {
         Class188 var4 = this.field_1197.get(var3);
         if (this.method_841(var4.field_1477)) {
            var4.field_1439.method_571(var2);
         }
      }
   }

   public boolean method_377(String var1, Class318 var2) {
      Class188 var3 = this.method_410(var1);
      if (var3 != null) {
         var3.field_1439.method_571(var2);
         return true;
      } else {
         return false;
      }
   }

   public void method_1028(int var1, int var2, int var3, Class66 var4) {
      this.field_888.method_115(new Class381(var1, var2, var3, var4), var1, var2, var3);
   }

   public void method_508() {
      for (int var1 = 0; var1 < this.field_1197.size(); var1++) {
         this.field_1366.method_702(this.field_1197.get(var1));
      }
   }

   public void method_639(Class318 var1, double var2, double var4, double var6, int var8) {
      ArrayList var9 = new ArrayList<>(
         this.field_886.field_445.method_494(Class188.class, Class94.method_971(var2 - var8, var4 - var8, var6 - var8, var2 + var8, var4 + var8, var6 + var8))
      );
      if (!var9.isEmpty()) {
         for (Class188 var11 : var9) {
            this.method_377(var11.field_1477, var1);
         }
      }
   }
}
