package ext;

public class Comparable726 implements Comparable {
   private static long field_1621 = 0L;
   public int field_2478;
   public int field_2818;
   public int field_3006;
   public int field_2760;
   public long field_1211;
   private long field_1914 = field_1621++;

   public Comparable726(int var1, int var2, int var3, int var4) {
      this.field_2478 = var1;
      this.field_2818 = var2;
      this.field_3006 = var3;
      this.field_2760 = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Comparable726)) {
         return false;
      }

      Comparable726 var2 = (Comparable726)var1;
      return this.field_2478 == var2.field_2478
         && this.field_2818 == var2.field_2818
         && this.field_3006 == var2.field_3006
         && this.field_2760 == var2.field_2760;
   }

   @Override
   public int hashCode() {
      return (this.field_2478 * 128 * 1024 + this.field_3006 * 128 + this.field_2818) * 256 + this.field_2760;
   }

   public Comparable726 method_1791(long var1) {
      this.field_1211 = var1;
      return this;
   }

   public int method_598(Comparable726 var1) {
      return this.field_1211 < var1.field_1211
         ? -1
         : (this.field_1211 > var1.field_1211 ? 1 : (this.field_1914 < var1.field_1914 ? -1 : (this.field_1914 > var1.field_1914 ? 1 : 0)));
   }

   @Override
   public int compareTo(Object var1) {
      return this.method_598((Comparable726)var1);
   }
}
