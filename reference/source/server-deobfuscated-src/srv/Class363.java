package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Class363 {
   public static final Object field_923 = new Object();
   public static int field_611;
   public static int field_366;
   private Object field_552 = new Object();
   private Socket field_1498;
   private DataInputStream field_1333;
   private DataOutputStream field_709;
   private boolean field_925 = true;
   private List field_139 = Collections.synchronizedList(new LinkedList());
   private List field_1559 = Collections.synchronizedList(new LinkedList());
   private List field_942 = Collections.synchronizedList(new LinkedList());
   private Class191 field_1223;
   private boolean field_1375 = false;
   private Thread field_1517;
   private Thread field_1374;
   private boolean field_544 = false;
   private String field_598 = "";
   private int field_16 = 0;
   private int field_1276 = 0;
   private int field_793 = 0;

   public Class363(Socket var1, String var2, Class191 var3) throws IOException {
      this.field_1498 = var1;
      this.field_1223 = var3;
      var1.setTrafficClass(24);
      this.field_1333 = new DataInputStream(var1.getInputStream());
      this.field_709 = new DataOutputStream(var1.getOutputStream());
      this.field_1374 = new Thread203(this, var2 + " read thread");
      this.field_1517 = new Thread109(this, var2 + " write thread");
      this.field_1374.start();
      this.field_1517.start();
   }

   public void method_804(Class191 var1) {
      this.field_1223 = var1;
   }

   public void method_287(Class318 var1) {
      if (!this.field_1375) {
         Object var3 = this.field_552;
         synchronized (this.field_552) {
            this.field_1276 = this.field_1276 + var1.method_116() + 1;
            if (var1.field_198) {
               this.field_942.add(var1);
            } else {
               this.field_1559.add(var1);
            }
         }
      }
   }

   private void method_691() {
      try {
         boolean var1 = true;
         if (!this.field_1559.isEmpty()) {
            var1 = false;
            Object var4 = this.field_552;
            Class318 var2;
            synchronized (this.field_552) {
               var2 = (Class318)this.field_1559.remove(0);
               this.field_1276 = this.field_1276 - (var2.method_116() + 1);
            }

            Class318.method_463(var2, this.field_709);
         }

         if ((var1 || this.field_793-- <= 0) && !this.field_942.isEmpty()) {
            var1 = false;
            Object var13 = this.field_552;
            Class318 var11;
            synchronized (this.field_552) {
               var11 = (Class318)this.field_942.remove(0);
               this.field_1276 = this.field_1276 - (var11.method_116() + 1);
            }

            Class318.method_463(var11, this.field_709);
            this.field_793 = 50;
         }

         if (var1) {
            Thread.sleep(10L);
         }
      } catch (InterruptedException var9) {
      } catch (Exception var10) {
         if (!this.field_544) {
            this.method_371(var10);
         }
      }
   }

   private void method_258() {
      try {
         Class318 var1 = Class318.method_876(this.field_1333);
         if (var1 != null) {
            this.field_139.add(var1);
         } else {
            this.method_807("End of stream");
         }
      } catch (Exception var2) {
         if (!this.field_544) {
            this.method_371(var2);
         }
      }
   }

   private void method_371(Exception var1) {
      var1.printStackTrace();
      this.method_807("Internal exception: " + var1.toString());
   }

   public void method_807(String var1) {
      if (this.field_925) {
         this.field_544 = true;
         this.field_598 = var1;
         new Thread138(this).start();
         this.field_925 = false;

         try {
            this.field_1333.close();
         } catch (Throwable var5) {
         }

         try {
            this.field_709.close();
         } catch (Throwable var4) {
         }

         try {
            this.field_1498.close();
         } catch (Throwable var3) {
         }
      }
   }

   public void method_2() {
      if (this.field_1276 > 1048576) {
         this.method_807("Send buffer overflow");
      }

      if (this.field_139.isEmpty()) {
         if (this.field_16++ == 1200) {
            this.method_807("Timed out");
         }
      } else {
         this.field_16 = 0;
      }

      int var1 = 100;

      while (!this.field_139.isEmpty() && var1-- >= 0) {
         Class318 var2 = (Class318)this.field_139.remove(0);
         var2.method_1020(this.field_1223);
      }

      if (this.field_544 && this.field_139.isEmpty()) {
         this.field_1223.method_61(this.field_598);
      }
   }

   public SocketAddress method_778() {
      return this.field_1498.getRemoteSocketAddress();
   }

   public void method_934() {
      this.field_1375 = true;
      this.field_1374.interrupt();
      new Thread168(this).start();
   }

   public int method_12() {
      return this.field_942.size();
   }

   static boolean method_490(Class363 var0) {
      return var0.field_925;
   }

   static boolean method_191(Class363 var0) {
      return var0.field_1375;
   }

   static void method_928(Class363 var0) {
      var0.method_258();
   }

   static void method_401(Class363 var0) {
      var0.method_691();
   }

   static Thread method_113(Class363 var0) {
      return var0.field_1374;
   }

   static Thread method_1002(Class363 var0) {
      return var0.field_1517;
   }
}
