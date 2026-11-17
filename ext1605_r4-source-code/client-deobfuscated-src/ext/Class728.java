package ext;

import net.minecraft.client.Minecraft;

public class Class728 extends Class265 {
   private Class348 field_2476;
   private boolean field_2986 = false;

   public Class728(Minecraft var1, String var2, int var3) {
      var1.method_1824((Class454)null);
      new Thread253(this, var1, var2, var3).start();
   }

   @Override
   public void method_1414() {
      if (this.field_2476 != null) {
         this.field_2476.method_458();
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class423(0, this.field_2345 / 2 - 100, this.field_562 / 4 + 120 + 12, "Cancel"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_2254 == 0) {
         this.field_2986 = true;
         if (this.field_2476 != null) {
            this.field_2476.method_1742();
         }

         this.field_3013.method_1290(new Class373());
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      if (this.field_2476 == null) {
         this.method_1491(this.field_1683, "Connecting to the server...", this.field_2345 / 2, this.field_562 / 2 - 50, 16777215);
         this.method_1491(this.field_1683, "", this.field_2345 / 2, this.field_562 / 2 - 10, 16777215);
      } else {
         this.method_1491(this.field_1683, "Logging in...", this.field_2345 / 2, this.field_562 / 2 - 50, 16777215);
         this.method_1491(this.field_1683, this.field_2476.field_1642, this.field_2345 / 2, this.field_562 / 2 - 10, 16777215);
      }

      super.method_1938(var1, var2, var3);
   }

   static Class348 method_1089(Class728 var0, Class348 var1) {
      return var0.field_2476 = var1;
   }

   static boolean method_55(Class728 var0) {
      return var0.field_2986;
   }

   static Class348 method_690(Class728 var0) {
      return var0.field_2476;
   }
}
