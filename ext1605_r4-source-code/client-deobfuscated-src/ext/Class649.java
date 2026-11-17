package ext;

public class Class649 extends Class265 {
   Class265 field_1199 = null;

   public Class649(Class265 var1) {
      this.field_1199 = var1;
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class423(2, this.field_2345 / 16, this.field_562 / 4, "Multiplayer - LAN/Online"));
      this.field_577.add(new Class423(1, this.field_2345 / 16, this.field_562 / 4 + 30, "Singleplayer - Local"));
      this.field_577.add(new Class423(3, this.field_2345 / 16, this.field_562 / 4 + 60, "Freerun"));
      this.field_577.add(new Class279(0, this.field_2345 / 16, this.field_562 / 4 + 120, 100, 20, "Back", true));
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      Class254.method_421(0, 0, this.field_2345 / 4 + 150, this.field_562, -1610612736, 537657372);
      Class254.method_773(this.field_1683, "Play", this.field_2345 / 12, this.field_562 / 4 - 30, 16777215);
      super.method_1938(var1, var2, var3);
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_2254 == 0) {
         this.field_3013.method_1290(this.field_1199);
      }

      if (var1.field_2254 == 1) {
         this.field_3013.method_1290(new Class744(this));
      }

      if (var1.field_2254 == 2) {
         this.field_3013.method_1290(new Class657(this));
      }

      if (var1.field_2254 == 3) {
         if (Thread62.field_221) {
            this.field_3013.method_1290(Class119.method_696(54) ? new Class401(this) : new Class515(this));
         } else {
            this.field_3013.method_1290(new Class384("", "Downloading resources. Try again later."));
         }
      }
   }
}
