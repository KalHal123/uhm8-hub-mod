import java.io.File;
import java.lang.reflect.Field;
import net.minecraft.client.Minecraft;

public class 26s50tt2Gmh58T1rqi2LTnzitgBCdT2wkgadu80DokYaK5CLU2taVo0pYWUw5rDkI7glswGnQOl1P0RsIn4G795UvQ2CwA8u6n {
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
