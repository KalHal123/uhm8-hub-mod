package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Thread560 extends Thread {
   private Socket field_1545;
   private DataOutputStream field_589;
   private DataInputStream field_218;
   public String field_1707;
   public int field_422;
   public boolean field_3023 = true;
   public List<Interface602> field_1597 = new ArrayList<>();

   public Thread560(String var1, int var2) {
      this.field_1707 = var1;
      this.field_422 = var2;
   }

   @Override
   public void run() {
      try {
         this.field_1545 = new Socket(this.field_1707, this.field_422);
         this.field_589 = new DataOutputStream(this.field_1545.getOutputStream());
         this.field_218 = new DataInputStream(this.field_1545.getInputStream());

         while (this.field_3023) {
            while (this.field_1597.size() == 0) {
            }

            Thread196.method_1048(this.field_589, new Class541());
         }

         this.field_589.close();
         this.field_218.close();
         this.field_1545.close();
         Class597.method_883("client thread finished");
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }
}
