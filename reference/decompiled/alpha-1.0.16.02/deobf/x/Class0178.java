package x;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class Class0178 extends Class0288 {
   private boolean c = false;
   private Class0215 d;
   public String a;
   private Minecraft e;
   private Class0173 f;
   private boolean g = false;
   Random b = new Random();

   public Class0178(Minecraft var1, String var2, int var3) {
      this.e = var1;
      Socket var4 = new Socket(InetAddress.getByName(var2), var3);
      this.d = new Class0215(var4, "Client", this);
   }

   public void a() {
      if (!this.c) {
         this.d.a();
      }
   }

   @Override
   public void a(Class0196 var1) {
      this.e.b = new Class0348(this.e, this);
      this.f = new Class0173(this);
      this.f.v = true;
      this.e.a(this.f);
      this.e.a(new Class0084(this));
   }

   @Override
   public void a(Class0180 var1) {
      double var2 = var1.b / 32.0;
      double var4 = var1.c / 32.0;
      double var6 = var1.d / 32.0;
      Class0100 var8 = new Class0100(this.f, var2, var4, var6, new Class0124(var1.h, var1.i));
      var8.ak = var1.e / 128.0;
      var8.al = var1.f / 128.0;
      var8.am = var1.g / 128.0;
      var8.ba = var1.b;
      var8.bb = var1.c;
      var8.bc = var1.d;
      this.f.a(var1.a, var8);
   }

   @Override
   public void a(Class0270 var1) {
      double var2 = var1.b / 32.0;
      double var4 = var1.c / 32.0;
      double var6 = var1.d / 32.0;
      Class0268 var8 = null;
      if (var1.e == 10) {
         var8 = new Class0367(this.f, var2, var4, var6, 0);
      }

      if (var1.e == 11) {
         var8 = new Class0367(this.f, var2, var4, var6, 1);
      }

      if (var1.e == 12) {
         var8 = new Class0367(this.f, var2, var4, var6, 2);
      }

      if (var1.e == 1) {
         var8 = new Class0079(this.f, var2, var4, var6);
      }

      if (var8 != null) {
         var8.ba = var1.b;
         var8.bb = var1.c;
         var8.bc = var1.d;
         var8.an = 0.0F;
         var8.ao = 0.0F;
         var8.Z = var1.a;
         this.f.a(var1.a, var8);
      }
   }

   @Override
   public void a(Class0170 var1) {
      double var2 = var1.c / 32.0;
      double var4 = var1.d / 32.0;
      double var6 = var1.e / 32.0;
      float var8 = var1.f * 360 / 256.0F;
      float var9 = var1.g * 360 / 256.0F;
      Class0359 var10 = new Class0359(this.e.e, var1.b);
      var10.ba = var1.c;
      var10.bb = var1.d;
      var10.bc = var1.e;
      int var11 = var1.h;
      if (var11 == 0) {
         var10.b.a[var10.b.d] = null;
      } else {
         var10.b.a[var10.b.d] = new Class0124(var11);
      }

      var10.b(var2, var4, var6, var8, var9);
      this.f.a(var1.a, var10);
   }

   @Override
   public void a(Class0246 var1) {
      Class0268 var2 = this.f.b(var1.a);
      if (var2 != null) {
         var2.ba = var1.b;
         var2.bb = var1.c;
         var2.bc = var1.d;
         double var3 = var2.ba / 32.0;
         double var5 = var2.bb / 32.0;
         double var7 = var2.bc / 32.0;
         float var9 = var1.e * 360 / 256.0F;
         float var10 = var1.f * 360 / 256.0F;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   @Override
   public void a(Class0304 var1) {
      Class0268 var2 = this.f.b(var1.a);
      if (var2 != null) {
         var2.ba = var2.ba + var1.b;
         var2.bb = var2.bb + var1.c;
         var2.bc = var2.bc + var1.d;
         double var3 = var2.ba / 32.0;
         double var5 = var2.bb / 32.0;
         double var7 = var2.bc / 32.0;
         float var9 = var1.g ? var1.e * 360 / 256.0F : var2.an;
         float var10 = var1.g ? var1.f * 360 / 256.0F : var2.ao;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   @Override
   public void a(Class0254 var1) {
      this.f.c(var1.a);
   }

   @Override
   public void a(Class0111 var1) {
      Class0033 var2 = this.e.g;
      double var3 = var2.ah;
      double var5 = var2.ai;
      double var7 = var2.aj;
      float var9 = var2.an;
      float var10 = var2.ao;
      if (var1.h) {
         var3 = var1.a;
         var5 = var1.b;
         var7 = var1.c;
      }

      if (var1.i) {
         var9 = var1.e;
         var10 = var1.f;
      }

      var2.aI = 0.0F;
      var2.ak = var2.al = var2.am = 0.0;
      var2.b(var3, var5, var7, var9, var10);
      var1.a = var2.ah;
      var1.b = var2.ar.b;
      var1.c = var2.aj;
      var1.d = var2.ai;
      this.d.a(var1);
      if (!this.g) {
         this.e.g.ae = this.e.g.ah;
         this.e.g.af = this.e.g.ai;
         this.e.g.ag = this.e.g.aj;
         this.g = true;
         this.e.a((Class0032)null);
      }
   }

   @Override
   public void a(Class0261 var1) {
      this.f.a(var1.a, var1.b, var1.c);
   }

   @Override
   public void a(Class0339 var1) {
      Class0154 var2 = this.f.b(var1.a, var1.b);
      int var3 = var1.a * 16;
      int var4 = var1.b * 16;

      for (int var5 = 0; var5 < var1.f; var5++) {
         short var6 = var1.c[var5];
         int var7 = var1.d[var5] & 255;
         byte var8 = var1.e[var5];
         int var9 = var6 >> 12 & 15;
         int var10 = var6 >> 8 & 15;
         int var11 = var6 & 255;
         var2.a(var9, var11, var10, var7, var8);
         this.f.c(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
         this.f.b(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
      }
   }

   @Override
   public void a(Class0050 var1) {
      this.f.c(var1.a, var1.b, var1.c, var1.a + var1.d - 1, var1.b + var1.e - 1, var1.c + var1.f - 1);
      this.f.a(var1.a, var1.b, var1.c, var1.d, var1.e, var1.f, var1.g);
   }

   @Override
   public void a(Class0295 var1) {
      this.f.c(var1.a, var1.b, var1.c, var1.d, var1.e);
   }

   @Override
   public void a(Class0372 var1) {
      this.d.a("Got kicked");
      this.c = true;
      this.e.a((Class0065)null);
      this.e.a(new Class0061("Disconnected by server", var1.a));
   }

   @Override
   public void a(String var1) {
      if (!this.c) {
         this.c = true;
         this.e.a((Class0065)null);
         this.e.a(new Class0061("Connection lost", var1));
      }
   }

   public void a(Class0140 var1) {
      if (!this.c) {
         this.d.a(var1);
      }
   }

   @Override
   public void a(Class0037 var1) {
      Class0100 var2 = (Class0100)this.f.b(var1.a);
      Class0158 var3 = (Class0158)this.f.b(var1.b);
      if (var3 == null) {
         var3 = this.e.g;
      }

      if (var2 != null) {
         this.f.a(var2, "random.pop", 0.2F, ((this.b.nextFloat() - this.b.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         this.e.h.a(new Class0056(this.e.e, var2, var3, -0.5F));
         this.f.c(var1.a);
      }
   }

   @Override
   public void a(Class0102 var1) {
      Class0268 var2 = this.f.b(var1.a);
      if (var2 != null) {
         Class0089 var3 = (Class0089)var2;
         int var4 = var1.b;
         if (var4 == 0) {
            var3.b.a[var3.b.d] = null;
         } else {
            var3.b.a[var3.b.d] = new Class0124(var4);
         }
      }
   }

   @Override
   public void a(Class0216 var1) {
      this.e.u.a(var1.a);
   }

   @Override
   public void a(Class0185 var1) {
      Class0268 var2 = this.f.b(var1.a);
      if (var2 != null) {
         Class0089 var3 = (Class0089)var2;
         var3.u();
      }
   }

   @Override
   public void a(Class0290 var1) {
      this.e.g.b.a(new Class0124(var1.a, var1.b, var1.c));
   }

   @Override
   public void a(Class0174 var1) {
      if (var1.a.equals("-")) {
         this.a((Class0140)(new Class0196(this.e.i.b, "Password", 14)));
      } else {
         try {
            URL var2 = new URL("http://www.minecraft.net/game/joinserver.jsp?user=" + this.e.i.b + "&sessionId=" + this.e.i.c + "&serverId=" + var1.a);
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
            String var4 = var3.readLine();
            var3.close();
            if (var4.equalsIgnoreCase("ok")) {
               this.a((Class0140)(new Class0196(this.e.i.b, "Password", 14)));
            } else {
               this.d.a("Failed to login: " + var4);
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            this.d.a("Internal client error: " + var5.toString());
         }
      }
   }

   public void b() {
      this.c = true;
      this.d.a("Closed");
   }
}
