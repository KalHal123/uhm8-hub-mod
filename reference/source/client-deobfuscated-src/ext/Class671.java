package ext;

import java.io.File;
import net.minecraft.client.Minecraft;

public class Class671 extends Class744 {
   public Class671(Class265 var1) {
      super(var1);
      this.field_1237 = "Delete world";
   }

   @Override
   public void method_641() {
      this.field_577.add(new Class423(-2, this.field_2345 / 2 - 100, this.field_562 / 6 + 168, "Cancel"));
   }

   @Override
   public void method_1144(int var1) {
      String var2 = this.method_475(var1);
      if (var2 != null) {
         this.field_3013.method_1290(new Class335(this, "Are you sure you want to delete this world?", "'" + var2 + "' will be lost forever!", var1));
      }
   }

   @Override
   public void method_1229(boolean var1, int var2) {
      if (var1) {
         File var3 = Minecraft.method_1379();
         Class454.method_1650(var3, this.method_475(var2));
      }

      this.field_3013.method_1290(this.field_155);
   }
}
