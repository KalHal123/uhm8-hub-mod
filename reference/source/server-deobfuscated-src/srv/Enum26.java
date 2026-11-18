package srv;

public enum Enum26 {
   field_1074(0),
   field_1339(1),
   field_140(2),
   field_1291(3);

   public final int field_634;

   public static Enum26[] method_50() {
      return (Enum26[])field_1273.clone();
   }

   public static Enum26 method_179(String var0) {
      return Enum.valueOf(Enum26.class, var0);
   }

   Enum26(int var3) {
      this.field_634 = var3;
   }

   public static Enum26 method_675(Enum26 var0, int var1) {
      int var2 = (var0.field_634 + var1) % 4;

      while (var2 < 0) {
         var2 += 4;
      }

      return method_50()[var2];
   }
}
