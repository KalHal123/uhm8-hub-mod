package ext;

import java.net.InetSocketAddress;
import java.util.Arrays;

public class Class304 {
   public String field_1061;
   public int field_1146;

   public Class304(InetSocketAddress var1) {
      this.field_1061 = var1.getAddress().getHostAddress();
      this.field_1146 = var1.getPort();
   }

   public int method_580() {
      String var1 = Arrays.toString(this.field_1061.split("\\."));
      System.out.println("Returned " + var1);
      return Integer.parseInt(var1);
   }
}
