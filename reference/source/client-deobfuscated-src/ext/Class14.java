package ext;

import net.minecraft.client.Minecraft;

public class Class14 {
   private Minecraft field_765;

   public Class14(Minecraft var1) {
      this.field_765 = var1;
   }

   public void method_1847(Class273 var1, int var2, int var3) {
      if (Class119.field_1519.field_864 != null && Class119.field_1519.field_864.field_1786 == 1 && Class119.field_1519.field_864.field_541 instanceof Class268
         )
       {
         Class640 var4 = this.field_765.field_1541;
         String var5 = ((Class268)Class119.field_1519.field_864.field_541).field_2296.field_2759;
         int var6 = var4.method_962(var5);
         Class273.method_421(var2 / 2 - var6 / 2 - 2, var3 / 4, var2 / 2 + var6 / 2 + 2, var3 / 4 + 13, -1610612736, Integer.MIN_VALUE);
         var1.method_1491(var4, var5, var2 / 2, var3 / 4 + 2, -1);
      }
   }
}
