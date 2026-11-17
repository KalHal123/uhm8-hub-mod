package ext;

import net.minecraft.client.Minecraft;

public class Class310 extends Class265 {
   private int field_1753 = 0;
   public static boolean field_2783 = true;
   public static boolean field_1164 = false;
   public static boolean field_742 = false;
   public static boolean field_1551 = false;
   public static boolean field_2337 = false;
   public static boolean field_2389 = false;
   public static boolean field_521 = false;
   public static boolean field_254 = false;
   public static boolean field_2631 = false;
   public static boolean field_1409 = false;
   public static boolean field_2036 = false;
   public static boolean field_760 = false;
   public static boolean field_973 = false;
   public static boolean field_2660 = false;

   public Class310(Minecraft var1) {
      this.field_3013 = var1;
   }

   private void method_1189(int var1) {
      switch (var1) {
         case 0:
            field_2783 = !field_2783;
            break;
         case 1:
            field_1164 = !field_1164;
            break;
         case 2:
            field_742 = !field_742;
            break;
         case 3:
            field_1551 = !field_1551;
            break;
         case 4:
            field_2337 = !field_2337;
            break;
         case 5:
            field_2389 = !field_2389;
            break;
         case 6:
            Class391 var2 = new Class391(this.field_3013.field_2648);
            var2.method_172(this.field_3013.field_2787.field_1417, this.field_3013.field_2787.field_2654, this.field_3013.field_2787.field_2013);
            this.field_3013.field_2648.method_1447(var2);
            break;
         case 7:
            field_521 = !field_521;
            break;
         case 8:
            field_254 = !field_254;
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
      switch (var2) {
         case 57:
         case 203:
         case 205:
            this.method_1189(this.field_1753);
            break;
         case 200:
            this.field_1753--;
            if (this.field_1753 < 0) {
               this.field_1753 += 9;
            }
            break;
         case 208:
            this.field_1753++;
            this.field_1753 %= 9;
      }

      super.method_437(var1, var2);
   }

   @Override
   public boolean method_1440() {
      return false;
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      method_194(0, 0, this.field_2345, this.field_562, -16777216);
      this.method_1491(this.field_1683, "Debug menu", this.field_2345 / 2, 15, 16777215);
      int var4 = this.field_2345 / 6;
      method_773(this.field_1683, "Allow recruiter connections: " + field_2783, var4, 40, 16777215);
      method_773(this.field_1683, "Enable cheats: " + field_1164, var4, 50, 16777215);
      method_773(this.field_1683, "Force fractured world: " + field_742, var4, 60, 16777215);
      method_773(this.field_1683, "Force nebula event: " + field_1551, var4, 70, 16777215);
      method_773(this.field_1683, "Show debug information: " + field_2337, var4, 80, 16777215);
      method_773(this.field_1683, "Hide UI: " + field_2389, var4, 90, 16777215);
      method_773(this.field_1683, "commit sus", var4, 100, 16777215);
      method_773(this.field_1683, "Enable flying: " + field_521, var4, 110, 16777215);
      method_773(this.field_1683, "Disable world generation: " + field_254, var4, 120, 16777215);
      method_773(this.field_1683, ">", var4 - 10, 40 + this.field_1753 * 10, 16777215);
      super.method_1938(var1, var2, var3);
   }
}
