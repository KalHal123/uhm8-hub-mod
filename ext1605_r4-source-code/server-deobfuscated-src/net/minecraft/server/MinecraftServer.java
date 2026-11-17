package net.minecraft.server;

import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import srv.Class107;
import srv.Class15;
import srv.Class150;
import srv.Class180;
import srv.Class188;
import srv.Class197;
import srv.Class225;
import srv.Class284;
import srv.Class300;
import srv.Class325;
import srv.Class350;
import srv.Class36;
import srv.Class47;
import srv.Class49;
import srv.Class7;
import srv.Class85;
import srv.Class94;
import srv.Class99;
import srv.Interface116;
import srv.Interface286;
import srv.JComponent140;
import srv.Thread157;
import srv.Thread311;
import srv.Thread59;

public class MinecraftServer implements Interface286, Runnable {
   public static Logger field_603 = Logger.getLogger("Minecraft");
   public static HashMap<String, Integer> field_1332 = new HashMap<>();
   public Class225 field_722;
   public Class7 field_573;
   public Class325 field_445;
   public Class300 field_1096;
   private boolean field_1530 = true;
   public boolean field_745 = false;
   int field_14 = 0;
   public String field_1267;
   public int field_46;
   private List<Interface116> field_1062 = new ArrayList<>();
   private List<Class85> field_55 = Collections.synchronizedList(new ArrayList<>());
   public Class15 field_1201;
   public boolean field_1221;
   public static MinecraftServer field_667;

   public MinecraftServer() {
      new Thread59(this);
   }

