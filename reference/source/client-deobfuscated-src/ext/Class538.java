package ext;

import java.io.File;
import java.util.List;

public class Class538 extends Class262 {
   private Class422[] field_201 = new Class422[]{
      new Class422(-233, 66, 22, "spawn"),
      new Class422(-234, 65, 17, -231, 67, 16, "spawn_start"),
      new Class422(-219, 68, -21, -218, 72, -24, "checkpoint1"),
      new Class422(-209, 72, -37, -212, 75, -40, "scaff_1"),
      new Class422(-249, 120, -54, -253, 124, -57, "after_portal_1"),
      new Class422(-213, 65, -67, -211, 66, -69, "water_section_portal_2"),
      new Class422(-160, 65, -66, -158, 68, -70, "end")
   };

   public Class538(File var1, String var2) {
      super(var1, var2);
   }

   @Override
   public Class422[] method_1406() {
      return this.field_201;
   }

   @Override
   public int method_714(long var1, long var3) {
      return var1 >= -211L && var1 <= -158L && var3 >= -72L && var3 <= -64L ? 51 : (var1 >= -219L && var1 <= -204L && var3 >= -26L && var3 <= -22L ? 63 : 65);
   }

   @Override
   public List<Class694> method_1732() {
      return this.field_1986;
   }
}
