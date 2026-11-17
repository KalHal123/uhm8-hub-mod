package ext;

import javax.swing.JFrame;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Controller;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class Class119 {
   public static Controller[] field_685;
   public static Controller field_2990;
   public static int field_1398 = -1;
   public static int field_2062 = -1;
   public static int field_2234 = -1;
   public static int field_339 = -1;
   public static int field_2110 = -1;
   public static int field_2710 = -1;
   public static boolean field_2573 = true;
   public static boolean field_2925 = false;
   public static boolean field_901 = false;
   public static boolean field_262 = false;
   public static boolean field_142 = false;
   public static boolean field_1096 = false;
   public static boolean field_211 = false;
   public static float field_3115 = 0.0F;
   public static boolean field_2856 = false;
   public static Minecraft field_1519 = null;
   public static double field_243;
   public static double field_39;
   public static double field_777;
   private static float field_31;
   private static float field_2975;
   public static int field_1489 = 5;
   public static boolean field_1506 = true;
   public static boolean field_1477 = false;
   public static int field_1006 = -1;
   public static boolean field_1225 = false;
   public static boolean field_263 = false;
   public static Class54 field_139;
   public static boolean field_1276;
   public static Class694 field_1312;
   public static Class354 field_845;
   public static Class418 field_388;
   public static boolean field_2088 = false;
   public static Class486 field_1039;
   public static boolean field_1843 = false;

   public static void method_721() {
      if (field_2990 != null && field_2573 && field_2990.getAxisValue(4) != -1.0) {
         field_2573 = false;
      }
   }

   public static void method_717(Minecraft var0) {
      field_1519 = var0;
      field_139 = new Class54(field_1519.field_2787);
   }

   public static void method_1789() {
      field_2990 = null;
      Controllers.poll();
      Class597.method_883("CaptureGamepad()");
      field_685 = new Controller[Controllers.getControllerCount()];

      for (int var0 = 0; var0 != field_685.length; var0++) {
         try {
            field_685[var0] = Controllers.getController(var0);
            if (!field_685[var0].getName().toLowerCase().contains("controller (")) {
               field_685[var0] = null;
            } else {
               field_2990 = field_685[var0];
               Class597.method_883("Captured: " + field_685[var0].getName());
            }
         } catch (NullPointerException var2) {
         }
      }

      if (field_2990 != null) {
         new Thread446().start();
      }
   }

   public static void method_616() {
      field_262 = field_2990.isButtonPressed(5);
      field_1006 = field_1519.field_1754.field_1386.field_2381;
      field_1225 = field_262;
   }

   public static void method_312() {
      field_1096 = field_2990.getAxisValue(4) < -0.4F;
      field_1398 = 0;
      field_2234 = 0;
      field_339 = 0;
      field_2062 = 0;
      field_2925 = field_1096;
      field_901 = true;
   }

   public static void method_117() {
      field_142 = field_2990.isButtonPressed(4);
      method_1521();
   }

   public static void method_39() {
      field_211 = field_2990.getAxisValue(4) > 0.4F;
      field_1398 = 0;
      field_2234 = 0;
      field_339 = 0;
      field_2062 = 1;
      field_2925 = field_211;
      field_901 = true;
   }

   public static void method_1453() {
      field_263 = field_2990.isButtonPressed(0);
      field_1006 = 57;
      field_1225 = field_263;
      if (field_1225) {
         method_1333();
      }
   }

   public static void method_1856() {
      field_2856 = field_2990.isButtonPressed(7);
      field_1006 = 1;
      field_1225 = field_2856;
   }

   public static void method_309(float var0) {
      if (var0 != field_3115) {
         field_3115 = var0;
         field_1398 = (int)field_3115 * -1;
         field_2234 = 0;
         field_339 = 0;
         field_2062 = -1;
         field_2925 = false;
         field_901 = true;
      }
   }

   public static double method_1366(double var0, double var2) {
      return Math.atan2(var2, var0);
   }

   public static void method_1405() {
      if (field_1276) {
         Class447 var0 = field_1312.method_329(field_845);
         Class597.method_883("warping to " + field_1312.field_1899);
         field_1519.field_2787.method_172(var0.field_74, var0.field_3137, var0.field_2370);
         field_1276 = false;
      }
   }

   public static void method_170() {
      if (field_1519.field_2787 != null && !method_696(29) && Class310.field_1164) {
         field_1519.method_1290(new Class712(field_1519));
      }
   }

   public static void method_577() {
      if (field_1519.field_1883 == null) {
         if (field_1225) {
            field_388.field_1646.method_269(field_1006);
         }

         if (field_1006 == 26) {
            field_243 = field_1519.field_2787.field_1417;
            field_39 = field_1519.field_2787.field_2654;
            field_777 = field_1519.field_2787.field_2013;
            field_31 = field_1519.field_2787.field_1661;
            field_2975 = field_1519.field_2787.field_2866;
         } else if (field_1006 == 27 && Class310.field_1164) {
            field_1519.field_2787.field_1417 = field_243;
            field_1519.field_2787.field_2654 = field_39;
            field_1519.field_2787.field_2013 = field_777;
            field_1519.field_2787.field_1661 = field_31;
            field_1519.field_2787.field_2866 = field_2975;
            field_1519.field_2787.method_172(field_1519.field_2787.field_1417, field_1519.field_2787.field_2654, field_1519.field_2787.field_2013);
         } else if (field_1006 == field_1519.field_1754.field_2828.field_2381 && field_1225) {
            method_1521();
         } else if (field_1006 == field_1519.field_1754.field_922.field_2381 && field_1225) {
            method_1333();
         } else if (field_1006 == 88 && field_1225) {
            if (method_696(197) && method_696(70) && method_696(210)) {
               method_1311();
            }
         } else if (field_1006 == 67 && field_1225) {
            method_1786();
         } else if (field_1006 == 66 && field_1225) {
            method_1168();
         } else if (field_1006 == field_1519.field_1754.field_340.field_2381 && field_1225) {
            field_2088 = true;
         } else if (field_1225 && field_1519 != null && field_1519.field_2648 != null) {
            field_1519.field_964.field_2247.method_1457(field_1006);
            field_1519.field_964.field_1086.method_1599(field_1006);
         }
      }
   }

   public static void method_1311() {
      field_1519.method_1290(new Class310(field_1519));
   }

   private static void method_559() {
      if (field_1225) {
         if (field_1006 == 14) {
            if (field_388.field_1646.field_1717.length() > 0) {
               field_388.field_1646.field_1717 = field_388.field_1646.field_1717.substring(0, field_388.field_1646.field_1717.length() - 1);
            }
         } else if (field_1006 == field_1519.field_1754.field_340.field_2381 || field_1006 == 1) {
            field_2088 = false;
            field_388.field_1646.field_1717 = "";
         } else if (field_1006 == 28) {
            field_388.field_1646.method_175(field_388.field_1646.field_1717);
         } else {
            char var0 = Keyboard.getEventCharacter();
            field_388.field_1646.method_671(var0, field_1006);
         }
      }
   }

   public static void method_1864(int var0, int var1) {
      if (field_388 == null) {
         field_388 = new Class418(field_1519);
      }

      if (field_2088) {
         field_388.method_370(var0, var1);
      }
   }

   public static void method_1168() {
   }

   public static void method_1786() {
      JFrame var0 = new JFrame("Map");
      Class329 var1 = new Class329(field_1519.field_2648);
      var0.add(var1);
      var0.setSize(640, 480);
      var0.setVisible(true);
      var1.method_33();
   }

   public static void method_1333() {
      if (field_1519.field_2787 != null) {
         if (field_1519.field_2787 instanceof Class404 && !((Class404)field_1519.field_2787).field_2805.field_3041) {
            return;
         }

         if (field_1519.field_2787.method_296() && field_1519.field_2787.field_1796 == 0) {
            field_1519.field_2648
               .method_861(field_1519.field_2787.field_1417, field_1519.field_2787.field_2654, field_1519.field_2787.field_2013, "ext.marior", 1.0F, 1.0F);
            double var0 = method_1366(field_1519.field_2787.field_1347.field_2154, -field_1519.field_2787.field_1347.field_2082) / Math.PI * 180.0;
            double var2 = Math.toRadians(field_1519.field_2787.field_1661 + 90.0F + var0);
            double var4 = Math.cos(var2);
            double var6 = Math.sin(var2);
            field_1519.field_2787.field_1796 = 10;
            field_1519.field_2787.field_2549 += var4;
            field_1519.field_2787.field_2501 += 0.5;
            field_1519.field_2787.field_489 += var6;
         }
      }
   }

   public static void method_1521() {
      if (field_1519.field_2787 != null) {
         if (field_1519.field_2787 instanceof Class404 && !((Class404)field_1519.field_2787).field_2805.field_3041) {
            return;
         }

         if (field_1519.field_2787.field_1796 == 0) {
            field_1519.field_2648
               .method_861(field_1519.field_2787.field_1417, field_1519.field_2787.field_2654, field_1519.field_2787.field_2013, "ext.dash", 0.6F, 1.0F);
            field_1519.field_2787.field_1796 = 30;
            field_1519.field_2787.field_2549 *= 10.0;
            field_1519.field_2787.field_2501 *= 3.0;
            field_1519.field_2787.field_489 *= 10.0;
         } else if (field_1519.field_2787.field_1796 < 15) {
            field_1519.field_2648
               .method_861(field_1519.field_2787.field_1417, field_1519.field_2787.field_2654, field_1519.field_2787.field_2013, "ext.marior", 1.0F, 1.0F);
            double var0 = method_1366(field_1519.field_2787.field_1347.field_2154, -field_1519.field_2787.field_1347.field_2082) / Math.PI * 180.0;
            double var2 = Math.toRadians(field_1519.field_2787.field_1661 + 90.0F + var0);
            double var4 = Math.cos(var2);
            double var6 = Math.sin(var2);
            field_1519.field_2787.field_1796 = 30;
            field_1519.field_2787.field_2549 += var4;
            field_1519.field_2787.field_2501 += 0.2;
            field_1519.field_2787.field_489 += var6;
         }
      }
   }

   public static boolean method_1811() {
      method_1405();
      if (!field_2088) {
         if (Keyboard.next()) {
            field_1006 = Keyboard.getEventKey();
            field_1225 = Keyboard.getEventKeyState();
            method_577();
            return true;
         }

         if (field_2990 != null) {
            if (field_263 != field_2990.isButtonPressed(0)) {
               method_1453();
               return true;
            }

            if (field_2856 != field_2990.isButtonPressed(7)) {
               method_1856();
               return true;
            }

            if (field_142 != field_2990.isButtonPressed(4)) {
               method_117();
               return true;
            }

            if (field_262 != field_2990.isButtonPressed(5)) {
               method_616();
               return true;
            }
         }

         return false;
      } else {
         while (Keyboard.next()) {
            field_1006 = Keyboard.getEventKey();
            field_1225 = Keyboard.getEventKeyState();
            method_559();
         }

         return false;
      }
   }

   public static boolean method_1877() {
      method_721();
      if (Mouse.next()) {
         field_1398 = Mouse.getEventDWheel();
         field_2062 = Mouse.getEventButton();
         field_2234 = Mouse.getEventDX();
         field_339 = Mouse.getEventDY();
         field_2925 = Mouse.getEventButtonState();
         field_2110 = Mouse.getEventX();
         field_2710 = Mouse.getEventY();
         field_901 = false;
         return true;
      }

      if (field_2990 != null) {
         float var0 = field_2990.getPovX();
         if (field_1096 != field_2990.getAxisValue(4) < -0.4F) {
            method_312();
            return true;
         }

         if (field_211 != field_2990.getAxisValue(4) > 0.4F) {
            method_39();
            return true;
         }

         if (var0 != field_3115) {
            method_309(var0);
            return true;
         }
      }

      return false;
   }

   public static int method_790() {
      return field_1398;
   }

   public static int method_5() {
      return field_2062;
   }

   public static int method_1294() {
      return field_2234;
   }

   public static int method_1033() {
      return field_339;
   }

   public static int method_655() {
      return field_2110;
   }

   public static int method_827() {
      return field_2710;
   }

   public static boolean method_1085() {
      return field_2925;
   }

   public static int method_1302() {
      return field_1006;
   }

   public static boolean method_603() {
      return field_1225;
   }

   public static boolean method_696(int var0) {
      boolean var1 = false;
      if (var0 == 57 && field_2990 != null) {
         var1 = field_2990.isButtonPressed(0);
      } else if (var0 == field_1519.field_1754.field_1386.field_2381 && field_2990 != null) {
         var1 = field_2990.isButtonPressed(8);
      }

      return Keyboard.isKeyDown(var0) || var1;
   }

   public static boolean method_390(int var0) {
      return field_2990 != null && !field_2573
         ? Mouse.isButtonDown(var0) || (var0 == 0 ? field_2990.getAxisValue(4) < -0.4F : var0 == 1 && field_2990.getAxisValue(4) > 0.4F)
         : Mouse.isButtonDown(var0);
   }
}
