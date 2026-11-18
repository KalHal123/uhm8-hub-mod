package ext;

import java.io.File;
import java.lang.reflect.Field;
import net.minecraft.client.Minecraft;

public class Class173 {
   public static void main(String[] var0) {
      try {
         Field var1 = Minecraft.class.getDeclaredField("minecraftDir");
         Field.setAccessible(new Field[]{var1}, true);
         var1.set(null, new File("."));
      } catch (Exception var2) {
         var2.printStackTrace();
         return;
      }

      Minecraft.main(var0);
   }
}
