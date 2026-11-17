package ext;

import java.io.File;
import net.minecraft.client.Minecraft;

public class Class401 extends Class265 {
   protected Class265 field_872;
   protected String field_179 = "ZOMBIES";
   private boolean field_2472 = false;

   public Class401(Class265 var1) {
      this.field_872 = var1;
   }

   public void method_1439() {
      while (this.field_577.size() > 2) {
         this.field_577.remove(2);
      }

      File var1 = Minecraft.method_1379();
      this.field_577.add(new Class423(5, this.field_2345 / 2 - 100, this.field_562 / 6, this.method_1436(5)));
      this.field_577.add(new Class423(6, this.field_2345 / 2 - 100, this.field_562 / 6 + 20, this.method_1436(6)));
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.method_1180();
      this.method_1439();
      Class119.field_1519.field_485.method_963("Condemned", true);
   }

   protected String method_1436(int var1) {
      switch (var1) {
         case 5:
            return "[ZM] Ruinen der Untoten";
         case 6:
            return "[ZM] Metsan Talo";
         default:
            return "???";
      }
   }

   public void method_1180() {
      this.field_577.add(new Class423(-2, this.field_2345 / 2 - 100, this.field_562 / 6 + 168, "Back"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 > -1) {
            switch (var1.field_2254) {
               case 5:
                  this.method_231("/zombies/WorldZM1", Class412.class);
                  break;
               case 6:
                  this.method_231("/zombies/WorldZM2", Class24.class);
            }
         } else if (var1.field_2254 == -2) {
            Class119.field_1519.field_485.method_963("mainmenu", true);
            this.field_3013.method_1290(this.field_872);
         }
      }
   }

   public void method_231(String var1, Class<? extends Class46> var2) {
      ((Class742)Class390.field_2495).field_413 = false;
      this.field_3013.method_1290((Class265)null);
      if (!this.field_2472) {
         this.field_2472 = true;
         this.field_3013.field_3103 = new Class493(this.field_3013);
         this.field_3013.method_1363(var1, var2);
         this.field_3013.method_1290((Class265)null);
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
      if (var2 == 1) {
         Class119.field_1519.field_485.method_963("mainmenu", true);
      }

      super.method_437(var1, var2);
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, this.field_179, this.field_2345 / 2, 20, 16777215);
      super.method_1938(var1, var2, var3);
   }
}
