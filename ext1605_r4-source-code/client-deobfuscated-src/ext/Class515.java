package ext;

import java.io.File;
import net.minecraft.client.Minecraft;

public class Class515 extends Class265 {
   protected Class265 field_2140;
   protected String field_214 = "Freerun";
   private boolean field_2031 = false;
   public long field_1572 = -1L;
   Class154 field_349;

   public Class515(Class265 var1) {
      this.field_2140 = var1;
      this.field_1572 = System.currentTimeMillis();
      this.field_349 = new Class154(var1.field_3013, "/gui/freerun_cover0.png", 500.0F);
   }

   public void method_1037() {
      while (this.field_577.size() > 2) {
         this.field_577.remove(2);
      }

      File var1 = Minecraft.method_1379();

      for (int var2 = 0; var2 < 6; var2++) {
         Class423 var3 = new Class423(
            var2, this.field_2345 / 2 - 75 + (var2 > 2 ? 80 : -80), this.field_562 / 4 + 25 * (var2 % 3), 150, 20, this.method_248(var2)
         );
         this.field_577.add(var3);
         Class686 var4 = Class454.method_763(var1, "/freerun/WorldFreerun" + var2);
         if (var4 == null) {
            var3.field_143 = false;
         }
      }
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.method_1911();
      this.method_1037();
   }

   protected String method_248(int var1) {
      switch (var1) {
         case 0:
            return "INTRODUCTION";
         case 1:
            return "CONSTRUCT";
         case 2:
            return "SKYLINE";
         case 3:
            return "SORROW";
         case 4:
            return "SHIVER";
         case 5:
            return "FINALE";
         default:
            return "???";
      }
   }

   public void method_1911() {
      this.field_577.add(new Class423(-2, this.field_2345 / 2 - 100, this.field_562 / 6 + 168, "Back"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 > -1) {
            Class<Class711> var2 = var1.field_2254 == 0
               ? Class711.class
               : (
                  var1.field_2254 == 1
                     ? Class208.class
                     : (
                        var1.field_2254 == 2
                           ? Class635.class
                           : (var1.field_2254 == 3 ? Class538.class : (var1.field_2254 == 4 ? Class150.class : (var1.field_2254 == 5 ? Class636.class : null)))
                     )
               );
            this.method_281("/freerun/WorldFreerun" + var1.field_2254, var2);
         } else if (var1.field_2254 == -2) {
            this.field_3013.method_1290(this.field_2140);
         }
      }
   }

   public void method_281(String var1, Class<? extends Class262> var2) {
      if (var2 != null) {
         ((Class742)Class390.field_2495).field_413 = false;
         this.field_3013.method_1290((Class265)null);
         if (!this.field_2031) {
            this.field_2031 = true;
            this.field_3013.field_3103 = new Class420(this.field_3013);
            this.field_3013.method_443(var1, var2);
            this.field_3013.method_1290((Class265)null);
         }
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      for (Class423 var5 : this.field_577) {
         if (var5.field_2767 && !this.field_349.field_415.contains("cover" + var5.field_2254 + ".png") && var5.field_2254 >= 0 && var5.field_2254 <= 5) {
            this.field_349.method_1006("/gui/freerun_cover" + var5.field_2254 + ".png");
         }
      }

      this.field_349.method_609(this.field_2345, this.field_562);
      this.method_1491(this.field_1683, this.field_214, this.field_2345 / 2, 20, 16777215);
      this.method_1491(this.field_1683, "-- FREERUN --", this.field_2345 / 2, this.field_562 / 6 + 118, 16777215);
      this.method_1491(this.field_1683, "Test your skills using the new gameplay mechanics", this.field_2345 / 2, this.field_562 / 6 + 138, 10526880);
      this.method_1491(this.field_1683, "by playing these timed stages.", this.field_2345 / 2, this.field_562 / 6 + 148, 10526880);
      super.method_1938(var1, var2, var3);
   }
}
