package srv;

import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

public class JList230 extends JList implements Interface116 {
   private MinecraftServer field_1215;
   private int field_315 = 0;

   public JList230(MinecraftServer var1) {
      this.field_1215 = var1;
      var1.method_470(this);
   }

   @Override
   public void method_955() {
      if (this.field_315++ % 20 == 0) {
         Vector var1 = new Vector();

         for (int var2 = 0; var2 < this.field_1215.field_1096.field_1197.size(); var2++) {
            var1.add(this.field_1215.field_1096.field_1197.get(var2).field_1477);
         }

         this.setListData(var1);
      }
   }
}
