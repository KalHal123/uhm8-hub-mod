package ext;

import java.util.List;

public class Class104 extends Class265 {
   private List<Enum710> field_2219;
   private Class268 field_1815;
   int field_52 = 0;
   final int field_2694 = 6;

   public Class104(List<Enum710> var1, Class268 var2) {
      this.field_2219 = var1;
      this.field_1815 = var2;
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class423(-727, this.field_2345 / 2 - 100, this.field_562 / 4 * 3, "Random"));
      this.field_577.add(new Class279(-2, this.field_2345 / 2 - 170, this.field_562 / 4 + 60, "<<"));
      this.field_577.add(new Class279(-3, this.field_2345 / 2 + 120, this.field_562 / 4 + 60, ">>"));

      for (int var1 = 0; var1 != 6; var1++) {
         int var2 = this.field_52 * 6 + var1;
         if (var2 >= this.field_2219.size()) {
            break;
         }

         this.field_577.add(new Class423(var2, this.field_2345 / 2 - 100, this.field_562 / 6 + 20 * var1, this.field_2219.get(var2).field_2759));
      }

      if (this.field_52 == 0) {
         this.field_577.get(1).field_143 = false;
      }

      if (this.field_52 * 6 + 6 > this.field_2219.size()) {
         this.field_577.get(2).field_143 = false;
      }
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 == -2) {
            this.field_52--;
            this.method_836();
         } else if (var1.field_2254 == -3) {
            this.field_52++;
            this.method_836();
         } else if (var1.field_2254 == -727) {
            this.field_1815.method_1656(this.field_2219.get(this.field_1815.field_2850.nextInt(this.field_2219.size())));
            this.field_3013.method_1290(null);
         } else {
            this.field_1815.method_1656(this.field_2219.get(var1.field_2254));
            this.field_3013.method_1290(null);
         }
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, "Choose a painting...", this.field_2345 / 2, 20, 16777215);
      super.method_1938(var1, var2, var3);
   }
}
