package net.minecraft.client;

import ext.Class100;
import ext.Class108;
import ext.Class114;
import ext.Class119;
import ext.Class157;
import ext.Class172;
import ext.Class187;
import ext.Class194;
import ext.Class214;
import ext.Class225;
import ext.Class23;
import ext.Class250;
import ext.Class251;
import ext.Class262;
import ext.Class265;
import ext.Class273;
import ext.Class277;
import ext.Class278;
import ext.Class28;
import ext.Class310;
import ext.Class317;
import ext.Class324;
import ext.Class334;
import ext.Class337;
import ext.Class366;
import ext.Class368;
import ext.Class373;
import ext.Class384;
import ext.Class395;
import ext.Class398;
import ext.Class404;
import ext.Class411;
import ext.Class432;
import ext.Class443;
import ext.Class454;
import ext.Class457;
import ext.Class46;
import ext.Class469;
import ext.Class478;
import ext.Class487;
import ext.Class494;
import ext.Class504;
import ext.Class53;
import ext.Class531;
import ext.Class548;
import ext.Class563;
import ext.Class567;
import ext.Class573;
import ext.Class580;
import ext.Class582;
import ext.Class597;
import ext.Class599;
import ext.Class614;
import ext.Class630;
import ext.Class640;
import ext.Class642;
import ext.Class655;
import ext.Class663;
import ext.Class678;
import ext.Class687;
import ext.Class693;
import ext.Class703;
import ext.Class728;
import ext.Class731;
import ext.Class749;
import ext.Class754;
import ext.Class89;
import ext.Class92;
import ext.Enum554;
import ext.Error314;
import ext.Minecraft43;
import ext.RuntimeException415;
import ext.Thread226;
import ext.Thread227;
import ext.Thread62;
import ext.Thread683;
import ext.WindowAdapter336;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public abstract class Minecraft implements Runnable {
   public Class663 field_3103;
   public static Minecraft field_1737;
   public boolean field_122 = false;
   public int field_2517;
   public int field_2477;
   private Class92 field_1965;
   private Class28 field_48 = new Class28(20.0F);
   public Class454 field_2648;
   public Class411 field_1265;
   public Class563 field_2787;
   public Class443 field_2681;
   public Class277 field_2935 = null;
   public String field_571;
   public Canvas field_2017;
   public boolean field_3131 = true;
   public volatile boolean field_1465 = false;
   public Class432 field_2176;
   public Class640 field_1541;
   public Class265 field_1883 = null;
   public Class251 field_2577 = new Class251(this);
   public Class398 field_1455 = new Class398(this);
   public Thread62 field_1720;
   private int field_234 = 0;
   private int field_2794 = 0;
   private int field_2085;
   private int field_1437;
   public String field_79 = null;
   public int field_1331 = 0;
   public Class273 field_964;
   public boolean field_2350 = false;
   public Class567 field_821 = new Class567(0.0F);
   public Class366 field_864 = null;
   public Class693 field_1754;
   protected MinecraftApplet field_2052;
   public Class53 field_485 = new Class53();
   public Class548 field_2679;
   public File field_2093;
   public static long[] field_3102 = new long[512];
   public static int field_856 = 0;
   private String field_2524;
   private int field_2422;
   private Class687 field_826 = new Class687();
   private Class250 field_544 = new Class250();
   private static File field_1648 = null;
   public static boolean field_1305 = false;
   public volatile boolean field_649 = true;
   public String field_71 = "";
   long field_2706 = -1L;
   public boolean field_1449 = false;
   private int field_750 = 0;
   public boolean field_1310 = false;
   long field_601 = System.currentTimeMillis();
   private int field_1032 = 0;
   public Component field_1267;
   public Class337 field_1421;
   public Class478 field_267;
   public boolean field_741 = true;
   public long field_2927 = System.currentTimeMillis();
   public static boolean field_2639 = true;
   public final String[] field_458 = new String[]{
      "cb5c516ad379ee341929afe9b9d1498e4d82442d3d3dbb24bb3e6c082a785d75", "17f7a8e98e3b017d4bb168b57196f59a2c44f875ce8bba38086576ee3080e0a0"
   };
   public final String[] field_1011 = new String[]{"36d528f3eaed8d3e413c571e7eb67037", "117b71e2dbed9440a000f742a9c7636a"};
   public String field_1155 = "";
   public static boolean field_1601 = false;
   public static String field_1094 = Class614.method_1576(Class614.field_1949);
   private final String field_1142 = "11(NtBreak)/11-023-ship "
      + (
         Minecraft43.class.getSimpleName().contains("MinecraftImpl")
            ? "(non-obf.)"
            : (Minecraft43.class.getSimpleName().length() < 3 ? "(lv1obf.)" : "(lv2obf.)")
      );
   public static int field_866 = 0;
   public int field_372 = 0;
   public Class23 field_813 = new Class23();
   public static boolean field_885 = true;
   public static String field_2719;
   public static boolean field_1677 = false;

   public Minecraft(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6) {
      this.field_2085 = var4;
      this.field_1437 = var5;
      this.field_122 = var6;
      this.field_2052 = var3;
      new Thread226(this, "Timer hack thread");
      this.field_2017 = var2;
      this.field_2517 = var4;
      this.field_2477 = var5;
      this.field_122 = var6;
      this.field_1267 = var1;
      Class119.method_717(this);
      Class278.method_1490();
      if (!System.getProperty("os.name").contains("indows")) {
         Class100.field_1534.set(0, "file://" + System.getProperty(Class614.method_1576(Class614.field_517), ".") + "/.minecraft/skincache/");
      }
   }

   public abstract void method_869(Class655 var1);

   public void method_1871(String var1, int var2) {
      this.field_2524 = var1;
      this.field_2422 = var2;
   }

   public void method_976(String var1, String var2) {
      Class187 var3 = new Class187(this.field_2517, this.field_2477);
      int var4 = var3.method_351();
      this.field_1541.method_1870(var1, 10, var4 - 40, 16777215);
      this.field_1541.method_1870(var2, 10, var4 - 25, 16777215);
   }

   public void method_1708() {
      if (!new File(method_1379() + "/firstlaunch").exists()) {
         switch (this.field_2935.field_382.toLowerCase()) {
            case "andrewidot":
            case "anon-alpha-afil":
            case "philalphaver":
            case "digenuine":
               Sys.alert("Why... Why are there...", "Penises?");
               break;
            case "zigzag2608":
               Sys.alert("Hey hun, it's Andrew!", "Not sure if you'll ever see this, but remember I love you very much <3\nMwah!");
               break;
            case "theobi1":
               Sys.alert(
                  "Prepare thyself!",
                  "Ahh... Free at last. O Gabriel. Now dawns thy reckoning, and thy gore shall glisten before the temples of man. Creature of steel... My gratitude upon thee for my freedom, but the crimes thy kind have committed against humanity are NOT forgotten. And thy punishment... is DEATH."
               );
               break;
            case "buj_itself":
               Sys.alert("insert creative window title here", "r4sepad when");
               break;
            case "retrogamingnow":
               Sys.alert("Hi Retro!", "AlphaVer Part 3 when?");
               break;
            case "liminalityyy":
            case "kollinkollin":
            case "illudens":
               Sys.alert("oops", "wrong arg fam");
               break;
            case "oceanharte":
            case "cntrpl":
            case "cntrpl2":
               Sys.alert("Hey.", "Sorry you had to suffer 2 years for this, but, thank you for everything.");
               break;
            case "vladg24":
               Sys.alert("woag", "alphaver wiki-ing");
               break;
            case "ossyflawol":
               Sys.alert("portal 2", "portal 2");
               break;
            case "rollnway":
               Sys.alert("uhm erm erm uh uhm", "yeah");
               break;
            case "skullkeks":
               Sys.alert("Message from the devs", "May the Haiza be with you...");
               break;
            case "bolternon":
               Sys.alert("GIVE US MORE WOMEN", "MMM I NEED WOMEN THE WOMEN YES YES WOMEN YEAH WOMEN WOOOOOOOOOOOOOOOOO");
               break;
            case "gnawmon":
               Sys.alert("hey", "thanks for that translator");
               break;
            case "dispensa":
               Sys.alert("holy shit...", "my data is gonna transmission..........");
               break;
            case "dargh":
               Sys.alert("dev6 isnt breedable", "but the true question is: can chester give decent sloppy toppy?");
               break;
            case "cheatosphere64":
               Sys.alert("uhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "my stars are shimmering");
               break;
            case "unnaturalistic":
               Sys.alert("hey", "you're cool");
               break;
            case "bobbies1":
               Sys.alert("BREASTS???", "TITTIES?!?!?!");
               break;
            case "bortimer":
               Sys.alert("yo", "your textures are cool :+1:");
               break;
            case "jeffdakillax3":
               Sys.alert("hey", "you're silly :3");
               break;
            case "marina234":
               Sys.alert("hey", "herman hesse shall strike you down");
               break;
            case "gamemasterpdx":
               Sys.alert("fyi", "dev16's splash text is canon now lol");
               break;
            case "dottych":
               Sys.alert("mrrp meow :3", "dotty if you dont know what this does we dont either");
               break;
            case "vkcom":
               Sys.alert("do rap", "gun gun bullet no no bullet gun yeah");
               break;
            case "smaed":
               Sys.alert("insert creative window title here", "r4uj when");
               break;
            case "erdbeerbaerlp":
               Sys.alert("hi server guy", "we referenced your server in video 4");
               break;
            case "uncrossedpanic4":
               Sys.alert("Hey!", "I'm Watching You!");
               break;
            case "___afk":
               Sys.alert("john", "john time");
               break;
            case "shiny_emerald":
               Sys.alert("here's a riddle", "what's the opposite of dominant?");
               break;
            case "sul4":
               Sys.alert("M3554G3 FR0M D3VC0L0N :3", "1'M 1N Y0UR C0MPUT3R N0W L0LZ!!! >X3");
               break;
            case "fruitybot":
               Sys.alert("HIIII PEPPERMIN!!!!T", "AAAAAAAAAAAAAAAAAAAAAAAA");
               break;
            case "phil564":
               Sys.alert("3 mintue of alphaver when", "275 minute of alphaquest");
               break;
            case "sheer":
               Sys.alert("(we are so sorry for referencing this)", "You're not a minecrafter... you're not a person...");
               break;
            case "dycam99":
               Sys.alert("altairvega", "alternative vagina jumpscare");
               break;
            case "vivivern":
            case "orble":
            case "orbl":
            case "bug_nation":
            case "bugnation":
            case "js_sam1999":
            case "kerkan1994":
            case "xorcist6898":
            case "samurai_2001":
            case "machinerage":
               method_1638("https://youtu.be/V4d0Qp9YF2I?si=o4HJG230zUUAJzIJ&t=438");
               break;
            case "herobrine":
               Sys.alert("DiGenuine/Phil says:", "Why are there penises?");
               break;
            case "unfortun8":
            case "biggenux":
            case "deveightloper":
               Sys.alert("meow mrrp :3", "mew mew purr nya mrryah meow :3");
               break;
            case "philbreadkins":
            case "phil_breadkins":
            case "breadkins":
               Sys.alert("DiGenuine/Phil says:", "Seems like you got the wrong Phil. The work awaits...");
               break;
            case "watchingthing":
               Sys.alert("So, you've seen it too, have you not?", "The sky, devouring itself - burning with a fever most divine");
               break;
            case "queen":
               Sys.alert("So, how does it feel?", "Your vastness, unfurled, condemned, contained? No more broken laws.");
               break;
            case "rain":
            case "dawnbreather":
               Sys.alert("Welcome, O, One Who Cleanses Wounds.", "Even if you were inevitable, you were awaited.");
               break;
            case "clemence":
               Sys.alert("Rest, now.", "There's nowhere to hurry anymore.");
               break;
            case "brokenblade":
               Sys.alert("Oh how sonorous is the ring of steel", "Falling to the ground - in broken shards");
               break;
            case "devel0per":
            case "deve1oper":
            case "devel2per":
            case "d3veloper":
            case "develo4per":
            case "devel5er":
            case "develop6r":
            case "deve7oper":
            case "spooksthewookz57":
            case "dug_fleez":
            case "kyubey34":
            case "kyub":
            case "wyvern621":
            case "cardjitsu2005":
            case "cs_jam2000":
            case "mark101":
            case "jamieplayzmc":
            case "author":
            case "director":
            case "00071":
            case "2008score":
            case "d1":
            case "d2":
            case "d13":
            case "the father":
            case "jstar":
            case "lloyd":
            case "the mother":
            case "nguyen":
            case "thenamesbond_123":
            case "theoneandonly_hb":
            case "saw_13":
            case "seven":
            case "smith":
            case "spirethebuilder10":
            case "testtest123abc":
            case "thatkingopizza":
            case "xxmastercheef_reef2001xx":
            case "salvoil":
            case "electric9001":
            case "theblue_warrier":
            case "8ball_luck":
            case "_where_":
            case "equipmental":
            case "shrugxxl":
            case "deluxewish":
            case "frilvman":
            case "j4zzdistrict":
            case "jack_wowo":
            case "misian_de_que":
            case "qrobin42":
            case "a0":
            case "a1":
            case "a11":
            case "a67":
            case "andrewgaming67":
            case "grasswalker15":
            case "holdtheflame":
               Sys.alert("Well this is weird...", "Are you sure you're supposed to be here?");
               break;
            default:
               return;
         }

         try {
            new File(method_1379() + "/firstlaunch").createNewFile();
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   public static void method_1638(String var0) {
      try {
         Desktop.getDesktop().browse(new URL(var0).toURI());
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void method_259() throws LWJGLException {
      if (this.field_2017 != null) {
         Graphics var1 = this.field_2017.getGraphics();
         if (var1 != null) {
            var1.setColor(Color.BLACK);
            var1.fillRect(0, 0, this.field_2517, this.field_2477);
            var1.dispose();
         }

         Display.setParent(this.field_2017);
      } else if (this.field_122) {
         Display.setFullscreen(true);
         this.field_2517 = Display.getDisplayMode().getWidth();
         this.field_2477 = Display.getDisplayMode().getHeight();
         if (this.field_2517 <= 0) {
            this.field_2517 = 1;
         }

         if (this.field_2477 <= 0) {
            this.field_2477 = 1;
         }
      } else {
         Display.setDisplayMode(new DisplayMode(this.field_2517, this.field_2477));
      }

      Display.setTitle("Minecraft Minecraft Alpha v1.0.16.05");
      PixelFormat var14 = new PixelFormat();
      var14 = var14.withDepthBits(24);

      try {
         Display.create(var14);
      } catch (LWJGLException var12) {
         var12.printStackTrace();

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var11) {
         }

         Display.create(var14);
      }

      Class531.field_759.field_2458 = new Class703(this);
      this.field_2093 = method_1379();
      this.field_1754 = new Class693(this, this.field_2093);
      this.field_1421 = new Class337(this, this.field_2093);
      this.field_2176 = new Class432(this.field_1421, this.field_1754);
      this.field_1421.field_602.field_1774.method_909(this);
      this.field_267 = new Class478(this);
      this.field_1541 = new Class640(this.field_1754, "/default.png", this.field_2176);
      this.method_1916();
      Keyboard.create();
      Mouse.create();
      this.field_2679 = new Class548(this.field_2017);

      try {
         Controllers.create();
         Class119.method_1789();
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      this.method_1902("Pre startup");
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glClearDepth(1.0);
      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glCullFace(1029);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      this.method_1902("Startup");
      this.field_1965 = new Class92();
      this.field_485.method_1628(this.field_1754);
      this.field_2176.method_439(this.field_544);
      this.field_2176.method_439(this.field_826);
      this.field_2176.method_439(new Class89(this));
      this.field_2176.method_439(new Class749());
      this.field_2176.method_439(new Class731());
      this.field_2176.method_439(new Class642(0));
      this.field_2176.method_439(new Class642(1));
      this.field_1265 = new Class582(this, this.field_2176);
      GL11.glViewport(0, 0, this.field_2517, this.field_2477);
      this.field_2681 = new Class443(this.field_2648, this.field_2176);
      new Thread683(this).start();
      Class457.method_1917();

      try {
         this.field_1720 = new Thread62(this.field_2093, this);
         this.field_1720.start();
      } catch (Exception var9) {
      }

      this.method_1902("Post startup");
      this.field_964 = new Class273(this);
      if (this.field_2524 != null) {
         this.method_1290(new Class728(this, this.field_2524, this.field_2422));
      } else {
         this.method_1290(new Class373());
         if (Thread227.field_3066) {
            this.method_1290(new Class384("Warning!", "Using async. world generation may lead to anomalies in your worlds.\nUse at your own risk!"));
         }
      }

      this.method_131();

      try {
         MessageDigest var2 = MessageDigest.getInstance("SHA-256");
         MessageDigest var3 = MessageDigest.getInstance("MD5");
         byte[] var4 = var2.digest(this.field_2935.field_382.getBytes("UTF-8"));
         byte[] var5 = var3.digest(this.field_2935.field_382.getBytes("UTF-8"));
         String var6 = Class100.method_1040(var4);
         String var7 = Class100.method_1040(var5);

         for (int var8 = 0; var8 != this.field_458.length; var8++) {
            if (this.field_458[var8].equals(var6) && this.field_1011[var8].equals(var7)) {
               field_1601 = true;
               break;
            }
         }
      } catch (NoSuchAlgorithmException | UnsupportedEncodingException var13) {
         var13.printStackTrace();
      }

      Class597.method_513();
      if (field_1601) {
         this.method_137();
      }
   }

   public String method_457() {
      if (this.field_1155.isEmpty()) {
         if (new File(method_1379() + "/perfTelemetryCache.txt").exists()) {
            try {
               BufferedReader var1 = new BufferedReader(new FileReader(method_1379() + "/perfTelemetryCache.txt"));
               this.field_1155 = var1.readLine();
               var1.close();
            } catch (IOException var2) {
            }

            return this.field_1155;
         }

         this.field_1155 = GL11.glGetString(7937);
      }

      return this.field_1155;
   }

   public void method_131() {
      this.method_584("");
   }

   public void method_584(String var1) {
      if (this.field_1267 instanceof Frame) {
         ((Frame)this.field_1267).setTitle("Minecraft - " + this.field_2935.field_382 + " - OpenGL (" + this.method_457() + ") " + var1);
      }
   }

   public void method_137() {
      field_1601 = true;
      this.field_964 = new Class580(this);
      field_1094 = "/dclient_terrain.png";
      this.method_661("detain");
   }

   private void method_1916() throws LWJGLException {
      Class187 var1 = new Class187(this.field_2517, this.field_2477);
      int var2 = var1.method_884();
      int var3 = var1.method_351();
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, var2, var3, 0.0, 1000.0, 3000.0);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(0, 0, this.field_2517, this.field_2477);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      Class368 var4 = Class368.field_2696;
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glBindTexture(3553, this.field_2176.method_1545(Class614.method_1576(Class614.field_778)));
      var4.method_1284(true);
      var4.method_1748(16777215);
      var4.method_318(0.0, this.field_2477, 0.0, 0.0, 0.0);
      var4.method_318(this.field_2517, this.field_2477, 0.0, 0.0, 0.0);
      var4.method_318(this.field_2517, 0.0, 0.0, 0.0, 0.0);
      var4.method_318(0.0, 0.0, 0.0, 0.0, 0.0);
      var4.method_406();
      short var5 = 256;
      short var6 = 256;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_1748(16777215);
      this.method_1389((this.field_2517 / 2 - var5) / 2, (this.field_2477 / 2 - var6) / 2, 0, 0, var5, var6);
      this.field_1541.method_1870("BUILD " + this.field_1142, 10, 10, 16777215);
      if (this.field_2935.field_382.equals("DECRAFT_Player")) {
         this.field_1541.method_1870("(based)", 10, 20, 16777215);
      }

      this.method_1708();
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      Display.setVSyncEnabled(this.field_1754.field_1324);
      Display.swapBuffers();
   }

   public void method_1389(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      Class368 var9 = Class368.field_2696;
      var9.method_186();
      var9.method_318(var1 + 0, var2 + var6, 0.0, (var3 + 0) * var7, (var4 + var6) * var8);
      var9.method_318(var1 + var5, var2 + var6, 0.0, (var3 + var5) * var7, (var4 + var6) * var8);
      var9.method_318(var1 + var5, var2 + 0, 0.0, (var3 + var5) * var7, (var4 + 0) * var8);
      var9.method_318(var1 + 0, var2 + 0, 0.0, (var3 + 0) * var7, (var4 + 0) * var8);
      var9.method_406();
   }

   public static File method_1379() {
      if (field_1648 == null) {
         field_1648 = field_1305 ? new File(System.getProperty("user.dir")) : method_112(Class614.method_1576(Class614.field_560));
      }

      return field_1648;
   }

   public static File method_112(String var0) {
      String var1 = System.getProperty(Class614.method_1576(Class614.field_517), ".");
      File var2;
      switch (Class157.field_1015[method_1395().ordinal()]) {
         case 1:
         case 2:
            var2 = new File(var1, '.' + var0 + '/');
            break;
         case 3:
            String var3 = System.getenv("APPDATA");
            if (var3 != null) {
               var2 = new File(var3, "." + var0 + '/');
            } else {
               var2 = new File(var1, '.' + var0 + '/');
            }
            break;
         case 4:
            var2 = new File(var1, "Library/Application Support/" + var0);
            break;
         default:
            var2 = new File(var1, var0 + '/');
      }

      if (!var2.exists() && !var2.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + var2);
      } else {
         return var2;
      }
   }

   private static Enum554 method_1395() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")
         ? Enum554.field_3130
         : (
            var0.contains("mac")
               ? Enum554.field_241
               : (
                  var0.contains("solaris")
                     ? Enum554.field_563
                     : (
                        var0.contains("sunos")
                           ? Enum554.field_563
                           : (var0.contains("linux") ? Enum554.field_1580 : (var0.contains("unix") ? Enum554.field_1580 : Enum554.field_1177))
                     )
               )
         );
   }

   public void method_1290(Class265 var1) {
      if (!(this.field_1883 instanceof Class754)) {
         if (this.field_1883 != null) {
            this.field_1883.method_796();
         }

         if (var1 == null && this.field_2648 == null) {
            var1 = new Class373();
         } else if (var1 == null && this.field_2787.field_2572 <= 0) {
            var1 = this.field_2787 instanceof Class404 ? new Class172() : new Class678();
         }

         this.field_1883 = var1;
         if (var1 != null) {
            this.method_1558();
            Class187 var2 = new Class187(this.field_2517, this.field_2477);
            int var3 = var2.method_884();
            int var4 = var2.method_351();
            var1.method_1588(this, var3, var4);
            var1.method_1670();
            this.field_2350 = false;
         } else {
            this.method_663();
         }
      }
   }

   private void method_1902(String var1) {
      int var2 = GL11.glGetError();
      if (var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         System.out.println("########## GL ERROR ##########");
         System.out.println("@ " + var1);
         System.out.println(var2 + ": " + var3);
         System.exit(0);
      }
   }

   public void method_1859() {
      if (this.field_2052 != null) {
         this.field_2052.method_1008();
      }

      try {
         if (this.field_1720 != null) {
            this.field_1720.method_1924();
         }
      } catch (Exception var8) {
      }

      try {
         System.out.println("Stopping!");
         this.method_1824((Class454)null);

         try {
            Class504.method_1435();
         } catch (Exception var6) {
         }

         this.field_485.method_599();
         Mouse.destroy();
         Keyboard.destroy();
         Controllers.destroy();
      } finally {
         Display.destroy();
      }

      System.gc();
   }

   @Override
   public void run() {
      this.field_649 = true;

      try {
         this.method_259();
      } catch (Exception var10) {
         var10.printStackTrace();
         this.method_869(new Class655("Failed to start game", var10));
         return;
      }

      try {
         long var1 = System.currentTimeMillis();
         int var3 = 0;

         while (this.field_649 && (this.field_2052 == null || this.field_2052.isActive())) {
            long var4 = System.currentTimeMillis();
            Class630.method_716();
            Class214.method_1593();
            if (this.field_2017 == null && Display.isCloseRequested()) {
               this.method_459();
            }

            if (this.field_1465 && this.field_2648 != null) {
               float var6 = this.field_48.field_2499;
               this.field_48.method_311();
               this.field_48.field_2499 = var6;
            } else {
               this.field_48.method_311();
            }

            for (int var13 = 0; var13 < this.field_48.field_456; var13++) {
               this.field_234++;

               try {
                  this.method_1855();
               } catch (RuntimeException415 var9) {
                  this.field_2648 = null;
                  this.method_1824((Class454)null);
                  this.method_1290(new Class487());
               }
            }

            this.method_1902("Pre render");
            this.field_485.method_812(this.field_2787, this.field_48.field_2499);
            GL11.glEnable(3553);
            if (this.field_2648 != null) {
               while (this.field_2648.method_1696()) {
               }
            }

            if (!this.field_2350) {
               if (this.field_3103 != null) {
                  this.field_3103.method_1601(this.field_48.field_2499);
               }

               this.field_1455.method_103(this.field_48.field_2499);
            }

            if (!Display.isActive()) {
               if (this.field_122) {
                  this.method_1111();
               }

               Thread.sleep(10L);
            }

            if (Class119.method_696(64)) {
               this.method_1528();
            } else {
               this.field_2706 = System.nanoTime();
            }

            Thread.yield();
            Display.update();
            if (this.field_2017 != null && !this.field_122 && (this.field_2017.getWidth() != this.field_2517 || this.field_2017.getHeight() != this.field_2477)
               )
             {
               this.field_2517 = this.field_2017.getWidth();
               this.field_2477 = this.field_2017.getHeight();
               if (this.field_2517 <= 0) {
                  this.field_2517 = 1;
               }

               if (this.field_2477 <= 0) {
                  this.field_2477 = 1;
               }

               this.method_787(this.field_2517, this.field_2477);
            }

            if (field_866 > 0) {
               try {
                  Thread.sleep(field_866);
               } catch (Exception var8) {
               }
            }

            this.method_1902("Post render");
            var3++;

            for (this.field_1465 = !this.method_1129() && this.field_1883 != null && this.field_1883.method_1440();
               System.currentTimeMillis() >= var1 + 1000L;
               var3 = 0
            ) {
               this.field_71 = var3 + " fps, " + Class599.field_659 + " chunk updates";
               Class599.field_659 = 0;
               var1 += 1000L;
            }
         }
      } catch (Error314 var11) {
      } catch (Throwable var12) {
         this.field_2648 = null;
         var12.printStackTrace();
         this.method_869(new Class655("Unexpected error", var12));
      }
   }

   private void method_1528() {
      if (this.field_2706 == -1L) {
         this.field_2706 = System.nanoTime();
      }

      long var1 = System.nanoTime();
      field_3102[field_856++ & field_3102.length - 1] = var1 - this.field_2706;
      this.field_2706 = var1;
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, this.field_2517, this.field_2477, 0.0, 1000.0, 3000.0);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      Class368 var3 = Class368.field_2696;
      var3.method_605(7);
      var3.method_1748(538968064);
      var3.method_1724(0.0, this.field_2477 - 100, 0.0);
      var3.method_1724(0.0, this.field_2477, 0.0);
      var3.method_1724(field_3102.length, this.field_2477, 0.0);
      var3.method_1724(field_3102.length, this.field_2477 - 100, 0.0);
      var3.method_406();
      long var4 = 0L;

      for (int var6 = 0; var6 < field_3102.length; var6++) {
         var4 += field_3102[var6];
      }

      int var13 = (int)(var4 / 200000L / field_3102.length);
      var3.method_605(7);
      var3.method_1748(541065216);
      var3.method_1724(0.0, this.field_2477 - var13, 0.0);
      var3.method_1724(0.0, this.field_2477, 0.0);
      var3.method_1724(field_3102.length, this.field_2477, 0.0);
      var3.method_1724(field_3102.length, this.field_2477 - var13, 0.0);
      var3.method_406();
      var3.method_605(1);

      for (int var7 = 0; var7 < field_3102.length; var7++) {
         int var8 = (var7 - field_856 & field_3102.length - 1) * 255 / field_3102.length;
         int var9 = var8 * var8 / 255;
         var9 = var9 * var9 / 255;
         int var10 = var9 * var9 / 255;
         var10 = var10 * var10 / 255;
         var3.method_1748(-16777216 + var10 + var9 * 256 + var8 * 65536);
         long var11 = field_3102[var7] / 200000L;
         var3.method_1724(var7 + 0.5F, (float)(this.field_2477 - var11) + 0.5F, 0.0);
         var3.method_1724(var7 + 0.5F, this.field_2477 + 0.5F, 0.0);
      }

      var3.method_406();
      GL11.glEnable(3553);
   }

   public void method_459() {
      this.field_649 = false;
   }

   public void method_663() {
      if (Display.isActive() && !this.field_1449) {
         this.field_1449 = true;
         this.field_2679.method_1764();
         this.method_1290((Class265)null);
         this.field_750 = this.field_234 + 10000;
      }
   }

   public void method_1558() {
      if (this.field_1449) {
         if (this.field_2787 != null) {
            this.field_2787.method_791();
         }

         this.field_1449 = false;
         this.field_2679.method_514();
      }
   }

   public void method_1660() {
      if (this.field_1883 == null) {
         this.method_1290(field_1601 ? new Class194() : new Class317());
      }
   }

   private void method_358(int var1, boolean var2) {
      if (!this.field_3103.field_1729 && (var1 != 0 || this.field_2794 <= 0)) {
         if (var2 && this.field_864 != null && this.field_864.field_1786 == 0 && var1 == 0) {
            int var3 = this.field_864.field_1129;
            int var4 = this.field_864.field_1756;
            int var5 = this.field_864.field_513;
            this.field_3103.method_1585(var3, var4, var5, this.field_864.field_1726);
            this.field_2681.method_134(var3, var4, var5, this.field_864.field_1726);
         } else {
            this.field_3103.method_988();
         }
      }
   }

   private void method_332(int var1) {
      if (var1 != 0 || this.field_2794 <= 0) {
         if (var1 == 0) {
            this.field_2787.method_1385();
         }

         if (this.field_864 == null) {
            if (var1 == 0 && !(this.field_3103 instanceof Class494)) {
               this.field_2794 = 10;
            }
         } else if (this.field_864.field_1786 == 1) {
            if (var1 == 0) {
               this.field_2787.method_1569(this.field_864.field_541);
            }

            if (var1 == 1) {
               this.field_2787.method_1492(this.field_864.field_541);
            }
         } else if (this.field_864.field_1786 == 0) {
            int var3 = this.field_864.field_1129;
            int var2 = this.field_864.field_1756;
            int var4 = this.field_864.field_513;
            int var5 = this.field_864.field_1726;
            Class108 var6 = Class108.field_1221[this.field_2648.method_197(var3, var2, var4)];
            if (var1 == 0) {
               this.field_2648.method_1852(var3, var2, var4, this.field_864.field_1726);
               if (var6 != Class108.field_2945) {
                  this.field_3103.method_823(var3, var2, var4, this.field_864.field_1726);
               }
            } else {
               Class334 var7 = this.field_2787.field_559.method_93();
               int var8 = var7 != null ? var7.field_2326 : 0;
               if (this.field_3103.method_1830(this.field_2787, this.field_2648, var7, var3, var2, var4, var5)) {
                  this.field_2787.method_1385();
               }

               if (var7 == null) {
                  return;
               }

               if (var7.field_2326 == 0) {
                  this.field_2787.field_559.field_1518[this.field_2787.field_559.field_2127] = null;
               } else if (var7.field_2326 != var8) {
                  this.field_1455.field_1256.method_622();
               }
            }
         }

         if (var1 == 1) {
            Class334 var10 = this.field_2787.field_559.method_93();
            if (var10 != null) {
               int var9 = var10.field_2326;
               Class334 var11 = var10.method_706(this.field_2648, this.field_2787);
               if (var11 != var10 || var11 != null && var11.field_2326 != var9) {
                  this.field_2787.field_559.field_1518[this.field_2787.field_559.field_2127] = var11;
                  this.field_1455.field_1256.method_574();
                  if (var11.field_2326 == 0) {
                     this.field_2787.field_559.field_1518[this.field_2787.field_559.field_2127] = null;
                  }
               }
            }
         }
      }
   }

   public void method_1111() {
      try {
         this.field_122 = !this.field_122;
         if (this.field_122) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.field_2517 = Display.getDisplayMode().getWidth();
            this.field_2477 = Display.getDisplayMode().getHeight();
            if (this.field_2517 <= 0) {
               this.field_2517 = 1;
            }

            if (this.field_2477 <= 0) {
               this.field_2477 = 1;
            }
         } else {
            if (this.field_2017 != null) {
               this.field_2517 = this.field_2017.getWidth();
               this.field_2477 = this.field_2017.getHeight();
            } else {
               this.field_2517 = this.field_2085;
               this.field_2477 = this.field_1437;
            }

            if (this.field_2517 <= 0) {
               this.field_2517 = 1;
            }

            if (this.field_2477 <= 0) {
               this.field_2477 = 1;
            }

            Display.setDisplayMode(new DisplayMode(this.field_2085, this.field_1437));
         }

         this.method_1558();
         Display.setFullscreen(this.field_122);
         Display.update();
         Thread.sleep(1000L);
         if (this.field_122) {
            this.method_663();
         }

         if (this.field_1883 != null) {
            this.method_1558();
            this.method_787(this.field_2517, this.field_2477);
         }

         System.out.println("Size: " + this.field_2517 + ", " + this.field_2477);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void method_787(int var1, int var2) {
      if (var1 <= 0) {
         var1 = 1;
      }

      if (var2 <= 0) {
         var2 = 1;
      }

      this.field_2517 = var1;
      this.field_2477 = var2;
      if (this.field_1883 != null) {
         Class187 var3 = new Class187(var1, var2);
         int var4 = var3.method_884();
         int var5 = var3.method_351();
         this.field_1883.method_1588(this, var4, var5);
      }
   }

   private void method_1897() {
      if (this.field_864 != null) {
         int var1 = this.field_2648.method_197(this.field_864.field_1129, this.field_864.field_1756, this.field_864.field_513);
         if (var1 == Class108.field_1970.field_2151) {
            var1 = Class108.field_1047.field_2151;
         }

         if (var1 == Class108.field_1262.field_2151) {
            var1 = Class108.field_2252.field_2151;
         }

         if (var1 == Class108.field_2945.field_2151) {
            var1 = Class108.field_720.field_2151;
         }

         this.field_2787.field_559.method_1004(var1, this.field_3103 instanceof Class494);
      }
   }

   public void method_1855() {
      this.field_372 = Class368.field_2696.field_188;
      Class368.field_2696.field_188 = 0;
      this.field_964.method_166();
      this.field_1455.method_104(1.0F);
      if (this.field_2787 != null) {
         this.field_2787.method_1717();
      }

      if (!this.field_1465 && this.field_2648 != null) {
         this.field_3103.method_1177();
      }

      GL11.glBindTexture(3553, this.field_2176.method_1545(field_1094));
      if (this.field_1754.field_674 == 2) {
         GL11.glDisable(3042);
      }

      if (!this.field_1465) {
         this.field_2176.method_362();
      }

      if (this.field_1883 == null && this.field_2787 != null && this.field_2787.field_2572 <= 0) {
         this.method_1290((Class265)null);
      }

      if (this.field_1883 != null) {
         this.field_750 = this.field_234 + 10000;
      }

      if (this.field_1883 != null) {
         this.field_1883.method_946();
         if (this.field_1883 != null) {
            this.field_1883.method_1414();
         }
      }

      if (this.field_1883 == null || this.field_1883.field_2868) {
         while (Class119.method_1877()) {
            long var1 = System.currentTimeMillis() - this.field_601;
            if (var1 <= 200L) {
               int var3 = Class119.method_790();
               if (var3 != 0) {
                  this.field_2787.field_559.method_1191(var3);
               }

               if (this.field_1883 == null) {
                  if (!this.field_1449 && Class119.method_1085()) {
                     this.method_663();
                  } else if (Class119.method_1085()) {
                     if (Class119.method_5() == 0) {
                        this.method_332(0);
                        this.field_750 = this.field_234;
                     }

                     if (Class119.method_5() == 1) {
                        this.method_332(1);
                        this.field_750 = this.field_234;
                     }

                     if (Class119.method_5() == 2) {
                        this.method_1897();
                     }
                  }
               } else if (this.field_1883 != null) {
                  this.field_1883.method_1015();
               }
            }
         }

         if (this.field_2794 > 0) {
            this.field_2794--;
         }

         while (Class119.method_1811()) {
            this.field_2787.method_1611(Class119.method_1302(), Class119.method_603());
            if (Class119.method_603()) {
               if (Class119.method_1302() == 87) {
                  this.method_1111();
               } else {
                  if (this.field_1883 != null) {
                     this.field_1883.method_1326();
                  } else {
                     if (Class119.method_1302() == 1) {
                        this.method_1660();
                     }

                     if (Class119.method_1302() == 31 && Class119.method_696(61)) {
                        this.method_1713();
                     }

                     if (Class119.method_1302() == 63) {
                        this.field_1754.field_1955 = !this.field_1754.field_1955;
                     }

                     if (Class119.method_1302() == this.field_1754.field_1301.field_2381) {
                        this.field_2787.method_126(this);
                     }

                     if (Class119.method_1302() == this.field_1754.field_857.field_2381) {
                        this.field_2787.method_1307(this.field_2787.field_559.method_485(this.field_2787.field_559.field_2127, 1), false);
                     }

                     if ((this.method_1129() || Class119.method_696(54)) && Class119.method_1302() == this.field_1754.field_2809.field_2381) {
                        this.method_1290(new Class573());
                     }
                  }

                  for (int var4 = 0; var4 < 9; var4++) {
                     if (Class119.method_1302() == 2 + var4 && (!(this.field_2787 instanceof Class404) || var4 < 2)) {
                        this.field_2787.field_559.field_2127 = var4;
                     }
                  }

                  if (Class119.method_1302() == this.field_1754.field_2797.field_2381) {
                     this.field_1754.method_1810(4, !Class119.method_696(42) && !Class119.method_696(54) ? 1 : -1);
                  }
               }
            }
         }

         if (this.field_1883 == null) {
            if (Class119.method_390(0) && this.field_234 - this.field_750 >= this.field_48.field_3150 / 4.0F && this.field_1449) {
               this.method_332(0);
               this.field_750 = this.field_234;
            }

            if (Class119.method_390(1) && this.field_234 - this.field_750 >= this.field_48.field_3150 / 4.0F && this.field_1449) {
               this.method_332(1);
               this.field_750 = this.field_234;
            }
         }

         this.method_358(0, this.field_1883 == null && Class119.method_390(0) && this.field_1449);
      }

      if (this.field_2648 != null) {
         if (this.field_2787 != null) {
            this.field_1032++;
            if (this.field_1032 == 30) {
               this.field_1032 = 0;
               this.field_2648.method_666(this.field_2787);
            }
         }

         this.field_2648.field_1535 = this.field_1754.field_2564;
         if (!this.field_1465) {
            this.field_1455.method_1182();
         }

         if (!this.field_1465) {
            this.field_1265.method_700();
         }

         if (!this.field_1465) {
            this.field_2648.method_1812();
         }

         if (!this.field_1465 || this.method_1129()) {
            this.field_2648.method_1832();
         }

         if (!this.field_1465 && this.field_2648 != null) {
            this.field_2648
               .method_682(
                  Class469.method_468(this.field_2787.field_1417),
                  Class469.method_468(this.field_2787.field_2654),
                  Class469.method_468(this.field_2787.field_2013)
               );
         }

         if (!this.field_1465) {
            this.field_2681.method_107();
         }
      }

      this.field_601 = System.currentTimeMillis();
   }

   private void method_1713() {
      System.out.println("FORCING RELOAD!");
      this.field_485 = new Class53();
      this.field_485.method_1628(this.field_1754);
      this.field_1720.method_924();
   }

   public boolean method_1129() {
      return this.field_2648 != null && this.field_2648.field_2994;
   }

   public void method_715(String var1) {
      this.method_1824((Class454)null);
      System.gc();
      Class454 var2 = new Class454(new File(method_1379(), "saves"), var1);
      Class597.method_883("Attempting to load world " + var2.field_2724.toPath() + "...");

      try {
         Files.write(Paths.get("./qfile"), var1.getBytes());
      } catch (IOException var4) {
      }

      if (var2.field_1419) {
         this.method_1075(var2, "Generating level");
      } else {
         this.method_1075(var2, "Loading level");
      }
   }

   public void method_443(String var1, Class<? extends Class262> var2) {
      this.method_1824((Class454)null);
      System.gc();
      this.field_3103 = new Class324(this);

      try {
         Class454 var3 = (Class454)var2.getDeclaredConstructor(File.class, String.class).newInstance(new File(method_1379(), "saves"), var1);
         Class597.method_883("Attempting to load world " + var3.field_2724.toPath() + "...");
         if (var3.field_1419) {
            return;
         }

         this.method_1075(var3, "Loading level");
      } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException var4) {
      }
   }

   public void method_661(String var1) {
      this.method_1290((Class265)null);
      this.field_3103 = new Class114(this);
      this.method_1290((Class265)null);
      this.method_1824((Class454)null);
      System.gc();
      Class454 var2 = new Class454(new File(method_1379(), "saves"), var1);
      Class597.method_883("Attempting to load world " + var2.field_2724.toPath() + "...");
      this.method_1075(var2, "Loading level");
      this.method_1290((Class265)null);
   }

   public void method_1363(String var1, Class<? extends Class46> var2) {
      this.method_1824((Class454)null);
      System.gc();

      try {
         Class454 var3 = (Class454)var2.getDeclaredConstructor(File.class, String.class).newInstance(new File(method_1379(), "saves"), var1);
         Class597.method_883("Attempting to load world " + var3.field_2724.toPath() + "...");
         if (var3.field_1419) {
            return;
         }

         this.method_1075(var3, "Loading level");
      } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException var4) {
      }
   }

   public void method_1824(Class454 var1) {
      this.method_1075(var1, "");
   }

   public void method_1075(Class454 var1, String var2) {
      if (Class53.field_1690 != null) {
         this.field_485.method_963(null, true);
      }

      this.method_515(var1, var2, true);
   }

   public void method_515(Class454 var1, String var2, boolean var3) {
      this.field_485.method_1550((String)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      if (var3 && this.field_2648 != null) {
         this.field_2648.method_1928(this.field_2577);
      }

      this.field_2648 = var1;
      if (var1 != null) {
         this.field_3103.method_820(var1);
         var1.field_2406 = this.field_1541;
         if (!this.method_1129()) {
            this.field_2787 = (Class563)var1.method_1673(Class563.class);
         } else if (this.field_2787 != null) {
            this.field_2787.method_735();
            if (var1 != null) {
               var1.method_1447(this.field_2787);
            }
         }

         if (!var1.field_2994) {
            this.method_528(var2);
         }

         if (this.field_2787 == null) {
            this.field_2787 = (Class563)this.field_3103.method_1067(var1);
            this.field_2787.method_735();
            this.field_3103.method_1639(this.field_2787);
         }

         this.field_2787.field_1347 = new Class395(this.field_1754);
         if (this.field_1265 != null) {
            this.field_1265.method_404(var1);
         }

         if (this.field_2681 != null) {
            this.field_2681.method_141(var1);
         }

         this.field_3103.method_1476(this.field_2787);
         var1.method_982(this.field_2787);
         if (var1.field_1419) {
            var1.method_1928(this.field_2577);
         }
      } else {
         this.field_2787 = null;
      }

      System.gc();
      this.field_601 = 0L;
   }

   private void method_528(String var1) {
      this.field_2577.method_348(var1);
      this.field_2577.method_825("Building terrain");
      short var2 = 128;
      int var3 = 0;
      int var4 = var2 * 2 / 16 + 1;
      var4 *= var4;

      for (int var5 = -var2; var5 <= var2; var5 += 16) {
         int var6 = this.field_2648.field_18;
         int var7 = this.field_2648.field_1361;
         if (this.field_2787 != null) {
            var6 = (int)this.field_2787.field_1417;
            var7 = (int)this.field_2787.field_2013;
         }

         for (int var8 = -var2; var8 <= var2; var8 += 16) {
            this.field_2577.method_520(var3++ * 100 / var4);
            this.field_2648.method_197(var6 + var5, 64, var7 + var8);

            while (this.field_2648.method_1696()) {
            }
         }
      }

      this.field_2577.method_825("Simulating world for a bit");
      this.field_2648.method_96();
   }

   public void method_1214(String var1, File var2) {
      if (!var1.matches(".*contentversion.*")) {
         int var3 = var1.indexOf("/");
         String var4 = var1.substring(0, var3);
         var1 = var1.substring(var3 + 1);
         if (var4.equalsIgnoreCase("sound")) {
            this.field_485.method_109(var1, var2);
         } else if (var4.equalsIgnoreCase("newsound")) {
            this.field_485.method_109(var1, var2);
         } else if (var4.equalsIgnoreCase("streaming")) {
            this.field_485.method_1218(var1, var2);
         } else if (var4.equalsIgnoreCase("music")) {
            this.field_485.method_1072(var1, var2);
         } else if (var4.equalsIgnoreCase("newmusic")) {
            this.field_485.method_1072(var1, var2);
         } else if (var4.equalsIgnoreCase("hub")) {
            this.field_485.method_1072(var1, var2);
         }
      }
   }

   public Class92 method_1485() {
      return this.field_1965;
   }

   public String method_1324() {
      return this.field_1265.method_734();
   }

   public String method_644() {
      return this.field_1265.method_1899();
   }

   public String method_1505() {
      return "P: " + this.field_2681.method_1237() + ". T: " + this.field_2648.method_1139();
   }

   public void method_82() {
      this.field_2648.method_1657();
      if (this.field_2787 != null) {
         this.field_2648.method_623(this.field_2787);
      }

      this.field_2787 = (Class563)this.field_3103.method_1067(this.field_2648);
      this.field_2787.method_735();
      this.field_3103.method_1639(this.field_2787);
      this.field_2648.method_982(this.field_2787);
      this.field_2787.field_1347 = new Class395(this.field_1754);
      this.field_3103.method_1476(this.field_2787);
      this.method_528("Respawning");
   }

   public static void method_697(String var0, String var1) {
      method_832(var0, var1, (String)null);
   }

   public static void method_832(String var0, String var1, String var2) {
      boolean var3 = false;
      Frame var4 = new Frame(Class614.method_1576(Class614.field_1474));
      Canvas var5 = new Canvas();
      var4.setLayout(new BorderLayout());
      var4.add(var5, "Center");
      var5.setPreferredSize(new Dimension(854, 480));
      var4.pack();
      var4.setLocationRelativeTo((Component)null);
      Minecraft43 var6 = new Minecraft43(var4, var5, (MinecraftApplet)null, 854, 480, var3, var4);
      Thread var7 = new Thread(var6, "Minecraft main thread");
      var7.setPriority(10);
      var6.field_3131 = false;
      var6.field_571 = "www.minecraft.net";
      if (var0 != null && var1 != null) {
         var6.field_2935 = new Class277(var0, var1);
      } else {
         var6.field_2935 = new Class277("Player" + System.currentTimeMillis() % 1000L, "");
      }

      if (var2 != null) {
         String[] var8 = var2.split(":");
         var6.method_1871(var8[0], Integer.parseInt(var8[1]));
      }

      var4.setVisible(true);
      var4.addWindowListener(new WindowAdapter336(var6, var7));
      var7.start();
   }

   public static void method_123() {
      File var0 = new File(System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\TLauncher.exe");
      if (var0.exists()) {
         System.out.println("TL2 Detected!");
         System.out.println("BOOT ERR! GIVING WARNING!");
         JOptionPane.showMessageDialog(null, "A boot Error happened!", "Error!", 0);
         System.exit(0);
      }
   }

   public static void main(String[] var0) {
      String var1 = "Player" + System.currentTimeMillis() % 1000L;
      if (var0.length > 0) {
         var1 = var0[0];
      }

      String var2 = "-";
      if (var0.length > 1) {
         var2 = var0[1];
      }

      RuntimeMXBean var3 = ManagementFactory.getRuntimeMXBean();
      ArrayList var4 = new ArrayList<>(var3.getInputArguments());

      for (String var8 : var0) {
         if (var8.startsWith("-D")) {
            var4.add(var8);
         }
      }

      for (String var19 : var4) {
         String[] var20 = var19.split(" ");

         for (String var11 : var20) {
            if (var11.startsWith("-Dext1605.username")) {
               var1 = var11.substring(var11.indexOf("=") + 1);
            } else if (!var11.startsWith("-Dext1605.instances")) {
               if (var11.startsWith("-Dext1605.nocert")) {
                  field_885 = false;
               } else if (var11.startsWith("-Dext1605.asyncgen")) {
                  Thread227.field_3066 = true;
               } else if (var11.startsWith("-Dext1605.r4")) {
                  Class310.field_2631 = true;
               } else if (var11.startsWith("-Dext1605.god_help_me")) {
                  Class310.field_1409 = true;
               } else if (var11.startsWith("-Dext1605.saveskincache")) {
                  Class225.field_1183 = true;
               } else if (var11.startsWith("-Dext1605.bro_get_yourself_a_real_keyboard")) {
                  Class310.field_2036 = true;
               } else if (var11.startsWith("-Dext1605.i_said_a_bad_word")) {
                  field_1601 = true;
               } else if (var11.startsWith("-Dext1605.run_antitl2_lib")) {
                  method_123();
               } else if (var11.startsWith("-Dext1605.idelaunch=")) {
                  field_1305 = true;
                  field_2719 = var11.substring(var11.indexOf("=") + 1);
                  Class597.method_883("Launch from IDE; cwd: " + field_2719);
               }
            } else {
               int var12 = Integer.parseInt(var11.substring(var11.indexOf("=") + 1));
               int var13 = var12;

               while (var13-- > 0) {
                  String var14 = "java -classpath " + System.getProperty("java.class.path") + " ";

                  for (String var16 : var4) {
                     if (!var16.contains("-Dext1605.instances")) {
                        var14 = var14 + var16 + " ";
                     }
                  }

                  var14 = var14 + System.getProperty("sun.java.command") + " ";
                  var14 = var14 + var1 + "_" + var13;

                  try {
                     Runtime.getRuntime().exec(var14);
                  } catch (IOException var17) {
                     var17.printStackTrace();
                  }
               }
            }
         }
      }

      method_697(var1, var2);
   }
}
