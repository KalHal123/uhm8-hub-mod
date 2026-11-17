package ext;

public class Class657 extends Class265 {
   private Class265 field_2808;
   private int field_232 = 0;
   private String field_2619 = "";
   public static int field_35 = 0;

   public Class657(Class265 var1) {
      this.field_2808 = var1;
   }

   @Override
   public void method_1414() {
      this.field_232++;
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class423(0, this.field_2345 / 2 - 100, this.field_562 / 4 + 96 + 12, "Connect"));
      this.field_577.add(new Class423(1, this.field_2345 / 2 - 100, this.field_562 / 4 + 120 + 12, "Cancel"));
      if (Class278.field_1860 != null) {
         this.field_577.add(new Class423(2, this.field_2345 / 2 - 100, this.field_562 / 4 + 96 - 24, field_35 + ""));
      }

      this.field_577.get(0).field_143 = false;
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 == 1) {
            this.field_3013.method_1290(this.field_2808);
         } else if (var1.field_2254 == 0) {
            String[] var2 = this.field_2619.split(":");
            Class553.field_748.clear();

            try {
               this.field_3013.method_1290(new Class728(this.field_3013, var2[0], var2.length > 1 ? Integer.parseInt(var2[1]) : 25565));
            } catch (NumberFormatException var4) {
               this.field_3013.method_1290(new Class384("Connection failed", "Invalid port: " + var2[1]));
            }
         } else if (var1.field_2254 == 2) {
            field_35++;
            field_35 %= 3;
            this.field_577.get(2).field_1027 = field_35 + "";
         }
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
      if (var1 == 22) {
         String var3 = Class265.method_279();
         if (var3 == null) {
            var3 = "";
         }

         int var4 = 32 - this.field_2619.length();
         if (var4 > var3.length()) {
            var4 = var3.length();
         }

         if (var4 > 0) {
            this.field_2619 = this.field_2619 + var3.substring(0, var4);
         }
      }

      if (var1 == '\r') {
         this.method_1445(this.field_577.get(0));
      }

      if (var2 == 14 && this.field_2619.length() > 0) {
         this.field_2619 = this.field_2619.substring(0, this.field_2619.length() - 1);
      }

      if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
               .indexOf(var1)
            >= 0
         && this.field_2619.length() < 32) {
         this.field_2619 = this.field_2619 + var1;
      }

      this.field_577.get(0).field_143 = this.field_2619.length() > 0;
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, "Play Multiplayer", this.field_2345 / 2, this.field_562 / 4 - 60 + 20, 16777215);
      if (Class278.field_1860 != null) {
         method_773(this.field_1683, "-- WARNING --   JOINING IN SECURE MODE", this.field_2345 / 2 - 140, this.field_562 / 4 - 60 + 60 + 0, 10526880);
      } else {
         method_773(
            this.field_1683,
            "Minecraft Multiplayer is currently not finished, but there",
            this.field_2345 / 2 - 140,
            this.field_562 / 4 - 60 + 60 + 0,
            10526880
         );
         method_773(this.field_1683, "is some buggy early testing going on.", this.field_2345 / 2 - 140, this.field_562 / 4 - 60 + 60 + 9, 10526880);
         method_773(this.field_1683, "Enter the IP of a server to connect to it:", this.field_2345 / 2 - 140, this.field_562 / 4 - 60 + 60 + 36, 10526880);
      }

      int var4 = this.field_2345 / 2 - 100;
      int var5 = this.field_562 / 4 - 10 + 50 + 18;
      short var6 = 200;
      byte var7 = 20;
      method_194(var4 - 1, var5 - 1, var4 + var6 + 1, var5 + var7 + 1, -6250336);
      method_194(var4, var5, var4 + var6, var5 + var7, -16777216);
      method_773(this.field_1683, this.field_2619 + (this.field_232 / 6 % 2 == 0 ? "_" : ""), var4 + 4, var5 + (var7 - 8) / 2, 14737632);
      super.method_1938(var1, var2, var3);
   }
}
