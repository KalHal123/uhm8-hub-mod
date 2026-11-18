import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class hy {
   public static final Object a = new Object();
   public static int b;
   public static int c;
   private Object d = new Object();
   private Socket e;
   private DataInputStream f;
   private DataOutputStream g;
   private boolean h = true;
   private List i = Collections.synchronizedList(new LinkedList());
   private List j = Collections.synchronizedList(new LinkedList());
   private List k = Collections.synchronizedList(new LinkedList());
   private kq l;
   private boolean m = false;
   private Thread n;
   private Thread o;
   private boolean p = false;
   private String q = "";
   private int r = 0;
   private int s = 0;
   private int t = 0;

   public hy(Socket var1, String var2, kq var3) {
      this.e = var1;
      this.l = var3;
      var1.setTrafficClass(24);
      this.f = new DataInputStream(var1.getInputStream());
      this.g = new DataOutputStream(var1.getOutputStream());
      this.o = new mv(this, var2 + " read thread");
      this.n = new mx(this, var2 + " write thread");
      this.o.start();
      this.n.start();
   }

   public void a(fd var1) {
      if (!this.m) {
         synchronized (this.d) {
            this.s = this.s + var1.a() + 1;
            if (var1.j) {
               this.k.add(var1);
            } else {
               this.j.add(var1);
            }
         }
      }
   }

   private void b() {
      try {
         boolean var1 = true;
         if (!this.j.isEmpty()) {
            var1 = false;
            fd var2;
            synchronized (this.d) {
               var2 = (fd)this.j.remove(0);
               this.s = this.s - (var2.a() + 1);
            }

            fd.a(var2, this.g);
         }

         if ((var1 || this.t-- <= 0) && !this.k.isEmpty()) {
            var1 = false;
            fd var10;
            synchronized (this.d) {
               var10 = (fd)this.k.remove(0);
               this.s = this.s - (var10.a() + 1);
            }

            fd.a(var10, this.g);
            this.t = 50;
         }

         if (var1) {
            Thread.sleep(10L);
         }
      } catch (InterruptedException var8) {
      } catch (Exception var9) {
         if (!this.p) {
            this.a(var9);
         }
      }
   }

   private void c() {
      try {
         fd var1 = fd.b(this.f);
         if (var1 != null) {
            this.i.add(var1);
         } else {
            this.a("End of stream");
         }
      } catch (Exception var2) {
         if (!this.p) {
            this.a(var2);
         }
      }
   }

   private void a(Exception var1) {
      var1.printStackTrace();
      this.a("Internal exception: " + var1.toString());
   }

   public void a(String var1) {
      if (this.h) {
         this.p = true;
         this.q = var1;
         new mu(this).start();
         this.h = false;

         try {
            this.f.close();
         } catch (Throwable var5) {
         }

         try {
            this.g.close();
         } catch (Throwable var4) {
         }

         try {
            this.e.close();
         } catch (Throwable var3) {
         }
      }
   }

   public void a() {
      if (this.s > 1048576) {
         this.a("Send buffer overflow");
      }

      if (this.i.isEmpty()) {
         if (this.r++ == 1200) {
            this.a("Timed out");
         }
      } else {
         this.r = 0;
      }

      int var1 = 100;

      while (!this.i.isEmpty() && var1-- >= 0) {
         fd var2 = (fd)this.i.remove(0);
         var2.a(this.l);
      }

      if (this.p && this.i.isEmpty()) {
         this.l.a(this.q);
      }
   }
}
