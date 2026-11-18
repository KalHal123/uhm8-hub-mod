package ext;

import net.minecraft.client.Minecraft;

public class Class165 {
   private Minecraft field_2628;

   public Class165(Minecraft var1) {
      this.field_2628 = var1;
   }

   public String method_1795(long var1) {
      long var3 = var1 / 20L;
      long var5 = var3 / 60L;
      String var7 = Long.toString(var5);
      if (var7.length() == 1) {
         var7 = "0" + var7;
      }

      String var8 = Long.toString(var3 % 60L);
      if (var8.length() == 1) {
         var8 = "0" + var8;
      }

      int var9 = (int)((float)(var1 % 20L) / 20.0F * 1000.0F);
      String var10 = Integer.toString(var9);

      while (var10.length() < 3) {
         var10 = "0" + var10;
      }

      return var7 + ":" + var8 + "." + var10;
   }

   public void method_1649(Class273 var1, int var2, int var3) {
      Class640 var4 = this.field_2628.field_1541;
      Class213 var5 = (Class213)Class119.field_1519.field_2787;
      if (!var5.field_1473) {
         String var6 = "Time: " + this.method_1795(var5.field_497);
         Class273.method_773(var4, var6, var2 / 2 - var4.method_962(var6) / 2, var3 / 4, 16777215);
      } else {
         String var7 = "Time: " + this.method_1795(var5.field_1809.field_2075 - var5.field_2625);
         Class273.method_773(var4, var7, var2 / 2 - var4.method_962(var7) / 2, var3 / 4, 16777215);
      }
   }
}
