package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Class126 {
   public static final Object field_693 = new Object();
   public static int field_792;
   public static int field_1281;
   private Object field_2778 = new Object();
   private Socket field_1996;
   private DataInputStream field_929;
   private DataOutputStream field_3095;
   private boolean field_974 = true;
   private List<Class471> field_2445 = Collections.synchronizedList(new LinkedList<>());
   private List<Class471> field_1020 = Collections.synchronizedList(new LinkedList<>());
   private List<Class471> field_609 = Collections.synchronizedList(new LinkedList<>());
   private Class8 field_991;
   private boolean field_1068 = false;
   private Thread field_2635;
   private Thread field_76;
   private boolean field_908 = false;
   private String field_824 = "";
   private int field_1744 = 0;
   private int field_1682 = 0;
   private int field_2358 = 0;

   public Class126(Socket var1, String var2, Class8 var3) throws IOException {
      this.field_1996 = var1;
      this.field_991 = var3;
      var1.setTrafficClass(24);
      this.field_929 = new DataInputStream(var1.getInputStream());
      this.field_3095 = new DataOutputStream(var1.getOutputStream());
      this.field_76 = new Thread376(this, var2 + " read thread");
      this.field_2635 = new Thread133(this, var2 + " write thread");
      this.field_76.start();
      this.field_2635.start();
   }

   public void method_993(Class471 var1) {
      if (!this.field_1068) {
         Object var3 = this.field_2778;
         synchronized (this.field_2778) {
            this.field_1682 = this.field_1682 + var1.method_1597() + 1;
            if (var1.field_2211) {
               this.field_609.add(var1);
            } else {
               this.field_1020.add(var1);
            }
         }
      }
   }

   private void method_1058() {
      try {
         boolean var1 = true;
         if (!this.field_1020.isEmpty()) {
            var1 = false;
            Object var4 = this.field_2778;
            Class471 var2;
            synchronized (this.field_2778) {
               var2 = this.field_1020.remove(0);
               this.field_1682 = this.field_1682 - (var2.method_1597() + 1);
            }

            Class471.method_674(var2, this.field_3095);
         }

         if ((var1 || this.field_2358-- <= 0) && !this.field_609.isEmpty()) {
            var1 = false;
            Object var13 = this.field_2778;
            Class471 var11;
            synchronized (this.field_2778) {
               var11 = this.field_609.remove(0);
               this.field_1682 = this.field_1682 - (var11.method_1597() + 1);
            }

            Class471.method_674(var11, this.field_3095);
            this.field_2358 = 50;
         }

         if (var1) {
            Thread.sleep(10L);
         }
      } catch (InterruptedException var9) {
      } catch (Exception var10) {
         if (!this.field_908) {
            this.method_426(var10);
         }
      }
   }

   private void method_1156() {
      try {
         Class471 var1 = Class471.method_704(this.field_929);
         if (var1 != null) {
            this.field_2445.add(var1);
         } else {
            this.method_136("End of stream");
         }
      } catch (Exception var2) {
         if (!this.field_908) {
            this.method_426(var2);
         }
      }
   }

   private void method_426(Exception var1) {
      var1.printStackTrace();
      this.method_136("Internal exception: " + var1);
   }

   public void method_136(String var1) {
      if (this.field_974) {
         this.field_908 = true;
         this.field_824 = var1;
         new Thread474(this).start();
         this.field_974 = false;

         try {
            this.field_929.close();
         } catch (Throwable var5) {
         }

         try {
            this.field_3095.close();
         } catch (Throwable var4) {
         }

         try {
            this.field_1996.close();
         } catch (Throwable var3) {
         }
      }
   }

   public void method_632() {
      if (this.field_1682 > 1048576) {
         this.method_136("Send buffer overflow");
      }

      if (this.field_2445.isEmpty()) {
         if (this.field_1744++ == 1200) {
            this.method_136("Timed out");
         }
      } else {
         this.field_1744 = 0;
      }

      int var1 = 100;

      while (!this.field_2445.isEmpty() && var1-- >= 0) {
         Class471 var2 = this.field_2445.remove(0);
         var2.method_1876(this.field_991);
      }

      if (this.field_908 && this.field_2445.isEmpty()) {
         this.field_991.method_223(this.field_824);
      }
   }

   static boolean method_1046(Class126 var0) {
      return var0.field_974;
   }

   static boolean method_1327(Class126 var0) {
      return var0.field_1068;
   }

   static void method_992(Class126 var0) {
      var0.method_1156();
   }

   static void method_1451(Class126 var0) {
      var0.method_1058();
   }

   static Thread method_1216(Class126 var0) {
      return var0.field_76;
   }

   static Thread method_994(Class126 var0) {
      return var0.field_2635;
   }
}
