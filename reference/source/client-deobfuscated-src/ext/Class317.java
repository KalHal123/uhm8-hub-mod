package ext;

public class Class317 extends Class265 {
   private int field_2161 = 0;
   private int field_2058 = 0;

   @Override
   public void method_836() {
      this.field_2161 = 0;
      this.field_577.clear();
      this.field_577.add(new Class423(1, this.field_2345 / 16, this.field_562 / 4 + 48, "Save and quit to title"));
      if (this.field_3013.method_1129()) {
         this.field_577.get(0).field_1027 = "Disconnect";
      }

      this.field_577.add(new Class423(4, this.field_2345 / 16, this.field_562 / 4 + 24, "Back to game"));
      this.field_577.add(new Class423(0, this.field_2345 / 16, this.field_562 / 4 + 96, "Options..."));
      this.field_577.add(new Class423(2, this.field_2345 / 16, this.field_562 / 4 + 72, "Mods"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_2254 == 0) {
         this.field_3013.method_1290(new Class500(this, this.field_3013.field_1754));
      }

      if (var1.field_2254 == 1) {
         if (this.field_3013.method_1129()) {
            this.field_3013.field_2648.method_1133();
         }

         this.field_3013.method_1824((Class454)null);
         this.field_3013.method_1290(new Class373());
      }

      if (var1.field_2254 == 2) {
         this.field_3013.method_1290(new Class690(this));
      }

      if (var1.field_2254 == 4) {
         this.field_3013.method_1290((Class265)null);
         this.field_3013.method_663();
      }
   }

   @Override
   public void method_1414() {
      super.method_1414();
      this.field_2058++;
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      boolean var4 = !this.field_3013.field_2648.method_1246(this.field_2161++);
      if (var4 || this.field_2058 < 20) {
         float var5 = (this.field_2058 % 10 + var3) / 10.0F;
         var5 = Class469.method_1667(var5 * (float) Math.PI * 2.0F) * 0.2F + 0.8F;
         int var6 = (int)(255.0F * var5);
         Class254.method_773(this.field_1683, "Saving level..", 8, this.field_562 - 16, var6 << 16 | var6 << 8 | var6);
      }

      method_773(this.field_1683, "Game menu", this.field_2345 / 16, 46, 16777215);
      int var11 = Math.max(this.field_2345 / 16 + 210, this.field_2345 / 6 * 4);
      int var12 = this.field_562 / 4 + 20;
      Class254.method_773(this.field_1683, "Players nearby", var11, var12, 16777215);

      for (int var7 = 0; var7 != this.field_3013.field_2648.field_70.size(); var7++) {
         var12 += 12;
         Class354 var8 = this.field_3013.field_2648.field_70.get(var7);
         String var9 = var8.field_1716;
         Class254.method_773(
            this.field_1683, var9, var11, var12, var8 == this.field_3013.field_2787 ? -1610547456 : (var8 instanceof Class136 ? -1601054209 : -1593835521)
         );
      }

      super.method_1938(var1, var2, var3);
   }
}
