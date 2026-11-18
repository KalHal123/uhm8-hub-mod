package x;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

public class Class0188 {
   public static Logger 5bp105Gd20UNff0eE6H3J23xi46JnZ28bhMPSx95pcQvweS8Ry3rCE3Zod5w = Logger.getLogger("Minecraft");
   private File 0wH6I0R0LNoVqUdG0Ms80mZ6xQa3vkL60uh2Xugx2FNmz3mWjlod9egXKFji;

   public Class0188(File var1) {
      this.0wH6I0R0LNoVqUdG0Ms80mZ6xQa3vkL60uh2Xugx2FNmz3mWjlod9egXKFji = var1;
      var1.mkdir();
   }

   public void _q8433DFoPMuv5ud7QIBGOn6Qd94T6KK8Vg9my6Aoc1eb875o7NL98088T38/* $VF was: 6q8433DFoPMuv5ud7QIBGOn6Qd94T6KK8Vg9my6Aoc1eb875o7NL98088T38 */(
      Class0190 var1
   ) {
      try {
         Class0100 var2 = new Class0100();
         var1._jXT1iQNoex9kLDTNAI0oiVBxB6NXIi3310D09yj9ILpC5f5M77VJ8OB1XEa/* $VF was: 5jXT1iQNoex9kLDTNAI0oiVBxB6NXIi3310D09yj9ILpC5f5M77VJ8OB1XEa */(var2);
         File var3 = new File(this.0wH6I0R0LNoVqUdG0Ms80mZ6xQa3vkL60uh2Xugx2FNmz3mWjlod9egXKFji, "_tmp_.dat");
         File var4 = new File(
            this.0wH6I0R0LNoVqUdG0Ms80mZ6xQa3vkL60uh2Xugx2FNmz3mWjlod9egXKFji,
            var1._1wzk37wBXz14s8triAFLUEDVhJHBOk6mVUUew90vjO0110kZAnB38l2cZDq/* $VF was: 01wzk37wBXz14s8triAFLUEDVhJHBOk6mVUUew90vjO0110kZAnB38l2cZDq */()
               + ".dat"
         );
         Class0167._5673g3ADn8Wl588fp75Vzl9y5K8VpJEr768CHr5Bh6nT1zP8331LT5dF7aK/* $VF was: 75673g3ADn8Wl588fp75Vzl9y5K8VpJEr768CHr5Bh6nT1zP8331LT5dF7aK */(
            var2, new FileOutputStream(var3)
         );
         if (var4.exists()) {
            var4.delete();
         }

         var3.renameTo(var4);
      } catch (Exception var5) {
         5bp105Gd20UNff0eE6H3J23xi46JnZ28bhMPSx95pcQvweS8Ry3rCE3Zod5w.warning(
            "Failed to save player data for " + var1.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v
         );
      }
   }

   public void _8t5g3qql8ImprA5qemuFQZ8HN1sD1x515h7MFJ0n77UaBMjte0930zEcius/* $VF was: 68t5g3qql8ImprA5qemuFQZ8HN1sD1x515h7MFJ0n77UaBMjte0930zEcius */(
      Class0190 var1
   ) {
      try {
         File var2 = new File(
            this.0wH6I0R0LNoVqUdG0Ms80mZ6xQa3vkL60uh2Xugx2FNmz3mWjlod9egXKFji,
            var1._1wzk37wBXz14s8triAFLUEDVhJHBOk6mVUUew90vjO0110kZAnB38l2cZDq/* $VF was: 01wzk37wBXz14s8triAFLUEDVhJHBOk6mVUUew90vjO0110kZAnB38l2cZDq */()
               + ".dat"
         );
         if (var2.exists()) {
            Class0100 var3 = Class0167._VA7wvlmXLis2PNlFuU90q8246iExpBSi34LwnKC6ohph8ry207cnEZ9PaqN/* $VF was: 5VA7wvlmXLis2PNlFuU90q8246iExpBSi34LwnKC6ohph8ry207cnEZ9PaqN */(
               new FileInputStream(var2)
            );
            if (var3 != null) {
               var1._bjUzuECr42jJJ6489R0rPtlXlF7e8TPJVThIgghg7xoEJbiJN1E514qN0Al/* $VF was: 6bjUzuECr42jJJ6489R0rPtlXlF7e8TPJVThIgghg7xoEJbiJN1E514qN0Al */(
                  var3
               );
            }
         }
      } catch (Exception var4) {
         5bp105Gd20UNff0eE6H3J23xi46JnZ28bhMPSx95pcQvweS8Ry3rCE3Zod5w.warning(
            "Failed to load player data for " + var1.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v
         );
      }
   }
}
