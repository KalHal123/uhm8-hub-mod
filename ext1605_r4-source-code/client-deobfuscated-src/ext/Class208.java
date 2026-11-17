package ext;

import java.io.File;

public class Class208 extends Class262 {
   private Class422[] field_2870 = new Class422[]{
      new Class422(-84, 97, 49, "spawn"),
      new Class422(-124, 97, 50, -125, 95, 49, "checkpoint1"),
      new Class422(-132, 94, 81, -135, 100, 82, "checkpoint2"),
      new Class422(-130, 91, 94, -127, 94, 97, "checkpoint3"),
      new Class422(-85, 86, 79, -87, 89, 83, "checkpoint4"),
      new Class422(-112, 102, 56, -117, 107, 54, "end")
   };

   public Class208(File var1, String var2) {
      super(var1, var2);
   }

   @Override
   public Class422[] method_1406() {
      return this.field_2870;
   }

   @Override
   public int method_714(long var1, long var3) {
      return 78;
   }
}
