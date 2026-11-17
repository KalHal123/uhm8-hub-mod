package srv;

import net.minecraft.server.MinecraftServer;

public class Class199 extends Class41 {
   public int field_494 = 0;
   public boolean field_638 = false;
   public boolean field_642 = false;

   public Class199(Class317 var1) {
      super(var1);
      this.field_855 = 1.62F;
      this.method_885(var1.field_944 + 0.5, var1.field_639 + 1, var1.field_1535 + 0.5, 0.0F, 0.0F);
      this.field_1090 = 20;
      this.field_1152 = "humanoid";
      this.field_882 = 180.0F;
      this.field_392 = 20;
      this.field_1477 = "";
      Class273.method_579("inbound connection [\\###.###.###.###]");
   }

   public void method_830() {
      this.field_120 = true;
      this.field_756 = true;
      this.method_577(this);
      Class273.method_579("[\\###.###.###.###] disconnected");
      MinecraftServer.field_667.field_1096.method_676(new Class356(this.field_331));
   }

   @Override
   public void method_664() {
      Class41[] var1 = new Class41[0];
      this.field_796
         .method_494(
            Class41.class, Class94.method_27(this.field_1324 - 16.0, 0.0, this.field_1321 - 16.0, this.field_1324 + 16.0, 128.0, this.field_1321 + 16.0)
         )
         .toArray(var1);

      for (Class41 var5 : var1) {
         float var6 = this.method_272(var5);
         if (!MinecraftServer.field_667.field_573.method_863("enableRecruiterConnections", true) || var6 < 19.0F) {
            this.method_830();
         }

         if (var5 != null) {
            double var7 = Math.atan2(this.field_1324 - var5.field_1324, -(this.field_1321 - var5.field_1321)) / Math.PI * 180.0;
            this.method_254((float)var7, 0.0F);
            double var9 = Class156.method_173(var5.field_909, this.field_909) - 180.0;
            boolean var11 = !Class156.method_425(
               this.field_796, 128, this.field_1324, this.field_632 + 1.0, this.field_1321, var5.field_1324, var5.field_632 + 1.0, var5.field_1321
            );
            if (var9 > -10.0 && var9 < 10.0 && var11) {
               this.field_494++;
               if (this.field_494 > 70) {
                  this.field_638 = true;
                  this.method_830();
               }
            }
         }
      }

      if (!this.field_642) {
         this.method_830();
      }

      super.method_664();
   }
}
