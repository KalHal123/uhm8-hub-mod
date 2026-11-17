package srv;

import net.minecraft.server.MinecraftServer;

public class Class180 implements Interface61 {
   private MinecraftServer field_1217;

   public Class180(MinecraftServer var1) {
      this.field_1217 = var1;
   }

   @Override
   public void method_316(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public void method_665(Class252 var1) {
      this.field_1217.field_1201.method_327(var1);
   }

   @Override
   public void method_546(Class252 var1) {
      this.field_1217.field_1201.method_437(var1);
   }

   @Override
   public void method_1023(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_1217.field_1096.method_639(new Class233(var1, var2, var4, var6, var8, var9), var2, var4, var6, 15);
   }

   @Override
   public void method_187(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   @Override
   public void method_637() {
   }

   @Override
   public void method_129(int var1, int var2, int var3) {
      this.field_1217.field_1096.method_213(var1, var2, var3);
   }

   @Override
   public void method_959(String var1, int var2, int var3, int var4) {
   }

   @Override
   public void method_628(int var1, int var2, int var3, Class66 var4) {
      this.field_1217.field_1096.method_1028(var1, var2, var3, var4);
   }
}
