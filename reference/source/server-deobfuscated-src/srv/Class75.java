package srv;

import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class Class75 extends Class191 {
   public static Logger field_659 = Logger.getLogger("Minecraft");
   private static Random field_96 = new Random();
   public Class363 field_781;
   public boolean field_103 = false;
   private MinecraftServer field_1387;
   private int field_975 = 0;
   private String field_807 = null;
   private Class201 field_1488 = null;
   private String field_512 = "";

   public Class75(MinecraftServer var1, Socket var2, String var3) throws IOException {
      this.field_1387 = var1;
      this.field_781 = new Class363(var2, var3, this);
   }

   public void method_395() throws IOException {
      if (this.field_1488 != null) {
         this.method_898(this.field_1488);
         this.field_1488 = null;
      }

      if (this.field_975++ == 100) {
         this.method_858("Took too long to log in");
      } else {
         this.field_781.method_2();
      }
   }

   public void method_858(String var1) {
      field_659.info("Disconnecting " + this.method_317() + ": " + var1);
      this.field_781.method_287(new Class4(var1));
      this.field_781.method_934();
      this.field_103 = true;
   }

   @Override
   public void method_292(Class145 var1) {
      if (this.field_1387.field_1221) {
         this.field_512 = Long.toHexString(field_96.nextLong());
         this.field_781.method_287(new Class145(this.field_512));
      } else {
         this.field_781.method_287(new Class145("-"));
      }
   }

   @Override
   public void method_148(Class201 var1) {
      if (var1 instanceof Class33) {
         this.method_1006((Class33)var1);
      } else {
         this.field_807 = var1.field_118;
         if (!this.field_807.contains("/") && !this.field_807.contains("\\") && !this.field_807.contains("..")) {
            if (this.field_807.startsWith("@@")
               || this.field_807.trim().startsWith("dev") && (this.field_807.length() < 4 || !Character.isAlphabetic(this.field_807.codePointAt(3)))
               || this.field_807.startsWith("\u0001")
               || this.field_807.startsWith("\u0002")) {
               field_659.info("Invalid developer signature. Kicking.");
               if (this.field_807.equals("dev0")) {
                  this.method_858("## Nice going, shitlord.");
               } else if (this.field_807.equals("dev1")) {
                  this.method_858("## No. Bad.");
               } else if (this.field_807.equals("dev2")) {
                  this.method_858("## You better bugger off, pal.");
               } else if (this.field_807.equals("dev3")) {
                  this.method_858("## That's not your account now, is it?");
               } else if (this.field_807.equals("dev4")) {
                  this.method_858("## pwned");
               } else if (this.field_807.equals("dev5")) {
                  this.method_858("## This is mine :)");
               } else if (this.field_807.equals("dev6")) {
                  this.method_858("## \"Never gonna give you up, never gonna let you down\"");
               } else {
                  this.method_858("[SecureLogin] Please log in with development keys.");
               }
            } else if (var1.field_451 != 2) {
               this.method_858("Outdated client!");
            } else if (!this.field_1387.field_1221) {
               this.method_898(var1);
            } else {
               new Thread88(this, var1).start();
            }
         } else {
            this.method_858("Invalid characters in name.");
         }
      }
   }

   @Override
   public void method_1006(Class33 var1) {
      this.field_807 = var1.field_118;
      if (!this.field_807.contains("/") && !this.field_807.contains("\\") && !this.field_807.contains("..")) {
         if (var1.field_1338 != 0) {
            this.field_807 = (char)var1.field_1338 + this.field_807;
         }

         var1.field_118 = this.field_807;
         if (!var1.field_337) {
            this.method_858("seclogin::verify RESPONSE");
         } else if (var1.field_827 != 2) {
            this.method_858("Outdated client!");
         } else {
            this.method_898(var1);
         }
      } else {
         this.method_858("Invalid characters in name.");
      }
   }

   public void method_898(Class201 var1) {
      Class188 var2 = this.field_1387.field_1096.method_987(this, var1.field_118, var1.field_1350);
      if (var2 != null) {
         if (var1.field_118.charAt(0) != 2) {
            field_659.info(this.method_317() + " logged in " + (var1 instanceof Class33 ? "[verified]" : ""));
         }

         Class124 var3 = new Class124(this.field_1387, this.field_781, var2);
         if (var1 instanceof Class33) {
            var3.field_286 = field_96.nextInt(10000000) + 30;
         }

         var3.method_571(new Class201("", var3.field_286 + "", 0));
         var3.method_571(
            new Class367(
               this.field_1387.field_445.field_944,
               this.field_1387.field_445.field_639,
               this.field_1387.field_445.field_1535,
               this.field_1387.field_445.field_68
            )
         );
         this.field_1387.field_1096.method_673(var2);
         var3.method_93(var2.field_1324, var2.field_632, var2.field_1321, var2.field_909, var2.field_427);
         var3.method_822();
         this.field_1387.field_722.method_550(var3);
         var3.method_571(new Class99(this.field_1387.field_445.field_301));
      }

      this.field_103 = true;
   }

   @Override
   public void method_61(String var1) {
      field_659.info(this.method_317() + " lost connection");
      this.field_103 = true;
   }

   @Override
   public void method_580(Class318 var1) {
      this.method_858("Protocol error");
   }

   public String method_317() {
      return this.field_807 != null ? this.field_807 + " [" + this.field_781.method_778().toString() + "]" : this.field_781.method_778().toString();
   }

   static String method_242(Class75 var0) {
      return var0.field_512;
   }

   static Class201 method_419(Class75 var0, Class201 var1) {
      return var0.field_1488 = var1;
   }
}
