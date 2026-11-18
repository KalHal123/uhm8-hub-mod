package ext;

import java.net.InetSocketAddress;

public class Class270 extends Class454 {
   private InetSocketAddress field_1263;

   public Class270(String var1, String var2) {
      this(var1, var2.substring(0, var2.indexOf(":")), Integer.parseInt(var2.substring(var2.indexOf(":") + 1)));
   }

   public Class270(String var1, String var2, int var3) {
      super(var1);
      this.field_1263 = new InetSocketAddress(var2, var3);
   }

   public Class304 method_492() {
      return new Class304(this.field_1263);
   }
}
