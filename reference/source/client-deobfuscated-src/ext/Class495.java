package ext;

public class Class495 {
   public Class326[] field_1706 = new Class326[4];
   public int field_1974 = 0;

   public void method_1599(int var1) {
      if (var1 == 49) {
         if (Class119.field_1519.field_864 != null && Class119.field_1519.field_864.field_1786 == 0) {
            Class366 var2 = Class119.field_1519.field_864;
            Class119.field_1519
               .field_964
               .method_967("Set position " + this.field_1974 + " to " + var2.field_1129 + ":" + var2.field_1756 + ":" + var2.field_513);
            this.field_1706[this.field_1974++] = new Class326(var2.field_1129, var2.field_1756, var2.field_513);
            if (this.field_1974 == 4) {
               for (int var3 = 0; var3 != 2; var3++) {
                  if (this.field_1706[var3 * 2].field_809 > this.field_1706[var3 * 2 + 1].field_809) {
                     long var4 = this.field_1706[var3 * 2 + 1].field_809;
                     this.field_1706[var3 * 2 + 1].field_809 = this.field_1706[var3 * 2].field_809;
                     this.field_1706[var3 * 2].field_809 = var4;
                  }

                  if (this.field_1706[var3 * 2].field_805 > this.field_1706[var3 * 2 + 1].field_805) {
                     long var6 = this.field_1706[var3 * 2 + 1].field_805;
                     this.field_1706[var3 * 2 + 1].field_805 = this.field_1706[var3 * 2].field_805;
                     this.field_1706[var3 * 2].field_805 = var6;
                  }

                  if (this.field_1706[var3 * 2].field_3039 > this.field_1706[var3 * 2 + 1].field_3039) {
                     long var7 = this.field_1706[var3 * 2 + 1].field_3039;
                     this.field_1706[var3 * 2 + 1].field_3039 = this.field_1706[var3 * 2].field_3039;
                     this.field_1706[var3 * 2].field_3039 = var7;
                  }
               }

               Class119.field_1519
                  .field_2648
                  .field_1986
                  .add(new Class694("---", this.field_1706[0], this.field_1706[1], this.field_1706[2], this.field_1706[3]));
               Class119.field_1519.field_964.method_967("New portal section added.");
               this.field_1974 = 0;
            }
         }
      } else if (var1 == 50) {
         this.field_1974--;
         if (this.field_1974 == -1) {
            this.field_1974 = 0;
         }

         Class119.field_1519.field_964.method_967("section:" + this.field_1974);
      }
   }
}
