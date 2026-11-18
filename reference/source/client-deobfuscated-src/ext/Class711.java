package ext;

import java.io.File;

public class Class711 extends Class262 {
   private Class422[] field_2187 = new Class422[]{
      new Class422(254, 79, 805, "spawn"),
      new Class422(253, 78, 802, 255, 80, 800, "checkpoint1"),
      new Class422(247, 78, 796, 248, 80, 794, "checkpoint2"),
      new Class422(237, 80, 792, 240, 78, 796, "checkpoint3"),
      new Class422(236, 78, 772, 240, 80, 769, "end")
   };

   public Class711(File var1, String var2) {
      super(var1, var2);
   }

   @Override
   public Class422[] method_1406() {
      return this.field_2187;
   }

   @Override
   public int method_714(long var1, long var3) {
      return 70;
   }
}
