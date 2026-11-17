package ext;

public class Class487 extends Class265 {
   private int field_450 = 0;

   @Override
   public void method_1414() {
      this.field_450++;
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class423(0, this.field_2345 / 2 - 100, this.field_562 / 4 + 120 + 12, "Back to title screen"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143 && var1.field_2254 == 0) {
         this.field_3013.method_1290(new Class373());
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, "Level save conflict", this.field_2345 / 2, this.field_562 / 4 - 60 + 20, 16777215);
      method_773(
         this.field_1683, "Minecraft detected a conflict in the level save data.", this.field_2345 / 2 - 140, this.field_562 / 4 - 60 + 60 + 0, 10526880
      );
      method_773(this.field_1683, "This could be caused by two copies of the game", this.field_2345 / 2 - 140, this.field_562 / 4 - 60 + 60 + 18, 10526880);
      method_773(this.field_1683, "accessing the same level.", this.field_2345 / 2 - 140, this.field_562 / 4 - 60 + 60 + 27, 10526880);
      method_773(
         this.field_1683, "To prevent level corruption, the current game has quit.", this.field_2345 / 2 - 140, this.field_562 / 4 - 60 + 60 + 45, 10526880
      );
      super.method_1938(var1, var2, var3);
   }
}
