package ext;

public class Class77 implements Interface665 {
   public int field_454;
   public Class77.Inner467 field_2089;
   public Class77.Inner78 field_2304;
   public int[] field_1288;

   public Class77(int var1, Class77.Inner467 var2, Class77.Inner78 var3, int... var4) {
      this.field_454 = var1;
      this.field_2089 = var2;
      this.field_2304 = var3;
      this.field_1288 = var4;
   }

   @Override
   public String method_618() {
      String var1 = "{\"type\":1,\"parameters\":[" + this.field_454 + "," + this.field_2089.field_1617 + "," + this.field_2304.field_1196 + ",";

      for (int var2 = 0; var2 != this.field_1288.length; var2++) {
         var1 = var1 + this.field_1288[var2] + (var2 != this.field_1288.length - 1 ? "," : "");
      }

      return var1 + "]}";
   }

   public enum Inner328 {
      field_543(0),
      field_1077(1),
      field_300(2),
      field_1608(3),
      field_678(4),
      field_794(5),
      field_2431(6),
      field_683(7),
      field_2814(8),
      field_1524(9),
      field_3007(10),
      field_2981(11),
      field_3057(12),
      field_806(13),
      field_619(14),
      field_1838(15),
      field_3101(16);

      int field_1018;

      public static Class77.Inner328[] method_1113() {
         return (Class77.Inner328[])field_800.clone();
      }

      public static Class77.Inner328 method_340(String var0) {
         return Enum.valueOf(Class77.Inner328.class, var0);
      }

      Inner328(int var3) {
         this.field_1018 = var3;
      }
   }

   public enum Inner467 {
      field_1615(0),
      field_1724(1),
      field_668(2);

      int field_1617;

      public static Class77.Inner467[] method_1581() {
         return (Class77.Inner467[])field_1079.clone();
      }

      public static Class77.Inner467 method_275(String var0) {
         return Enum.valueOf(Class77.Inner467.class, var0);
      }

      Inner467(int var3) {
         this.field_1617 = var3;
      }
   }

   public enum Inner78 {
      field_2877(0),
      field_965(1),
      field_1816(2),
      field_1972(3),
      field_636(4),
      field_2294(5),
      field_2459(6),
      field_1983(7),
      field_309(8),
      field_1110(9),
      field_767(10),
      field_2881(11),
      field_642(12),
      field_2287(13),
      field_333(14),
      field_1195(15),
      field_1543(16),
      field_355(17),
      field_1059(18);

      int field_1196;

      public static Class77.Inner78[] method_247() {
         return (Class77.Inner78[])field_3091.clone();
      }

      public static Class77.Inner78 method_171(String var0) {
         return Enum.valueOf(Class77.Inner78.class, var0);
      }

      Inner78(int var3) {
         this.field_1196 = var3;
      }
   }
}
