package ext;

import java.io.File;
import java.util.List;

public class Class635 extends Class262 {
   private Class422[] field_171 = new Class422[]{
      new Class422(-715, 103, -945, "spawn"),
      new Class422(-718, 102, -944, -721, 104, -946, "spawn_start"),
      new Class422(-752, 98, -910, -756, 102, -913, "checkpoint1"),
      new Class422(-698, 90, -818, -701, 94, -812, "checkpoint2"),
      new Class422(-697, 90, -783, -701, 93, -776, "checkpoint3"),
      new Class422(-652, 94, -800, -655, 96, -798, "checkpoint4"),
      new Class422(-633, 102, -769, -629, 104, -763, "checkpoint5"),
      new Class422(-574, 91, -776, -578, 95, -780, "end")
   };

   public Class635(File var1, String var2) {
      super(var1, var2);
   }

   @Override
   public Class422[] method_1406() {
      return this.field_171;
   }

   @Override
   public int method_714(long var1, long var3) {
      return 88;
   }

   @Override
   public List<Class694> method_1732() {
      return this.field_1986;
   }
}
