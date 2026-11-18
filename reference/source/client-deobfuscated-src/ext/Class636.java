package ext;

import java.io.File;
import java.util.List;

public class Class636 extends Class262 {
   private Class422[] field_984 = new Class422[]{
      new Class422(104, 97, -136, "spawn"), new Class422(102, 96, -142, 105, 98, -141, "spawn_start"), new Class422(116, 88, -284, 123, 92, -277, "end")
   };

   public Class636(File var1, String var2) {
      super(var1, var2);
      this.field_2075 = 20000L;
   }

   @Override
   public Class422[] method_1406() {
      return this.field_984;
   }

   @Override
   public int method_714(long var1, long var3) {
      return 76;
   }

   @Override
   public List<Class694> method_1732() {
      return this.field_1986;
   }
}
