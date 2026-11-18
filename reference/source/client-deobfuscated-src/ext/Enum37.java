package ext;

public enum Enum37 {
   field_1604(0),
   field_1904(1),
   field_889(2),
   field_2401(3);

   public final int field_2023;

   public static Enum37[] method_1012() {
      return (Enum37[])field_686.clone();
   }

   public static Enum37 method_1883(String var0) {
      return Enum.valueOf(Enum37.class, var0);
   }

   Enum37(int var3) {
      this.field_2023 = var3;
   }

   public static Enum37 method_142(Enum37 var0, int var1) {
      int var2 = (var0.field_2023 + var1) % 4;

      while (var2 < 0) {
         var2 += 4;
      }

      return method_1012()[var2];
   }
}
