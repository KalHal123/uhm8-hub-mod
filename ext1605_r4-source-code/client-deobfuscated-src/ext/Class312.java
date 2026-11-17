package ext;

import java.io.File;
import net.minecraft.client.Minecraft;

public class Class312 extends Class604 {
   public Class270 field_1917 = null;

   public Class312(int var1, Class160 var2) {
      super(var1, var2);
      this.field_2972 = 178;
   }

   @Override
   public void method_1220(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      if (var5 instanceof Class354 && this.field_1917 == null) {
         Class119.field_1519.method_1824((Class454)null);
         System.gc();
         Class581 var6 = new Class581(new File(Minecraft.method_1379(), "saves"), var1.field_482);
         Class119.field_1519.method_1075(var6, "Joining Hub");
         Class119.field_1519.method_663();
      }
   }

   @Override
   public int method_774(int var1, int var2) {
      return this.field_2972;
   }
}
