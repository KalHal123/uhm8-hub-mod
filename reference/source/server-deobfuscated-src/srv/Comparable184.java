package srv;

public class Comparable184 implements Comparable {
   private static long field_1334 = 0L;
   public int field_1191;
   public int field_414;
   public int field_1573;
   public int field_1027;
   public long field_751;
   private long field_661 = field_1334++;

   public Comparable184(int var1, int var2, int var3, int var4) {
      this.field_1191 = var1;
      this.field_414 = var2;
      this.field_1573 = var3;
      this.field_1027 = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Comparable184)) {
         return false;
      }

      Comparable184 var2 = (Comparable184)var1;
      return this.field_1191 == var2.field_1191 && this.field_414 == var2.field_414 && this.field_1573 == var2.field_1573 && this.field_1027 == var2.field_1027;
   }

   @Override
   public int hashCode() {
      return (this.field_1191 * 128 * 1024 + this.field_1573 * 128 + this.field_414) * 256 + this.field_1027;
   }

   public Comparable184 method_55(long var1) {
      this.field_751 = var1;
      return this;
   }

   public int method_901(Comparable184 var1) {
      return this.field_751 < var1.field_751
         ? -1
         : (this.field_751 > var1.field_751 ? 1 : (this.field_661 < var1.field_661 ? -1 : (this.field_661 > var1.field_661 ? 1 : 0)));
   }

   @Override
   public int compareTo(Object var1) {
      return this.method_901((Comparable184)var1);
   }
}
