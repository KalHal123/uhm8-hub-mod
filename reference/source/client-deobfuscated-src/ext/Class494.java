package ext;

import net.minecraft.client.Minecraft;

public class Class494 extends Class663 {
   public Class494(Minecraft var1) {
      super(var1);
      this.field_1729 = true;
   }

   @Override
   public void method_1476(Class354 var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.field_559.field_1518[var2] == null) {
            this.field_2987.field_2787.field_559.field_1518[var2] = new Class334(Class277.field_2364.get(var2).field_2151);
         } else {
            this.field_2987.field_2787.field_559.field_1518[var2].field_2326 = 1;
         }
      }
   }

   @Override
   public boolean method_1746() {
      return false;
   }

   @Override
   public void method_820(Class454 var1) {
      super.method_820(var1);
   }

   @Override
   public void method_1177() {
   }
}