   private boolean method_857() throws IOException {
      Thread311 var1 = new Thread311(this);
      var1.setDaemon(true);
      var1.start();
      Class107.method_982();
      field_603.info("Starting minecraft server version 0.2.1-16.05-R4");
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         field_603.warning("**** NOT ENOUGH RAM!");
         field_603.warning("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      field_603.info("Loading properties");
      this.field_573 = new Class7(new File("server.properties"));
      String var2 = this.field_573.method_708("server-ip", "");
      this.field_1221 = this.field_573.method_284("online-mode", false);
      InetAddress var3 = null;
      if (var2.length() > 0) {
         var3 = InetAddress.getByName(var2);
      }

      int var4 = this.field_573.method_296("server-port", 25565);
      field_603.info("Starting Minecraft server on " + (var2.length() == 0 ? "*" : var2) + ":" + var4);

      try {
         this.field_722 = new Class225(this, var3, var4);
      } catch (IOException var6) {
         field_603.warning("**** FAILED TO BIND TO PORT!");
         field_603.log(Level.WARNING, "The exception was: " + var6.toString());
         field_603.warning("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.field_1221) {
         field_603.warning("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         field_603.warning("The server will make no attempt to authenticate usernames. Beware.");
         field_603.warning(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         field_603.warning("To change this, set \"online-mode\" to \"true\" in the server.settings file.");
      }

      Class49.method_411();
      this.field_1096 = new Class300(this);
      this.field_1201 = new Class15(this);
      String var5 = this.field_573.method_708("level-name", "world");
      field_603.info("Preparing level \"" + var5 + "\"");
      this.method_206(var5);
      field_603.info("Done! For help, type \"help\" or \"?\"");
      return true;
   }

   private void method_206(String var1) {
      field_603.info("Preparing start region");
      this.field_445 = new Class325(new File("."), var1, this.field_573.method_284("monsters", false));
      this.field_445.method_681(new Class180(this));
      this.field_445.field_1549 = 1;
      this.field_1096.method_588(this.field_445);
      byte var2 = 10;

      for (int var3 = -var2; var3 <= var2; var3++) {
         this.method_16("Preparing spawn area", (var3 + var2) * 100 / (var2 + var2 + 1));

         for (int var4 = -var2; var4 <= var2; var4++) {
            if (!this.field_1530) {
               return;
            }

            this.field_445.field_326.method_783((this.field_445.field_944 >> 4) + var3, (this.field_445.field_1535 >> 4) + var4);
         }
      }

      this.method_19();
   }

   private void method_16(String var1, int var2) {
      this.field_1267 = var1;
      this.field_46 = var2;
      System.out.println(var1 + ": " + var2 + "%");
   }

   private void method_19() {
      this.field_1267 = null;
      this.field_46 = 0;
   }

   private void method_336() {
      field_603.info("Saving chunks");
      this.field_445.method_332(true, null);
   }

   private void method_1007() {
      field_603.info("Stop from");
      new Exception().printStackTrace();
      field_603.info("Stopping server");
      if (this.field_1096 != null) {
         this.field_1096.method_508();
      }

      if (this.field_445 != null) {
         this.method_336();
      }
   }

   public void method_909() {
      this.field_1530 = false;
   }

   @Override
   public void run() {
      try {
         this.field_1530 = true;
         if (this.method_857()) {
            long var1 = System.currentTimeMillis();
            long var3 = 0L;

            while (this.field_1530) {
               long var5 = System.currentTimeMillis();
               long var7 = var5 - var1;
               if (var7 > 2000L) {
                  field_603.warning("Can't keep up! Did the system time change, or is the server overloaded?");
                  var7 = 2000L;
               }

               if (var7 < 0L) {
                  field_603.warning("Time ran backwards! Did the system time change?");
                  var7 = 0L;
               }

               var3 += var7;
               var1 = var5;

               while (var3 > 50L) {
                  var3 -= 50L;
                  this.method_683();
               }

               Thread.sleep(1L);
            }
         } else {
            while (this.field_1530) {
               this.method_785();

               try {
                  Thread.sleep(10L);
               } catch (InterruptedException var10) {
                  var10.printStackTrace();
               }
            }
         }
      } catch (Exception var11) {
         var11.printStackTrace();
         field_603.log(Level.SEVERE, "Unexpected exception", var11);

         while (this.field_1530) {
            this.method_785();

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var9) {
               var9.printStackTrace();
            }
         }
      }

      field_603.info(this.field_1530 + ", " + this.field_745);
      this.method_1007();
      this.field_745 = true;
      System.exit(2);
   }

   private void method_683() throws IOException {
      ArrayList var1 = new ArrayList();

      for (String var3 : field_1332.keySet()) {
         int var4 = field_1332.get(var3);
         if (var4 > 0) {
            field_1332.put(var3, var4 - 1);
         } else {
            var1.add(var3);
         }
      }

      for (int var6 = 0; var6 < var1.size(); var6++) {
         field_1332.remove(var1.get(var6));
      }

      Class94.method_166();
      Class47.method_957();
      this.field_14++;
      if (this.field_14 % 20 == 0) {
         this.field_1096.method_676(new Class99(this.field_445.field_301));
      }

      this.field_445.method_70();

      while (this.field_445.method_25()) {
      }

      this.field_445.method_569();
      this.field_722.method_269();
      this.field_1096.method_926();
      this.field_1201.method_861();

      for (int var7 = 0; var7 < this.field_1062.size(); var7++) {
         this.field_1062.get(var7).method_955();
      }

      try {
         this.method_785();
      } catch (Exception var5) {
         field_603.log(Level.WARNING, "Unexpected exception while parsing console command", var5);
      }
   }

   public void method_3(String var1, Interface286 var2) {
      this.field_55.add(new Class85(var1, var2));
   }

   public void method_785() {
      while (this.field_55.size() > 0) {
         Class85 var1 = this.field_55.remove(0);
         String var2 = var1.field_379;
         Interface286 var3 = var1.field_748;
         String var4 = var3.method_337();
         if (var2.toLowerCase().startsWith("help") || var2.toLowerCase().startsWith("?")) {
            var3.method_445("To run the server without a gui, start it like this:");
            var3.method_445("   java -Xmx1024M -Xms1024M -jar minecraft_server.jar nogui");
            var3.method_445("Console commands:");
            var3.method_445("   help  or  ?               shows this message");
            var3.method_445("   kick <player>             removes a player from the server");
            var3.method_445("   ban <player>              bans a player from the server");
            var3.method_445("   pardon <player>           pardons a banned player so that they can connect again");
            var3.method_445("   ban-ip <ip>               bans an IP address from the server");
            var3.method_445("   pardon-ip <ip>            pardons a banned IP address so that they can connect again");
            var3.method_445("   op <player>               turns a player into an op");
            var3.method_445("   deop <player>             removes op status from a player");
            var3.method_445("   tp <player1> <player2>    moves one player to the same location as another player");
            var3.method_445("   give <player> <id> [num]  gives a player a resource");
            var3.method_445("   tell <player> <message>   sends a private message to a player");
            var3.method_445("   stop                      gracefully stops the server");
            var3.method_445("   save-all                  forces a server-wide level save");
            var3.method_445("   save-off                  disables terrain saving (useful for backup scripts)");
            var3.method_445("   save-on                   re-enables terrain saving");
            var3.method_445("   list                      lists all currently connected players");
            var3.method_445("   say <message>             broadcasts a message to all players");
         } else if (var2.toLowerCase().startsWith("list")) {
            var3.method_445("Connected players: " + this.field_1096.method_436());
         } else if (var2.toLowerCase().startsWith("stop")) {
            this.method_276(var4, "Stopping the server..");
            this.field_1530 = false;
         } else if (var2.toLowerCase().startsWith("save-all")) {
            this.method_276(var4, "Forcing save..");
            this.field_445.method_332(true, null);
            this.method_276(var4, "Save complete.");
         } else if (var2.toLowerCase().startsWith("save-off")) {
            this.method_276(var4, "Disabling level saving..");
            this.field_445.field_1150 = true;
         } else if (var2.toLowerCase().startsWith("save-on")) {
            this.method_276(var4, "Enabling level saving..");
            this.field_445.field_1150 = false;
         } else if (var2.toLowerCase().startsWith("time ")) {
            try {
               this.field_445.field_301 = Long.parseLong(var2.substring(5));
               this.method_276(var4, "Setting time to " + this.field_445.field_301);
            } catch (Exception var12) {
               this.method_276(var4, "Invalid time value");
            }
         } else if (var2.toLowerCase().startsWith("playmus ")) {
            String var25 = var2.substring(8);
            this.field_1096.method_676(new Class284(var25));
            this.method_276(var4, "Playing music for all players: " + var25);
         } else if (var2.toLowerCase().startsWith("sysmsg ")) {
            String var24 = var2.substring(7);
            this.field_1096.method_676(new Class36(var24, 10000));
         } else if (var2.toLowerCase().startsWith("amoung")) {
            this.field_1096.method_676(new Class197("§d" + var4 + " HAS AN IMPORTANT ANNOUNCEMENT TO MAKE"));
            this.field_1096.method_676(new Class197("§d<" + var4 + ">   ####"));
            this.field_1096.method_676(new Class197("§d<" + var4 + "> ###   #"));
            this.field_1096.method_676(new Class197("§d<" + var4 + "> ######"));
            this.field_1096.method_676(new Class197("§d<" + var4 + ">  ## ##"));
            this.field_1096.method_676(new Class197("§dTHANK YOU FOR YOUR ATTENTION"));
         } else if (var2.toLowerCase().startsWith("op ")) {
            String var23 = var2.substring(var2.indexOf(" ")).trim();
            this.field_1096.method_94(var23);
            this.method_276(var4, "Opping " + var23);
            this.field_1096.method_616(var23, "§eYou are now op!");
         } else if (var2.toLowerCase().startsWith("deop ")) {
            String var22 = var2.substring(var2.indexOf(" ")).trim();
            this.field_1096.method_392(var22);
            this.field_1096.method_616(var22, "§eYou are no longer op!");
            this.method_276(var4, "De-opping " + var22);
         } else if (var2.toLowerCase().startsWith("ban-ip ")) {
            String var21 = var2.substring(var2.indexOf(" ")).trim();
            this.field_1096.method_92(var21);
            this.method_276(var4, "Banning ip " + var21);
         } else if (var2.toLowerCase().startsWith("pardon-ip ")) {
            String var20 = var2.substring(var2.indexOf(" ")).trim();
            this.field_1096.method_751(var20);
            this.method_276(var4, "Pardoning ip " + var20);
         } else if (var2.toLowerCase().startsWith("ban ")) {
            String var19 = var2.substring(var2.indexOf(" ")).trim();
            this.field_1096.method_98(var19);
            this.method_276(var4, "Banning " + var19);
            Class188 var27 = this.field_1096.method_410(var19);
            if (var27 != null) {
               var27.field_1439.method_28("Banned by admin");
            }
         } else if (var2.toLowerCase().startsWith("pardon ")) {
            String var18 = var2.substring(var2.indexOf(" ")).trim();
            this.field_1096.method_750(var18);
            this.method_276(var4, "Pardoning " + var18);
         } else if (var2.toLowerCase().startsWith("kick ")) {
            String var5 = var2.substring(var2.indexOf(" ")).trim();
            Class188 var26 = null;

            for (int var30 = 0; var30 < this.field_1096.field_1197.size(); var30++) {
               Class188 var32 = this.field_1096.field_1197.get(var30);
               if (var32.field_1477.equalsIgnoreCase(var5)) {
                  var26 = var32;
               }
            }

            if (var26 != null) {
               var26.field_1439.method_28("Kicked by admin");
               this.method_276(var4, "Kicking " + var26.field_1477);
            } else {
               var3.method_445("Can't find user " + var5 + ". No kick.");
            }
         } else if (var2.toLowerCase().startsWith("tp ")) {
            String[] var29 = var2.split(" ");
            if (var29.length == 3) {
               Class188 var6 = this.field_1096.method_410(var29[1]);
               Class188 var31 = this.field_1096.method_410(var29[2]);
               if (var6 == null) {
                  var3.method_445("Can't find user " + var29[1] + ". No tp.");
               } else if (var31 == null) {
                  var3.method_445("Can't find user " + var29[2] + ". No tp.");
               } else {
                  var6.field_1439.method_93(var31.field_1324, var31.field_632, var31.field_1321, var31.field_909, var31.field_427);
                  this.method_276(var4, "Teleporting " + var29[1] + " to " + var29[2] + ".");
               }
            } else {
               var3.method_445("Syntax error, please provice a source and a target.");
            }
         } else if (var2.toLowerCase().startsWith("give ")) {
            String[] var28 = var2.split(" ");
            if (var28.length != 3 && var28.length != 4) {
               return;
            }

            String var9 = var28[1];
            Class188 var8 = this.field_1096.method_410(var9);
            if (var8 != null) {
               try {
                  int var10 = Integer.parseInt(var28[2]);
                  if (Class350.field_218[var10] != null) {
                     this.method_276(var4, "Giving " + var8.field_1477 + " some " + var10);
                     int var11 = 1;
                     if (var28.length > 3) {
                        var11 = this.method_767(var28[3], 1);
                     }

                     if (var11 < 1) {
                        var11 = 1;
                     }

                     if (var11 > 64) {
                        var11 = 64;
                     }

                     var8.method_90(new Class150(var10, var11));
                  } else {
                     var3.method_445("There's no item with id " + var10);
                  }
               } catch (NumberFormatException var13) {
                  var3.method_445("There's no item with id " + var28[2]);
               }
            } else {
               var3.method_445("Can't find user " + var9);
            }
         } else if (var2.toLowerCase().startsWith("say ")) {
            var2 = var2.substring(var2.indexOf(" ")).trim();
            field_603.info("[" + var4 + "] " + var2);
            this.field_1096.method_676(new Class197("§d[Server] " + var2));
         } else if (var2.toLowerCase().startsWith("tell ")) {
            String[] var7 = var2.split(" ");
            if (var7.length >= 3) {
               var2 = var2.substring(var2.indexOf(" ")).trim();
               var2 = var2.substring(var2.indexOf(" ")).trim();
               field_603.info("[" + var4 + "->" + var7[1] + "] " + var2);
               this.field_1096.method_676(new Class197("§d[Server] " + var2));
               var2 = "§7" + var4 + " whispers " + var2;
               field_603.info(var2);
               if (!this.field_1096.method_377(var7[1], new Class197(var2))) {
                  var3.method_445("There's no player by that name online.");
               }
            }
         } else {
            field_603.info("Unknown console command. Type \"help\" for help.");
         }
      }
   }

   private void method_276(String var1, String var2) {
      String var3 = var1 + ": " + var2;
      this.field_1096.method_904("§7(" + var3 + ")");
      field_603.info(var3);
   }

   private int method_767(String var1, int var2) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
         return var2;
      }
   }

   public void method_470(Interface116 var1) {
      this.field_1062.add(var1);
   }

   public static void main(String[] var0) {
      try {
         field_667 = new MinecraftServer();
         if (!GraphicsEnvironment.isHeadless() && (var0.length <= 0 || !var0[0].equals("nogui"))) {
            JComponent140.method_700(field_667);
         }

         new Thread157("Server thread", field_667).start();
      } catch (Exception var2) {
         field_603.log(Level.SEVERE, "Failed to start the minecraft server", var2);
      }
   }

   public File method_915(String var1) {
      return new File(var1);
   }

   @Override
   public void method_445(String var1) {
      field_603.info(var1);
   }

   @Override
   public String method_337() {
      return "CONSOLE";
   }

   public static boolean method_360(MinecraftServer var0) {
      return var0.field_1530;
   }
}
