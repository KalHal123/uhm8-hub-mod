package ext;

public class Class570 {
   public long field_2076;
   public String field_1122 = "";

   public Class570(long var1, String var3) {
      this.field_2076 = var1;
      this.field_1122 = var3;
   }

   public void method_1726(Class136 var1) {
      if (this.field_1122.length() > 2 && this.field_1122.substring(0, 2).equals("dc")) {
         Class119.field_1519.field_964.method_967("<" + var1.field_1716 + "> " + this.field_1122.substring(3));
      }
   }
}
