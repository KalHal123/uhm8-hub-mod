package srv;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Class325 extends Class317 {
   public Class219 field_326;
   public boolean field_1512 = false;
   public boolean field_1150;
   private boolean field_1347;
   private Class170 field_1562 = new Class304(
      this, 200, Interface349.class, new Class[]{Class220.class, Class360.class, Class239.class, Class333.class, Class221.class}
   );
   private Class170 field_1578 = new Class170(15, Class110.class, new Class[]{Class387.class, Class362.class, Class216.class, Class247.class});

   public Class325(File var1, String var2, boolean var3) {
      super(var1, var2);
      this.field_1347 = var3;
   }

   @Override
   public void method_70() {
      super.method_70();
      if (this.field_1347) {
         this.field_1562.method_966(this);
      }

      this.field_1578.method_966(this);
   }

   @Override
   protected Interface103 method_791(File var1) {
      this.field_326 = new Class219(this, new Class287(var1, true), new Class343(this, this.field_68));
      return this.field_326;
   }

   public List method_84(int var1, int var2, int var3, int var4, int var5, int var6) {
      ArrayList var7 = new ArrayList();

      for (int var8 = 0; var8 < this.field_839.size(); var8++) {
         Class66 var9 = this.field_839.get(var8);
         if (var9.field_720 >= var1
            && var9.field_1400 >= var2
            && var9.field_454 >= var3
            && var9.field_720 < var4
            && var9.field_1400 < var5
            && var9.field_454 < var6) {
            var7.add(var9);
         }
      }

      return var7;
   }
}
