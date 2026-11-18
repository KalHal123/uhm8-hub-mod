package ext;

public class Class500 extends Class265 {
   private Class265 field_952;
   protected String field_1140 = "Options";
   private Class693 field_2521;
   public Class112[] field_1088 = new Class112[]{
      new Class112("AUDIO", new int[]{0, 1}),
      new Class112("CONTROLS", new int[]{2, 3, 100}),
      new Class112("GAME", new int[]{8, 5, 10}),
      new Class112("GRAPHICS", new int[]{4, 6, 7, 9, 11, 12, 101}),
      new Class112("ADV.GRAPHICS", new int[]{20, 21, 22, 23, 24})
   };
   int field_162 = 0;

   public Class500(Class265 var1, Class693 var2) {
      this.field_952 = var1;
      this.field_2521 = var2;
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      byte var1 = 80;

      for (int var2 = 0; var2 != this.field_1088.length; var2++) {
         Class112 var3 = this.field_1088[var2];
         Class279 var4 = new Class279(300 + var2, 10 + var1 * var2, 50, var1, 20, var3.field_2999, false);
         this.field_577.add(var4);
         var4.field_143 = this.field_162 != var2;
      }

      int var7 = 0;
      byte var8 = 100;

      for (int var9 = 0; var9 < this.field_1088[this.field_162].field_3067.length; var9++) {
         int var5 = this.field_1088[this.field_162].field_3067[var9];
         int var6 = this.field_2521.method_761(var5);
         if (var6 == 0) {
            this.field_577.add(new Class331(var5, this.field_2345 / 2 - 155 + var9 % 2 * 160, var8 + 24 * (var9 >> 1), this.field_2521.method_1698(var5)));
         } else {
            this.field_577
               .add(
                  new Class80(
                     var5,
                     this.field_2345 / 2 - 155 + var9 % 2 * 160,
                     var8 + 24 * (var9 >> 1),
                     var5,
                     this.field_2521.method_1698(var5),
                     this.field_2521.method_880(var5)
                  )
               );
         }

         var7 = this.field_577.get(this.field_577.size() - 1).field_2157;
      }

      this.field_577.add(new Class279(200, this.field_2345 / 2 - 100, Math.min(this.field_562 / 6 * 5, var7 + 58), 180, 20, "Done", false));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 < 100) {
            this.field_2521.method_1810(var1.field_2254, 1);
            var1.field_1027 = this.field_2521.method_1698(var1.field_2254);
         }

         if (var1.field_2254 == 100) {
            this.field_3013.method_1290(new Class516(this, this.field_2521));
         }

         if (var1.field_2254 == 101) {
            this.field_3013.method_1290(new Class367(this));
         }

         if (var1.field_2254 == 200) {
            this.field_2521.method_1024();
            this.field_3013.method_1290(this.field_952);
         }

         if (var1.field_2254 >= 300 && var1.field_2254 < 400) {
            this.field_162 = var1.field_2254 - 300;
            this.method_836();
         }
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, this.field_1140, this.field_2345 / 2, 20, 16777215);
      Class254.method_421(0, 80, this.field_2345, this.field_562, -1610612736, 537657372);
      super.method_1938(var1, var2, var3);
   }
}
