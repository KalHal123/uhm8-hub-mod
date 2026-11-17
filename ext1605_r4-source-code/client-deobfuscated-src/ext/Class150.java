package ext;

import java.io.File;
import java.util.List;

public class Class150 extends Class262 {
   private Class422[] field_1298 = new Class422[]{
      new Class422(23, 82, -58, "spawn"),
      new Class422(12, 83, -41, 14, 85, -44, "spawn_start"),
      new Class422(17, 96, 33, 21, 100, 37, "checkpoint1"),
      new Class422(22, 94, 121, 18, 100, 118, "checkpoint2"),
      new Class422(12, 91, 196, 15, 95, 200, "checkpoint3"),
      new Class422(18, 112, 169, 21, 115, 172, "end")
   };

   public Class150(File var1, String var2) {
      super(var1, var2);
   }

   @Override
   public Class422[] method_1406() {
      return this.field_1298;
   }

   @Override
   public int method_714(long var1, long var3) {
      return 77;
   }

   @Override
   public List<Class694> method_1732() {
      return this.field_1986;
   }
}
