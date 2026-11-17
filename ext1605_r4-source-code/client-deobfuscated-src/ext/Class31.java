package ext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

public class Class31 {
   public ArrayList<Class306> field_284 = new ArrayList<>();
   public String field_1717 = "";
   public HashMap<Integer, String> field_1698 = new HashMap<>();
   private boolean field_2683 = false;
   private boolean field_739 = true;

   public Class31() {
      this.method_481();
      this.method_938();
      this.method_1103();
   }

   public void method_938() {
      this.field_1698.put(53, "blockinfo");
      this.field_1698.put(51, "+worldedit_setpos1");
      this.field_1698.put(52, "+worldedit_setpos2");
      this.field_1698.put(47, "+mc_creatmenu");
   }

   public void method_1103() {
      File var1 = new File(Minecraft.method_1379() + "/autoexec.cfg");
      if (var1.exists()) {
         try {
            BufferedReader var2 = new BufferedReader(new FileReader(var1));

            String var3;
            try {
               while ((var3 = var2.readLine()) != null) {
                  try {
                     this.method_175(var3);
                  } catch (Exception var6) {
                     Class597.method_195("TCON Exception: " + var6.getMessage());
                  }
               }
            } catch (Throwable var7) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var7.addSuppressed(var5);
               }

               throw var7;
            }

            var2.close();
         } catch (IOException var8) {
         }
      }

      this.field_739 = false;
   }

   public void method_269(int var1) {
      if (this.field_1698.containsKey(var1)) {
         try {
            this.method_175(this.field_1698.get(var1));
         } catch (Exception var3) {
         }
      }
   }

   public void method_481() {
      this.field_284.add(new Class306("bind", new Class[]{Integer.class, String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class31.this.field_1698.put((Integer)var1[0], (String)var1[1]);
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("unbind", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class31.this.field_1698.containsKey((Integer)var1[0])) {
               Class31.this.field_1698.remove((Integer)var1[0]);
            }
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("con_refresh", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class31.this.field_284.clear();
            Class31.this.method_481();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("name", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_2935.field_382 = (String)var1[0];
            Class119.field_1519.method_131();
         }

         @Override
         public String method_867() {
            return Class119.field_1519.field_2935.field_382;
         }
      }));
      this.field_284.add(new Class306("gpu", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_1155 = (String)var1[0];
            Class119.field_1519.method_131();
         }

         @Override
         public String method_867() {
            return Class119.field_1519.method_457();
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
      this.field_284.add(new Class306("perfclass", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Minecraft.field_866 = (Integer)var1[0];
         }

         @Override
         public String method_867() {
            return Minecraft.field_866 + "";
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
      this.field_284.add(new Class306("title+", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.method_584((String)var1[0]);
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("connect", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("disconnect", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class119.field_1519.field_2648 != null) {
               if (Class119.field_1519.method_1129()) {
                  Class119.field_1519.field_2648.method_1133();
               }

               Class119.field_1519.method_1824((Class454)null);
               Class119.field_1519.method_1290(new Class373());
            }
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("map", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.method_1290((Class265)null);
            Class119.field_1519.field_3103 = new Class420(Class119.field_1519);
            Class119.field_1519.method_715((String)var1[0]);
            Class119.field_1519.method_1290((Class265)null);
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("mc_minimap", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.method_1786();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("mc_redl", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            try {
               Thread62.field_221 = false;
               Class119.field_1519.field_1720 = new Thread62(Class119.field_1519.field_2093, Class119.field_1519);
               Class119.field_1519.field_1720.start();
            } catch (Exception var3) {
            }
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("mc_viewbarrier", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            try {
               ((Class742)Class390.field_2495).field_413 = (Integer)var1[0] == 1;
            } catch (Exception var3) {
            }
         }

         @Override
         public String method_867() {
            return ((Class742)Class390.field_2495).field_413 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("mc_termconn", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class310.field_973 = (Integer)var1[0] == 1;
         }

         @Override
         public String method_867() {
            return "" + (Class310.field_973 ? 1 : 0);
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
      this.field_284.add(new Class306("mc_diff", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_1754.field_2564 = (Integer)var1[0];
         }

         @Override
         public String method_867() {
            return "" + Class119.field_1519.field_1754.field_2564;
         }
      }));
      this.field_284.add(new Class306("mc_creat", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1477 = (Integer)var1[0] == 1;
         }

         @Override
         public String method_867() {
            return "" + Class119.field_1477;
         }
      }));
      this.field_284.add(new Class306("mc_winterlevel", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_2648.field_743 = (Integer)var1[0] == 1;
         }

         @Override
         public String method_867() {
            return Class119.field_1519.field_2648.field_743 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("mc_sandlevel", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_2648.field_2807 = (Integer)var1[0] == 1;
         }

         @Override
         public String method_867() {
            return Class119.field_1519.field_2648.field_2807 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("mc_renderdistance", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_1754.field_2733 = Math.max(Math.min((Integer)var1[0], 5), 0);
         }

         @Override
         public String method_867() {
            return "" + Class119.field_1519.field_1754.field_2733;
         }
      }));
      this.field_284.add(new Class306("mc_posthint", new Class[]{Integer.class, String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_964.field_936.method_1305((String)var1[1], (Integer)var1[0]);
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("mc_playmus", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_485.method_1036((String)var1[0]);
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284
         .add(
            new Class306(
               "pass",
               new Class[]{Integer.class},
               new Class241() {
                  @Override
                  public void method_1477(Object... var1) {
                     int var2 = (Integer)var1[0];
                     switch (var2) {
                        case 1:
                           Class119.field_1519.field_964.field_936.method_1305("Welcome back, dear friend", 10000);
                           break;
                        case 7:
                           Class119.field_1519.field_964.field_936.method_1305("Is the number", 10000);
                           break;
                        case 9:
                           Class119.field_1519.field_964.field_936.method_1305("Wrong place, Raven.", 10000);
                           break;
                        case 77:
                           Class119.field_1519.field_964.field_936.method_1305("You won't find the candles here", 10000);
                           break;
                        case 1604:
                           Class119.field_1519
                              .field_964
                              .field_936
                              .method_1305("3:8jWBk36GiUr3dV9dB8n6a47594GNQ4AHz1V3p5660O75oGy93l89Yu4vDhCgfMahmA67q60z01Nu3vgS", 10000);
                           break;
                        case 1605:
                           Class119.field_1519
                              .field_964
                              .field_936
                              .method_1305(
                                 "I guess this can be called an easter egg.\nThis was our first foray into working with a somewhat popular property\nThe prior branches, they were cut just because they weren't high enough quality\nor too drastic a change.\nThe workflow was surely quite different, But i can't really complain\nI'm glad this branch is as is.\nIt was our magnum opus.",
                                 10000
                              );
                           break;
                        case 1986:
                           Class119.field_1519.field_964.field_936.method_1305("It's dangerous to go alone!", 10000);
                           break;
                        case 1993:
                           Class119.field_1519.field_964.field_936.method_1305("Lamp Oil? Rope? Bombs? We don't have that.", 10000);
                           break;
                        case 2011:
                           Class119.field_1519.field_964.field_936.method_1305("Wrong password screen, Zachary", 10000);
                           break;
                        case 810116:
                           Class119.field_1519.field_964.field_936.method_1305("Help what with?", 10000);
                     }
                  }

                  @Override
                  public String method_867() {
                     return "~exec";
                  }
               }
            )
         );
      this.field_284.add(new Class306("mc_gencitysize", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class25.field_2963 = Math.max((Integer)var1[0], 0);
         }

         @Override
         public String method_867() {
            return "" + Class25.field_2963;
         }
      }));
      this.field_284.add(new Class306("+mc_creatmenu", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.method_170();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("cg_fovmod", new Class[]{Float.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_1754.field_133 = (Float)var1[0];
         }

         @Override
         public String method_867() {
            return "" + Class119.field_1519.field_1754.field_133;
         }
      }));
      this.field_284.add(new Class306("sv_cheats", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class310.field_1164 = (Integer)var1[0] != 0;
         }

         @Override
         public String method_867() {
            return Class310.field_1164 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("sv_leveltime", new Class[]{Long.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class310.field_1164) {
               Class119.field_1519.field_2648.field_2075 = (Long)var1[0];
            }
         }

         @Override
         public String method_867() {
            return "" + Class119.field_1519.field_2648.field_2075;
         }
      }));
      this.field_284.add(new Class306("sv_rainworld", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class310.field_1164) {
               Class119.field_1519.field_1310 = (Integer)var1[0] == 1;
            }
         }

         @Override
         public String method_867() {
            return "" + Class119.field_1519.field_1310;
         }
      }));
      this.field_284.add(new Class306("sv_allowrnet", new Class[]{Long.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class119.field_1519.field_2787.field_2850.nextBoolean()) {
               Class310.field_2783 = !Class310.field_2783;
            }
         }

         @Override
         public String method_867() {
            return Class310.field_2783 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("fly", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class310.field_1164) {
               Class310.field_521 = !Class310.field_521;
            }
         }

         @Override
         public String method_867() {
            return Class310.field_521 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("noclip", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class310.field_1164) {
               Class119.field_1519.field_2787.field_236 = !Class119.field_1519.field_2787.field_236;
            }
         }

         @Override
         public String method_867() {
            return Class119.field_1519.field_2787.field_236 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("summon_spaceman", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class101 var2 = new Class101(Class119.field_1519.field_2648);
            var2.method_172(Class119.field_1519.field_2787.field_1417, Class119.field_1519.field_2787.field_2654, Class119.field_1519.field_2787.field_2013);
            Class119.field_1519.field_2648.method_1447(var2);
         }

         @Override
         public String method_867() {
            return "~exec";
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
      this.field_284.add(new Class306("summon_spearmaster", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class439 var2 = new Class439(Class119.field_1519.field_2648);
            var2.method_172(Class119.field_1519.field_2787.field_1417, Class119.field_1519.field_2787.field_2654, Class119.field_1519.field_2787.field_2013);
            Class119.field_1519.field_2648.method_1447(var2);
         }

         @Override
         public String method_867() {
            return "~exec";
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
      this.field_284.add(new Class306("summon_spacemen", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            for (int var2 = 0; var2 < var1[0]; var2++) {
               Class101 var3 = new Class101(Class119.field_1519.field_2648);
               var3.method_172(Class119.field_1519.field_2787.field_1417, Class119.field_1519.field_2787.field_2654, Class119.field_1519.field_2787.field_2013);
               Class119.field_1519.field_2648.method_1447(var3);
            }
         }

         @Override
         public String method_867() {
            return "~exec";
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
      this.field_284
         .add(
            new Class306(
               "impulse",
               new Class[]{Integer.class},
               new Class241() {
                  @Override
                  public void method_1477(Object... var1) {
                     if (Class310.field_1164) {
                        switch (var1[0]) {
                           case 102:
                              for (int var4 = 0; var4 < 4; var4++) {
                                 Class716 var3 = new Class716(Class119.field_1519.field_2648);
                                 var3.method_172(
                                    Class119.field_1519.field_2787.field_1417,
                                    Class119.field_1519.field_2787.field_2654,
                                    Class119.field_1519.field_2787.field_2013
                                 );
                                 Class119.field_1519.field_2648.method_1447(var3);
                              }
                              break;
                           case 300:
                              Class730.method_1026(Class119.field_1519.field_2787, Class119.field_1519.field_2648);
                              break;
                           case 320:
                              Class730.method_174(Class119.field_1519.field_2787, Class119.field_1519.field_2648);
                              break;
                           case 400:
                              Class144 var2 = new Class144(Class119.field_1519.field_2648);
                              var2.method_172(
                                 Class119.field_1519.field_2787.field_1417,
                                 Class119.field_1519.field_2787.field_2654,
                                 Class119.field_1519.field_2787.field_2013
                              );
                              Class119.field_1519.field_2648.method_1447(var2);
                              break;
                           case 3900:
                              Class119.field_1519.field_813.field_2170.method_948();
                              Class119.field_1519.field_813.field_1481.method_948();
                              Class119.field_1519.field_813.field_176.method_948();
                              Class119.field_1519.field_813.field_2520.method_948();
                              Class119.field_1519.field_813.field_2334.method_948();
                              Class119.field_1519.field_813.field_2931.method_948();
                              Class119.field_1519.field_813.field_776.method_948();
                              Class119.field_1519.field_813.field_2838.method_948();
                        }
                     }
                  }

                  @Override
                  public String method_867() {
                     return "~exec";
                  }
               }
            )
         );
      this.field_284.add(new Class306("mat_fullbright", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class310.field_760 = (Integer)var1[0] == 1;
         }

         @Override
         public String method_867() {
            return "" + (Class310.field_760 ? 1 : 0);
         }
      }));
      this.field_284.add(new Class306("r_remodel", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_2176.method_1759();
            Minecraft.field_1677 = true;
            Class119.field_1519.field_267.method_1923();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("r_clouds", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_741 = (Integer)var1[0] == 1;
         }

         @Override
         public String method_867() {
            return Class119.field_1519.field_741 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("r_nobiome", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class310.field_2660 = (Integer)var1[0] == 1;
         }

         @Override
         public String method_867() {
            return Class310.field_2660 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("r_texfilter", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class310.field_1409 = (Integer)var1[0] == 1;
            Class119.field_1519.field_2176.method_1759();
         }

         @Override
         public String method_867() {
            return "" + (Class310.field_1409 ? 1 : 0);
         }
      }));
      this.field_284.add(new Class306("r_fullscreen", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_122 = (Integer)var1[0] == 1;

            try {
               Display.setFullscreen((Integer)var1[0] == 1);
            } catch (LWJGLException var3) {
               var3.printStackTrace();
            }

            Display.update();
         }

         @Override
         public String method_867() {
            return "" + (Class119.field_1519.field_122 ? 1 : 0);
         }
      }));
      this.field_284.add(new Class306("r_mode", new Class[]{Integer.class, Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.method_787((Integer)var1[0], (Integer)var1[1]);
            Display.update();
         }

         @Override
         public String method_867() {
            return Class119.field_1519.field_2517 + " " + Class119.field_1519.field_2477;
         }
      }));
      this.field_284.add(new Class306("r_texfx", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Minecraft.field_2639 = (Integer)var1[0] == 1;
         }

         @Override
         public String method_867() {
            return Minecraft.field_2639 ? "1" : "0";
         }
      }));
      this.field_284.add(new Class306("gui_versionstring", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class273.field_2028 = (String)var1[0];
         }

         @Override
         public String method_867() {
            return Class273.field_2028;
         }
      }));
      this.field_284.add(new Class306("zm_givepoints", new Class[]{Integer.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class310.field_1164) {
               ((Class404)Class119.field_1519.field_2787).field_2805.method_1230(((Integer)var1[0]).intValue());
            }
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("INTERLOPE", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            throw new RuntimeException("Unable to connect to s0.fsky.org:27015");
         }

         @Override
         public String method_867() {
            return "~exec";
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
      this.field_284.add(new Class306("mason", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            throw new RuntimeException("Unable to find numeric definition.");
         }

         @Override
         public String method_867() {
            return "~exec";
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
      this.field_284.add(new Class306("record", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_139.method_252(Class119.field_1519.field_2787);
            System.out.println("Demo record started");
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("stopdemo", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_139.method_1740();
            System.out.println("Demo record finished, " + Class119.field_139.field_586.size() + " frames");
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("savedemo", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_139.method_115((String)var1[0]);
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284
         .add(
            new Class306(
               "frrn_savedemo",
               new Class[0],
               new Class241() {
                  @Override
                  public void method_1477(Object... var1) {
                     if (Class119.field_1519.field_2787 instanceof Class213) {
                        Calendar var2 = Calendar.getInstance();
                        ((Class213)Class119.field_1519.field_2787)
                           .field_2012
                           .method_115(
                              Minecraft.method_1379()
                                 + "/freeerundemo-"
                                 + ((Class262)Class119.field_1519.field_2648).field_2737.replace('\\', '_').replace('/', '_')
                                 + "-"
                                 + var2.get(5)
                                 + "-"
                                 + (var2.get(2) + 1)
                                 + "-"
                                 + var2.get(1)
                                 + "@"
                                 + var2.get(11)
                                 + "-"
                                 + var2.get(12)
                                 + "-"
                                 + var2.get(13)
                                 + ".mcdem"
                           );
                     }
                  }

                  @Override
                  public String method_867() {
                     return "~exec";
                  }
               }
            )
         );
      this.field_284.add(new Class306("+frrn_reset", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class119.field_1519.field_2787 instanceof Class213) {
               ((Class213)Class119.field_1519.field_2787).method_549();
            }
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("+frrn_lastcheckpoint", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class119.field_1519.field_2787 instanceof Class213) {
               ((Class213)Class119.field_1519.field_2787).method_95();
            }
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("playdemo", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_139.method_593();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("playdemofile", new Class[]{String.class}, new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_139.method_1279((String)var1[0]);
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284
         .add(
            new Class306(
               "blockinfo",
               new Class[0],
               new Class241() {
                  @Override
                  public void method_1477(Object... var1) {
                     if (Class119.field_1519.field_864 != null && Class119.field_1519.field_864.field_1786 == 0) {
                        Class119.field_1519
                           .field_964
                           .method_967(
                              "Block ID: "
                                 + Class119.field_1519
                                    .field_2648
                                    .method_197(
                                       Class119.field_1519.field_864.field_1129,
                                       Class119.field_1519.field_864.field_1756,
                                       Class119.field_1519.field_864.field_513
                                    )
                                 + ", ["
                                 + Class119.field_1519.field_864.field_1129
                                 + ","
                                 + Class119.field_1519.field_864.field_1756
                                 + ","
                                 + Class119.field_1519.field_864.field_513
                                 + "]"
                           );
                     }
                  }

                  @Override
                  public String method_867() {
                     return "~exec";
                  }
               }
            )
         );
      this.field_284.add(new Class306("placeonme", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class454 var2 = Class119.field_1519.field_2648;
            Class563 var3 = Class119.field_1519.field_2787;
            var2.method_470((int)var3.field_1417, (int)var3.field_2654, (int)var3.field_2013, 1);
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("invclear", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_2787.field_559.method_397();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("+worldedit_setpos1", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_964.field_2247.method_409();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("+worldedit_setpos2", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_964.field_2247.method_849();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284.add(new Class306("+worldedit_accept", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            Class119.field_1519.field_964.field_2247.method_1358();
         }

         @Override
         public String method_867() {
            return "~exec";
         }
      }));
      this.field_284
         .add(
            new Class306(
               "sysexec",
               new Class[]{String.class},
               new Class241() {
                  @Override
                  public void method_1477(Object... var1) {
                     if (Class31.this.field_2683) {
                        try {
                           Runtime.getRuntime().exec((String)var1[0]);
                        } catch (IOException var3) {
                           var3.printStackTrace();
                        }
                     } else {
                        Class597.method_883(
                           "System execute is currently locked. This command will execute a system command.\n To confirm that you know what you're doing, add \"sysexec_unlock\" to autoexec.cfg and restart the game."
                        );
                     }
                  }

                  @Override
                  public String method_867() {
                     return "Executable command. " + (Class31.this.field_2683 ? "WARNING: This command may be dangerous!" : "Currently locked.");
                  }
               }
            )
         );
      this.field_284.add(new Class306("sysexec_unlock", new Class[0], new Class241() {
         @Override
         public void method_1477(Object... var1) {
            if (Class31.this.field_739) {
               Class31.this.field_2683 = true;
            }
         }

         @Override
         public String method_867() {
            return "~exec";
         }

         @Override
         public boolean method_1804() {
            return false;
         }
      }));
   }

   public void method_1532(String var1) {
   }

   public List<Class306> method_1355(String var1) {
      ArrayList var2 = new ArrayList();
      if (var1.equals("")) {
         return var2;
      }

      for (Class306 var4 : this.field_284) {
         if (var4.field_626.contains(var1) && var4.field_1521.method_1804()) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public Class306 method_45(String var1) {
      for (Class306 var3 : this.field_284) {
         if (var3.field_626.equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void method_175(String var1) {
      String[] var2 = var1.split(" ");
      if (var2.length > 0) {
         Class306 var3 = this.method_45(var2[0]);
         if (var3 != null
            && (
               var3.field_2822.length == 0
                  || var2.length == 1 + var3.field_2822.length
                  || var2.length >= 1 + var3.field_2822.length && var3.field_2822[var3.field_2822.length - 1] == String.class
            )) {
            Object[] var4 = new Object[var3.field_2822.length];

            try {
               for (int var5 = 0; var5 != var4.length; var5++) {
                  if (var3.field_2822[var5] == Integer.class) {
                     var4[var5] = Integer.parseInt(var2[1 + var5]);
                  } else if (var3.field_2822[var5] == Float.class) {
                     var4[var5] = Float.parseFloat(var2[1 + var5]);
                  } else if (var3.field_2822[var5] == Long.class) {
                     var4[var5] = Long.parseLong(var2[1 + var5]);
                  } else if (var3.field_2822[var5] == String.class) {
                     var4[var5] = var2[1 + var5];
                     if (var5 == var4.length - 1) {
                        for (int var6 = var5 + 1; var6 < var2.length - 1; var6++) {
                           var4[var5] = var4[var5] + " " + var2[1 + var6];
                        }
                     }
                  } else {
                     Class597.method_195("[3ECONSOLE] Type invalid");
                  }
               }

               var3.field_1521.method_1477(var4);
            } catch (Exception var7) {
               if (var7 instanceof RuntimeException) {
                  throw var7;
               }

               Class597.method_195("[3ECONSOLE] Failed to parse argument: " + var7.getClass().getSimpleName());
               var7.printStackTrace();
            }
         } else {
            Class597.method_195("[3ECONSOLE] Command not found or args wrong");
         }
      }

      this.field_1717 = "";
   }

   public void method_671(char var1, int var2) {
      if (var1 != 0) {
         if (Class119.method_696(29) && var2 != 29) {
            this.field_1717 = this.field_1717 + var2 + "";
         } else if (var1 != '\t') {
            this.field_1717 = this.field_1717 + var1;
         }
      }
   }
}
